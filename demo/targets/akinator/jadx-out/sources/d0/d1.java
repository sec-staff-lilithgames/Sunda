package d0;

import j1.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d1 implements j1.f2 {
    @Override // j1.f2
    /* renamed from: createOutline-Pq9zytI, reason: not valid java name */
    public j1.g1 mo3688createOutlinePq9zytI(long j10, s2.x layoutDirection, s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        float fMo3419roundToPx0680j_4 = density.mo3419roundToPx0680j_4(f1.getMaxSupportedElevation());
        return new g1.b(new i1.j(0.0f, -fMo3419roundToPx0680j_4, i1.o.m4252getWidthimpl(j10), i1.o.m4249getHeightimpl(j10) + fMo3419roundToPx0680j_4));
    }
}
