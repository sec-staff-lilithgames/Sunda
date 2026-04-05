package rh;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final n f84381b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n[] f84382c;

    static {
        n nVar = new n("INSTANCE", 0);
        f84381b = nVar;
        f84382c = new n[]{nVar};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f84382c.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Floats.lexicographicalComparator()";
    }

    @Override // java.util.Comparator
    public int compare(float[] fArr, float[] fArr2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iCompare = Float.compare(fArr[i10], fArr2[i10]);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return fArr.length - fArr2.length;
    }
}
