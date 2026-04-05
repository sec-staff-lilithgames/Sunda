package t0;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.e0;
import qv.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends a implements ListIterator, lv.e {

    /* renamed from: e, reason: collision with root package name */
    public final f f86237e;

    /* renamed from: f, reason: collision with root package name */
    public int f86238f;

    /* renamed from: g, reason: collision with root package name */
    public k f86239g;

    /* renamed from: h, reason: collision with root package name */
    public int f86240h;

    public h(f fVar, int i10) {
        super(i10, fVar.size());
        this.f86237e = fVar;
        this.f86238f = fVar.getModCount$runtime();
        this.f86240h = -1;
        b();
    }

    public final void a() {
        if (this.f86238f != this.f86237e.getModCount$runtime()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // t0.a, java.util.ListIterator
    public void add(Object obj) {
        a();
        int index = getIndex();
        f fVar = this.f86237e;
        fVar.add(index, obj);
        setIndex(getIndex() + 1);
        setSize(fVar.size());
        this.f86238f = fVar.getModCount$runtime();
        this.f86240h = -1;
        b();
    }

    public final void b() {
        f fVar = this.f86237e;
        Object[] root$runtime = fVar.getRoot$runtime();
        if (root$runtime == null) {
            this.f86239g = null;
            return;
        }
        int iRootSize = l.rootSize(fVar.size());
        int iCoerceAtMost = v.coerceAtMost(getIndex(), iRootSize);
        int rootShift$runtime = (fVar.getRootShift$runtime() / 5) + 1;
        k kVar = this.f86239g;
        if (kVar == null) {
            this.f86239g = new k(root$runtime, iCoerceAtMost, iRootSize, rootShift$runtime);
        } else {
            e0.checkNotNull(kVar);
            kVar.reset$runtime(root$runtime, iCoerceAtMost, iRootSize, rootShift$runtime);
        }
    }

    @Override // t0.a, java.util.ListIterator, java.util.Iterator
    public Object next() {
        a();
        checkHasNext$runtime();
        this.f86240h = getIndex();
        k kVar = this.f86239g;
        f fVar = this.f86237e;
        if (kVar == null) {
            Object[] tail$runtime = fVar.getTail$runtime();
            int index = getIndex();
            setIndex(index + 1);
            return tail$runtime[index];
        }
        if (kVar.hasNext()) {
            setIndex(getIndex() + 1);
            return kVar.next();
        }
        Object[] tail$runtime2 = fVar.getTail$runtime();
        int index2 = getIndex();
        setIndex(index2 + 1);
        return tail$runtime2[index2 - kVar.getSize()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        a();
        checkHasPrevious$runtime();
        this.f86240h = getIndex() - 1;
        k kVar = this.f86239g;
        f fVar = this.f86237e;
        if (kVar == null) {
            Object[] tail$runtime = fVar.getTail$runtime();
            setIndex(getIndex() - 1);
            return tail$runtime[getIndex()];
        }
        if (getIndex() <= kVar.getSize()) {
            setIndex(getIndex() - 1);
            return kVar.previous();
        }
        Object[] tail$runtime2 = fVar.getTail$runtime();
        setIndex(getIndex() - 1);
        return tail$runtime2[getIndex() - kVar.getSize()];
    }

    @Override // t0.a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        a();
        int i10 = this.f86240h;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f86237e;
        fVar.remove(i10);
        if (this.f86240h < getIndex()) {
            setIndex(this.f86240h);
        }
        setSize(fVar.size());
        this.f86238f = fVar.getModCount$runtime();
        this.f86240h = -1;
        b();
    }

    @Override // t0.a, java.util.ListIterator
    public void set(Object obj) {
        a();
        int i10 = this.f86240h;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f86237e;
        fVar.set(i10, obj);
        this.f86238f = fVar.getModCount$runtime();
        b();
    }
}
