package rh;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c0 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f84355b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c0[] f84356c;

    static {
        c0 c0Var = new c0("INSTANCE", 0);
        f84355b = c0Var;
        f84356c = new c0[]{c0Var};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f84356c.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }

    @Override // java.util.Comparator
    public int compare(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iCompare = e0.compare(bArr[i10], bArr2[i10]);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return bArr.length - bArr2.length;
    }
}
