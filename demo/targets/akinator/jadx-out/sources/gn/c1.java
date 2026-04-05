package gn;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c1 {

    /* renamed from: d, reason: collision with root package name */
    public static final c1 f57844d = new c1(1.0f);

    /* renamed from: e, reason: collision with root package name */
    public static final String f57845e = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: f, reason: collision with root package name */
    public static final String f57846f = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: a, reason: collision with root package name */
    public final float f57847a;

    /* renamed from: b, reason: collision with root package name */
    public final float f57848b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57849c;

    public c1(float f10) {
        this(f10, 1.0f);
    }

    public static c1 fromBundle(Bundle bundle) {
        return new c1(bundle.getFloat(f57845e, 1.0f), bundle.getFloat(f57846f, 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (this.f57847a == c1Var.f57847a && this.f57848b == c1Var.f57848b) {
                return true;
            }
        }
        return false;
    }

    public long getMediaTimeUsForPlayoutTimeMs(long j10) {
        return j10 * this.f57849c;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.f57848b) + ((Float.floatToRawIntBits(this.f57847a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f57845e, this.f57847a);
        bundle.putFloat(f57846f, this.f57848b);
        return bundle;
    }

    public String toString() {
        return io.bidmachine.media3.common.util.a1.formatInvariant("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f57847a), Float.valueOf(this.f57848b));
    }

    public c1 withPitch(float f10) {
        return new c1(this.f57847a, f10);
    }

    public c1 withSpeed(float f10) {
        return new c1(f10, this.f57848b);
    }

    public c1(float f10, float f11) {
        io.bidmachine.media3.common.util.a.checkArgument(f10 > 0.0f);
        io.bidmachine.media3.common.util.a.checkArgument(f11 > 0.0f);
        this.f57847a = f10;
        this.f57848b = f11;
        this.f57849c = Math.round(f10 * 1000.0f);
    }
}
