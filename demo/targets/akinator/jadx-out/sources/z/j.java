package z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int[] f96832a;

    /* renamed from: b, reason: collision with root package name */
    public int f96833b;

    /* renamed from: c, reason: collision with root package name */
    public int f96834c;

    /* renamed from: d, reason: collision with root package name */
    public int f96835d;

    public j() {
        this(0, 1, null);
    }

    public final void a() {
        int[] iArr = this.f96832a;
        int length = iArr.length;
        int i10 = this.f96833b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i12];
        uu.f0.copyInto(iArr, iArr2, 0, i10, length);
        uu.f0.copyInto(this.f96832a, iArr2, i11, 0, this.f96833b);
        this.f96832a = iArr2;
        this.f96833b = 0;
        this.f96834c = length;
        this.f96835d = i12 - 1;
    }

    public final void addFirst(int i10) {
        int i11 = (this.f96833b - 1) & this.f96835d;
        this.f96833b = i11;
        this.f96832a[i11] = i10;
        if (i11 == this.f96834c) {
            a();
        }
    }

    public final void addLast(int i10) {
        int[] iArr = this.f96832a;
        int i11 = this.f96834c;
        iArr[i11] = i10;
        int i12 = this.f96835d & (i11 + 1);
        this.f96834c = i12;
        if (i12 == this.f96833b) {
            a();
        }
    }

    public final void clear() {
        this.f96834c = this.f96833b;
    }

    public final int get(int i10) {
        if (i10 < 0 || i10 >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f96832a[this.f96835d & (this.f96833b + i10)];
    }

    public final int getFirst() {
        int i10 = this.f96833b;
        if (i10 != this.f96834c) {
            return this.f96832a[i10];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int getLast() {
        int i10 = this.f96833b;
        int i11 = this.f96834c;
        if (i10 != i11) {
            return this.f96832a[(i11 - 1) & this.f96835d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final boolean isEmpty() {
        return this.f96833b == this.f96834c;
    }

    public final int popFirst() {
        int i10 = this.f96833b;
        if (i10 == this.f96834c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f96832a[i10];
        this.f96833b = (i10 + 1) & this.f96835d;
        return i11;
    }

    public final int popLast() {
        int i10 = this.f96833b;
        int i11 = this.f96834c;
        if (i10 == i11) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f96835d & (i11 - 1);
        int i13 = this.f96832a[i12];
        this.f96834c = i12;
        return i13;
    }

    public final void removeFromEnd(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f96834c = this.f96835d & (this.f96834c - i10);
    }

    public final void removeFromStart(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f96833b = this.f96835d & (this.f96833b + i10);
    }

    public final int size() {
        return (this.f96834c - this.f96833b) & this.f96835d;
    }

    public j(int i10) {
        if (!(i10 >= 1)) {
            a0.d.throwIllegalArgumentException("capacity must be >= 1");
        }
        if (!(i10 <= 1073741824)) {
            a0.d.throwIllegalArgumentException("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f96835d = i10 - 1;
        this.f96832a = new int[i10];
    }

    public /* synthetic */ j(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
