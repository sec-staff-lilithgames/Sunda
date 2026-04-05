package rv;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f85025b;

    /* renamed from: c, reason: collision with root package name */
    public int f85026c = -1;

    /* renamed from: e, reason: collision with root package name */
    public Object f85027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f85028f;

    public j(k kVar) {
        this.f85028f = kVar;
        this.f85025b = kVar.f85030a.iterator();
    }

    public final void a() {
        Object next;
        k kVar;
        do {
            Iterator it = this.f85025b;
            if (!it.hasNext()) {
                this.f85026c = 0;
                return;
            } else {
                next = it.next();
                kVar = this.f85028f;
            }
        } while (((Boolean) kVar.f85032c.invoke(next)).booleanValue() != kVar.f85031b);
        this.f85027e = next;
        this.f85026c = 1;
    }

    public final Iterator<Object> getIterator() {
        return this.f85025b;
    }

    public final Object getNextItem() {
        return this.f85027e;
    }

    public final int getNextState() {
        return this.f85026c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f85026c == -1) {
            a();
        }
        return this.f85026c == 1;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.f85026c == -1) {
            a();
        }
        if (this.f85026c == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f85027e;
        this.f85027e = null;
        this.f85026c = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setNextItem(Object obj) {
        this.f85027e = obj;
    }

    public final void setNextState(int i10) {
        this.f85026c = i10;
    }
}
