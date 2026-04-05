package tv;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f87423a;

    /* renamed from: b, reason: collision with root package name */
    public final long f87424b;

    public b0(Object obj, long j10, kotlin.jvm.internal.u uVar) {
        this.f87423a = obj;
        this.f87424b = j10;
    }

    /* renamed from: copy-RFiDyg4$default, reason: not valid java name */
    public static /* synthetic */ b0 m7148copyRFiDyg4$default(b0 b0Var, Object obj, long j10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = b0Var.f87423a;
        }
        if ((i10 & 2) != 0) {
            j10 = b0Var.f87424b;
        }
        return b0Var.m7150copyRFiDyg4(obj, j10);
    }

    public final Object component1() {
        return this.f87423a;
    }

    /* renamed from: component2-UwyO8pc, reason: not valid java name */
    public final long m7149component2UwyO8pc() {
        return this.f87424b;
    }

    /* renamed from: copy-RFiDyg4, reason: not valid java name */
    public final b0 m7150copyRFiDyg4(Object obj, long j10) {
        return new b0(obj, j10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return e0.areEqual(this.f87423a, b0Var.f87423a) && f.m7189equalsimpl0(this.f87424b, b0Var.f87424b);
    }

    /* renamed from: getDuration-UwyO8pc, reason: not valid java name */
    public final long m7151getDurationUwyO8pc() {
        return this.f87424b;
    }

    public final Object getValue() {
        return this.f87423a;
    }

    public int hashCode() {
        Object obj = this.f87423a;
        return f.m7202hashCodeimpl(this.f87424b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public String toString() {
        return "TimedValue(value=" + this.f87423a + ", duration=" + ((Object) f.m7219toStringimpl(this.f87424b)) + ')';
    }
}
