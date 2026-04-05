package rv;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u extends v implements Iterator, zu.d, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public int f85095b;

    /* renamed from: c, reason: collision with root package name */
    public Object f85096c;

    /* renamed from: e, reason: collision with root package name */
    public Iterator f85097e;

    /* renamed from: f, reason: collision with root package name */
    public zu.d f85098f;

    public final RuntimeException a() {
        int i10 = this.f85095b;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f85095b);
    }

    @Override // zu.d
    public zu.m getContext() {
        return zu.n.f98854b;
    }

    public final zu.d<tu.x0> getNextStep() {
        return this.f85098f;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i10 = this.f85095b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.f85097e;
                kotlin.jvm.internal.e0.checkNotNull(it);
                if (it.hasNext()) {
                    this.f85095b = 2;
                    return true;
                }
                this.f85097e = null;
            }
            this.f85095b = 5;
            zu.d dVar = this.f85098f;
            kotlin.jvm.internal.e0.checkNotNull(dVar);
            this.f85098f = null;
            dVar.resumeWith(tu.z.m7131constructorimpl(tu.x0.f87415a));
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f85095b;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i10 == 2) {
            this.f85095b = 1;
            Iterator it = this.f85097e;
            kotlin.jvm.internal.e0.checkNotNull(it);
            return it.next();
        }
        if (i10 != 3) {
            throw a();
        }
        this.f85095b = 0;
        Object obj = this.f85096c;
        this.f85096c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // zu.d
    public void resumeWith(Object obj) {
        tu.a0.throwOnFailure(obj);
        this.f85095b = 4;
    }

    public final void setNextStep(zu.d<? super tu.x0> dVar) {
        this.f85098f = dVar;
    }

    @Override // rv.v
    public Object yield(Object obj, zu.d<? super tu.x0> dVar) {
        this.f85096c = obj;
        this.f85095b = 3;
        this.f85098f = dVar;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return coroutine_suspended == av.e.getCOROUTINE_SUSPENDED() ? coroutine_suspended : tu.x0.f87415a;
    }

    @Override // rv.v
    public Object yieldAll(Iterator<Object> it, zu.d<? super tu.x0> dVar) {
        boolean zHasNext = it.hasNext();
        tu.x0 x0Var = tu.x0.f87415a;
        if (!zHasNext) {
            return x0Var;
        }
        this.f85097e = it;
        this.f85095b = 2;
        this.f85098f = dVar;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return coroutine_suspended == av.e.getCOROUTINE_SUSPENDED() ? coroutine_suspended : x0Var;
    }
}
