package vm;

import io.bidmachine.iab.vast.activity.VastView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o implements an.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VastView f89320b;

    public o(VastView vastView) {
        this.f89320b = vastView;
    }

    @Override // an.a
    public void onCloseClick() {
        VastView vastView = this.f89320b;
        vastView.l(vastView.f60454x, vastView.f60452v, qm.b.placeholder("Close button clicked"));
    }

    @Override // an.a
    public void onCountDownFinish() {
    }
}
