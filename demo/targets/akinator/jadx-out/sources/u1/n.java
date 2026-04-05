package u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n {
    public static final long a(c0 c0Var, boolean z10) {
        return (z10 || !c0Var.isConsumed()) ? i1.h.m4189minusMKHz9U(c0Var.m7295getPositionF1C5BW0(), c0Var.m7296getPreviousPositionF1C5BW0()) : i1.h.f59344b.m4173getZeroF1C5BW0();
    }

    @tu.f
    public static final boolean anyChangeConsumed(c0 c0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<this>");
        return c0Var.isConsumed();
    }

    public static final boolean changedToDown(c0 c0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<this>");
        return (c0Var.isConsumed() || c0Var.getPreviousPressed() || !c0Var.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(c0 c0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<this>");
        return !c0Var.getPreviousPressed() && c0Var.getPressed();
    }

    public static final boolean changedToUp(c0 c0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<this>");
        return (c0Var.isConsumed() || !c0Var.getPreviousPressed() || c0Var.getPressed()) ? false : true;
    }

    public static final boolean changedToUpIgnoreConsumed(c0 c0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<this>");
        return c0Var.getPreviousPressed() && !c0Var.getPressed();
    }

    @tu.f
    public static final void consumeAllChanges(c0 c0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<this>");
        c0Var.consume();
    }

    @tu.f
    public static final void consumeDownChange(c0 c0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<this>");
        if (c0Var.getPressed() != c0Var.getPreviousPressed()) {
            c0Var.consume();
        }
    }

    @tu.f
    public static final void consumePositionChange(c0 c0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<this>");
        if (i1.h.m4182equalsimpl0(positionChange(c0Var), i1.h.f59344b.m4173getZeroF1C5BW0())) {
            return;
        }
        c0Var.consume();
    }

    @tu.f
    /* renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m7347isOutOfBoundsO0kMr_c(c0 isOutOfBounds, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(isOutOfBounds, "$this$isOutOfBounds");
        long jM7295getPositionF1C5BW0 = isOutOfBounds.m7295getPositionF1C5BW0();
        float fM4185getXimpl = i1.h.m4185getXimpl(jM7295getPositionF1C5BW0);
        float fM4186getYimpl = i1.h.m4186getYimpl(jM7295getPositionF1C5BW0);
        return fM4185getXimpl < 0.0f || fM4185getXimpl > ((float) s2.v.m6972getWidthimpl(j10)) || fM4186getYimpl < 0.0f || fM4186getYimpl > ((float) s2.v.m6971getHeightimpl(j10));
    }

    /* renamed from: isOutOfBounds-jwHxaWs, reason: not valid java name */
    public static final boolean m7348isOutOfBoundsjwHxaWs(c0 isOutOfBounds, long j10, long j11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(isOutOfBounds, "$this$isOutOfBounds");
        if (!z0.m7397equalsimpl0(isOutOfBounds.m7298getTypeT8wyACA(), z0.f87698b.m7393getTouchT8wyACA())) {
            return m7347isOutOfBoundsO0kMr_c(isOutOfBounds, j10);
        }
        long jM7295getPositionF1C5BW0 = isOutOfBounds.m7295getPositionF1C5BW0();
        float fM4185getXimpl = i1.h.m4185getXimpl(jM7295getPositionF1C5BW0);
        float fM4186getYimpl = i1.h.m4186getYimpl(jM7295getPositionF1C5BW0);
        return fM4185getXimpl < (-i1.o.m4252getWidthimpl(j11)) || fM4185getXimpl > i1.o.m4252getWidthimpl(j11) + ((float) s2.v.m6972getWidthimpl(j10)) || fM4186getYimpl < (-i1.o.m4249getHeightimpl(j11)) || fM4186getYimpl > i1.o.m4249getHeightimpl(j11) + ((float) s2.v.m6971getHeightimpl(j10));
    }

    public static final long positionChange(c0 c0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<this>");
        return a(c0Var, false);
    }

    @tu.f
    public static final boolean positionChangeConsumed(c0 c0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<this>");
        return c0Var.isConsumed();
    }

    public static final long positionChangeIgnoreConsumed(c0 c0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<this>");
        return a(c0Var, true);
    }

    public static final boolean positionChanged(c0 c0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<this>");
        return !i1.h.m4182equalsimpl0(a(c0Var, false), i1.h.f59344b.m4173getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(c0 c0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<this>");
        return !i1.h.m4182equalsimpl0(a(c0Var, true), i1.h.f59344b.m4173getZeroF1C5BW0());
    }
}
