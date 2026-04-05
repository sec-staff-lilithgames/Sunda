package pt;

import iu.m;
import iu.w;
import java.util.ArrayList;
import ut.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements c, tt.c {

    /* renamed from: b, reason: collision with root package name */
    public w f81820b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f81821c;

    public b() {
    }

    public static void a(w wVar) {
        if (wVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : wVar.keys()) {
            if (obj instanceof c) {
                try {
                    ((c) obj).dispose();
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new qt.c(arrayList);
            }
            throw m.wrapOrThrow((Throwable) arrayList.get(0));
        }
    }

    @Override // tt.c
    public boolean add(c cVar) {
        o0.requireNonNull(cVar, "disposable is null");
        if (!this.f81821c) {
            synchronized (this) {
                try {
                    if (!this.f81821c) {
                        w wVar = this.f81820b;
                        if (wVar == null) {
                            wVar = new w();
                            this.f81820b = wVar;
                        }
                        wVar.add(cVar);
                        return true;
                    }
                } finally {
                }
            }
        }
        cVar.dispose();
        return false;
    }

    public boolean addAll(c... cVarArr) {
        o0.requireNonNull(cVarArr, "disposables is null");
        if (!this.f81821c) {
            synchronized (this) {
                try {
                    if (!this.f81821c) {
                        w wVar = this.f81820b;
                        if (wVar == null) {
                            wVar = new w(cVarArr.length + 1);
                            this.f81820b = wVar;
                        }
                        for (c cVar : cVarArr) {
                            o0.requireNonNull(cVar, "A Disposable in the disposables array is null");
                            wVar.add(cVar);
                        }
                        return true;
                    }
                } finally {
                }
            }
        }
        for (c cVar2 : cVarArr) {
            cVar2.dispose();
        }
        return false;
    }

    public void clear() {
        if (this.f81821c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f81821c) {
                    return;
                }
                w wVar = this.f81820b;
                this.f81820b = null;
                a(wVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // tt.c
    public boolean delete(c cVar) {
        o0.requireNonNull(cVar, "disposables is null");
        if (this.f81821c) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f81821c) {
                    return false;
                }
                w wVar = this.f81820b;
                if (wVar != null && wVar.remove(cVar)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        if (this.f81821c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f81821c) {
                    return;
                }
                this.f81821c = true;
                w wVar = this.f81820b;
                this.f81820b = null;
                a(wVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f81821c;
    }

    @Override // tt.c
    public boolean remove(c cVar) {
        if (!delete(cVar)) {
            return false;
        }
        cVar.dispose();
        return true;
    }

    public int size() {
        if (this.f81821c) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f81821c) {
                    return 0;
                }
                w wVar = this.f81820b;
                return wVar != null ? wVar.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(c... cVarArr) {
        o0.requireNonNull(cVarArr, "disposables is null");
        this.f81820b = new w(cVarArr.length + 1);
        for (c cVar : cVarArr) {
            o0.requireNonNull(cVar, "A Disposable in the disposables array is null");
            this.f81820b.add(cVar);
        }
    }

    public b(Iterable<? extends c> iterable) {
        o0.requireNonNull(iterable, "disposables is null");
        this.f81820b = new w();
        for (c cVar : iterable) {
            o0.requireNonNull(cVar, "A Disposable item in the disposables sequence is null");
            this.f81820b.add(cVar);
        }
    }
}
