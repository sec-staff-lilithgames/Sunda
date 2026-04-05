package com.bytedance.sdk.openadsdk.api.init;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.jpo.jd.jd;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.common.my;
import com.bytedance.sdk.openadsdk.core.Cif;
import com.bytedance.sdk.openadsdk.core.jpo.jpo;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.wqx;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.multipro.cm.cm;
import com.bytedance.sdk.openadsdk.utils.kln;
import com.bytedance.sdk.openadsdk.utils.nq;
import com.bytedance.sdk.openadsdk.utils.va;
import com.ironsource.Q6;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class PAGInitHelper {
    public static final List<PAGSdk.PAGInitCallback> CALLBACK_LIST = new ArrayList();
    public static float animationScale = 1.0f;

    public static void initAPM() {
        if (my.jpo()) {
            return;
        }
        try {
            String strCm = zz.jd().cm();
            if (TextUtils.isEmpty(strCm)) {
                return;
            }
            ApmHelper.initApm(sq.jpo(), new PAGConfig.Builder().appId(strCm).build());
        } catch (Exception unused) {
        }
    }

    public static void initAnimationScale(Context context) {
        try {
            float f10 = Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
            animationScale = f10;
            if (f10 <= 0.0f) {
                animationScale = 1.0f;
            }
        } catch (Throwable unused) {
            animationScale = 1.0f;
        }
    }

    public static void initMemoryData() {
        sq.cm();
        cm.jpo("ttopenadsdk", "a", 0);
        cm.jpo("sp_global_file", "a", 0);
        cm.jpo("sp_global_privacy", "a", 0);
        cm.jpo("sp_global_app_id", "a", 0);
        cm.jpo("sp_global_icon_id", "a", 0);
        cm.jpo("tpl_fetch_model", "a", 0);
        cm.jpo("tt_sp", "a", 0);
        cm.jpo("tt_sdk_event_net_ad", "a", 0);
        cm.jpo("tt_sdk_event_net_state", "a", 0);
        cm.jpo("tt_sdk_event_net_trail", "a", 0);
        cm.jpo("tt_sdk_event_db_ad", "a", 0);
        cm.jpo("tt_sdk_event_db_state", "a", 0);
        cm.jpo("tt_sdk_event_db_trail", "a", 0);
        cm.jpo("pag_sp_bad_par", "did");
        cm.jpo("pag_sp_bad_par", Q6.U0);
    }

    private static void jpo() {
        wqx.jpo().jpo("uuid", nq.jpo());
    }

    public static void maybeAsyncInitTask(Context context) {
        jpo.jpo(context);
        kln.jpo();
        va.jpo(context);
        jpo();
        sq.my();
        String strJpo = Cif.jpo(context);
        com.bytedance.sdk.openadsdk.core.yd.wqx.jd(strJpo);
        com.bytedance.sdk.openadsdk.cm.jpo.cm.jpo(strJpo, true);
        jd.jpo();
        com.bytedance.sdk.openadsdk.core.au.wqx.jpo.jpo().jd();
        initAnimationScale(context);
    }
}
