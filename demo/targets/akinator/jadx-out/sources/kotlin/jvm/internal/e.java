package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends uu.z0 {

    /* renamed from: b, reason: collision with root package name */
    public final double[] f71825b;

    /* renamed from: c, reason: collision with root package name */
    public int f71826c;

    public e(double[] array) {
        e0.checkNotNullParameter(array, "array");
        this.f71825b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f71826c < this.f71825b.length;
    }

    @Override // uu.z0
    public double nextDouble() {
        try {
            double[] dArr = this.f71825b;
            int i10 = this.f71826c;
            this.f71826c = i10 + 1;
            return dArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f71826c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
