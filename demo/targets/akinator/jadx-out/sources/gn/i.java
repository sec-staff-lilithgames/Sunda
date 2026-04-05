package gn;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f57936a;

    /* renamed from: b, reason: collision with root package name */
    public final float f57937b;

    public i(int i10, float f10) {
        this.f57936a = i10;
        this.f57937b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f57936a == iVar.f57936a && Float.compare(iVar.f57937b, this.f57937b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f57937b) + ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f57936a) * 31);
    }
}
