package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.y;
import androidx.browser.customtabs.z;
import b0.e2;
import com.bytedance.sdk.openadsdk.activity.TTBaseActivity;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class tu {
    public static boolean jd(Context context, String str, com.bytedance.sdk.openadsdk.core.model.dt dtVar, String str2) {
        if (!(context instanceof Activity)) {
            Activity activityJd = com.bytedance.sdk.openadsdk.core.prr.jpo().my().jd();
            if (activityJd != null && jpo(activityJd)) {
                context = activityJd;
            }
        } else if (!jpo((Activity) context)) {
            context = null;
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.sq.jpo();
        }
        Context context2 = context;
        if (context2 == null || !jpo(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        HashMap mapS = e2.s("deeplink_url", str);
        mapS.put("jsb_deeplink", 1);
        if (com.bytedance.sdk.openadsdk.jr.jpo.jpo.wqx.jpo()) {
            return com.bytedance.sdk.openadsdk.jr.jpo.jpo.wqx.jpo(context2, str, dtVar, tic.jd(dtVar), mapS, true);
        }
        try {
            if (!(context2 instanceof Activity)) {
                intent.addFlags(268435456);
            }
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, str2, "open_url_app", mapS);
            context2.startActivity(intent);
            com.bytedance.sdk.openadsdk.cm.au.jpo().jpo(mapS).jpo(dtVar, str2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static com.bytedance.sdk.openadsdk.prr.jpo.jd jpo(String str, int i10, com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        com.bytedance.sdk.openadsdk.prr.jpo.jd jdVar = new com.bytedance.sdk.openadsdk.prr.jpo.jd();
        jdVar.jpo(str);
        jdVar.jpo(dtVar);
        jdVar.jd(tic.jpo(dtVar));
        jdVar.jpo(i10);
        jdVar.jpo(false);
        jdVar.jd(dtVar.pzk());
        return jdVar;
    }

    public static boolean jpo(Context context, String str, com.bytedance.sdk.openadsdk.core.model.dt dtVar, String str2) {
        if (context instanceof Activity) {
            if (!jpo((Activity) context)) {
                context = null;
            }
        } else {
            Activity activityJd = com.bytedance.sdk.openadsdk.core.prr.jpo().my().jd();
            if (activityJd != null && jpo(activityJd)) {
                context = activityJd;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.sq.jpo();
        }
        if (context == null) {
            return false;
        }
        String strJpo = tic.jpo(dtVar);
        if (!com.bytedance.sdk.component.utils.opi.jpo(str)) {
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(jpo(str2, 5, dtVar));
            return false;
        }
        String strJd = com.bytedance.sdk.openadsdk.core.model.dt.jd(context, dtVar);
        if (!TextUtils.isEmpty(strJd)) {
            try {
                y yVar = new y();
                yVar.setUrlBarHidingEnabled(false);
                yVar.setShareState(2);
                try {
                    z zVarBuild = yVar.build();
                    if (!(context instanceof Activity)) {
                        zVarBuild.f5302a.addFlags(268435456);
                    }
                    com.bytedance.sdk.openadsdk.core.jpo.jpo.jpo(context, strJd, zVarBuild, Uri.parse(str));
                    if (context instanceof TTBaseActivity) {
                        ((TTBaseActivity) context).wqx(true);
                    }
                    com.bytedance.sdk.openadsdk.prr.jpo.jd jdVarJpo = jpo(str2, 100, dtVar);
                    jdVarJpo.jpo(true);
                    jdVarJpo.jd(8);
                    com.bytedance.sdk.openadsdk.cm.wqx.jpo(jdVarJpo);
                } catch (Throwable th2) {
                    String message = th2.getMessage();
                    com.bytedance.sdk.component.utils.nmd.wqx("OpenUtils", message);
                    com.bytedance.sdk.openadsdk.prr.jpo.jd jdVarJpo2 = jpo(str2, 13, dtVar);
                    jdVarJpo2.wqx(message);
                    com.bytedance.sdk.openadsdk.cm.wqx.jpo(jdVarJpo2);
                    jpo(context, str, dtVar, str2, strJpo);
                }
                return true;
            } catch (Throwable th3) {
                String message2 = th3.getMessage();
                com.bytedance.sdk.component.utils.nmd.wqx("OpenUtils", message2);
                com.bytedance.sdk.openadsdk.prr.jpo.jd jdVarJpo3 = jpo(str2, 12, dtVar);
                jdVarJpo3.wqx(message2);
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(jdVarJpo3);
                return jpo(context, str, dtVar, str2, strJpo);
            }
        }
        return jpo(context, str, dtVar, str2, strJpo);
    }

    private static boolean jpo(Context context, String str, com.bytedance.sdk.openadsdk.core.model.dt dtVar, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setData(Uri.parse(str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.prr.jpo.jd jdVarJpo = jpo(str2, 100, dtVar);
                jdVarJpo.jpo(true);
                jdVarJpo.jd(2);
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(jdVarJpo);
                return true;
            } catch (Throwable th2) {
                String message = th2.getMessage();
                com.bytedance.sdk.openadsdk.prr.jpo.jd jdVarJpo2 = jpo(str2, 7, dtVar);
                jdVarJpo2.wqx(message);
                jdVarJpo2.jd(2);
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(jdVarJpo2);
                return false;
            }
        } catch (Throwable th3) {
            String message2 = th3.getMessage();
            com.bytedance.sdk.openadsdk.prr.jpo.jd jdVarJpo3 = jpo(str2, 6, dtVar);
            jdVarJpo3.wqx(message2);
            jdVarJpo3.jd(2);
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(jdVarJpo3);
            return false;
        }
    }

    public static boolean jpo(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static boolean jpo(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}
