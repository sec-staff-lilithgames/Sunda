package vj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f89297b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f89298c;

    /* renamed from: e, reason: collision with root package name */
    public static final d f89299e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f89300f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f89301g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ d[] f89302h;

    static {
        d dVar = new d("ATTEMPT_MIGRATION", 0);
        f89297b = dVar;
        d dVar2 = new d("NOT_GENERATED", 1);
        f89298c = dVar2;
        d dVar3 = new d("UNREGISTERED", 2);
        f89299e = dVar3;
        d dVar4 = new d("REGISTERED", 3);
        f89300f = dVar4;
        d dVar5 = new d("REGISTER_ERROR", 4);
        f89301g = dVar5;
        f89302h = new d[]{dVar, dVar2, dVar3, dVar4, dVar5};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f89302h.clone();
    }
}
