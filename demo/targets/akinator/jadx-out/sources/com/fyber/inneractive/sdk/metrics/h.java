package com.fyber.inneractive.sdk.metrics;

import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f24059a = UUID.randomUUID().toString();

    /* renamed from: b, reason: collision with root package name */
    public final String f24060b;

    public h(String str) {
        this.f24060b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return this.f24059a.equals(((h) obj).f24059a);
    }

    public final int hashCode() {
        return this.f24059a.hashCode();
    }
}
