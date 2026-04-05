package rh;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final c f84353b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c[] f84354c;

    static {
        c cVar = new c("INSTANCE", 0);
        f84353b = cVar;
        f84354c = new c[]{cVar};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f84354c.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Booleans.lexicographicalComparator()";
    }

    @Override // java.util.Comparator
    public int compare(boolean[] zArr, boolean[] zArr2) {
        int iMin = Math.min(zArr.length, zArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iCompare = Boolean.compare(zArr[i10], zArr2[i10]);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return zArr.length - zArr2.length;
    }
}
