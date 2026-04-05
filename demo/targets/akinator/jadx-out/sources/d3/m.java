package d3;

import e3.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class m extends g implements l {
    public g[] C0 = new g[4];
    public int D0 = 0;

    @Override // d3.l
    public void add(g gVar) {
        if (gVar == this || gVar == null) {
            return;
        }
        int i10 = this.D0 + 1;
        g[] gVarArr = this.C0;
        if (i10 > gVarArr.length) {
            this.C0 = (g[]) Arrays.copyOf(gVarArr, gVarArr.length * 2);
        }
        g[] gVarArr2 = this.C0;
        int i11 = this.D0;
        gVarArr2[i11] = gVar;
        this.D0 = i11 + 1;
    }

    public void addDependents(ArrayList<r> arrayList, int i10, r rVar) {
        for (int i11 = 0; i11 < this.D0; i11++) {
            rVar.add(this.C0[i11]);
        }
        for (int i12 = 0; i12 < this.D0; i12++) {
            e3.k.findDependents(this.C0[i12], i10, arrayList, rVar);
        }
    }

    @Override // d3.g
    public void copy(g gVar, HashMap<g, g> map) {
        super.copy(gVar, map);
        m mVar = (m) gVar;
        this.D0 = 0;
        int i10 = mVar.D0;
        for (int i11 = 0; i11 < i10; i11++) {
            add(map.get(mVar.C0[i11]));
        }
    }

    public int findGroupInDependents(int i10) {
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.D0; i13++) {
            g gVar = this.C0[i13];
            if (i10 == 0 && (i12 = gVar.A0) != -1) {
                return i12;
            }
            if (i10 == 1 && (i11 = gVar.B0) != -1) {
                return i11;
            }
        }
        return -1;
    }

    @Override // d3.l
    public void removeAllIds() {
        this.D0 = 0;
        Arrays.fill(this.C0, (Object) null);
    }

    @Override // d3.l
    public void updateConstraints(h hVar) {
    }
}
