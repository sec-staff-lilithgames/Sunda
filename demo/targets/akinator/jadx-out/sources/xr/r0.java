package xr;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r0 extends m4 {

    /* renamed from: a, reason: collision with root package name */
    public final a2 f92939a;

    /* renamed from: b, reason: collision with root package name */
    public final String f92940b;

    /* renamed from: d, reason: collision with root package name */
    public volatile wr.m6 f92942d;

    /* renamed from: e, reason: collision with root package name */
    public wr.m6 f92943e;

    /* renamed from: f, reason: collision with root package name */
    public wr.m6 f92944f;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s0 f92946h;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f92941c = new AtomicInteger(-2147483647);

    /* renamed from: g, reason: collision with root package name */
    public final p0 f92945g = new p0(this);

    public r0(s0 s0Var, a2 a2Var, String str) {
        this.f92946h = s0Var;
        this.f92939a = (a2) mh.p1.checkNotNull(a2Var, "delegate");
        this.f92940b = (String) mh.p1.checkNotNull(str, "authority");
    }

    public static void b(r0 r0Var) {
        synchronized (r0Var) {
            try {
                if (r0Var.f92941c.get() != 0) {
                    return;
                }
                wr.m6 m6Var = r0Var.f92943e;
                wr.m6 m6Var2 = r0Var.f92944f;
                r0Var.f92943e = null;
                r0Var.f92944f = null;
                if (m6Var != null) {
                    super.shutdown(m6Var);
                }
                if (m6Var2 != null) {
                    super.shutdownNow(m6Var2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // xr.m4
    public final a2 a() {
        return this.f92939a;
    }

    @Override // xr.m4, xr.a2, xr.h9, xr.o1
    public k1 newStream(wr.k4 k4Var, wr.e4 e4Var, wr.i iVar, wr.u[] uVarArr) {
        k1 k1Var;
        wr.f credentials = iVar.getCredentials();
        if (credentials == null) {
            credentials = this.f92946h.f92974c;
        } else {
            wr.f fVar = this.f92946h.f92974c;
            if (fVar != null) {
                credentials = new wr.b0(fVar, credentials);
            }
        }
        if (credentials == null) {
            return this.f92941c.get() >= 0 ? new g4(this.f92942d, uVarArr) : this.f92939a.newStream(k4Var, e4Var, iVar, uVarArr);
        }
        v9 v9Var = new v9(this.f92939a, k4Var, e4Var, iVar, this.f92945g, uVarArr);
        if (this.f92941c.incrementAndGet() > 0) {
            this.f92945g.onComplete();
            return new g4(this.f92942d, uVarArr);
        }
        try {
            credentials.applyRequestMetadata(new q0(this, k4Var, iVar), this.f92946h.f92975e, v9Var);
        } catch (Throwable th2) {
            v9Var.fail(wr.m6.f91042j.withDescription("Credentials should use fail() instead of throwing exceptions").withCause(th2));
        }
        synchronized (v9Var.f93192h) {
            try {
                k1 k1Var2 = v9Var.f93193i;
                k1Var = k1Var2;
                if (k1Var2 == null) {
                    v3 v3Var = new v3();
                    v9Var.f93195k = v3Var;
                    v9Var.f93193i = v3Var;
                }
            } finally {
            }
        }
        return k1Var;
    }

    @Override // xr.m4, xr.a2, xr.h9
    public void shutdown(wr.m6 m6Var) {
        mh.p1.checkNotNull(m6Var, "status");
        synchronized (this) {
            try {
                if (this.f92941c.get() < 0) {
                    this.f92942d = m6Var;
                    this.f92941c.addAndGet(Integer.MAX_VALUE);
                    if (this.f92941c.get() != 0) {
                        this.f92943e = m6Var;
                    } else {
                        super.shutdown(m6Var);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // xr.m4, xr.a2, xr.h9
    public void shutdownNow(wr.m6 m6Var) {
        mh.p1.checkNotNull(m6Var, "status");
        synchronized (this) {
            try {
                if (this.f92941c.get() < 0) {
                    this.f92942d = m6Var;
                    this.f92941c.addAndGet(Integer.MAX_VALUE);
                } else if (this.f92944f != null) {
                    return;
                }
                if (this.f92941c.get() != 0) {
                    this.f92944f = m6Var;
                } else {
                    super.shutdownNow(m6Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
