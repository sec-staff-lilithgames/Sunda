package com.mbridge.msdk.foundation.same;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import com.iab.omid.library.mmadbridge.ScriptInjector;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.n0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.r0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f40749a = new LinkedList();

    public static int a(CampaignEx campaignEx, String str) {
        if (campaignEx == null) {
            return -1;
        }
        try {
            return !TextUtils.isEmpty(campaignEx.getMof_template_url()) ? u0.b(campaignEx.getMof_template_url()) : u0.b(str);
        } catch (Exception e10) {
            p0.b("SameTools", e10.getMessage());
            return -1;
        }
    }

    public static boolean a(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.equals(str2, com.mbridge.msdk.foundation.same.net.utils.d.h().f40843d) || TextUtils.equals(str2, com.mbridge.msdk.foundation.same.net.utils.d.h().O) || (!TextUtils.equals(str, "download_video") && !TextUtils.equals(str, "download_image") && !TextUtils.equals(str, "download_template") && !TextUtils.equals(str, "") && !TextUtils.equals(str, "download_other") && !TextUtils.equals(str, "download_html") && !TextUtils.equals(str, "applets_model") && !TextUtils.equals(str, MBInterstitialActivity.INTENT_CAMAPIGN) && !TextUtils.equals(str, "bid_request") && !TextUtils.equals(str, "more_offer") && !TextUtils.equals(str, "mraid_js") && !TextUtils.equals(str, "om_sdk") && !TextUtils.equals(str, "roas") && !TextUtils.equals(str, "web_env_check_js") && !TextUtils.equals(str, "setting")) || !r0.a().a("request_track", true)) ? false : true;
    }

    public static String a(DownloadRequest<?> downloadRequest) {
        if (downloadRequest == null) {
            return "un_known";
        }
        String str = downloadRequest.get(duhsDlGWdBkekB.psFPLpSUm, "");
        return TextUtils.isEmpty(str) ? "un_known" : str;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String[] strArrSplit = str.split(";");
            if (strArrSplit.length > 0) {
                return strArrSplit[0].trim();
            }
            return str.trim();
        } catch (Exception unused) {
            return "";
        }
    }

    public static void a(String str, File file) {
        Runtime runtime;
        List<String> list;
        if (file != null) {
            try {
                if (file.exists()) {
                    try {
                        list = f40749a;
                    } catch (Throwable th2) {
                        try {
                            p0.b("SameTools", th2.getMessage());
                            f40749a.add(str);
                            System.gc();
                            runtime = Runtime.getRuntime();
                        } catch (Throwable th3) {
                            try {
                                f40749a.add(str);
                                System.gc();
                                Runtime.getRuntime().gc();
                            } catch (Throwable unused) {
                            }
                            throw th3;
                        }
                    }
                    if (list.contains(str)) {
                        list.add(str);
                        System.gc();
                        Runtime.getRuntime().gc();
                    } else {
                        n0.a(com.mbridge.msdk.omsdk.b.a(ScriptInjector.injectScriptContentIntoHtml(MBridgeConstans.OMID_JS_SERVICE_CONTENT, n0.e(file))).getBytes(), file);
                        list.add(str);
                        System.gc();
                        runtime = Runtime.getRuntime();
                        runtime.gc();
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public static void a(File file) {
        boolean zDelete;
        if (file != null) {
            try {
                if (file.exists()) {
                    try {
                        zDelete = file.delete();
                    } catch (Throwable unused) {
                        zDelete = false;
                    }
                    if (zDelete) {
                        return;
                    }
                    file.deleteOnExit();
                }
            } catch (Throwable unused2) {
            }
        }
    }
}
