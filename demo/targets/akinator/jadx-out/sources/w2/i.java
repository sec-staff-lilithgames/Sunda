package w2;

import b0.e2;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import j1.o2;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.d0;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i implements n1 {

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f90346f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f90347g = Logger.getLogger(i.class.getName());

    /* renamed from: h, reason: collision with root package name */
    public static final d0 f90348h;

    /* renamed from: i, reason: collision with root package name */
    public static final Object f90349i;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f90350b;

    /* renamed from: c, reason: collision with root package name */
    public volatile d f90351c;

    /* renamed from: e, reason: collision with root package name */
    public volatile h f90352e;

    static {
        d0 gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(i.class, h.class, "e"), AtomicReferenceFieldUpdater.newUpdater(i.class, d.class, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM), AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            gVar = new g();
        }
        f90348h = gVar;
        if (th != null) {
            f90347g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f90349i = new Object();
    }

    public static void c(i iVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = iVar.f90352e;
            if (f90348h.i(iVar, hVar, h.f90343c)) {
                while (hVar != null) {
                    Thread thread = hVar.f90344a;
                    if (thread != null) {
                        hVar.f90344a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f90345b;
                }
                iVar.b();
                do {
                    dVar = iVar.f90351c;
                } while (!f90348h.e(iVar, dVar, d.f90332d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f90335c;
                    dVar3.f90335c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f90335c;
                    Runnable runnable = dVar2.f90333a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        iVar = fVar.f90341b;
                        if (iVar.f90350b == fVar) {
                            if (f90348h.g(iVar, fVar, f(fVar.f90342c))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, dVar2.f90334b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f90347g.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th2 = ((a) obj).f90329b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f90331a);
        }
        if (obj == f90349i) {
            return null;
        }
        return obj;
    }

    public static Object f(n1 n1Var) {
        if (n1Var instanceof i) {
            Object obj = ((i) n1Var).f90350b;
            if (!(obj instanceof a)) {
                return obj;
            }
            a aVar = (a) obj;
            return aVar.f90328a ? aVar.f90329b != null ? new a(false, aVar.f90329b) : a.f90327d : obj;
        }
        boolean zIsCancelled = n1Var.isCancelled();
        if ((!f90346f) && zIsCancelled) {
            return a.f90327d;
        }
        try {
            Object objG = g(n1Var);
            return objG == null ? f90349i : objG;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new a(false, e10);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + n1Var, e10));
        } catch (ExecutionException e11) {
            return new c(e11.getCause());
        } catch (Throwable th2) {
            return new c(th2);
        }
    }

    public static Object g(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb2) {
        try {
            Object objG = g(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objG == this ? "this future" : String.valueOf(objG));
            sb2.append(C3191e4.i.f36531e);
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append(C3191e4.i.f36531e);
        }
    }

    @Override // sh.n1
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        d dVar = this.f90351c;
        d dVar2 = d.f90332d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f90335c = dVar;
                if (f90348h.e(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f90351c;
                }
            } while (dVar != dVar2);
        }
        d(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f90350b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof w2.f
            r3 = r3 | r4
            if (r3 == 0) goto L5b
            boolean r3 = w2.i.f90346f
            if (r3 == 0) goto L1f
            w2.a r3 = new w2.a
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            w2.a r3 = w2.a.f90326c
            goto L26
        L24:
            w2.a r3 = w2.a.f90327d
        L26:
            r4 = r7
            r5 = r2
        L28:
            kotlin.jvm.internal.d0 r6 = w2.i.f90348h
            boolean r6 = r6.g(r4, r0, r3)
            if (r6 == 0) goto L54
            c(r4)
            boolean r4 = r0 instanceof w2.f
            if (r4 == 0) goto L53
            w2.f r0 = (w2.f) r0
            sh.n1 r0 = r0.f90342c
            boolean r4 = r0 instanceof w2.i
            if (r4 == 0) goto L50
            r4 = r0
            w2.i r4 = (w2.i) r4
            java.lang.Object r0 = r4.f90350b
            if (r0 != 0) goto L48
            r5 = r1
            goto L49
        L48:
            r5 = r2
        L49:
            boolean r6 = r0 instanceof w2.f
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r1
            goto L28
        L50:
            r0.cancel(r8)
        L53:
            return r1
        L54:
            java.lang.Object r0 = r4.f90350b
            boolean r6 = r0 instanceof w2.f
            if (r6 != 0) goto L28
            return r5
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.i.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        h hVar = h.f90343c;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f90350b;
        if ((obj != null) && (!(obj instanceof f))) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar2 = this.f90352e;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                z10 = true;
                do {
                    d0 d0Var = f90348h;
                    d0Var.C(hVar3, hVar2);
                    if (d0Var.i(this, hVar2, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f90350b;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(hVar3);
                    } else {
                        hVar2 = this.f90352e;
                    }
                } while (hVar2 != hVar);
            }
            return e(this.f90350b);
        }
        z10 = true;
        while (nanos > 0) {
            Object obj3 = this.f90350b;
            if ((obj3 != null ? z10 : false) && (!(obj3 instanceof f))) {
                return e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbR = e2.r(j10, "Waited ", " ");
        sbR.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbR.toString();
        if (nanos + 1000 < 0) {
            String strL = o2.l(string3, " (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z11 = (jConvert == 0 || nanos2 > 1000) ? z10 : false;
            if (jConvert > 0) {
                String strL2 = strL + jConvert + " " + lowerCase;
                if (z11) {
                    strL2 = o2.l(strL2, ",");
                }
                strL = o2.l(strL2, " ");
            }
            if (z11) {
                strL = strL + nanos2 + " nanoseconds ";
            }
            string3 = o2.l(strL, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(o2.l(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(w0.i.d(string3, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        Object obj = this.f90350b;
        if (obj instanceof f) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            n1 n1Var = ((f) obj).f90342c;
            return o2.o(sb2, n1Var == this ? "this future" : String.valueOf(n1Var), C3191e4.i.f36531e);
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(h hVar) {
        hVar.f90344a = null;
        while (true) {
            h hVar2 = this.f90352e;
            if (hVar2 == h.f90343c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f90345b;
                if (hVar2.f90344a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f90345b = hVar4;
                    if (hVar3.f90344a == null) {
                        break;
                    }
                } else if (!f90348h.i(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f90350b instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f90350b != null);
    }

    public boolean set(Object obj) {
        if (obj == null) {
            obj = f90349i;
        }
        if (!f90348h.g(this, null, obj)) {
            return false;
        }
        c(this);
        return true;
    }

    public boolean setException(Throwable th2) {
        th2.getClass();
        if (!f90348h.g(this, null, new c(th2))) {
            return false;
        }
        c(this);
        return true;
    }

    public String toString() {
        String strH;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e10) {
                strH = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                w0.i.h(sb2, "PENDING, info=[", strH, C3191e4.i.f36531e);
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append(C3191e4.i.f36531e);
        return sb2.toString();
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        Object obj;
        h hVar = h.f90343c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f90350b;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return e(obj2);
            }
            h hVar2 = this.f90352e;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                do {
                    d0 d0Var = f90348h;
                    d0Var.C(hVar3, hVar2);
                    if (d0Var.i(this, hVar2, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f90350b;
                            } else {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return e(obj);
                    }
                    hVar2 = this.f90352e;
                } while (hVar2 != hVar);
            }
            return e(this.f90350b);
        }
        throw new InterruptedException();
    }
}
