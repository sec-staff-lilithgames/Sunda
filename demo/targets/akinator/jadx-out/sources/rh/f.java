package rh;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final f f84361b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f[] f84362c;

    static {
        f fVar = new f("INSTANCE", 0);
        f84361b = fVar;
        f84362c = new f[]{fVar};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f84362c.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Chars.lexicographicalComparator()";
    }

    @Override // java.util.Comparator
    public int compare(char[] cArr, char[] cArr2) {
        int iMin = Math.min(cArr.length, cArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iCompare = Character.compare(cArr[i10], cArr2[i10]);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return cArr.length - cArr2.length;
    }
}
