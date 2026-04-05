package pf;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.exoplayer2.util.n1;
import com.ironsource.C3227g4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Map;
import pf.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e extends s {

    /* renamed from: d0, reason: collision with root package name */
    public final boolean f81098d0;

    /* renamed from: e0, reason: collision with root package name */
    public final boolean f81099e0;

    /* renamed from: f0, reason: collision with root package name */
    public final boolean f81100f0;

    /* renamed from: g0, reason: collision with root package name */
    public final boolean f81101g0;

    /* renamed from: h0, reason: collision with root package name */
    public final boolean f81102h0;

    /* renamed from: i0, reason: collision with root package name */
    public final boolean f81103i0;

    /* renamed from: j0, reason: collision with root package name */
    public final boolean f81104j0;

    /* renamed from: k0, reason: collision with root package name */
    public final boolean f81105k0;

    /* renamed from: l0, reason: collision with root package name */
    public final boolean f81106l0;

    /* renamed from: m0, reason: collision with root package name */
    public final boolean f81107m0;

    /* renamed from: n0, reason: collision with root package name */
    public final boolean f81108n0;

    /* renamed from: o0, reason: collision with root package name */
    public final boolean f81109o0;

    /* renamed from: p0, reason: collision with root package name */
    public final boolean f81110p0;

    /* renamed from: q0, reason: collision with root package name */
    public final boolean f81111q0;

    /* renamed from: r0, reason: collision with root package name */
    public final SparseArray f81112r0;

    /* renamed from: s0, reason: collision with root package name */
    public final SparseBooleanArray f81113s0;

    /* renamed from: t0, reason: collision with root package name */
    public static final e f81091t0 = new d().build();

    /* renamed from: u0, reason: collision with root package name */
    public static final String f81092u0 = n1.intToStringMaxRadix(1000);

    /* renamed from: v0, reason: collision with root package name */
    public static final String f81093v0 = n1.intToStringMaxRadix(1001);

    /* renamed from: w0, reason: collision with root package name */
    public static final String f81094w0 = n1.intToStringMaxRadix(1002);

    /* renamed from: x0, reason: collision with root package name */
    public static final String f81095x0 = n1.intToStringMaxRadix(IronSourceError.AUCTION_ERROR_DECRYPTION);

    /* renamed from: y0, reason: collision with root package name */
    public static final String f81096y0 = n1.intToStringMaxRadix(1004);

    /* renamed from: z0, reason: collision with root package name */
    public static final String f81097z0 = n1.intToStringMaxRadix(1005);
    public static final String A0 = n1.intToStringMaxRadix(1006);
    public static final String B0 = n1.intToStringMaxRadix(1007);
    public static final String C0 = n1.intToStringMaxRadix(1008);
    public static final String D0 = n1.intToStringMaxRadix(1009);
    public static final String E0 = n1.intToStringMaxRadix(1010);
    public static final String F0 = n1.intToStringMaxRadix(1011);
    public static final String G0 = n1.intToStringMaxRadix(TTAdConstant.IMAGE_MODE_1012);
    public static final String H0 = n1.intToStringMaxRadix(C3227g4.f36755i);
    public static final String I0 = n1.intToStringMaxRadix(C3227g4.f36756j);
    public static final String J0 = n1.intToStringMaxRadix(1015);
    public static final String K0 = n1.intToStringMaxRadix(C3227g4.f36758l);
    public static final String L0 = n1.intToStringMaxRadix(1017);

    public e(d dVar) {
        super(dVar);
        this.f81098d0 = dVar.A;
        this.f81099e0 = dVar.B;
        this.f81100f0 = dVar.C;
        this.f81101g0 = dVar.D;
        this.f81102h0 = dVar.E;
        this.f81103i0 = dVar.F;
        this.f81104j0 = dVar.G;
        this.f81105k0 = dVar.H;
        this.f81106l0 = dVar.I;
        this.f81107m0 = dVar.J;
        this.f81108n0 = dVar.K;
        this.f81109o0 = dVar.L;
        this.f81110p0 = dVar.M;
        this.f81111q0 = dVar.N;
        this.f81112r0 = dVar.O;
        this.f81113s0 = dVar.P;
    }

    public static e getDefaults(Context context) {
        return new d(context).build();
    }

    @Override // pf.s
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (super.equals(eVar) && this.f81098d0 == eVar.f81098d0 && this.f81099e0 == eVar.f81099e0 && this.f81100f0 == eVar.f81100f0 && this.f81101g0 == eVar.f81101g0 && this.f81102h0 == eVar.f81102h0 && this.f81103i0 == eVar.f81103i0 && this.f81104j0 == eVar.f81104j0 && this.f81105k0 == eVar.f81105k0 && this.f81106l0 == eVar.f81106l0 && this.f81107m0 == eVar.f81107m0 && this.f81108n0 == eVar.f81108n0 && this.f81109o0 == eVar.f81109o0 && this.f81110p0 == eVar.f81110p0 && this.f81111q0 == eVar.f81111q0) {
                SparseBooleanArray sparseBooleanArray = eVar.f81113s0;
                SparseBooleanArray sparseBooleanArray2 = this.f81113s0;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            SparseArray sparseArray = eVar.f81112r0;
                            SparseArray sparseArray2 = this.f81112r0;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i11 = 0; i11 < size2; i11++) {
                                    int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i11));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i11);
                                        Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                bf.n1 n1Var = (bf.n1) entry.getKey();
                                                if (!map2.containsKey(n1Var) || !n1.areEqual(entry.getValue(), map2.get(n1Var))) {
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
        return this.f81113s0.get(i10);
    }

    @Deprecated
    public c.d getSelectionOverride(int i10, bf.n1 n1Var) {
        Map map = (Map) this.f81112r0.get(i10);
        if (map != null) {
            return (c.d) map.get(n1Var);
        }
        return null;
    }

    @Deprecated
    public boolean hasSelectionOverride(int i10, bf.n1 n1Var) {
        Map map = (Map) this.f81112r0.get(i10);
        return map != null && map.containsKey(n1Var);
    }

    @Override // pf.s
    public int hashCode() {
        return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f81098d0 ? 1 : 0)) * 31) + (this.f81099e0 ? 1 : 0)) * 31) + (this.f81100f0 ? 1 : 0)) * 31) + (this.f81101g0 ? 1 : 0)) * 31) + (this.f81102h0 ? 1 : 0)) * 31) + (this.f81103i0 ? 1 : 0)) * 31) + (this.f81104j0 ? 1 : 0)) * 31) + (this.f81105k0 ? 1 : 0)) * 31) + (this.f81106l0 ? 1 : 0)) * 31) + (this.f81107m0 ? 1 : 0)) * 31) + (this.f81108n0 ? 1 : 0)) * 31) + (this.f81109o0 ? 1 : 0)) * 31) + (this.f81110p0 ? 1 : 0)) * 31) + (this.f81111q0 ? 1 : 0);
    }

    @Override // pf.s, com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putBoolean(f81092u0, this.f81098d0);
        bundle.putBoolean(f81093v0, this.f81099e0);
        bundle.putBoolean(f81094w0, this.f81100f0);
        bundle.putBoolean(I0, this.f81101g0);
        bundle.putBoolean(f81095x0, this.f81102h0);
        bundle.putBoolean(f81096y0, this.f81103i0);
        bundle.putBoolean(f81097z0, this.f81104j0);
        bundle.putBoolean(A0, this.f81105k0);
        bundle.putBoolean(J0, this.f81106l0);
        bundle.putBoolean(K0, this.f81107m0);
        bundle.putBoolean(B0, this.f81108n0);
        bundle.putBoolean(C0, this.f81109o0);
        bundle.putBoolean(D0, this.f81110p0);
        bundle.putBoolean(L0, this.f81111q0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f81112r0;
            if (i10 >= sparseArray2.size()) {
                break;
            }
            int iKeyAt = sparseArray2.keyAt(i10);
            for (Map.Entry entry : ((Map) sparseArray2.valueAt(i10)).entrySet()) {
                c.d dVar = (c.d) entry.getValue();
                if (dVar != null) {
                    sparseArray.put(arrayList2.size(), dVar);
                }
                arrayList2.add((bf.n1) entry.getKey());
                arrayList.add(Integer.valueOf(iKeyAt));
            }
            bundle.putIntArray(E0, rh.w.toArray(arrayList));
            bundle.putParcelableArrayList(F0, com.google.android.exoplayer2.util.c.toBundleArrayList(arrayList2));
            bundle.putSparseParcelableArray(G0, com.google.android.exoplayer2.util.c.toBundleSparseArray(sparseArray));
            i10++;
        }
        SparseBooleanArray sparseBooleanArray = this.f81113s0;
        int[] iArr = new int[sparseBooleanArray.size()];
        for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
            iArr[i11] = sparseBooleanArray.keyAt(i11);
        }
        bundle.putIntArray(H0, iArr);
        return bundle;
    }

    @Override // pf.s
    public d buildUpon() {
        return new d(this);
    }
}
