package gn;

import android.os.Bundle;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k2 {

    /* renamed from: d, reason: collision with root package name */
    public static final k2 f57977d = new k2(0, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final String f57978e = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: f, reason: collision with root package name */
    public static final String f57979f = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: g, reason: collision with root package name */
    public static final String f57980g = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f57981a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57982b;

    /* renamed from: c, reason: collision with root package name */
    public final float f57983c;

    public k2(int i10, int i11) {
        this(i10, i11, 1.0f);
    }

    public static k2 fromBundle(Bundle bundle) {
        return new k2(bundle.getInt(f57978e, 0), bundle.getInt(f57979f, 0), bundle.getFloat(f57980g, 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k2) {
            k2 k2Var = (k2) obj;
            if (this.f57981a == k2Var.f57981a && this.f57982b == k2Var.f57982b && this.f57983c == k2Var.f57983c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.f57983c) + ((((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.f57981a) * 31) + this.f57982b) * 31);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i10 = this.f57981a;
        if (i10 != 0) {
            bundle.putInt(f57978e, i10);
        }
        int i11 = this.f57982b;
        if (i11 != 0) {
            bundle.putInt(f57979f, i11);
        }
        float f10 = this.f57983c;
        if (f10 != 1.0f) {
            bundle.putFloat(f57980g, f10);
        }
        return bundle;
    }

    public k2(int i10, int i11, float f10) {
        this.f57981a = i10;
        this.f57982b = i11;
        this.f57983c = f10;
    }

    @Deprecated
    public k2(int i10, int i11, int i12, float f10) {
        this(i10, i11, f10);
    }
}
