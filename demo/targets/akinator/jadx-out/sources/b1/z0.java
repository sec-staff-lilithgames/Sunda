package b1;

import androidx.compose.runtime.snapshots.SnapshotStateSet;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z0 implements Iterator, lv.c {

    /* renamed from: b, reason: collision with root package name */
    public final SnapshotStateSet f8716b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f8717c;

    /* renamed from: e, reason: collision with root package name */
    public Object f8718e;

    /* renamed from: f, reason: collision with root package name */
    public Object f8719f;

    /* renamed from: g, reason: collision with root package name */
    public int f8720g;

    public z0(SnapshotStateSet<Object> snapshotStateSet, Iterator<Object> it) {
        this.f8716b = snapshotStateSet;
        this.f8717c = it;
        this.f8720g = n0.getModification(snapshotStateSet);
        this.f8718e = this.f8719f;
        this.f8719f = it.hasNext() ? it.next() : null;
    }

    public final Object getCurrent() {
        return this.f8718e;
    }

    public final Iterator<Object> getIterator() {
        return this.f8717c;
    }

    public final int getModification() {
        return this.f8720g;
    }

    public final Object getNext() {
        return this.f8719f;
    }

    public final SnapshotStateSet<Object> getSet() {
        return this.f8716b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f8719f != null;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (n0.getModification(this.f8716b) != this.f8720g) {
            throw new ConcurrentModificationException();
        }
        this.f8718e = this.f8719f;
        Iterator it = this.f8717c;
        this.f8719f = it.hasNext() ? it.next() : null;
        Object obj = this.f8718e;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public void remove() {
        SnapshotStateSet snapshotStateSet = this.f8716b;
        if (n0.getModification(snapshotStateSet) != this.f8720g) {
            throw new ConcurrentModificationException();
        }
        Object obj = this.f8718e;
        if (obj == null) {
            throw new IllegalStateException();
        }
        snapshotStateSet.remove(obj);
        this.f8718e = null;
        this.f8720g = n0.getModification(snapshotStateSet);
    }

    public final void setCurrent(Object obj) {
        this.f8718e = obj;
    }

    public final void setModification(int i10) {
        this.f8720g = i10;
    }

    public final void setNext(Object obj) {
        this.f8719f = obj;
    }

    public static /* synthetic */ void getNext$annotations() {
    }
}
