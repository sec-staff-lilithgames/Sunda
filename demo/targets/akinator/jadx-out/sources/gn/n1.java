package gn;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n1 extends m1 {

    /* renamed from: d, reason: collision with root package name */
    public static final String f58027d = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: e, reason: collision with root package name */
    public static final String f58028e = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);

    /* renamed from: b, reason: collision with root package name */
    public final int f58029b;

    /* renamed from: c, reason: collision with root package name */
    public final float f58030c;

    public n1(int i10) {
        io.bidmachine.media3.common.util.a.checkArgument(i10 > 0, "maxStars must be a positive integer");
        this.f58029b = i10;
        this.f58030c = -1.0f;
    }

    public static n1 fromBundle(Bundle bundle) {
        io.bidmachine.media3.common.util.a.checkArgument(bundle.getInt(m1.f58005a, -1) == 2);
        int i10 = bundle.getInt(f58027d, 5);
        float f10 = bundle.getFloat(f58028e, -1.0f);
        return f10 == -1.0f ? new n1(i10) : new n1(i10, f10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.f58029b == n1Var.f58029b && this.f58030c == n1Var.f58030c;
    }

    public int getMaxStars() {
        return this.f58029b;
    }

    public float getStarRating() {
        return this.f58030c;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f58029b), Float.valueOf(this.f58030c));
    }

    @Override // gn.m1
    public boolean isRated() {
        return this.f58030c != -1.0f;
    }

    @Override // gn.m1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(m1.f58005a, 2);
        bundle.putInt(f58027d, this.f58029b);
        bundle.putFloat(f58028e, this.f58030c);
        return bundle;
    }

    public n1(int i10, float f10) {
        boolean z10 = false;
        io.bidmachine.media3.common.util.a.checkArgument(i10 > 0, "maxStars must be a positive integer");
        if (f10 >= 0.0f && f10 <= i10) {
            z10 = true;
        }
        io.bidmachine.media3.common.util.a.checkArgument(z10, "starRating is out of range [0, maxStars]");
        this.f58029b = i10;
        this.f58030c = f10;
    }
}
