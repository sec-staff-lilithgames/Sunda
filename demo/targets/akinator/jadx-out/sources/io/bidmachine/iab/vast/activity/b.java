package io.bidmachine.iab.vast.activity;

import io.bidmachine.iab.vast.activity.VastView;
import io.bidmachine.iab.vast.b0;
import io.bidmachine.iab.vast.t;
import um.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements vm.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VastView f60474a;

    public b(VastView vastView) {
        this.f60474a = vastView;
    }

    @Override // vm.b
    public void a(int i10, int i11, float f10) {
        m mVar;
        VastView vastView = this.f60474a;
        VastView.B b10 = vastView.f60453w;
        if (b10.f60465k || b10.f60458c == 0.0f) {
            return;
        }
        t tVar = vastView.f60452v;
        if (tVar.getVideoType() != b0.f60482c || tVar.getMaxDurationMillis() <= 0) {
            float f11 = vastView.f60453w.f60458c * 1000.0f;
            float f12 = i11;
            float f13 = f11 - f12;
            int i12 = (int) ((f12 * 100.0f) / f11);
            io.bidmachine.iab.vast.e.d(vastView.f60424b, "Skip percent: %s", Integer.valueOf(i12));
            if (i12 < 100 && (mVar = vastView.f60439j) != null) {
                mVar.changePercentage(i12, (int) Math.ceil(f13 / 1000.0d));
            }
            if (f13 <= 0.0f) {
                VastView.B b11 = vastView.f60453w;
                b11.f60458c = 0.0f;
                b11.f60465k = true;
                vastView.setCloseControlsVisible(true);
            }
        }
    }
}
