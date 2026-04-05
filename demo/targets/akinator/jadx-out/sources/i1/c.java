package i1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {
    public static final long CornerRadius(float f10, float f11) {
        return b.m4150constructorimpl((Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    public static /* synthetic */ long CornerRadius$default(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        return CornerRadius(f10, f11);
    }

    /* renamed from: lerp-3Ry4LBc, reason: not valid java name */
    public static final long m4165lerp3Ry4LBc(long j10, long j11, float f10) {
        return CornerRadius(t2.a.lerp(b.m4156getXimpl(j10), b.m4156getXimpl(j11), f10), t2.a.lerp(b.m4157getYimpl(j10), b.m4157getYimpl(j11), f10));
    }
}
