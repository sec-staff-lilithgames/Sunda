package uu;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public int f88709b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f88710c;

    public d(g gVar) {
        this.f88710c = gVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88709b < this.f88710c.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f88709b;
        this.f88709b = i10 + 1;
        return this.f88710c.get(i10);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
