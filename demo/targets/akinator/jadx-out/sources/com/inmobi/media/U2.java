package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class U2 {

    /* renamed from: a, reason: collision with root package name */
    public final Config f32340a;

    /* renamed from: b, reason: collision with root package name */
    public final P2 f32341b;

    public U2(Config config, P2 p22) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        this.f32340a = config;
        this.f32341b = p22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U2)) {
            return false;
        }
        U2 u22 = (U2) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f32340a, u22.f32340a) && kotlin.jvm.internal.e0.areEqual(this.f32341b, u22.f32341b);
    }

    public final int hashCode() {
        int iHashCode = this.f32340a.hashCode() * 31;
        P2 p22 = this.f32341b;
        return iHashCode + (p22 == null ? 0 : p22.hashCode());
    }

    public final String toString() {
        return "ConfigFetchInputs(config=" + this.f32340a + ", listener=" + this.f32341b + ')';
    }
}
