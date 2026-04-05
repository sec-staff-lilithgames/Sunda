package x3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f1 implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final kv.l f91571b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f91572c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public Iterator f91573e;

    public f1(Iterator<Object> it, kv.l lVar) {
        this.f91571b = lVar;
        this.f91573e = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f91573e.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object next = this.f91573e.next();
        Iterator it = (Iterator) this.f91571b.invoke(next);
        ArrayList arrayList = this.f91572c;
        if (it != null && it.hasNext()) {
            arrayList.add(this.f91573e);
            this.f91573e = it;
            return next;
        }
        while (!this.f91573e.hasNext() && !arrayList.isEmpty()) {
            this.f91573e = (Iterator) uu.y0.last((List) arrayList);
            uu.v0.removeLast(arrayList);
        }
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
