package com.bytedance.sdk.openadsdk.jr.jpo.jpo;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.cm.au;
import com.bytedance.sdk.openadsdk.core.duq;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.pdm;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm implements jj {

    /* renamed from: cm, reason: collision with root package name */
    protected int f21249cm;
    protected String jpo;
    private final WeakReference<Context> my;

    /* renamed from: jd, reason: collision with root package name */
    protected boolean f21250jd = false;
    protected final AtomicBoolean wqx = new AtomicBoolean(false);

    /* renamed from: jj, reason: collision with root package name */
    private boolean f21251jj = false;

    public cm(Context context, String str) {
        this.my = new WeakReference<>(context);
        this.jpo = str;
        "====tag===".concat(String.valueOf(str));
        if (sq.jpo() == null) {
            sq.jd(context);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj
    public boolean cm(dt dtVar) {
        if (dtVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.jj jjVarXur = dtVar.xur();
        this.wqx.set(true);
        return jjVarXur != null && jpo(jpo(), dtVar, jjVarXur.jpo(), jjVarXur.wqx());
    }

    public boolean jd(dt dtVar) throws JSONException {
        com.bytedance.sdk.openadsdk.core.cm.jpo(dtVar, this.jpo, 1, null);
        if (dtVar.cnl() == null) {
            com.bytedance.sdk.openadsdk.core.cm.jpo(dtVar, this.jpo, -1, null);
            return false;
        }
        String strJpo = dtVar.cnl().jpo();
        if (TextUtils.isEmpty(strJpo)) {
            com.bytedance.sdk.openadsdk.core.cm.jpo(dtVar, this.jpo, -2, dtVar.cnl().cm());
        } else {
            Uri uri = Uri.parse(strJpo);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            tic.jd jdVarJpo = tic.jpo(jpo(), intent);
            if (jdVarJpo.f21607jd > 0) {
                if (!(jpo() instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                try {
                    HashMap map = new HashMap();
                    jpo(dtVar, map);
                    map.put("matched_count", Integer.valueOf(jdVarJpo.f21607jd));
                    map.put("url", strJpo);
                    ComponentName componentName = jdVarJpo.jpo;
                    if (componentName != null) {
                        intent.setComponent(componentName);
                    }
                    com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, this.jpo, "open_url_app", map);
                    jpo().startActivity(intent);
                    au.jpo().jpo(map).jpo(dtVar, this.jpo);
                    com.bytedance.sdk.openadsdk.cm.wqx.jpo("dp_start_act_success", dtVar, this.jpo, map);
                    return true;
                } catch (Throwable th2) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("exception", th2.getMessage());
                        jSONObject.put("intent", intent.toString());
                        jSONObject.put("can_query_install", 1);
                    } catch (Exception unused) {
                    }
                    com.bytedance.sdk.openadsdk.core.cm.jpo(dtVar, this.jpo, -4, jSONObject);
                }
            } else {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("intent", intent.toString());
                    jSONObject2.put("can_query_install", 1);
                } catch (Exception unused2) {
                }
                com.bytedance.sdk.openadsdk.core.cm.jpo(dtVar, this.jpo, -3, jSONObject2);
            }
        }
        if (this.f21250jd && !this.wqx.get()) {
            return false;
        }
        this.f21250jd = true;
        Map<String, Object> map2 = new HashMap<>();
        jpo(dtVar, map2);
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, this.jpo, "open_fallback_url", map2);
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj
    public boolean jpo(dt dtVar) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj
    public void wqx(dt dtVar) {
        if (jpo() == null) {
            return;
        }
        if (jd(dtVar)) {
            this.wqx.set(true);
            dtVar.my(true);
            return;
        }
        if (jpo(dtVar)) {
            dtVar.my(true);
            return;
        }
        if (jpo(dtVar, false)) {
            return;
        }
        if (cm(dtVar)) {
            dtVar.my(true);
        } else {
            if (dtVar.xur() != null || dtVar.iwg() == null) {
                return;
            }
            duq.jpo(jpo(), dtVar.iwg(), dtVar, tic.jpo(this.jpo), this.jpo, true);
            dtVar.my(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj
    public void jpo(boolean z10) {
        this.f21251jj = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj
    public void jpo(int i10) {
        this.f21249cm = i10;
    }

    public boolean jpo(Context context, dt dtVar, String str, String str2) {
        return jpo(context, str, str2, this.jpo, dtVar);
    }

    public static boolean jpo(Context context, String str, String str2, String str3, dt dtVar) {
        if (wqx.jpo()) {
            return my.jpo(context, str, str2, str3, dtVar);
        }
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

    public Context jpo() {
        WeakReference<Context> weakReference = this.my;
        return (weakReference == null || weakReference.get() == null) ? sq.jpo() : this.my.get();
    }

    private void jpo(dt dtVar, Map<String, Object> map) {
        if (dtVar != null && dtVar.tda() == 0) {
            map.put("auto_click", Boolean.valueOf(!dtVar.prr()));
        }
        if (dtVar != null && dtVar.tda() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.f21249cm >= 11));
        }
        map.put("can_query_install", 1);
    }

    public boolean jpo(dt dtVar, boolean z10) {
        IPMiBroadcastReceiver iPMiBroadcastReceiverJpo;
        if (dtVar != null) {
            try {
                pdm pdmVarZwh = dtVar.zwh();
                if (pdmVarZwh != null && !TextUtils.isEmpty(pdmVarZwh.zz())) {
                    if (pdmVarZwh.qk() && dtVar.xur() != null && !TextUtils.isEmpty(dtVar.xur().wqx()) && (iPMiBroadcastReceiverJpo = IPMiBroadcastReceiver.jpo(jpo())) != null) {
                        iPMiBroadcastReceiverJpo.jpo(dtVar.xur().wqx(), dtVar);
                    }
                    final boolean zJpo = jd.jpo(jpo(), pdmVarZwh.zz(), dtVar);
                    com.bytedance.sdk.openadsdk.utils.duq.jd(new xyk("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.jr.jpo.jpo.cm.1
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
}
