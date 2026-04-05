package gn;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p1 extends m1 {

    /* renamed from: d, reason: collision with root package name */
    public static final String f58058d = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: e, reason: collision with root package name */
    public static final String f58059e = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58060b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f58061c;

    public p1() {
        this.f58060b = false;
        this.f58061c = false;
    }

    public static p1 fromBundle(Bundle bundle) {
        io.bidmachine.media3.common.util.a.checkArgument(bundle.getInt(m1.f58005a, -1) == 3);
        return bundle.getBoolean(f58058d, false) ? new p1(bundle.getBoolean(f58059e, false)) : new p1();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.f58061c == p1Var.f58061c && this.f58060b == p1Var.f58060b;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f58060b), Boolean.valueOf(this.f58061c));
    }

    @Override // gn.m1
    public boolean isRated() {
        return this.f58060b;
    }

    public boolean isThumbsUp() {
        return this.f58061c;
    }

    @Override // gn.m1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(m1.f58005a, 3);
        bundle.putBoolean(f58058d, this.f58060b);
        bundle.putBoolean(f58059e, this.f58061c);
        return bundle;
    }

    public p1(boolean z10) {
        this.f58060b = true;
        this.f58061c = z10;
    }
}
