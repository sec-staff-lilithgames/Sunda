package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f85015b;

    /* renamed from: c, reason: collision with root package name */
    public int f85016c = -1;

    /* renamed from: e, reason: collision with root package name */
    public Object f85017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f85018f;

    public g(h hVar) {
        this.f85018f = hVar;
        this.f85015b = hVar.f85020a.iterator();
    }

    public final void a() {
        Object next;
        do {
            Iterator it = this.f85015b;
            if (!it.hasNext()) {
                this.f85016c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) this.f85018f.f85021b.invoke(next)).booleanValue());
        this.f85017e = next;
        this.f85016c = 1;
    }

    public final int getDropState() {
        return this.f85016c;
    }

    public final Iterator<Object> getIterator() {
        return this.f85015b;
    }

    public final Object getNextItem() {
        return this.f85017e;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f85016c == -1) {
            a();
        }
        return this.f85016c == 1 || this.f85015b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.f85016c == -1) {
            a();
        }
        if (this.f85016c != 1) {
            return this.f85015b.next();
        }
        Object obj = this.f85017e;
        this.f85017e = null;
        this.f85016c = 0;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setDropState(int i10) {
        this.f85016c = i10;
    }

    public final void setNextItem(Object obj) {
        this.f85017e = obj;
    }
}
