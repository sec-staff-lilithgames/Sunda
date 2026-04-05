package ne;

import com.google.android.exoplayer2.util.n1;
import ee.a0;
import ee.i0;
import ee.q;
import ee.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f76016a;

    /* renamed from: b, reason: collision with root package name */
    public final a0.a f76017b;

    /* renamed from: c, reason: collision with root package name */
    public long f76018c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f76019d = -1;

    public c(a0 a0Var, a0.a aVar) {
        this.f76016a = a0Var;
        this.f76017b = aVar;
    }

    @Override // ne.h
    public i0 createSeekMap() {
        com.google.android.exoplayer2.util.a.checkState(this.f76018c != -1);
        return new z(this.f76016a, this.f76018c);
    }

    @Override // ne.h
    public long read(q qVar) {
        long j10 = this.f76019d;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f76019d = -1L;
        return j11;
    }

    public void setFirstFrameOffset(long j10) {
        this.f76018c = j10;
    }

    @Override // ne.h
    public void startSeek(long j10) {
        long[] jArr = this.f76017b.f54165a;
        this.f76019d = jArr[n1.binarySearchFloor(jArr, j10, true, true)];
    }
}
