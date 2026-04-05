package bu;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n8 extends b8 {

    /* renamed from: e, reason: collision with root package name */
    public final mt.m0 f10699e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10700f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeUnit f10701g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10702h;

    public n8(int i10, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f10699e = m0Var;
        this.f10702h = i10;
        this.f10700f = j10;
        this.f10701g = timeUnit;
    }

    @Override // bu.b8
    public final Object a(Object obj) {
        mt.m0 m0Var = this.f10699e;
        TimeUnit timeUnit = this.f10701g;
        return new ou.k(obj, m0Var.now(timeUnit), timeUnit);
    }

    @Override // bu.b8
    public final g8 b() {
        g8 g8Var;
        long jNow = this.f10699e.now(this.f10701g) - this.f10700f;
        g8 g8Var2 = (g8) get();
        Object obj = g8Var2.get();
        while (true) {
            g8 g8Var3 = (g8) obj;
            g8Var = g8Var2;
            g8Var2 = g8Var3;
            if (g8Var2 == null) {
                break;
            }
            ou.k kVar = (ou.k) g8Var2.f10355b;
            if (iu.u.isComplete(kVar.value()) || iu.u.isError(kVar.value()) || kVar.time() > jNow) {
                break;
            }
            obj = g8Var2.get();
        }
        return g8Var;
    }

    @Override // bu.b8
    public final Object c(Object obj) {
        return ((ou.k) obj).value();
    }

    @Override // bu.b8
    public final void d() {
        g8 g8Var;
        long jNow = this.f10699e.now(this.f10701g) - this.f10700f;
        g8 g8Var2 = (g8) get();
        g8 g8Var3 = (g8) g8Var2.get();
        int i10 = 0;
        while (true) {
            g8 g8Var4 = g8Var3;
            g8Var = g8Var2;
            g8Var2 = g8Var4;
            if (g8Var2 == null) {
                break;
            }
            int i11 = this.f10122c;
            if (i11 > this.f10702h && i11 > 1) {
                i10++;
                this.f10122c = i11 - 1;
                g8Var3 = (g8) g8Var2.get();
            } else {
                if (((ou.k) g8Var2.f10355b).time() > jNow) {
                    break;
                }
                i10++;
                this.f10122c--;
                g8Var3 = (g8) g8Var2.get();
            }
        }
        if (i10 != 0) {
            set(g8Var);
        }
    }

    @Override // bu.b8
    public final void e() {
        g8 g8Var;
        long jNow = this.f10699e.now(this.f10701g) - this.f10700f;
        g8 g8Var2 = (g8) get();
        g8 g8Var3 = (g8) g8Var2.get();
        int i10 = 0;
        while (true) {
            g8 g8Var4 = g8Var3;
            g8Var = g8Var2;
            g8Var2 = g8Var4;
            if (g8Var2 == null || this.f10122c <= 1 || ((ou.k) g8Var2.f10355b).time() > jNow) {
                break;
            }
            i10++;
            this.f10122c--;
            g8Var3 = (g8) g8Var2.get();
        }
        if (i10 != 0) {
            set(g8Var);
        }
    }
}
