package io.odeeo.sdk;

import androidx.lifecycle.b1;
import androidx.lifecycle.d1;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public d1 f68124a = new d1(this);

    @Override // androidx.lifecycle.b1, v5.j, f.i0
    public k0 getLifecycle() {
        return this.f68124a;
    }

    public final void onCreate() {
        this.f68124a.markState(j0.f6615c);
        this.f68124a.markState(j0.f6616e);
    }

    public final void onDestroyed() {
        io.odeeo.internal.b2.a.i("onDestroyed", new Object[0]);
        this.f68124a.markState(j0.f6614b);
    }

    public final void onResume() {
        this.f68124a.markState(j0.f6618g);
    }

    public final void onStart() {
        this.f68124a.markState(j0.f6617f);
    }

    public final void setLifecycleRegistry$odeeoSdk_release(d1 newValue) {
        e0.checkNotNullParameter(newValue, "newValue");
        io.odeeo.internal.b2.a.i(e0.stringPlus("setLifecycleRegistry newValue: ", newValue), new Object[0]);
        this.f68124a = newValue;
    }
}
