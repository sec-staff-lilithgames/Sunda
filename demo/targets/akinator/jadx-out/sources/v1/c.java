package v1;

import i1.h;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f88849a;

    /* renamed from: b, reason: collision with root package name */
    public final long f88850b;

    public c(long j10, long j11, u uVar) {
        this.f88849a = j10;
        this.f88850b = j11;
    }

    /* renamed from: copy-3MmeM6k$default, reason: not valid java name */
    public static /* synthetic */ c m7420copy3MmeM6k$default(c cVar, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = cVar.f88849a;
        }
        if ((i10 & 2) != 0) {
            j11 = cVar.f88850b;
        }
        return cVar.m7422copy3MmeM6k(j10, j11);
    }

    /* renamed from: component1-F1C5BW0, reason: not valid java name */
    public final long m7421component1F1C5BW0() {
        return this.f88849a;
    }

    public final long component2() {
        return this.f88850b;
    }

    /* renamed from: copy-3MmeM6k, reason: not valid java name */
    public final c m7422copy3MmeM6k(long j10, long j11) {
        return new c(j10, j11, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.m4182equalsimpl0(this.f88849a, cVar.f88849a) && this.f88850b == cVar.f88850b;
    }

    /* renamed from: getPoint-F1C5BW0, reason: not valid java name */
    public final long m7423getPointF1C5BW0() {
        return this.f88849a;
    }

    public final long getTime() {
        return this.f88850b;
    }

    public int hashCode() {
        return Long.hashCode(this.f88850b) + (h.m4187hashCodeimpl(this.f88849a) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PointAtTime(point=");
        sb2.append((Object) h.m4193toStringimpl(this.f88849a));
        sb2.append(", time=");
        return e3.g.n(sb2, this.f88850b, ')');
    }
}
