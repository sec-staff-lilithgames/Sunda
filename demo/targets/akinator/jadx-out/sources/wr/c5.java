package wr;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c5 implements e5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f90860a;

    /* renamed from: b, reason: collision with root package name */
    public final e5[] f90861b;

    /* renamed from: c, reason: collision with root package name */
    public final int f90862c;

    public c5(int i10, e5[] e5VarArr, int i11) {
        this.f90860a = i10;
        this.f90861b = e5VarArr;
        this.f90862c = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c5 a(d5 d5Var, int i10, e5 e5Var, int i11, int i12) {
        int i13 = (i10 >>> i12) & 31;
        int i14 = 1 << i13;
        int i15 = (i11 >>> i12) & 31;
        int i16 = 1 << i15;
        d5 d5Var2 = e5Var;
        if (i14 == i16) {
            c5 c5VarA = a(d5Var, i10, e5Var, i11, i12 + 5);
            return new c5(i14, new e5[]{c5VarA}, c5VarA.size());
        }
        if (i13 > i15) {
            d5Var2 = d5Var;
            d5Var = e5Var;
        }
        return new c5(i14 | i16, new e5[]{d5Var, d5Var2}, d5Var2.size() + d5Var.size());
    }

    @Override // wr.e5
    public Object get(Object obj, int i10, int i11) {
        int i12 = 1 << ((i10 >>> i11) & 31);
        int i13 = this.f90860a;
        if ((i13 & i12) == 0) {
            return null;
        }
        return this.f90861b[Integer.bitCount((i12 - 1) & i13)].get(obj, i10, i11 + 5);
    }

    @Override // wr.e5
    public e5 put(Object obj, Object obj2, int i10, int i11) {
        int i12 = 1 << ((i10 >>> i11) & 31);
        int i13 = this.f90860a;
        int iBitCount = Integer.bitCount((i12 - 1) & i13);
        int i14 = i13 & i12;
        e5[] e5VarArr = this.f90861b;
        if (i14 != 0) {
            e5[] e5VarArr2 = (e5[]) Arrays.copyOf(e5VarArr, e5VarArr.length);
            e5VarArr2[iBitCount] = e5VarArr[iBitCount].put(obj, obj2, i10, i11 + 5);
            return new c5(i13, e5VarArr2, (e5VarArr2[iBitCount].size() + size()) - e5VarArr[iBitCount].size());
        }
        int i15 = i13 | i12;
        e5[] e5VarArr3 = new e5[e5VarArr.length + 1];
        System.arraycopy(e5VarArr, 0, e5VarArr3, 0, iBitCount);
        e5VarArr3[iBitCount] = new d5(obj, obj2);
        System.arraycopy(e5VarArr, iBitCount, e5VarArr3, iBitCount + 1, e5VarArr.length - iBitCount);
        return new c5(i15, e5VarArr3, size() + 1);
    }

    @Override // wr.e5
    public int size() {
        return this.f90862c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CompressedIndex(");
        sb2.append("bitmap=" + Integer.toBinaryString(this.f90860a) + " ");
        for (e5 e5Var : this.f90861b) {
            sb2.append(e5Var);
            sb2.append(" ");
        }
        sb2.append(")");
        return sb2.toString();
    }
}
