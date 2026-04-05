package fu;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f56009b;

    /* renamed from: c, reason: collision with root package name */
    public final d[] f56010c;

    /* renamed from: e, reason: collision with root package name */
    public long f56011e;

    public c(int i10, ThreadFactory threadFactory) {
        this.f56009b = i10;
        this.f56010c = new d[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f56010c[i11] = new d(threadFactory);
        }
    }

    @Override // fu.c0
    public void createWorkers(int i10, b0 b0Var) {
        int i11 = this.f56009b;
        if (i11 == 0) {
            for (int i12 = 0; i12 < i10; i12++) {
                ((cu.n0) b0Var).onWorker(i12, e.f56015j);
            }
            return;
        }
        int i13 = ((int) this.f56011e) % i11;
        for (int i14 = 0; i14 < i10; i14++) {
            ((cu.n0) b0Var).onWorker(i14, new b(this.f56010c[i13]));
            i13++;
            if (i13 == i11) {
                i13 = 0;
            }
        }
        this.f56011e = i13;
    }

    public d getEventLoop() {
        int i10 = this.f56009b;
        if (i10 == 0) {
            return e.f56015j;
        }
        long j10 = this.f56011e;
        this.f56011e = 1 + j10;
        return this.f56010c[(int) (j10 % i10)];
    }

    public void shutdown() {
        for (d dVar : this.f56010c) {
            dVar.dispose();
        }
    }
}
