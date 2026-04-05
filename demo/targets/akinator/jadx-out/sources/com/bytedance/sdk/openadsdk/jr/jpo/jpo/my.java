package com.bytedance.sdk.openadsdk.jr.jpo.jpo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.duq;
import com.bytedance.sdk.openadsdk.core.model.au;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.pdm;
import com.bytedance.sdk.openadsdk.core.prr;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.tu;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.network.model.HttpRequest;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my implements jj {
    public static Boolean jpo;

    /* renamed from: cm, reason: collision with root package name */
    private final WeakReference<Context> f21253cm;

    /* renamed from: jd, reason: collision with root package name */
    protected String f21254jd;
    protected int wqx;

    public my(Context context, String str) {
        this.f21253cm = new WeakReference<>(context);
        this.f21254jd = str;
        "====tag===".concat(String.valueOf(str));
        if (sq.jpo() == null) {
            sq.jd(context);
        }
    }

    private static boolean jd() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj
    public boolean cm(dt dtVar) {
        com.bytedance.sdk.openadsdk.core.model.jj jjVarXur;
        if (dtVar == null || (jjVarXur = dtVar.xur()) == null) {
            return false;
        }
        return jpo(jpo(), dtVar, jjVarXur.jpo(), jjVarXur.wqx());
    }

    @Override // com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj
    public void jpo(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj
    public void wqx(dt dtVar) {
        if (jpo() == null || dtVar == null) {
            return;
        }
        if (jd(dtVar)) {
            dtVar.my(true);
            com.bytedance.sdk.openadsdk.utils.my.jpo(dtVar);
            return;
        }
        if (jpo(dtVar)) {
            dtVar.my(true);
            com.bytedance.sdk.openadsdk.utils.my.jpo(dtVar);
            return;
        }
        if (jpo(dtVar, false)) {
            com.bytedance.sdk.openadsdk.utils.my.jpo(dtVar);
            return;
        }
        if (cm(dtVar)) {
            dtVar.my(true);
            com.bytedance.sdk.openadsdk.utils.my.jpo(dtVar);
        } else {
            if (dtVar.xur() != null || dtVar.iwg() == null) {
                return;
            }
            duq.jpo(jpo(), dtVar.iwg(), dtVar, tic.jpo(this.f21254jd), this.f21254jd, true);
            dtVar.my(true);
            com.bytedance.sdk.openadsdk.utils.my.jpo(dtVar);
        }
    }

    public static boolean jpo(Context context, String str, String str2, String str3, dt dtVar) {
        if (!TextUtils.isEmpty(str3) && str3.contains("_landingpage")) {
            str3 = str3.replace("_landingpage", "");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.cm.wqx.jd(dtVar, str3, "store_open", (JSONObject) null);
                com.bytedance.sdk.openadsdk.utils.my.jpo(dtVar);
                return true;
            } catch (Throwable unused) {
            }
        }
        if (context != null && str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri uri = Uri.parse("market://details?id=".concat(str2));
                intent2.setData(uri);
                Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent2, C.DEFAULT_BUFFER_SEGMENT_SIZE).iterator();
                while (it.hasNext()) {
                    if (it.next().activityInfo.packageName.equals("com.android.vending") && context.getPackageManager().getLaunchIntentForPackage("com.android.vending") != null) {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(uri);
                        intent3.setPackage("com.android.vending");
                        if (!(context instanceof Activity)) {
                            intent3.setFlags(268435456);
                        }
                        context.startActivity(intent3);
                        com.bytedance.sdk.openadsdk.cm.wqx.jd(dtVar, str3, "store_open", (JSONObject) null);
                        com.bytedance.sdk.openadsdk.utils.my.jpo(dtVar);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                ApmHelper.reportCustomError("gotoGooglePlayByPackageNameAndUrl error", "gotoGooglePlay", th2);
            }
        }
        return false;
    }

    public boolean jd(dt dtVar) {
        com.bytedance.sdk.openadsdk.core.cm.jpo(dtVar, this.f21254jd, 1, null);
        au auVarCnl = dtVar.cnl();
        if (auVarCnl == null) {
            com.bytedance.sdk.openadsdk.core.cm.jpo(dtVar, this.f21254jd, -1, null);
            return false;
        }
        HashMap map = new HashMap();
        jpo(dtVar, map);
        if (wqx.jpo(jpo(), auVarCnl.jpo(), dtVar, tic.jd(dtVar), map, true)) {
            return true;
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, this.f21254jd, "open_fallback_url", map);
        return false;
    }

    public static boolean jd(dt dtVar, Context context, boolean z10) {
        String strWqx;
        IPMiBroadcastReceiver iPMiBroadcastReceiverJpo;
        if (dtVar != null && context != null) {
            try {
                pdm pdmVarZwh = dtVar.zwh();
                if (pdmVarZwh != null && !TextUtils.isEmpty(pdmVarZwh.zz())) {
                    if (pdmVarZwh.xyk() && jpo(dtVar, context, z10)) {
                        return true;
                    }
                    if (pdmVarZwh.qk()) {
                        if (dtVar.oya() == 1) {
                            strWqx = pdmVarZwh.jpo();
                        } else {
                            strWqx = (dtVar.xur() == null || TextUtils.isEmpty(dtVar.xur().wqx())) ? null : dtVar.xur().wqx();
                        }
                        if (!TextUtils.isEmpty(strWqx) && (iPMiBroadcastReceiverJpo = IPMiBroadcastReceiver.jpo(context)) != null) {
                            iPMiBroadcastReceiverJpo.jpo(strWqx, dtVar);
                        }
                    }
                    final boolean zJpo = wqx.jpo(context, pdmVarZwh.zz(), dtVar, tic.jd(dtVar), jpo(dtVar, z10, pdmVarZwh), true);
                    com.bytedance.sdk.openadsdk.utils.duq.jd(new xyk("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.jr.jpo.jpo.my.3
                        @Override // java.lang.Runnable
                        public void run() throws JSONException {
                            if (zJpo) {
                                zz.jpo("oem_store", "1");
                            } else {
                                zz.jpo("oem_store", "-2");
                            }
                        }
                    });
                    return zJpo;
                }
            } catch (Throwable th2) {
                nmd.wqx("GPDownLoader", th2.getMessage());
            }
        }
        return false;
    }

    public static boolean jpo(dt dtVar, String str, Context context, String str2, Map<String, Object> map) {
        Intent intentJpo;
        if (dtVar != null && dtVar.yxp() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (intentJpo = tic.jpo(context, str)) == null) {
                return false;
            }
            intentJpo.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                intentJpo.addFlags(268435456);
            }
            context.startActivity(intentJpo);
            if (map == null) {
                map = new HashMap<>();
            }
            if (dtVar != null && dtVar.tda() == 0) {
                map.put("auto_click", Boolean.valueOf(!dtVar.prr()));
            }
            map.put("can_query_install", Integer.valueOf(jd() ? 1 : 0));
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj
    public void jpo(int i10) {
        this.wqx = i10;
    }

    public boolean jpo(Context context, dt dtVar, String str, String str2) {
        return jpo(context, str, str2, this.f21254jd, dtVar);
    }

    public Context jpo() {
        WeakReference<Context> weakReference = this.f21253cm;
        return (weakReference == null || weakReference.get() == null) ? sq.jpo() : this.f21253cm.get();
    }

    private void jpo(dt dtVar, Map<String, Object> map) {
        if (dtVar != null && dtVar.tda() == 0) {
            map.put("auto_click", Boolean.valueOf(!dtVar.prr()));
        }
        if (dtVar != null && dtVar.tda() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.wqx >= 11));
        }
        map.put("can_query_install", Integer.valueOf(jd() ? 1 : 0));
    }

    @Override // com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj
    public boolean jpo(dt dtVar) {
        com.bytedance.sdk.openadsdk.core.model.jj jjVarXur;
        if (dtVar == null || (jjVarXur = dtVar.xur()) == null || dtVar.yxp() == 0) {
            return false;
        }
        String strWqx = jjVarXur.wqx();
        if (TextUtils.isEmpty(strWqx)) {
            return false;
        }
        return jpo(dtVar, strWqx, jpo(), this.f21254jd, new HashMap());
    }

    public boolean jpo(dt dtVar, boolean z10) {
        return jd(dtVar, jpo(), z10);
    }

    private static void jpo(final JSONObject jSONObject, dt dtVar, String str, final int i10) {
        try {
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), dtVar, str, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.jr.jpo.jpo.my.1
                @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                public JSONObject jpo() {
                    try {
                        jSONObject.put("status", i10);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public static boolean jpo(dt dtVar, Context context, boolean z10) {
        if (dtVar != null && dtVar.zwh() != null && dtVar.zwh().xyk() && !TextUtils.isEmpty(dtVar.zwh().zz()) && context != null) {
            try {
                pdm pdmVarZwh = dtVar.zwh();
                String strJpo = tic.jpo(dtVar);
                final JSONObject jSONObjectYd = pdmVarZwh.yd();
                jSONObjectYd.put("from_web", z10 ? 1 : 0);
                jSONObjectYd.put("is_w2a", dtVar.oya());
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), dtVar, strJpo, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.jr.jpo.jpo.my.2
                    @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                    public JSONObject jpo() {
                        try {
                            jSONObjectYd.put("status", 0);
                        } catch (Throwable unused) {
                        }
                        return jSONObjectYd;
                    }
                });
                Intent intentJpo = jpo(context, pdmVarZwh);
                if (intentJpo == null) {
                    jpo(jSONObjectYd, dtVar, strJpo, -2);
                    return false;
                }
                if (context instanceof Activity) {
                    if (!tu.jpo((Activity) context)) {
                        context = null;
                    }
                } else {
                    Activity activityJd = prr.jpo().my().jd();
                    if (activityJd != null && tu.jpo(activityJd)) {
                        context = activityJd;
                    }
                }
                if (!(context instanceof Activity)) {
                    jpo(jSONObjectYd, dtVar, strJpo, -5);
                    return false;
                }
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && intentJpo.resolveActivity(packageManager) != null) {
                    try {
                        ((Activity) context).startActivityForResult(intentJpo, 0);
                        jpo(jSONObjectYd, dtVar, strJpo, 1);
                        return true;
                    } catch (Throwable unused) {
                        jpo(jSONObjectYd, dtVar, strJpo, -3);
                        return false;
                    }
                }
                jpo(jSONObjectYd, dtVar, strJpo, -4);
                return false;
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
        return false;
    }

    private static Intent jpo(Context context, pdm pdmVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String strCm = pdmVar.cm();
            if (!TextUtils.isEmpty(strCm)) {
                intent.setPackage(strCm);
            } else {
                intent.setPackage("com.android.vending");
            }
            intent.setData(Uri.parse(pdmVar.zz()));
            boolean z10 = true;
            if (pdmVar.jd() != 1) {
                z10 = false;
            }
            intent.putExtra("overlay", z10);
            if (TextUtils.isEmpty(pdmVar.wqx())) {
                intent.putExtra("callerId", context.getPackageName());
            } else {
                intent.putExtra("callerId", pdmVar.wqx());
            }
            pdmVar.jpo(intent);
            return intent;
        } catch (Throwable th2) {
            th2.getMessage();
            return null;
        }
    }

    private static Map<String, Object> jpo(dt dtVar, boolean z10, pdm pdmVar) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("oem_vendor_type", pdmVar.jj());
            jSONObject.put("from_web", z10 ? 1 : 0);
            jSONObject.put("is_w2a", dtVar.oya());
            map.put("pag_json_data", jSONObject.toString());
        } catch (Throwable unused) {
        }
        return map;
    }

    public static boolean jpo(String str, dt dtVar) {
        String queryParameter;
        if (str != null && !str.isEmpty()) {
            try {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                String host = uri.getHost();
                if (ApsAdWebViewSupportClient.MARKET_SCHEME.equals(scheme) && "details".equals(host)) {
                    return true;
                }
                if ((!"http".equals(scheme) && !HttpRequest.DEFAULT_SCHEME.equals(scheme)) || (!"play.google.com".equals(host) && !"market.android.com".equals(host))) {
                    if (ApsAdWebViewSupportClient.MARKET_SCHEME.equals(scheme) && "webstoreredirect".equals(host) && (queryParameter = uri.getQueryParameter("uri")) != null) {
                        return jpo(queryParameter, dtVar);
                    }
                }
                return true;
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
        return false;
    }

    public static boolean jpo(dt dtVar, String str) {
        if (dtVar == null || dtVar.zwh() == null) {
            return false;
        }
        String strMy = dtVar.zwh().my();
        if (TextUtils.isEmpty(strMy)) {
            return false;
        }
        return Pattern.compile(strMy).matcher(str).matches();
    }
}
