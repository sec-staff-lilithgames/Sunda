package zt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s2 extends AtomicReferenceArray implements t2 {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f98767b;

    /* renamed from: c, reason: collision with root package name */
    public int f98768c;

    public s2(int i10) {
        super(i10);
        this.f98767b = new AtomicInteger();
    }

    @Override // zt.t2, vt.o
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // zt.t2
    public int consumerIndex() {
        return this.f98768c;
    }

    @Override // zt.t2
    public void drop() {
        int i10 = this.f98768c;
        lazySet(i10, null);
        this.f98768c = i10 + 1;
    }

    @Override // zt.t2, vt.o
    public boolean isEmpty() {
        return this.f98768c == producerIndex();
    }

    @Override // zt.t2, java.util.Queue, vt.o
    public boolean offer(Object obj) {
        ut.o0.requireNonNull(obj, "value is null");
        int andIncrement = this.f98767b.getAndIncrement();
        if (andIncrement >= length()) {
            return false;
        }
        lazySet(andIncrement, obj);
        return true;
    }

    @Override // zt.t2
    public Object peek() {
        int i10 = this.f98768c;
        if (i10 == length()) {
            return null;
        }
        return get(i10);
    }

    @Override // zt.t2, java.util.Queue, vt.o
    public Object poll() {
        int i10 = this.f98768c;
        if (i10 == length()) {
            return null;
        }
        do {
            Object obj = get(i10);
            if (obj != null) {
                this.f98768c = i10 + 1;
                lazySet(i10, null);
                return obj;
            }
        } while (this.f98767b.get() != i10);
        return null;
    }

    @Override // zt.t2
    public int producerIndex() {
        return this.f98767b.get();
    }

    @Override // zt.t2, vt.o
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }
}
