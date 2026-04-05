package xn;

import android.text.TextUtils;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f92052a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f92053b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f92054c;

    public b0(String str, boolean z10, boolean z11) {
        this.f92052a = str;
        this.f92053b = z10;
        this.f92054c = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == b0.class) {
            b0 b0Var = (b0) obj;
            if (TextUtils.equals(this.f92052a, b0Var.f92052a) && this.f92053b == b0Var.f92053b && this.f92054c == b0Var.f92054c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((o2.e(31, 31, this.f92052a) + (this.f92053b ? 1231 : 1237)) * 31) + (this.f92054c ? 1231 : 1237);
    }
}
