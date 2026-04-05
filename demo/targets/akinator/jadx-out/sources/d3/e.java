package d3;

import e3.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public int f51758b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f51759c;

    /* renamed from: d, reason: collision with root package name */
    public final g f51760d;

    /* renamed from: e, reason: collision with root package name */
    public final d f51761e;

    /* renamed from: f, reason: collision with root package name */
    public e f51762f;

    /* renamed from: i, reason: collision with root package name */
    public x2.n f51765i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f51757a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f51763g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f51764h = Integer.MIN_VALUE;

    public e(g gVar, d dVar) {
        this.f51760d = gVar;
        this.f51761e = dVar;
    }

    public final boolean a(g gVar, HashSet hashSet) {
        if (!hashSet.contains(gVar)) {
            hashSet.add(gVar);
            if (gVar == getOwner()) {
                return true;
            }
            ArrayList<e> anchors = gVar.getAnchors();
            int size = anchors.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = anchors.get(i10);
                if (eVar.isSimilarDimensionConnection(this) && eVar.isConnected() && a(eVar.getTarget().getOwner(), hashSet)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean connect(e eVar, int i10, int i11, boolean z10) {
        if (eVar == null) {
            reset();
            return true;
        }
        if (!z10 && !isValidConnection(eVar)) {
            return false;
        }
        this.f51762f = eVar;
        if (eVar.f51757a == null) {
            eVar.f51757a = new HashSet();
        }
        HashSet hashSet = this.f51762f.f51757a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f51763g = i10;
        this.f51764h = i11;
        return true;
    }

    public void copyFrom(e eVar, HashMap<g, g> map) {
        HashSet hashSet;
        e eVar2 = this.f51762f;
        if (eVar2 != null && (hashSet = eVar2.f51757a) != null) {
            hashSet.remove(this);
        }
        e eVar3 = eVar.f51762f;
        if (eVar3 != null) {
            this.f51762f = map.get(eVar.f51762f.f51760d).getAnchor(eVar3.getType());
        } else {
            this.f51762f = null;
        }
        e eVar4 = this.f51762f;
        if (eVar4 != null) {
            if (eVar4.f51757a == null) {
                eVar4.f51757a = new HashSet();
            }
            this.f51762f.f51757a.add(this);
        }
        this.f51763g = eVar.f51763g;
        this.f51764h = eVar.f51764h;
    }

    public void findDependents(int i10, ArrayList<r> arrayList, r rVar) {
        HashSet hashSet = this.f51757a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                e3.k.findDependents(((e) it.next()).f51760d, i10, arrayList, rVar);
            }
        }
    }

    public HashSet<e> getDependents() {
        return this.f51757a;
    }

    public int getFinalValue() {
        if (this.f51759c) {
            return this.f51758b;
        }
        return 0;
    }

    public int getMargin() {
        e eVar;
        if (this.f51760d.getVisibility() == 8) {
            return 0;
        }
        return (this.f51764h == Integer.MIN_VALUE || (eVar = this.f51762f) == null || eVar.f51760d.getVisibility() != 8) ? this.f51763g : this.f51764h;
    }

    public final e getOpposite() {
        d dVar = this.f51761e;
        int iOrdinal = dVar.ordinal();
        g gVar = this.f51760d;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return gVar.P;
            case 2:
                return gVar.Q;
            case 3:
                return gVar.N;
            case 4:
                return gVar.O;
            default:
                throw new AssertionError(dVar.name());
        }
    }

    public g getOwner() {
        return this.f51760d;
    }

    public x2.n getSolverVariable() {
        return this.f51765i;
    }

    public e getTarget() {
        return this.f51762f;
    }

    public d getType() {
        return this.f51761e;
    }

    public boolean hasCenteredDependents() {
        HashSet hashSet = this.f51757a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((e) it.next()).getOpposite().isConnected()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDependents() {
        HashSet hashSet = this.f51757a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean hasFinalValue() {
        return this.f51759c;
    }

    public boolean isConnected() {
        return this.f51762f != null;
    }

    public boolean isConnectionAllowed(g gVar, e eVar) {
        return isConnectionAllowed(gVar);
    }

    public boolean isSideAnchor() {
        d dVar = this.f51761e;
        switch (dVar.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
            default:
                throw new AssertionError(dVar.name());
        }
    }

    public boolean isSimilarDimensionConnection(e eVar) {
        d type = eVar.getType();
        d dVar = this.f51761e;
        if (type == dVar) {
            return true;
        }
        int iOrdinal = dVar.ordinal();
        d dVar2 = d.f51752g;
        switch (iOrdinal) {
            case 0:
                return false;
            case 1:
            case 3:
            case 7:
                return type == d.f51748b || type == d.f51750e || type == d.f51754i;
            case 2:
            case 4:
            case 5:
            case 8:
                return type == d.f51749c || type == d.f51751f || type == d.f51755j || type == dVar2;
            case 6:
                return type != dVar2;
            default:
                throw new AssertionError(dVar.name());
        }
    }

    public boolean isValidConnection(e eVar) {
        if (eVar == null) {
            return false;
        }
        d type = eVar.getType();
        d dVar = d.f51752g;
        d dVar2 = this.f51761e;
        if (type == dVar2) {
            return dVar2 != dVar || (eVar.getOwner().hasBaseline() && getOwner().hasBaseline());
        }
        int iOrdinal = dVar2.ordinal();
        d dVar3 = d.f51750e;
        d dVar4 = d.f51748b;
        d dVar5 = d.f51755j;
        d dVar6 = d.f51754i;
        switch (iOrdinal) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z10 = type == dVar4 || type == dVar3;
                return eVar.getOwner() instanceof k ? z10 || type == dVar6 : z10;
            case 2:
            case 4:
                boolean z11 = type == d.f51749c || type == d.f51751f;
                return eVar.getOwner() instanceof k ? z11 || type == dVar5 : z11;
            case 5:
                return (type == dVar4 || type == dVar3) ? false : true;
            case 6:
                return (type == dVar || type == dVar6 || type == dVar5) ? false : true;
            default:
                throw new AssertionError(dVar2.name());
        }
    }

    public boolean isVerticalAnchor() {
        d dVar = this.f51761e;
        switch (dVar.ordinal()) {
            case 0:
            case 2:
            case 4:
            case 5:
            case 8:
                return true;
            case 1:
            case 3:
            case 6:
            case 7:
                return false;
            default:
                throw new AssertionError(dVar.name());
        }
    }

    public void reset() {
        HashSet hashSet;
        e eVar = this.f51762f;
        if (eVar != null && (hashSet = eVar.f51757a) != null) {
            hashSet.remove(this);
            if (this.f51762f.f51757a.size() == 0) {
                this.f51762f.f51757a = null;
            }
        }
        this.f51757a = null;
        this.f51762f = null;
        this.f51763g = 0;
        this.f51764h = Integer.MIN_VALUE;
        this.f51759c = false;
        this.f51758b = 0;
    }

    public void resetFinalResolution() {
        this.f51759c = false;
        this.f51758b = 0;
    }

    public void resetSolverVariable(x2.d dVar) {
        x2.n nVar = this.f51765i;
        if (nVar == null) {
            this.f51765i = new x2.n(x2.m.f91512b, (String) null);
        } else {
            nVar.reset();
        }
    }

    public void setFinalValue(int i10) {
        this.f51758b = i10;
        this.f51759c = true;
    }

    public void setGoneMargin(int i10) {
        if (isConnected()) {
            this.f51764h = i10;
        }
    }

    public void setMargin(int i10) {
        if (isConnected()) {
            this.f51763g = i10;
        }
    }

    public String toString() {
        return this.f51760d.getDebugName() + ":" + this.f51761e.toString();
    }

    public boolean isConnectionAllowed(g gVar) {
        if (a(gVar, new HashSet())) {
            return false;
        }
        g parent = getOwner().getParent();
        return parent == gVar || gVar.getParent() == parent;
    }

    public boolean connect(e eVar, int i10) {
        return connect(eVar, i10, Integer.MIN_VALUE, false);
    }
}
