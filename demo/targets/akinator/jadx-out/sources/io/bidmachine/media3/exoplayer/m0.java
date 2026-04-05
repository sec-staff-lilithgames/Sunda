package io.bidmachine.media3.exoplayer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m0 implements r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f61419a;

    public m0(o0 o0Var) {
        this.f61419a = o0Var;
    }

    @Override // io.bidmachine.media3.exoplayer.r1
    public void onSleep() {
        this.f61419a.Q = true;
    }

    @Override // io.bidmachine.media3.exoplayer.r1
    public void onWakeup() {
        o0 o0Var = this.f61419a;
        if (o0Var.f61465z || o0Var.R) {
            o0Var.f61449j.sendEmptyMessage(2);
        }
    }
}
