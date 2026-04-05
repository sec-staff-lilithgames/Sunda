package ub;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j0 implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static j0 f88248c = new j0(1000);

    /* renamed from: b, reason: collision with root package name */
    public final int f88249b;

    public j0(int i10) {
        this.f88249b = i10;
    }

    public static i0 builder() {
        i0 i0Var = new i0();
        i0Var.f88241a = 1000;
        return i0Var;
    }

    public static j0 defaults() {
        return f88248c;
    }

    public static void overrideDefaultStreamWriteConstraints(j0 j0Var) {
        if (j0Var == null) {
            f88248c = new j0(1000);
        } else {
            f88248c = j0Var;
        }
    }

    public int getMaxNestingDepth() {
        return this.f88249b;
    }

    public i0 rebuild() {
        i0 i0Var = new i0();
        i0Var.f88241a = this.f88249b;
        return i0Var;
    }

    public void validateNestingDepth(int i10) throws xb.b {
        int i11 = this.f88249b;
        if (i10 > i11) {
            throw new xb.b(String.format("Document nesting depth (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i10), Integer.valueOf(i11), "`StreamWriteConstraints.getMaxNestingDepth()`"));
        }
    }
}
