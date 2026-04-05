package nh;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class lg extends ej {

    /* renamed from: b, reason: collision with root package name */
    public final b5 f76457b;

    /* renamed from: c, reason: collision with root package name */
    public int f76458c;

    public lg(mg mgVar) {
        this.f76457b = mgVar.f76483b.keySet().asList();
        this.f76458c = mgVar.f76484c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76458c != 0;
    }

    @Override // java.util.Iterator
    public Object next() {
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(this.f76458c);
        if (iNumberOfTrailingZeros == 32) {
            throw new NoSuchElementException();
        }
        this.f76458c &= ~(1 << iNumberOfTrailingZeros);
        return this.f76457b.get(iNumberOfTrailingZeros);
    }
}
