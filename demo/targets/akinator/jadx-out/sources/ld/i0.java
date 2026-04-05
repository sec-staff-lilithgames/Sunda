package ld;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final i0 f73243b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i0[] f73244c;

    /* JADX INFO: Fake field, exist only in values array */
    i0 EF0;

    static {
        i0 i0Var = new i0("UNKNOWN", 0);
        i0 i0Var2 = new i0("ANDROID_FIREBASE", 1);
        f73243b = i0Var2;
        f73244c = new i0[]{i0Var, i0Var2};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f73244c.clone();
    }
}
