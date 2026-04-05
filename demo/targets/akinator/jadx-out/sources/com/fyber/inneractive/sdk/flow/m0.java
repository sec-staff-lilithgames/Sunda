package com.fyber.inneractive.sdk.flow;

import android.os.CountDownTimer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m0 extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f23679a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p0 p0Var, long j10) {
        super(j10, 1000L);
        this.f23679a = p0Var;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        m0 m0Var = this.f23679a.f23775v;
        if (m0Var != null) {
            m0Var.cancel();
        }
        this.f23679a.d(false);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
        int i10 = ((int) j10) / 1000;
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f23679a.f23764k;
        if (eVar != null) {
            eVar.updateCloseCountdown(i10);
        }
    }
}
