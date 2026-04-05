package ee;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final e f54180d = new e(-3, C.TIME_UNSET, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f54181a;

    /* renamed from: b, reason: collision with root package name */
    public final long f54182b;

    /* renamed from: c, reason: collision with root package name */
    public final long f54183c;

    public e(int i10, long j10, long j11) {
        this.f54181a = i10;
        this.f54182b = j10;
        this.f54183c = j11;
    }

    public static e overestimatedResult(long j10, long j11) {
        return new e(-1, j10, j11);
    }

    public static e targetFoundResult(long j10) {
        return new e(0, C.TIME_UNSET, j10);
    }

    public static e underestimatedResult(long j10, long j11) {
        return new e(-2, j10, j11);
    }
}
