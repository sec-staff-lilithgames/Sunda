package nh;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class y implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f76776b;

    /* renamed from: c, reason: collision with root package name */
    public int f76777c;

    /* renamed from: e, reason: collision with root package name */
    public int f76778e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z f76779f;

    public y(z zVar) {
        this.f76779f = zVar;
        se seVar = zVar.f76801e;
        this.f76776b = seVar.b();
        this.f76777c = -1;
        this.f76778e = seVar.f76607d;
    }

    public abstract Object a(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f76779f.f76801e.f76607d == this.f76778e) {
            return this.f76776b >= 0;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a(this.f76776b);
        int i10 = this.f76776b;
        this.f76777c = i10;
        this.f76776b = this.f76779f.f76801e.i(i10);
        return objA;
    }

    @Override // java.util.Iterator
    public void remove() {
        z zVar = this.f76779f;
        se seVar = zVar.f76801e;
        if (zVar.f76801e.f76607d != this.f76778e) {
            throw new ConcurrentModificationException();
        }
        jh.i.t(this.f76777c != -1);
        zVar.f76802f -= seVar.k(this.f76777c);
        int i10 = this.f76776b;
        int i11 = this.f76777c;
        if (i10 == seVar.f76606c) {
            i10 = i11;
        }
        this.f76776b = i10;
        this.f76777c = -1;
        this.f76778e = seVar.f76607d;
    }
}
