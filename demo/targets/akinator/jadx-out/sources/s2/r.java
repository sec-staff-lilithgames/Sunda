package s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class r {
    public static final long IntOffset(int i10, int i11) {
        return q.m6924constructorimpl((i11 & 4294967295L) | (i10 << 32));
    }

    /* renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m6940lerp81ZRxRo(long j10, long j11, float f10) {
        return IntOffset(t2.a.lerp(q.m6930getXimpl(j10), q.m6930getXimpl(j11), f10), t2.a.lerp(q.m6931getYimpl(j10), q.m6931getYimpl(j11), f10));
    }

    /* renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m6941minusNvtHpc(long j10, long j11) {
        return i1.i.Offset(i1.h.m4185getXimpl(j10) - q.m6930getXimpl(j11), i1.h.m4186getYimpl(j10) - q.m6931getYimpl(j11));
    }

    /* renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m6942minusoCl6YwE(long j10, long j11) {
        return i1.i.Offset(q.m6930getXimpl(j10) - i1.h.m4185getXimpl(j11), q.m6931getYimpl(j10) - i1.h.m4186getYimpl(j11));
    }

    /* renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m6943plusNvtHpc(long j10, long j11) {
        return i1.i.Offset(i1.h.m4185getXimpl(j10) + q.m6930getXimpl(j11), i1.h.m4186getYimpl(j10) + q.m6931getYimpl(j11));
    }

    /* renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m6944plusoCl6YwE(long j10, long j11) {
        return i1.i.Offset(i1.h.m4185getXimpl(j11) + q.m6930getXimpl(j10), i1.h.m4186getYimpl(j11) + q.m6931getYimpl(j10));
    }

    /* renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m6945roundk4lQ0M(long j10) {
        return IntOffset(mv.d.roundToInt(i1.h.m4185getXimpl(j10)), mv.d.roundToInt(i1.h.m4186getYimpl(j10)));
    }

    /* renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m6946toOffsetgyyYBs(long j10) {
        return i1.i.Offset(q.m6930getXimpl(j10), q.m6931getYimpl(j10));
    }
}
