package e3;

import com.ironsource.C3191e4;
import j1.o2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class r {

    /* renamed from: g, reason: collision with root package name */
    public static int f53688g;

    /* renamed from: b, reason: collision with root package name */
    public final int f53690b;

    /* renamed from: d, reason: collision with root package name */
    public int f53692d;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f53689a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f53691c = false;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f53693e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f53694f = -1;

    public r(int i10) {
        int i11 = f53688g;
        f53688g = i11 + 1;
        this.f53690b = i11;
        this.f53692d = i10;
    }

    public boolean add(d3.g gVar) {
        ArrayList arrayList = this.f53689a;
        if (arrayList.contains(gVar)) {
            return false;
        }
        arrayList.add(gVar);
        return true;
    }

    public void apply() {
        if (this.f53693e != null && this.f53691c) {
            for (int i10 = 0; i10 < this.f53693e.size(); i10++) {
                ((q) this.f53693e.get(i10)).apply();
            }
        }
    }

    public void cleanup(ArrayList<r> arrayList) {
        int size = this.f53689a.size();
        if (this.f53694f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                r rVar = arrayList.get(i10);
                if (this.f53694f == rVar.f53690b) {
                    moveTo(this.f53692d, rVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void clear() {
        this.f53689a.clear();
    }

    public int getId() {
        return this.f53690b;
    }

    public int getOrientation() {
        return this.f53692d;
    }

    public boolean intersectWith(r rVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f53689a;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (rVar.f53689a.contains((d3.g) arrayList.get(i10))) {
                return true;
            }
            i10++;
        }
    }

    public boolean isAuthoritative() {
        return this.f53691c;
    }

    public int measureWrap(x2.f fVar, int i10) {
        int objectVariableValue;
        int objectVariableValue2;
        ArrayList arrayList = this.f53689a;
        if (arrayList.size() == 0) {
            return 0;
        }
        d3.h hVar = (d3.h) ((d3.g) arrayList.get(0)).getParent();
        fVar.reset();
        hVar.addToSolver(fVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((d3.g) arrayList.get(i11)).addToSolver(fVar, false);
        }
        if (i10 == 0 && hVar.M0 > 0) {
            d3.b.applyChainConstraints(hVar, fVar, arrayList, 0);
        }
        if (i10 == 1 && hVar.N0 > 0) {
            d3.b.applyChainConstraints(hVar, fVar, arrayList, 1);
        }
        try {
            fVar.minimize();
        } catch (Exception e10) {
            System.err.println(e10.toString() + "\n" + Arrays.toString(e10.getStackTrace()).replace(C3191e4.i.f36529d, "   at ").replace(",", "\n   at").replace(C3191e4.i.f36531e, ""));
        }
        this.f53693e = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            d3.g gVar = (d3.g) arrayList.get(i12);
            q qVar = new q();
            qVar.f53681a = new WeakReference(gVar);
            qVar.f53682b = fVar.getObjectVariableValue(gVar.N);
            qVar.f53683c = fVar.getObjectVariableValue(gVar.O);
            qVar.f53684d = fVar.getObjectVariableValue(gVar.P);
            qVar.f53685e = fVar.getObjectVariableValue(gVar.Q);
            qVar.f53686f = fVar.getObjectVariableValue(gVar.R);
            qVar.f53687g = i10;
            this.f53693e.add(qVar);
        }
        if (i10 == 0) {
            objectVariableValue = fVar.getObjectVariableValue(hVar.N);
            objectVariableValue2 = fVar.getObjectVariableValue(hVar.P);
            fVar.reset();
        } else {
            objectVariableValue = fVar.getObjectVariableValue(hVar.O);
            objectVariableValue2 = fVar.getObjectVariableValue(hVar.Q);
            fVar.reset();
        }
        return objectVariableValue2 - objectVariableValue;
    }

    public void moveTo(int i10, r rVar) {
        Iterator it = this.f53689a.iterator();
        while (it.hasNext()) {
            d3.g gVar = (d3.g) it.next();
            rVar.add(gVar);
            if (i10 == 0) {
                gVar.A0 = rVar.getId();
            } else {
                gVar.B0 = rVar.getId();
            }
        }
        this.f53694f = rVar.f53690b;
    }

    public void setAuthoritative(boolean z10) {
        this.f53691c = z10;
    }

    public void setOrientation(int i10) {
        this.f53692d = i10;
    }

    public int size() {
        return this.f53689a.size();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f53692d;
        sb2.append(i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown");
        sb2.append(" [");
        String strF = a.b.f(this.f53690b, "] <", sb2);
        Iterator it = this.f53689a.iterator();
        while (it.hasNext()) {
            d3.g gVar = (d3.g) it.next();
            StringBuilder sbT = a.b.t(strF, " ");
            sbT.append(gVar.getDebugName());
            strF = sbT.toString();
        }
        return o2.l(strF, " >");
    }
}
