package com.ironsource;

import com.ironsource.C3385p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    private C3385p0.a f34545a;

    public H(C3385p0.a performance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(performance, "performance");
        this.f34545a = performance;
    }

    public final C3385p0.a a() {
        return this.f34545a;
    }

    public final C3385p0.a b() {
        return this.f34545a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof H) && this.f34545a == ((H) obj).f34545a;
    }

    public int hashCode() {
        return this.f34545a.hashCode();
    }

    public String toString() {
        return "AdInstancePerformance(performance=" + this.f34545a + ")";
    }

    public final H a(C3385p0.a performance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(performance, "performance");
        return new H(performance);
    }

    public final void b(C3385p0.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<set-?>");
        this.f34545a = aVar;
    }

    public static /* synthetic */ H a(H h10, C3385p0.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = h10.f34545a;
        }
        return h10.a(aVar);
    }
}
