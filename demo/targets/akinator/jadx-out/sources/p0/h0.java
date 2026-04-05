package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h0 implements d1.e, d1.j {

    /* renamed from: b, reason: collision with root package name */
    public final e0 f80231b;

    public h0(e0 e0Var) {
        this.f80231b = e0Var;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h0) {
            return kotlin.jvm.internal.e0.areEqual(this.f80231b, ((h0) obj).f80231b);
        }
        return false;
    }

    @Override // d1.e
    public d1.i find(Object obj) {
        e0 e0Var = this.f80231b;
        kotlin.jvm.internal.e0.checkNotNull(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        return ((j0) e0Var).getSlotTable$runtime().find(obj);
    }

    @Override // d1.j
    public d1.i findContextGroup() {
        Integer numFindSubcompositionContextGroup;
        e0 e0Var = this.f80231b;
        boolean z10 = e0Var instanceof j0;
        j0 j0Var = z10 ? (j0) e0Var : null;
        f0 parent = j0Var != null ? j0Var.getParent() : null;
        e0 composition$runtime = parent != null ? parent.getComposition$runtime() : null;
        if (composition$runtime != null) {
            j0 j0Var2 = composition$runtime instanceof j0 ? (j0) composition$runtime : null;
            s4 slotTable$runtime = j0Var2 != null ? j0Var2.getSlotTable$runtime() : null;
            if (slotTable$runtime != null) {
                j0 j0Var3 = z10 ? (j0) e0Var : null;
                f0 parent2 = j0Var3 != null ? j0Var3.getParent() : null;
                if (parent2 != null && (numFindSubcompositionContextGroup = d1.b.findSubcompositionContextGroup(slotTable$runtime, parent2)) != null) {
                    return u4.compositionGroupOf(slotTable$runtime, numFindSubcompositionContextGroup.intValue());
                }
            }
        }
        return null;
    }

    public final e0 getComposition() {
        return this.f80231b;
    }

    @Override // d1.e
    public Iterable<d1.i> getCompositionGroups() {
        e0 e0Var = this.f80231b;
        kotlin.jvm.internal.e0.checkNotNull(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        return ((j0) e0Var).getSlotTable$runtime().getCompositionGroups();
    }

    @Override // d1.j
    public d1.j getParent() {
        e0 e0Var = this.f80231b;
        j0 j0Var = e0Var instanceof j0 ? (j0) e0Var : null;
        f0 parent = j0Var != null ? j0Var.getParent() : null;
        e0 composition$runtime = parent != null ? parent.getComposition$runtime() : null;
        if (composition$runtime != null) {
            return new h0(composition$runtime);
        }
        return null;
    }

    public int hashCode() {
        return this.f80231b.hashCode() * 31;
    }

    @Override // d1.e
    public boolean isEmpty() {
        e0 e0Var = this.f80231b;
        kotlin.jvm.internal.e0.checkNotNull(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        return ((j0) e0Var).getSlotTable$runtime().isEmpty();
    }

    @Override // d1.j
    public d1.e getData() {
        return this;
    }
}
