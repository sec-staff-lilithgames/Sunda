package p2;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f80671a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80672b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80673c;

    public d(Object span, int i10, int i11) {
        e0.checkNotNullParameter(span, "span");
        this.f80671a = span;
        this.f80672b = i10;
        this.f80673c = i11;
    }

    public static /* synthetic */ d copy$default(d dVar, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            obj = dVar.f80671a;
        }
        if ((i12 & 2) != 0) {
            i10 = dVar.f80672b;
        }
        if ((i12 & 4) != 0) {
            i11 = dVar.f80673c;
        }
        return dVar.copy(obj, i10, i11);
    }

    public final Object component1() {
        return this.f80671a;
    }

    public final int component2() {
        return this.f80672b;
    }

    public final int component3() {
        return this.f80673c;
    }

    public final d copy(Object span, int i10, int i11) {
        e0.checkNotNullParameter(span, "span");
        return new d(span, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return e0.areEqual(this.f80671a, dVar.f80671a) && this.f80672b == dVar.f80672b && this.f80673c == dVar.f80673c;
    }

    public final int getEnd() {
        return this.f80673c;
    }

    public final Object getSpan() {
        return this.f80671a;
    }

    public final int getStart() {
        return this.f80672b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f80673c) + e3.g.d(this.f80672b, this.f80671a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SpanRange(span=");
        sb2.append(this.f80671a);
        sb2.append(", start=");
        sb2.append(this.f80672b);
        sb2.append(", end=");
        return e3.g.m(sb2, this.f80673c, ')');
    }
}
