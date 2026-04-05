package kc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final j f70789b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j[] f70790c;

    /* JADX INFO: Fake field, exist only in values array */
    j EF0;

    static {
        j jVar = new j("ALWAYS", 0);
        j jVar2 = new j("NON_NULL", 1);
        j jVar3 = new j("NON_DEFAULT", 2);
        j jVar4 = new j("NON_EMPTY", 3);
        j jVar5 = new j("DEFAULT_INCLUSION", 4);
        f70789b = jVar5;
        f70790c = new j[]{jVar, jVar2, jVar3, jVar4, jVar5};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f70790c.clone();
    }
}
