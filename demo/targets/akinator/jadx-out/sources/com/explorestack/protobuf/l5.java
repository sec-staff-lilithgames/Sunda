package com.explorestack.protobuf;

import com.applovin.shadow.okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l5 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f22346a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22347b;

    public l5(MessageLite messageLite, int i10) {
        this.f22346a = messageLite;
        this.f22347b = i10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l5)) {
            return false;
        }
        l5 l5Var = (l5) obj;
        return this.f22346a == l5Var.f22346a && this.f22347b == l5Var.f22347b;
    }

    public int hashCode() {
        return (System.identityHashCode(this.f22346a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f22347b;
    }
}
