package ko;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final m f71704d = new m(-3, C.TIME_UNSET, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f71705a;

    /* renamed from: b, reason: collision with root package name */
    public final long f71706b;

    /* renamed from: c, reason: collision with root package name */
    public final long f71707c;

    public m(int i10, long j10, long j11) {
        this.f71705a = i10;
        this.f71706b = j10;
        this.f71707c = j11;
    }

    public static m overestimatedResult(long j10, long j11) {
        return new m(-1, j10, j11);
    }

    public static m targetFoundResult(long j10) {
        return new m(0, C.TIME_UNSET, j10);
    }

    public static m underestimatedResult(long j10, long j11) {
        return new m(-2, j10, j11);
    }
}
