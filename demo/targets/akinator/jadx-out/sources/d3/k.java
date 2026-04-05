package d3;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class k extends g {
    public float C0 = -1.0f;
    public int D0 = -1;
    public int E0 = -1;
    public e F0 = this.O;
    public int G0 = 0;
    public int H0 = 0;
    public boolean I0;

    public k() {
        this.W.clear();
        this.W.add(this.F0);
        int length = this.V.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.V[i10] = this.F0;
        }
    }

    @Override // d3.g
    public void addToSolver(x2.f fVar, boolean z10) {
        h hVar = (h) getParent();
        if (hVar == null) {
            return;
        }
        e anchor = hVar.getAnchor(d.f51748b);
        e anchor2 = hVar.getAnchor(d.f51750e);
        g gVar = this.Z;
        f fVar2 = f.f51767c;
        boolean z11 = gVar != null && gVar.Y[0] == fVar2;
        if (this.G0 == 0) {
            anchor = hVar.getAnchor(d.f51749c);
            anchor2 = hVar.getAnchor(d.f51751f);
            g gVar2 = this.Z;
            z11 = gVar2 != null && gVar2.Y[1] == fVar2;
        }
        if (this.I0 && this.F0.hasFinalValue()) {
            x2.n nVarCreateObjectVariable = fVar.createObjectVariable(this.F0);
            fVar.addEquality(nVarCreateObjectVariable, this.F0.getFinalValue());
            if (this.D0 != -1) {
                if (z11) {
                    fVar.addGreaterThan(fVar.createObjectVariable(anchor2), nVarCreateObjectVariable, 0, 5);
                }
            } else if (this.E0 != -1 && z11) {
                x2.n nVarCreateObjectVariable2 = fVar.createObjectVariable(anchor2);
                fVar.addGreaterThan(nVarCreateObjectVariable, fVar.createObjectVariable(anchor), 0, 5);
                fVar.addGreaterThan(nVarCreateObjectVariable2, nVarCreateObjectVariable, 0, 5);
            }
            this.I0 = false;
            return;
        }
        if (this.D0 != -1) {
            x2.n nVarCreateObjectVariable3 = fVar.createObjectVariable(this.F0);
            fVar.addEquality(nVarCreateObjectVariable3, fVar.createObjectVariable(anchor), this.D0, 8);
            if (z11) {
                fVar.addGreaterThan(fVar.createObjectVariable(anchor2), nVarCreateObjectVariable3, 0, 5);
                return;
            }
            return;
        }
        if (this.E0 == -1) {
            if (this.C0 != -1.0f) {
                fVar.addConstraint(x2.f.createRowDimensionPercent(fVar, fVar.createObjectVariable(this.F0), fVar.createObjectVariable(anchor2), this.C0));
                return;
            }
            return;
        }
        x2.n nVarCreateObjectVariable4 = fVar.createObjectVariable(this.F0);
        x2.n nVarCreateObjectVariable5 = fVar.createObjectVariable(anchor2);
        fVar.addEquality(nVarCreateObjectVariable4, nVarCreateObjectVariable5, -this.E0, 8);
        if (z11) {
            fVar.addGreaterThan(nVarCreateObjectVariable4, fVar.createObjectVariable(anchor), 0, 5);
            fVar.addGreaterThan(nVarCreateObjectVariable5, nVarCreateObjectVariable4, 0, 5);
        }
    }

    @Override // d3.g
    public boolean allowedInBarrier() {
        return true;
    }

    @Override // d3.g
    public void copy(g gVar, HashMap<g, g> map) {
        super.copy(gVar, map);
        k kVar = (k) gVar;
        this.C0 = kVar.C0;
        this.D0 = kVar.D0;
        this.E0 = kVar.E0;
        setOrientation(kVar.G0);
    }

    public void cyclePosition() {
        if (this.D0 != -1) {
            float x10 = getX() / getParent().getWidth();
            if (this.G0 == 0) {
                x10 = getY() / getParent().getHeight();
            }
            setGuidePercent(x10);
            return;
        }
        if (this.C0 != -1.0f) {
            int width = getParent().getWidth() - getX();
            if (this.G0 == 0) {
                width = getParent().getHeight() - getY();
            }
            setGuideEnd(width);
            return;
        }
        if (this.E0 != -1) {
            int x11 = getX();
            if (this.G0 == 0) {
                x11 = getY();
            }
            setGuideBegin(x11);
        }
    }

    public e getAnchor() {
        return this.F0;
    }

    public int getMinimumPosition() {
        return this.H0;
    }

    public int getOrientation() {
        return this.G0;
    }

    public int getRelativeBegin() {
        return this.D0;
    }

    public int getRelativeBehaviour() {
        if (this.C0 != -1.0f) {
            return 0;
        }
        if (this.D0 != -1) {
            return 1;
        }
        return this.E0 != -1 ? 2 : -1;
    }

    public int getRelativeEnd() {
        return this.E0;
    }

    public float getRelativePercent() {
        return this.C0;
    }

    @Override // d3.g
    public String getType() {
        return "Guideline";
    }

    public boolean isPercent() {
        return this.C0 != -1.0f && this.D0 == -1 && this.E0 == -1;
    }

    @Override // d3.g
    public boolean isResolvedHorizontally() {
        return this.I0;
    }

    @Override // d3.g
    public boolean isResolvedVertically() {
        return this.I0;
    }

    public void setFinalValue(int i10) {
        this.F0.setFinalValue(i10);
        this.I0 = true;
    }

    public void setGuideBegin(int i10) {
        if (i10 > -1) {
            this.C0 = -1.0f;
            this.D0 = i10;
            this.E0 = -1;
        }
    }

    public void setGuideEnd(int i10) {
        if (i10 > -1) {
            this.C0 = -1.0f;
            this.D0 = -1;
            this.E0 = i10;
        }
    }

    public void setGuidePercent(int i10) {
        setGuidePercent(i10 / 100.0f);
    }

    public void setMinimumPosition(int i10) {
        this.H0 = i10;
    }

    public void setOrientation(int i10) {
        if (this.G0 == i10) {
            return;
        }
        this.G0 = i10;
        ArrayList arrayList = this.W;
        arrayList.clear();
        if (this.G0 == 1) {
            this.F0 = this.N;
        } else {
            this.F0 = this.O;
        }
        arrayList.add(this.F0);
        e[] eVarArr = this.V;
        int length = eVarArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            eVarArr[i11] = this.F0;
        }
    }

    @Override // d3.g
    public void updateFromSolver(x2.f fVar, boolean z10) {
        if (getParent() == null) {
            return;
        }
        int objectVariableValue = fVar.getObjectVariableValue(this.F0);
        if (this.G0 == 1) {
            setX(objectVariableValue);
            setY(0);
            setHeight(getParent().getHeight());
            setWidth(0);
            return;
        }
        setX(0);
        setY(objectVariableValue);
        setWidth(getParent().getWidth());
        setHeight(0);
    }

    @Override // d3.g
    public e getAnchor(d dVar) {
        int iOrdinal = dVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                }
            }
            if (this.G0 == 0) {
                return this.F0;
            }
            return null;
        }
        if (this.G0 == 1) {
            return this.F0;
        }
        return null;
    }

    public void setGuidePercent(float f10) {
        if (f10 > -1.0f) {
            this.C0 = f10;
            this.D0 = -1;
            this.E0 = -1;
        }
    }
}
