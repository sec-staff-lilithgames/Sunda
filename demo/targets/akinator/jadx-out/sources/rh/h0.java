package rh;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h0 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f84368b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h0[] f84369c;

    static {
        h0 h0Var = new h0("INSTANCE", 0);
        f84368b = h0Var;
        f84369c = new h0[]{h0Var};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f84369c.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "UnsignedLongs.lexicographicalComparator()";
    }

    @Override // java.util.Comparator
    public int compare(long[] jArr, long[] jArr2) {
        int iMin = Math.min(jArr.length, jArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            long j10 = jArr[i10];
            long j11 = jArr2[i10];
            if (j10 != j11) {
                return j0.compare(j10, j11);
            }
        }
        return jArr.length - jArr2.length;
    }
}
