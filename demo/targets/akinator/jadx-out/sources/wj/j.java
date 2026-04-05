package wj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final j f90676b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f90677c;

    /* renamed from: e, reason: collision with root package name */
    public static final j f90678e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ j[] f90679f;

    static {
        j jVar = new j("OK", 0);
        f90676b = jVar;
        j jVar2 = new j("BAD_CONFIG", 1);
        f90677c = jVar2;
        j jVar3 = new j("AUTH_ERROR", 2);
        f90678e = jVar3;
        f90679f = new j[]{jVar, jVar2, jVar3};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f90679f.clone();
    }
}
