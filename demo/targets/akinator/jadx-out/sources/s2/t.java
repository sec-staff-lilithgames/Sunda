package s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t {
    /* renamed from: IntRect-E1MhUcY, reason: not valid java name */
    public static final s m6960IntRectE1MhUcY(long j10, long j11) {
        return new s(q.m6930getXimpl(j10), q.m6931getYimpl(j10), q.m6930getXimpl(j11), q.m6931getYimpl(j11));
    }

    /* renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final s m6961IntRectVbeCjmY(long j10, long j11) {
        return new s(q.m6930getXimpl(j10), q.m6931getYimpl(j10), v.m6972getWidthimpl(j11) + q.m6930getXimpl(j10), v.m6971getHeightimpl(j11) + q.m6931getYimpl(j10));
    }

    /* renamed from: IntRect-ar5cAso, reason: not valid java name */
    public static final s m6962IntRectar5cAso(long j10, int i10) {
        return new s(q.m6930getXimpl(j10) - i10, q.m6931getYimpl(j10) - i10, q.m6930getXimpl(j10) + i10, q.m6931getYimpl(j10) + i10);
    }

    public static final s lerp(s start, s stop, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.e0.checkNotNullParameter(stop, "stop");
        return new s(t2.a.lerp(start.getLeft(), stop.getLeft(), f10), t2.a.lerp(start.getTop(), stop.getTop(), f10), t2.a.lerp(start.getRight(), stop.getRight(), f10), t2.a.lerp(start.getBottom(), stop.getBottom(), f10));
    }
}
