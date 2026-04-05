package com.bytedance.sdk.openadsdk.component.jpo;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.wqx.wqx;
import com.bytedance.sdk.openadsdk.core.zz.xyk;
import com.bytedance.sdk.openadsdk.core.zz.zz;
import com.bytedance.sdk.openadsdk.jr.jpo.jpo.qk;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    public static xyk jd(dt dtVar, Activity activity, final com.bytedance.sdk.openadsdk.component.xyk.jpo jpoVar, com.bytedance.sdk.openadsdk.component.zz.jd jdVar) {
        xyk xykVar = new xyk(activity.getApplicationContext(), dtVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.jpo.jd.2
            @Override // com.bytedance.sdk.openadsdk.core.wqx.jpo, com.bytedance.sdk.openadsdk.core.wqx.jd, com.bytedance.sdk.openadsdk.core.wqx.wqx
            public void jpo(View view, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, boolean z10) {
                HashMap map = new HashMap();
                map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(jpoVar.wqx()));
                jpo(map);
                super.jpo(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        xykVar.jpo((View) jdVar);
        jpo(activity.getApplicationContext(), dtVar, xykVar);
        jpo(xykVar, dtVar);
        return xykVar;
    }

    public static jpo jpo(dt dtVar, Activity activity, com.bytedance.sdk.openadsdk.component.xyk.jpo jpoVar) {
        jpo jpoVar2 = new jpo(activity.getApplicationContext(), dtVar, "open_ad", 4, jpoVar);
        jpoVar2.jpo(activity.findViewById(R.id.content));
        jpo(activity.getApplicationContext(), dtVar, jpoVar2);
        jpo(jpoVar2, dtVar);
        return jpoVar2;
    }

    public static zz jpo(dt dtVar, Activity activity, final com.bytedance.sdk.openadsdk.component.xyk.jpo jpoVar, com.bytedance.sdk.openadsdk.component.zz.jd jdVar) {
        zz zzVar = new zz(activity, dtVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.jpo.jd.1
            @Override // com.bytedance.sdk.openadsdk.core.wqx.jd, com.bytedance.sdk.openadsdk.core.wqx.wqx
            public void jpo(View view, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, boolean z10) {
                HashMap map = new HashMap();
                map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(jpoVar.wqx()));
                jpo(map);
                super.jpo(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        zzVar.jpo(jdVar);
        jpo(activity.getApplicationContext(), dtVar, zzVar);
        jpo(zzVar, dtVar);
        return zzVar;
    }

    public static void jpo(com.bytedance.sdk.openadsdk.core.wqx.jd jdVar, dt dtVar) {
        HashMap map = new HashMap();
        map.put("click_area", Integer.valueOf(dtVar.ya()));
        map.put("openad_creative_type", dt.my(dtVar) ? "video_normal_ad" : "image_normal_ad");
        map.put("click_scence", Integer.valueOf(rv.wqx(dtVar) ? 3 : 1));
        jdVar.jpo(map);
    }

    private static void jpo(Context context, dt dtVar, com.bytedance.sdk.openadsdk.core.wqx.jd jdVar) {
        if (dtVar == null || dtVar.pzk() != 4) {
            return;
        }
        jdVar.jpo(qk.jpo(context, "open_ad"));
    }
}
