package v0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h1;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends c implements Iterator, lv.c {

    /* renamed from: f, reason: collision with root package name */
    public final b f88833f;

    /* renamed from: g, reason: collision with root package name */
    public Object f88834g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f88835h;

    /* renamed from: i, reason: collision with root package name */
    public int f88836i;

    public d(b bVar) {
        super(bVar.getNode$runtime());
        this.f88833f = bVar;
        this.f88836i = bVar.getModCount$runtime();
    }

    public final void c(int i10, e eVar, Object obj, int i11) {
        int bitmap = eVar.getBitmap();
        List list = this.f88830b;
        if (bitmap == 0) {
            int iIndexOf = k0.indexOf(eVar.getBuffer(), obj);
            y0.a.m8013assert(iIndexOf != -1);
            ((f) list.get(i11)).reset(eVar.getBuffer(), iIndexOf);
            this.f88831c = i11;
            return;
        }
        int iIndexOfCellAt$runtime = eVar.indexOfCellAt$runtime(1 << g.indexSegment(i10, i11 * 5));
        ((f) list.get(i11)).reset(eVar.getBuffer(), iIndexOfCellAt$runtime);
        Object obj2 = eVar.getBuffer()[iIndexOfCellAt$runtime];
        if (obj2 instanceof e) {
            c(i10, (e) obj2, obj, i11 + 1);
        } else {
            this.f88831c = i11;
        }
    }

    @Override // v0.c, java.util.Iterator
    public Object next() {
        if (this.f88833f.getModCount$runtime() != this.f88836i) {
            throw new ConcurrentModificationException();
        }
        Object next = super.next();
        this.f88834g = next;
        this.f88835h = true;
        return next;
    }

    @Override // v0.c, java.util.Iterator
    public void remove() {
        if (!this.f88835h) {
            throw new IllegalStateException();
        }
        boolean zHasNext = hasNext();
        b bVar = this.f88833f;
        if (zHasNext) {
            y0.a.m8013assert(hasNext());
            Object objCurrentElement = ((f) this.f88830b.get(this.f88831c)).currentElement();
            h1.asMutableCollection(bVar).remove(this.f88834g);
            c(objCurrentElement != null ? objCurrentElement.hashCode() : 0, bVar.getNode$runtime(), objCurrentElement, 0);
        } else {
            h1.asMutableCollection(bVar).remove(this.f88834g);
        }
        this.f88834g = null;
        this.f88835h = false;
        this.f88836i = bVar.getModCount$runtime();
    }
}
