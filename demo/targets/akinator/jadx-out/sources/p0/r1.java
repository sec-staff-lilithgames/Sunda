package p0;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f80423a = new int[10];

    /* renamed from: b, reason: collision with root package name */
    public int f80424b;

    public final void clear() {
        this.f80424b = 0;
    }

    public final int getSize() {
        return this.f80424b;
    }

    public final int indexOf(int i10) {
        int[] iArr = this.f80423a;
        int iMin = Math.min(iArr.length, this.f80424b);
        for (int i11 = 0; i11 < iMin; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.f80424b == 0;
    }

    public final boolean isNotEmpty() {
        return this.f80424b != 0;
    }

    public final int peek() {
        return this.f80423a[this.f80424b - 1];
    }

    public final int peek2() {
        return this.f80423a[this.f80424b - 2];
    }

    public final int peekOr(int i10) {
        int i11 = this.f80424b - 1;
        return i11 >= 0 ? this.f80423a[i11] : i10;
    }

    public final int pop() {
        int[] iArr = this.f80423a;
        int i10 = this.f80424b - 1;
        this.f80424b = i10;
        return iArr[i10];
    }

    public final void push(int i10) {
        int[] iArrCopyOf = this.f80423a;
        if (this.f80424b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f80423a = iArrCopyOf;
        }
        int i11 = this.f80424b;
        this.f80424b = i11 + 1;
        iArrCopyOf[i11] = i10;
    }

    public final int peek(int i10) {
        return this.f80423a[i10];
    }
}
