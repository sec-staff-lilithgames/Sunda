package a8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f4183b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f4184c;

    /* renamed from: e, reason: collision with root package name */
    public static final d f4185e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d[] f4186f;

    static {
        d dVar = new d("PRE_COMP", 0);
        f4183b = dVar;
        d dVar2 = new d("SOLID", 1);
        d dVar3 = new d("IMAGE", 2);
        f4184c = dVar3;
        d dVar4 = new d("NULL", 3);
        d dVar5 = new d("SHAPE", 4);
        d dVar6 = new d("TEXT", 5);
        d dVar7 = new d("UNKNOWN", 6);
        f4185e = dVar7;
        f4186f = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f4186f.clone();
    }
}
