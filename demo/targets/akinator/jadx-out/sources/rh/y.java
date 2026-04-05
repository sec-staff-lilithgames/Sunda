package rh;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final y f84398b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ y[] f84399c;

    static {
        y yVar = new y("INSTANCE", 0);
        f84398b = yVar;
        f84399c = new y[]{yVar};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f84399c.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Longs.lexicographicalComparator()";
    }

    @Override // java.util.Comparator
    public int compare(long[] jArr, long[] jArr2) {
        int iMin = Math.min(jArr.length, jArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iCompare = Long.compare(jArr[i10], jArr2[i10]);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return jArr.length - jArr2.length;
    }
}
