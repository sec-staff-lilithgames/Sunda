package com.fyber.inneractive.sdk.protobuf;

import com.applovin.shadow.okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f26383a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26384b;

    public g0(int i10, Object obj) {
        this.f26383a = obj;
        this.f26384b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f26383a == g0Var.f26383a && this.f26384b == g0Var.f26384b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f26383a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f26384b;
    }
}
