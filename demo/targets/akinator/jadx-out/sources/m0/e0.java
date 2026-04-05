package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f73695a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f73696b;

    /* renamed from: c, reason: collision with root package name */
    public static final e2.t0 f73697c = new e2.t0("SelectionHandleInfo", null, 2, null);

    static {
        float f10 = 25;
        f73695a = s2.i.m6817constructorimpl(f10);
        f73696b = s2.i.m6817constructorimpl(f10);
    }

    /* renamed from: getAdjustedCoordinates-k-4lQ0M, reason: not valid java name */
    public static final long m5503getAdjustedCoordinatesk4lQ0M(long j10) {
        return i1.i.Offset(i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10) - 1.0f);
    }

    public static final float getHandleHeight() {
        return f73696b;
    }

    public static final float getHandleWidth() {
        return f73695a;
    }

    public static final e2.t0 getSelectionHandleInfoKey() {
        return f73697c;
    }
}
