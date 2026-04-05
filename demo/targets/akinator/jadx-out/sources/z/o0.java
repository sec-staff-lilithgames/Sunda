package z;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o0 extends u {
    public o0() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(o0 o0Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = o0Var.f96946b;
        }
        o0Var.trim(i10);
    }

    public final boolean add(long j10) {
        ensureCapacity(this.f96946b + 1);
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        jArr[i10] = j10;
        this.f96946b = i10 + 1;
        return true;
    }

    public final boolean addAll(int i10, long[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        if (i10 < 0 || i10 > this.f96946b) {
            a0.d.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this.f96946b + elements.length);
        long[] jArr = this.f96945a;
        int i11 = this.f96946b;
        if (i10 != i11) {
            uu.f0.copyInto(jArr, jArr, elements.length + i10, i10, i11);
        }
        uu.f0.copyInto$default(elements, jArr, i10, 0, 0, 12, (Object) null);
        this.f96946b += elements.length;
        return true;
    }

    public final void clear() {
        this.f96946b = 0;
    }

    public final void ensureCapacity(int i10) {
        long[] jArr = this.f96945a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, (jArr.length * 3) / 2));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f96945a = jArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.f96945a.length;
    }

    public final void minusAssign(long j10) {
        remove(j10);
    }

    public final void plusAssign(u elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        addAll(this.f96946b, elements);
    }

    public final boolean remove(long j10) {
        int iIndexOf = indexOf(j10);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(long[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96946b;
        for (long j10 : elements) {
            remove(j10);
        }
        return i10 != this.f96946b;
    }

    public final long removeAt(int i10) {
        if (i10 < 0 || i10 >= this.f96946b) {
            a0.d.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        long[] jArr = this.f96945a;
        long j10 = jArr[i10];
        int i11 = this.f96946b;
        if (i10 != i11 - 1) {
            uu.f0.copyInto(jArr, jArr, i10, i10 + 1, i11);
        }
        this.f96946b--;
        return j10;
    }

    public final void removeRange(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f96946b) || i11 < 0 || i11 > i12) {
            a0.d.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        if (i11 < i10) {
            a0.d.throwIllegalArgumentException("The end index must be < start index");
        }
        if (i11 != i10) {
            int i13 = this.f96946b;
            if (i11 < i13) {
                long[] jArr = this.f96945a;
                uu.f0.copyInto(jArr, jArr, i10, i11, i13);
            }
            this.f96946b -= i11 - i10;
        }
    }

    public final boolean retainAll(long[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96946b;
        long[] jArr = this.f96945a;
        int i11 = i10 - 1;
        while (true) {
            int i12 = 0;
            int i13 = -1;
            if (-1 >= i11) {
                break;
            }
            long j10 = jArr[i11];
            int length = elements.length;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (elements[i12] == j10) {
                    i13 = i12;
                    break;
                }
                i12++;
            }
            if (i13 < 0) {
                removeAt(i11);
            }
            i11--;
        }
        return i10 != this.f96946b;
    }

    public final long set(int i10, long j10) {
        if (i10 < 0 || i10 >= this.f96946b) {
            a0.d.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        long[] jArr = this.f96945a;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    public final void sort() {
        int i10 = this.f96946b;
        if (i10 == 0) {
            return;
        }
        uu.f0.sort(this.f96945a, 0, i10);
    }

    public final void sortDescending() {
        int i10 = this.f96946b;
        if (i10 == 0) {
            return;
        }
        uu.k0.sortDescending(this.f96945a, 0, i10);
    }

    public final void trim(int i10) {
        int iMax = Math.max(i10, this.f96946b);
        long[] jArr = this.f96945a;
        if (jArr.length > iMax) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f96945a = jArrCopyOf;
        }
    }

    public o0(int i10) {
        super(i10, null);
    }

    public final void minusAssign(long[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        for (long j10 : elements) {
            remove(j10);
        }
    }

    public final void plusAssign(long[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        addAll(this.f96946b, elements);
    }

    public /* synthetic */ o0(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final void plusAssign(long j10) {
        add(j10);
    }

    public final void add(int i10, long j10) {
        if (i10 < 0 || i10 > this.f96946b) {
            a0.d.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this.f96946b + 1);
        long[] jArr = this.f96945a;
        int i11 = this.f96946b;
        if (i10 != i11) {
            uu.f0.copyInto(jArr, jArr, i10 + 1, i10, i11);
        }
        jArr[i10] = j10;
        this.f96946b++;
    }

    public final void minusAssign(u elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        long[] jArr = elements.f96945a;
        int i10 = elements.f96946b;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(jArr[i11]);
        }
    }

    public final boolean removeAll(u elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96946b;
        int i11 = elements.f96946b - 1;
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                remove(elements.get(i12));
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        return i10 != this.f96946b;
    }

    public final boolean retainAll(u elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96946b;
        long[] jArr = this.f96945a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.contains(jArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this.f96946b;
    }

    public final boolean addAll(int i10, u elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        if (i10 < 0 || i10 > this.f96946b) {
            a0.d.throwIndexOutOfBoundsException("");
        }
        int i11 = elements.f96946b;
        if (i11 == 0) {
            return false;
        }
        ensureCapacity(this.f96946b + i11);
        long[] jArr = this.f96945a;
        int i12 = this.f96946b;
        if (i10 != i12) {
            uu.f0.copyInto(jArr, jArr, elements.f96946b + i10, i10, i12);
        }
        uu.f0.copyInto(elements.f96945a, jArr, i10, 0, elements.f96946b);
        this.f96946b += elements.f96946b;
        return true;
    }

    public final boolean addAll(u elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return addAll(this.f96946b, elements);
    }

    public final boolean addAll(long[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return addAll(this.f96946b, elements);
    }
}
