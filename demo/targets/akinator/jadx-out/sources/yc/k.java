package yc;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Iterator[] f94320a;

    /* renamed from: b, reason: collision with root package name */
    public int f94321b;

    /* renamed from: c, reason: collision with root package name */
    public int f94322c;

    public Iterator<?> popOrNull() {
        int i10 = this.f94321b;
        if (i10 == 0) {
            return null;
        }
        Iterator<?>[] itArr = this.f94320a;
        int i11 = i10 - 1;
        this.f94321b = i11;
        return itArr[i11];
    }

    public void push(Iterator<?> it) {
        int i10 = this.f94321b;
        int i11 = this.f94322c;
        if (i10 < i11) {
            Iterator[] itArr = this.f94320a;
            this.f94321b = i10 + 1;
            itArr[i10] = it;
            return;
        }
        if (this.f94320a == null) {
            this.f94322c = 10;
            this.f94320a = new Iterator[10];
        } else {
            int iMin = Math.min(4000, Math.max(20, i11 >> 1)) + i11;
            this.f94322c = iMin;
            this.f94320a = (Iterator[]) Arrays.copyOf(this.f94320a, iMin);
        }
        Iterator[] itArr2 = this.f94320a;
        int i12 = this.f94321b;
        this.f94321b = i12 + 1;
        itArr2[i12] = it;
    }
}
