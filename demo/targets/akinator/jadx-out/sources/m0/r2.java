package m0;

import d0.k3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class r2 {
    public static final boolean isShiftPressed(u1.m mVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mVar, "<this>");
        return false;
    }

    public static final e1.v textFieldMagnifier(e1.v vVar, h2 manager) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(manager, "manager");
        return !k3.f51464g.getTextDefault().isSupported() ? vVar : e1.o.composed$default(vVar, null, new q2(manager), 1, null);
    }
}
