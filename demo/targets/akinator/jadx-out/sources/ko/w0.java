package ko;

import com.ironsource.C3191e4;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f71792a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f71793b;

    public w0(z0 z0Var) {
        this(z0Var, z0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            w0 w0Var = (w0) obj;
            if (this.f71792a.equals(w0Var.f71792a) && this.f71793b.equals(w0Var.f71793b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f71793b.hashCode() + (this.f71792a.hashCode() * 31);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder(C3191e4.i.f36529d);
        z0 z0Var = this.f71792a;
        sb2.append(z0Var);
        z0 z0Var2 = this.f71793b;
        if (z0Var.equals(z0Var2)) {
            str = "";
        } else {
            str = ", " + z0Var2;
        }
        return o2.o(sb2, str, C3191e4.i.f36531e);
    }

    public w0(z0 z0Var, z0 z0Var2) {
        this.f71792a = (z0) io.bidmachine.media3.common.util.a.checkNotNull(z0Var);
        this.f71793b = (z0) io.bidmachine.media3.common.util.a.checkNotNull(z0Var2);
    }
}
