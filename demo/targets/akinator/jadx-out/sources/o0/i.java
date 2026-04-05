package o0;

import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final float f77337a;

    /* renamed from: b, reason: collision with root package name */
    public final float f77338b;

    /* renamed from: c, reason: collision with root package name */
    public final float f77339c;

    /* renamed from: d, reason: collision with root package name */
    public final float f77340d;

    public i(float f10, float f11, float f12, float f13) {
        this.f77337a = f10;
        this.f77338b = f11;
        this.f77339c = f12;
        this.f77340d = f13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f77337a == iVar.f77337a && this.f77338b == iVar.f77338b && this.f77339c == iVar.f77339c && this.f77340d == iVar.f77340d;
    }

    public final float getDraggedAlpha() {
        return this.f77337a;
    }

    public final float getFocusedAlpha() {
        return this.f77338b;
    }

    public final float getHoveredAlpha() {
        return this.f77339c;
    }

    public final float getPressedAlpha() {
        return this.f77340d;
    }

    public int hashCode() {
        return Float.hashCode(this.f77340d) + e2.b(this.f77339c, e2.b(this.f77338b, Float.hashCode(this.f77337a) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb2.append(this.f77337a);
        sb2.append(", focusedAlpha=");
        sb2.append(this.f77338b);
        sb2.append(", hoveredAlpha=");
        sb2.append(this.f77339c);
        sb2.append(", pressedAlpha=");
        return a.b.n(sb2, this.f77340d, ')');
    }
}
