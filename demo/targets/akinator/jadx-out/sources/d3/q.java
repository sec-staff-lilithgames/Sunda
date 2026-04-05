package d3;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class q extends g {
    public ArrayList C0;

    public q() {
        this.C0 = new ArrayList();
    }

    public void add(g gVar) {
        this.C0.add(gVar);
        if (gVar.getParent() != null) {
            ((q) gVar.getParent()).remove(gVar);
        }
        gVar.setParent(this);
    }

    public ArrayList<g> getChildren() {
        return this.C0;
    }

    public h getRootConstraintContainer() {
        g parent = getParent();
        h hVar = this instanceof h ? (h) this : null;
        while (parent != null) {
            g parent2 = parent.getParent();
            if (parent instanceof h) {
                hVar = (h) parent;
            }
            parent = parent2;
        }
        return hVar;
    }

    public void layout() {
        ArrayList arrayList = this.C0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.C0.get(i10);
            if (gVar instanceof q) {
                ((q) gVar).layout();
            }
        }
    }

    public void remove(g gVar) {
        this.C0.remove(gVar);
        gVar.reset();
    }

    public void removeAllChildren() {
        this.C0.clear();
    }

    @Override // d3.g
    public void reset() {
        this.C0.clear();
        super.reset();
    }

    @Override // d3.g
    public void resetSolverVariables(x2.d dVar) {
        super.resetSolverVariables(dVar);
        int size = this.C0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g) this.C0.get(i10)).resetSolverVariables(dVar);
        }
    }

    @Override // d3.g
    public void setOffset(int i10, int i11) {
        super.setOffset(i10, i11);
        int size = this.C0.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((g) this.C0.get(i12)).setOffset(this.f51780e0 + this.f51784g0, this.f51782f0 + this.f51786h0);
        }
    }

    public q(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
        this.C0 = new ArrayList();
    }

    public q(int i10, int i11) {
        super(i10, i11);
        this.C0 = new ArrayList();
    }

    public void add(g... gVarArr) {
        for (g gVar : gVarArr) {
            add(gVar);
        }
    }
}
