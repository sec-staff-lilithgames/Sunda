package b1;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p0 implements ListIterator, lv.e {

    /* renamed from: b, reason: collision with root package name */
    public final SnapshotStateList f8663b;

    /* renamed from: c, reason: collision with root package name */
    public int f8664c;

    /* renamed from: e, reason: collision with root package name */
    public int f8665e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f8666f;

    public p0(SnapshotStateList<Object> snapshotStateList, int i10) {
        this.f8663b = snapshotStateList;
        this.f8664c = i10 - 1;
        this.f8666f = h0.getStructure(snapshotStateList);
    }

    public final void a() {
        if (h0.getStructure(this.f8663b) != this.f8666f) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        a();
        int i10 = this.f8664c + 1;
        SnapshotStateList snapshotStateList = this.f8663b;
        snapshotStateList.add(i10, obj);
        this.f8665e = -1;
        this.f8664c++;
        this.f8666f = h0.getStructure(snapshotStateList);
    }

    public final SnapshotStateList<Object> getList() {
        return this.f8663b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f8664c < this.f8663b.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f8664c >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        a();
        int i10 = this.f8664c + 1;
        this.f8665e = i10;
        SnapshotStateList snapshotStateList = this.f8663b;
        h0.access$validateRange(i10, snapshotStateList.size());
        Object obj = snapshotStateList.get(i10);
        this.f8664c = i10;
        return obj;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f8664c + 1;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        a();
        int i10 = this.f8664c;
        SnapshotStateList snapshotStateList = this.f8663b;
        h0.access$validateRange(i10, snapshotStateList.size());
        int i11 = this.f8664c;
        this.f8665e = i11;
        this.f8664c--;
        return snapshotStateList.get(i11);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f8664c;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        a();
        int i10 = this.f8665e;
        SnapshotStateList snapshotStateList = this.f8663b;
        snapshotStateList.remove(i10);
        this.f8664c--;
        this.f8665e = -1;
        this.f8666f = h0.getStructure(snapshotStateList);
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        a();
        int i10 = this.f8665e;
        if (i10 < 0) {
            h0.access$invalidIteratorSet();
            throw new tu.k();
        }
        SnapshotStateList snapshotStateList = this.f8663b;
        snapshotStateList.set(i10, obj);
        this.f8666f = h0.getStructure(snapshotStateList);
    }
}
