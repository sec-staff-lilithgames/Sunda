package sh;

import ao.kwoC.zAQQWzBxnS;
import com.ironsource.C3191e4;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import j1.o2;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mh.u2;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class k extends t {
    public static void f(k kVar, boolean z10) {
        h hVar = null;
        while (true) {
            for (s sVarM = t.f85861i.m(kVar); sVarM != null; sVarM = sVarM.f85856b) {
                Thread thread = sVarM.f85855a;
                if (thread != null) {
                    sVarM.f85855a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z10) {
                kVar.j();
                z10 = false;
            }
            kVar.d();
            h hVar2 = hVar;
            h hVarL = t.f85861i.l(kVar);
            h hVar3 = hVar2;
            while (hVarL != null) {
                h hVar4 = hVarL.f85816c;
                hVarL.f85816c = hVar3;
                hVar3 = hVarL;
                hVarL = hVar4;
            }
            while (hVar3 != null) {
                hVar = hVar3.f85816c;
                Runnable runnable = hVar3.f85814a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof e) {
                    e eVar = (e) runnable;
                    kVar = eVar.f85801b;
                    if (kVar.f85862b == eVar) {
                        if (t.f85861i.f(kVar, eVar, i(eVar.f85802c))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = hVar3.f85815b;
                    Objects.requireNonNull(executor);
                    g(runnable, executor);
                }
                hVar3 = hVar;
            }
            return;
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            t.f85859g.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object h(Object obj) throws ExecutionException {
        if (obj instanceof d) {
            Throwable th2 = ((d) obj).f85796b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof g) {
            throw new ExecutionException(((g) obj).f85809a);
        }
        if (obj == t.f85858f) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object i(n1 n1Var) {
        Object obj;
        Throwable thTryInternalFastPathGetFailure;
        if (n1Var instanceof i) {
            Object dVar = ((k) n1Var).f85862b;
            if (dVar instanceof d) {
                d dVar2 = (d) dVar;
                if (dVar2.f85795a) {
                    dVar = dVar2.f85796b != null ? new d(false, dVar2.f85796b) : d.f85794d;
                }
            }
            Objects.requireNonNull(dVar);
            return dVar;
        }
        if ((n1Var instanceof th.a) && (thTryInternalFastPathGetFailure = th.b.tryInternalFastPathGetFailure((th.a) n1Var)) != null) {
            return new g(thTryInternalFastPathGetFailure);
        }
        boolean zIsCancelled = n1Var.isCancelled();
        boolean z10 = true;
        if ((!t.f85860h) && zIsCancelled) {
            d dVar3 = d.f85794d;
            Objects.requireNonNull(dVar3);
            return dVar3;
        }
        boolean z11 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = n1Var.get();
                        break;
                    } catch (Error e10) {
                        e = e10;
                        return new g(e);
                    }
                } catch (InterruptedException unused) {
                    z11 = z10;
                } catch (Throwable th2) {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | Exception e11) {
                e = e11;
                return new g(e);
            } catch (CancellationException e12) {
                if (zIsCancelled) {
                    return new d(false, e12);
                }
                return new g(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + n1Var, e12));
            } catch (ExecutionException e13) {
                if (!zIsCancelled) {
                    return new g(e13.getCause());
                }
                return new d(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + n1Var, e13));
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? t.f85858f : obj;
        }
        return new d(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + n1Var));
    }

    @Override // th.a
    public final Throwable a() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f85862b;
        if (obj instanceof g) {
            return ((g) obj).f85809a;
        }
        return null;
    }

    @Override // sh.t, sh.n1
    public void addListener(Runnable runnable, Executor executor) {
        h hVar;
        h hVar2 = h.f85813d;
        mh.p1.checkNotNull(runnable, "Runnable was null.");
        mh.p1.checkNotNull(executor, "Executor was null.");
        if (!isDone() && (hVar = this.f85863c) != hVar2) {
            h hVar3 = new h(runnable, executor);
            do {
                hVar3.f85816c = hVar;
                if (t.f85861i.d(this, hVar, hVar3)) {
                    return;
                } else {
                    hVar = this.f85863c;
                }
            } while (hVar != hVar2);
        }
        g(runnable, executor);
    }

    public final void c(StringBuilder sb2) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (ExecutionException e10) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e10.getCause());
                sb2.append(C3191e4.i.f36531e);
                return;
            } catch (Exception e11) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e11.getClass());
                sb2.append(" thrown from get()]");
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        e(sb2, obj);
        sb2.append(C3191e4.i.f36531e);
    }

    public void d() {
    }

    public final void e(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append(AbstractJsonLexerKt.NULL);
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    public Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        long j11;
        s sVar = s.f85854c;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f85862b;
        if ((obj != null) && (!(obj instanceof e))) {
            return h(obj);
        }
        long j12 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            s sVar2 = this.f85864e;
            if (sVar2 != sVar) {
                s sVar3 = new s();
                z10 = true;
                while (true) {
                    kotlin.jvm.internal.d0 d0Var = t.f85861i;
                    d0Var.B(sVar3, sVar2);
                    if (d0Var.h(this, sVar2, sVar3)) {
                        j11 = j12;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                b(sVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f85862b;
                            if ((obj2 != null) && (!(obj2 instanceof e))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        b(sVar3);
                    } else {
                        long j13 = j12;
                        sVar2 = this.f85864e;
                        if (sVar2 == sVar) {
                            break;
                        }
                        j12 = j13;
                    }
                }
            }
            Object obj3 = this.f85862b;
            Objects.requireNonNull(obj3);
            return h(obj3);
        }
        z10 = true;
        j11 = 0;
        while (nanos > j11) {
            Object obj4 = this.f85862b;
            if ((obj4 != null ? z10 : false) && (!(obj4 instanceof e))) {
                return h(obj4);
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
        StringBuilder sbR = b0.e2.r(j10, "Waited ", " ");
        sbR.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbR.toString();
        if (nanos + 1000 < j11) {
            String strL = o2.l(string3, " (plus ");
            long j14 = -nanos;
            long jConvert = timeUnit.convert(j14, TimeUnit.NANOSECONDS);
            long nanos2 = j14 - timeUnit.toNanos(jConvert);
            boolean z11 = (jConvert == j11 || nanos2 > 1000) ? z10 : false;
            if (jConvert > j11) {
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

    public boolean isCancelled() {
        return this.f85862b instanceof d;
    }

    public boolean isDone() {
        return (!(r0 instanceof e)) & (this.f85862b != null);
    }

    public void j() {
    }

    public final void k(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(m());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String l() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final boolean m() {
        Object obj = this.f85862b;
        return (obj instanceof d) && ((d) obj).f85795a;
    }

    public boolean set(Object obj) {
        if (obj == null) {
            obj = t.f85858f;
        }
        if (!t.f85861i.f(this, null, obj)) {
            return false;
        }
        f(this, false);
        return true;
    }

    public boolean setException(Throwable th2) {
        if (!t.f85861i.f(this, null, new g((Throwable) mh.p1.checkNotNull(th2)))) {
            return false;
        }
        f(this, false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean setFuture(sh.n1 r6) {
        /*
            r5 = this;
            mh.p1.checkNotNull(r6)
            java.lang.Object r0 = r5.f85862b
            r1 = 0
            if (r0 != 0) goto L44
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            java.lang.Object r6 = i(r6)
            kotlin.jvm.internal.d0 r0 = sh.t.f85861i
            boolean r6 = r0.f(r5, r3, r6)
            if (r6 == 0) goto L4f
            f(r5, r1)
            return r2
        L20:
            sh.e r0 = new sh.e
            r0.<init>(r5, r6)
            kotlin.jvm.internal.d0 r4 = sh.t.f85861i
            boolean r3 = r4.f(r5, r3, r0)
            if (r3 == 0) goto L42
            sh.l0 r1 = sh.l0.f85835b     // Catch: java.lang.Throwable -> L33
            r6.addListener(r0, r1)     // Catch: java.lang.Throwable -> L33
            return r2
        L33:
            r6 = move-exception
            sh.g r1 = new sh.g     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            sh.g r1 = sh.g.f85808b
        L3c:
            kotlin.jvm.internal.d0 r6 = sh.t.f85861i
            r6.f(r5, r0, r1)
            return r2
        L42:
            java.lang.Object r0 = r5.f85862b
        L44:
            boolean r2 = r0 instanceof sh.d
            if (r2 == 0) goto L4f
            sh.d r0 = (sh.d) r0
            boolean r0 = r0.f85795a
            r6.cancel(r0)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.k.setFuture(sh.n1):boolean");
    }

    public boolean cancel(boolean z10) {
        d dVar;
        Object obj = this.f85862b;
        if (!(obj == null) && !(obj instanceof e)) {
            return false;
        }
        if (t.f85860h) {
            dVar = new d(z10, new CancellationException(QpyI.nLvvmNOgNAKlgc));
        } else {
            dVar = z10 ? d.f85793c : d.f85794d;
            Objects.requireNonNull(dVar);
        }
        k kVar = this;
        boolean z11 = false;
        while (true) {
            if (t.f85861i.f(kVar, obj, dVar)) {
                f(kVar, z10);
                if (!(obj instanceof e)) {
                    break;
                }
                n1 n1Var = ((e) obj).f85802c;
                if (!(n1Var instanceof i)) {
                    n1Var.cancel(z10);
                    break;
                }
                kVar = (k) n1Var;
                obj = kVar.f85862b;
                if (!(obj == null) && !(obj instanceof e)) {
                    break;
                }
                z11 = true;
            } else {
                obj = kVar.f85862b;
                if (!(obj instanceof e)) {
                    return z11;
                }
            }
        }
        return true;
    }

    public String toString() {
        String strEmptyToNull;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        boolean zIsCancelled = isCancelled();
        String str = zAQQWzBxnS.bGcXrYDyZwxvnB;
        if (zIsCancelled) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            c(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f85862b;
            if (obj instanceof e) {
                sb2.append(", setFuture=[");
                n1 n1Var = ((e) obj).f85802c;
                try {
                    if (n1Var == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(n1Var);
                    }
                } catch (Throwable th2) {
                    mh.p1.checkNotNull(th2);
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(th2.getClass());
                }
                sb2.append(str);
            } else {
                try {
                    strEmptyToNull = u2.emptyToNull(l());
                } catch (Throwable th3) {
                    mh.p1.checkNotNull(th3);
                    if ((th3 instanceof Error) && !(th3 instanceof StackOverflowError)) {
                        throw th3;
                    }
                    strEmptyToNull = "Exception thrown from implementation: " + th3.getClass();
                }
                if (strEmptyToNull != null) {
                    w0.i.h(sb2, KGUkpTlXZlJLy.YOxIDjJQNVKwtyF, strEmptyToNull, str);
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                c(sb2);
            }
        }
        sb2.append(str);
        return sb2.toString();
    }

    public Object get() throws ExecutionException, InterruptedException {
        Object obj;
        s sVar = s.f85854c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f85862b;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return h(obj2);
            }
            s sVar2 = this.f85864e;
            if (sVar2 != sVar) {
                s sVar3 = new s();
                do {
                    kotlin.jvm.internal.d0 d0Var = t.f85861i;
                    d0Var.B(sVar3, sVar2);
                    if (d0Var.h(this, sVar2, sVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f85862b;
                            } else {
                                b(sVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return h(obj);
                    }
                    sVar2 = this.f85864e;
                } while (sVar2 != sVar);
            }
            Object obj3 = this.f85862b;
            Objects.requireNonNull(obj3);
            return h(obj3);
        }
        throw new InterruptedException();
    }
}
