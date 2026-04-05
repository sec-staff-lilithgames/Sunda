package x3;

import android.graphics.Rect;
import android.view.View;
import x3.e3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class s3 {

    /* renamed from: b, reason: collision with root package name */
    public static final e3 f91673b = new e3.a().build().consumeDisplayCutout().consumeStableInsets().consumeSystemWindowInsets();

    /* renamed from: a, reason: collision with root package name */
    public final e3 f91674a;

    public s3(e3 e3Var) {
        this.f91674a = e3Var;
    }

    public e3 a() {
        return this.f91674a;
    }

    public e3 b() {
        return this.f91674a;
    }

    public e3 c() {
        return this.f91674a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        return p() == s3Var.p() && o() == s3Var.o() && w3.d.equals(l(), s3Var.l()) && w3.d.equals(j(), s3Var.j()) && w3.d.equals(f(), s3Var.f());
    }

    public s f() {
        return null;
    }

    public o3.c g() {
        return l();
    }

    public o3.c getInsets(int i10) {
        return o3.c.f77431e;
    }

    public o3.c getInsetsIgnoringVisibility(int i10) {
        if ((i10 & 8) == 0) {
            return o3.c.f77431e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public Rect h() {
        return null;
    }

    public int hashCode() {
        return w3.d.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
    }

    public v0 i(int i10) {
        return null;
    }

    public boolean isVisible(int i10) {
        return true;
    }

    public o3.c j() {
        return o3.c.f77431e;
    }

    public o3.c k() {
        return l();
    }

    public o3.c l() {
        return o3.c.f77431e;
    }

    public o3.c m() {
        return l();
    }

    public e3 n(int i10, int i11, int i12, int i13) {
        return f91673b;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public void d(View view) {
    }

    public void e(e3 e3Var) {
    }

    public void q(o3.c cVar) {
    }

    public void r(e3 e3Var) {
    }

    public void s(int i10) {
    }

    public void setOverriddenInsets(o3.c[] cVarArr) {
    }

    public void setStableInsets(o3.c cVar) {
    }
}
