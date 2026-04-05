package com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.p000if.yd;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {
    public static Set<yd> jpo(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        yd ydVarJpo;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(my.f20412qk, "vendor");
                    String strJd = null;
                    String strJd2 = null;
                    String strJd3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !"Verification".equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(my.f20412qk, NotificationCompat.CATEGORY_EVENT))) {
                                            break;
                                        } else {
                                            strJd3 = my.jd(xmlPullParser, "Tracking");
                                            break;
                                        }
                                    case "JavaScriptResource":
                                        if (!CampaignEx.KEY_OMID.equals(xmlPullParser.getAttributeValue(my.f20412qk, "apiFramework"))) {
                                            break;
                                        } else {
                                            strJd = my.jd(xmlPullParser, "JavaScriptResource");
                                            break;
                                        }
                                    case "VerificationParameters":
                                        strJd2 = my.jd(xmlPullParser, "VerificationParameters");
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(strJd) && (ydVarJpo = yd.jpo(strJd, attributeValue, strJd2, strJd3)) != null) {
                            hashSet.add(ydVarJpo);
                        }
                    }
                } else {
                    my.jpo(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
