package ee;

import com.ironsource.C3191e4;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f54193a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f54194b;

    public g0(j0 j0Var) {
        this(j0Var, j0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f54193a.equals(g0Var.f54193a) && this.f54194b.equals(g0Var.f54194b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f54194b.hashCode() + (this.f54193a.hashCode() * 31);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder(C3191e4.i.f36529d);
        j0 j0Var = this.f54193a;
        sb2.append(j0Var);
        j0 j0Var2 = this.f54194b;
        if (j0Var.equals(j0Var2)) {
            str = "";
        } else {
            str = ", " + j0Var2;
        }
        return o2.o(sb2, str, C3191e4.i.f36531e);
    }

    public g0(j0 j0Var, j0 j0Var2) {
        this.f54193a = (j0) com.google.android.exoplayer2.util.a.checkNotNull(j0Var);
        this.f54194b = (j0) com.google.android.exoplayer2.util.a.checkNotNull(j0Var2);
    }
}
