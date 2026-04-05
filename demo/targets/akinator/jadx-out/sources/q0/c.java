package q0;

import kotlin.jvm.internal.h1;
import p0.i4;
import p0.v4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends u0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f82337a = new s0();

    /* renamed from: b, reason: collision with root package name */
    public final s0 f82338b = new s0();

    public final void clear() {
        this.f82338b.clear();
        this.f82337a.clear();
    }

    public final void createAndInsertNode(kv.a aVar, int i10, p0.b bVar) {
        r rVar = r.f82368c;
        s0 s0Var = this.f82337a;
        s0Var.pushOp(rVar);
        s0 s0VarM5937constructorimpl = t0.m5937constructorimpl(s0Var);
        t0.m5945setObjectDKhxnng(s0VarM5937constructorimpl, w.m5952constructorimpl(0), aVar);
        s0VarM5937constructorimpl.f82372c[s0VarM5937constructorimpl.f82373d - s0VarM5937constructorimpl.f82370a[s0VarM5937constructorimpl.f82371b - 1].getInts()] = i10;
        t0.m5945setObjectDKhxnng(s0VarM5937constructorimpl, w.m5952constructorimpl(1), bVar);
        s0Var.ensureAllArgumentsPushedFor(rVar);
        x xVar = x.f82387c;
        s0 s0Var2 = this.f82338b;
        s0Var2.pushOp(xVar);
        s0 s0VarM5937constructorimpl2 = t0.m5937constructorimpl(s0Var2);
        s0VarM5937constructorimpl2.f82372c[s0VarM5937constructorimpl2.f82373d - s0VarM5937constructorimpl2.f82370a[s0VarM5937constructorimpl2.f82371b - 1].getInts()] = i10;
        t0.m5945setObjectDKhxnng(s0VarM5937constructorimpl2, w.m5952constructorimpl(0), bVar);
        s0Var2.ensureAllArgumentsPushedFor(xVar);
    }

    public final void endNodeInsert() {
        s0 s0Var = this.f82338b;
        if (!s0Var.isNotEmpty()) {
            p0.d0.composeImmediateRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        s0Var.popInto(this.f82337a);
    }

    public final void executeAndFlushAllPendingFixups(p0.d dVar, v4 v4Var, i4 i4Var, p0 p0Var) {
        if (!this.f82338b.isEmpty()) {
            p0.d0.composeImmediateRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.f82337a.executeAndFlushAllPendingOperations(dVar, v4Var, i4Var, p0Var);
    }

    public final int getSize() {
        return this.f82337a.getSize();
    }

    public final boolean isEmpty() {
        return this.f82337a.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.f82337a.isNotEmpty();
    }

    @Override // q0.u0
    public String toDebugString(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FixupList instance containing " + getSize() + " operations");
        if (sb2.length() > 0) {
            sb2.append(":\n" + this.f82337a.toDebugString(str));
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final <V, T> void updateNode(V v10, kv.p pVar) {
        k0 k0Var = k0.f82355c;
        s0 s0Var = this.f82337a;
        s0Var.pushOp(k0Var);
        s0 s0VarM5937constructorimpl = t0.m5937constructorimpl(s0Var);
        t0.m5945setObjectDKhxnng(s0VarM5937constructorimpl, w.m5952constructorimpl(0), v10);
        int iM5952constructorimpl = w.m5952constructorimpl(1);
        kotlin.jvm.internal.e0.checkNotNull(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        t0.m5945setObjectDKhxnng(s0VarM5937constructorimpl, iM5952constructorimpl, (kv.p) h1.beforeCheckcastToFunctionOfArity(pVar, 2));
        s0Var.ensureAllArgumentsPushedFor(k0Var);
    }
}
