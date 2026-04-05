package x1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e0 {
    public static final i1.j boundsInParent(d0 d0Var) {
        i1.j jVarLocalBoundingBoxOf$default;
        kotlin.jvm.internal.e0.checkNotNullParameter(d0Var, "<this>");
        d0 parentLayoutCoordinates = d0Var.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (jVarLocalBoundingBoxOf$default = d0.localBoundingBoxOf$default(parentLayoutCoordinates, d0Var, false, 2, null)) == null) ? new i1.j(0.0f, 0.0f, s2.v.m6972getWidthimpl(d0Var.mo7827getSizeYbymL2g()), s2.v.m6971getHeightimpl(d0Var.mo7827getSizeYbymL2g())) : jVarLocalBoundingBoxOf$default;
    }

    public static final i1.j boundsInRoot(d0 d0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(d0Var, "<this>");
        return d0.localBoundingBoxOf$default(findRoot(d0Var), d0Var, false, 2, null);
    }

    public static final i1.j boundsInWindow(d0 d0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(d0Var, "<this>");
        d0 d0VarFindRoot = findRoot(d0Var);
        i1.j jVarBoundsInRoot = boundsInRoot(d0Var);
        long jMo7830localToWindowMKHz9U = d0VarFindRoot.mo7830localToWindowMKHz9U(i1.i.Offset(jVarBoundsInRoot.getLeft(), jVarBoundsInRoot.getTop()));
        long jMo7830localToWindowMKHz9U2 = d0VarFindRoot.mo7830localToWindowMKHz9U(i1.i.Offset(jVarBoundsInRoot.getRight(), jVarBoundsInRoot.getTop()));
        long jMo7830localToWindowMKHz9U3 = d0VarFindRoot.mo7830localToWindowMKHz9U(i1.i.Offset(jVarBoundsInRoot.getRight(), jVarBoundsInRoot.getBottom()));
        long jMo7830localToWindowMKHz9U4 = d0VarFindRoot.mo7830localToWindowMKHz9U(i1.i.Offset(jVarBoundsInRoot.getLeft(), jVarBoundsInRoot.getBottom()));
        return new i1.j(xu.e.minOf(i1.h.m4185getXimpl(jMo7830localToWindowMKHz9U), i1.h.m4185getXimpl(jMo7830localToWindowMKHz9U2), i1.h.m4185getXimpl(jMo7830localToWindowMKHz9U4), i1.h.m4185getXimpl(jMo7830localToWindowMKHz9U3)), xu.e.minOf(i1.h.m4186getYimpl(jMo7830localToWindowMKHz9U), i1.h.m4186getYimpl(jMo7830localToWindowMKHz9U2), i1.h.m4186getYimpl(jMo7830localToWindowMKHz9U4), i1.h.m4186getYimpl(jMo7830localToWindowMKHz9U3)), xu.e.maxOf(i1.h.m4185getXimpl(jMo7830localToWindowMKHz9U), i1.h.m4185getXimpl(jMo7830localToWindowMKHz9U2), i1.h.m4185getXimpl(jMo7830localToWindowMKHz9U4), i1.h.m4185getXimpl(jMo7830localToWindowMKHz9U3)), xu.e.maxOf(i1.h.m4186getYimpl(jMo7830localToWindowMKHz9U), i1.h.m4186getYimpl(jMo7830localToWindowMKHz9U2), i1.h.m4186getYimpl(jMo7830localToWindowMKHz9U4), i1.h.m4186getYimpl(jMo7830localToWindowMKHz9U3)));
    }

    public static final d0 findRoot(d0 d0Var) {
        d0 d0Var2;
        kotlin.jvm.internal.e0.checkNotNullParameter(d0Var, "<this>");
        d0 parentLayoutCoordinates = d0Var.getParentLayoutCoordinates();
        while (true) {
            d0 d0Var3 = parentLayoutCoordinates;
            d0Var2 = d0Var;
            d0Var = d0Var3;
            if (d0Var == null) {
                break;
            }
            parentLayoutCoordinates = d0Var.getParentLayoutCoordinates();
        }
        z1.u0 u0Var = d0Var2 instanceof z1.u0 ? (z1.u0) d0Var2 : null;
        if (u0Var == null) {
            return d0Var2;
        }
        z1.u0 wrappedBy$ui_release = u0Var.getWrappedBy$ui_release();
        while (true) {
            z1.u0 u0Var2 = wrappedBy$ui_release;
            z1.u0 u0Var3 = u0Var;
            u0Var = u0Var2;
            if (u0Var == null) {
                return u0Var3;
            }
            wrappedBy$ui_release = u0Var.getWrappedBy$ui_release();
        }
    }

    public static final long positionInParent(d0 d0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(d0Var, "<this>");
        d0 parentLayoutCoordinates = d0Var.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo7828localPositionOfR5De75A(d0Var, i1.h.f59344b.m4173getZeroF1C5BW0()) : i1.h.f59344b.m4173getZeroF1C5BW0();
    }

    public static final long positionInRoot(d0 d0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(d0Var, "<this>");
        return d0Var.mo7829localToRootMKHz9U(i1.h.f59344b.m4173getZeroF1C5BW0());
    }

    public static final long positionInWindow(d0 d0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(d0Var, "<this>");
        return d0Var.mo7830localToWindowMKHz9U(i1.h.f59344b.m4173getZeroF1C5BW0());
    }
}
