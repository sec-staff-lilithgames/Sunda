package z;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 extends o {
    public i0() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(i0 i0Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = i0Var.f96886b;
        }
        i0Var.trim(i10);
    }

    public final boolean add(int i10) {
        ensureCapacity(this.f96886b + 1);
        int[] iArr = this.f96885a;
        int i11 = this.f96886b;
        iArr[i11] = i10;
        this.f96886b = i11 + 1;
        return true;
    }

    public final boolean addAll(int i10, int[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        if (i10 < 0 || i10 > this.f96886b) {
            a0.d.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this.f96886b + elements.length);
        int[] iArr = this.f96885a;
        int i11 = this.f96886b;
        if (i10 != i11) {
            uu.f0.copyInto(iArr, iArr, elements.length + i10, i10, i11);
        }
        uu.f0.copyInto$default(elements, iArr, i10, 0, 0, 12, (Object) null);
        this.f96886b += elements.length;
        return true;
    }

    public final void clear() {
        this.f96886b = 0;
    }

    public final void ensureCapacity(int i10) {
        int[] iArr = this.f96885a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f96885a = iArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.f96885a.length;
    }

    public final void minusAssign(int i10) {
        remove(i10);
    }

    public final void plusAssign(o elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        addAll(this.f96886b, elements);
    }

    public final boolean remove(int i10) {
        int iIndexOf = indexOf(i10);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(int[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96886b;
        for (int i11 : elements) {
            remove(i11);
        }
        return i10 != this.f96886b;
    }

    public final int removeAt(int i10) {
        if (i10 < 0 || i10 >= this.f96886b) {
            a0.d.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.f96885a;
        int i11 = iArr[i10];
        int i12 = this.f96886b;
        if (i10 != i12 - 1) {
            uu.f0.copyInto(iArr, iArr, i10, i10 + 1, i12);
        }
        this.f96886b--;
        return i11;
    }

    public final void removeRange(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f96886b) || i11 < 0 || i11 > i12) {
            a0.d.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        if (i11 < i10) {
            a0.d.throwIllegalArgumentException("The end index must be < start index");
        }
        if (i11 != i10) {
            int i13 = this.f96886b;
            if (i11 < i13) {
                int[] iArr = this.f96885a;
                uu.f0.copyInto(iArr, iArr, i10, i11, i13);
            }
            this.f96886b -= i11 - i10;
        }
    }

    public final boolean retainAll(int[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96886b;
        int[] iArr = this.f96885a;
        int i11 = i10 - 1;
        while (true) {
            int i12 = 0;
            int i13 = -1;
            if (-1 >= i11) {
                break;
            }
            int i14 = iArr[i11];
            int length = elements.length;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (elements[i12] == i14) {
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
        return i10 != this.f96886b;
    }

    public final int set(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f96886b) {
            a0.d.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.f96885a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    public final void sort() {
        int i10 = this.f96886b;
        if (i10 == 0) {
            return;
        }
        uu.f0.sort(this.f96885a, 0, i10);
    }

    public final void sortDescending() {
        int i10 = this.f96886b;
        if (i10 == 0) {
            return;
        }
        uu.k0.sortDescending(this.f96885a, 0, i10);
    }

    public final void trim(int i10) {
        int iMax = Math.max(i10, this.f96886b);
        int[] iArr = this.f96885a;
        if (iArr.length > iMax) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f96885a = iArrCopyOf;
        }
    }

    public i0(int i10) {
        super(i10, null);
    }

    public final void minusAssign(int[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        for (int i10 : elements) {
            remove(i10);
        }
    }

    public final void plusAssign(int[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        addAll(this.f96886b, elements);
    }

    public /* synthetic */ i0(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final void plusAssign(int i10) {
        add(i10);
    }

    public final void add(int i10, int i11) {
        if (i10 < 0 || i10 > this.f96886b) {
            a0.d.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this.f96886b + 1);
        int[] iArr = this.f96885a;
        int i12 = this.f96886b;
        if (i10 != i12) {
            uu.f0.copyInto(iArr, iArr, i10 + 1, i10, i12);
        }
        iArr[i10] = i11;
        this.f96886b++;
    }

    public final void minusAssign(o elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int[] iArr = elements.f96885a;
        int i10 = elements.f96886b;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(iArr[i11]);
        }
    }

    public final boolean removeAll(o elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96886b;
        int i11 = elements.f96886b - 1;
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
        return i10 != this.f96886b;
    }

    public final boolean retainAll(o elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96886b;
        int[] iArr = this.f96885a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.contains(iArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this.f96886b;
    }

    public final boolean addAll(int i10, o elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        if (i10 < 0 || i10 > this.f96886b) {
            a0.d.throwIndexOutOfBoundsException("");
        }
        int i11 = elements.f96886b;
        if (i11 == 0) {
            return false;
        }
        ensureCapacity(this.f96886b + i11);
        int[] iArr = this.f96885a;
        int i12 = this.f96886b;
        if (i10 != i12) {
            uu.f0.copyInto(iArr, iArr, elements.f96886b + i10, i10, i12);
        }
        uu.f0.copyInto(elements.f96885a, iArr, i10, 0, elements.f96886b);
        this.f96886b += elements.f96886b;
        return true;
    }

    public final boolean addAll(o elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return addAll(this.f96886b, elements);
    }

    public final boolean addAll(int[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return addAll(this.f96886b, elements);
    }
}
