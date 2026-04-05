package ko;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.c0 f71736a;

    /* renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.c0 f71737b;

    /* renamed from: c, reason: collision with root package name */
    public long f71738c;

    public q0(long[] jArr, long[] jArr2, long j10) {
        io.bidmachine.media3.common.util.a.checkArgument(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f71736a = new io.bidmachine.media3.common.util.c0(length);
            this.f71737b = new io.bidmachine.media3.common.util.c0(length);
        } else {
            int i10 = length + 1;
            io.bidmachine.media3.common.util.c0 c0Var = new io.bidmachine.media3.common.util.c0(i10);
            this.f71736a = c0Var;
            io.bidmachine.media3.common.util.c0 c0Var2 = new io.bidmachine.media3.common.util.c0(i10);
            this.f71737b = c0Var2;
            c0Var.add(0L);
            c0Var2.add(0L);
        }
        this.f71736a.addAll(jArr);
        this.f71737b.addAll(jArr2);
        this.f71738c = j10;
    }

    public void addSeekPoint(long j10, long j11) {
        io.bidmachine.media3.common.util.c0 c0Var = this.f71737b;
        int size = c0Var.size();
        io.bidmachine.media3.common.util.c0 c0Var2 = this.f71736a;
        if (size == 0 && j10 > 0) {
            c0Var2.add(0L);
            c0Var.add(0L);
        }
        c0Var2.add(j11);
        c0Var.add(j10);
    }

    @Override // ko.y0
    public long getDurationUs() {
        return this.f71738c;
    }

    @Override // ko.y0
    public w0 getSeekPoints(long j10) {
        io.bidmachine.media3.common.util.c0 c0Var = this.f71737b;
        if (c0Var.size() == 0) {
            return new w0(z0.f71810c);
        }
        int iBinarySearchFloor = io.bidmachine.media3.common.util.a1.binarySearchFloor(c0Var, j10, true, true);
        long j11 = c0Var.get(iBinarySearchFloor);
        io.bidmachine.media3.common.util.c0 c0Var2 = this.f71736a;
        z0 z0Var = new z0(j11, c0Var2.get(iBinarySearchFloor));
        if (z0Var.f71811a == j10 || iBinarySearchFloor == c0Var.size() - 1) {
            return new w0(z0Var);
        }
        int i10 = iBinarySearchFloor + 1;
        return new w0(z0Var, new z0(c0Var.get(i10), c0Var2.get(i10)));
    }

    public long getTimeUs(long j10) {
        io.bidmachine.media3.common.util.c0 c0Var = this.f71737b;
        return c0Var.size() == 0 ? C.TIME_UNSET : c0Var.get(io.bidmachine.media3.common.util.a1.binarySearchFloor(this.f71736a, j10, true, true));
    }

    @Override // ko.y0
    public boolean isSeekable() {
        return this.f71737b.size() > 0;
    }

    public boolean isTimeUsInIndex(long j10, long j11) {
        io.bidmachine.media3.common.util.c0 c0Var = this.f71737b;
        return c0Var.size() != 0 && j10 - c0Var.get(c0Var.size() - 1) < j11;
    }

    public void setDurationUs(long j10) {
        this.f71738c = j10;
    }
}
