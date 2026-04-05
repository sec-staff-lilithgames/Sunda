package xr;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class v3 implements k1 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f93160a;

    /* renamed from: b, reason: collision with root package name */
    public m1 f93161b;

    /* renamed from: c, reason: collision with root package name */
    public k1 f93162c;

    /* renamed from: d, reason: collision with root package name */
    public wr.m6 f93163d;

    /* renamed from: f, reason: collision with root package name */
    public u3 f93165f;

    /* renamed from: g, reason: collision with root package name */
    public long f93166g;

    /* renamed from: h, reason: collision with root package name */
    public long f93167h;

    /* renamed from: e, reason: collision with root package name */
    public List f93164e = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f93168i = new ArrayList();

    public final void a(Runnable runnable) {
        mh.p1.checkState(this.f93161b != null, "May only be called after start");
        synchronized (this) {
            try {
                if (this.f93160a) {
                    runnable.run();
                } else {
                    this.f93164e.add(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // xr.k1
    public void appendTimeoutInsight(l5 l5Var) {
        synchronized (this) {
            try {
                if (this.f93161b == null) {
                    return;
                }
                if (this.f93162c != null) {
                    l5Var.appendKeyValue("buffered_nanos", Long.valueOf(this.f93167h - this.f93166g));
                    this.f93162c.appendTimeoutInsight(l5Var);
                } else {
                    l5Var.appendKeyValue("buffered_nanos", Long.valueOf(System.nanoTime() - this.f93166g));
                    l5Var.append("waiting_for_connection");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f93164e     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            r0 = 0
            r3.f93164e = r0     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            r3.f93160a = r0     // Catch: java.lang.Throwable -> L1d
            xr.u3 r0 = r3.f93165f     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1c
            r0.drainPendingCallbacks()
        L1c:
            return
        L1d:
            r0 = move-exception
            goto L3d
        L1f:
            java.util.List r1 = r3.f93164e     // Catch: java.lang.Throwable -> L1d
            r3.f93164e = r0     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r1.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L28
        L38:
            r1.clear()
            r0 = r1
            goto L5
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.v3.b():void");
    }

    @Override // xr.k1
    public void cancel(wr.m6 m6Var) {
        boolean z10 = false;
        boolean z11 = true;
        mh.p1.checkState(this.f93161b != null, "May only be called after start");
        mh.p1.checkNotNull(m6Var, "reason");
        synchronized (this) {
            try {
                k1 k1Var = this.f93162c;
                if (k1Var == null) {
                    x9 x9Var = x9.f93238a;
                    if (k1Var != null) {
                        z11 = false;
                    }
                    mh.p1.checkState(z11, "realStream already set to %s", k1Var);
                    this.f93162c = x9Var;
                    this.f93167h = System.nanoTime();
                    this.f93163d = m6Var;
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            a(new o3(this, m6Var));
            return;
        }
        b();
        c(m6Var);
        this.f93161b.closed(m6Var, l1.f92748b, new wr.e4());
    }

    public final k3 d(k1 k1Var) {
        synchronized (this) {
            try {
                if (this.f93162c != null) {
                    return null;
                }
                k1 k1Var2 = (k1) mh.p1.checkNotNull(k1Var, "stream");
                k1 k1Var3 = this.f93162c;
                mh.p1.checkState(k1Var3 == null, "realStream already set to %s", k1Var3);
                this.f93162c = k1Var2;
                this.f93167h = System.nanoTime();
                m1 m1Var = this.f93161b;
                if (m1Var == null) {
                    this.f93164e = null;
                    this.f93160a = true;
                }
                if (m1Var == null) {
                    return null;
                }
                Iterator it = this.f93168i.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                this.f93168i = null;
                this.f93162c.start(m1Var);
                return new k3(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // xr.k1, xr.ue
    public void flush() {
        mh.p1.checkState(this.f93161b != null, "May only be called after start");
        if (this.f93160a) {
            this.f93162c.flush();
        } else {
            a(new n3(this));
        }
    }

    @Override // xr.k1
    public wr.c getAttributes() {
        k1 k1Var;
        synchronized (this) {
            k1Var = this.f93162c;
        }
        return k1Var != null ? k1Var.getAttributes() : wr.c.f90841b;
    }

    @Override // xr.k1
    public void halfClose() {
        mh.p1.checkState(this.f93161b != null, "May only be called after start");
        a(new p3(this));
    }

    @Override // xr.k1
    public boolean isReady() {
        if (this.f93160a) {
            return this.f93162c.isReady();
        }
        return false;
    }

    @Override // xr.k1, xr.ue
    public void optimizeForDirectExecutor() {
        mh.p1.checkState(this.f93161b == null, "May only be called before start");
        this.f93168i.add(new c3(this));
    }

    @Override // xr.k1, xr.ue
    public void request(int i10) {
        mh.p1.checkState(this.f93161b != null, "May only be called after start");
        if (this.f93160a) {
            this.f93162c.request(i10);
        } else {
            a(new b3(this, i10));
        }
    }

    @Override // xr.k1
    public void setAuthority(String str) {
        mh.p1.checkState(this.f93161b == null, "May only be called before start");
        mh.p1.checkNotNull(str, "authority");
        this.f93168i.add(new l3(this, str));
    }

    @Override // xr.k1, xr.ue
    public void setCompressor(wr.d0 d0Var) {
        mh.p1.checkState(this.f93161b == null, "May only be called before start");
        mh.p1.checkNotNull(d0Var, "compressor");
        this.f93168i.add(new d3(this, d0Var));
    }

    @Override // xr.k1
    public void setDeadline(wr.z0 z0Var) {
        mh.p1.checkState(this.f93161b == null, "May only be called before start");
        this.f93168i.add(new j3(this, z0Var));
    }

    @Override // xr.k1
    public void setDecompressorRegistry(wr.c1 c1Var) {
        mh.p1.checkState(this.f93161b == null, "May only be called before start");
        mh.p1.checkNotNull(c1Var, "decompressorRegistry");
        this.f93168i.add(new f3(this, c1Var));
    }

    @Override // xr.k1
    public void setFullStreamDecompression(boolean z10) {
        mh.p1.checkState(this.f93161b == null, "May only be called before start");
        this.f93168i.add(new e3(this, z10));
    }

    @Override // xr.k1
    public void setMaxInboundMessageSize(int i10) {
        mh.p1.checkState(this.f93161b == null, "May only be called before start");
        this.f93168i.add(new h3(this, i10));
    }

    @Override // xr.k1
    public void setMaxOutboundMessageSize(int i10) {
        mh.p1.checkState(this.f93161b == null, "May only be called before start");
        this.f93168i.add(new i3(this, i10));
    }

    @Override // xr.k1, xr.ue
    public void setMessageCompression(boolean z10) {
        mh.p1.checkState(this.f93161b != null, "May only be called after start");
        if (this.f93160a) {
            this.f93162c.setMessageCompression(z10);
        } else {
            a(new g3(this, z10));
        }
    }

    @Override // xr.k1
    public void start(m1 m1Var) {
        wr.m6 m6Var;
        boolean z10;
        mh.p1.checkNotNull(m1Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        mh.p1.checkState(this.f93161b == null, "already started");
        synchronized (this) {
            try {
                m6Var = this.f93163d;
                z10 = this.f93160a;
                if (!z10) {
                    u3 u3Var = new u3(m1Var);
                    this.f93165f = u3Var;
                    m1Var = u3Var;
                }
                this.f93161b = m1Var;
                this.f93166g = System.nanoTime();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (m6Var != null) {
            m1Var.closed(m6Var, l1.f92748b, new wr.e4());
            return;
        }
        if (z10) {
            Iterator it = this.f93168i.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f93168i = null;
            this.f93162c.start(m1Var);
        }
    }

    @Override // xr.k1, xr.ue
    public void writeMessage(InputStream inputStream) {
        mh.p1.checkState(this.f93161b != null, "May only be called after start");
        mh.p1.checkNotNull(inputStream, PglCryptUtils.KEY_MESSAGE);
        if (this.f93160a) {
            this.f93162c.writeMessage(inputStream);
        } else {
            a(new m3(this, inputStream));
        }
    }

    public void c(wr.m6 m6Var) {
    }
}
