package bu;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final j f10396b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.g0 f10397c;

    /* renamed from: e, reason: collision with root package name */
    public Object f10398e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10399f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10400g = true;

    /* renamed from: h, reason: collision with root package name */
    public Throwable f10401h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10402i;

    public i(mt.g0 g0Var, j jVar) {
        this.f10397c = g0Var;
        this.f10396b = jVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        Throwable th2 = this.f10401h;
        if (th2 != null) {
            throw iu.m.wrapOrThrow(th2);
        }
        if (this.f10399f) {
            if (!this.f10400g) {
                return true;
            }
            boolean z10 = this.f10402i;
            j jVar = this.f10396b;
            if (!z10) {
                this.f10402i = true;
                jVar.f10441e.set(1);
                new g6(this.f10397c).subscribe(jVar);
            }
            try {
                mt.a0 a0VarTakeNext = jVar.takeNext();
                if (a0VarTakeNext.isOnNext()) {
                    this.f10400g = false;
                    this.f10398e = a0VarTakeNext.getValue();
                    return true;
                }
                this.f10399f = false;
                if (!a0VarTakeNext.isOnComplete()) {
                    Throwable error = a0VarTakeNext.getError();
                    this.f10401h = error;
                    throw iu.m.wrapOrThrow(error);
                }
            } catch (InterruptedException e10) {
                jVar.dispose();
                this.f10401h = e10;
                throw iu.m.wrapOrThrow(e10);
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        Throwable th2 = this.f10401h;
        if (th2 != null) {
            throw iu.m.wrapOrThrow(th2);
        }
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements");
        }
        this.f10400g = true;
        return this.f10398e;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Read only iterator");
    }
}
