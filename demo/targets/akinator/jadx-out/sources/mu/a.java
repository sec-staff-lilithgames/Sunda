package mu;

import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import fu.q0;
import fu.s;
import fu.t;
import iu.m;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import lu.b;
import mt.b0;
import mt.i0;
import mt.l;
import mt.m0;
import mt.n0;
import mt.v;
import qt.f;
import qt.h;
import st.c;
import st.e;
import st.g;
import st.o;
import ut.o0;
import yt.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static volatile g f74930a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile o f74931b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile o f74932c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile o f74933d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile o f74934e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile o f74935f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile o f74936g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile o f74937h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile o f74938i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile o f74939j;

    /* renamed from: k, reason: collision with root package name */
    public static volatile o f74940k;

    /* renamed from: l, reason: collision with root package name */
    public static volatile o f74941l;

    /* renamed from: m, reason: collision with root package name */
    public static volatile o f74942m;

    /* renamed from: n, reason: collision with root package name */
    public static volatile o f74943n;

    /* renamed from: o, reason: collision with root package name */
    public static volatile o f74944o;

    /* renamed from: p, reason: collision with root package name */
    public static volatile o f74945p;

    /* renamed from: q, reason: collision with root package name */
    public static volatile o f74946q;

    /* renamed from: r, reason: collision with root package name */
    public static volatile o f74947r;

    /* renamed from: s, reason: collision with root package name */
    public static volatile c f74948s;

    /* renamed from: t, reason: collision with root package name */
    public static volatile c f74949t;

    /* renamed from: u, reason: collision with root package name */
    public static volatile c f74950u;

    /* renamed from: v, reason: collision with root package name */
    public static volatile c f74951v;

    /* renamed from: w, reason: collision with root package name */
    public static volatile c f74952w;

    /* renamed from: x, reason: collision with root package name */
    public static volatile e f74953x;

    /* renamed from: y, reason: collision with root package name */
    public static volatile boolean f74954y;

    /* renamed from: z, reason: collision with root package name */
    public static volatile boolean f74955z;

    public static Object a(Object obj, o oVar) {
        try {
            return oVar.apply(obj);
        } catch (Throwable th2) {
            throw m.wrapOrThrow(th2);
        }
    }

    public static m0 b(Callable callable) {
        try {
            return (m0) o0.requireNonNull(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th2) {
            throw m.wrapOrThrow(th2);
        }
    }

    public static m0 createComputationScheduler(ThreadFactory threadFactory) {
        return new fu.e((ThreadFactory) o0.requireNonNull(threadFactory, "threadFactory is null"));
    }

    public static m0 createIoScheduler(ThreadFactory threadFactory) {
        return new s((ThreadFactory) o0.requireNonNull(threadFactory, "threadFactory is null"));
    }

    public static m0 createNewThreadScheduler(ThreadFactory threadFactory) {
        return new t((ThreadFactory) o0.requireNonNull(threadFactory, "threadFactory is null"));
    }

    public static m0 createSingleScheduler(ThreadFactory threadFactory) {
        return new q0((ThreadFactory) o0.requireNonNull(threadFactory, "threadFactory is null"));
    }

    public static o getComputationSchedulerHandler() {
        return f74936g;
    }

    public static g getErrorHandler() {
        return f74930a;
    }

    public static o getInitComputationSchedulerHandler() {
        return f74932c;
    }

    public static o getInitIoSchedulerHandler() {
        return f74934e;
    }

    public static o getInitNewThreadSchedulerHandler() {
        return f74935f;
    }

    public static o getInitSingleSchedulerHandler() {
        return f74933d;
    }

    public static o getIoSchedulerHandler() {
        return f74938i;
    }

    public static o getNewThreadSchedulerHandler() {
        return f74939j;
    }

    public static e getOnBeforeBlocking() {
        return f74953x;
    }

    public static o getOnCompletableAssembly() {
        return f74946q;
    }

    public static c getOnCompletableSubscribe() {
        return f74952w;
    }

    public static o getOnConnectableFlowableAssembly() {
        return f74941l;
    }

    public static o getOnConnectableObservableAssembly() {
        return f74943n;
    }

    public static o getOnFlowableAssembly() {
        return f74940k;
    }

    public static c getOnFlowableSubscribe() {
        return f74948s;
    }

    public static o getOnMaybeAssembly() {
        return f74944o;
    }

    public static c getOnMaybeSubscribe() {
        return f74949t;
    }

    public static o getOnObservableAssembly() {
        return f74942m;
    }

    public static c getOnObservableSubscribe() {
        return f74950u;
    }

    public static o getOnParallelAssembly() {
        return f74947r;
    }

    public static o getOnSingleAssembly() {
        return f74945p;
    }

    public static c getOnSingleSubscribe() {
        return f74951v;
    }

    public static o getScheduleHandler() {
        return f74931b;
    }

    public static o getSingleSchedulerHandler() {
        return f74937h;
    }

    public static m0 initComputationScheduler(Callable<m0> callable) {
        o0.requireNonNull(callable, "Scheduler Callable can't be null");
        o oVar = f74932c;
        return oVar == null ? b(callable) : (m0) o0.requireNonNull(a(callable, oVar), "Scheduler Callable result can't be null");
    }

    public static m0 initIoScheduler(Callable<m0> callable) {
        o0.requireNonNull(callable, "Scheduler Callable can't be null");
        o oVar = f74934e;
        return oVar == null ? b(callable) : (m0) o0.requireNonNull(a(callable, oVar), "Scheduler Callable result can't be null");
    }

    public static m0 initNewThreadScheduler(Callable<m0> callable) {
        o0.requireNonNull(callable, "Scheduler Callable can't be null");
        o oVar = f74935f;
        return oVar == null ? b(callable) : (m0) o0.requireNonNull(a(callable, oVar), "Scheduler Callable result can't be null");
    }

    public static m0 initSingleScheduler(Callable<m0> callable) {
        o0.requireNonNull(callable, "Scheduler Callable can't be null");
        o oVar = f74933d;
        return oVar == null ? b(callable) : (m0) o0.requireNonNull(a(callable, oVar), "Scheduler Callable result can't be null");
    }

    public static boolean isFailOnNonBlockingScheduler() {
        return f74955z;
    }

    public static boolean isLockdown() {
        return f74954y;
    }

    public static void lockdown() {
        f74954y = true;
    }

    public static <T> mt.s onAssembly(mt.s sVar) {
        o oVar = f74944o;
        return oVar != null ? (mt.s) a(sVar, oVar) : sVar;
    }

    public static boolean onBeforeBlocking() {
        e eVar = f74953x;
        if (eVar == null) {
            return false;
        }
        try {
            return ((z) eVar).getAsBoolean();
        } catch (Throwable th2) {
            throw m.wrapOrThrow(th2);
        }
    }

    public static m0 onComputationScheduler(m0 m0Var) {
        o oVar = f74936g;
        return oVar == null ? m0Var : (m0) a(m0Var, oVar);
    }

    public static m0 onIoScheduler(m0 m0Var) {
        o oVar = f74938i;
        return oVar == null ? m0Var : (m0) a(m0Var, oVar);
    }

    public static m0 onNewThreadScheduler(m0 m0Var) {
        o oVar = f74939j;
        return oVar == null ? m0Var : (m0) a(m0Var, oVar);
    }

    public static Runnable onSchedule(Runnable runnable) {
        o0.requireNonNull(runnable, "run is null");
        o oVar = f74931b;
        return oVar == null ? runnable : (Runnable) a(runnable, oVar);
    }

    public static m0 onSingleScheduler(m0 m0Var) {
        o oVar = f74937h;
        return oVar == null ? m0Var : (m0) a(m0Var, oVar);
    }

    public static <T> tw.c onSubscribe(l lVar, tw.c cVar) {
        c cVar2 = f74948s;
        if (cVar2 == null) {
            return cVar;
        }
        try {
            return (tw.c) cVar2.apply(lVar, cVar);
        } catch (Throwable th2) {
            throw m.wrapOrThrow(th2);
        }
    }

    public static void reset() {
        setErrorHandler(null);
        setScheduleHandler(null);
        setComputationSchedulerHandler(null);
        setInitComputationSchedulerHandler(null);
        setIoSchedulerHandler(null);
        setInitIoSchedulerHandler(null);
        setSingleSchedulerHandler(null);
        setInitSingleSchedulerHandler(null);
        setNewThreadSchedulerHandler(null);
        setInitNewThreadSchedulerHandler(null);
        setOnFlowableAssembly(null);
        setOnFlowableSubscribe(null);
        setOnObservableAssembly(null);
        setOnObservableSubscribe(null);
        setOnSingleAssembly(null);
        setOnSingleSubscribe(null);
        setOnCompletableAssembly(null);
        setOnCompletableSubscribe(null);
        setOnConnectableFlowableAssembly(null);
        setOnConnectableObservableAssembly(null);
        setOnMaybeAssembly(null);
        setOnMaybeSubscribe(null);
        setOnParallelAssembly(null);
        setFailOnNonBlockingScheduler(false);
        setOnBeforeBlocking(null);
    }

    public static void setComputationSchedulerHandler(o oVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74936g = oVar;
    }

    public static void setErrorHandler(g gVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74930a = gVar;
    }

    public static void setFailOnNonBlockingScheduler(boolean z10) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74955z = z10;
    }

    public static void setInitComputationSchedulerHandler(o oVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74932c = oVar;
    }

    public static void setInitIoSchedulerHandler(o oVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74934e = oVar;
    }

    public static void setInitNewThreadSchedulerHandler(o oVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74935f = oVar;
    }

    public static void setInitSingleSchedulerHandler(o oVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74933d = oVar;
    }

    public static void setIoSchedulerHandler(o oVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74938i = oVar;
    }

    public static void setNewThreadSchedulerHandler(o oVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74939j = oVar;
    }

    public static void setOnBeforeBlocking(e eVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74953x = eVar;
    }

    public static void setOnCompletableAssembly(o oVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74946q = oVar;
    }

    public static void setOnCompletableSubscribe(c cVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74952w = cVar;
    }

    public static void setOnConnectableFlowableAssembly(o oVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74941l = oVar;
    }

    public static void setOnConnectableObservableAssembly(o oVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74943n = oVar;
    }

    public static void setOnFlowableAssembly(o oVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74940k = oVar;
    }

    public static void setOnFlowableSubscribe(c cVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74948s = cVar;
    }

    public static void setOnMaybeAssembly(o oVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74944o = oVar;
    }

    public static void setOnMaybeSubscribe(c cVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74949t = cVar;
    }

    public static void setOnObservableAssembly(o oVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74942m = oVar;
    }

    public static void setOnObservableSubscribe(c cVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74950u = cVar;
    }

    public static void setOnParallelAssembly(o oVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74947r = oVar;
    }

    public static void setOnSingleAssembly(o oVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74945p = oVar;
    }

    public static void setOnSingleSubscribe(c cVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74951v = cVar;
    }

    public static void setScheduleHandler(o oVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74931b = oVar;
    }

    public static void setSingleSchedulerHandler(o oVar) {
        if (f74954y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f74937h = oVar;
    }

    public static void onError(Throwable th2) {
        g gVar = f74930a;
        if (th2 == null) {
            th2 = new NullPointerException(TJzY.pZztfzSxKqxwmI);
        } else if (!(th2 instanceof f) && !(th2 instanceof qt.e) && !(th2 instanceof IllegalStateException) && !(th2 instanceof NullPointerException) && !(th2 instanceof IllegalArgumentException) && !(th2 instanceof qt.c)) {
            th2 = new h(th2);
        }
        if (gVar != null) {
            try {
                gVar.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th3);
            }
        }
        th2.printStackTrace();
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }

    public static <T> l onAssembly(l lVar) {
        o oVar = f74940k;
        return oVar != null ? (l) a(lVar, oVar) : lVar;
    }

    public static <T> rt.a onAssembly(rt.a aVar) {
        o oVar = f74941l;
        return oVar != null ? (rt.a) a(aVar, oVar) : aVar;
    }

    public static <T> i0 onSubscribe(b0 b0Var, i0 i0Var) {
        c cVar = f74950u;
        if (cVar == null) {
            return i0Var;
        }
        try {
            return (i0) cVar.apply(b0Var, i0Var);
        } catch (Throwable th2) {
            throw m.wrapOrThrow(th2);
        }
    }

    public static <T> b0 onAssembly(b0 b0Var) {
        o oVar = f74942m;
        return oVar != null ? (b0) a(b0Var, oVar) : b0Var;
    }

    public static <T> ju.a onAssembly(ju.a aVar) {
        o oVar = f74943n;
        return oVar != null ? (ju.a) a(aVar, oVar) : aVar;
    }

    public static <T> mt.q0 onSubscribe(n0<T> n0Var, mt.q0 q0Var) {
        c cVar = f74951v;
        if (cVar == null) {
            return q0Var;
        }
        try {
            return (mt.q0) cVar.apply(n0Var, q0Var);
        } catch (Throwable th2) {
            throw m.wrapOrThrow(th2);
        }
    }

    public static <T> n0<T> onAssembly(n0<T> n0Var) {
        o oVar = f74945p;
        return oVar != null ? (n0) a(n0Var, oVar) : n0Var;
    }

    public static mt.c onAssembly(mt.c cVar) {
        o oVar = f74946q;
        return oVar != null ? (mt.c) a(cVar, oVar) : cVar;
    }

    public static mt.f onSubscribe(mt.c cVar, mt.f fVar) {
        c cVar2 = f74952w;
        if (cVar2 == null) {
            return fVar;
        }
        try {
            return (mt.f) cVar2.apply(cVar, fVar);
        } catch (Throwable th2) {
            throw m.wrapOrThrow(th2);
        }
    }

    public static <T> b onAssembly(b bVar) {
        o oVar = f74947r;
        return oVar != null ? (b) a(bVar, oVar) : bVar;
    }

    public static <T> v onSubscribe(mt.s sVar, v vVar) {
        c cVar = f74949t;
        if (cVar == null) {
            return vVar;
        }
        try {
            return (v) cVar.apply(sVar, vVar);
        } catch (Throwable th2) {
            throw m.wrapOrThrow(th2);
        }
    }
}
