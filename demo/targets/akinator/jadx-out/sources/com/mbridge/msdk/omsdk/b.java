package com.mbridge.msdk.omsdk;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import b0.e2;
import com.iab.omid.library.mmadbridge.Omid;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.AdSessionConfiguration;
import com.iab.omid.library.mmadbridge.adsession.AdSessionContext;
import com.iab.omid.library.mmadbridge.adsession.CreativeType;
import com.iab.omid.library.mmadbridge.adsession.ImpressionType;
import com.iab.omid.library.mmadbridge.adsession.Owner;
import com.iab.omid.library.mmadbridge.adsession.Partner;
import com.iab.omid.library.mmadbridge.adsession.VerificationScriptResource;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.n0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f42151a = DomainNameUtils.VERIFICATION_URL;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends com.mbridge.msdk.foundation.same.net.handler.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f42152b;

        public a(Context context) {
            this.f42152b = context;
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void a(String str) {
            p0.a("OMSDK", "fetch OMJSContent failed, errorCode = " + str);
            new h(this.f42152b).a("", "", "", "", "fetch OM failed, request failed");
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void b(String str) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = str;
            b.b(str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.omsdk.b$b, reason: collision with other inner class name */
    public class RunnableC0301b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42153a;

        public RunnableC0301b(String str) {
            this.f42153a = str;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                File file = new File(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_OTHER), "/omsdk/om_js_content.txt");
                if (file.exists()) {
                    file.delete();
                }
                n0.a(this.f42153a.getBytes(), file);
            } catch (Exception e10) {
                p0.a("OMSDK", e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends com.mbridge.msdk.foundation.same.net.handler.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f42154b;

        public c(Context context) {
            this.f42154b = context;
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void a(String str) {
            p0.a("OMSDK", "fetch OMJSH5Content failed, errorCode = " + str);
            new h(this.f42154b).a("", "", "", "", "fetch OM H5 failed, request failed");
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void b(String str) {
            MBridgeConstans.OMID_JS_H5_CONTENT = str;
            b.c(str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42155a;

        public d(String str) {
            this.f42155a = str;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                File file = new File(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_OTHER), "/omsdk/om_js_h5_content.txt");
                if (file.exists()) {
                    file.delete();
                }
                n0.a(this.f42155a.getBytes(), file);
            } catch (Exception e10) {
                p0.a("OMSDK", e10.getMessage());
            }
        }
    }

    public static AdSession a(Context context, boolean z10, String str, String str2, String str3, String str4, String str5, String str6) {
        Context context2;
        String str7;
        Partner partnerCreatePartner;
        AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration;
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = a();
        }
        AdSession adSessionCreateAdSession = null;
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT) || TextUtils.isEmpty(str)) {
            p0.a("OMSDK", "createNativeAdSession: TextUtils.isEmpty(omid) = " + TextUtils.isEmpty(str) + " TextUtils.isEmpty(MIntegralConstans.OMID_JS_SERVICE_CONTENT) = " + TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT));
            new h(context).a(str2, str6, str3, str4, "failed, OMID_JS_SERVICE_CONTENT null or omid null");
            return null;
        }
        try {
            try {
                a(context);
                try {
                    partnerCreatePartner = Partner.createPartner("Mintegral", MBConfiguration.SDK_VERSION);
                    CreativeType creativeType = z10 ? CreativeType.NATIVE_DISPLAY : CreativeType.VIDEO;
                    ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
                    Owner owner = Owner.NATIVE;
                    adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, z10 ? Owner.NONE : owner, false);
                    context2 = context;
                    try {
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                    } catch (Exception e11) {
                        e = e11;
                        str7 = str2;
                    }
                } catch (IllegalArgumentException e12) {
                    e = e12;
                    context2 = context;
                }
            } catch (IllegalArgumentException e13) {
                e = e13;
                context2 = context;
            }
        } catch (Exception e14) {
            e = e14;
            context2 = context;
        }
        try {
            str7 = str2;
        } catch (IllegalArgumentException e15) {
            e = e15;
            p0.b("OMSDK", e.getMessage());
            new h(context2).a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
            return adSessionCreateAdSession;
        } catch (Exception e16) {
            e = e16;
            str7 = str2;
            p0.b("OMSDK", e.getMessage());
            new h(context2).a(str7, str6, str3, str4, e2.l(e, new StringBuilder("failed, exception ")));
            return adSessionCreateAdSession;
        }
        try {
            adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, AdSessionContext.createNativeAdSessionContext(partnerCreatePartner, MBridgeConstans.OMID_JS_SERVICE_CONTENT, a(str, context2, str2, str3, str4, str6), str5, str7));
            p0.a("OMSDK", "adSession create success");
            return adSessionCreateAdSession;
        } catch (IllegalArgumentException e17) {
            e = e17;
            p0.b("OMSDK", e.getMessage());
            new h(context2).a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
            return adSessionCreateAdSession;
        } catch (Exception e18) {
            e = e18;
            p0.b("OMSDK", e.getMessage());
            new h(context2).a(str7, str6, str3, str4, e2.l(e, new StringBuilder("failed, exception ")));
            return adSessionCreateAdSession;
        }
    }

    public static String b() {
        try {
            File file = new File(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_OTHER), "/omsdk/om_js_h5_content.txt");
            return file.exists() ? n0.e(file) : "";
        } catch (Exception e10) {
            p0.a("OMSDK", e10.getMessage());
            return "";
        }
    }

    public static void c(Context context) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_URL)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = "";
            new h(context).a("", "", "", "", "fetch OM failed, OMID_JS_H5_URL null");
        } else {
            if (context == null) {
                return;
            }
            try {
                new com.mbridge.msdk.omsdk.a(context.getApplicationContext()).get(0, MBridgeConstans.OMID_JS_H5_URL, (com.mbridge.msdk.foundation.same.net.wrapper.e) null, new c(context), "om_sdk", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            } catch (Exception e10) {
                p0.b("OMSDK", e10.getMessage());
            }
        }
    }

    public static void b(Context context) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_URL)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = "";
            new h(context).a("", "", "", "", "fetch OM failed, OMID_JS_SERVICE_URL null");
        } else {
            if (context == null) {
                return;
            }
            try {
                new com.mbridge.msdk.omsdk.a(context.getApplicationContext()).get(0, MBridgeConstans.OMID_JS_SERVICE_URL, (com.mbridge.msdk.foundation.same.net.wrapper.e) null, new a(context), "om_sdk", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            } catch (Exception e10) {
                p0.b("OMSDK", e10.getMessage());
            }
        }
    }

    public static void c(String str) {
        new Thread(new d(str)).start();
    }

    public static void b(String str) {
        new Thread(new RunnableC0301b(str)).start();
    }

    public static String a() {
        try {
            return n0.e(new File(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_OTHER), "/omsdk/om_js_content.txt"));
        } catch (Exception e10) {
            p0.a("OMSDK", e10.getMessage());
            return "";
        }
    }

    private static void a(Context context) {
        if (Omid.isActive()) {
            return;
        }
        Omid.activate(context);
    }

    private static List<VerificationScriptResource> a(String str, Context context, String str2, String str3, String str4, String str5) {
        String str6;
        String str7;
        MalformedURLException malformedURLException;
        String str8;
        String str9;
        IllegalArgumentException illegalArgumentException;
        VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithParameters;
        ArrayList arrayList = new ArrayList();
        try {
            try {
            } catch (JSONException e10) {
                p0.b("OMSDK", e10.getMessage());
                new h(context).a(str2, str5, str3, str4, "failed, exception " + e10.getMessage());
            }
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (str != null) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                        String strOptString = jSONObjectOptJSONObject.optString("vkey", "");
                        URL url = new URL(jSONObjectOptJSONObject.optString("et_url", ""));
                        String strOptString2 = jSONObjectOptJSONObject.optString("verification_p", "");
                        if (TextUtils.isEmpty(strOptString2)) {
                            if (TextUtils.isEmpty(strOptString)) {
                                verificationScriptResourceCreateVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                            } else {
                                verificationScriptResourceCreateVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                            }
                        } else {
                            verificationScriptResourceCreateVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(strOptString, url, strOptString2);
                        }
                        arrayList.add(verificationScriptResourceCreateVerificationScriptResourceWithParameters);
                    }
                }
            } catch (IllegalArgumentException e11) {
                illegalArgumentException = e11;
                str8 = str2;
                str9 = str5;
                p0.b("OMSDK", illegalArgumentException.getMessage());
                IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
                new h(context).a(str8, str9, str3, str4, "failed, exception " + illegalArgumentException2.getMessage());
                return arrayList;
            } catch (MalformedURLException e12) {
                malformedURLException = e12;
                str6 = str2;
                str7 = str5;
                p0.b("OMSDK", malformedURLException.getMessage());
                MalformedURLException malformedURLException2 = malformedURLException;
                new h(context).a(str6, str7, str3, str4, "failed, exception " + malformedURLException2.getMessage());
                return arrayList;
            }
        } catch (IllegalArgumentException e13) {
            str8 = str2;
            str9 = str5;
            illegalArgumentException = e13;
        } catch (MalformedURLException e14) {
            str6 = str2;
            str7 = str5;
            malformedURLException = e14;
        }
        return arrayList;
    }

    public static AdSession a(Context context, WebView webView, String str, CampaignEx campaignEx) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = a();
        }
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_CONTENT)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = b();
        }
        if (!TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT) && !TextUtils.isEmpty(campaignEx.getOmid())) {
            return a(context, webView, (String) null, CreativeType.DEFINED_BY_JAVASCRIPT);
        }
        p0.a("OMSDK", "createNativeAdSession: TextUtils.isEmpty(omid) = " + TextUtils.isEmpty(campaignEx.getOmid()) + " TextUtils.isEmpty(MIntegralConstans.OMID_JS_SERVICE_CONTENT) = " + TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT));
        new h(context).a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), campaignEx.getCampaignUnitId(), "failed, OMID_JS_SERVICE_CONTENT null or omid null");
        return null;
    }

    public static AdSession a(Context context, WebView webView, String str, CreativeType creativeType) {
        a(context);
        AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner("Mintegral", MBConfiguration.SDK_VERSION), webView, null, str));
        adSessionCreateAdSession.registerAdView(webView);
        return adSessionCreateAdSession;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_CONTENT)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = b();
        }
        return TextUtils.isEmpty(str) ? str : str.replace("/*OMSDK_INSERT_HERE*/", MBridgeConstans.OMID_JS_H5_CONTENT).replace("[INSERT RESOURCE URL]", f42151a);
    }
}
