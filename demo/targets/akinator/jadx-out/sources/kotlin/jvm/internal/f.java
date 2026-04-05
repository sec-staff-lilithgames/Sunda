package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends uu.e1 {

    /* renamed from: b, reason: collision with root package name */
    public final float[] f71828b;

    /* renamed from: c, reason: collision with root package name */
    public int f71829c;

    public f(float[] array) {
        e0.checkNotNullParameter(array, "array");
        this.f71828b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f71829c < this.f71828b.length;
    }

    @Override // uu.e1
    public float nextFloat() {
        try {
            float[] fArr = this.f71828b;
            int i10 = this.f71829c;
            this.f71829c = i10 + 1;
            return fArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f71829c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
