package p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k0 implements m, k9.f {
    public static final h0 B = new h0();
    public boolean A;

    /* renamed from: e, reason: collision with root package name */
    public final n0 f80781e;

    /* renamed from: f, reason: collision with root package name */
    public final w3.f f80782f;

    /* renamed from: h, reason: collision with root package name */
    public final l0 f80784h;

    /* renamed from: i, reason: collision with root package name */
    public final s8.h f80785i;

    /* renamed from: j, reason: collision with root package name */
    public final s8.h f80786j;

    /* renamed from: k, reason: collision with root package name */
    public final s8.h f80787k;

    /* renamed from: l, reason: collision with root package name */
    public final s8.h f80788l;

    /* renamed from: n, reason: collision with root package name */
    public m0 f80790n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f80791o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f80792p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f80793q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f80794r;

    /* renamed from: s, reason: collision with root package name */
    public v0 f80795s;

    /* renamed from: t, reason: collision with root package name */
    public n8.a f80796t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f80797u;

    /* renamed from: v, reason: collision with root package name */
    public q0 f80798v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f80799w;

    /* renamed from: x, reason: collision with root package name */
    public o0 f80800x;

    /* renamed from: y, reason: collision with root package name */
    public r f80801y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f80802z;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f80779b = new j0(new ArrayList(2));

    /* renamed from: c, reason: collision with root package name */
    public final k9.k f80780c = k9.k.newInstance();

    /* renamed from: m, reason: collision with root package name */
    public final AtomicInteger f80789m = new AtomicInteger();

    /* renamed from: g, reason: collision with root package name */
    public final h0 f80783g = B;

    public k0(s8.h hVar, s8.h hVar2, s8.h hVar3, s8.h hVar4, e0 e0Var, e0 e0Var2, w3.f fVar) {
        this.f80785i = hVar;
        this.f80786j = hVar2;
        this.f80787k = hVar3;
        this.f80788l = hVar4;
        this.f80784h = e0Var;
        this.f80781e = e0Var2;
        this.f80782f = fVar;
    }

    public final synchronized void a(f9.j jVar, Executor executor) {
        try {
            this.f80780c.throwIfRecycled();
            this.f80779b.f80778b.add(new i0(jVar, executor));
            if (this.f80797u) {
                c(1);
                executor.execute(new g0(this, jVar));
            } else if (this.f80799w) {
                c(1);
                executor.execute(new f0(this, jVar));
            } else {
                j9.q.checkArgument(!this.f80802z, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void b() {
        o0 o0Var;
        synchronized (this) {
            try {
                this.f80780c.throwIfRecycled();
                j9.q.checkArgument(d(), "Not yet complete!");
                int iDecrementAndGet = this.f80789m.decrementAndGet();
                j9.q.checkArgument(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    o0Var = this.f80800x;
                    e();
                } else {
                    o0Var = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (o0Var != null) {
            o0Var.b();
        }
    }

    public final synchronized void c(int i10) {
        o0 o0Var;
        j9.q.checkArgument(d(), "Not yet complete!");
        if (this.f80789m.getAndAdd(i10) == 0 && (o0Var = this.f80800x) != null) {
            o0Var.a();
        }
    }

    public final boolean d() {
        return this.f80799w || this.f80797u || this.f80802z;
    }

    public final synchronized void e() {
        boolean zA;
        if (this.f80790n == null) {
            throw new IllegalArgumentException();
        }
        this.f80779b.f80778b.clear();
        this.f80790n = null;
        this.f80800x = null;
        this.f80795s = null;
        this.f80799w = false;
        this.f80802z = false;
        this.f80797u = false;
        this.A = false;
        r rVar = this.f80801y;
        p pVar = rVar.f80861i;
        synchronized (pVar) {
            pVar.f80839a = true;
            zA = pVar.a();
        }
        if (zA) {
            rVar.g();
        }
        this.f80801y = null;
        this.f80798v = null;
        this.f80796t = null;
        this.f80782f.release(this);
    }

    public final synchronized void f(f9.j jVar) {
        try {
            this.f80780c.throwIfRecycled();
            this.f80779b.f80778b.remove(new i0(jVar, j9.h.directExecutor()));
            if (this.f80779b.f80778b.isEmpty()) {
                if (!d()) {
                    this.f80802z = true;
                    this.f80801y.cancel();
                    this.f80784h.onEngineJobCancelled(this, this.f80790n);
                }
                if (this.f80797u || this.f80799w) {
                    if (this.f80789m.get() == 0) {
                        e();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // k9.f
    public k9.k getVerifier() {
        return this.f80780c;
    }

    @Override // p8.m
    public void onLoadFailed(q0 q0Var) {
        synchronized (this) {
            this.f80798v = q0Var;
        }
        synchronized (this) {
            try {
                this.f80780c.throwIfRecycled();
                if (this.f80802z) {
                    e();
                    return;
                }
                if (this.f80779b.f80778b.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f80799w) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f80799w = true;
                m0 m0Var = this.f80790n;
                j0 j0Var = this.f80779b;
                j0Var.getClass();
                ArrayList arrayList = new ArrayList(j0Var.f80778b);
                j0 j0Var2 = new j0(arrayList);
                c(arrayList.size() + 1);
                this.f80784h.onEngineJobComplete(this, m0Var, null);
                Iterator<i0> it = j0Var2.iterator();
                while (it.hasNext()) {
                    i0 next = it.next();
                    next.f80777b.execute(new f0(this, next.f80776a));
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p8.m
    public void onResourceReady(v0 v0Var, n8.a aVar, boolean z10) {
        synchronized (this) {
            this.f80795s = v0Var;
            this.f80796t = aVar;
            this.A = z10;
        }
        synchronized (this) {
            try {
                this.f80780c.throwIfRecycled();
                if (this.f80802z) {
                    this.f80795s.recycle();
                    e();
                    return;
                }
                if (this.f80779b.f80778b.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f80797u) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f80800x = this.f80783g.build(this.f80795s, this.f80791o, this.f80790n, this.f80781e);
                this.f80797u = true;
                j0 j0Var = this.f80779b;
                j0Var.getClass();
                ArrayList arrayList = new ArrayList(j0Var.f80778b);
                j0 j0Var2 = new j0(arrayList);
                c(arrayList.size() + 1);
                this.f80784h.onEngineJobComplete(this, this.f80790n, this.f80800x);
                Iterator<i0> it = j0Var2.iterator();
                while (it.hasNext()) {
                    i0 next = it.next();
                    next.f80777b.execute(new g0(this, next.f80776a));
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p8.m
    public void reschedule(r rVar) {
        (this.f80792p ? this.f80787k : this.f80793q ? this.f80788l : this.f80786j).execute(rVar);
    }

    public synchronized void start(r rVar) {
        this.f80801y = rVar;
        int iD = rVar.d(1);
        ((iD == 2 || iD == 3) ? this.f80785i : this.f80792p ? this.f80787k : this.f80793q ? this.f80788l : this.f80786j).execute(rVar);
    }
}
