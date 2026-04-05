package yr;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e1 {

    /* renamed from: b, reason: collision with root package name */
    public Runnable f94880b;

    /* renamed from: c, reason: collision with root package name */
    public final int f94881c;

    /* renamed from: d, reason: collision with root package name */
    public int f94882d;

    /* renamed from: e, reason: collision with root package name */
    public int f94883e;

    /* renamed from: f, reason: collision with root package name */
    public final d1 f94884f;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g1 f94886h;

    /* renamed from: a, reason: collision with root package name */
    public final pw.g f94879a = new pw.g();

    /* renamed from: g, reason: collision with root package name */
    public boolean f94885g = false;

    public e1(g1 g1Var, int i10, int i11, d1 d1Var) {
        this.f94886h = g1Var;
        this.f94881c = i10;
        this.f94882d = i11;
        this.f94884f = d1Var;
    }

    public final boolean a() {
        return this.f94879a.size() > 0;
    }

    public final int b(int i10) {
        if (i10 <= 0 || Integer.MAX_VALUE - i10 >= this.f94882d) {
            int i11 = this.f94882d + i10;
            this.f94882d = i11;
            return i11;
        }
        throw new IllegalArgumentException("Window size overflow for stream: " + this.f94881c);
    }

    public final void c(int i10, boolean z10, pw.g gVar) {
        do {
            g1 g1Var = this.f94886h;
            int iMin = Math.min(i10, g1Var.f94905b.maxDataLength());
            int i11 = -iMin;
            g1Var.f94907d.b(i11);
            b(i11);
            try {
                g1Var.f94905b.data(gVar.size() == ((long) iMin) && z10, this.f94881c, gVar, iMin);
                this.f94884f.onSentBytes(iMin);
                i10 -= iMin;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } while (i10 > 0);
    }

    public final void d(int i10, mf.c cVar) {
        Runnable runnable;
        int i11 = this.f94882d;
        g1 g1Var = this.f94886h;
        int iMin = Math.min(i10, Math.min(i11, g1Var.f94907d.f94882d));
        int size = 0;
        while (a() && iMin > 0) {
            long j10 = iMin;
            pw.g gVar = this.f94879a;
            if (j10 >= gVar.size()) {
                size += (int) gVar.size();
                c((int) gVar.size(), this.f94885g, gVar);
            } else {
                size += iMin;
                c(iMin, false, gVar);
            }
            cVar.f74523a++;
            iMin = Math.min(i10 - size, Math.min(this.f94882d, g1Var.f94907d.f94882d));
        }
        if (a() || (runnable = this.f94880b) == null) {
            return;
        }
        runnable.run();
        this.f94880b = null;
    }
}
