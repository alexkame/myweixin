package com.thinkgem.jeesite.weixin.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;
import org.apache.commons.httpclient.params.HttpMethodParams;

public class weixinUtils {

	private static final String token = "imooc";
	public static boolean checkSignature(String signature,String timestamp,String nonce){
		String[] arr = new String[]{token,timestamp,nonce};
		//排序
		Arrays.sort(arr);
		
		//生成字符串
		StringBuffer content = new StringBuffer();
		for(int i=0;i<arr.length;i++){
			content.append(arr[i]);
		}
		
		//sha1加密
		String temp = getSha1(content.toString());
		
		return temp.equals(signature);
	}
	
	/**
	 * Sha1加密方法
	 * @param str
	 * @return
	 */
	public static String getSha1(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f' };

		try {
			MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
			mdTemp.update(str.getBytes("UTF-8"));

			byte[] md = mdTemp.digest();
			int j = md.length;
			char buf[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
				buf[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(buf);
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * 
	* @Title: sendRequest 
	* @Description: TODO(httpClient 工具类) 
	* @param url
	* @param paras
	* @return    设定文件 
	* @return String    返回类型 
	* @throws 
	 */
	public static String sendRequest(String url, Map<String, String> paras) {
		  try {
		   HttpClient httpClient = new HttpClient();
		   PostMethod httpPost = new PostMethod(url);
		   if (null != paras && paras.size() > 0) {
		    Iterator<String> iterator = paras.keySet().iterator();
		    List<Part> partList = new ArrayList<Part>();
		    while (iterator.hasNext()) {
		     String key = iterator.next();
		     partList.add(new StringPart(key, paras.get(key), "UTF-8"));
		    }
		    Part[] parts = new Part[partList.size()];
		    parts = partList.toArray(parts);
		    httpPost.setRequestEntity(new MultipartRequestEntity(parts, httpPost.getParams()));
		   }
		      int a =  httpClient.executeMethod(httpPost);
		   InputStream inputStream = httpPost.getResponseBodyAsStream();
		   StringBuffer postResult = new StringBuffer();
		   String readLine = null;
		   BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
		   while ((readLine = reader.readLine()) != null) {
		    postResult.append(readLine);
		   }
		   return postResult.toString();
		  } catch (HttpException e) {
		   e.printStackTrace();
		  } catch (UnsupportedEncodingException e) {
		   e.printStackTrace();
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		  return "";
		 }

	/**
	 * 授权认证
	 */
	public static String genOauth2Url(String appid, String redirect_uri, boolean snsapi_userinfo, String state) {
		try {
			StringBuilder e = new StringBuilder();
			e.append("https://open.com.thinkgem.jeesite.weixin.qq.com/connect/oauth2/authorize?")
					.append("appid=").append(appid).append("&redirect_uri=")
					      .append(URLEncoder.encode(redirect_uri, "utf-8"))
					.append("&response_type=code").append("&scope=")
					.append(snsapi_userinfo?"snsapi_userinfo":"snsapi_base")
					.append("&state=").append(state == null ? "" : state);
			e.append("#wechat_redirect");
			return e.toString();
		} catch (UnsupportedEncodingException var5) {
			var5.printStackTrace();
			return null;
		}
	}

	/**
	 * 生成数字签名调用js_sdk
	 * @param jsapi_ticket
	 * @param url
	 * @return
	 */
	public static Map<String, String> sign(String jsapi_ticket, String url) {
		Map<String, String> ret = new HashMap<String, String>();
		String nonce_str = create_nonce_str();
		String timestamp = create_timestamp();
		String string1;
		String signature = "";

		//注意这里参数名必须全部小写，且必须有序
		string1 = "jsapi_ticket=" + jsapi_ticket +
				"&noncestr=" + nonce_str +
				"&timestamp=" + timestamp +
				"&url=" + url;
		System.out.println(string1);

		try
		{
			MessageDigest crypt = MessageDigest.getInstance("SHA-1");
			crypt.reset();
			crypt.update(string1.getBytes("UTF-8"));
			signature = byteToHex(crypt.digest());
		}
		catch (NoSuchAlgorithmException e)
		{
			e.printStackTrace();
		}
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}

		ret.put("url", url);
		ret.put("jsapi_ticket", jsapi_ticket);
		ret.put("nonceStr", nonce_str);
		ret.put("timestamp", timestamp);
		ret.put("signature", signature);

		return ret;
	}

		private static String byteToHex(final byte[] hash) {
			Formatter formatter = new Formatter();
			for (byte b : hash)
			{
				formatter.format("%02x", b);
			}
			String result = formatter.toString();
			formatter.close();
			return result;
		}


        /**
         * 时间戳
         * @return
         */
        public static String create_timestamp() {
            return Long.toString(System.currentTimeMillis() / 1000);
        }
        /**
         * 生成的随机字符串
         * @return
         */
        public static String create_nonce_str() {
            return UUID.randomUUID().toString();
        }

    /**
     * 参数接口调用
     * @param url
     * @param paras
     * @return
     */
	public static String sendRequestParam(String url, Map<String, String> paras) {
		try {
			HttpClient httpClient = new HttpClient();
			PostMethod httpPost = new PostMethod(url);
            httpPost.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET,"utf-8");
            if (null != paras && paras.size() > 0) {
				Iterator<String> iterator = paras.keySet().iterator();
				while (iterator.hasNext()) {
					String key = iterator.next();
                    httpPost.addParameter(key, paras.get(key));
				}
			}
			int a =  httpClient.executeMethod(httpPost);
			InputStream inputStream = httpPost.getResponseBodyAsStream();
			StringBuffer postResult = new StringBuffer();
			String readLine = null;
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
			while ((readLine = reader.readLine()) != null) {
				postResult.append(readLine);
			}
			return postResult.toString();
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
}
