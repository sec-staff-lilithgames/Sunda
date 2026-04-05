package nh;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l7 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public Iterator f76443b = u7.f76687b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable f76444c;

    public l7(Iterable iterable) {
        this.f76444c = iterable;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76443b.hasNext() || this.f76444c.iterator().hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f76443b.hasNext()) {
            Iterator it = this.f76444c.iterator();
            this.f76443b = it;
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
        }
        return this.f76443b.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f76443b.remove();
    }
}
