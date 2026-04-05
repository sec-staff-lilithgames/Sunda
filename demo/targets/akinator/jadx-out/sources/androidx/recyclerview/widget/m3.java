package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public final z.t1 f7196a = new z.t1();

    /* renamed from: b, reason: collision with root package name */
    public final z.x f7197b = new z.x();

    public final void a(RecyclerView.n nVar, RecyclerView.d.a aVar) {
        z.t1 t1Var = this.f7196a;
        k3 k3VarA = (k3) t1Var.get(nVar);
        if (k3VarA == null) {
            k3VarA = k3.a();
            t1Var.put(nVar, k3VarA);
        }
        k3VarA.f7171c = aVar;
        k3VarA.f7169a |= 8;
    }

    public final RecyclerView.d.a b(RecyclerView.n nVar, int i10) {
        k3 k3Var;
        RecyclerView.d.a aVar;
        z.t1 t1Var = this.f7196a;
        int iIndexOfKey = t1Var.indexOfKey(nVar);
        if (iIndexOfKey >= 0 && (k3Var = (k3) t1Var.valueAt(iIndexOfKey)) != null) {
            int i11 = k3Var.f7169a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                k3Var.f7169a = i12;
                if (i10 == 4) {
                    aVar = k3Var.f7170b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    aVar = k3Var.f7171c;
                }
                if ((i12 & 12) == 0) {
                    t1Var.removeAt(iIndexOfKey);
                    k3Var.f7169a = 0;
                    k3Var.f7170b = null;
                    k3Var.f7171c = null;
                    k3.f7168d.release(k3Var);
                }
                return aVar;
            }
        }
        return null;
    }

    public final void c(RecyclerView.n nVar) {
        k3 k3Var = (k3) this.f7196a.get(nVar);
        if (k3Var == null) {
            return;
        }
        k3Var.f7169a &= -2;
    }

    public final void d(RecyclerView.n nVar) {
        z.x xVar = this.f7197b;
        int size = xVar.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (nVar == xVar.valueAt(size)) {
                xVar.removeAt(size);
                break;
            }
            size--;
        }
        k3 k3Var = (k3) this.f7196a.remove(nVar);
        if (k3Var != null) {
            k3Var.f7169a = 0;
            k3Var.f7170b = null;
            k3Var.f7171c = null;
            k3.f7168d.release(k3Var);
        }
    }

    public void onViewDetached(RecyclerView.n nVar) {
        c(nVar);
    }
}
