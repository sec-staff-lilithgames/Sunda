package nt;

import java.util.concurrent.Callable;
import mt.m0;
import qt.d;
import st.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static volatile o f77200a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile o f77201b;

    public static o getInitMainThreadSchedulerHandler() {
        return f77200a;
    }

    public static o getOnMainThreadSchedulerHandler() {
        return f77201b;
    }

    public static m0 initMainThreadScheduler(Callable<m0> callable) {
        RuntimeException runtimeExceptionPropagate;
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        o oVar = f77200a;
        if (oVar == null) {
            try {
                m0 m0VarCall = callable.call();
                if (m0VarCall != null) {
                    return m0VarCall;
                }
                throw new NullPointerException("Scheduler Callable returned null");
            } finally {
            }
        }
        try {
            m0 m0Var = (m0) oVar.apply(callable);
            if (m0Var != null) {
                return m0Var;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } finally {
        }
    }

    public static m0 onMainThreadScheduler(m0 m0Var) {
        if (m0Var == null) {
            throw new NullPointerException("scheduler == null");
        }
        o oVar = f77201b;
        if (oVar == null) {
            return m0Var;
        }
        try {
            return (m0) oVar.apply(m0Var);
        } catch (Throwable th2) {
            throw d.propagate(th2);
        }
    }

    public static void reset() {
        setInitMainThreadSchedulerHandler(null);
        setMainThreadSchedulerHandler(null);
    }

    public static void setInitMainThreadSchedulerHandler(o oVar) {
        f77200a = oVar;
    }

    public static void setMainThreadSchedulerHandler(o oVar) {
        f77201b = oVar;
    }
}
