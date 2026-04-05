package e3;

import e3.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final d3.h f53654a;

    /* renamed from: d, reason: collision with root package name */
    public final d3.h f53657d;

    /* renamed from: f, reason: collision with root package name */
    public c f53659f;

    /* renamed from: g, reason: collision with root package name */
    public final b.a f53660g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f53661h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f53655b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f53656c = true;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f53658e = new ArrayList();

    public f(d3.h hVar) {
        new ArrayList();
        this.f53659f = null;
        this.f53660g = new b.a();
        this.f53661h = new ArrayList();
        this.f53654a = hVar;
        this.f53657d = hVar;
    }

    public final void a(h hVar, int i10, ArrayList arrayList, o oVar) {
        s sVar = hVar.f53665d;
        o oVar2 = sVar.f53697c;
        h hVar2 = sVar.f53703i;
        h hVar3 = sVar.f53702h;
        if (oVar2 == null) {
            d3.h hVar4 = this.f53654a;
            if (sVar == hVar4.f51777d || sVar == hVar4.f51779e) {
                return;
            }
            if (oVar == null) {
                oVar = new o();
                oVar.f53677a = null;
                oVar.f53678b = new ArrayList();
                oVar.f53677a = sVar;
                arrayList.add(oVar);
            }
            sVar.f53697c = oVar;
            oVar.add(sVar);
            Iterator it = hVar3.f53672k.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (eVar instanceof h) {
                    a((h) eVar, i10, arrayList, oVar);
                }
            }
            Iterator it2 = hVar2.f53672k.iterator();
            while (it2.hasNext()) {
                e eVar2 = (e) it2.next();
                if (eVar2 instanceof h) {
                    a((h) eVar2, i10, arrayList, oVar);
                }
            }
            if (i10 == 1 && (sVar instanceof p)) {
                Iterator it3 = ((p) sVar).f53679k.f53672k.iterator();
                while (it3.hasNext()) {
                    e eVar3 = (e) it3.next();
                    if (eVar3 instanceof h) {
                        a((h) eVar3, i10, arrayList, oVar);
                    }
                }
            }
            Iterator it4 = hVar3.f53673l.iterator();
            while (it4.hasNext()) {
                a((h) it4.next(), i10, arrayList, oVar);
            }
            Iterator it5 = hVar2.f53673l.iterator();
            while (it5.hasNext()) {
                a((h) it5.next(), i10, arrayList, oVar);
            }
            if (i10 == 1 && (sVar instanceof p)) {
                Iterator it6 = ((p) sVar).f53679k.f53673l.iterator();
                while (it6.hasNext()) {
                    a((h) it6.next(), i10, arrayList, oVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x019d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x027b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0197 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(d3.h r22) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.f.b(d3.h):void");
    }

    public void buildGraph() {
        buildGraph(this.f53658e);
        ArrayList arrayList = this.f53661h;
        arrayList.clear();
        d3.h hVar = this.f53654a;
        d(hVar.f51777d, 0, arrayList);
        d(hVar.f51779e, 1, arrayList);
        this.f53655b = false;
    }

    public final int c(d3.h hVar, int i10) {
        ArrayList arrayList = this.f53661h;
        int size = arrayList.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, ((o) arrayList.get(i11)).computeWrapSize(hVar, i10));
        }
        return (int) jMax;
    }

    public final void d(s sVar, int i10, ArrayList arrayList) {
        h hVar = sVar.f53702h;
        h hVar2 = sVar.f53703i;
        Iterator it = hVar.f53672k.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar instanceof h) {
                a((h) eVar, i10, arrayList, null);
            } else if (eVar instanceof s) {
                a(((s) eVar).f53702h, i10, arrayList, null);
            }
        }
        Iterator it2 = hVar2.f53672k.iterator();
        while (it2.hasNext()) {
            e eVar2 = (e) it2.next();
            if (eVar2 instanceof h) {
                a((h) eVar2, i10, arrayList, null);
            } else if (eVar2 instanceof s) {
                a(((s) eVar2).f53703i, i10, arrayList, null);
            }
        }
        if (i10 == 1) {
            Iterator it3 = ((p) sVar).f53679k.f53672k.iterator();
            while (it3.hasNext()) {
                e eVar3 = (e) it3.next();
                if (eVar3 instanceof h) {
                    a((h) eVar3, i10, arrayList, null);
                }
            }
        }
    }

    public void defineTerminalWidgets(d3.f fVar, d3.f fVar2) {
        if (this.f53655b) {
            buildGraph();
            Iterator it = this.f53654a.C0.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                d3.g gVar = (d3.g) it.next();
                boolean[] zArr = gVar.f51781f;
                zArr[0] = true;
                zArr[1] = true;
                if (gVar instanceof d3.a) {
                    z10 = true;
                }
            }
            if (z10) {
                return;
            }
            Iterator it2 = this.f53661h.iterator();
            while (it2.hasNext()) {
                o oVar = (o) it2.next();
                d3.f fVar3 = d3.f.f51767c;
                oVar.defineTerminalWidgets(fVar == fVar3, fVar2 == fVar3);
            }
        }
    }

    public boolean directMeasure(boolean z10) {
        boolean z11;
        boolean z12 = this.f53655b;
        boolean z13 = false;
        d3.h hVar = this.f53654a;
        if (z12 || this.f53656c) {
            Iterator it = hVar.C0.iterator();
            while (it.hasNext()) {
                d3.g gVar = (d3.g) it.next();
                gVar.ensureWidgetRuns();
                gVar.f51771a = false;
                gVar.f51777d.k();
                gVar.f51779e.j();
            }
            hVar.ensureWidgetRuns();
            hVar.f51771a = false;
            hVar.f51777d.k();
            hVar.f51779e.j();
            this.f53656c = false;
        }
        b(this.f53657d);
        hVar.setX(0);
        hVar.setY(0);
        d3.f dimensionBehaviour = hVar.getDimensionBehaviour(0);
        d3.f dimensionBehaviour2 = hVar.getDimensionBehaviour(1);
        if (this.f53655b) {
            buildGraph();
        }
        int x10 = hVar.getX();
        int y10 = hVar.getY();
        hVar.f51777d.f53702h.resolve(x10);
        hVar.f51779e.f53702h.resolve(y10);
        measureWidgets();
        d3.f fVar = d3.f.f51766b;
        ArrayList arrayList = this.f53658e;
        d3.f fVar2 = d3.f.f51767c;
        if (dimensionBehaviour == fVar2 || dimensionBehaviour2 == fVar2) {
            if (z10) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((s) it2.next()).h()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && dimensionBehaviour == fVar2) {
                hVar.setHorizontalDimensionBehaviour(fVar);
                hVar.setWidth(c(hVar, 0));
                hVar.f51777d.f53699e.resolve(hVar.getWidth());
            }
            if (z10 && dimensionBehaviour2 == fVar2) {
                hVar.setVerticalDimensionBehaviour(fVar);
                hVar.setHeight(c(hVar, 1));
                hVar.f51779e.f53699e.resolve(hVar.getHeight());
            }
        }
        d3.f fVar3 = hVar.Y[0];
        d3.f fVar4 = d3.f.f51769f;
        if (fVar3 == fVar || fVar3 == fVar4) {
            int width = hVar.getWidth() + x10;
            hVar.f51777d.f53703i.resolve(width);
            hVar.f51777d.f53699e.resolve(width - x10);
            measureWidgets();
            d3.f fVar5 = hVar.Y[1];
            if (fVar5 == fVar || fVar5 == fVar4) {
                int height = hVar.getHeight() + y10;
                hVar.f51779e.f53703i.resolve(height);
                hVar.f51779e.f53699e.resolve(height - y10);
            }
            measureWidgets();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            s sVar = (s) it3.next();
            if (sVar.f53696b != hVar || sVar.f53701g) {
                sVar.applyToWidget();
            }
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z13 = true;
                break;
            }
            s sVar2 = (s) it4.next();
            if (z11 || sVar2.f53696b != hVar) {
                if (!sVar2.f53702h.f53671j || ((!sVar2.f53703i.f53671j && !(sVar2 instanceof l)) || (!sVar2.f53699e.f53671j && !(sVar2 instanceof d) && !(sVar2 instanceof l)))) {
                    break;
                }
            }
        }
        hVar.setHorizontalDimensionBehaviour(dimensionBehaviour);
        hVar.setVerticalDimensionBehaviour(dimensionBehaviour2);
        return z13;
    }

    public boolean directMeasureSetup(boolean z10) {
        boolean z11 = this.f53655b;
        d3.h hVar = this.f53654a;
        if (z11) {
            Iterator it = hVar.C0.iterator();
            while (it.hasNext()) {
                d3.g gVar = (d3.g) it.next();
                gVar.ensureWidgetRuns();
                gVar.f51771a = false;
                n nVar = gVar.f51777d;
                nVar.f53699e.f53671j = false;
                nVar.f53701g = false;
                nVar.k();
                p pVar = gVar.f51779e;
                pVar.f53699e.f53671j = false;
                pVar.f53701g = false;
                pVar.j();
            }
            hVar.ensureWidgetRuns();
            hVar.f51771a = false;
            n nVar2 = hVar.f51777d;
            nVar2.f53699e.f53671j = false;
            nVar2.f53701g = false;
            nVar2.k();
            p pVar2 = hVar.f51779e;
            pVar2.f53699e.f53671j = false;
            pVar2.f53701g = false;
            pVar2.j();
            buildGraph();
        }
        b(this.f53657d);
        hVar.setX(0);
        hVar.setY(0);
        hVar.f51777d.f53702h.resolve(0);
        hVar.f51779e.f53702h.resolve(0);
        return true;
    }

    public boolean directMeasureWithOrientation(boolean z10, int i10) {
        boolean z11;
        d3.f fVar;
        d3.h hVar = this.f53654a;
        boolean z12 = false;
        d3.f dimensionBehaviour = hVar.getDimensionBehaviour(0);
        d3.f dimensionBehaviour2 = hVar.getDimensionBehaviour(1);
        int x10 = hVar.getX();
        int y10 = hVar.getY();
        ArrayList arrayList = this.f53658e;
        d3.f fVar2 = d3.f.f51766b;
        if (z10 && (dimensionBehaviour == (fVar = d3.f.f51767c) || dimensionBehaviour2 == fVar)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                s sVar = (s) it.next();
                if (sVar.f53700f == i10 && !sVar.h()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && dimensionBehaviour == fVar) {
                    hVar.setHorizontalDimensionBehaviour(fVar2);
                    hVar.setWidth(c(hVar, 0));
                    hVar.f51777d.f53699e.resolve(hVar.getWidth());
                }
            } else if (z10 && dimensionBehaviour2 == fVar) {
                hVar.setVerticalDimensionBehaviour(fVar2);
                hVar.setHeight(c(hVar, 1));
                hVar.f51779e.f53699e.resolve(hVar.getHeight());
            }
        }
        d3.f fVar3 = d3.f.f51769f;
        if (i10 == 0) {
            d3.f fVar4 = hVar.Y[0];
            if (fVar4 == fVar2 || fVar4 == fVar3) {
                int width = hVar.getWidth() + x10;
                hVar.f51777d.f53703i.resolve(width);
                hVar.f51777d.f53699e.resolve(width - x10);
                z11 = true;
            }
            z11 = false;
        } else {
            d3.f fVar5 = hVar.Y[1];
            if (fVar5 == fVar2 || fVar5 == fVar3) {
                int height = hVar.getHeight() + y10;
                hVar.f51779e.f53703i.resolve(height);
                hVar.f51779e.f53699e.resolve(height - y10);
                z11 = true;
            }
            z11 = false;
        }
        measureWidgets();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            s sVar2 = (s) it2.next();
            if (sVar2.f53700f == i10 && (sVar2.f53696b != hVar || sVar2.f53701g)) {
                sVar2.applyToWidget();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z12 = true;
                break;
            }
            s sVar3 = (s) it3.next();
            if (sVar3.f53700f == i10 && (z11 || sVar3.f53696b != hVar)) {
                if (!sVar3.f53702h.f53671j || !sVar3.f53703i.f53671j || (!(sVar3 instanceof d) && !sVar3.f53699e.f53671j)) {
                    break;
                }
            }
        }
        hVar.setHorizontalDimensionBehaviour(dimensionBehaviour);
        hVar.setVerticalDimensionBehaviour(dimensionBehaviour2);
        return z12;
    }

    public final void e(d3.g gVar, d3.f fVar, int i10, d3.f fVar2, int i11) {
        b.a aVar = this.f53660g;
        aVar.f53642a = fVar;
        aVar.f53643b = fVar2;
        aVar.f53644c = i10;
        aVar.f53645d = i11;
        ((androidx.constraintlayout.widget.e) this.f53659f).measure(gVar, aVar);
        gVar.setWidth(aVar.f53646e);
        gVar.setHeight(aVar.f53647f);
        gVar.setHasBaseline(aVar.f53649h);
        gVar.setBaselineDistance(aVar.f53648g);
    }

    public void invalidateGraph() {
        this.f53655b = true;
    }

    public void invalidateMeasures() {
        this.f53656c = true;
    }

    public void measureWidgets() {
        a aVar;
        Iterator it = this.f53654a.C0.iterator();
        while (it.hasNext()) {
            d3.g gVar = (d3.g) it.next();
            if (!gVar.f51771a) {
                d3.f[] fVarArr = gVar.Y;
                boolean z10 = false;
                d3.f fVar = fVarArr[0];
                d3.f fVar2 = fVarArr[1];
                int i10 = gVar.f51809t;
                int i11 = gVar.f51811u;
                d3.f fVar3 = d3.f.f51768e;
                d3.f fVar4 = d3.f.f51767c;
                boolean z11 = fVar == fVar4 || (fVar == fVar3 && i10 == 1);
                if (fVar2 == fVar4 || (fVar2 == fVar3 && i11 == 1)) {
                    z10 = true;
                }
                i iVar = gVar.f51777d.f53699e;
                boolean z12 = iVar.f53671j;
                i iVar2 = gVar.f51779e.f53699e;
                boolean z13 = iVar2.f53671j;
                boolean z14 = z11;
                d3.f fVar5 = d3.f.f51766b;
                if (z12 && z13) {
                    e(gVar, fVar5, iVar.f53668g, fVar5, iVar2.f53668g);
                    gVar.f51771a = true;
                } else if (z12 && z10) {
                    e(gVar, fVar5, iVar.f53668g, fVar4, iVar2.f53668g);
                    if (fVar2 == fVar3) {
                        gVar.f51779e.f53699e.f53674m = gVar.getHeight();
                    } else {
                        gVar.f51779e.f53699e.resolve(gVar.getHeight());
                        gVar.f51771a = true;
                    }
                } else if (z13 && z14) {
                    e(gVar, fVar4, iVar.f53668g, fVar5, iVar2.f53668g);
                    if (fVar == fVar3) {
                        gVar.f51777d.f53699e.f53674m = gVar.getWidth();
                    } else {
                        gVar.f51777d.f53699e.resolve(gVar.getWidth());
                        gVar.f51771a = true;
                    }
                }
                if (gVar.f51771a && (aVar = gVar.f51779e.f53680l) != null) {
                    aVar.resolve(gVar.getBaselineDistance());
                }
            }
        }
    }

    public void setMeasurer(c cVar) {
        this.f53659f = cVar;
    }

    public void buildGraph(ArrayList<s> arrayList) {
        arrayList.clear();
        d3.h hVar = this.f53657d;
        hVar.f51777d.d();
        hVar.f51779e.d();
        arrayList.add(hVar.f51777d);
        arrayList.add(hVar.f51779e);
        Iterator it = hVar.C0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            d3.g gVar = (d3.g) it.next();
            if (gVar instanceof d3.k) {
                d3.k kVar = (d3.k) gVar;
                s lVar = new l(kVar);
                kVar.f51777d.d();
                kVar.f51779e.d();
                lVar.f53700f = kVar.getOrientation();
                arrayList.add(lVar);
            } else {
                if (gVar.isInHorizontalChain()) {
                    if (gVar.f51773b == null) {
                        gVar.f51773b = new d(gVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(gVar.f51773b);
                } else {
                    arrayList.add(gVar.f51777d);
                }
                if (gVar.isInVerticalChain()) {
                    if (gVar.f51775c == null) {
                        gVar.f51775c = new d(gVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(gVar.f51775c);
                } else {
                    arrayList.add(gVar.f51779e);
                }
                if (gVar instanceof d3.m) {
                    arrayList.add(new m(gVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<s> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().d();
        }
        Iterator<s> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            s next = it3.next();
            if (next.f53696b != hVar) {
                next.c();
            }
        }
    }
}
