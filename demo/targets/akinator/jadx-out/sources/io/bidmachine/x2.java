package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x2 implements v3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y2 f62044a;

    public x2(y2 y2Var) {
        this.f62044a = y2Var;
    }

    @Override // io.bidmachine.v3
    public void onSessionEvent(w3 w3Var) {
        if (w3Var != w3.f62038b) {
            return;
        }
        this.f62044a.b();
    }
}
