package com.bytedance.sdk.openadsdk.hmu.jd;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.hmu.jd.my;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk extends jd {

    /* renamed from: cm, reason: collision with root package name */
    private int f21165cm;

    public xyk(Integer num, View view, dt dtVar, my.jpo jpoVar) {
        super(num, view, dtVar, 2000, jpoVar);
        this.f21165cm = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.hmu.jd.jd
    public void cm() {
        super.cm();
    }

    @Override // com.bytedance.sdk.openadsdk.hmu.jd.jd
    /* renamed from: if */
    public boolean mo484if() {
        int i10 = this.f21165cm;
        boolean z10 = i10 == 2 || i10 == 0;
        if (z10) {
            this.wqx.set(false);
        }
        return !z10 || super.mo484if();
    }

    @Override // com.bytedance.sdk.openadsdk.hmu.jd.jd
    public void jd(int i10) {
        if (zz()) {
            return;
        }
        if (i10 == 6 || i10 == 5) {
            this.f21165cm = 0;
            xyk();
        }
        if (i10 == 3 || i10 == 2) {
            this.f21165cm = 2;
            xyk();
        }
        if (this.f21165cm == 1 || i10 != 0) {
            return;
        }
        this.f21165cm = 1;
        jpo();
    }

    @Override // com.bytedance.sdk.openadsdk.hmu.jd.jd
    public int jj() {
        return 200;
    }

    @Override // com.bytedance.sdk.openadsdk.hmu.jd.jd
    public void jpo() {
        if (this.f21165cm != 1) {
            return;
        }
        super.jpo();
    }

    @Override // com.bytedance.sdk.openadsdk.hmu.jd.jd
    public boolean wqx() {
        return jj.jpo(this.jpo.get(), this.f21158jd.jp()) && this.f21165cm == 1;
    }
}
