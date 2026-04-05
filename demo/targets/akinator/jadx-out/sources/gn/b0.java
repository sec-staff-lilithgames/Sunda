package gn;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final String f57806c = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: a, reason: collision with root package name */
    public final Uri f57807a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f57808b;

    public b0(a0 a0Var) {
        this.f57807a = a0Var.f57728a;
        this.f57808b = a0Var.f57729b;
    }

    public static b0 fromBundle(Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable(f57806c);
        io.bidmachine.media3.common.util.a.checkNotNull(uri);
        return new a0(uri).build();
    }

    public a0 buildUpon() {
        return new a0(this.f57807a).setAdsId(this.f57808b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f57807a.equals(b0Var.f57807a) && Objects.equals(this.f57808b, b0Var.f57808b);
    }

    public int hashCode() {
        int iHashCode = this.f57807a.hashCode() * 31;
        Object obj = this.f57808b;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f57806c, this.f57807a);
        return bundle;
    }
}
