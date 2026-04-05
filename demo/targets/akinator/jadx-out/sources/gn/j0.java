package gn;

import android.net.Uri;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import nh.b5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j0 {

    /* renamed from: j, reason: collision with root package name */
    public static final String f57955j = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: k, reason: collision with root package name */
    public static final String f57956k = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: l, reason: collision with root package name */
    public static final String f57957l = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);

    /* renamed from: m, reason: collision with root package name */
    public static final String f57958m = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(3);

    /* renamed from: n, reason: collision with root package name */
    public static final String f57959n = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(4);

    /* renamed from: o, reason: collision with root package name */
    public static final String f57960o = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(5);

    /* renamed from: p, reason: collision with root package name */
    public static final String f57961p = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(6);

    /* renamed from: q, reason: collision with root package name */
    public static final String f57962q = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(7);

    /* renamed from: a, reason: collision with root package name */
    public final Uri f57963a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57964b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f57965c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f57966d;

    /* renamed from: e, reason: collision with root package name */
    public final List f57967e;

    /* renamed from: f, reason: collision with root package name */
    public final String f57968f;

    /* renamed from: g, reason: collision with root package name */
    public final b5 f57969g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f57970h;

    /* renamed from: i, reason: collision with root package name */
    public final long f57971i;

    public j0(Uri uri, String str, h0 h0Var, b0 b0Var, List list, String str2, b5 b5Var, Object obj, long j10) {
        this.f57963a = uri;
        this.f57964b = x0.normalizeMimeType(str);
        this.f57965c = h0Var;
        this.f57966d = b0Var;
        this.f57967e = list;
        this.f57968f = str2;
        this.f57969g = b5Var;
        x4 x4VarBuilder = b5.builder();
        for (int i10 = 0; i10 < b5Var.size(); i10++) {
            n0 n0VarBuildUpon = ((o0) b5Var.get(i10)).buildUpon();
            n0VarBuildUpon.getClass();
            x4VarBuilder.add((Object) new m0(n0VarBuildUpon));
        }
        x4VarBuilder.build();
        this.f57970h = obj;
        this.f57971i = j10;
    }

    public static j0 fromBundle(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f57957l);
        h0 h0VarFromBundle = bundle2 == null ? null : h0.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(f57958m);
        b0 b0VarFromBundle = bundle3 != null ? b0.fromBundle(bundle3) : null;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f57959n);
        b5 b5VarOf = parcelableArrayList == null ? b5.of() : io.bidmachine.media3.common.util.f.fromBundleList(new ao.c(17), parcelableArrayList);
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f57961p);
        return new j0((Uri) io.bidmachine.media3.common.util.a.checkNotNull((Uri) bundle.getParcelable(f57955j)), bundle.getString(f57956k), h0VarFromBundle, b0VarFromBundle, b5VarOf, bundle.getString(f57960o), parcelableArrayList2 == null ? b5.of() : io.bidmachine.media3.common.util.f.fromBundleList(new ao.c(18), parcelableArrayList2), null, bundle.getLong(f57962q, C.TIME_UNSET));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f57963a.equals(j0Var.f57963a) && Objects.equals(this.f57964b, j0Var.f57964b) && Objects.equals(this.f57965c, j0Var.f57965c) && Objects.equals(this.f57966d, j0Var.f57966d) && this.f57967e.equals(j0Var.f57967e) && Objects.equals(this.f57968f, j0Var.f57968f) && this.f57969g.equals(j0Var.f57969g) && Objects.equals(this.f57970h, j0Var.f57970h) && this.f57971i == j0Var.f57971i;
    }

    public int hashCode() {
        int iHashCode = this.f57963a.hashCode() * 31;
        String str = this.f57964b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        h0 h0Var = this.f57965c;
        int iHashCode3 = (iHashCode2 + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        b0 b0Var = this.f57966d;
        int iHashCode4 = (this.f57967e.hashCode() + ((iHashCode3 + (b0Var == null ? 0 : b0Var.hashCode())) * 31)) * 31;
        String str2 = this.f57968f;
        int iHashCode5 = (this.f57969g.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        return (int) (((iHashCode5 + (this.f57970h != null ? r2.hashCode() : 0)) * 31) + this.f57971i);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f57955j, this.f57963a);
        String str = this.f57964b;
        if (str != null) {
            bundle.putString(f57956k, str);
        }
        h0 h0Var = this.f57965c;
        if (h0Var != null) {
            bundle.putBundle(f57957l, h0Var.toBundle());
        }
        b0 b0Var = this.f57966d;
        if (b0Var != null) {
            bundle.putBundle(f57958m, b0Var.toBundle());
        }
        List list = this.f57967e;
        if (!list.isEmpty()) {
            bundle.putParcelableArrayList(f57959n, io.bidmachine.media3.common.util.f.toBundleArrayList(list, new ao.c(19)));
        }
        String str2 = this.f57968f;
        if (str2 != null) {
            bundle.putString(f57960o, str2);
        }
        b5 b5Var = this.f57969g;
        if (!b5Var.isEmpty()) {
            bundle.putParcelableArrayList(f57961p, io.bidmachine.media3.common.util.f.toBundleArrayList(b5Var, new ao.c(20)));
        }
        long j10 = this.f57971i;
        if (j10 != C.TIME_UNSET) {
            bundle.putLong(f57962q, j10);
        }
        return bundle;
    }
}
