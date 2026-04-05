package com.bytedance.sdk.openadsdk.hmu.jd;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.hmu.jd.my;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends jd {

    /* renamed from: cm, reason: collision with root package name */
    private int f21164cm;

    public wqx(Integer num, View view, dt dtVar, my.jpo jpoVar) {
        super(num, view, dtVar, 1000, jpoVar);
        this.f21164cm = -1;
        jd(view);
    }

    @Override // com.bytedance.sdk.openadsdk.hmu.jd.jd
    public void cm() {
        super.cm();
    }

    @Override // com.bytedance.sdk.openadsdk.hmu.jd.jd
    public void jd(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.hmu.jd.jd
    public int jj() {
        dt dtVar = this.f21158jd;
        return (dtVar != null && dtVar.va() && this.f21158jd.cxb() == 1) ? 1000 : 100;
    }

    @Override // com.bytedance.sdk.openadsdk.hmu.jd.jd
    public boolean wqx() {
        WeakReference<View> weakReference = this.jpo;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        View view = this.jpo.get();
        if (this.f21164cm == -1) {
            jd(view);
        }
        return jj.jpo(view, this.f21164cm == 1, this.f21158jd.jp());
    }

    private void jd(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.f21164cm = width * height >= 242500 ? 1 : 0;
        }
    }
}
