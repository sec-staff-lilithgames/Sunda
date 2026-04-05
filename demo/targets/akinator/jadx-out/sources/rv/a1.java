package rv;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a1 implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f84976b;

    /* renamed from: c, reason: collision with root package name */
    public int f84977c = -1;

    /* renamed from: e, reason: collision with root package name */
    public Object f84978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f84979f;

    public a1(b1 b1Var) {
        this.f84979f = b1Var;
        this.f84976b = b1Var.f84985a.iterator();
    }

    public final void a() {
        Iterator it = this.f84976b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) this.f84979f.f84986b.invoke(next)).booleanValue()) {
                this.f84977c = 1;
                this.f84978e = next;
                return;
            }
        }
        this.f84977c = 0;
    }

    public final Iterator<Object> getIterator() {
        return this.f84976b;
    }

    public final Object getNextItem() {
        return this.f84978e;
    }

    public final int getNextState() {
        return this.f84977c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f84977c == -1) {
            a();
        }
        return this.f84977c == 1;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.f84977c == -1) {
            a();
        }
        if (this.f84977c == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f84978e;
        this.f84978e = null;
        this.f84977c = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setNextItem(Object obj) {
        this.f84978e = obj;
    }

    public final void setNextState(int i10) {
        this.f84977c = i10;
    }
}
