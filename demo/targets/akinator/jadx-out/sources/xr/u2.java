package xr;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import wr.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class u2 extends wr.p {

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f93070j = Logger.getLogger(u2.class.getName());

    /* renamed from: k, reason: collision with root package name */
    public static final n2 f93071k = new n2();

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f93072a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f93073b;

    /* renamed from: c, reason: collision with root package name */
    public final wr.u0 f93074c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f93075d;

    /* renamed from: e, reason: collision with root package name */
    public p.a f93076e;

    /* renamed from: f, reason: collision with root package name */
    public wr.p f93077f;

    /* renamed from: g, reason: collision with root package name */
    public wr.m6 f93078g;

    /* renamed from: h, reason: collision with root package name */
    public List f93079h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public t2 f93080i;

    public u2(Executor executor, ScheduledExecutorService scheduledExecutorService, wr.z0 z0Var) {
        ScheduledFuture<?> scheduledFutureSchedule;
        this.f93073b = (Executor) mh.p1.checkNotNull(executor, "callExecutor");
        mh.p1.checkNotNull(scheduledExecutorService, "scheduler");
        wr.u0 u0VarCurrent = wr.u0.current();
        this.f93074c = u0VarCurrent;
        wr.z0 deadline = u0VarCurrent.getDeadline();
        if (z0Var == null && deadline == null) {
            scheduledFutureSchedule = null;
        } else {
            long jTimeRemaining = z0Var != null ? z0Var.timeRemaining(TimeUnit.NANOSECONDS) : Long.MAX_VALUE;
            if (deadline != null) {
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                if (deadline.timeRemaining(timeUnit) < jTimeRemaining) {
                    jTimeRemaining = deadline.timeRemaining(timeUnit);
                    Level level = Level.FINE;
                    Logger logger = f93070j;
                    if (logger.isLoggable(level)) {
                        Locale locale = Locale.US;
                        StringBuilder sb2 = new StringBuilder(p0.o2.n(jTimeRemaining, "Call timeout set to '", "' ns, due to context deadline."));
                        if (z0Var == null) {
                            sb2.append(" Explicit call timeout was not set.");
                        } else {
                            sb2.append(" Explicit call timeout was '" + z0Var.timeRemaining(timeUnit) + "' ns.");
                        }
                        logger.fine(sb2.toString());
                    }
                }
            }
            long jAbs = Math.abs(jTimeRemaining);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit2.toNanos(1L);
            long jAbs2 = Math.abs(jTimeRemaining) % timeUnit2.toNanos(1L);
            StringBuilder sb3 = new StringBuilder();
            String str = z0Var == null ? true : deadline == null ? false : deadline.isBefore(z0Var) ? "Context" : "CallOptions";
            if (jTimeRemaining < 0) {
                w0.i.h(sb3, "ClientCall started after ", str, " deadline was exceeded. Deadline has been exceeded for ");
            } else {
                w0.i.h(sb3, "Deadline ", str, " will be exceeded in ");
            }
            sb3.append(nanos);
            sb3.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb3.append("s. ");
            scheduledFutureSchedule = scheduledExecutorService.schedule(new f2(this, sb3), jTimeRemaining, TimeUnit.NANOSECONDS);
        }
        this.f93072a = scheduledFutureSchedule;
    }

    public final void a(wr.m6 m6Var, boolean z10) {
        p.a aVar;
        synchronized (this) {
            try {
                wr.p pVar = this.f93077f;
                boolean z11 = true;
                if (pVar == null) {
                    n2 n2Var = f93071k;
                    if (pVar != null) {
                        z11 = false;
                    }
                    mh.p1.checkState(z11, "realCall already set to %s", pVar);
                    ScheduledFuture scheduledFuture = this.f93072a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f93077f = n2Var;
                    aVar = this.f93076e;
                    this.f93078g = m6Var;
                    z11 = false;
                } else if (z10) {
                    return;
                } else {
                    aVar = null;
                }
                if (z11) {
                    b(new i2(this, m6Var));
                } else {
                    if (aVar != null) {
                        this.f93073b.execute(new o2(this, aVar, m6Var));
                    }
                    c();
                }
                p8 p8Var = (p8) this;
                p8Var.f92880p.f92927d.f93126s.execute(new o8(p8Var));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f93075d) {
                    runnable.run();
                } else {
                    this.f93079h.add(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f93079h     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.f93079h = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.f93075d = r0     // Catch: java.lang.Throwable -> L24
            xr.t2 r0 = r3.f93080i     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f93073b
            xr.g2 r2 = new xr.g2
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List r1 = r3.f93079h     // Catch: java.lang.Throwable -> L24
            r3.f93079h = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.u2.c():void");
    }

    @Override // wr.p
    public final void cancel(String str, Throwable th2) {
        wr.m6 m6Var = wr.m6.f91038f;
        wr.m6 m6VarWithDescription = str != null ? m6Var.withDescription(str) : m6Var.withDescription("Call cancelled without message");
        if (th2 != null) {
            m6VarWithDescription = m6VarWithDescription.withCause(th2);
        }
        a(m6VarWithDescription, false);
    }

    @Override // wr.p
    public final wr.c getAttributes() {
        wr.p pVar;
        synchronized (this) {
            pVar = this.f93077f;
        }
        return pVar != null ? pVar.getAttributes() : wr.c.f90841b;
    }

    @Override // wr.p
    public final void halfClose() {
        b(new m2(this));
    }

    @Override // wr.p
    public final boolean isReady() {
        if (this.f93075d) {
            return this.f93077f.isReady();
        }
        return false;
    }

    @Override // wr.p
    public final void request(int i10) {
        if (this.f93075d) {
            this.f93077f.request(i10);
        } else {
            b(new l2(this, i10));
        }
    }

    @Override // wr.p
    public final void sendMessage(Object obj) {
        if (this.f93075d) {
            this.f93077f.sendMessage(obj);
        } else {
            b(new j2(this, obj));
        }
    }

    public final Runnable setCall(wr.p pVar) {
        synchronized (this) {
            try {
                if (this.f93077f != null) {
                    return null;
                }
                wr.p pVar2 = (wr.p) mh.p1.checkNotNull(pVar, NotificationCompat.CATEGORY_CALL);
                wr.p pVar3 = this.f93077f;
                mh.p1.checkState(pVar3 == null, "realCall already set to %s", pVar3);
                ScheduledFuture scheduledFuture = this.f93072a;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f93077f = pVar2;
                return new e2(this, this.f93074c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // wr.p
    public final void setMessageCompression(boolean z10) {
        if (this.f93075d) {
            this.f93077f.setMessageCompression(z10);
        } else {
            b(new k2(this, z10));
        }
    }

    @Override // wr.p
    public final void start(p.a aVar, wr.e4 e4Var) {
        wr.m6 m6Var;
        boolean z10;
        mh.p1.checkState(this.f93076e == null, "already started");
        synchronized (this) {
            try {
                this.f93076e = (p.a) mh.p1.checkNotNull(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                m6Var = this.f93078g;
                z10 = this.f93075d;
                if (!z10) {
                    t2 t2Var = new t2(aVar);
                    this.f93080i = t2Var;
                    aVar = t2Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (m6Var != null) {
            this.f93073b.execute(new o2(this, aVar, m6Var));
        } else if (z10) {
            this.f93077f.start(aVar, e4Var);
        } else {
            b(new h2(this, aVar, e4Var));
        }
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("realCall", this.f93077f).toString();
    }
}
