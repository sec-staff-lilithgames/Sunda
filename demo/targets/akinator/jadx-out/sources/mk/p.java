package mk;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class p implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public q f74777b;

    /* renamed from: c, reason: collision with root package name */
    public q f74778c = null;

    /* renamed from: e, reason: collision with root package name */
    public int f74779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f74780f;

    public p(r rVar) {
        this.f74780f = rVar;
        this.f74777b = rVar.f74796h.f74784f;
        this.f74779e = rVar.f74795g;
    }

    public final q a() {
        q qVar = this.f74777b;
        r rVar = this.f74780f;
        if (qVar == rVar.f74796h) {
            throw new NoSuchElementException();
        }
        if (rVar.f74795g != this.f74779e) {
            throw new ConcurrentModificationException();
        }
        this.f74777b = qVar.f74784f;
        this.f74778c = qVar;
        return qVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f74777b != this.f74780f.f74796h;
    }

    @Override // java.util.Iterator
    public final void remove() {
        q qVar = this.f74778c;
        if (qVar == null) {
            throw new IllegalStateException();
        }
        r rVar = this.f74780f;
        rVar.c(qVar, true);
        this.f74778c = null;
        this.f74779e = rVar.f74795g;
    }
}
