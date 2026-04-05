package e3;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m extends s {
    @Override // e3.s
    public void applyToWidget() {
        d3.g gVar = this.f53696b;
        if (gVar instanceof d3.a) {
            int barrierType = ((d3.a) gVar).getBarrierType();
            h hVar = this.f53702h;
            if (barrierType == 0 || barrierType == 1) {
                this.f53696b.setX(hVar.f53668g);
            } else {
                this.f53696b.setY(hVar.f53668g);
            }
        }
    }

    @Override // e3.s
    public final void c() {
        d3.g gVar = this.f53696b;
        if (gVar instanceof d3.a) {
            h hVar = this.f53702h;
            hVar.f53663b = true;
            ArrayList arrayList = hVar.f53673l;
            d3.a aVar = (d3.a) gVar;
            int barrierType = aVar.getBarrierType();
            boolean allowsGoneWidget = aVar.getAllowsGoneWidget();
            int i10 = 0;
            if (barrierType == 0) {
                hVar.f53666e = 4;
                while (i10 < aVar.D0) {
                    d3.g gVar2 = aVar.C0[i10];
                    if (allowsGoneWidget || gVar2.getVisibility() != 8) {
                        h hVar2 = gVar2.f51777d.f53702h;
                        hVar2.f53672k.add(hVar);
                        arrayList.add(hVar2);
                    }
                    i10++;
                }
                j(this.f53696b.f51777d.f53702h);
                j(this.f53696b.f51777d.f53703i);
                return;
            }
            if (barrierType == 1) {
                hVar.f53666e = 5;
                while (i10 < aVar.D0) {
                    d3.g gVar3 = aVar.C0[i10];
                    if (allowsGoneWidget || gVar3.getVisibility() != 8) {
                        h hVar3 = gVar3.f51777d.f53703i;
                        hVar3.f53672k.add(hVar);
                        arrayList.add(hVar3);
                    }
                    i10++;
                }
                j(this.f53696b.f51777d.f53702h);
                j(this.f53696b.f51777d.f53703i);
                return;
            }
            if (barrierType == 2) {
                hVar.f53666e = 6;
                while (i10 < aVar.D0) {
                    d3.g gVar4 = aVar.C0[i10];
                    if (allowsGoneWidget || gVar4.getVisibility() != 8) {
                        h hVar4 = gVar4.f51779e.f53702h;
                        hVar4.f53672k.add(hVar);
                        arrayList.add(hVar4);
                    }
                    i10++;
                }
                j(this.f53696b.f51779e.f53702h);
                j(this.f53696b.f51779e.f53703i);
                return;
            }
            if (barrierType != 3) {
                return;
            }
            hVar.f53666e = 7;
            while (i10 < aVar.D0) {
                d3.g gVar5 = aVar.C0[i10];
                if (allowsGoneWidget || gVar5.getVisibility() != 8) {
                    h hVar5 = gVar5.f51779e.f53703i;
                    hVar5.f53672k.add(hVar);
                    arrayList.add(hVar5);
                }
                i10++;
            }
            j(this.f53696b.f51779e.f53702h);
            j(this.f53696b.f51779e.f53703i);
        }
    }

    @Override // e3.s
    public final void d() {
        this.f53697c = null;
        this.f53702h.clear();
    }

    @Override // e3.s
    public final boolean h() {
        return false;
    }

    public final void j(h hVar) {
        h hVar2 = this.f53702h;
        hVar2.f53672k.add(hVar);
        hVar.f53673l.add(hVar2);
    }

    @Override // e3.s, e3.e
    public void update(e eVar) {
        d3.a aVar = (d3.a) this.f53696b;
        int barrierType = aVar.getBarrierType();
        h hVar = this.f53702h;
        Iterator it = hVar.f53673l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((h) it.next()).f53668g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (barrierType == 0 || barrierType == 2) {
            hVar.resolve(aVar.getMargin() + i11);
        } else {
            hVar.resolve(aVar.getMargin() + i10);
        }
    }
}
