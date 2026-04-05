package q0;

import b0.e2;
import kotlin.jvm.internal.c1;
import p0.i4;
import p0.v4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f82361a;

    /* renamed from: b, reason: collision with root package name */
    public final int f82362b;

    public /* synthetic */ n0(int i10, int i11, int i12, kotlin.jvm.internal.u uVar) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, null);
    }

    public abstract void a(o0 o0Var, p0.d dVar, v4 v4Var, i4 i4Var, p0 p0Var);

    public p0.b b(o0 o0Var) {
        return null;
    }

    public final void executeWithComposeStackTrace(o0 o0Var, p0.d dVar, v4 v4Var, i4 i4Var, p0 p0Var) throws Throwable {
        p0.b bVarB = b(o0Var);
        try {
            a(o0Var, dVar, v4Var, i4Var, p0Var);
        } catch (Throwable th2) {
            throw r0.access$attachComposeStackTrace(th2, p0Var, v4Var, bVarB);
        }
    }

    public final int getInts() {
        return this.f82361a;
    }

    public final String getName() {
        String simpleName = c1.getOrCreateKotlinClass(getClass()).getSimpleName();
        return simpleName == null ? "" : simpleName;
    }

    public final int getObjects() {
        return this.f82362b;
    }

    public String intParamName(int i10) {
        return e2.h(')', "IntParameter(", i10);
    }

    /* renamed from: objectParamName-31yXWZQ */
    public String mo5902objectParamName31yXWZQ(int i10) {
        return e2.h(')', "ObjectParameter(", i10);
    }

    public String toString() {
        return getName();
    }

    public n0(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this.f82361a = i10;
        this.f82362b = i11;
    }
}
