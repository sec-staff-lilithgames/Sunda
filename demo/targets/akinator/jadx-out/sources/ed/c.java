package ed;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public a f54093b;

    public abstract a a();

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f54093b != null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public a next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        a aVar = this.f54093b;
        this.f54093b = a();
        return aVar;
    }
}
