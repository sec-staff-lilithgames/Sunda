package com.inmobi.media;

import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.Constants;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.of, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2927of {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f33226f = uu.p1.hashMapOf(tu.e0.to("Error", "error"), tu.e0.to("Impression", "Impression"), tu.e0.to("ClickTracking", "click"), tu.e0.to("creativeView", "creativeView"), tu.e0.to("start", "start"), tu.e0.to("firstQuartile", "firstQuartile"), tu.e0.to(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT), tu.e0.to("thirdQuartile", "thirdQuartile"), tu.e0.to(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE), tu.e0.to(CampaignEx.JSON_NATIVE_VIDEO_MUTE, CampaignEx.JSON_NATIVE_VIDEO_MUTE), tu.e0.to(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, CampaignEx.JSON_NATIVE_VIDEO_UNMUTE), tu.e0.to(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, CampaignEx.JSON_NATIVE_VIDEO_PAUSE), tu.e0.to(CampaignEx.JSON_NATIVE_VIDEO_RESUME, CampaignEx.JSON_NATIVE_VIDEO_RESUME), tu.e0.to(Constants.TEMPLATE_TYPE_FULLSCREEN, Constants.TEMPLATE_TYPE_FULLSCREEN), tu.e0.to("exitFullscreen", "exitFullscreen"), tu.e0.to("closeEndCard", "closeEndCard"));

    /* renamed from: a, reason: collision with root package name */
    public final AdConfig.VastVideoConfig f33227a;

    /* renamed from: b, reason: collision with root package name */
    public final F5 f33228b;

    /* renamed from: c, reason: collision with root package name */
    public final C3011tf f33229c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f33230d;

    /* renamed from: e, reason: collision with root package name */
    public int f33231e;

    public C2927of(AdConfig.VastVideoConfig mVastVideoConfig, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mVastVideoConfig, "mVastVideoConfig");
        this.f33227a = mVastVideoConfig;
        this.f33228b = f52;
        this.f33229c = new C3011tf(uu.p0.emptyList(), mVastVideoConfig);
    }

    public static boolean b(int i10) {
        return i10 == 3;
    }

    public final C3011tf a(String str) throws XmlPullParserException {
        F5 f52 = this.f33228b;
        if (f52 != null) {
            ((G5) f52).c("of", O6.a("of", "TAG", "vastXML = ", str));
        }
        try {
        } catch (XmlPullParserException e10) {
            c(100);
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(e10);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
        } catch (Exception e11) {
            c(900);
            Y5 y53 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e11, NotificationCompat.CATEGORY_EVENT));
        }
        if (TextUtils.isEmpty(str)) {
            c(303);
            return this.f33229c;
        }
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        String[] strArr = {"Wrapper", "InLine"};
        kotlin.jvm.internal.e0.checkNotNull(xmlPullParserNewPullParser);
        a(xmlPullParserNewPullParser, "VAST");
        if (kotlin.jvm.internal.e0.areEqual("VAST", xmlPullParserNewPullParser.getName())) {
            a(xmlPullParserNewPullParser, "Ad");
            if (kotlin.jvm.internal.e0.areEqual("Ad", xmlPullParserNewPullParser.getName())) {
                a(xmlPullParserNewPullParser, strArr);
                if (kotlin.jvm.internal.e0.areEqual("InLine", xmlPullParserNewPullParser.getName())) {
                    c(xmlPullParserNewPullParser);
                } else if (kotlin.jvm.internal.e0.areEqual("Wrapper", xmlPullParserNewPullParser.getName())) {
                    f(xmlPullParserNewPullParser);
                } else {
                    F5 f53 = this.f33228b;
                    if (f53 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("of", "TAG");
                        ((G5) f53).b("of", "VAST Schema validation error: InLine node or Wrapper node at appropriate hierarchy not found");
                    }
                    c(101);
                }
            } else {
                F5 f54 = this.f33228b;
                if (f54 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("of", "TAG");
                    ((G5) f54).b("of", "VAST Schema validation error: Ad node at appropriate hierarchy not found");
                }
                c(303);
            }
        } else {
            F5 f55 = this.f33228b;
            if (f55 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("of", "TAG");
                ((G5) f55).b("of", "VAST Schema validation error: VAST node at appropriate hierarchy not found");
            }
            c(101);
        }
        return this.f33229c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x08ef, code lost:
    
        r3 = r31.f33228b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x08f1, code lost:
    
        if (r3 == null) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x08f3, code lost:
    
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("of", "TAG");
        ((com.inmobi.media.G5) r3).b("of", "VAST Schema Validation Error. " + r2 + " Media Duration invalid.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x090e, code lost:
    
        r2 = 101;
        c(101);
        r15 = 0;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0864  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(org.xmlpull.v1.XmlPullParser r32) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2927of.c(org.xmlpull.v1.XmlPullParser):void");
    }

    public final int d(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (IOException unused) {
            F5 f52 = this.f33228b;
            if (f52 == null) {
                return -1;
            }
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("of", "TAG");
            ((G5) f52).b("of", "Parsing failed.");
            return -1;
        } catch (XmlPullParserException unused2) {
            F5 f53 = this.f33228b;
            if (f53 == null) {
                return -1;
            }
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("of", "TAG");
            ((G5) f53).b("of", "VAST Schema validation error: VAST node at appropriate hierarchy not found.");
            return -1;
        }
    }

    public final void e(XmlPullParser xmlPullParser) {
        int iD = d(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() != null && kotlin.jvm.internal.e0.areEqual(xmlPullParser.getName(), "TrackingEvents") && b(iD)) {
                return;
            }
            if (xmlPullParser.getName() != null && kotlin.jvm.internal.e0.areEqual("Tracking", xmlPullParser.getName()) && !b(iD)) {
                int attributeCount = xmlPullParser.getAttributeCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= attributeCount) {
                        break;
                    }
                    if (kotlin.jvm.internal.e0.areEqual(xmlPullParser.getAttributeName(i10), NotificationCompat.CATEGORY_EVENT)) {
                        String attributeValue = xmlPullParser.getAttributeValue(i10);
                        if (d(xmlPullParser) == 4) {
                            HashMap map = f33226f;
                            if (map.containsKey(attributeValue)) {
                                Object obj = map.get(attributeValue);
                                kotlin.jvm.internal.e0.checkNotNull(obj);
                                String text = xmlPullParser.getText();
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue(text, "getText(...)");
                                a((String) obj, text);
                            }
                        }
                    } else {
                        i10++;
                    }
                }
            }
            iD = d(xmlPullParser);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x01b3, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(org.xmlpull.v1.XmlPullParser r13) throws org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2927of.f(org.xmlpull.v1.XmlPullParser):void");
    }

    public final void b(XmlPullParser xmlPullParser) {
        int iD = d(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() != null && kotlin.jvm.internal.e0.areEqual(xmlPullParser.getName(), "Extensions") && b(iD)) {
                return;
            }
            if (xmlPullParser.getName() != null && !b(iD)) {
                String name = xmlPullParser.getName();
                if (kotlin.jvm.internal.e0.areEqual(name, "CompanionAdTracking")) {
                    int iD2 = d(xmlPullParser);
                    while (true) {
                        if (xmlPullParser.getName() == null || !kotlin.jvm.internal.e0.areEqual(xmlPullParser.getName(), "CompanionAdTracking") || !b(iD2)) {
                            if (xmlPullParser.getName() != null && !b(iD2) && kotlin.jvm.internal.e0.areEqual("TrackingEvents", xmlPullParser.getName())) {
                                e(xmlPullParser);
                            }
                            iD2 = d(xmlPullParser);
                        }
                    }
                } else if (kotlin.jvm.internal.e0.areEqual(name, "Extension") && kotlin.jvm.internal.e0.areEqual(xmlPullParser.getAttributeValue(null, "type"), "AdVerifications")) {
                    a(xmlPullParser);
                }
            }
            iD = d(xmlPullParser);
        }
    }

    public final void a(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        F5 f52 = this.f33228b;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("of", "TAG");
            ((G5) f52).c("of", "name=".concat(str));
        }
        int next = 0;
        while (true) {
            try {
                next = xmlPullParser.next();
            } catch (IOException e10) {
                F5 f53 = this.f33228b;
                if (f53 != null) {
                    StringBuilder sbA = N6.a("of", "TAG", "Parsing failed. ");
                    sbA.append(Arrays.toString(e10.getStackTrace()));
                    ((G5) f53).b("of", sbA.toString());
                }
            } catch (XmlPullParserException e11) {
                F5 f54 = this.f33228b;
                if (f54 != null) {
                    StringBuilder sbA2 = N6.a("of", "TAG", "VAST Schema validation error: VAST node at appropriate hierarchy not found. ");
                    sbA2.append(Arrays.toString(e11.getStackTrace()));
                    ((G5) f54).b("of", sbA2.toString());
                }
            }
            if (next == 1) {
                return;
            }
            if (xmlPullParser.getName() != null && kotlin.jvm.internal.e0.areEqual(xmlPullParser.getName(), str)) {
                return;
            }
        }
    }

    public final void a(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        int next = 0;
        boolean z10 = false;
        do {
            try {
                next = xmlPullParser.next();
            } catch (IOException unused) {
                F5 f52 = this.f33228b;
                if (f52 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("of", "TAG");
                    ((G5) f52).b("of", "Parsing failed.");
                }
            } catch (XmlPullParserException unused2) {
                F5 f53 = this.f33228b;
                if (f53 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("of", "TAG");
                    ((G5) f53).b("of", "VAST Schema validation error: VAST node at appropriate hierarchy not found.");
                }
            }
            if (next == 1) {
                return;
            }
            if (xmlPullParser.getName() != null) {
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    if (kotlin.jvm.internal.e0.areEqual(xmlPullParser.getName(), strArr[i10])) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
            }
        } while (!z10);
    }

    public final void a(XmlPullParser xmlPullParser, boolean z10) {
        String strA;
        int iD = d(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() != null && kotlin.jvm.internal.e0.areEqual(xmlPullParser.getName(), "VideoClicks") && b(iD)) {
                return;
            }
            if (xmlPullParser.getName() != null && !b(iD)) {
                String name = xmlPullParser.getName();
                if (kotlin.jvm.internal.e0.areEqual(name, "ClickThrough")) {
                    if (!z10) {
                        return;
                    }
                    if (d(xmlPullParser) == 4) {
                        String text = xmlPullParser.getText();
                        if (text == null || text.length() == 0) {
                            strA = null;
                        } else {
                            kotlin.jvm.internal.e0.checkNotNull(text);
                            int length = text.length() - 1;
                            int i10 = 0;
                            boolean z11 = false;
                            while (i10 <= length) {
                                boolean z12 = kotlin.jvm.internal.e0.compare((int) text.charAt(!z11 ? i10 : length), 32) <= 0;
                                if (z11) {
                                    if (!z12) {
                                        break;
                                    } else {
                                        length--;
                                    }
                                } else if (z12) {
                                    i10++;
                                } else {
                                    z11 = true;
                                }
                            }
                            strA = S7.a(length, 1, text, i10);
                        }
                        this.f33229c.f33415k = strA;
                    }
                } else if (kotlin.jvm.internal.e0.areEqual(name, "ClickTracking") && d(xmlPullParser) == 4) {
                    String text2 = xmlPullParser.getText();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(text2, "getText(...)");
                    a("click", text2);
                }
            }
            iD = d(xmlPullParser);
        }
    }

    public final void a(XmlPullParser vastParser) {
        String vendor;
        int iD;
        int iD2 = d(vastParser);
        while (true) {
            if (vastParser.getName() != null && kotlin.jvm.internal.e0.areEqual(vastParser.getName(), "AdVerifications") && b(iD2)) {
                return;
            }
            if (vastParser.getName() != null && !b(iD2) && kotlin.jvm.internal.e0.areEqual(vastParser.getName(), "Verification") && (vendor = vastParser.getAttributeValue(null, "vendor")) != null) {
                kotlin.jvm.internal.e0.checkNotNullParameter(vastParser, "vastParser");
                kotlin.jvm.internal.e0.checkNotNullParameter(vendor, "vendor");
                int iD3 = d(vastParser);
                String strA = null;
                String string = null;
                while (true) {
                    if (vastParser.getName() != null && kotlin.jvm.internal.e0.areEqual(vastParser.getName(), "Verification") && b(iD3)) {
                        break;
                    }
                    if (vastParser.getName() != null && !b(iD3)) {
                        String name = vastParser.getName();
                        if (kotlin.jvm.internal.e0.areEqual(name, "JavaScriptResource")) {
                            String attributeValue = vastParser.getAttributeValue(null, "apiFramework");
                            if (attributeValue != null && sv.k0.startsWith$default(attributeValue, CampaignEx.KEY_OMID, false, 2, null) && d(vastParser) == 4) {
                                String text = vastParser.getText();
                                if (text == null || text.length() == 0) {
                                    strA = null;
                                } else {
                                    int length = text.length() - 1;
                                    int i10 = 0;
                                    boolean z10 = false;
                                    while (i10 <= length) {
                                        boolean z11 = kotlin.jvm.internal.e0.compare((int) text.charAt(!z10 ? i10 : length), 32) <= 0;
                                        if (z10) {
                                            if (!z11) {
                                                break;
                                            } else {
                                                length--;
                                            }
                                        } else if (z11) {
                                            i10++;
                                        } else {
                                            z10 = true;
                                        }
                                    }
                                    strA = S7.a(length, 1, text, i10);
                                }
                            }
                        } else if (kotlin.jvm.internal.e0.areEqual(name, "VerificationParameters") && ((iD = d(vastParser)) == 4 || iD == 5)) {
                            String text2 = vastParser.getText();
                            if (text2 == null || text2.length() == 0) {
                                string = null;
                            } else {
                                String text3 = vastParser.getText();
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue(text3, "getText(...)");
                                string = sv.n0.trim(text3).toString();
                            }
                        }
                    }
                    iD3 = d(vastParser);
                }
                if (URLUtil.isValidUrl(strA)) {
                    kotlin.jvm.internal.e0.checkNotNull(strA);
                    C2972ra tracker = new C2972ra(vendor, string, strA, null);
                    C3011tf c3011tf = this.f33229c;
                    c3011tf.getClass();
                    kotlin.jvm.internal.e0.checkNotNullParameter(tracker, "tracker");
                    c3011tf.f33412h.add(tracker);
                    F5 f52 = this.f33228b;
                    if (f52 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("of", "TAG");
                        ((G5) f52).b("of", "Omid JavaScript URL found inside VAST : ".concat(strA));
                    }
                }
            }
            iD2 = d(vastParser);
        }
    }

    public final void a(int i10) {
        HashMap map = new HashMap();
        map.put("[ERRORCODE]", String.valueOf(i10));
        Iterator it = this.f33229c.f33412h.iterator();
        while (it.hasNext()) {
            C2752e9 c2752e9 = (C2752e9) it.next();
            if (kotlin.jvm.internal.e0.areEqual("error", c2752e9.f32815b)) {
                C3100z2.f33672a.a(C2736da.a(c2752e9.f32817d, map), c2752e9.f32816c, true, null, EnumC2737db.f32783c, this.f33228b);
            }
        }
    }

    public final void a(String str, String str2) {
        String strA;
        if (str2.length() == 0) {
            strA = null;
        } else {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = kotlin.jvm.internal.e0.compare((int) str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            strA = S7.a(length, 1, str2, i10);
        }
        if (!URLUtil.isValidUrl(strA)) {
            F5 f52 = this.f33228b;
            if (f52 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("of", "TAG");
                ((G5) f52).b("of", "Malformed URL " + strA + " Discarding this tracker");
            }
            kotlin.jvm.internal.e0.areEqual(str, "Impression");
            return;
        }
        kotlin.jvm.internal.e0.checkNotNull(strA);
        C2752e9 tracker = new C2752e9(strA, 0, str, null);
        C3011tf c3011tf = this.f33229c;
        c3011tf.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(tracker, "tracker");
        c3011tf.f33412h.add(tracker);
    }

    public final void c(int i10) {
        this.f33229c.f33416l = i10;
        a(i10);
    }
}
