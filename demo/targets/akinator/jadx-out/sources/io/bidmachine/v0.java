package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f62032b;

    public v0(a1 a1Var) {
        this.f62032b = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        a1 a1Var = this.f62032b;
        if (a1Var.f59836b.listener != null) {
            a1Var.f59836b.log("notify AdLoaded");
            a1Var.f59836b.listener.onAdLoaded(a1Var.f59836b);
        }
    }
}
