package nh;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class e9 extends ReentrantLock {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f76213i = 0;

    /* renamed from: b, reason: collision with root package name */
    public final fa f76214b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f76215c;

    /* renamed from: e, reason: collision with root package name */
    public int f76216e;

    /* renamed from: f, reason: collision with root package name */
    public int f76217f;

    /* renamed from: g, reason: collision with root package name */
    public volatile AtomicReferenceArray f76218g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f76219h = new AtomicInteger();

    public e9(fa faVar, int i10) {
        this.f76214b = faVar;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i10);
        this.f76217f = (atomicReferenceArray.length() * 3) / 4;
        this.f76218g = atomicReferenceArray;
    }

    public final void a(ReferenceQueue referenceQueue) {
        int i10 = 0;
        do {
            Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            a9 a9Var = (a9) objPoll;
            fa faVar = this.f76214b;
            faVar.getClass();
            int hash = a9Var.getHash();
            e9 e9VarB = faVar.b(hash);
            e9VarB.lock();
            try {
                AtomicReferenceArray atomicReferenceArray = e9VarB.f76218g;
                int length = hash & (atomicReferenceArray.length() - 1);
                a9 a9Var2 = (a9) atomicReferenceArray.get(length);
                a9 next = a9Var2;
                while (true) {
                    if (next == null) {
                        break;
                    }
                    if (next == a9Var) {
                        e9VarB.f76216e++;
                        a9 a9VarI = e9VarB.i(a9Var2, next);
                        int i11 = e9VarB.f76215c - 1;
                        atomicReferenceArray.set(length, a9VarI);
                        e9VarB.f76215c = i11;
                        break;
                    }
                    next = next.getNext();
                }
                i10++;
            } finally {
                e9VarB.unlock();
            }
        } while (i10 != 16);
    }

    public final void b(ReferenceQueue referenceQueue) {
        int i10 = 0;
        do {
            Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            ca caVar = (ca) objPoll;
            fa faVar = this.f76214b;
            faVar.getClass();
            a9 entry = caVar.getEntry();
            int hash = entry.getHash();
            e9 e9VarB = faVar.b(hash);
            Object key = entry.getKey();
            e9VarB.lock();
            try {
                AtomicReferenceArray atomicReferenceArray = e9VarB.f76218g;
                int length = (atomicReferenceArray.length() - 1) & hash;
                a9 a9Var = (a9) atomicReferenceArray.get(length);
                a9 next = a9Var;
                while (true) {
                    if (next == null) {
                        break;
                    }
                    Object key2 = next.getKey();
                    if (next.getHash() != hash || key2 == null || !e9VarB.f76214b.f76263g.equivalent(key, key2)) {
                        next = next.getNext();
                    } else if (((ba) next).getValueReference() == caVar) {
                        e9VarB.f76216e++;
                        a9 a9VarI = e9VarB.i(a9Var, next);
                        int i11 = e9VarB.f76215c - 1;
                        atomicReferenceArray.set(length, a9VarI);
                        e9VarB.f76215c = i11;
                    }
                }
                i10++;
            } finally {
                e9VarB.unlock();
            }
        } while (i10 != 16);
    }

    public final void c() {
        AtomicReferenceArray atomicReferenceArray = this.f76218g;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i10 = this.f76215c;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
        this.f76217f = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i11 = 0; i11 < length; i11++) {
            a9 next = (a9) atomicReferenceArray.get(i11);
            if (next != null) {
                a9 next2 = next.getNext();
                int hash = next.getHash() & length2;
                if (next2 == null) {
                    atomicReferenceArray2.set(hash, next);
                } else {
                    a9 a9Var = next;
                    while (next2 != null) {
                        int hash2 = next2.getHash() & length2;
                        if (hash2 != hash) {
                            a9Var = next2;
                            hash = hash2;
                        }
                        next2 = next2.getNext();
                    }
                    atomicReferenceArray2.set(hash, a9Var);
                    while (next != a9Var) {
                        int hash3 = next.getHash() & length2;
                        a9 a9VarCopy = this.f76214b.f76264h.copy(k(), next, (a9) atomicReferenceArray2.get(hash3));
                        if (a9VarCopy != null) {
                            atomicReferenceArray2.set(hash3, a9VarCopy);
                        } else {
                            i10--;
                        }
                        next = next.getNext();
                    }
                }
            }
        }
        this.f76218g = atomicReferenceArray2;
        this.f76215c = i10;
    }

    public final a9 d(int i10, Object obj) {
        if (this.f76215c == 0) {
            return null;
        }
        for (a9 next = (a9) this.f76218g.get((r0.length() - 1) & i10); next != null; next = next.getNext()) {
            if (next.getHash() == i10) {
                Object key = next.getKey();
                if (key == null) {
                    m();
                } else if (this.f76214b.f76263g.equivalent(obj, key)) {
                    return next;
                }
            }
        }
        return null;
    }

    public final void g() {
        if ((this.f76219h.incrementAndGet() & 63) == 0) {
            j();
        }
    }

    public final Object h(Object obj, int i10, Object obj2, boolean z10) {
        lock();
        try {
            j();
            int i11 = this.f76215c + 1;
            if (i11 > this.f76217f) {
                c();
                i11 = this.f76215c + 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f76218g;
            int length = (atomicReferenceArray.length() - 1) & i10;
            a9 a9Var = (a9) atomicReferenceArray.get(length);
            for (a9 next = a9Var; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == i10 && key != null && this.f76214b.f76263g.equivalent(obj, key)) {
                    Object value = next.getValue();
                    if (value == null) {
                        this.f76216e++;
                        l(next, obj2);
                        this.f76215c = this.f76215c;
                        unlock();
                        return null;
                    }
                    if (z10) {
                        unlock();
                        return value;
                    }
                    this.f76216e++;
                    l(next, obj2);
                    unlock();
                    return value;
                }
            }
            this.f76216e++;
            a9 a9VarNewEntry = this.f76214b.f76264h.newEntry(k(), obj, i10, a9Var);
            l(a9VarNewEntry, obj2);
            atomicReferenceArray.set(length, a9VarNewEntry);
            this.f76215c = i11;
            unlock();
            return null;
        } catch (Throwable th2) {
            unlock();
            throw th2;
        }
    }

    public final a9 i(a9 a9Var, a9 a9Var2) {
        int i10 = this.f76215c;
        a9 next = a9Var2.getNext();
        while (a9Var != a9Var2) {
            a9 a9VarCopy = this.f76214b.f76264h.copy(k(), a9Var, next);
            if (a9VarCopy != null) {
                next = a9VarCopy;
            } else {
                i10--;
            }
            a9Var = a9Var.getNext();
        }
        this.f76215c = i10;
        return next;
    }

    public final void j() {
        if (tryLock()) {
            try {
                f();
                this.f76219h.set(0);
            } finally {
                unlock();
            }
        }
    }

    public abstract e9 k();

    public final void l(a9 a9Var, Object obj) {
        this.f76214b.f76264h.setValue(k(), a9Var, obj);
    }

    public final void m() {
        if (tryLock()) {
            try {
                f();
            } finally {
                unlock();
            }
        }
    }

    public void e() {
    }

    public void f() {
    }
}
