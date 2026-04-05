package gn;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l0 {

    /* renamed from: d, reason: collision with root package name */
    public static final l0 f57989d = new k0().build();

    /* renamed from: e, reason: collision with root package name */
    public static final String f57990e = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: f, reason: collision with root package name */
    public static final String f57991f = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: g, reason: collision with root package name */
    public static final String f57992g = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);

    /* renamed from: a, reason: collision with root package name */
    public final Uri f57993a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57994b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f57995c;

    public l0(k0 k0Var) {
        this.f57993a = k0Var.f57974a;
        this.f57994b = k0Var.f57975b;
        this.f57995c = k0Var.f57976c;
    }

    public static l0 fromBundle(Bundle bundle) {
        return new k0().setMediaUri((Uri) bundle.getParcelable(f57990e)).setSearchQuery(bundle.getString(f57991f)).setExtras(bundle.getBundle(f57992g)).build();
    }

    public k0 buildUpon() {
        k0 k0Var = new k0();
        k0Var.f57974a = this.f57993a;
        k0Var.f57975b = this.f57994b;
        k0Var.f57976c = this.f57995c;
        return k0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (Objects.equals(this.f57993a, l0Var.f57993a) && Objects.equals(this.f57994b, l0Var.f57994b)) {
            if ((this.f57995c == null) == (l0Var.f57995c == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Uri uri = this.f57993a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f57994b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f57995c != null ? 1 : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        Uri uri = this.f57993a;
        if (uri != null) {
            bundle.putParcelable(f57990e, uri);
        }
        String str = this.f57994b;
        if (str != null) {
            bundle.putString(f57991f, str);
        }
        Bundle bundle2 = this.f57995c;
        if (bundle2 != null) {
            bundle.putBundle(f57992g, bundle2);
        }
        return bundle;
    }
}
