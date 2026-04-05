package v0;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final List f88830b;

    /* renamed from: c, reason: collision with root package name */
    public int f88831c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f88832e;

    public c(e eVar) {
        List listMutableListOf = p0.mutableListOf(new f());
        this.f88830b = listMutableListOf;
        this.f88832e = true;
        f.reset$default((f) listMutableListOf.get(0), eVar.getBuffer(), 0, 2, null);
        this.f88831c = 0;
        a();
    }

    public final void a() {
        int i10 = this.f88831c;
        List list = this.f88830b;
        if (((f) list.get(i10)).hasNextElement()) {
            return;
        }
        for (int i11 = this.f88831c; -1 < i11; i11--) {
            int iB = b(i11);
            if (iB == -1 && ((f) list.get(i11)).hasNextCell()) {
                ((f) list.get(i11)).moveToNextCell();
                iB = b(i11);
            }
            if (iB != -1) {
                this.f88831c = iB;
                return;
            }
            if (i11 > 0) {
                ((f) list.get(i11 - 1)).moveToNextCell();
            }
            ((f) list.get(i11)).reset(e.f88837d.getEMPTY$runtime().getBuffer(), 0);
        }
        this.f88832e = false;
    }

    public final int b(int i10) {
        List list = this.f88830b;
        if (((f) list.get(i10)).hasNextElement()) {
            return i10;
        }
        if (!((f) list.get(i10)).hasNextNode()) {
            return -1;
        }
        e eVarCurrentNode = ((f) list.get(i10)).currentNode();
        int i11 = i10 + 1;
        if (i11 == list.size()) {
            list.add(new f());
        }
        f.reset$default((f) list.get(i11), eVarCurrentNode.getBuffer(), 0, 2, null);
        return b(i11);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88832e;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f88832e) {
            throw new NoSuchElementException();
        }
        Object objNextElement = ((f) this.f88830b.get(this.f88831c)).nextElement();
        a();
        return objNextElement;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
