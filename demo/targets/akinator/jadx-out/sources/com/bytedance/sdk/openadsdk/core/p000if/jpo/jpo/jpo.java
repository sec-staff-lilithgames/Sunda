package com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo.my;
import com.bytedance.sdk.openadsdk.core.p000if.wqx;
import com.bytedance.sdk.openadsdk.core.p000if.wqx.jpo;
import java.io.IOException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static wqx jpo(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        float f10;
        wqx wqxVar;
        my.jpo jpoVar;
        int i10;
        char c10;
        if (context == null) {
            my.jpo(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i11 = displayMetrics.widthPixels;
        int i12 = displayMetrics.heightPixels;
        float f11 = displayMetrics.density;
        int i13 = (int) (i11 / f11);
        int i14 = (int) (i12 / f11);
        float f12 = Float.MIN_VALUE;
        wqx wqxVar2 = null;
        while (true) {
            int i15 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("CompanionAds")) {
                return wqxVar2;
            }
            xmlPullParser.next();
            int i16 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Companion")) {
                String str = my.f20412qk;
                int iJd = my.jd(xmlPullParser.getAttributeValue(str, "width"));
                int iJd2 = my.jd(xmlPullParser.getAttributeValue(str, "height"));
                if (iJd < 300 || iJd2 < 250) {
                    f10 = f12;
                    wqxVar = wqxVar2;
                    my.jpo(xmlPullParser);
                    f12 = f10;
                    wqxVar2 = wqxVar;
                } else {
                    my.jpo jpoVar2 = new my.jpo();
                    while (true) {
                        if (xmlPullParser.getEventType() != i15 || !xmlPullParser.getName().equals("Companion")) {
                            int i17 = iJd2;
                            int i18 = iJd;
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == i16) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                float f13 = f12;
                                wqx wqxVar3 = wqxVar2;
                                char c11 = 65535;
                                switch (name.hashCode()) {
                                    case -375340334:
                                        if (name.equals("IFrameResource")) {
                                            c10 = 0;
                                            c11 = c10;
                                            break;
                                        }
                                        break;
                                    case -348198615:
                                        if (name.equals("CompanionClickThrough")) {
                                            c10 = 1;
                                            c11 = c10;
                                            break;
                                        }
                                        break;
                                    case 611554000:
                                        if (name.equals("TrackingEvents")) {
                                            c11 = 2;
                                            break;
                                        }
                                        break;
                                    case 676623548:
                                        if (name.equals("StaticResource")) {
                                            c11 = 3;
                                            break;
                                        }
                                        break;
                                    case 1877773523:
                                        if (name.equals("CompanionClickTracking")) {
                                            c10 = 4;
                                            c11 = c10;
                                            break;
                                        }
                                        break;
                                    case 1928285401:
                                        if (name.equals("HTMLResource")) {
                                            c10 = 5;
                                            c11 = c10;
                                            break;
                                        }
                                        break;
                                }
                                switch (c11) {
                                    case 0:
                                        my.jpo jpoVar3 = jpoVar2;
                                        i10 = 2;
                                        Point pointJpo = com.bytedance.sdk.openadsdk.core.p000if.wqx.jpo.jpo(context, i18, i17, jpo.jd.HTML_RESOURCE);
                                        int i19 = pointJpo.x;
                                        int i20 = pointJpo.y;
                                        jpo.jd jdVar = jpo.jd.IFRAME_RESOURCE;
                                        jpo.EnumC0118jpo enumC0118jpo = jpo.EnumC0118jpo.jpo;
                                        float fJpo = wqx.jpo(i13, i14, i19, i20, jdVar, enumC0118jpo);
                                        String strJd = my.jd(xmlPullParser, "IFrameResource");
                                        if (!TextUtils.isEmpty(strJd) && fJpo > jpoVar3.f20416qk && fJpo > f13) {
                                            jpoVar3.f20416qk = fJpo;
                                            jpoVar3.jpo(strJd, enumC0118jpo, jdVar);
                                            jpoVar2 = jpoVar3;
                                            i16 = i10;
                                            iJd = i18;
                                            iJd2 = i17;
                                            f12 = f13;
                                            wqxVar2 = wqxVar3;
                                            i15 = 3;
                                            break;
                                        } else {
                                            my.jpo(xmlPullParser, "IFrameResource", 3);
                                            jpoVar2 = jpoVar3;
                                            i15 = 3;
                                            i16 = 2;
                                            iJd = i18;
                                            iJd2 = i17;
                                            f12 = f13;
                                            wqxVar2 = wqxVar3;
                                            break;
                                        }
                                    case 1:
                                        i10 = 2;
                                        jpoVar2.f20413cm = my.jd(xmlPullParser, "CompanionClickThrough");
                                        i16 = i10;
                                        iJd = i18;
                                        iJd2 = i17;
                                        f12 = f13;
                                        wqxVar2 = wqxVar3;
                                        i15 = 3;
                                        break;
                                    case 2:
                                        jpoVar = jpoVar2;
                                        while (true) {
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                iJd = i18;
                                                jpoVar2 = jpoVar;
                                                iJd2 = i17;
                                                f12 = f13;
                                                wqxVar2 = wqxVar3;
                                                i15 = 3;
                                                i16 = 2;
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Tracking")) {
                                                jpoVar.jd(my.jd(xmlPullParser, "Tracking"));
                                            }
                                        }
                                        break;
                                    case 3:
                                        jpoVar = jpoVar2;
                                        jpo.EnumC0118jpo enumC0118jpo2 = jpo.EnumC0118jpo.jpo;
                                        String lowerCase = xmlPullParser.getAttributeValue(my.f20412qk, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.p000if.wqx.jpo.jpo;
                                        jpo.EnumC0118jpo enumC0118jpo3 = set.contains(lowerCase) ? jpo.EnumC0118jpo.IMAGE : jpo.EnumC0118jpo.JAVASCRIPT;
                                        jpo.jd jdVar2 = jpo.jd.STATIC_RESOURCE;
                                        Point pointJpo2 = com.bytedance.sdk.openadsdk.core.p000if.wqx.jpo.jpo(context, i18, i17, jdVar2);
                                        float fJpo2 = wqx.jpo(i13, i14, pointJpo2.x, pointJpo2.y, jdVar2, enumC0118jpo3);
                                        String strJd2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.p000if.wqx.jpo.f20441jd.contains(lowerCase)) ? my.jd(xmlPullParser, "StaticResource") : null;
                                        if (fJpo2 >= jpoVar.f20416qk && fJpo2 > f13 && !TextUtils.isEmpty(strJd2)) {
                                            jpoVar.f20416qk = fJpo2;
                                            jpoVar.jpo(strJd2, enumC0118jpo3, jdVar2);
                                            iJd = i18;
                                            jpoVar2 = jpoVar;
                                            iJd2 = i17;
                                            f12 = f13;
                                            wqxVar2 = wqxVar3;
                                            i15 = 3;
                                            i16 = 2;
                                            break;
                                        } else {
                                            my.jpo(xmlPullParser, "StaticResource", 3);
                                            iJd = i18;
                                            jpoVar2 = jpoVar;
                                            iJd2 = i17;
                                            f12 = f13;
                                            i16 = 2;
                                            i15 = 3;
                                            wqxVar2 = wqxVar3;
                                            break;
                                        }
                                    case 4:
                                        jpoVar2.jpo(my.jd(xmlPullParser, "CompanionClickTracking"));
                                        iJd = i18;
                                        iJd2 = i17;
                                        f12 = f13;
                                        wqxVar2 = wqxVar3;
                                        i15 = 3;
                                        i16 = 2;
                                        break;
                                    case 5:
                                        jpo.jd jdVar3 = jpo.jd.HTML_RESOURCE;
                                        Point pointJpo3 = com.bytedance.sdk.openadsdk.core.p000if.wqx.jpo.jpo(context, i18, i17, jdVar3);
                                        int i21 = pointJpo3.x;
                                        int i22 = pointJpo3.y;
                                        jpo.EnumC0118jpo enumC0118jpo4 = jpo.EnumC0118jpo.jpo;
                                        jpoVar = jpoVar2;
                                        float fJpo3 = wqx.jpo(i13, i14, i21, i22, jdVar3, enumC0118jpo4);
                                        String strJd3 = my.jd(xmlPullParser, "HTMLResource");
                                        if (!TextUtils.isEmpty(strJd3) && fJpo3 > jpoVar.f20416qk && fJpo3 > f13) {
                                            jpoVar.f20416qk = fJpo3;
                                            jpoVar.jpo(strJd3, enumC0118jpo4, jdVar3);
                                            iJd = i18;
                                            jpoVar2 = jpoVar;
                                            iJd2 = i17;
                                            f12 = f13;
                                            wqxVar2 = wqxVar3;
                                            i15 = 3;
                                            i16 = 2;
                                            break;
                                        } else {
                                            my.jpo(xmlPullParser, "HTMLResource", 3);
                                            iJd = i18;
                                            jpoVar2 = jpoVar;
                                            iJd2 = i17;
                                            f12 = f13;
                                            wqxVar2 = wqxVar3;
                                            i16 = 2;
                                            i15 = 3;
                                            break;
                                        }
                                        break;
                                    default:
                                        my.jpo(xmlPullParser);
                                        jpoVar = jpoVar2;
                                        iJd = i18;
                                        jpoVar2 = jpoVar;
                                        iJd2 = i17;
                                        f12 = f13;
                                        wqxVar2 = wqxVar3;
                                        i15 = 3;
                                        i16 = 2;
                                        break;
                                }
                            } else {
                                iJd = i18;
                                iJd2 = i17;
                            }
                        } else if (!TextUtils.isEmpty(jpoVar2.jpo) && jpoVar2.f20416qk >= f12) {
                            wqx wqxVar4 = new wqx(iJd, iJd2, jpoVar2.f20414jd, jpoVar2.wqx, jpoVar2.jpo, jpoVar2.my, jpoVar2.f20415jj, jpoVar2.f20413cm);
                            f12 = jpoVar2.f20416qk;
                            wqxVar2 = wqxVar4;
                        }
                    }
                }
            } else {
                f10 = f12;
                wqxVar = wqxVar2;
                f12 = f10;
                wqxVar2 = wqxVar;
            }
        }
    }
}
