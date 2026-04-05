package eu;

import java.util.concurrent.atomic.AtomicReference;
import vt.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements n {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f55135b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f55136c;

    public b() {
        AtomicReference atomicReference = new AtomicReference();
        this.f55135b = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.f55136c = atomicReference2;
        a aVar = new a();
        atomicReference2.lazySet(aVar);
    }

    @Override // vt.n, vt.o
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // vt.n, vt.o
    public boolean isEmpty() {
        return ((a) this.f55136c.get()) == ((a) this.f55135b.get());
    }

    @Override // vt.n, vt.o
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        a aVar = new a();
        aVar.spValue(obj);
        ((a) this.f55135b.getAndSet(aVar)).soNext(aVar);
        return true;
    }

    @Override // vt.n, vt.o
    public Object poll() {
        a aVarLvNext;
        AtomicReference atomicReference = this.f55136c;
        a aVar = (a) atomicReference.get();
        a aVarLvNext2 = aVar.lvNext();
        if (aVarLvNext2 != null) {
            Object andNullValue = aVarLvNext2.getAndNullValue();
            atomicReference.lazySet(aVarLvNext2);
            return andNullValue;
        }
        if (aVar == ((a) this.f55135b.get())) {
            return null;
        }
        do {
            aVarLvNext = aVar.lvNext();
        } while (aVarLvNext == null);
        Object andNullValue2 = aVarLvNext.getAndNullValue();
        atomicReference.lazySet(aVarLvNext);
        return andNullValue2;
    }

    @Override // vt.n, vt.o
    public boolean offer(Object obj, Object obj2) {
        offer(obj);
        offer(obj2);
        return true;
    }
}
