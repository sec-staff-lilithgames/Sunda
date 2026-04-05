package dh;

import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import q.n3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f52250a;

    /* renamed from: b, reason: collision with root package name */
    public int f52251b;

    /* renamed from: c, reason: collision with root package name */
    public Cloneable f52252c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f52253d;

    public p() {
        this.f52253d = new ArrayList();
        this.f52250a = 2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ea.c[], java.lang.Cloneable] */
    public void a(int i10) {
        ea.c cVar;
        ArrayList arrayList = (ArrayList) this.f52253d;
        ea.c[] cVarArr = (ea.c[]) this.f52252c;
        if (cVarArr == null || cVarArr.length != i10) {
            if (cVarArr != null) {
                for (ea.c cVar2 : cVarArr) {
                    arrayList.add(new WeakReference(cVar2));
                }
            }
            this.f52252c = new ea.c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                ea.c[] cVarArr2 = (ea.c[]) this.f52252c;
                if (cVarArr2[i11] == null) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            cVar = new ea.c();
                            break;
                        }
                        cVar = (ea.c) ((WeakReference) it.next()).get();
                        it.remove();
                        if (cVar != null) {
                            break;
                        }
                    }
                    cVarArr2[i11] = cVar;
                }
            }
        }
    }

    public p(q qVar, n3 n3Var) {
        this.f52252c = new SparseArray();
        this.f52253d = qVar;
        this.f52250a = n3Var.getResourceId(28, 0);
        this.f52251b = n3Var.getResourceId(53, 0);
    }
}
