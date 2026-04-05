package rv;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w0 implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f85109b;

    /* renamed from: c, reason: collision with root package name */
    public int f85110c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0 f85111e;

    public w0(x0 x0Var) {
        this.f85111e = x0Var;
        this.f85109b = x0Var.f85112a.iterator();
    }

    public final void a() {
        while (this.f85110c < this.f85111e.f85113b) {
            Iterator it = this.f85109b;
            if (!it.hasNext()) {
                return;
            }
            it.next();
            this.f85110c++;
        }
    }

    public final Iterator<Object> getIterator() {
        return this.f85109b;
    }

    public final int getPosition() {
        return this.f85110c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        a();
        return this.f85110c < this.f85111e.f85114c && this.f85109b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        a();
        if (this.f85110c >= this.f85111e.f85114c) {
            throw new NoSuchElementException();
        }
        this.f85110c++;
        return this.f85109b.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setPosition(int i10) {
        this.f85110c = i10;
    }
}
