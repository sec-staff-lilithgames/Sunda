package b1;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final z.o0 f8675a;

    public r(long[] jArr) {
        z.o0 o0Var;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            o0Var = new z.o0(jArrCopyOf.length);
            o0Var.addAll(o0Var.f96946b, jArrCopyOf);
        } else {
            o0Var = new z.o0(0, 1, null);
        }
        this.f8675a = o0Var;
    }

    public final void add(long j10) {
        this.f8675a.add(j10);
    }

    public final long[] toArray() {
        z.o0 o0Var = this.f8675a;
        int i10 = o0Var.f96946b;
        if (i10 == 0) {
            return null;
        }
        long[] jArr = new long[i10];
        long[] jArr2 = o0Var.f96945a;
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = jArr2[i11];
        }
        return jArr;
    }
}
