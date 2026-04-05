package ko;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f71624a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f71625b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71626c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71627d;

    public d1(int i10, byte[] bArr, int i11, int i12) {
        this.f71624a = i10;
        this.f71625b = bArr;
        this.f71626c = i11;
        this.f71627d = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d1.class == obj.getClass()) {
            d1 d1Var = (d1) obj;
            if (this.f71624a == d1Var.f71624a && this.f71626c == d1Var.f71626c && this.f71627d == d1Var.f71627d && Arrays.equals(this.f71625b, d1Var.f71625b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.f71625b) + (this.f71624a * 31)) * 31) + this.f71626c) * 31) + this.f71627d;
    }
}
