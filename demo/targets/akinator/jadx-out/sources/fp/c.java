package fp;

import io.bidmachine.media3.common.util.a1;
import ko.a0;
import ko.j0;
import ko.k0;
import ko.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f55943a;

    /* renamed from: b, reason: collision with root package name */
    public final k0.a f55944b;

    /* renamed from: c, reason: collision with root package name */
    public long f55945c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f55946d = -1;

    public c(k0 k0Var, k0.a aVar) {
        this.f55943a = k0Var;
        this.f55944b = aVar;
    }

    @Override // fp.h
    public y0 createSeekMap() {
        io.bidmachine.media3.common.util.a.checkState(this.f55945c != -1);
        return new j0(this.f55943a, this.f55945c);
    }

    @Override // fp.h
    public long read(a0 a0Var) {
        long j10 = this.f55946d;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f55946d = -1L;
        return j11;
    }

    public void setFirstFrameOffset(long j10) {
        this.f55945c = j10;
    }

    @Override // fp.h
    public void startSeek(long j10) {
        long[] jArr = this.f55944b.f71701a;
        this.f55946d = jArr[a1.binarySearchFloor(jArr, j10, true, true)];
    }
}
