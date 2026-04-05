package com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p000if.jd.wqx;
import com.bytedance.sdk.openadsdk.core.p000if.jpo;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    public static jpo jpo(Context context, XmlPullParser xmlPullParser, List<wqx> list, int i10, double d10) throws XmlPullParserException, IOException {
        String name;
        xmlPullParser.require(2, my.f20412qk, "InLine");
        jpo jpoVar = new jpo();
        while (true) {
            if (xmlPullParser.next() == 3 && "InLine".equals(xmlPullParser.getName())) {
                jpoVar.jpo().yd(list);
                return jpoVar;
            }
            if (xmlPullParser.getEventType() == 2) {
                name = xmlPullParser.getName();
                name.getClass();
                switch (name) {
                    case "AdVerifications":
                        jpoVar.jpo(cm.jpo(xmlPullParser));
                        context = context;
                        break;
                    case "Creatives":
                        if (TextUtils.isEmpty(jpoVar.qk()) || jpoVar.wqx() == null) {
                            while (xmlPullParser.next() != 3) {
                                if (xmlPullParser.getEventType() == 2) {
                                    if ("Creative".equals(xmlPullParser.getName())) {
                                        jpo(context, xmlPullParser, jpoVar, i10, d10);
                                    } else {
                                        my.jpo(xmlPullParser);
                                    }
                                }
                            }
                        } else {
                            my.jpo(xmlPullParser);
                        }
                        context = context;
                        xmlPullParser = xmlPullParser;
                        i10 = i10;
                        d10 = d10;
                        break;
                    case "Description":
                        jpoVar.jd(my.jd(xmlPullParser, name));
                        break;
                    case "Error":
                        list.addAll(my.jpo(xmlPullParser, name));
                        break;
                    case "Extensions":
                        while (true) {
                            if (xmlPullParser.getEventType() == 3 && "Extensions".equals(xmlPullParser.getName())) {
                                context = context;
                                xmlPullParser = xmlPullParser;
                                i10 = i10;
                                d10 = d10;
                                break;
                            } else {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                    jpoVar.jpo(cm.jpo(xmlPullParser));
                                }
                            }
                        }
                        break;
                    case "AdTitle":
                        jpoVar.jpo(my.jd(xmlPullParser, name));
                        break;
                    case "Impression":
                        jpoVar.jpo().jpo(my.jpo(xmlPullParser, name));
                        break;
                    default:
                        my.jpo(xmlPullParser);
                        context = context;
                        xmlPullParser = xmlPullParser;
                        i10 = i10;
                        d10 = d10;
                        break;
                }
            }
        }
    }

    public static void jpo(Context context, XmlPullParser xmlPullParser, jpo jpoVar, int i10, double d10) throws XmlPullParserException, IOException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && TextUtils.isEmpty(jpoVar.qk())) {
                    wqx.jpo(xmlPullParser, jpoVar, i10, d10);
                } else if ("CompanionAds".equals(xmlPullParser.getName()) && jpoVar.wqx() == null) {
                    jpoVar.jpo(jpo.jpo(context, xmlPullParser));
                } else {
                    my.jpo(xmlPullParser);
                }
            }
        }
    }
}
