package x2;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class l extends c {

    /* renamed from: f, reason: collision with root package name */
    public n[] f91508f;

    /* renamed from: g, reason: collision with root package name */
    public n[] f91509g;

    /* renamed from: h, reason: collision with root package name */
    public int f91510h;

    /* renamed from: i, reason: collision with root package name */
    public final k f91511i;

    public l(d dVar) {
        super(dVar);
        this.f91508f = new n[128];
        this.f91509g = new n[128];
        this.f91510h = 0;
        this.f91511i = new k(this);
    }

    @Override // x2.c, x2.e
    public void addError(n nVar) {
        k kVar = this.f91511i;
        kVar.init(nVar);
        kVar.reset();
        nVar.f91525k[nVar.f91521g] = 1.0f;
        d(nVar);
    }

    @Override // x2.c, x2.e
    public void clear() {
        this.f91510h = 0;
        this.f91470b = 0.0f;
    }

    public final void d(n nVar) {
        int i10;
        int i11 = this.f91510h + 1;
        n[] nVarArr = this.f91508f;
        if (i11 > nVarArr.length) {
            n[] nVarArr2 = (n[]) Arrays.copyOf(nVarArr, nVarArr.length * 2);
            this.f91508f = nVarArr2;
            this.f91509g = (n[]) Arrays.copyOf(nVarArr2, nVarArr2.length * 2);
        }
        n[] nVarArr3 = this.f91508f;
        int i12 = this.f91510h;
        nVarArr3[i12] = nVar;
        int i13 = i12 + 1;
        this.f91510h = i13;
        if (i13 > 1 && nVarArr3[i12].f91519e > nVar.f91519e) {
            int i14 = 0;
            while (true) {
                i10 = this.f91510h;
                if (i14 >= i10) {
                    break;
                }
                this.f91509g[i14] = this.f91508f[i14];
                i14++;
            }
            Arrays.sort(this.f91509g, 0, i10, new j());
            for (int i15 = 0; i15 < this.f91510h; i15++) {
                this.f91508f[i15] = this.f91509g[i15];
            }
        }
        nVar.f91517b = true;
        nVar.addToRow(this);
    }

    public final void e(n nVar) {
        int i10 = 0;
        while (i10 < this.f91510h) {
            if (this.f91508f[i10] == nVar) {
                while (true) {
                    int i11 = this.f91510h;
                    if (i10 >= i11 - 1) {
                        this.f91510h = i11 - 1;
                        nVar.f91517b = false;
                        return;
                    } else {
                        n[] nVarArr = this.f91508f;
                        int i12 = i10 + 1;
                        nVarArr[i10] = nVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    @Override // x2.c, x2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x2.n getPivotCandidate(x2.f r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.f91510h
            if (r0 >= r2) goto L2e
            x2.n[] r2 = r4.f91508f
            r2 = r2[r0]
            int r3 = r2.f91519e
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2b
        L12:
            x2.k r3 = r4.f91511i
            r3.init(r2)
            if (r1 != r5) goto L20
            boolean r2 = r3.isNegative()
            if (r2 == 0) goto L2b
            goto L2a
        L20:
            x2.n[] r2 = r4.f91508f
            r2 = r2[r1]
            boolean r2 = r3.isSmallerThan(r2)
            if (r2 == 0) goto L2b
        L2a:
            r1 = r0
        L2b:
            int r0 = r0 + 1
            goto L3
        L2e:
            if (r1 != r5) goto L32
            r5 = 0
            return r5
        L32:
            x2.n[] r5 = r4.f91508f
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.l.getPivotCandidate(x2.f, boolean[]):x2.n");
    }

    @Override // x2.c, x2.e
    public boolean isEmpty() {
        return this.f91510h == 0;
    }

    @Override // x2.c
    public String toString() {
        String str = " goal -> (" + this.f91470b + ") : ";
        for (int i10 = 0; i10 < this.f91510h; i10++) {
            n nVar = this.f91508f[i10];
            k kVar = this.f91511i;
            kVar.init(nVar);
            str = str + kVar + " ";
        }
        return str;
    }

    @Override // x2.c, x2.e
    public void updateFromRow(f fVar, c cVar, boolean z10) {
        n nVar = cVar.f91469a;
        if (nVar == null) {
            return;
        }
        b bVar = cVar.f91472d;
        int currentSize = bVar.getCurrentSize();
        for (int i10 = 0; i10 < currentSize; i10++) {
            n variable = bVar.getVariable(i10);
            float variableValue = bVar.getVariableValue(i10);
            k kVar = this.f91511i;
            kVar.init(variable);
            if (kVar.addToGoal(nVar, variableValue)) {
                d(variable);
            }
            this.f91470b = (cVar.f91470b * variableValue) + this.f91470b;
        }
        e(nVar);
    }
}
