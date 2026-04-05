package qe;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public int f82838a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f82839b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f82840c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int[] f82841d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public int f82842e;

    public k() {
        this.f82842e = r0.length - 1;
    }

    public void add(int i10) {
        int i11 = this.f82840c;
        int[] iArr = this.f82841d;
        if (i11 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i12 = this.f82838a;
            int i13 = length2 - i12;
            System.arraycopy(iArr, i12, iArr2, 0, i13);
            System.arraycopy(this.f82841d, 0, iArr2, i13, i12);
            this.f82838a = 0;
            this.f82839b = this.f82840c - 1;
            this.f82841d = iArr2;
            this.f82842e = length - 1;
        }
        int i14 = (this.f82839b + 1) & this.f82842e;
        this.f82839b = i14;
        this.f82841d[i14] = i10;
        this.f82840c++;
    }

    public int capacity() {
        return this.f82841d.length;
    }

    public void clear() {
        this.f82838a = 0;
        this.f82839b = -1;
        this.f82840c = 0;
    }

    public boolean isEmpty() {
        return this.f82840c == 0;
    }

    public int remove() {
        int i10 = this.f82840c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f82841d;
        int i11 = this.f82838a;
        int i12 = iArr[i11];
        this.f82838a = (i11 + 1) & this.f82842e;
        this.f82840c = i10 - 1;
        return i12;
    }

    public int size() {
        return this.f82840c;
    }
}
