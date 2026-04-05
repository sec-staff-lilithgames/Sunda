package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f62047b;

    public y0(a1 a1Var) {
        this.f62047b = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        a1 a1Var = this.f62047b;
        if (a1Var.f59836b.listener instanceof AdRewardedListener) {
            a1Var.f59836b.log("notify AdRewarded");
            ((AdRewardedListener) a1Var.f59836b.listener).onAdRewarded(a1Var.f59836b);
        }
    }
}
