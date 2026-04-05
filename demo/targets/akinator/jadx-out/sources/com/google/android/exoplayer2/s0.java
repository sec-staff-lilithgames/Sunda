package com.google.android.exoplayer2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s0 implements y2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f28013a;

    public s0(u0 u0Var) {
        this.f28013a = u0Var;
    }

    @Override // com.google.android.exoplayer2.y2
    public void onSleep() {
        this.f28013a.J = true;
    }

    @Override // com.google.android.exoplayer2.y2
    public void onWakeup() {
        this.f28013a.f28063j.sendEmptyMessage(2);
    }
}
