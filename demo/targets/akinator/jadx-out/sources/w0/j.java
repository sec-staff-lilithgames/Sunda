package w0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class j implements Iterator, lv.c {

    /* renamed from: b, reason: collision with root package name */
    public Object f90301b;

    /* renamed from: c, reason: collision with root package name */
    public final d f90302c;

    /* renamed from: e, reason: collision with root package name */
    public Object f90303e = y0.c.f93944a;

    /* renamed from: f, reason: collision with root package name */
    public boolean f90304f;

    /* renamed from: g, reason: collision with root package name */
    public int f90305g;

    /* renamed from: h, reason: collision with root package name */
    public int f90306h;

    public j(Object obj, d dVar) {
        this.f90301b = obj;
        this.f90302c = dVar;
        this.f90305g = dVar.getHashMapBuilder$runtime().getModCount$runtime();
    }

    public final d getBuilder$runtime() {
        return this.f90302c;
    }

    public final int getIndex$runtime() {
        return this.f90306h;
    }

    public final Object getLastIteratedKey$runtime() {
        return this.f90303e;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f90306h < this.f90302c.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f90304f) {
            throw new IllegalStateException();
        }
        Object obj = this.f90303e;
        d dVar = this.f90302c;
        h1.asMutableMap(dVar).remove(obj);
        this.f90303e = null;
        this.f90304f = false;
        this.f90305g = dVar.getHashMapBuilder$runtime().getModCount$runtime();
        this.f90306h--;
    }

    public final void setIndex$runtime(int i10) {
        this.f90306h = i10;
    }

    public final void setLastIteratedKey$runtime(Object obj) {
        this.f90303e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    public a next() {
        d dVar = this.f90302c;
        if (dVar.getHashMapBuilder$runtime().getModCount$runtime() != this.f90305g) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f90303e = this.f90301b;
        this.f90304f = true;
        this.f90306h++;
        V v10 = dVar.getHashMapBuilder$runtime().get(this.f90301b);
        if (v10 == 0) {
            throw new ConcurrentModificationException(i.e(new StringBuilder("Hash code of a key ("), this.f90301b, ") has changed after it was added to the persistent map."));
        }
        a aVar = (a) v10;
        this.f90301b = aVar.getNext();
        return aVar;
    }
}
