package tn;

import android.util.SparseArray;
import io.bidmachine.media3.common.util.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f87320a = new SparseArray();

    public u0 getAdjuster(int i10) {
        SparseArray sparseArray = this.f87320a;
        u0 u0Var = (u0) sparseArray.get(i10);
        if (u0Var != null) {
            return u0Var;
        }
        u0 u0Var2 = new u0(9223372036854775806L);
        sparseArray.put(i10, u0Var2);
        return u0Var2;
    }

    public void reset() {
        this.f87320a.clear();
    }
}
