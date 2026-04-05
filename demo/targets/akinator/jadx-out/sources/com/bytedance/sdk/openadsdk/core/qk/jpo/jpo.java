package com.bytedance.sdk.openadsdk.core.qk.jpo;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.jd.ju;
import com.bytedance.sdk.openadsdk.core.model.hna;
import com.bytedance.sdk.openadsdk.core.wqx.wqx;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends wqx implements com.bytedance.sdk.component.adexpress.dynamic.jj.jpo {

    /* renamed from: jd, reason: collision with root package name */
    private ju f20837jd;
    protected WeakReference<View> jpo;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.jj.jpo
    public void jpo(ju juVar) {
        this.f20837jd = juVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.jj.jpo
    public void jpo(View view) {
        this.jpo = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wqx.wqx
    public void jpo(View view, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, boolean z10) {
        jpo(view, ((Integer) view.getTag()).intValue(), f10, f11, f12, f13, sparseArray);
    }

    private void jpo(View view, int i10, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray) {
        if (this.f20837jd != null) {
            String strValueOf = "";
            try {
                int i11 = com.bytedance.sdk.component.adexpress.dynamic.jpo.f18273rq;
                if (view.getTag(i11) != null) {
                    strValueOf = String.valueOf(view.getTag(i11));
                }
            } catch (Exception unused) {
            }
            this.f20837jd.jpo(view, i10, new hna.jpo().cm(f10).wqx(f11).jd(f12).jpo(f13).jd(this.hmu).jpo(this.f21010nq).jpo(sparseArray).jpo(this.f21015uu).jpo(strValueOf).jpo());
        }
    }
}
