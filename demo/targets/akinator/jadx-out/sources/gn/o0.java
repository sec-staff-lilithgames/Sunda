package gn;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class o0 {

    /* renamed from: h, reason: collision with root package name */
    public static final String f58031h = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: i, reason: collision with root package name */
    public static final String f58032i = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: j, reason: collision with root package name */
    public static final String f58033j = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);

    /* renamed from: k, reason: collision with root package name */
    public static final String f58034k = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(3);

    /* renamed from: l, reason: collision with root package name */
    public static final String f58035l = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(4);

    /* renamed from: m, reason: collision with root package name */
    public static final String f58036m = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(5);

    /* renamed from: n, reason: collision with root package name */
    public static final String f58037n = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(6);

    /* renamed from: a, reason: collision with root package name */
    public final Uri f58038a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58039b;

    /* renamed from: c, reason: collision with root package name */
    public final String f58040c;

    /* renamed from: d, reason: collision with root package name */
    public final int f58041d;

    /* renamed from: e, reason: collision with root package name */
    public final int f58042e;

    /* renamed from: f, reason: collision with root package name */
    public final String f58043f;

    /* renamed from: g, reason: collision with root package name */
    public final String f58044g;

    public o0(Uri uri, String str, String str2, int i10, int i11, String str3) {
        this.f58038a = uri;
        this.f58039b = x0.normalizeMimeType(str);
        this.f58040c = str2;
        this.f58041d = i10;
        this.f58042e = i11;
        this.f58043f = str3;
        this.f58044g = null;
    }

    public static o0 fromBundle(Bundle bundle) {
        Uri uri = (Uri) io.bidmachine.media3.common.util.a.checkNotNull((Uri) bundle.getParcelable(f58031h));
        String string = bundle.getString(f58032i);
        String string2 = bundle.getString(f58033j);
        int i10 = bundle.getInt(f58034k, 0);
        int i11 = bundle.getInt(f58035l, 0);
        String string3 = bundle.getString(f58036m);
        return new n0(uri).setMimeType(string).setLanguage(string2).setSelectionFlags(i10).setRoleFlags(i11).setLabel(string3).setId(bundle.getString(f58037n)).build();
    }

    public n0 buildUpon() {
        n0 n0Var = new n0();
        n0Var.f58020a = this.f58038a;
        n0Var.f58021b = this.f58039b;
        n0Var.f58022c = this.f58040c;
        n0Var.f58023d = this.f58041d;
        n0Var.f58024e = this.f58042e;
        n0Var.f58025f = this.f58043f;
        n0Var.f58026g = this.f58044g;
        return n0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f58038a.equals(o0Var.f58038a) && Objects.equals(this.f58039b, o0Var.f58039b) && Objects.equals(this.f58040c, o0Var.f58040c) && this.f58041d == o0Var.f58041d && this.f58042e == o0Var.f58042e && Objects.equals(this.f58043f, o0Var.f58043f) && Objects.equals(this.f58044g, o0Var.f58044g);
    }

    public int hashCode() {
        int iHashCode = this.f58038a.hashCode() * 31;
        String str = this.f58039b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f58040c;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f58041d) * 31) + this.f58042e) * 31;
        String str3 = this.f58043f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f58044g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f58031h, this.f58038a);
        String str = this.f58039b;
        if (str != null) {
            bundle.putString(f58032i, str);
        }
        String str2 = this.f58040c;
        if (str2 != null) {
            bundle.putString(f58033j, str2);
        }
        int i10 = this.f58041d;
        if (i10 != 0) {
            bundle.putInt(f58034k, i10);
        }
        int i11 = this.f58042e;
        if (i11 != 0) {
            bundle.putInt(f58035l, i11);
        }
        String str3 = this.f58043f;
        if (str3 != null) {
            bundle.putString(f58036m, str3);
        }
        String str4 = this.f58044g;
        if (str4 != null) {
            bundle.putString(f58037n, str4);
        }
        return bundle;
    }

    public o0(n0 n0Var) {
        this.f58038a = n0Var.f58020a;
        this.f58039b = n0Var.f58021b;
        this.f58040c = n0Var.f58022c;
        this.f58041d = n0Var.f58023d;
        this.f58042e = n0Var.f58024e;
        this.f58043f = n0Var.f58025f;
        this.f58044g = n0Var.f58026g;
    }
}
