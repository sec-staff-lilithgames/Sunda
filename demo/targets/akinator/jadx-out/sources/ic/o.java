package ic;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o extends n {

    /* renamed from: g, reason: collision with root package name */
    public final ub.u[] f59517g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f59518h;

    /* renamed from: i, reason: collision with root package name */
    public int f59519i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f59520j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z10, ub.u[] uVarArr) {
        super(uVarArr[0]);
        boolean z11 = false;
        this.f59518h = z10;
        if (z10 && this.f59516f.hasCurrentToken()) {
            z11 = true;
        }
        this.f59520j = z11;
        this.f59517g = uVarArr;
        this.f59519i = 1;
    }

    public static o createFlattened(boolean z10, ub.u uVar, ub.u uVar2) {
        boolean z11 = uVar instanceof o;
        if (!z11 && !(uVar2 instanceof o)) {
            return new o(z10, new ub.u[]{uVar, uVar2});
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            ((o) uVar).i(arrayList);
        } else {
            arrayList.add(uVar);
        }
        if (uVar2 instanceof o) {
            ((o) uVar2).i(arrayList);
        } else {
            arrayList.add(uVar2);
        }
        return new o(z10, (ub.u[]) arrayList.toArray(new ub.u[arrayList.size()]));
    }

    @Override // ic.n, ub.u, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        while (true) {
            this.f59516f.close();
            int i10 = this.f59519i;
            ub.u[] uVarArr = this.f59517g;
            if (i10 >= uVarArr.length) {
                return;
            }
            this.f59519i = i10 + 1;
            this.f59516f = uVarArr[i10];
        }
    }

    public int containedParsersCount() {
        return this.f59517g.length;
    }

    public final void i(ArrayList arrayList) {
        ub.u[] uVarArr = this.f59517g;
        int length = uVarArr.length;
        for (int i10 = this.f59519i - 1; i10 < length; i10++) {
            ub.u uVar = uVarArr[i10];
            if (uVar instanceof o) {
                ((o) uVar).i(arrayList);
            } else {
                arrayList.add(uVar);
            }
        }
    }

    @Override // ic.n, ub.u
    public ub.z nextToken() throws IOException {
        ub.z zVarNextToken;
        ub.u uVar = this.f59516f;
        if (uVar == null) {
            return null;
        }
        if (this.f59520j) {
            this.f59520j = false;
            return uVar.currentToken();
        }
        ub.z zVarNextToken2 = uVar.nextToken();
        if (zVarNextToken2 != null) {
            return zVarNextToken2;
        }
        do {
            int i10 = this.f59519i;
            ub.u[] uVarArr = this.f59517g;
            if (i10 >= uVarArr.length) {
                return null;
            }
            this.f59519i = i10 + 1;
            ub.u uVar2 = uVarArr[i10];
            this.f59516f = uVar2;
            if (this.f59518h && uVar2.hasCurrentToken()) {
                return this.f59516f.getCurrentToken();
            }
            zVarNextToken = this.f59516f.nextToken();
        } while (zVarNextToken == null);
        return zVarNextToken;
    }

    @Override // ic.n, ub.u
    public ub.u skipChildren() throws IOException {
        if (this.f59516f.currentToken() == ub.z.START_OBJECT || this.f59516f.currentToken() == ub.z.START_ARRAY) {
            int i10 = 1;
            while (true) {
                ub.z zVarNextToken = nextToken();
                if (zVarNextToken == null) {
                    break;
                }
                if (!zVarNextToken.isStructStart()) {
                    if (zVarNextToken.isStructEnd() && i10 - 1 == 0) {
                        break;
                    }
                } else {
                    i10++;
                }
            }
        }
        return this;
    }

    @Deprecated
    public static o createFlattened(ub.u uVar, ub.u uVar2) {
        return createFlattened(false, uVar, uVar2);
    }
}
