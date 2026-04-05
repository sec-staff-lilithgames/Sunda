package lm;

import io.bidmachine.iab.vast.activity.VastView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f73393b;

    public a(b bVar) {
        this.f73393b = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        b bVar = this.f73393b;
        VastView vastView = bVar.f73400g;
        if (vastView != null) {
            vastView.destroy();
            bVar.f73400g = null;
        }
    }
}
