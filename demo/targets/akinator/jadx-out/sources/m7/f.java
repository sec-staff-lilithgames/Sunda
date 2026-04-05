package m7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f74055b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f74056c;

    /* renamed from: e, reason: collision with root package name */
    public static final f f74057e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f[] f74058f;

    static {
        f fVar = new f("EXACT", 0);
        f74055b = fVar;
        f fVar2 = new f("INEXACT", 1);
        f74056c = fVar2;
        f fVar3 = new f("AUTOMATIC", 2);
        f74057e = fVar3;
        f74058f = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f74058f.clone();
    }
}
