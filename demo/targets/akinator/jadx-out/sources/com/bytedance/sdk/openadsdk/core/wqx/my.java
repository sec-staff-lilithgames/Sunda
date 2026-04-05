package com.bytedance.sdk.openadsdk.core.wqx;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.wqx.wqx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class my extends jpo {
    public my(Context context, dt dtVar, String str, int i10) {
        super(context, dtVar, str, i10);
    }

    public abstract void jpo(View view, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, int i10, int i11, int i12, boolean z10);

    @Override // com.bytedance.sdk.openadsdk.core.wqx.jpo, com.bytedance.sdk.openadsdk.core.wqx.jd, com.bytedance.sdk.openadsdk.core.wqx.wqx
    public void jpo(View view, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, boolean z10) {
        if (jpo(view, z10)) {
            jpo(view, f10, f11, f12, f13, sparseArray, this.pdm, this.f21013se, this.f21008hx, z10);
        }
        super.jpo(view, f10, f11, f12, f13, sparseArray, z10);
    }
}
