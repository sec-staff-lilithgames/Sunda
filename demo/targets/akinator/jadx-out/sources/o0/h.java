package o0;

import d0.s2;
import d0.t2;
import j1.m0;
import p0.k1;
import p0.v5;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h implements s2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f77334a;

    /* renamed from: b, reason: collision with root package name */
    public final float f77335b;

    /* renamed from: c, reason: collision with root package name */
    public final v5 f77336c;

    public h(boolean z10, float f10, v5 v5Var, kotlin.jvm.internal.u uVar) {
        this.f77334a = z10;
        this.f77335b = f10;
        this.f77336c = v5Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f77334a == hVar.f77334a && s2.i.m6822equalsimpl0(this.f77335b, hVar.f77335b) && kotlin.jvm.internal.e0.areEqual(this.f77336c, hVar.f77336c);
    }

    public int hashCode() {
        return this.f77336c.hashCode() + ((s2.i.m6823hashCodeimpl(this.f77335b) + (Boolean.hashCode(this.f77334a) * 31)) * 31);
    }

    @Override // d0.s2
    public final t2 rememberUpdatedInstance(f0.o interactionSource, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(interactionSource, "interactionSource");
        wVar.startReplaceableGroup(988743187);
        y yVar = (y) wVar.consume(a0.getLocalRippleTheme());
        wVar.startReplaceableGroup(-1524341038);
        v5 v5Var = this.f77336c;
        long jM4868unboximpl = ((m0) v5Var.getValue()).m4868unboximpl() != m0.f68918b.m4835getUnspecified0d7_KjU() ? ((m0) v5Var.getValue()).m4868unboximpl() : yVar.mo5657defaultColorWaAFU9c(wVar, 0);
        wVar.endReplaceableGroup();
        v vVarMo5755rememberUpdatedRippleInstance942rkJo = mo5755rememberUpdatedRippleInstance942rkJo(interactionSource, this.f77334a, this.f77335b, z4.rememberUpdatedState(m0.m4848boximpl(jM4868unboximpl), wVar, 0), z4.rememberUpdatedState(yVar.rippleAlpha(wVar, 0), wVar, 0), wVar, (i10 & 14) | ((i10 << 12) & 458752));
        k1.LaunchedEffect(vVarMo5755rememberUpdatedRippleInstance942rkJo, interactionSource, new g(interactionSource, vVarMo5755rememberUpdatedRippleInstance942rkJo, null), wVar, ((i10 << 3) & 112) | 8);
        wVar.endReplaceableGroup();
        return vVarMo5755rememberUpdatedRippleInstance942rkJo;
    }

    /* renamed from: rememberUpdatedRippleInstance-942rkJo */
    public abstract v mo5755rememberUpdatedRippleInstance942rkJo(f0.o oVar, boolean z10, float f10, v5 v5Var, v5 v5Var2, p0.w wVar, int i10);
}
