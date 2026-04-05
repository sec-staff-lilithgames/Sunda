package io.bidmachine;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w3 {

    /* renamed from: b, reason: collision with root package name */
    public static final w3 f62038b;

    /* renamed from: c, reason: collision with root package name */
    public static final w3 f62039c;

    /* renamed from: e, reason: collision with root package name */
    public static final w3 f62040e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w3[] f62041f;

    static {
        w3 w3Var = new w3("START", 0);
        f62038b = w3Var;
        w3 w3Var2 = new w3("RESUME", 1);
        f62039c = w3Var2;
        w3 w3Var3 = new w3("PAUSE", 2);
        f62040e = w3Var3;
        f62041f = new w3[]{w3Var, w3Var2, w3Var3};
    }

    public static w3 valueOf(String str) {
        return (w3) Enum.valueOf(w3.class, str);
    }

    public static w3[] values() {
        return (w3[]) f62041f.clone();
    }
}
