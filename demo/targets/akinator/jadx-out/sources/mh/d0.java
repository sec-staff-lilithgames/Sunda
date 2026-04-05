package mh;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d0 extends g0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f74597b;

    /* renamed from: c, reason: collision with root package name */
    public final char[] f74598c;

    /* renamed from: e, reason: collision with root package name */
    public final char[] f74599e;

    public d0(String str, char[] cArr, char[] cArr2) {
        this.f74597b = str;
        this.f74598c = cArr;
        this.f74599e = cArr2;
        p1.checkArgument(cArr.length == cArr2.length);
        int i10 = 0;
        while (i10 < cArr.length) {
            p1.checkArgument(cArr[i10] <= cArr2[i10]);
            int i11 = i10 + 1;
            if (i11 < cArr.length) {
                p1.checkArgument(cArr2[i10] < cArr[i11]);
            }
            i10 = i11;
        }
    }

    @Override // mh.g0, mh.q1
    @Deprecated
    public /* bridge */ /* synthetic */ boolean apply(Object obj) {
        return apply((Character) obj);
    }

    @Override // mh.g0
    public boolean matches(char c10) {
        int iBinarySearch = Arrays.binarySearch(this.f74598c, c10);
        if (iBinarySearch >= 0) {
            return true;
        }
        int i10 = (~iBinarySearch) - 1;
        return i10 >= 0 && c10 <= this.f74599e[i10];
    }

    @Override // mh.g0
    public String toString() {
        return this.f74597b;
    }
}
