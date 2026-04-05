package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Gc {

    /* renamed from: a, reason: collision with root package name */
    public final int f31827a;

    public Gc(int i10) {
        this.f31827a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Gc) && this.f31827a == ((Gc) obj).f31827a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31827a);
    }

    public final String toString() {
        return e3.g.m(new StringBuilder("RenderViewTelemetryData(maxTemplateEvents="), this.f31827a, ')');
    }
}
