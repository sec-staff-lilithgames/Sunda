package ee;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f54220a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f54221b;

    /* renamed from: c, reason: collision with root package name */
    public final int f54222c;

    /* renamed from: d, reason: collision with root package name */
    public final int f54223d;

    public k0(int i10, byte[] bArr, int i11, int i12) {
        this.f54220a = i10;
        this.f54221b = bArr;
        this.f54222c = i11;
        this.f54223d = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            if (this.f54220a == k0Var.f54220a && this.f54222c == k0Var.f54222c && this.f54223d == k0Var.f54223d && Arrays.equals(this.f54221b, k0Var.f54221b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.f54221b) + (this.f54220a * 31)) * 31) + this.f54222c) * 31) + this.f54223d;
    }
}
