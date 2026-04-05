package com.applovin.adview;

import androidx.lifecycle.a1;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import com.applovin.impl.m2;
import com.applovin.impl.v1;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AppLovinFullscreenAdViewObserver implements a1 {

    /* renamed from: a, reason: collision with root package name */
    private final k0 f13375a;

    /* renamed from: b, reason: collision with root package name */
    private m2 f13376b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f13377c = new AtomicBoolean(true);

    /* renamed from: d, reason: collision with root package name */
    private v1 f13378d;

    public AppLovinFullscreenAdViewObserver(k0 k0Var, m2 m2Var) {
        this.f13375a = k0Var;
        this.f13376b = m2Var;
        k0Var.addObserver(this);
    }

    @androidx.lifecycle.v1(i0.ON_DESTROY)
    public void onDestroy() {
        this.f13375a.removeObserver(this);
        m2 m2Var = this.f13376b;
        if (m2Var != null) {
            m2Var.a();
            this.f13376b = null;
        }
        v1 v1Var = this.f13378d;
        if (v1Var != null) {
            v1Var.a("lifecycle_on_destroy");
            this.f13378d.q();
            this.f13378d = null;
        }
    }

    @androidx.lifecycle.v1(i0.ON_PAUSE)
    public void onPause() {
        v1 v1Var = this.f13378d;
        if (v1Var != null) {
            v1Var.r();
            this.f13378d.u();
        }
    }

    @androidx.lifecycle.v1(i0.ON_RESUME)
    public void onResume() {
        v1 v1Var;
        if (this.f13377c.getAndSet(false) || (v1Var = this.f13378d) == null) {
            return;
        }
        v1Var.s();
        this.f13378d.b(0L);
    }

    @androidx.lifecycle.v1(i0.ON_STOP)
    public void onStop() {
        v1 v1Var = this.f13378d;
        if (v1Var != null) {
            v1Var.t();
        }
    }

    public void setPresenter(v1 v1Var) {
        this.f13378d = v1Var;
    }
}
