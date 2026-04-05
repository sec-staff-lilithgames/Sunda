package com.bytedance.sdk.openadsdk.component.reward.jpo;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.pdm;
import i2.hQ.aTNDubNmpwAqdU;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jd {
    private static final SparseArray<WeakReference<dt>> jpo = new SparseArray<>();

    public static void jpo(jpo jpoVar, Intent intent, Bundle bundle) {
        jpo(intent, jpoVar);
        jpo(bundle, jpoVar);
    }

    public static dt jpo(Intent intent, Bundle bundle, com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar) {
        if (!com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            com.bytedance.sdk.openadsdk.core.model.jpo jpoVarJd = pdm.jpo().jd(pdm.jpo(intent));
            dtVarJu = jpoVarJd != null ? jpoVarJd.ju() : null;
            if (jdVar != null) {
                jdVar.jpo(bundle);
            }
            pdm.jpo().my();
        } else if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_AD_INFO);
                if (stringExtra != null) {
                    dtVarJu = com.bytedance.sdk.openadsdk.core.model.jpo.jd(new JSONObject(stringExtra)).ju();
                }
            } catch (Exception e10) {
                nmd.jpo("TTAD.RFDM", "", e10);
            }
        }
        if (bundle != null) {
            try {
                WeakReference<dt> weakReference = jpo.get(bundle.getInt("meta_tmp"));
                if (weakReference != null) {
                    dtVarJu = weakReference.get();
                }
            } catch (Throwable th2) {
                nmd.jpo("TTAD.RFDM", "", th2);
            }
        }
        if (dtVarJu != null) {
            dtVarJu.jpo(dtVarJu.cgn(), 7);
        }
        return dtVarJu;
    }

    public static void jpo(Intent intent, jpo jpoVar) {
        if (intent == null) {
            return;
        }
        jpoVar.hmu.wqx(intent.getBooleanExtra("video_is_cached", false));
        jpoVar.fy = intent.getStringExtra("multi_process_listener_key");
        jpoVar.rxq = intent.getIntExtra(aTNDubNmpwAqdU.UTwMLBQbPkPlZXl, 0) == 3;
    }

    public static void jpo(Bundle bundle, jpo jpoVar) {
        if (bundle == null) {
            return;
        }
        jpoVar.fy = bundle.getString("multi_process_listener_key");
        jpoVar.hmu.wqx(bundle.getBoolean("video_is_cached", false));
        jpoVar.huv = bundle.getBoolean("is_mute");
        if (bundle.getLong("video_current") > 0) {
            jpoVar.hmu.jd(bundle.getLong("video_current", 0L));
        }
        jpoVar.jpo(bundle.getBoolean("has_show_skip_btn"));
    }

    public static void jpo(jpo jpoVar, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            dt dtVar = jpoVar.f19914jd;
            jpo.append(dtVar.hashCode(), new WeakReference<>(dtVar));
            bundle.putInt("meta_tmp", dtVar.hashCode());
            bundle.putString("multi_process_listener_key", jpoVar.fy);
            bundle.putBoolean("video_is_cached", jpoVar.hmu.sz());
            bundle.putLong("video_current", jpoVar.hmu.m442if());
            bundle.putBoolean("is_mute", jpoVar.huv);
            bundle.putBoolean("has_show_skip_btn", jpoVar.f19910et);
        } catch (Throwable th2) {
            nmd.jpo("TTAD.RFDM", "onSaveInstanceState: ", th2);
        }
    }

    public static void jpo(dt dtVar, Intent intent, Bundle bundle) {
        if (bundle == null || dtVar == null) {
            return;
        }
        try {
            jpo.append(dtVar.hashCode(), new WeakReference<>(dtVar));
            bundle.putInt("meta_tmp", dtVar.hashCode());
            if (intent != null) {
                bundle.putString("multi_process_listener_key", intent.getStringExtra("multi_process_listener_key"));
                bundle.putBoolean("video_is_cached", intent.getBooleanExtra("video_is_cached", false));
            }
        } catch (Throwable th2) {
            nmd.jpo("TTAD.RFDM", "onSaveInstanceState: ", th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void jpo(android.content.Intent r2, android.app.Activity r3, boolean r4, com.bytedance.sdk.openadsdk.core.model.jpo r5, java.lang.String r6) {
        /*
            if (r3 != 0) goto L8
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r3)
            goto L1d
        L8:
            android.view.WindowManager r3 = r3.getWindowManager()     // Catch: java.lang.Exception -> L15
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch: java.lang.Exception -> L15
            int r3 = r3.getRotation()     // Catch: java.lang.Exception -> L15
            goto L1e
        L15:
            r3 = move-exception
            java.lang.String r0 = "TTAD.RFDM"
            java.lang.String r1 = ""
            com.bytedance.sdk.component.utils.nmd.jpo(r0, r1, r3)
        L1d:
            r3 = 0
        L1e:
            java.lang.String r0 = "orientation_angle"
            r2.putExtra(r0, r3)
            java.lang.String r3 = "video_is_cached"
            r2.putExtra(r3, r4)
            boolean r3 = com.bytedance.sdk.openadsdk.multipro.jd.wqx()
            if (r3 == 0) goto L44
            org.json.JSONObject r3 = r5.au()
            if (r3 != 0) goto L35
            return
        L35:
            java.lang.String r4 = "multi_process_ad_info"
            java.lang.String r3 = r3.toString()
            r2.putExtra(r4, r3)
            java.lang.String r3 = "multi_process_listener_key"
            r2.putExtra(r3, r6)
            return
        L44:
            com.bytedance.sdk.openadsdk.core.pdm r3 = com.bytedance.sdk.openadsdk.core.pdm.jpo()
            r3.my()
            com.bytedance.sdk.openadsdk.core.pdm r3 = com.bytedance.sdk.openadsdk.core.pdm.jpo()
            int r3 = r3.jpo(r5)
            java.lang.String r4 = "meta_index"
            r2.putExtra(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.jpo.jd.jpo(android.content.Intent, android.app.Activity, boolean, com.bytedance.sdk.openadsdk.core.model.jpo, java.lang.String):void");
    }
}
