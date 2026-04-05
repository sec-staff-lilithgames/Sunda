package xr;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class j5 {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f92697g = Logger.getLogger(j5.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final long f92698a;

    /* renamed from: b, reason: collision with root package name */
    public final mh.t2 f92699b;

    /* renamed from: c, reason: collision with root package name */
    public LinkedHashMap f92700c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f92701d;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f92702e;

    /* renamed from: f, reason: collision with root package name */
    public long f92703f;

    public j5(long j10, mh.t2 t2Var) {
        this.f92698a = j10;
        this.f92699b = t2Var;
    }

    public static void notifyFailed(n1 n1Var, Executor executor, Throwable th2) {
        try {
            executor.execute(new i5(n1Var, th2));
        } catch (Throwable th3) {
            f92697g.log(Level.SEVERE, "Failed to execute PingCallback", th3);
        }
    }

    public void addCallback(n1 n1Var, Executor executor) {
        synchronized (this) {
            try {
                if (!this.f92701d) {
                    this.f92700c.put(n1Var, executor);
                    return;
                }
                Throwable th2 = this.f92702e;
                Runnable i5Var = th2 != null ? new i5(n1Var, th2) : new h5(n1Var, this.f92703f);
                try {
                    executor.execute(i5Var);
                } catch (Throwable th3) {
                    f92697g.log(Level.SEVERE, "Failed to execute PingCallback", th3);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public boolean complete() {
        synchronized (this) {
            try {
                if (this.f92701d) {
                    return false;
                }
                this.f92701d = true;
                long jElapsed = this.f92699b.elapsed(TimeUnit.NANOSECONDS);
                this.f92703f = jElapsed;
                LinkedHashMap linkedHashMap = this.f92700c;
                this.f92700c = null;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    try {
                        ((Executor) entry.getValue()).execute(new h5((n1) entry.getKey(), jElapsed));
                    } catch (Throwable th2) {
                        f92697g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                    }
                }
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void failed(Throwable th2) {
        synchronized (this) {
            try {
                if (this.f92701d) {
                    return;
                }
                this.f92701d = true;
                this.f92702e = th2;
                LinkedHashMap linkedHashMap = this.f92700c;
                this.f92700c = null;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    notifyFailed((n1) entry.getKey(), (Executor) entry.getValue(), th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public long payload() {
        return this.f92698a;
    }
}
