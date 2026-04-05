package ud;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f88420b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f88421c;

    /* renamed from: e, reason: collision with root package name */
    public static final f f88422e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f[] f88423f;

    static {
        f fVar = new f("NETWORK_UNMETERED", 0);
        f88420b = fVar;
        f fVar2 = new f("DEVICE_IDLE", 1);
        f88421c = fVar2;
        f fVar3 = new f("DEVICE_CHARGING", 2);
        f88422e = fVar3;
        f88423f = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f88423f.clone();
    }
}
