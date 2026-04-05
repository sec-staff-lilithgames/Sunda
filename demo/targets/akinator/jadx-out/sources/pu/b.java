package pu;

import iu.l;
import iu.m;
import iu.u;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import mt.i0;
import ut.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends f {

    /* renamed from: i, reason: collision with root package name */
    public static final Object[] f81831i = new Object[0];

    /* renamed from: j, reason: collision with root package name */
    public static final a[] f81832j = new a[0];

    /* renamed from: k, reason: collision with root package name */
    public static final a[] f81833k = new a[0];

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f81834b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f81835c;

    /* renamed from: e, reason: collision with root package name */
    public final Lock f81836e;

    /* renamed from: f, reason: collision with root package name */
    public final Lock f81837f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f81838g;

    /* renamed from: h, reason: collision with root package name */
    public long f81839h;

    public b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f81836e = reentrantReadWriteLock.readLock();
        this.f81837f = reentrantReadWriteLock.writeLock();
        this.f81835c = new AtomicReference(f81832j);
        this.f81834b = new AtomicReference();
        this.f81838g = new AtomicReference();
    }

    public static <T> b create() {
        return new b();
    }

    public static <T> b createDefault(T t10) {
        b bVar = new b();
        bVar.f81834b.lazySet(o0.requireNonNull(t10, "defaultValue is null"));
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(a aVar) {
        a[] aVarArr;
        while (true) {
            AtomicReference atomicReference = this.f81835c;
            a[] aVarArr2 = (a[]) atomicReference.get();
            int length = aVarArr2.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (aVarArr2[i10] == aVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                aVarArr = f81832j;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr2, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr = aVarArr3;
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // pu.f
    public Throwable getThrowable() {
        Object obj = this.f81834b.get();
        if (u.isError(obj)) {
            return u.getError(obj);
        }
        return null;
    }

    public Object getValue() {
        Object obj = this.f81834b.get();
        if (u.isComplete(obj) || u.isError(obj)) {
            return null;
        }
        return u.getValue(obj);
    }

    @Deprecated
    public Object[] getValues() {
        Object[] objArr = f81831i;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // pu.f
    public boolean hasComplete() {
        return u.isComplete(this.f81834b.get());
    }

    @Override // pu.f
    public boolean hasObservers() {
        return ((a[]) this.f81835c.get()).length != 0;
    }

    @Override // pu.f
    public boolean hasThrowable() {
        return u.isError(this.f81834b.get());
    }

    public boolean hasValue() {
        Object obj = this.f81834b.get();
        return (obj == null || u.isComplete(obj) || u.isError(obj)) ? false : true;
    }

    @Override // pu.f, mt.i0, mt.f
    public void onComplete() {
        AtomicReference atomicReference;
        l lVar = m.f68415a;
        do {
            atomicReference = this.f81838g;
            if (atomicReference.compareAndSet(null, lVar)) {
                Object objComplete = u.complete();
                AtomicReference atomicReference2 = this.f81835c;
                a[] aVarArr = f81833k;
                a[] aVarArr2 = (a[]) atomicReference2.getAndSet(aVarArr);
                if (aVarArr2 != aVarArr) {
                    Lock lock = this.f81837f;
                    lock.lock();
                    this.f81839h++;
                    this.f81834b.lazySet(objComplete);
                    lock.unlock();
                }
                for (a aVar : aVarArr2) {
                    aVar.a(this.f81839h, objComplete);
                }
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // pu.f, mt.i0, mt.f
    public void onError(Throwable th2) {
        AtomicReference atomicReference;
        o0.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        do {
            atomicReference = this.f81838g;
            if (atomicReference.compareAndSet(null, th2)) {
                Object objError = u.error(th2);
                AtomicReference atomicReference2 = this.f81835c;
                a[] aVarArr = f81833k;
                a[] aVarArr2 = (a[]) atomicReference2.getAndSet(aVarArr);
                if (aVarArr2 != aVarArr) {
                    Lock lock = this.f81837f;
                    lock.lock();
                    this.f81839h++;
                    this.f81834b.lazySet(objError);
                    lock.unlock();
                }
                for (a aVar : aVarArr2) {
                    aVar.a(this.f81839h, objError);
                }
                return;
            }
        } while (atomicReference.get() == null);
        mu.a.onError(th2);
    }

    @Override // pu.f, mt.i0
    public void onNext(Object obj) {
        o0.requireNonNull(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f81838g.get() != null) {
            return;
        }
        Object next = u.next(obj);
        Lock lock = this.f81837f;
        lock.lock();
        this.f81839h++;
        this.f81834b.lazySet(next);
        lock.unlock();
        for (a aVar : (a[]) this.f81835c.get()) {
            aVar.a(this.f81839h, next);
        }
    }

    @Override // pu.f, mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (this.f81838g.get() != null) {
            cVar.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mt.b0
    public final void subscribeActual(i0 i0Var) {
        iu.b bVar;
        a aVar = new a(i0Var, this);
        i0Var.onSubscribe(aVar);
        AtomicReference atomicReference = this.f81835c;
        while (true) {
            a[] aVarArr = (a[]) atomicReference.get();
            if (aVarArr == f81833k) {
                Throwable th2 = (Throwable) this.f81838g.get();
                if (th2 == m.f68415a) {
                    i0Var.onComplete();
                    return;
                } else {
                    i0Var.onError(th2);
                    return;
                }
            }
            int length = aVarArr.length;
            a[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
            if (aVar.f81829i) {
                d(aVar);
                return;
            }
            if (aVar.f81829i) {
                return;
            }
            synchronized (aVar) {
                try {
                    if (aVar.f81829i) {
                        return;
                    }
                    if (aVar.f81825e) {
                        return;
                    }
                    b bVar2 = aVar.f81824c;
                    Lock lock = bVar2.f81836e;
                    lock.lock();
                    aVar.f81830j = bVar2.f81839h;
                    Object obj = bVar2.f81834b.get();
                    lock.unlock();
                    aVar.f81826f = obj != null;
                    aVar.f81825e = true;
                    if (obj == null || aVar.test(obj)) {
                        return;
                    }
                    while (!aVar.f81829i) {
                        synchronized (aVar) {
                            try {
                                bVar = aVar.f81827g;
                                if (bVar == null) {
                                    aVar.f81826f = false;
                                    return;
                                }
                                aVar.f81827g = null;
                            } finally {
                            }
                        }
                        bVar.forEachWhile(aVar);
                    }
                    return;
                } finally {
                }
            }
        }
    }

    @Deprecated
    public Object[] getValues(Object[] objArr) {
        Object obj = this.f81834b.get();
        if (obj != null && !u.isComplete(obj) && !u.isError(obj)) {
            Object value = u.getValue(obj);
            if (objArr.length != 0) {
                objArr[0] = value;
                if (objArr.length != 1) {
                    objArr[1] = null;
                }
                return objArr;
            }
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
            objArr2[0] = value;
            return objArr2;
        }
        if (objArr.length != 0) {
            objArr[0] = null;
        }
        return objArr;
    }
}
