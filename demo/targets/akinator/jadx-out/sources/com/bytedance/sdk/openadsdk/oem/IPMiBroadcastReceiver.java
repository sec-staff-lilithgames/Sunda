package com.bytedance.sdk.openadsdk.oem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.cm.wqx;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.pdm;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class IPMiBroadcastReceiver extends BroadcastReceiver {
    private static volatile IPMiBroadcastReceiver jpo;

    /* renamed from: cm, reason: collision with root package name */
    private int f21402cm = 0;

    /* renamed from: jd, reason: collision with root package name */
    private final LruCache<String, dt> f21403jd;
    private jpo wqx;

    private IPMiBroadcastReceiver() {
        int i10 = 10;
        int iJpo = com.bytedance.sdk.openadsdk.rq.jpo.jpo("ip_data_config", "ip_ad_cache_count", 10);
        if (iJpo > 0 && iJpo <= 200) {
            i10 = iJpo;
        }
        this.f21403jd = new LruCache<>(i10);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        if ("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT".equals(intent.getAction())) {
            duq.wqx(new xyk("ip-mi") { // from class: com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.1
                @Override // java.lang.Runnable
                public void run() {
                    final int i10;
                    final int i11;
                    final int i12;
                    try {
                        int intExtra = 0;
                        final int intExtra2 = intent.getIntExtra(IronSourceConstants.EVENTS_ERROR_CODE, 0);
                        if (intExtra2 < 0) {
                            int intExtra3 = intent.getIntExtra("reason", 0);
                            if (intExtra2 == -4 && intExtra3 == -1) {
                                return;
                            } else {
                                i10 = intExtra3;
                            }
                        } else {
                            i10 = 0;
                        }
                        if (intExtra2 == 5) {
                            int intExtra4 = intent.getIntExtra("status", 0);
                            if (intExtra4 == -2) {
                                try {
                                    intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_PROGRESS, 0);
                                } catch (Throwable unused) {
                                    IPMiBroadcastReceiver.this.f21402cm = 1;
                                }
                                if (intExtra < 100) {
                                    return;
                                }
                            }
                            i11 = intExtra4;
                            i12 = intExtra;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        String stringExtra = intent.getStringExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                        jpo jpoVar = IPMiBroadcastReceiver.this.wqx;
                        if (intExtra2 > 0 && jpoVar != null) {
                            jpoVar.jpo(stringExtra, intExtra2);
                        }
                        final dt dtVarJpo = IPMiBroadcastReceiver.this.jpo(stringExtra);
                        if (dtVarJpo != null) {
                            wqx.jpo(System.currentTimeMillis(), dtVarJpo, tic.jpo(dtVarJpo), "ip_listener_log", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.1.1
                                @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                                public JSONObject jpo() {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("ip_error_code", intExtra2);
                                        dt dtVar = dtVarJpo;
                                        if (dtVar != null) {
                                            jSONObject.put("ip_is_w2a", dtVar.oya());
                                        }
                                        int i13 = intExtra2;
                                        if (i13 > 0) {
                                            if (i13 == 5) {
                                                jSONObject.put("ip_status", i11);
                                                jSONObject.put("ip_exec_type", IPMiBroadcastReceiver.this.f21402cm);
                                            }
                                            if (i11 == -2) {
                                                jSONObject.put("ip_progress", i12);
                                            }
                                        }
                                        if (intExtra2 < 0) {
                                            jSONObject.put("ip_reason", i10);
                                        }
                                        return jSONObject;
                                    } catch (Throwable th2) {
                                        nmd.wqx("IPMiBroadcastReceiver", th2.getMessage());
                                        return null;
                                    }
                                }
                            });
                        }
                    } catch (Throwable th2) {
                        nmd.wqx("IPMiBroadcastReceiver", th2.getMessage());
                    }
                }
            });
        }
    }

    public void jpo(String str, dt dtVar) {
        if (TextUtils.isEmpty(str) || dtVar == null || this.f21403jd.get(str) != null) {
            return;
        }
        this.f21403jd.put(str, dtVar);
    }

    public dt jpo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f21403jd.get(str);
    }

    public void jpo(jpo jpoVar) {
        this.wqx = jpoVar;
    }

    public void jpo() {
        this.wqx = null;
    }

    public static IPMiBroadcastReceiver jpo(Context context) {
        if (com.bytedance.sdk.openadsdk.rq.jpo.jpo("ip_data_config", "ip_link_listener", 0) == 0) {
            return null;
        }
        if (jpo == null) {
            synchronized (IPMiBroadcastReceiver.class) {
                try {
                    if (jpo == null) {
                        jpo = new IPMiBroadcastReceiver();
                        IntentFilter intentFilter = new IntentFilter("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
                        if (Build.VERSION.SDK_INT >= 34 && tic.jj(context) >= 34) {
                            context.registerReceiver(jpo, intentFilter, 2);
                        } else {
                            context.registerReceiver(jpo, intentFilter);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    public static void jpo(final Context context, dt dtVar) {
        pdm pdmVarZwh;
        if (jpo == null && dtVar != null && (pdmVarZwh = dtVar.zwh()) != null && pdmVarZwh.qk()) {
            oya.jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        IPMiBroadcastReceiver.jpo(sq.jpo(context));
                    } catch (Throwable th2) {
                        nmd.wqx("IPMiBroadcastReceiver", th2.getMessage());
                    }
                }
            });
        }
    }
}
