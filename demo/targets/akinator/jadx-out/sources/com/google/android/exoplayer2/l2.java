package com.google.android.exoplayer2;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l2 implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final l2 f27634f = new l2(1.0f);

    /* renamed from: g, reason: collision with root package name */
    public static final String f27635g = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);

    /* renamed from: h, reason: collision with root package name */
    public static final String f27636h = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);

    /* renamed from: b, reason: collision with root package name */
    public final float f27637b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27638c;

    /* renamed from: e, reason: collision with root package name */
    public final int f27639e;

    public l2(float f10) {
        this(f10, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l2.class == obj.getClass()) {
            l2 l2Var = (l2) obj;
            if (this.f27637b == l2Var.f27637b && this.f27638c == l2Var.f27638c) {
                return true;
            }
        }
        return false;
    }

    public long getMediaTimeUsForPlayoutTimeMs(long j10) {
        return j10 * this.f27639e;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.f27638c) + ((Float.floatToRawIntBits(this.f27637b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f27635g, this.f27637b);
        bundle.putFloat(f27636h, this.f27638c);
        return bundle;
    }

    public String toString() {
        return com.google.android.exoplayer2.util.n1.formatInvariant("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f27637b), Float.valueOf(this.f27638c));
    }

    public l2 withSpeed(float f10) {
        return new l2(f10, this.f27638c);
    }

    public l2(float f10, float f11) {
        com.google.android.exoplayer2.util.a.checkArgument(f10 > 0.0f);
        com.google.android.exoplayer2.util.a.checkArgument(f11 > 0.0f);
        this.f27637b = f10;
        this.f27638c = f11;
        this.f27639e = Math.round(f10 * 1000.0f);
    }
}
