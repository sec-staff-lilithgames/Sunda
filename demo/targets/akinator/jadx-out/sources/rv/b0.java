package rv;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b0 implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f84983b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f84984c;

    public b0(Object obj) {
        this.f84984c = obj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f84983b;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f84983b) {
            throw new NoSuchElementException();
        }
        this.f84983b = false;
        return this.f84984c;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
