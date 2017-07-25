package com.thinkgem.jeesite.weixin.demon;

/**
 * Created by Administrator on 2017/7/25.
 */
import com.thoughtworks.xstream.converters.basic.StringConverter;

public class XStreamCDataConverter extends StringConverter {
    public XStreamCDataConverter() {
    }

    public String toString(Object obj) {
        return "<![CDATA[" + super.toString(obj) + "]]>";
    }
}
