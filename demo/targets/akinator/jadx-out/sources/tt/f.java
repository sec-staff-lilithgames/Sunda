package tt;

import iu.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import ut.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f implements pt.c, c {

    /* renamed from: b, reason: collision with root package name */
    public LinkedList f87357b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f87358c;

    public f() {
    }

    public static void a(LinkedList linkedList) {
        if (linkedList == null) {
            return;
        }
        Iterator it = linkedList.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                ((pt.c) it.next()).dispose();
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th2);
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
    public boolean add(pt.c cVar) {
        o0.requireNonNull(cVar, "d is null");
        if (!this.f87358c) {
            synchronized (this) {
                try {
                    if (!this.f87358c) {
                        LinkedList linkedList = this.f87357b;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f87357b = linkedList;
                        }
                        linkedList.add(cVar);
                        return true;
                    }
                } finally {
                }
            }
        }
        cVar.dispose();
        return false;
    }

    public boolean addAll(pt.c... cVarArr) {
        o0.requireNonNull(cVarArr, "ds is null");
        if (!this.f87358c) {
            synchronized (this) {
                try {
                    if (!this.f87358c) {
                        LinkedList linkedList = this.f87357b;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f87357b = linkedList;
                        }
                        for (pt.c cVar : cVarArr) {
                            o0.requireNonNull(cVar, "d is null");
                            linkedList.add(cVar);
                        }
                        return true;
                    }
                } finally {
                }
            }
        }
        for (pt.c cVar2 : cVarArr) {
            cVar2.dispose();
        }
        return false;
    }

    public void clear() {
        if (this.f87358c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f87358c) {
                    return;
                }
                LinkedList linkedList = this.f87357b;
                this.f87357b = null;
                a(linkedList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // tt.c
    public boolean delete(pt.c cVar) {
        o0.requireNonNull(cVar, "Disposable item is null");
        if (this.f87358c) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f87358c) {
                    return false;
                }
                LinkedList linkedList = this.f87357b;
                if (linkedList != null && linkedList.remove(cVar)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        if (this.f87358c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f87358c) {
                    return;
                }
                this.f87358c = true;
                LinkedList linkedList = this.f87357b;
                this.f87357b = null;
                a(linkedList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f87358c;
    }

    @Override // tt.c
    public boolean remove(pt.c cVar) {
        if (!delete(cVar)) {
            return false;
        }
        cVar.dispose();
        return true;
    }

    public f(pt.c... cVarArr) {
        o0.requireNonNull(cVarArr, "resources is null");
        this.f87357b = new LinkedList();
        for (pt.c cVar : cVarArr) {
            o0.requireNonNull(cVar, "Disposable item is null");
            this.f87357b.add(cVar);
        }
    }

    public f(Iterable<? extends pt.c> iterable) {
        o0.requireNonNull(iterable, "resources is null");
        this.f87357b = new LinkedList();
        for (pt.c cVar : iterable) {
            o0.requireNonNull(cVar, "Disposable item is null");
            this.f87357b.add(cVar);
        }
    }
}
