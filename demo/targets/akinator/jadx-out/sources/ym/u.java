package ym;

import android.graphics.Color;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sfbx.appconsent.core.BuildConfig;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import j1.o2;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import um.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class u implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public String f94690b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f94691c;

    public u() {
    }

    public static void c(XmlPullParser xmlPullParser, um.p pVar) throws XmlPullParserException, IOException {
        for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (!TextUtils.isEmpty(attributeValue)) {
                try {
                    if ("stroke".equals(attributeName)) {
                        pVar.setStrokeColor(f(attributeValue));
                    } else if ("fill".equals(attributeName)) {
                        pVar.setFillColor(f(attributeValue));
                    } else if ("outlined".equals(attributeName)) {
                        pVar.setOutlined(Boolean.valueOf(l(attributeValue)));
                    } else if ("visible".equals(attributeName)) {
                        pVar.setVisible(Boolean.valueOf(l(attributeValue)));
                    } else if ("x".equals(attributeName)) {
                        pVar.setHorizontalPosition(j(attributeValue));
                    } else if ("y".equals(attributeName)) {
                        pVar.setVerticalPosition(k(attributeValue));
                    } else if (TtmlNode.TAG_STYLE.equals(attributeName)) {
                        pVar.setStyle(attributeValue);
                    } else if ("opacity".equals(attributeName)) {
                        pVar.setOpacity(Float.valueOf(Float.parseFloat(attributeValue)));
                    } else if ("hideafter".equals(attributeName)) {
                        pVar.setHideAfter(Float.valueOf(Float.parseFloat(attributeValue)));
                    } else if ("padding".equals(attributeName)) {
                        pVar.setPadding(attributeValue);
                    } else if (KGUkpTlXZlJLy.wkrFaV.equals(attributeName)) {
                        pVar.setMargin(attributeValue);
                    } else if ("strokewidth".equals(attributeName)) {
                        pVar.setStrokeWidth(h0.convertCssSizeToPx(attributeValue));
                    } else if ("width".equals(attributeName)) {
                        pVar.setWidth(h0.convertCssSizeToPx(attributeValue));
                    } else if ("height".equals(attributeName)) {
                        pVar.setHeight(h0.convertCssSizeToPx(attributeValue));
                    } else if ("fontstyle".equals(attributeName)) {
                        pVar.setFontStyle(Integer.valueOf(Integer.parseInt(attributeValue)));
                    } else if ("fontsize".equals(attributeName)) {
                        pVar.setFontSize(h0.convertCssSizeToPx(attributeValue));
                    }
                } catch (Throwable th2) {
                    io.bidmachine.iab.vast.e.e("VastXmlTag", th2);
                }
            }
        }
        try {
            pVar.setContent(g(xmlPullParser));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            xmlPullParser.require(3, null, xmlPullParser.getName());
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }

    public static boolean d(String str, String str2) {
        return str != null && str.equalsIgnoreCase(str2);
    }

    public static Integer f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception e10) {
            io.bidmachine.iab.vast.e.e("VastXmlTag", e10.getMessage(), new Object[0]);
            return null;
        }
    }

    public static String g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.next() != 4) {
            return null;
        }
        String text = xmlPullParser.getText();
        if (!TextUtils.isEmpty(text)) {
            text = text.trim();
        }
        xmlPullParser.nextTag();
        return text;
    }

    public static void h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static int i(String str) throws NumberFormatException {
        if (str == null) {
            return -1;
        }
        int iIndexOf = str.indexOf(".");
        if (iIndexOf > 0) {
            str = str.substring(0, iIndexOf);
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length <= 2) {
            return -1;
        }
        try {
            int i10 = Integer.parseInt(strArrSplit[0]);
            return o2.B(Integer.parseInt(strArrSplit[1]), 60, i10 * BuildConfig.VERSION_CODE, Integer.parseInt(strArrSplit[2]));
        } catch (Exception e10) {
            io.bidmachine.iab.vast.e.e("VastXmlTag", e10);
            return -1;
        }
    }

    public static Integer j(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "center":
                return 1;
            case "left":
                return 3;
            case "right":
                return 5;
            default:
                return null;
        }
    }

    public static Integer k(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "bottom":
                return 80;
            case "center":
                return 16;
            case "top":
                return 48;
            default:
                return null;
        }
    }

    public static boolean l(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("true") || str.equalsIgnoreCase("1");
        }
        return false;
    }

    public final String a(String str) {
        HashMap map = this.f94691c;
        if (map != null) {
            return (String) map.get(str);
        }
        return null;
    }

    public void b(XmlPullParser xmlPullParser) {
    }

    public final int e(String str) {
        String strA = a(str);
        if (TextUtils.isEmpty(strA)) {
            io.bidmachine.iab.vast.e.d("VastXmlTag", "Error parse attribute value - %s, by name - %s", strA, str);
            return -1;
        }
        try {
            return Integer.parseInt(strA);
        } catch (Exception unused) {
            io.bidmachine.iab.vast.e.e("VastXmlTag", "Error parse attribute value - %s, by name - %s", strA, str);
            return -1;
        }
    }

    public final boolean getBooleanAttributeValueByName(String str, boolean z10) {
        String strA = a(str);
        if (l(strA)) {
            return true;
        }
        if (strA == null || !(strA.equalsIgnoreCase("false") || strA.equalsIgnoreCase("0"))) {
            return z10;
        }
        return false;
    }

    public String[] getSupportedAttributes() {
        return new String[0];
    }

    public final String getText() {
        return this.f94690b;
    }

    public boolean isTextSupported() {
        return false;
    }

    public boolean isValidTag() {
        return true;
    }

    public void parse(XmlPullParser xmlPullParser) {
        HashMap map;
        if (xmlPullParser.getAttributeCount() > 0) {
            map = new HashMap();
            for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
                String attributeName = xmlPullParser.getAttributeName(i10);
                String[] supportedAttributes = getSupportedAttributes();
                int length = supportedAttributes.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    if (supportedAttributes[i11].equals(attributeName)) {
                        map.put(xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
                        break;
                    }
                    i11++;
                }
            }
        } else {
            map = null;
        }
        this.f94691c = map;
        if (isTextSupported()) {
            setText(g(xmlPullParser));
        }
        b(xmlPullParser);
    }

    public final void setText(String str) {
        this.f94690b = str;
    }

    public u(XmlPullParser xmlPullParser) {
        parse(xmlPullParser);
    }
}
