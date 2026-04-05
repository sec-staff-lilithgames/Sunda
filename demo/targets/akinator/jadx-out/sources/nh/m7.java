package nh;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m7 extends ej {

    /* renamed from: b, reason: collision with root package name */
    public int f76471b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterator[] f76472c;

    public m7(Iterator[] itArr) {
        this.f76472c = itArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76471b < this.f76472c.length;
    }

    @Override // java.util.Iterator
    public Iterator<?> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f76471b;
        Iterator<?>[] itArr = this.f76472c;
        Iterator<?> it = itArr[i10];
        Objects.requireNonNull(it);
        Iterator<?> it2 = it;
        int i11 = this.f76471b;
        itArr[i11] = null;
        this.f76471b = i11 + 1;
        return it2;
    }
}
