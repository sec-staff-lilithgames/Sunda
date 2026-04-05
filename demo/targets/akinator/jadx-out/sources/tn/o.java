package tn;

import ao.o1;
import io.bidmachine.media3.exoplayer.r0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o implements o1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f87273b;

    /* renamed from: c, reason: collision with root package name */
    public final r f87274c;

    /* renamed from: e, reason: collision with root package name */
    public int f87275e = -1;

    public o(r rVar, int i10) {
        this.f87274c = rVar;
        this.f87273b = i10;
    }

    public final boolean a() {
        int i10 = this.f87275e;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    public void bindSampleQueue() {
        io.bidmachine.media3.common.util.a.checkArgument(this.f87275e == -1);
        this.f87275e = this.f87274c.bindSampleQueueToSampleStream(this.f87273b);
    }

    @Override // ao.o1
    public boolean isReady() {
        if (this.f87275e != -3) {
            return a() && this.f87274c.isReady(this.f87275e);
        }
        return true;
    }

    @Override // ao.o1
    public void maybeThrowError() throws IOException {
        int i10 = this.f87275e;
        r rVar = this.f87274c;
        if (i10 == -2) {
            throw new u(rVar.getTrackGroups().get(this.f87273b).getFormat(0).f60665o);
        }
        if (i10 == -1) {
            rVar.maybeThrowError();
        } else if (i10 != -3) {
            rVar.maybeThrowError(i10);
        }
    }

    @Override // ao.o1
    public int readData(r0 r0Var, nn.g gVar, int i10) {
        if (this.f87275e == -3) {
            gVar.addFlag(4);
            return -4;
        }
        if (a()) {
            return this.f87274c.readData(this.f87275e, r0Var, gVar, i10);
        }
        return -3;
    }

    @Override // ao.o1
    public int skipData(long j10) {
        if (a()) {
            return this.f87274c.skipData(this.f87275e, j10);
        }
        return 0;
    }

    public void unbindSampleQueue() {
        if (this.f87275e != -1) {
            this.f87274c.unbindSampleQueue(this.f87273b);
            this.f87275e = -1;
        }
    }
}
