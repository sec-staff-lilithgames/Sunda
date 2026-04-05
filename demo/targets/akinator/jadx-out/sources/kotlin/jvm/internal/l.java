package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import uu.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l extends e2 {

    /* renamed from: b, reason: collision with root package name */
    public final short[] f71850b;

    /* renamed from: c, reason: collision with root package name */
    public int f71851c;

    public l(short[] array) {
        e0.checkNotNullParameter(array, "array");
        this.f71850b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f71851c < this.f71850b.length;
    }

    @Override // uu.e2
    public short nextShort() {
        try {
            short[] sArr = this.f71850b;
            int i10 = this.f71851c;
            this.f71851c = i10 + 1;
            return sArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f71851c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
