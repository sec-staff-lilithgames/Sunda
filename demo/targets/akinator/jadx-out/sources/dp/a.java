package dp;

import ko.r;
import ko.r0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends r implements f {

    /* renamed from: h, reason: collision with root package name */
    public final long f52409h;

    /* renamed from: i, reason: collision with root package name */
    public final int f52410i;

    /* renamed from: j, reason: collision with root package name */
    public final int f52411j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f52412k;

    /* renamed from: l, reason: collision with root package name */
    public final long f52413l;

    public a(long j10, long j11, r0 r0Var, boolean z10) {
        this(j10, j11, r0Var.f71751f, r0Var.f71748c, z10);
    }

    public a copyWithNewDataEndPosition(long j10) {
        return new a(j10, this.f52409h, this.f52410i, this.f52411j, this.f52412k);
    }

    @Override // dp.f
    public int getAverageBitrate() {
        return this.f52410i;
    }

    @Override // dp.f
    public long getDataEndPosition() {
        return this.f52413l;
    }

    @Override // dp.f
    public long getTimeUs(long j10) {
        return getTimeUsAtPosition(j10);
    }

    public a(long j10, long j11, int i10, int i11, boolean z10) {
        super(j10, j11, i10, i11, z10);
        long j12 = j10;
        this.f52409h = j11;
        this.f52410i = i10;
        this.f52411j = i11;
        this.f52412k = z10;
        this.f52413l = j12 == -1 ? -1L : j12;
    }
}
