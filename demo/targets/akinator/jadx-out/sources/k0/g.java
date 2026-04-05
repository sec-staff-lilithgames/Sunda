package k0;

import a2.r3;
import kotlin.jvm.internal.e0;
import rv.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g implements b, r3 {

    /* renamed from: b, reason: collision with root package name */
    public final float f70010b;

    public g(float f10) {
        this.f70010b = f10;
    }

    public static /* synthetic */ g copy$default(g gVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = gVar.f70010b;
        }
        return gVar.copy(f10);
    }

    public final g copy(float f10) {
        return new g(f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && e0.areEqual((Object) Float.valueOf(this.f70010b), (Object) Float.valueOf(((g) obj).f70010b));
    }

    @Override // a2.r3
    public /* bridge */ /* synthetic */ t getInspectableElements() {
        return super.getInspectableElements();
    }

    @Override // a2.r3
    public /* bridge */ /* synthetic */ String getNameFallback() {
        return super.getNameFallback();
    }

    public int hashCode() {
        return Float.hashCode(this.f70010b);
    }

    @Override // k0.b
    /* renamed from: toPx-TmRCtEA */
    public float mo5089toPxTmRCtEA(long j10, s2.e density) {
        e0.checkNotNullParameter(density, "density");
        return this.f70010b;
    }

    public String toString() {
        return "CornerSize(size = " + this.f70010b + ".px)";
    }

    @Override // a2.r3
    public String getValueOverride() {
        return this.f70010b + "px";
    }
}
