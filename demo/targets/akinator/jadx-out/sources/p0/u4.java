package p0;

import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class u4 {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f80513a = new long[0];

    public static final int a(ArrayList arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int location$runtime = ((b) arrayList.get(i13)).getLocation$runtime();
            if (location$runtime < 0) {
                location$runtime += i11;
            }
            int iCompare = kotlin.jvm.internal.e0.compare(location$runtime, i10);
            if (iCompare < 0) {
                i12 = i13 + 1;
            } else {
                if (iCompare <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final void access$add(z.j0 j0Var, int i10, int i11) {
        z.k0 k0Var = (z.k0) j0Var.get(i10);
        if (k0Var == null) {
            k0Var = new z.k0(0, 1, null);
            j0Var.set(i10, k0Var);
        }
        k0Var.add(i11);
    }

    public static final void access$addAux(int[] iArr, int i10) {
        int i11 = (i10 * 5) + 1;
        iArr[i11] = iArr[i11] | 268435456;
    }

    public static final int access$auxIndex(int[] iArr, int i10) {
        int i11 = i10 * 5;
        if (i11 >= iArr.length) {
            return iArr.length;
        }
        return Integer.bitCount(iArr[i11 + 1] >> 29) + iArr[i11 + 4];
    }

    public static final b access$find(ArrayList arrayList, int i10, int i11) {
        int iA = a(arrayList, i10, i11);
        if (iA >= 0) {
            return (b) arrayList.get(iA);
        }
        return null;
    }

    public static final int access$groupSize(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 3];
    }

    public static final void access$initGroup(int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12, int i12, int i13) {
        int i14 = i10 * 5;
        iArr[i14] = i11;
        iArr[i14 + 1] = ((z10 ? 1 : 0) << 30) | ((z11 ? 1 : 0) << 29) | ((z12 ? 1 : 0) << 28);
        iArr[i14 + 2] = i12;
        iArr[i14 + 3] = 0;
        iArr[i14 + 4] = i13;
    }

    public static final int access$locationOf(ArrayList arrayList, int i10, int i11) {
        int iA = a(arrayList, i10, i11);
        return iA >= 0 ? iA : -(iA + 1);
    }

    public static final List access$nodeCounts(int[] iArr, int i10) {
        ArrayList arrayListB = b(iArr, qv.v.step(qv.v.until(1, i10), 5));
        ArrayList arrayList = new ArrayList(arrayListB.size());
        int size = arrayListB.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(Integer.valueOf(((Number) arrayListB.get(i11)).intValue() & 67108863));
        }
        return arrayList;
    }

    public static final int access$objectKeyIndex(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return Integer.bitCount(iArr[i11 + 1] >> 30) + iArr[i11 + 4];
    }

    public static final int access$slotAnchor(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return Integer.bitCount(iArr[i11 + 1] >> 28) + iArr[i11 + 4];
    }

    public static final String access$summarize(String str, int i10) {
        String strReplace$default = sv.k0.replace$default(sv.k0.replace$default(sv.k0.replace$default(sv.k0.replace$default(sv.k0.replace$default(sv.k0.replace$default(sv.k0.replace$default(sv.k0.replace$default(sv.k0.replace$default(sv.k0.replace$default(str, "androidx.", "a.", false, 4, (Object) null), "compose.", "c.", false, 4, (Object) null), "runtime.", "r.", false, 4, (Object) null), "internal.", "ι.", false, 4, (Object) null), "ui.", "u.", false, 4, (Object) null), "Modifier", "μ", false, 4, (Object) null), "material.", "m.", false, 4, (Object) null), "Function", "λ", false, 4, (Object) null), "OpaqueKey", "κ", false, 4, (Object) null), QFzuMMDfrzagDN.EnxYg, "σ", false, 4, (Object) null);
        String strSubstring = strReplace$default.substring(0, Math.min(i10, strReplace$default.length()));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void access$updateContainsMark(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        iArr[i11] = ((z10 ? 1 : 0) << 26) | (iArr[i11] & (-67108865));
    }

    public static final void access$updateGroupKey(int[] iArr, int i10, int i11) {
        iArr[i10 * 5] = i11;
    }

    public static final void access$updateGroupSize(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 3] = i11;
    }

    public static final void access$updateMark(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        iArr[i11] = ((z10 ? 1 : 0) << 27) | (iArr[i11] & (-134217729));
    }

    public static final void access$updateNodeCount(int[] iArr, int i10, int i11) {
        if (i11 >= 0) {
        }
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & (-67108864));
    }

    public static final ArrayList b(int[] iArr, qv.k kVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = kVar.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[((Number) it.next()).intValue()]));
        }
        return arrayList;
    }

    public static final d1.i compositionGroupOf(s4 s4Var, int i10) {
        return new t4(s4Var, i10, s4Var.getVersion$runtime());
    }

    public static final void throwConcurrentModificationException() {
        throw new ConcurrentModificationException();
    }
}
