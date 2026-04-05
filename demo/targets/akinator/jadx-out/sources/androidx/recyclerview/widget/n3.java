package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n3 implements p3 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseIntArray f7201a = new SparseIntArray(1);

    /* renamed from: b, reason: collision with root package name */
    public final SparseIntArray f7202b = new SparseIntArray(1);

    /* renamed from: c, reason: collision with root package name */
    public final j1 f7203c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o3 f7204d;

    public n3(o3 o3Var, j1 j1Var) {
        this.f7204d = o3Var;
        this.f7203c = j1Var;
    }

    @Override // androidx.recyclerview.widget.p3
    public void dispose() {
        SparseArray sparseArray = this.f7204d.f7209a;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            if (((j1) sparseArray.valueAt(size)) == this.f7203c) {
                sparseArray.removeAt(size);
            }
        }
    }

    @Override // androidx.recyclerview.widget.p3
    public int globalToLocal(int i10) {
        SparseIntArray sparseIntArray = this.f7202b;
        int iIndexOfKey = sparseIntArray.indexOfKey(i10);
        if (iIndexOfKey >= 0) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        StringBuilder sbT = p0.o2.t(i10, "requested global type ", " does not belong to the adapter:");
        sbT.append(this.f7203c.f7154c);
        throw new IllegalStateException(sbT.toString());
    }

    @Override // androidx.recyclerview.widget.p3
    public int localToGlobal(int i10) {
        SparseIntArray sparseIntArray = this.f7201a;
        int iIndexOfKey = sparseIntArray.indexOfKey(i10);
        if (iIndexOfKey > -1) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        o3 o3Var = this.f7204d;
        int i11 = o3Var.f7210b;
        o3Var.f7210b = i11 + 1;
        o3Var.f7209a.put(i11, this.f7203c);
        sparseIntArray.put(i10, i11);
        this.f7202b.put(i11, i10);
        return i11;
    }
}
