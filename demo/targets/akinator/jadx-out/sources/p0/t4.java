package p0;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t4 implements d1.i, Iterable, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final s4 f80488b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80489c;

    /* renamed from: e, reason: collision with root package name */
    public final int f80490e;

    public t4(s4 s4Var, int i10, int i11) {
        this.f80488b = s4Var;
        this.f80489c = i10;
        this.f80490e = i11;
    }

    @Override // d1.i, d1.e
    public d1.i find(Object obj) {
        int iAnchorIndex;
        int i10;
        if (!(obj instanceof b)) {
            if (obj instanceof t5) {
                t5 t5Var = (t5) obj;
                d1.i iVarFind = find(t5Var.getParentIdentity());
                if (iVarFind != null) {
                    return (d1.i) uu.y0.firstOrNull(uu.y0.drop(iVarFind.getCompositionGroups(), t5Var.getIndex()));
                }
            }
            return null;
        }
        b bVar = (b) obj;
        s4 s4Var = this.f80488b;
        if (!s4Var.ownsAnchor(bVar) || (iAnchorIndex = s4Var.anchorIndex(bVar)) < (i10 = this.f80489c) || iAnchorIndex - i10 >= u4.access$groupSize(s4Var.getGroups(), i10)) {
            return null;
        }
        return new t4(s4Var, iAnchorIndex, this.f80490e);
    }

    @Override // d1.i
    public Iterable<Object> getData() {
        s4 s4Var = this.f80488b;
        int i10 = this.f80489c;
        q1 q1VarSourceInformationOf = s4Var.sourceInformationOf(i10);
        return q1VarSourceInformationOf != null ? new p5(s4Var, i10, q1VarSourceInformationOf) : new z0(s4Var, i10);
    }

    public final int getGroup() {
        return this.f80489c;
    }

    @Override // d1.i
    public int getGroupSize() {
        return u4.access$groupSize(this.f80488b.getGroups(), this.f80489c);
    }

    @Override // d1.i
    public Object getIdentity() {
        s4 s4Var = this.f80488b;
        if (s4Var.getVersion$runtime() != this.f80490e) {
            u4.throwConcurrentModificationException();
        }
        r4 r4VarOpenReader = s4Var.openReader();
        try {
            return r4VarOpenReader.anchor(this.f80489c);
        } finally {
            r4VarOpenReader.close();
        }
    }

    @Override // d1.i
    public Object getKey() {
        s4 s4Var = this.f80488b;
        int[] groups = s4Var.getGroups();
        int i10 = this.f80489c;
        if ((groups[(i10 * 5) + 1] & 536870912) == 0) {
            return Integer.valueOf(s4Var.getGroups()[i10 * 5]);
        }
        Object obj = s4Var.getSlots()[u4.access$objectKeyIndex(s4Var.getGroups(), i10)];
        kotlin.jvm.internal.e0.checkNotNull(obj);
        return obj;
    }

    @Override // d1.i
    public Object getNode() {
        s4 s4Var = this.f80488b;
        int[] groups = s4Var.getGroups();
        int i10 = this.f80489c;
        if ((groups[(i10 * 5) + 1] & 1073741824) != 0) {
            return s4Var.getSlots()[s4Var.getGroups()[(i10 * 5) + 4]];
        }
        return null;
    }

    @Override // d1.i
    public int getSlotsSize() {
        int groupSize = getGroupSize();
        int i10 = this.f80489c;
        int i11 = groupSize + i10;
        s4 s4Var = this.f80488b;
        return (i11 < s4Var.getGroupsSize() ? s4Var.getGroups()[(i11 * 5) + 4] : s4Var.getSlotsSize()) - s4Var.getGroups()[(i10 * 5) + 4];
    }

    @Override // d1.i
    public String getSourceInfo() {
        q1 q1VarSourceInformationOf = this.f80488b.sourceInformationOf(this.f80489c);
        if (q1VarSourceInformationOf != null) {
            return q1VarSourceInformationOf.getSourceInformation();
        }
        return null;
    }

    public final s4 getTable() {
        return this.f80488b;
    }

    public final int getVersion() {
        return this.f80490e;
    }

    @Override // d1.i, d1.e
    public boolean isEmpty() {
        return u4.access$groupSize(this.f80488b.getGroups(), this.f80489c) == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<d1.i> iterator() {
        s4 s4Var = this.f80488b;
        if (s4Var.getVersion$runtime() != this.f80490e) {
            u4.throwConcurrentModificationException();
        }
        int i10 = this.f80489c;
        q1 q1VarSourceInformationOf = s4Var.sourceInformationOf(i10);
        return q1VarSourceInformationOf != null ? new q5(s4Var, i10, q1VarSourceInformationOf, new c(i10)) : new n1(s4Var, i10 + 1, u4.access$groupSize(s4Var.getGroups(), i10) + i10);
    }

    public /* synthetic */ t4(s4 s4Var, int i10, int i11, int i12, kotlin.jvm.internal.u uVar) {
        this(s4Var, i10, (i12 & 4) != 0 ? s4Var.getVersion$runtime() : i11);
    }

    @Override // d1.i, d1.e
    public Iterable<d1.i> getCompositionGroups() {
        return this;
    }
}
