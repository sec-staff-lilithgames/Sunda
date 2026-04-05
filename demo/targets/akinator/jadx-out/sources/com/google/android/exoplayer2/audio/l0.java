package com.google.android.exoplayer2.audio;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27197a;

    /* renamed from: b, reason: collision with root package name */
    public final float f27198b;

    public l0(int i10, float f10) {
        this.f27197a = i10;
        this.f27198b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l0.class == obj.getClass()) {
            l0 l0Var = (l0) obj;
            if (this.f27197a == l0Var.f27197a && Float.compare(l0Var.f27198b, this.f27198b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f27198b) + ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f27197a) * 31);
    }
}
