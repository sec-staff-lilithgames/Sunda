package ut;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a0 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f88660b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a0[] f88661c;

    static {
        a0 a0Var = new a0("INSTANCE", 0);
        f88660b = a0Var;
        f88661c = new a0[]{a0Var};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f88661c.clone();
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo(obj2);
    }
}
