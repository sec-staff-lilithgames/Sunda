package gn;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a1 extends m1 {

    /* renamed from: c, reason: collision with root package name */
    public static final String f57730c = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: b, reason: collision with root package name */
    public final float f57731b;

    public a1() {
        this.f57731b = -1.0f;
    }

    public static a1 fromBundle(Bundle bundle) {
        io.bidmachine.media3.common.util.a.checkArgument(bundle.getInt(m1.f58005a, -1) == 1);
        float f10 = bundle.getFloat(f57730c, -1.0f);
        return f10 == -1.0f ? new a1() : new a1(f10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a1) {
            return this.f57731b == ((a1) obj).f57731b;
        }
        return false;
    }

    public float getPercent() {
        return this.f57731b;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.f57731b));
    }

    @Override // gn.m1
    public boolean isRated() {
        return this.f57731b != -1.0f;
    }

    @Override // gn.m1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(m1.f58005a, 1);
        bundle.putFloat(f57730c, this.f57731b);
        return bundle;
    }

    public a1(float f10) {
        io.bidmachine.media3.common.util.a.checkArgument(f10 >= 0.0f && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f57731b = f10;
    }
}
