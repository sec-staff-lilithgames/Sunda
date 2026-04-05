package io.odeeo.internal.d;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f63404a;

    /* renamed from: b, reason: collision with root package name */
    public final float f63405b;

    public k(int i10, float f10) {
        this.f63404a = i10;
        this.f63405b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f63404a == kVar.f63404a && Float.compare(kVar.f63405b, this.f63405b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f63405b) + ((this.f63404a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }
}
