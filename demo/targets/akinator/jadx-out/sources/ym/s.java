package ym;

import android.text.TextUtils;
import android.util.Xml;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class s {
    public static t parseVast(String str) throws Exception {
        ByteArrayInputStream byteArrayInputStream;
        if (TextUtils.isEmpty(str)) {
            throw new Exception();
        }
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(str.getBytes(Charset.defaultCharset().name()));
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayInputStream = byteArrayInputStream2;
        }
        try {
            t vast = parseVast(byteArrayInputStream);
            try {
                byteArrayInputStream.close();
                return vast;
            } catch (Exception e11) {
                io.bidmachine.iab.vast.e.e("VastXmlParser", e11);
                return vast;
            }
        } catch (Exception e12) {
            e = e12;
            byteArrayInputStream2 = byteArrayInputStream;
            io.bidmachine.iab.vast.e.e("VastXmlParser", e);
            throw new Exception();
        } catch (Throwable th3) {
            th = th3;
            if (byteArrayInputStream != null) {
                try {
                    byteArrayInputStream.close();
                } catch (Exception e13) {
                    io.bidmachine.iab.vast.e.e("VastXmlParser", e13);
                }
            }
            throw th;
        }
    }

    public static t parseVast(InputStream inputStream) throws Exception {
        if (inputStream != null) {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParserNewPullParser.setInput(inputStream, null);
            int next = xmlPullParserNewPullParser.next();
            if (next == 1) {
                throw new Exception();
            }
            while (next != 3 && next != 1) {
                if (xmlPullParserNewPullParser.getEventType() != 2) {
                    next = xmlPullParserNewPullParser.next();
                } else {
                    if (u.d(xmlPullParserNewPullParser.getName(), "VAST")) {
                        return new t(xmlPullParserNewPullParser);
                    }
                    next = xmlPullParserNewPullParser.next();
                }
            }
            return null;
        }
        throw new Exception();
    }
}
