package io.bidmachine.iab.vast.activity;

import io.bidmachine.iab.vast.activity.VastView;
import io.bidmachine.iab.vast.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements vm.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VastView f60475a;

    public c(VastView vastView) {
        this.f60475a = vastView;
    }

    @Override // vm.b
    public void a(int i10, int i11, float f10) {
        VastView vastView = this.f60475a;
        VastView.B b10 = vastView.f60453w;
        if (b10.f60464j && b10.f60459e == 3) {
            return;
        }
        if (vastView.f60452v.getMaxDurationMillis() > 0 && i11 > vastView.f60452v.getMaxDurationMillis() && vastView.f60452v.getVideoType() == b0.f60482c) {
            vastView.f60453w.f60465k = true;
            vastView.setCloseControlsVisible(true);
        }
        VastView.B b11 = vastView.f60453w;
        String str = vastView.f60424b;
        int i12 = b11.f60459e;
        if (f10 > i12 * 25.0f) {
            if (i12 == 3) {
                io.bidmachine.iab.vast.e.d(str, "Video at third quartile: (%s)", Float.valueOf(f10));
                vastView.o(io.bidmachine.iab.vast.a.f60394g);
                io.bidmachine.iab.vast.f fVar = vastView.f60455y;
                if (fVar != null) {
                    fVar.onVideoThirdQuartile();
                }
            } else if (i12 == 0) {
                io.bidmachine.iab.vast.e.d(str, "Video at start: (%s)", Float.valueOf(f10));
                vastView.o(io.bidmachine.iab.vast.a.f60391c);
                io.bidmachine.iab.vast.f fVar2 = vastView.f60455y;
                if (fVar2 != null) {
                    fVar2.onVideoStarted(i10, vastView.f60453w.f60462h ? 0.0f : 1.0f);
                }
            } else if (i12 == 1) {
                io.bidmachine.iab.vast.e.d(str, "Video at first quartile: (%s)", Float.valueOf(f10));
                vastView.o(io.bidmachine.iab.vast.a.f60392e);
                io.bidmachine.iab.vast.f fVar3 = vastView.f60455y;
                if (fVar3 != null) {
                    fVar3.onVideoFirstQuartile();
                }
            } else if (i12 == 2) {
                io.bidmachine.iab.vast.e.d(str, "Video at midpoint: (%s)", Float.valueOf(f10));
                vastView.o(io.bidmachine.iab.vast.a.f60393f);
                io.bidmachine.iab.vast.f fVar4 = vastView.f60455y;
                if (fVar4 != null) {
                    fVar4.onVideoMidpoint();
                }
            }
            vastView.f60453w.f60459e++;
        }
    }
}
