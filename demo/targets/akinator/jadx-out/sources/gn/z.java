package gn;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class z {

    /* renamed from: c, reason: collision with root package name */
    public static final String f58261c = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: d, reason: collision with root package name */
    public static final String f58262d = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f58263a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58264b;

    public z(String str, String str2) {
        this.f58263a = io.bidmachine.media3.common.util.a1.normalizeLanguageCode(str);
        this.f58264b = str2;
    }

    public static z fromBundle(Bundle bundle) {
        return new z(bundle.getString(f58261c), (String) io.bidmachine.media3.common.util.a.checkNotNull(bundle.getString(f58262d)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            z zVar = (z) obj;
            if (Objects.equals(this.f58263a, zVar.f58263a) && Objects.equals(this.f58264b, zVar.f58264b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f58264b.hashCode() * 31;
        String str = this.f58263a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        String str = this.f58263a;
        if (str != null) {
            bundle.putString(f58261c, str);
        }
        bundle.putString(f58262d, this.f58264b);
        return bundle;
    }
}
