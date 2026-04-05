package androidx.lifecycle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 {
    public g0(kotlin.jvm.internal.u uVar) {
    }

    public final i0 downFrom(j0 state) {
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        int i10 = f0.$EnumSwitchMapping$0[state.ordinal()];
        if (i10 == 1) {
            return i0.ON_DESTROY;
        }
        if (i10 == 2) {
            return i0.ON_STOP;
        }
        if (i10 != 3) {
            return null;
        }
        return i0.ON_PAUSE;
    }

    public final i0 downTo(j0 state) {
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        int i10 = f0.$EnumSwitchMapping$0[state.ordinal()];
        if (i10 == 1) {
            return i0.ON_STOP;
        }
        if (i10 == 2) {
            return i0.ON_PAUSE;
        }
        if (i10 != 4) {
            return null;
        }
        return i0.ON_DESTROY;
    }

    public final i0 upFrom(j0 state) {
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        int i10 = f0.$EnumSwitchMapping$0[state.ordinal()];
        if (i10 == 1) {
            return i0.ON_START;
        }
        if (i10 == 2) {
            return i0.ON_RESUME;
        }
        if (i10 != 5) {
            return null;
        }
        return i0.ON_CREATE;
    }

    public final i0 upTo(j0 state) {
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        int i10 = f0.$EnumSwitchMapping$0[state.ordinal()];
        if (i10 == 1) {
            return i0.ON_CREATE;
        }
        if (i10 == 2) {
            return i0.ON_START;
        }
        if (i10 != 3) {
            return null;
        }
        return i0.ON_RESUME;
    }
}
