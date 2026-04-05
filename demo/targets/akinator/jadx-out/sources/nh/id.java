package nh;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class id implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f76360b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f76361c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jd f76362e;

    public id(jd jdVar, Object obj) {
        this.f76361c = obj;
        this.f76362e = jdVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76360b == 0 && this.f76362e.f76398c.f76425h.containsKey(this.f76361c);
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f76360b++;
        return this.f76362e.f76398c.f76425h.get(this.f76361c);
    }

    @Override // java.util.Iterator
    public void remove() {
        jh.i.t(this.f76360b == 1);
        this.f76360b = -1;
        this.f76362e.f76398c.f76425h.remove(this.f76361c);
    }
}
