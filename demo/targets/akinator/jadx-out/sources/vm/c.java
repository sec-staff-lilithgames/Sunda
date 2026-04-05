package vm;

import io.bidmachine.iab.vast.activity.VastView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VastView f89307b;

    public c(VastView vastView) {
        this.f89307b = vastView;
    }

    @Override // java.lang.Runnable
    public void run() {
        VastView vastView = this.f89307b;
        if (vastView.isPlaybackStarted()) {
            vastView.s();
        }
    }
}
