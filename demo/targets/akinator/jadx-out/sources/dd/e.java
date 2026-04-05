package dd;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class e implements Iterator, Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f52001b;

    /* renamed from: c, reason: collision with root package name */
    public int f52002c = 0;

    public e(Object[] objArr) {
        this.f52001b = objArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f52002c < this.f52001b.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f52002c;
        Object[] objArr = this.f52001b;
        if (i10 >= objArr.length) {
            throw new NoSuchElementException();
        }
        this.f52002c = i10 + 1;
        return objArr[i10];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return this;
    }
}
