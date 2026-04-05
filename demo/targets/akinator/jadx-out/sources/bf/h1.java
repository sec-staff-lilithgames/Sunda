package bf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h1 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public int f9265a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1 f9267c;

    public h1(i1 i1Var) {
        this.f9267c = i1Var;
    }

    public final void a() {
        if (this.f9266b) {
            return;
        }
        i1 i1Var = this.f9267c;
        i1Var.f9280g.downstreamFormatChanged(com.google.android.exoplayer2.util.l0.getTrackType(i1Var.f9285l.f28802n), i1Var.f9285l, 0, null, 0L);
        this.f9266b = true;
    }

    @Override // bf.b1
    public boolean isReady() {
        return this.f9267c.f9287n;
    }

    @Override // bf.b1
    public void maybeThrowError() throws IOException {
        i1 i1Var = this.f9267c;
        if (i1Var.f9286m) {
            return;
        }
        i1Var.f9284k.maybeThrowError();
    }

    @Override // bf.b1
    public int readData(com.google.android.exoplayer2.a1 a1Var, ce.h hVar, int i10) {
        a();
        i1 i1Var = this.f9267c;
        boolean z10 = i1Var.f9287n;
        if (z10 && i1Var.f9288o == null) {
            this.f9265a = 2;
        }
        int i11 = this.f9265a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        }
        if ((i10 & 2) != 0 || i11 == 0) {
            a1Var.f27030b = i1Var.f9285l;
            this.f9265a = 1;
            return -5;
        }
        if (!z10) {
            return -3;
        }
        com.google.android.exoplayer2.util.a.checkNotNull(i1Var.f9288o);
        hVar.addFlag(1);
        hVar.f12239g = 0L;
        if ((i10 & 4) == 0) {
            hVar.ensureSpaceForWrite(i1Var.f9289p);
            hVar.f12237e.put(i1Var.f9288o, 0, i1Var.f9289p);
        }
        if ((i10 & 1) == 0) {
            this.f9265a = 2;
        }
        return -4;
    }

    public void reset() {
        if (this.f9265a == 2) {
            this.f9265a = 1;
        }
    }

    @Override // bf.b1
    public int skipData(long j10) {
        a();
        if (j10 <= 0 || this.f9265a == 2) {
            return 0;
        }
        this.f9265a = 2;
        return 1;
    }
}
