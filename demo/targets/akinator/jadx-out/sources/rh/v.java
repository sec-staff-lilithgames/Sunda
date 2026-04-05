package rh;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final v f84395b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ v[] f84396c;

    static {
        v vVar = new v("INSTANCE", 0);
        f84395b = vVar;
        f84396c = new v[]{vVar};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f84396c.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Ints.lexicographicalComparator()";
    }

    @Override // java.util.Comparator
    public int compare(int[] iArr, int[] iArr2) {
        int iMin = Math.min(iArr.length, iArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iCompare = Integer.compare(iArr[i10], iArr2[i10]);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return iArr.length - iArr2.length;
    }
}
