package ao;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u1 implements o1 {

    /* renamed from: b, reason: collision with root package name */
    public int f7828b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7829c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v1 f7830e;

    public u1(v1 v1Var) {
        this.f7830e = v1Var;
    }

    public final void a() {
        if (this.f7829c) {
            return;
        }
        v1 v1Var = this.f7830e;
        v1Var.f7854g.downstreamFormatChanged(gn.x0.getTrackType(v1Var.f7859l.f60665o), v1Var.f7859l, 0, null, 0L);
        this.f7829c = true;
    }

    @Override // ao.o1
    public boolean isReady() {
        return this.f7830e.f7861n;
    }

    @Override // ao.o1
    public void maybeThrowError() throws IOException {
        v1 v1Var = this.f7830e;
        if (v1Var.f7860m) {
            return;
        }
        v1Var.f7858k.maybeThrowError();
    }

    @Override // ao.o1
    public int readData(io.bidmachine.media3.exoplayer.r0 r0Var, nn.g gVar, int i10) {
        a();
        v1 v1Var = this.f7830e;
        boolean z10 = v1Var.f7861n;
        if (z10 && v1Var.f7862o == null) {
            this.f7828b = 2;
        }
        int i11 = this.f7828b;
        if (i11 == 2) {
            gVar.addFlag(4);
            return -4;
        }
        if ((i10 & 2) != 0 || i11 == 0) {
            r0Var.f61543b = v1Var.f7859l;
            this.f7828b = 1;
            return -5;
        }
        if (!z10) {
            return -3;
        }
        io.bidmachine.media3.common.util.a.checkNotNull(v1Var.f7862o);
        gVar.addFlag(1);
        gVar.f77082h = 0L;
        if ((i10 & 4) == 0) {
            gVar.ensureSpaceForWrite(v1Var.f7863p);
            gVar.f77080f.put(v1Var.f7862o, 0, v1Var.f7863p);
        }
        if ((i10 & 1) == 0) {
            this.f7828b = 2;
        }
        return -4;
    }

    public void reset() {
        if (this.f7828b == 2) {
            this.f7828b = 1;
        }
    }

    @Override // ao.o1
    public int skipData(long j10) {
        a();
        if (j10 <= 0 || this.f7828b == 2) {
            return 0;
        }
        this.f7828b = 2;
        return 1;
    }
}
