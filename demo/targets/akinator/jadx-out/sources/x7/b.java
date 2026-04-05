package x7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f91757b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f91758c;

    /* JADX INFO: Fake field, exist only in values array */
    b EF0;

    static {
        b bVar = new b("LEFT_ALIGN", 0);
        b bVar2 = new b("RIGHT_ALIGN", 1);
        b bVar3 = new b("CENTER", 2);
        f91757b = bVar3;
        f91758c = new b[]{bVar, bVar2, bVar3};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f91758c.clone();
    }
}
