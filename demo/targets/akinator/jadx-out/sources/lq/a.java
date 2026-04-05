package lq;

import android.net.Uri;
import android.view.View;
import br.h0;
import cr.q;
import dq.c0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a implements b {

    /* renamed from: h, reason: collision with root package name */
    public d f73604h;

    /* renamed from: k, reason: collision with root package name */
    public Uri f73607k;

    /* renamed from: m, reason: collision with root package name */
    public long f73609m;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f73605i = false;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f73606j = false;

    /* renamed from: l, reason: collision with root package name */
    public long f73608l = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0745a f73599b = new C0745a(16);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f73600c = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f73601e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f73602f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public final AtomicLong f73603g = new AtomicLong(-1);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: lq.a$a, reason: collision with other inner class name */
    public class C0745a implements c0 {

        /* renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f73610b = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        public final AtomicInteger f73611c = new AtomicInteger(0);

        /* renamed from: e, reason: collision with root package name */
        public final int f73612e;

        public C0745a(int i10) {
            this.f73612e = i10;
        }

        @Override // dq.c0, ir.k
        public void onRun() {
            d dVar;
            d dVar2;
            d dVar3;
            d dVar4;
            if (this.f73610b.get()) {
                a aVar = a.this;
                if (aVar.D()) {
                    Long lP = aVar.p();
                    AtomicBoolean atomicBoolean = aVar.f73602f;
                    if (lP != null) {
                        long jG = aVar.g();
                        if (jG > 0) {
                            float fLongValue = (lP.longValue() * 100.0f) / jG;
                            AtomicInteger atomicInteger = this.f73611c;
                            int i10 = atomicInteger.get();
                            if (fLongValue > (i10 * 25.0f) - 1.0f) {
                                if (i10 != 0) {
                                    if (i10 != 1) {
                                        if (i10 != 2) {
                                            if (i10 != 3) {
                                                if (i10 == 4) {
                                                    aVar.c();
                                                }
                                            } else if (!atomicBoolean.get() && (dVar4 = aVar.f73604h) != null) {
                                                dVar4.e(aVar);
                                            }
                                        } else if (!atomicBoolean.get() && (dVar3 = aVar.f73604h) != null) {
                                            dVar3.h(aVar);
                                        }
                                    } else if (!atomicBoolean.get() && (dVar2 = aVar.f73604h) != null) {
                                        dVar2.a(aVar);
                                    }
                                } else if (!atomicBoolean.get() && (dVar = aVar.f73604h) != null) {
                                    dVar.g(aVar);
                                }
                                atomicInteger.incrementAndGet();
                            }
                        }
                    }
                }
                aVar.l(aVar.p());
                q.onUiThread(this, this.f73612e);
            }
        }

        @Override // dq.c0, ir.k
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // dq.c0, ir.k, java.lang.Runnable
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public boolean D() {
        try {
            return o();
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean E() {
        return false;
    }

    @Override // lq.b
    public void a(d dVar) {
        this.f73604h = dVar;
    }

    public void b() {
        r();
    }

    public final void c() {
        d dVar;
        if (this.f73602f.compareAndSet(false, true) && (dVar = this.f73604h) != null) {
            dVar.i(this);
        }
    }

    public abstract float d();

    public abstract void d(float f10);

    public void e(float f10) {
        try {
            n(f10);
        } catch (Exception unused) {
        }
    }

    public abstract void e(long j10);

    public final void f(boolean z10, Long l9) {
        d dVar;
        if (l9 != null) {
            try {
                this.f73609m = l9.longValue();
            } catch (Exception e10) {
                h0 h0VarCreate = h0.create(e10);
                if (this.f73606j) {
                    k(h0VarCreate);
                    return;
                } else {
                    if (this.f73602f.get() || (dVar = this.f73604h) == null) {
                        return;
                    }
                    dVar.b(this, h0VarCreate);
                    return;
                }
            }
        }
        if (z10) {
            if (l9 != null) {
                c(l9.longValue());
            }
            b();
        } else {
            t();
            Uri uri = this.f73607k;
            if (uri != null) {
                j(uri);
            }
            s();
        }
    }

    @Override // lq.b
    public long g() {
        return this.f73608l;
    }

    @Override // lq.b
    public float getVolume() {
        try {
            return d();
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public abstract long h();

    public final void i(float f10) {
        d dVar;
        d dVar2;
        d dVar3;
        if (f10 == 0.0f && !this.f73605i) {
            this.f73605i = true;
            if (!this.f73602f.get() && (dVar3 = this.f73604h) != null) {
                dVar3.a((b) this, true);
            }
        } else if (this.f73605i) {
            this.f73605i = false;
            if (!this.f73602f.get() && (dVar = this.f73604h) != null) {
                dVar.a((b) this, false);
            }
        }
        if (this.f73602f.get() || (dVar2 = this.f73604h) == null) {
            return;
        }
        dVar2.a(this, f10);
    }

    public abstract void j(Uri uri);

    @Override // lq.b, dq.h0
    public void k() {
        try {
            this.f73602f.set(false);
            this.f73599b.f73611c.set(0);
            this.f73601e.set(true);
            f(E(), 0L);
        } catch (Exception e10) {
            k(h0.create(e10));
        }
    }

    public final void l(Long l9) {
        d dVar;
        if (l9 == null || this.f73603g.getAndSet(l9.longValue()) == l9.longValue() || this.f73602f.get() || (dVar = this.f73604h) == null) {
            return;
        }
        dVar.a((b) this, l9.longValue());
    }

    public abstract long m();

    @Override // lq.b
    public abstract /* synthetic */ View n();

    public void n(float f10) {
        d(f10);
    }

    public abstract boolean o();

    public Long p() {
        try {
            return Long.valueOf(h());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // lq.b
    public void pause() {
        try {
            this.f73601e.set(false);
            w();
            this.f73609m = h();
        } catch (Exception unused) {
        }
    }

    @Override // lq.b
    public void play() {
        try {
            this.f73606j = true;
            Long lValueOf = this.f73602f.get() ? Long.valueOf(g()) : null;
            this.f73601e.set(true);
            f(E(), lValueOf);
        } catch (Exception e10) {
            k(h0.create(e10));
        }
    }

    @Override // lq.b
    public void prepare() {
        d dVar;
        try {
            s();
        } catch (Exception e10) {
            h0 h0VarCreate = h0.create(e10);
            if (this.f73602f.get() || (dVar = this.f73604h) == null) {
                return;
            }
            dVar.b(this, h0VarCreate);
        }
    }

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract void t();

    public final void u() {
        d dVar;
        AtomicBoolean atomicBoolean = this.f73602f;
        if (!atomicBoolean.get() && (dVar = this.f73604h) != null) {
            dVar.b(this);
        }
        if (atomicBoolean.get()) {
            return;
        }
        C0745a c0745a = this.f73599b;
        c0745a.f73610b.set(false);
        q.cancelOnUiThread(c0745a);
        c0745a.f73610b.set(true);
        q.onUiThread(c0745a);
    }

    public final void v() {
        d dVar;
        try {
            this.f73608l = m();
        } catch (Exception unused) {
        }
        if (this.f73601e.compareAndSet(true, false)) {
            f(true, Long.valueOf(this.f73609m));
        }
        if (this.f73600c.compareAndSet(false, true) && (dVar = this.f73604h) != null) {
            dVar.f(this);
        }
    }

    public void w() {
        q();
    }

    @Override // lq.b
    public void a(Uri uri) {
        try {
            j(uri);
            this.f73607k = uri;
        } catch (Exception unused) {
        }
    }

    @Override // lq.b, dq.f0
    public void b(Integer num) {
        e(0.0f);
    }

    @Override // lq.b, dq.l0
    public void e() {
        d dVar;
        if (!this.f73606j || this.f73602f.get()) {
            return;
        }
        pause();
        c(g());
        if (this.f73602f.get() || (dVar = this.f73604h) == null) {
            return;
        }
        dVar.d(this);
    }

    @Override // lq.b, dq.f0
    public void a(Integer num) {
        e(1.0f);
    }

    public void c(long j10) {
        try {
            e(j10);
        } catch (Exception unused) {
        }
    }

    @Override // lq.b
    public void a() {
        this.f73604h = null;
        C0745a c0745a = this.f73599b;
        c0745a.f73610b.set(false);
        q.cancelOnUiThread(c0745a);
    }

    public final void k(h0 h0Var) {
        if (this.f73602f.get()) {
            return;
        }
        d dVar = this.f73604h;
        if (dVar != null) {
            dVar.a(this, h0Var);
        }
        c();
    }
}
