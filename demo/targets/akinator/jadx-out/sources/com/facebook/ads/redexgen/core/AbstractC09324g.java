package com.facebook.ads.redexgen.core;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.facebook.ads.redexgen.X.4g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC09324g {
    public static String[] A00 = {"qfPqVubsqiDC6Vd32xxY81weI46FC8i6", "ifUD3UE6KzNkI7FGHB4BSxXnx5udEg1v", "HApreVkXUmhHvk7HCV6N8bmHn3x6D71x", "KwNQHauJnUfBiEnC2ayFRvrFwy8Kb5WT", "B3seXQDThZm5axyUWAGkIYmR8N5go", "E5OkJ7IfnjnuDV", "RJSotr9XNdK0NrHWRK8cXeAUCHsVK", "bPrL9Bc32BKI4n2EpyGIBLpCsrR14et0"};

    public static String A00(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                String attributeValue = xmlPullParser.getAttributeValue(i10);
                String[] strArr = A00;
                String str2 = strArr[4];
                String str3 = strArr[6];
                int i11 = str2.length();
                int attributeCount2 = str3.length();
                if (i11 != attributeCount2) {
                    throw new RuntimeException();
                }
                A00[3] = "CnKCr3L2gFKHIgDNDJx3U1eLsZv8S9Vf";
                return attributeValue;
            }
        }
        return null;
    }

    public static boolean A01(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean A02(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean A03(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return A01(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean A04(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return A02(xmlPullParser) && xmlPullParser.getName().equals(str);
    }
}
