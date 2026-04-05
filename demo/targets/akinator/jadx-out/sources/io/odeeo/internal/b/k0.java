package io.odeeo.internal.b;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.odeeo.internal.b.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k0 implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final k0 f62782d = new k0(1.0f);

    /* renamed from: e, reason: collision with root package name */
    public static final g.a<k0> f62783e = new hv.t(27);

    /* renamed from: a, reason: collision with root package name */
    public final float f62784a;

    /* renamed from: b, reason: collision with root package name */
    public final float f62785b;

    /* renamed from: c, reason: collision with root package name */
    public final int f62786c;

    public k0(float f10) {
        this(f10, 1.0f);
    }

    public static /* synthetic */ k0 a(Bundle bundle) {
        return new k0(bundle.getFloat(a(0), 1.0f), bundle.getFloat(a(1), 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            if (this.f62784a == k0Var.f62784a && this.f62785b == k0Var.f62785b) {
                return true;
            }
        }
        return false;
    }

    public long getMediaTimeUsForPlayoutTimeMs(long j10) {
        return j10 * this.f62786c;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.f62785b) + ((Float.floatToRawIntBits(this.f62784a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(a(0), this.f62784a);
        bundle.putFloat(a(1), this.f62785b);
        return bundle;
    }

    public String toString() {
        return io.odeeo.internal.q0.g0.formatInvariant("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f62784a), Float.valueOf(this.f62785b));
    }

    public k0 withSpeed(float f10) {
        return new k0(f10, this.f62785b);
    }

    public k0(float f10, float f11) {
        io.odeeo.internal.q0.a.checkArgument(f10 > 0.0f);
        io.odeeo.internal.q0.a.checkArgument(f11 > 0.0f);
        this.f62784a = f10;
        this.f62785b = f11;
        this.f62786c = Math.round(f10 * 1000.0f);
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
