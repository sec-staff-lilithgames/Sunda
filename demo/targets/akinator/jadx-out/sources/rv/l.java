package rv;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f85035b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f85036c;

    /* renamed from: e, reason: collision with root package name */
    public int f85037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f85038f;

    public l(m mVar) {
        this.f85038f = mVar;
        this.f85035b = mVar.f85041a.iterator();
    }

    public final boolean a() {
        Iterator it;
        Iterator it2 = this.f85036c;
        if (it2 != null && it2.hasNext()) {
            this.f85037e = 1;
            return true;
        }
        do {
            Iterator it3 = this.f85035b;
            if (!it3.hasNext()) {
                this.f85037e = 2;
                this.f85036c = null;
                return false;
            }
            Object next = it3.next();
            m mVar = this.f85038f;
            it = (Iterator) mVar.f85043c.invoke(mVar.f85042b.invoke(next));
        } while (!it.hasNext());
        this.f85036c = it;
        this.f85037e = 1;
        return true;
    }

    public final Iterator<Object> getItemIterator() {
        return this.f85036c;
    }

    public final Iterator<Object> getIterator() {
        return this.f85035b;
    }

    public final int getState() {
        return this.f85037e;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f85037e;
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        return a();
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f85037e;
        if (i10 == 2) {
            throw new NoSuchElementException();
        }
        if (i10 == 0 && !a()) {
            throw new NoSuchElementException();
        }
        this.f85037e = 0;
        Iterator it = this.f85036c;
        kotlin.jvm.internal.e0.checkNotNull(it);
        return it.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setItemIterator(Iterator<Object> it) {
        this.f85036c = it;
    }

    public final void setState(int i10) {
        this.f85037e = i10;
    }
}
