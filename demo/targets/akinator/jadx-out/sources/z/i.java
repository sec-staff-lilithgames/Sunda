package z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f96823a;

    /* renamed from: b, reason: collision with root package name */
    public int f96824b;

    /* renamed from: c, reason: collision with root package name */
    public int f96825c;

    /* renamed from: d, reason: collision with root package name */
    public int f96826d;

    public i() {
        this(0, 1, null);
    }

    public final void a() {
        Object[] objArr = this.f96823a;
        int length = objArr.length;
        int i10 = this.f96824b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        Object[] objArr2 = new Object[i12];
        uu.f0.copyInto(objArr, objArr2, 0, i10, length);
        uu.f0.copyInto(this.f96823a, objArr2, i11, 0, this.f96824b);
        this.f96823a = objArr2;
        this.f96824b = 0;
        this.f96825c = length;
        this.f96826d = i12 - 1;
    }

    public final void addFirst(Object obj) {
        int i10 = (this.f96824b - 1) & this.f96826d;
        this.f96824b = i10;
        this.f96823a[i10] = obj;
        if (i10 == this.f96825c) {
            a();
        }
    }

    public final void addLast(Object obj) {
        Object[] objArr = this.f96823a;
        int i10 = this.f96825c;
        objArr[i10] = obj;
        int i11 = this.f96826d & (i10 + 1);
        this.f96825c = i11;
        if (i11 == this.f96824b) {
            a();
        }
    }

    public final void clear() {
        removeFromStart(size());
    }

    public final Object get(int i10) {
        if (i10 < 0 || i10 >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object obj = this.f96823a[this.f96826d & (this.f96824b + i10)];
        kotlin.jvm.internal.e0.checkNotNull(obj);
        return obj;
    }

    public final Object getFirst() {
        int i10 = this.f96824b;
        if (i10 == this.f96825c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object obj = this.f96823a[i10];
        kotlin.jvm.internal.e0.checkNotNull(obj);
        return obj;
    }

    public final Object getLast() {
        int i10 = this.f96824b;
        int i11 = this.f96825c;
        if (i10 == i11) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object obj = this.f96823a[(i11 - 1) & this.f96826d];
        kotlin.jvm.internal.e0.checkNotNull(obj);
        return obj;
    }

    public final boolean isEmpty() {
        return this.f96824b == this.f96825c;
    }

    public final Object popFirst() {
        int i10 = this.f96824b;
        if (i10 == this.f96825c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object[] objArr = this.f96823a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f96824b = (i10 + 1) & this.f96826d;
        return obj;
    }

    public final Object popLast() {
        int i10 = this.f96824b;
        int i11 = this.f96825c;
        if (i10 == i11) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f96826d & (i11 - 1);
        Object[] objArr = this.f96823a;
        Object obj = objArr[i12];
        objArr[i12] = null;
        this.f96825c = i12;
        return obj;
    }

    public final void removeFromEnd(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f96825c;
        int i12 = i10 < i11 ? i11 - i10 : 0;
        for (int i13 = i12; i13 < i11; i13++) {
            this.f96823a[i13] = null;
        }
        int i14 = this.f96825c;
        int i15 = i14 - i12;
        int i16 = i10 - i15;
        this.f96825c = i14 - i15;
        if (i16 > 0) {
            int length = this.f96823a.length;
            this.f96825c = length;
            int i17 = length - i16;
            for (int i18 = i17; i18 < length; i18++) {
                this.f96823a[i18] = null;
            }
            this.f96825c = i17;
        }
    }

    public final void removeFromStart(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.f96823a.length;
        int i11 = this.f96824b;
        if (i10 < length - i11) {
            length = i11 + i10;
        }
        while (i11 < length) {
            this.f96823a[i11] = null;
            i11++;
        }
        int i12 = this.f96824b;
        int i13 = length - i12;
        int i14 = i10 - i13;
        this.f96824b = this.f96826d & (i12 + i13);
        if (i14 > 0) {
            for (int i15 = 0; i15 < i14; i15++) {
                this.f96823a[i15] = null;
            }
            this.f96824b = i14;
        }
    }

    public final int size() {
        return (this.f96825c - this.f96824b) & this.f96826d;
    }

    public i(int i10) {
        if (!(i10 >= 1)) {
            a0.d.throwIllegalArgumentException("capacity must be >= 1");
        }
        if (!(i10 <= 1073741824)) {
            a0.d.throwIllegalArgumentException("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f96826d = i10 - 1;
        this.f96823a = new Object[i10];
    }

    public /* synthetic */ i(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
