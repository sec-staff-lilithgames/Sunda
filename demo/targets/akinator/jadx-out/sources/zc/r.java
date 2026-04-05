package zc;

import dd.m0;
import java.util.concurrent.atomic.AtomicReference;
import jc.u0;
import jc.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final dd.u f97795a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f97796b;

    public r() {
        this(4000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAndResolveNonTypedSerializer(Class<?> cls, w wVar, u0 u0Var) throws jc.r {
        synchronized (this) {
            try {
                if (this.f97795a.put(new m0(cls, false), wVar) == null) {
                    this.f97796b.set(null);
                }
                if (wVar instanceof q) {
                    ((q) wVar).resolve(u0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addTypedSerializer(jc.o oVar, w wVar) {
        synchronized (this) {
            try {
                if (this.f97795a.put(new m0(oVar, true), wVar) == null) {
                    this.f97796b.set(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void flush() {
        this.f97795a.clear();
        this.f97796b.set(null);
    }

    public ad.u getReadOnlyLookupMap() {
        ad.u uVarFrom;
        ad.u uVar = (ad.u) this.f97796b.get();
        if (uVar != null) {
            return uVar;
        }
        synchronized (this) {
            uVarFrom = (ad.u) this.f97796b.get();
            if (uVarFrom == null) {
                uVarFrom = ad.u.from(this.f97795a);
                this.f97796b.set(uVarFrom);
            }
        }
        return uVarFrom;
    }

    public synchronized int size() {
        return this.f97795a.size();
    }

    public w typedValueSerializer(jc.o oVar) {
        w wVar;
        synchronized (this) {
            wVar = (w) this.f97795a.get(new m0(oVar, true));
        }
        return wVar;
    }

    public w untypedValueSerializer(Class<?> cls) {
        w wVar;
        synchronized (this) {
            wVar = (w) this.f97795a.get(new m0(cls, false));
        }
        return wVar;
    }

    public r(int i10) {
        this.f97796b = new AtomicReference();
        this.f97795a = new dd.s(Math.min(64, i10 >> 2), i10);
    }

    public w typedValueSerializer(Class<?> cls) {
        w wVar;
        synchronized (this) {
            wVar = (w) this.f97795a.get(new m0(cls, true));
        }
        return wVar;
    }

    public w untypedValueSerializer(jc.o oVar) {
        w wVar;
        synchronized (this) {
            wVar = (w) this.f97795a.get(new m0(oVar, false));
        }
        return wVar;
    }

    public void addTypedSerializer(Class<?> cls, w wVar) {
        synchronized (this) {
            try {
                if (this.f97795a.put(new m0(cls, true), wVar) == null) {
                    this.f97796b.set(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public r(dd.u uVar) {
        this.f97796b = new AtomicReference();
        this.f97795a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAndResolveNonTypedSerializer(jc.o oVar, w wVar, u0 u0Var) throws jc.r {
        synchronized (this) {
            try {
                if (this.f97795a.put(new m0(oVar, false), wVar) == null) {
                    this.f97796b.set(null);
                }
                if (wVar instanceof q) {
                    ((q) wVar).resolve(u0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAndResolveNonTypedSerializer(Class<?> cls, jc.o oVar, w wVar, u0 u0Var) throws jc.r {
        synchronized (this) {
            try {
                Object objPut = this.f97795a.put(new m0(cls, false), wVar);
                Object objPut2 = this.f97795a.put(new m0(oVar, false), wVar);
                if (objPut == null || objPut2 == null) {
                    this.f97796b.set(null);
                }
                if (wVar instanceof q) {
                    ((q) wVar).resolve(u0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
