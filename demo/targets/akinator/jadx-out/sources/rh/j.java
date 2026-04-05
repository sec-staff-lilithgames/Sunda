package rh;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final j f84374b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j[] f84375c;

    static {
        j jVar = new j("INSTANCE", 0);
        f84374b = jVar;
        f84375c = new j[]{jVar};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f84375c.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Doubles.lexicographicalComparator()";
    }

    @Override // java.util.Comparator
    public int compare(double[] dArr, double[] dArr2) {
        int iMin = Math.min(dArr.length, dArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iCompare = Double.compare(dArr[i10], dArr2[i10]);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return dArr.length - dArr2.length;
    }
}
