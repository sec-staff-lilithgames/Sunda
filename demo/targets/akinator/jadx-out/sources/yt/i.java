package yt;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final j f95633b;

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f95634c;

    /* renamed from: e, reason: collision with root package name */
    public Object f95635e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f95636f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f95637g = true;

    /* renamed from: h, reason: collision with root package name */
    public Throwable f95638h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f95639i;

    public i(tw.b bVar, j jVar) {
        this.f95634c = bVar;
        this.f95633b = jVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        Throwable th2 = this.f95638h;
        if (th2 != null) {
            throw iu.m.wrapOrThrow(th2);
        }
        if (this.f95636f) {
            if (!this.f95637g) {
                return true;
            }
            j jVar = this.f95633b;
            try {
                if (!this.f95639i) {
                    this.f95639i = true;
                    jVar.f95710e.set(1);
                    mt.l.fromPublisher(this.f95634c).materialize().subscribe((mt.q) jVar);
                }
                mt.a0 a0VarTakeNext = jVar.takeNext();
                if (a0VarTakeNext.isOnNext()) {
                    this.f95637g = false;
                    this.f95635e = a0VarTakeNext.getValue();
                    return true;
                }
                this.f95636f = false;
                if (!a0VarTakeNext.isOnComplete()) {
                    if (!a0VarTakeNext.isOnError()) {
                        throw new IllegalStateException("Should not reach here");
                    }
                    Throwable error = a0VarTakeNext.getError();
                    this.f95638h = error;
                    throw iu.m.wrapOrThrow(error);
                }
            } catch (InterruptedException e10) {
                jVar.dispose();
                this.f95638h = e10;
                throw iu.m.wrapOrThrow(e10);
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        Throwable th2 = this.f95638h;
        if (th2 != null) {
            throw iu.m.wrapOrThrow(th2);
        }
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements");
        }
        this.f95637g = true;
        return this.f95635e;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Read only iterator");
    }
}
