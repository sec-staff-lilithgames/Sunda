package gn;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x extends m1 {

    /* renamed from: d, reason: collision with root package name */
    public static final String f58242d = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: e, reason: collision with root package name */
    public static final String f58243e = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58244b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f58245c;

    public x() {
        this.f58244b = false;
        this.f58245c = false;
    }

    public static x fromBundle(Bundle bundle) {
        io.bidmachine.media3.common.util.a.checkArgument(bundle.getInt(m1.f58005a, -1) == 0);
        return bundle.getBoolean(f58242d, false) ? new x(bundle.getBoolean(f58243e, false)) : new x();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f58245c == xVar.f58245c && this.f58244b == xVar.f58244b;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f58244b), Boolean.valueOf(this.f58245c));
    }

    public boolean isHeart() {
        return this.f58245c;
    }

    @Override // gn.m1
    public boolean isRated() {
        return this.f58244b;
    }

    @Override // gn.m1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(m1.f58005a, 0);
        bundle.putBoolean(f58242d, this.f58244b);
        bundle.putBoolean(f58243e, this.f58245c);
        return bundle;
    }

    public x(boolean z10) {
        this.f58244b = true;
        this.f58245c = z10;
    }
}
