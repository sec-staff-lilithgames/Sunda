package e3;

import j1.o2;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d extends s {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f53652k;

    /* renamed from: l, reason: collision with root package name */
    public int f53653l;

    public d(d3.g gVar, int i10) {
        d3.g gVar2;
        super(gVar);
        ArrayList arrayList = new ArrayList();
        this.f53652k = arrayList;
        this.f53700f = i10;
        d3.g gVar3 = this.f53696b;
        d3.g previousChainMember = gVar3.getPreviousChainMember(i10);
        while (true) {
            gVar2 = gVar3;
            gVar3 = previousChainMember;
            if (gVar3 == null) {
                break;
            } else {
                previousChainMember = gVar3.getPreviousChainMember(this.f53700f);
            }
        }
        this.f53696b = gVar2;
        arrayList.add(gVar2.getRun(this.f53700f));
        d3.g nextChainMember = gVar2.getNextChainMember(this.f53700f);
        while (nextChainMember != null) {
            arrayList.add(nextChainMember.getRun(this.f53700f));
            nextChainMember = nextChainMember.getNextChainMember(this.f53700f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            int i11 = this.f53700f;
            if (i11 == 0) {
                sVar.f53696b.f51773b = this;
            } else if (i11 == 1) {
                sVar.f53696b.f51775c = this;
            }
        }
        if (this.f53700f == 0 && ((d3.h) this.f53696b.getParent()).isRtl() && arrayList.size() > 1) {
            this.f53696b = ((s) o2.e(1, arrayList)).f53696b;
        }
        this.f53653l = this.f53700f == 0 ? this.f53696b.getHorizontalChainStyle() : this.f53696b.getVerticalChainStyle();
    }

    @Override // e3.s
    public void applyToWidget() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f53652k;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i10)).applyToWidget();
            i10++;
        }
    }

    @Override // e3.s
    public final void c() {
        ArrayList arrayList = this.f53652k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((s) it.next()).c();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        d3.g gVar = ((s) arrayList.get(0)).f53696b;
        d3.g gVar2 = ((s) arrayList.get(size - 1)).f53696b;
        int i10 = this.f53700f;
        h hVar = this.f53703i;
        h hVar2 = this.f53702h;
        if (i10 == 0) {
            d3.e eVar = gVar.N;
            d3.e eVar2 = gVar2.P;
            h hVarG = s.g(eVar, 0);
            int margin = eVar.getMargin();
            d3.g gVarJ = j();
            if (gVarJ != null) {
                margin = gVarJ.N.getMargin();
            }
            if (hVarG != null) {
                s.a(hVar2, hVarG, margin);
            }
            h hVarG2 = s.g(eVar2, 0);
            int margin2 = eVar2.getMargin();
            d3.g gVarK = k();
            if (gVarK != null) {
                margin2 = gVarK.P.getMargin();
            }
            if (hVarG2 != null) {
                s.a(hVar, hVarG2, -margin2);
            }
        } else {
            d3.e eVar3 = gVar.O;
            d3.e eVar4 = gVar2.Q;
            h hVarG3 = s.g(eVar3, 1);
            int margin3 = eVar3.getMargin();
            d3.g gVarJ2 = j();
            if (gVarJ2 != null) {
                margin3 = gVarJ2.O.getMargin();
            }
            if (hVarG3 != null) {
                s.a(hVar2, hVarG3, margin3);
            }
            h hVarG4 = s.g(eVar4, 1);
            int margin4 = eVar4.getMargin();
            d3.g gVarK2 = k();
            if (gVarK2 != null) {
                margin4 = gVarK2.Q.getMargin();
            }
            if (hVarG4 != null) {
                s.a(hVar, hVarG4, -margin4);
            }
        }
        hVar2.f53662a = this;
        hVar.f53662a = this;
    }

    @Override // e3.s
    public final void d() {
        this.f53697c = null;
        Iterator it = this.f53652k.iterator();
        while (it.hasNext()) {
            ((s) it.next()).d();
        }
    }

    @Override // e3.s
    public long getWrapDimension() {
        ArrayList arrayList = this.f53652k;
        int size = arrayList.size();
        long wrapDimension = 0;
        for (int i10 = 0; i10 < size; i10++) {
            wrapDimension = r5.f53703i.f53667f + ((s) arrayList.get(i10)).getWrapDimension() + wrapDimension + r5.f53702h.f53667f;
        }
        return wrapDimension;
    }

    @Override // e3.s
    public final boolean h() {
        ArrayList arrayList = this.f53652k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((s) arrayList.get(i10)).h()) {
                return false;
            }
        }
        return true;
    }

    public final d3.g j() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f53652k;
            if (i10 >= arrayList.size()) {
                return null;
            }
            s sVar = (s) arrayList.get(i10);
            if (sVar.f53696b.getVisibility() != 8) {
                return sVar.f53696b;
            }
            i10++;
        }
    }

    public final d3.g k() {
        ArrayList arrayList = this.f53652k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s sVar = (s) arrayList.get(size);
            if (sVar.f53696b.getVisibility() != 8) {
                return sVar.f53696b;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f53700f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f53652k.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            sb2.append("<");
            sb2.append(sVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    @Override // e3.s, e3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void update(e3.e r29) {
        /*
            Method dump skipped, instructions count: 993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.d.update(e3.e):void");
    }
}
