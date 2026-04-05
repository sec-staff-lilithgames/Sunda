package gn;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p0 f58045g = new c0().build();

    /* renamed from: h, reason: collision with root package name */
    public static final String f58046h = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: i, reason: collision with root package name */
    public static final String f58047i = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: j, reason: collision with root package name */
    public static final String f58048j = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);

    /* renamed from: k, reason: collision with root package name */
    public static final String f58049k = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(3);

    /* renamed from: l, reason: collision with root package name */
    public static final String f58050l = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(4);

    /* renamed from: m, reason: collision with root package name */
    public static final String f58051m = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f58052a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f58053b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f58054c;

    /* renamed from: d, reason: collision with root package name */
    public final s0 f58055d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f58056e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f58057f;

    public p0(String str, f0 f0Var, j0 j0Var, i0 i0Var, s0 s0Var, l0 l0Var) {
        this.f58052a = str;
        this.f58053b = j0Var;
        this.f58054c = i0Var;
        this.f58055d = s0Var;
        this.f58056e = f0Var;
        this.f58057f = l0Var;
    }

    public static p0 fromBundle(Bundle bundle) {
        String str = (String) io.bidmachine.media3.common.util.a.checkNotNull(bundle.getString(f58046h, ""));
        Bundle bundle2 = bundle.getBundle(f58047i);
        i0 i0VarFromBundle = bundle2 == null ? i0.f57938f : i0.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(f58048j);
        s0 s0VarFromBundle = bundle3 == null ? s0.K : s0.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(f58049k);
        f0 f0VarFromBundle = bundle4 == null ? f0.f57877p : e0.fromBundle(bundle4);
        Bundle bundle5 = bundle.getBundle(f58050l);
        l0 l0VarFromBundle = bundle5 == null ? l0.f57989d : l0.fromBundle(bundle5);
        Bundle bundle6 = bundle.getBundle(f58051m);
        return new p0(str, f0VarFromBundle, bundle6 == null ? null : j0.fromBundle(bundle6), i0VarFromBundle, s0VarFromBundle, l0VarFromBundle);
    }

    public static p0 fromUri(String str) {
        return new c0().setUri(str).build();
    }

    public final Bundle a(boolean z10) {
        j0 j0Var;
        Bundle bundle = new Bundle();
        String str = this.f58052a;
        if (!str.equals("")) {
            bundle.putString(f58046h, str);
        }
        i0 i0Var = i0.f57938f;
        i0 i0Var2 = this.f58054c;
        if (!i0Var2.equals(i0Var)) {
            bundle.putBundle(f58047i, i0Var2.toBundle());
        }
        s0 s0Var = s0.K;
        s0 s0Var2 = this.f58055d;
        if (!s0Var2.equals(s0Var)) {
            bundle.putBundle(f58048j, s0Var2.toBundle());
        }
        e0 e0Var = e0.f57857h;
        f0 f0Var = this.f58056e;
        if (!f0Var.equals(e0Var)) {
            bundle.putBundle(f58049k, f0Var.toBundle());
        }
        l0 l0Var = l0.f57989d;
        l0 l0Var2 = this.f58057f;
        if (!l0Var2.equals(l0Var)) {
            bundle.putBundle(f58050l, l0Var2.toBundle());
        }
        if (z10 && (j0Var = this.f58053b) != null) {
            bundle.putBundle(f58051m, j0Var.toBundle());
        }
        return bundle;
    }

    public c0 buildUpon() {
        c0 c0Var = new c0();
        c0Var.f57833d = this.f58056e.buildUpon();
        c0Var.f57830a = this.f58052a;
        c0Var.f57841l = this.f58055d;
        c0Var.f57842m = this.f58054c.buildUpon();
        c0Var.f57843n = this.f58057f;
        j0 j0Var = this.f58053b;
        if (j0Var != null) {
            c0Var.f57836g = j0Var.f57968f;
            c0Var.f57832c = j0Var.f57964b;
            c0Var.f57831b = j0Var.f57963a;
            c0Var.f57835f = j0Var.f57967e;
            c0Var.f57837h = j0Var.f57969g;
            c0Var.f57839j = j0Var.f57970h;
            h0 h0Var = j0Var.f57965c;
            c0Var.f57834e = h0Var != null ? h0Var.buildUpon() : new g0();
            c0Var.f57838i = j0Var.f57966d;
            c0Var.f57840k = j0Var.f57971i;
        }
        return c0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Objects.equals(this.f58052a, p0Var.f58052a) && this.f58056e.equals(p0Var.f58056e) && Objects.equals(this.f58053b, p0Var.f58053b) && Objects.equals(this.f58054c, p0Var.f58054c) && Objects.equals(this.f58055d, p0Var.f58055d) && Objects.equals(this.f58057f, p0Var.f58057f);
    }

    public int hashCode() {
        int iHashCode = this.f58052a.hashCode() * 31;
        j0 j0Var = this.f58053b;
        return this.f58057f.hashCode() + ((this.f58055d.hashCode() + ((this.f58056e.hashCode() + ((this.f58054c.hashCode() + ((iHashCode + (j0Var != null ? j0Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public Bundle toBundle() {
        return a(false);
    }

    public Bundle toBundleIncludeLocalConfiguration() {
        return a(true);
    }

    public static p0 fromUri(Uri uri) {
        return new c0().setUri(uri).build();
    }
}
