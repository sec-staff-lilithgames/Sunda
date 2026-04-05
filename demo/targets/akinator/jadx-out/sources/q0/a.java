package q0;

import java.util.List;
import kotlin.jvm.internal.h1;
import p0.h2;
import p0.i2;
import p0.i4;
import p0.k3;
import p0.k4;
import p0.o2;
import p0.s4;
import p0.v4;
import p0.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends u0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f82322a = new s0();

    public static /* synthetic */ void pushExecuteOperationsIn$default(a aVar, a aVar2, z0.w wVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            wVar = null;
        }
        aVar.pushExecuteOperationsIn(aVar2, wVar);
    }

    public final void clear() {
        this.f82322a.clear();
    }

    public final void executeAndFlushAllPendingChanges(p0.d dVar, v4 v4Var, i4 i4Var, p0 p0Var) {
        this.f82322a.executeAndFlushAllPendingOperations(dVar, v4Var, i4Var, p0Var);
    }

    public final int getSize() {
        return this.f82322a.getSize();
    }

    public final boolean isEmpty() {
        return this.f82322a.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.f82322a.isNotEmpty();
    }

    public final void pushAdvanceSlotsBy(int i10) {
        d dVar = d.f82340c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(dVar);
        s0 s0VarM5937constructorimpl = t0.m5937constructorimpl(s0Var);
        s0VarM5937constructorimpl.f82372c[s0VarM5937constructorimpl.f82373d - s0VarM5937constructorimpl.f82370a[s0VarM5937constructorimpl.f82371b - 1].getInts()] = i10;
        s0Var.ensureAllArgumentsPushedFor(dVar);
    }

    public final void pushAppendValue(p0.b bVar, Object obj) {
        e eVar = e.f82342c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(eVar);
        t0.m5946setObjects4uCC6AY(t0.m5937constructorimpl(s0Var), w.m5952constructorimpl(0), bVar, w.m5952constructorimpl(1), obj);
        s0Var.ensureAllArgumentsPushedFor(eVar);
    }

    public final void pushCopyNodesToNewAnchorLocation(List<? extends Object> list, z0.w wVar) {
        if (list.isEmpty()) {
            return;
        }
        g gVar = g.f82346c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(gVar);
        t0.m5946setObjects4uCC6AY(t0.m5937constructorimpl(s0Var), w.m5952constructorimpl(1), list, w.m5952constructorimpl(0), wVar);
        s0Var.ensureAllArgumentsPushedFor(gVar);
    }

    public final void pushCopySlotTableToAnchorLocation(h2 h2Var, p0.f0 f0Var, i2 i2Var, i2 i2Var2) {
        h hVar = h.f82348c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(hVar);
        t0.m5947setObjectsOGa0p1M(t0.m5937constructorimpl(s0Var), w.m5952constructorimpl(0), h2Var, w.m5952constructorimpl(1), f0Var, w.m5952constructorimpl(3), i2Var2, w.m5952constructorimpl(2), i2Var);
        s0Var.ensureAllArgumentsPushedFor(hVar);
    }

    public final void pushDeactivateCurrentGroup() {
        this.f82322a.push(i.f82350c);
    }

    public final void pushDetermineMovableContentNodeIndex(z0.w wVar, p0.b bVar) {
        j jVar = j.f82352c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(jVar);
        t0.m5946setObjects4uCC6AY(t0.m5937constructorimpl(s0Var), w.m5952constructorimpl(0), wVar, w.m5952constructorimpl(1), bVar);
        s0Var.ensureAllArgumentsPushedFor(jVar);
    }

    public final void pushDowns(Object[] objArr) {
        if (objArr.length == 0) {
            return;
        }
        k kVar = k.f82354c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(kVar);
        t0.m5945setObjectDKhxnng(t0.m5937constructorimpl(s0Var), w.m5952constructorimpl(0), objArr);
        s0Var.ensureAllArgumentsPushedFor(kVar);
    }

    public final void pushEndCompositionScope(kv.l lVar, p0.e0 e0Var) {
        l lVar2 = l.f82356c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(lVar2);
        t0.m5946setObjects4uCC6AY(t0.m5937constructorimpl(s0Var), w.m5952constructorimpl(0), lVar, w.m5952constructorimpl(1), e0Var);
        s0Var.ensureAllArgumentsPushedFor(lVar2);
    }

    public final void pushEndCurrentGroup() {
        this.f82322a.push(m.f82358c);
    }

    public final void pushEndMovableContentPlacement() {
        this.f82322a.push(n.f82360c);
    }

    public final void pushEndResumingScope(k3 k3Var) {
        o oVar = o.f82363c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(oVar);
        t0.m5945setObjectDKhxnng(t0.m5937constructorimpl(s0Var), w.m5952constructorimpl(0), k3Var);
        s0Var.ensureAllArgumentsPushedFor(oVar);
    }

    public final void pushEnsureGroupStarted(p0.b bVar) {
        p pVar = p.f82364c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(pVar);
        t0.m5945setObjectDKhxnng(t0.m5937constructorimpl(s0Var), w.m5952constructorimpl(0), bVar);
        s0Var.ensureAllArgumentsPushedFor(pVar);
    }

    public final void pushEnsureRootStarted() {
        this.f82322a.push(q.f82365c);
    }

    public final void pushExecuteOperationsIn(a aVar, z0.w wVar) {
        if (aVar.isNotEmpty()) {
            f fVar = f.f82344c;
            s0 s0Var = this.f82322a;
            s0Var.pushOp(fVar);
            t0.m5946setObjects4uCC6AY(t0.m5937constructorimpl(s0Var), w.m5952constructorimpl(0), aVar, w.m5952constructorimpl(1), wVar);
            s0Var.ensureAllArgumentsPushedFor(fVar);
        }
    }

    public final void pushInsertSlots(p0.b bVar, s4 s4Var) {
        s sVar = s.f82369c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(sVar);
        t0.m5946setObjects4uCC6AY(t0.m5937constructorimpl(s0Var), w.m5952constructorimpl(0), bVar, w.m5952constructorimpl(1), s4Var);
        s0Var.ensureAllArgumentsPushedFor(sVar);
    }

    public final void pushMoveCurrentGroup(int i10) {
        u uVar = u.f82384c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(uVar);
        s0 s0VarM5937constructorimpl = t0.m5937constructorimpl(s0Var);
        s0VarM5937constructorimpl.f82372c[s0VarM5937constructorimpl.f82373d - s0VarM5937constructorimpl.f82370a[s0VarM5937constructorimpl.f82371b - 1].getInts()] = i10;
        s0Var.ensureAllArgumentsPushedFor(uVar);
    }

    public final void pushMoveNode(int i10, int i11, int i12) {
        v vVar = v.f82385c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(vVar);
        s0 s0VarM5937constructorimpl = t0.m5937constructorimpl(s0Var);
        int ints = s0VarM5937constructorimpl.f82373d - s0VarM5937constructorimpl.f82370a[s0VarM5937constructorimpl.f82371b - 1].getInts();
        int[] iArr = s0VarM5937constructorimpl.f82372c;
        iArr[ints + 1] = i10;
        iArr[ints] = i11;
        iArr[ints + 2] = i12;
        s0Var.ensureAllArgumentsPushedFor(vVar);
    }

    public final void pushReleaseMovableGroupAtCurrent(y0 y0Var, p0.f0 f0Var, i2 i2Var) {
        y yVar = y.f82388c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(yVar);
        t0.m5948setObjectst7hvbck(t0.m5937constructorimpl(s0Var), w.m5952constructorimpl(0), y0Var, w.m5952constructorimpl(1), f0Var, w.m5952constructorimpl(2), i2Var);
        s0Var.ensureAllArgumentsPushedFor(yVar);
    }

    public final void pushRemember(k4 k4Var) {
        z zVar = z.f82389c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(zVar);
        t0.m5945setObjectDKhxnng(t0.m5937constructorimpl(s0Var), w.m5952constructorimpl(0), k4Var);
        s0Var.ensureAllArgumentsPushedFor(zVar);
    }

    public final void pushRememberPausingScope(k3 k3Var) {
        a0 a0Var = a0.f82323c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(a0Var);
        t0.m5945setObjectDKhxnng(t0.m5937constructorimpl(s0Var), w.m5952constructorimpl(0), k3Var);
        s0Var.ensureAllArgumentsPushedFor(a0Var);
    }

    public final void pushRemoveCurrentGroup() {
        this.f82322a.push(b0.f82336c);
    }

    public final void pushRemoveNode(int i10, int i11) {
        c0 c0Var = c0.f82339c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(c0Var);
        s0 s0VarM5937constructorimpl = t0.m5937constructorimpl(s0Var);
        int ints = s0VarM5937constructorimpl.f82373d - s0VarM5937constructorimpl.f82370a[s0VarM5937constructorimpl.f82371b - 1].getInts();
        int[] iArr = s0VarM5937constructorimpl.f82372c;
        iArr[ints] = i10;
        iArr[ints + 1] = i11;
        s0Var.ensureAllArgumentsPushedFor(c0Var);
    }

    public final void pushResetSlots() {
        this.f82322a.push(d0.f82341c);
    }

    public final void pushSideEffect(kv.a aVar) {
        e0 e0Var = e0.f82343c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(e0Var);
        t0.m5945setObjectDKhxnng(t0.m5937constructorimpl(s0Var), w.m5952constructorimpl(0), aVar);
        s0Var.ensureAllArgumentsPushedFor(e0Var);
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.f82322a.push(f0.f82345c);
    }

    public final void pushStartResumingScope(k3 k3Var) {
        g0 g0Var = g0.f82347c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(g0Var);
        t0.m5945setObjectDKhxnng(t0.m5937constructorimpl(s0Var), w.m5952constructorimpl(0), k3Var);
        s0Var.ensureAllArgumentsPushedFor(g0Var);
    }

    public final void pushTrimValues(int i10) {
        h0 h0Var = h0.f82349c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(h0Var);
        s0 s0VarM5937constructorimpl = t0.m5937constructorimpl(s0Var);
        s0VarM5937constructorimpl.f82372c[s0VarM5937constructorimpl.f82373d - s0VarM5937constructorimpl.f82370a[s0VarM5937constructorimpl.f82371b - 1].getInts()] = i10;
        s0Var.ensureAllArgumentsPushedFor(h0Var);
    }

    public final void pushUpdateAnchoredValue(Object obj, p0.b bVar, int i10) {
        i0 i0Var = i0.f82351c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(i0Var);
        s0 s0VarM5937constructorimpl = t0.m5937constructorimpl(s0Var);
        t0.m5946setObjects4uCC6AY(s0VarM5937constructorimpl, w.m5952constructorimpl(0), obj, w.m5952constructorimpl(1), bVar);
        s0VarM5937constructorimpl.f82372c[s0VarM5937constructorimpl.f82373d - s0VarM5937constructorimpl.f82370a[s0VarM5937constructorimpl.f82371b - 1].getInts()] = i10;
        s0Var.ensureAllArgumentsPushedFor(i0Var);
    }

    public final void pushUpdateAuxData(Object obj) {
        j0 j0Var = j0.f82353c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(j0Var);
        t0.m5945setObjectDKhxnng(t0.m5937constructorimpl(s0Var), w.m5952constructorimpl(0), obj);
        s0Var.ensureAllArgumentsPushedFor(j0Var);
    }

    public final <T, V> void pushUpdateNode(V v10, kv.p pVar) {
        k0 k0Var = k0.f82355c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(k0Var);
        s0 s0VarM5937constructorimpl = t0.m5937constructorimpl(s0Var);
        int iM5952constructorimpl = w.m5952constructorimpl(0);
        int iM5952constructorimpl2 = w.m5952constructorimpl(1);
        kotlin.jvm.internal.e0.checkNotNull(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        t0.m5946setObjects4uCC6AY(s0VarM5937constructorimpl, iM5952constructorimpl, v10, iM5952constructorimpl2, (kv.p) h1.beforeCheckcastToFunctionOfArity(pVar, 2));
        s0Var.ensureAllArgumentsPushedFor(k0Var);
    }

    public final void pushUpdateValue(Object obj, int i10) {
        l0 l0Var = l0.f82357c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(l0Var);
        s0 s0VarM5937constructorimpl = t0.m5937constructorimpl(s0Var);
        t0.m5945setObjectDKhxnng(s0VarM5937constructorimpl, w.m5952constructorimpl(0), obj);
        s0VarM5937constructorimpl.f82372c[s0VarM5937constructorimpl.f82373d - s0VarM5937constructorimpl.f82370a[s0VarM5937constructorimpl.f82371b - 1].getInts()] = i10;
        s0Var.ensureAllArgumentsPushedFor(l0Var);
    }

    public final void pushUps(int i10) {
        m0 m0Var = m0.f82359c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(m0Var);
        s0 s0VarM5937constructorimpl = t0.m5937constructorimpl(s0Var);
        s0VarM5937constructorimpl.f82372c[s0VarM5937constructorimpl.f82373d - s0VarM5937constructorimpl.f82370a[s0VarM5937constructorimpl.f82371b - 1].getInts()] = i10;
        s0Var.ensureAllArgumentsPushedFor(m0Var);
    }

    @Override // q0.u0
    public String toDebugString(String str) {
        StringBuilder sbU = o2.u("ChangeList instance containing ");
        sbU.append(getSize());
        sbU.append(" operations");
        if (sbU.length() > 0) {
            sbU.append(":\n");
            sbU.append(this.f82322a.toDebugString(str));
        }
        String string = sbU.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void pushInsertSlots(p0.b bVar, s4 s4Var, c cVar) {
        t tVar = t.f82382c;
        s0 s0Var = this.f82322a;
        s0Var.pushOp(tVar);
        t0.m5948setObjectst7hvbck(t0.m5937constructorimpl(s0Var), w.m5952constructorimpl(0), bVar, w.m5952constructorimpl(1), s4Var, w.m5952constructorimpl(2), cVar);
        s0Var.ensureAllArgumentsPushedFor(tVar);
    }

    public final void pushUseNode(Object obj) {
    }
}
