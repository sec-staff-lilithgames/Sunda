package com.fyber.inneractive.sdk.config;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f23425a;

    public z(a0 a0Var) {
        this.f23425a = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23425a.f23232a.K = new com.fyber.inneractive.sdk.measurement.e();
        a0 a0Var = this.f23425a;
        com.fyber.inneractive.sdk.measurement.e eVar = a0Var.f23232a.K;
        Context context = a0Var.f23233b;
        if (eVar.f24004a) {
            return;
        }
        eVar.f24004a = true;
        com.fyber.inneractive.sdk.util.r.f26804b.post(new com.fyber.inneractive.sdk.measurement.d(eVar, context));
    }
}
