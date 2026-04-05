package fo;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import ao.b2;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.C3227g4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import fo.e;
import gn.a2;
import io.bidmachine.media3.common.util.a1;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import rh.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g extends a2 {
    public static final g F0 = new f().build();
    public static final String G0 = a1.intToStringMaxRadix(1000);
    public static final String H0 = a1.intToStringMaxRadix(1001);
    public static final String I0 = a1.intToStringMaxRadix(1002);
    public static final String J0 = a1.intToStringMaxRadix(IronSourceError.AUCTION_ERROR_DECRYPTION);
    public static final String K0 = a1.intToStringMaxRadix(1004);
    public static final String L0 = a1.intToStringMaxRadix(1005);
    public static final String M0 = a1.intToStringMaxRadix(1006);
    public static final String N0 = a1.intToStringMaxRadix(1007);
    public static final String O0 = a1.intToStringMaxRadix(1008);
    public static final String P0 = a1.intToStringMaxRadix(1009);
    public static final String Q0 = a1.intToStringMaxRadix(1010);
    public static final String R0 = a1.intToStringMaxRadix(1011);
    public static final String S0 = a1.intToStringMaxRadix(TTAdConstant.IMAGE_MODE_1012);
    public static final String T0 = a1.intToStringMaxRadix(C3227g4.f36755i);
    public static final String U0 = a1.intToStringMaxRadix(C3227g4.f36756j);
    public static final String V0 = a1.intToStringMaxRadix(1015);
    public static final String W0 = a1.intToStringMaxRadix(C3227g4.f36758l);
    public static final String X0 = a1.intToStringMaxRadix(1017);
    public static final String Y0 = a1.intToStringMaxRadix(1018);
    public final boolean A0;
    public final boolean B0;
    public final boolean C0;
    public final SparseArray D0;
    public final SparseBooleanArray E0;

    /* renamed from: o0, reason: collision with root package name */
    public final boolean f55895o0;

    /* renamed from: p0, reason: collision with root package name */
    public final boolean f55896p0;

    /* renamed from: q0, reason: collision with root package name */
    public final boolean f55897q0;

    /* renamed from: r0, reason: collision with root package name */
    public final boolean f55898r0;

    /* renamed from: s0, reason: collision with root package name */
    public final boolean f55899s0;

    /* renamed from: t0, reason: collision with root package name */
    public final boolean f55900t0;

    /* renamed from: u0, reason: collision with root package name */
    public final boolean f55901u0;

    /* renamed from: v0, reason: collision with root package name */
    public final boolean f55902v0;

    /* renamed from: w0, reason: collision with root package name */
    public final boolean f55903w0;

    /* renamed from: x0, reason: collision with root package name */
    public final boolean f55904x0;

    /* renamed from: y0, reason: collision with root package name */
    public final boolean f55905y0;

    /* renamed from: z0, reason: collision with root package name */
    public final boolean f55906z0;

    public g(f fVar) {
        super(fVar);
        this.f55895o0 = fVar.F;
        this.f55896p0 = fVar.G;
        this.f55897q0 = fVar.H;
        this.f55898r0 = fVar.I;
        this.f55899s0 = fVar.J;
        this.f55900t0 = fVar.K;
        this.f55901u0 = fVar.L;
        this.f55902v0 = fVar.M;
        this.f55903w0 = fVar.N;
        this.f55904x0 = fVar.O;
        this.f55905y0 = fVar.P;
        this.f55906z0 = fVar.Q;
        this.A0 = fVar.R;
        this.B0 = fVar.S;
        this.C0 = fVar.T;
        this.D0 = fVar.U;
        this.E0 = fVar.V;
    }

    public static g fromBundle(Bundle bundle) {
        return new f(bundle).build();
    }

    @Deprecated
    public static g getDefaults(Context context) {
        return F0;
    }

    @Override // gn.a2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (super.equals(gVar) && this.f55895o0 == gVar.f55895o0 && this.f55896p0 == gVar.f55896p0 && this.f55897q0 == gVar.f55897q0 && this.f55898r0 == gVar.f55898r0 && this.f55899s0 == gVar.f55899s0 && this.f55900t0 == gVar.f55900t0 && this.f55901u0 == gVar.f55901u0 && this.f55902v0 == gVar.f55902v0 && this.f55903w0 == gVar.f55903w0 && this.f55904x0 == gVar.f55904x0 && this.f55905y0 == gVar.f55905y0 && this.f55906z0 == gVar.f55906z0 && this.A0 == gVar.A0 && this.B0 == gVar.B0 && this.C0 == gVar.C0) {
                SparseBooleanArray sparseBooleanArray = gVar.E0;
                SparseBooleanArray sparseBooleanArray2 = this.E0;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            SparseArray sparseArray = gVar.D0;
                            SparseArray sparseArray2 = this.D0;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i11 = 0; i11 < size2; i11++) {
                                    int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i11));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i11);
                                        Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                b2 b2Var = (b2) entry.getKey();
                                                if (!map2.containsKey(b2Var) || !Objects.equals(entry.getValue(), map2.get(b2Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i10)) < 0) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean getRendererDisabled(int i10) {
        return this.E0.get(i10);
    }

    @Deprecated
    public e.C0566e getSelectionOverride(int i10, b2 b2Var) {
        Map map = (Map) this.D0.get(i10);
        if (map != null) {
            return (e.C0566e) map.get(b2Var);
        }
        return null;
    }

    @Deprecated
    public boolean hasSelectionOverride(int i10, b2 b2Var) {
        Map map = (Map) this.D0.get(i10);
        return map != null && map.containsKey(b2Var);
    }

    @Override // gn.a2
    public int hashCode() {
        return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f55895o0 ? 1 : 0)) * 31) + (this.f55896p0 ? 1 : 0)) * 31) + (this.f55897q0 ? 1 : 0)) * 31) + (this.f55898r0 ? 1 : 0)) * 31) + (this.f55899s0 ? 1 : 0)) * 31) + (this.f55900t0 ? 1 : 0)) * 31) + (this.f55901u0 ? 1 : 0)) * 31) + (this.f55902v0 ? 1 : 0)) * 31) + (this.f55903w0 ? 1 : 0)) * 31) + (this.f55904x0 ? 1 : 0)) * 31) + (this.f55905y0 ? 1 : 0)) * 31) + (this.f55906z0 ? 1 : 0)) * 31) + (this.A0 ? 1 : 0)) * 31) + (this.B0 ? 1 : 0)) * 31) + (this.C0 ? 1 : 0);
    }

    @Override // gn.a2
    public Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putBoolean(G0, this.f55895o0);
        bundle.putBoolean(H0, this.f55896p0);
        bundle.putBoolean(I0, this.f55897q0);
        bundle.putBoolean(U0, this.f55898r0);
        bundle.putBoolean(J0, this.f55899s0);
        bundle.putBoolean(K0, this.f55900t0);
        bundle.putBoolean(L0, this.f55901u0);
        bundle.putBoolean(M0, this.f55902v0);
        bundle.putBoolean(V0, this.f55903w0);
        bundle.putBoolean(Y0, this.f55904x0);
        bundle.putBoolean(W0, this.f55905y0);
        bundle.putBoolean(N0, this.f55906z0);
        bundle.putBoolean(O0, this.A0);
        bundle.putBoolean(P0, this.B0);
        bundle.putBoolean(X0, this.C0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray2 = this.D0;
            if (i10 >= sparseArray2.size()) {
                break;
            }
            int iKeyAt = sparseArray2.keyAt(i10);
            for (Map.Entry entry : ((Map) sparseArray2.valueAt(i10)).entrySet()) {
                e.C0566e c0566e = (e.C0566e) entry.getValue();
                if (c0566e != null) {
                    sparseArray.put(arrayList2.size(), c0566e);
                }
                arrayList2.add((b2) entry.getKey());
                arrayList.add(Integer.valueOf(iKeyAt));
            }
            bundle.putIntArray(Q0, w.toArray(arrayList));
            bundle.putParcelableArrayList(R0, io.bidmachine.media3.common.util.f.toBundleArrayList(arrayList2, new ao.c(10)));
            bundle.putSparseParcelableArray(S0, io.bidmachine.media3.common.util.f.toBundleSparseArray(sparseArray, new ao.c(11)));
            i10++;
        }
        SparseBooleanArray sparseBooleanArray = this.E0;
        int[] iArr = new int[sparseBooleanArray.size()];
        for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
            iArr[i11] = sparseBooleanArray.keyAt(i11);
        }
        bundle.putIntArray(T0, iArr);
        return bundle;
    }

    @Override // gn.a2
    public f buildUpon() {
        return new f(this);
    }
}
