package com.fyber.inneractive.sdk.player.exoplayer2;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final s f25723d = new s(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f25724a;

    /* renamed from: b, reason: collision with root package name */
    public final float f25725b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25726c;

    public s(float f10, float f11) {
        this.f25724a = f10;
        this.f25725b = f11;
        this.f25726c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f25724a == sVar.f25724a && this.f25725b == sVar.f25725b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f25725b) + ((Float.floatToRawIntBits(this.f25724a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }
}
