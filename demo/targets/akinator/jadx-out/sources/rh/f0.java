package rh;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f0 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f84363b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f0[] f84364c;

    static {
        f0 f0Var = new f0("INSTANCE", 0);
        f84363b = f0Var;
        f84364c = new f0[]{f0Var};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f84364c.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "UnsignedInts.lexicographicalComparator()";
    }

    @Override // java.util.Comparator
    public int compare(int[] iArr, int[] iArr2) {
        int iMin = Math.min(iArr.length, iArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = iArr[i10];
            int i12 = iArr2[i10];
            if (i11 != i12) {
                return g0.compare(i11, i12);
            }
        }
        return iArr.length - iArr2.length;
    }
}
