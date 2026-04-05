package e3;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class k {
    public static r findDependents(d3.g gVar, int i10, ArrayList<r> arrayList, r rVar) {
        int iFindGroupInDependents;
        int i11 = i10 == 0 ? gVar.A0 : gVar.B0;
        if (i11 != -1 && (rVar == null || i11 != rVar.getId())) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                r rVar2 = arrayList.get(i12);
                if (rVar2.getId() == i11) {
                    if (rVar != null) {
                        rVar.moveTo(i10, rVar2);
                        arrayList.remove(rVar);
                    }
                    rVar = rVar2;
                } else {
                    i12++;
                }
            }
        } else if (i11 != -1) {
            return rVar;
        }
        if (rVar == null) {
            if ((gVar instanceof d3.m) && (iFindGroupInDependents = ((d3.m) gVar).findGroupInDependents(i10)) != -1) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    r rVar3 = arrayList.get(i13);
                    if (rVar3.getId() == iFindGroupInDependents) {
                        rVar = rVar3;
                        break;
                    }
                    i13++;
                }
            }
            if (rVar == null) {
                rVar = new r(i10);
            }
            arrayList.add(rVar);
        }
        if (rVar.add(gVar)) {
            if (gVar instanceof d3.k) {
                d3.k kVar = (d3.k) gVar;
                kVar.getAnchor().findDependents(kVar.getOrientation() == 0 ? 1 : 0, arrayList, rVar);
            }
            if (i10 == 0) {
                gVar.A0 = rVar.getId();
                gVar.N.findDependents(i10, arrayList, rVar);
                gVar.P.findDependents(i10, arrayList, rVar);
            } else {
                gVar.B0 = rVar.getId();
                gVar.O.findDependents(i10, arrayList, rVar);
                gVar.R.findDependents(i10, arrayList, rVar);
                gVar.Q.findDependents(i10, arrayList, rVar);
            }
            gVar.U.findDependents(i10, arrayList, rVar);
        }
        return rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x0372  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean simpleSolvingPass(d3.h r17, e3.c r18) {
        /*
            Method dump skipped, instructions count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.k.simpleSolvingPass(d3.h, e3.c):boolean");
    }

    public static boolean validInGroup(d3.f fVar, d3.f fVar2, d3.f fVar3, d3.f fVar4) {
        d3.f fVar5 = d3.f.f51769f;
        d3.f fVar6 = d3.f.f51767c;
        d3.f fVar7 = d3.f.f51766b;
        return (fVar3 == fVar7 || fVar3 == fVar6 || (fVar3 == fVar5 && fVar != fVar6)) || (fVar4 == fVar7 || fVar4 == fVar6 || (fVar4 == fVar5 && fVar2 != fVar6));
    }
}
