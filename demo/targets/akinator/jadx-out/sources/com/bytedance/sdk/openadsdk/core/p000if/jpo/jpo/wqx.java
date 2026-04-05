package com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p000if.jd;
import com.bytedance.sdk.openadsdk.core.p000if.jd.wqx;
import com.bytedance.sdk.openadsdk.core.p000if.jpo;
import com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo.my;
import com.bytedance.sdk.openadsdk.core.p000if.wqx.cm;
import com.bytedance.sdk.openadsdk.core.p000if.wqx.jpo;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.sfbx.appconsent.core.BuildConfig;
import i2.hQ.aTNDubNmpwAqdU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class wqx {
    public static double jd(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (my.jd(xmlPullParser, "Duration").split(":").length != 3) {
            return 0.0d;
        }
        try {
            return (Integer.parseInt(r2[1].trim()) * 60) + (Integer.parseInt(r2[0].trim()) * BuildConfig.VERSION_CODE) + Float.parseFloat(r2[2].trim());
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void jpo(org.xmlpull.v1.XmlPullParser r8, com.bytedance.sdk.openadsdk.core.p000if.jpo r9, int r10, double r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r8.next()
            r3 = 3
            if (r2 != r3) goto L17
            java.lang.String r2 = r8.getName()
            java.lang.String r4 = "Linear"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L16
            goto L17
        L16:
            return
        L17:
            int r2 = r8.getEventType()
            r4 = 2
            if (r2 != r4) goto L2
            if (r1 == 0) goto L2d
            java.lang.String r2 = r9.qk()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L2d
            com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo.my.jpo(r8)
        L2d:
            java.lang.String r2 = r8.getName()
            r2.getClass()
            int r5 = r2.hashCode()
            r6 = 1
            r7 = -1
            switch(r5) {
                case -2049897434: goto L69;
                case -1927368268: goto L5e;
                case -385055469: goto L53;
                case 70476538: goto L4a;
                case 611554000: goto L3f;
                default: goto L3d;
            }
        L3d:
            r3 = r7
            goto L73
        L3f:
            java.lang.String r3 = "TrackingEvents"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L48
            goto L3d
        L48:
            r3 = 4
            goto L73
        L4a:
            java.lang.String r4 = "Icons"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L73
            goto L3d
        L53:
            java.lang.String r3 = "MediaFiles"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5c
            goto L3d
        L5c:
            r3 = r4
            goto L73
        L5e:
            java.lang.String r3 = "Duration"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L67
            goto L3d
        L67:
            r3 = r6
            goto L73
        L69:
            java.lang.String r3 = "VideoClicks"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L72
            goto L3d
        L72:
            r3 = r0
        L73:
            switch(r3) {
                case 0: goto La2;
                case 1: goto L99;
                case 2: goto L93;
                case 3: goto L82;
                case 4: goto L7a;
                default: goto L76;
            }
        L76:
            com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo.my.jpo(r8)
            goto L2
        L7a:
            com.bytedance.sdk.openadsdk.core.if.cm r2 = r9.jpo()
            jpo(r8, r2)
            goto L2
        L82:
            com.bytedance.sdk.openadsdk.core.if.jd r2 = jpo(r8)
            if (r2 == 0) goto L2
            com.bytedance.sdk.openadsdk.core.if.jd r3 = r9.jd()
            if (r3 != 0) goto L2
            r9.jpo(r2)
            goto L2
        L93:
            jpo(r8, r10, r11, r9)
            r1 = r6
            goto L2
        L99:
            double r2 = jd(r8)
            r9.jpo(r2)
            goto L2
        La2:
            jpo(r8, r9)
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo.wqx.jpo(org.xmlpull.v1.XmlPullParser, com.bytedance.sdk.openadsdk.core.if.jpo, int, double):void");
    }

    private static List<com.bytedance.sdk.openadsdk.core.p000if.jd.wqx> wqx(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return jpo(xmlPullParser, false);
    }

    private static String jpo(XmlPullParser xmlPullParser, int i10, double d10, jpo jpoVar) throws XmlPullParserException, IOException {
        double d11 = Double.NEGATIVE_INFINITY;
        String str = null;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MIN_VALUE;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("MediaFiles")) {
                break;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("MediaFile")) {
                String str2 = my.f20412qk;
                String attributeValue = xmlPullParser.getAttributeValue(str2, "type");
                int iJd = my.jd(xmlPullParser.getAttributeValue(str2, "width"));
                int iJd2 = my.jd(xmlPullParser.getAttributeValue(str2, "height"));
                int iJd3 = my.jd(xmlPullParser.getAttributeValue(str2, "bitrate"));
                String strJd = my.jd(xmlPullParser, "MediaFile");
                if (iJd > 0 && iJd2 > 0 && cm.jpo.contains(attributeValue) && !TextUtils.isEmpty(strJd)) {
                    double dJpo = cm.jpo(i10, d10, iJd, iJd2, iJd3, attributeValue);
                    if (dJpo > d11) {
                        str = strJd;
                        d11 = dJpo;
                        i11 = iJd;
                        i12 = iJd2;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            jpoVar.cm(str);
            jpoVar.jpo(i11);
            jpoVar.jd(i12);
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static jd jpo(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        jd jdVar;
        jd jdVar2;
        int i10;
        int i11;
        int i12;
        jpo.EnumC0118jpo enumC0118jpo;
        jd jdVar3 = null;
        while (true) {
            int i13 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("Icons")) {
                return jdVar3;
            }
            xmlPullParser.next();
            int i14 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Icon")) {
                String str = my.f20412qk;
                int iJd = my.jd(xmlPullParser.getAttributeValue(str, "width"));
                int iJd2 = my.jd(xmlPullParser.getAttributeValue(str, "height"));
                if (iJd > 0 && iJd <= 300 && iJd2 > 0 && iJd2 <= 300) {
                    int iJpo = com.bytedance.sdk.openadsdk.core.p000if.jd.jpo.jpo(xmlPullParser.getAttributeValue(str, "offset"));
                    int iJpo2 = com.bytedance.sdk.openadsdk.core.p000if.jd.jpo.jpo(xmlPullParser.getAttributeValue(str, IronSourceConstants.EVENTS_DURATION));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    my.jpo jpoVar = null;
                    String strJd = null;
                    while (true) {
                        if (xmlPullParser.next() == i13 && xmlPullParser.getName().equals("Icon")) {
                            if (jpoVar != null && (jdVar3 == null || TextUtils.isEmpty(jdVar3.jj()))) {
                                jdVar3 = new jd(iJd, iJd2, iJpo, iJpo2, jpoVar.f20414jd, jpoVar.wqx, jpoVar.jpo, arrayList, arrayList2, strJd);
                                my.jpo(xmlPullParser, "Icons", i13);
                            }
                        } else {
                            ArrayList arrayList3 = arrayList;
                            ArrayList arrayList4 = arrayList2;
                            if (xmlPullParser.getEventType() == i14) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                int iHashCode = name.hashCode();
                                jdVar2 = jdVar3;
                                i10 = iJpo2;
                                String str2 = aTNDubNmpwAqdU.sSvMpji;
                                char c10 = 65535;
                                switch (iHashCode) {
                                    case -1044238411:
                                        if (name.equals(str2)) {
                                            c10 = 0;
                                            break;
                                        }
                                        break;
                                    case -375340334:
                                        if (name.equals("IFrameResource")) {
                                            c10 = 1;
                                            break;
                                        }
                                        break;
                                    case 676623548:
                                        if (name.equals("StaticResource")) {
                                            c10 = 2;
                                            break;
                                        }
                                        break;
                                    case 1030746596:
                                        if (name.equals("IconClicks")) {
                                            c10 = 3;
                                            break;
                                        }
                                        break;
                                    case 1928285401:
                                        if (name.equals("HTMLResource")) {
                                            c10 = 4;
                                            break;
                                        }
                                        break;
                                }
                                switch (c10) {
                                    case 0:
                                        i11 = 3;
                                        i12 = 2;
                                        arrayList4.add(new wqx.jpo(my.jd(xmlPullParser, str2)).jpo());
                                        break;
                                    case 1:
                                        i11 = 3;
                                        i12 = 2;
                                        if (jpoVar == null) {
                                            jpoVar = new my.jpo(my.jd(xmlPullParser, "IFrameResource"), jpo.EnumC0118jpo.jpo, jpo.jd.IFRAME_RESOURCE);
                                            break;
                                        } else {
                                            my.jpo(xmlPullParser);
                                            break;
                                        }
                                    case 2:
                                        i11 = 3;
                                        i12 = 2;
                                        jpo.EnumC0118jpo enumC0118jpo2 = jpo.EnumC0118jpo.jpo;
                                        String lowerCase = xmlPullParser.getAttributeValue(my.f20412qk, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.p000if.wqx.jpo.jpo;
                                        String strJd2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.p000if.wqx.jpo.f20441jd.contains(lowerCase)) ? my.jd(xmlPullParser, "StaticResource") : null;
                                        if (set.contains(lowerCase)) {
                                            enumC0118jpo = jpo.EnumC0118jpo.IMAGE;
                                        } else {
                                            enumC0118jpo = jpo.EnumC0118jpo.JAVASCRIPT;
                                        }
                                        jpoVar = new my.jpo(strJd2, enumC0118jpo, jpo.jd.STATIC_RESOURCE);
                                        break;
                                    case 3:
                                        while (true) {
                                            i11 = 3;
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("IconClicks")) {
                                                i12 = 2;
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("IconClickThrough")) {
                                                    strJd = my.jd(xmlPullParser, "IconClickThrough");
                                                } else if (xmlPullParser.getName().equals("IconClickTracking")) {
                                                    arrayList3.add(new wqx.jpo(my.jd(xmlPullParser, "IconClickTracking")).jpo());
                                                }
                                            }
                                        }
                                        break;
                                    case 4:
                                        if (jpoVar == null || jpoVar.wqx == jpo.jd.IFRAME_RESOURCE) {
                                            jpoVar = new my.jpo(my.jd(xmlPullParser, "HTMLResource"), jpo.EnumC0118jpo.jpo, jpo.jd.HTML_RESOURCE);
                                            jdVar3 = jdVar2;
                                            iJpo2 = i10;
                                            i13 = 3;
                                            i14 = 2;
                                            break;
                                        }
                                        i11 = 3;
                                        i12 = 2;
                                        my.jpo(xmlPullParser);
                                        break;
                                    default:
                                        i11 = 3;
                                        i12 = 2;
                                        my.jpo(xmlPullParser);
                                        break;
                                }
                                arrayList = arrayList3;
                                arrayList2 = arrayList4;
                            } else {
                                jdVar2 = jdVar3;
                                i10 = iJpo2;
                                i11 = i13;
                                i12 = i14;
                            }
                            i13 = i11;
                            i14 = i12;
                            jdVar3 = jdVar2;
                            iJpo2 = i10;
                            arrayList = arrayList3;
                            arrayList2 = arrayList4;
                        }
                    }
                } else {
                    jdVar = jdVar3;
                    my.jpo(xmlPullParser);
                    jdVar3 = jdVar;
                }
            } else {
                jdVar = jdVar3;
                jdVar3 = jdVar;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void jpo(org.xmlpull.v1.XmlPullParser r8, com.bytedance.sdk.openadsdk.core.p000if.cm r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo.wqx.jpo(org.xmlpull.v1.XmlPullParser, com.bytedance.sdk.openadsdk.core.if.cm):void");
    }

    private static void jpo(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.p000if.jpo jpoVar) throws XmlPullParserException, IOException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("VideoClicks")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                if (name.equals("ClickThrough")) {
                    jpoVar.wqx(my.jd(xmlPullParser, "ClickThrough"));
                } else if (!name.equals("ClickTracking")) {
                    my.jpo(xmlPullParser);
                } else {
                    jpoVar.jpo().qk(my.jpo(xmlPullParser, "ClickTracking"));
                }
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.p000if.jd.wqx> jpo(XmlPullParser xmlPullParser, boolean z10) throws XmlPullParserException, IOException {
        return my.jpo(xmlPullParser, "Tracking", z10);
    }
}
