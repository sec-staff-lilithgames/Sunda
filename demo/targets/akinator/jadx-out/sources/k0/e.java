package k0;

import a2.r3;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import rv.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e implements b, r3 {

    /* renamed from: b, reason: collision with root package name */
    public final float f70008b;

    public e(float f10, u uVar) {
        this.f70008b = f10;
    }

    /* renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ e m5091copy0680j_4$default(e eVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = eVar.f70008b;
        }
        return eVar.m5092copy0680j_4(f10);
    }

    /* renamed from: copy-0680j_4, reason: not valid java name */
    public final e m5092copy0680j_4(float f10) {
        return new e(f10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && s2.i.m6822equalsimpl0(this.f70008b, ((e) obj).f70008b);
    }

    @Override // a2.r3
    public /* bridge */ /* synthetic */ t getInspectableElements() {
        return super.getInspectableElements();
    }

    @Override // a2.r3
    public /* bridge */ /* synthetic */ String getNameFallback() {
        return super.getNameFallback();
    }

    @Override // a2.r3
    public /* bridge */ /* synthetic */ Object getValueOverride() {
        return s2.i.m6815boximpl(m5093getValueOverrideD9Ej5fM());
    }

    /* renamed from: getValueOverride-D9Ej5fM, reason: not valid java name */
    public float m5093getValueOverrideD9Ej5fM() {
        return this.f70008b;
    }

    public int hashCode() {
        return s2.i.m6823hashCodeimpl(this.f70008b);
    }

    @Override // k0.b
    /* renamed from: toPx-TmRCtEA */
    public float mo5089toPxTmRCtEA(long j10, s2.e density) {
        e0.checkNotNullParameter(density, "density");
        return density.mo3425toPx0680j_4(this.f70008b);
    }

    public String toString() {
        return "CornerSize(size = " + this.f70008b + ".dp)";
    }
}
