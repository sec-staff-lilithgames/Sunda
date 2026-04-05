package com.explorestack.protobuf;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.explorestack.protobuf.Descriptors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g5 {

    /* renamed from: a, reason: collision with root package name */
    public final Descriptors.Descriptor f22160a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22161b;

    public g5(Descriptors.Descriptor descriptor, int i10) {
        this.f22160a = descriptor;
        this.f22161b = i10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj;
        return this.f22160a == g5Var.f22160a && this.f22161b == g5Var.f22161b;
    }

    public int hashCode() {
        return (this.f22160a.hashCode() * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f22161b;
    }
}
