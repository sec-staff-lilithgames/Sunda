package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public InneractiveAdRequest f23944a;

    /* renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.e f23945b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f23946c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.s0 f23947d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23948e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23949f = false;

    public x(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f23947d = s0Var;
        this.f23946c = rVar;
    }

    public com.fyber.inneractive.sdk.web.v0 a() {
        return null;
    }

    public com.fyber.inneractive.sdk.response.e b() {
        return this.f23945b;
    }

    public boolean c() {
        com.fyber.inneractive.sdk.config.s0 s0Var = this.f23947d;
        if (s0Var == null) {
            IAlog.f("%s : isFullscreenAd() called with unit config null", IAlog.a(this));
            return false;
        }
        return false;
    }

    public boolean d() {
        return false;
    }

    public abstract void destroy();

    public abstract boolean e();

    public abstract boolean isVideoAd();

    public void a(String str) {
    }

    public boolean a(boolean z10, com.fyber.inneractive.sdk.util.g gVar) {
        return false;
    }

    public void f() {
    }
}
