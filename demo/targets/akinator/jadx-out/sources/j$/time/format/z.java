package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class z {
    public static final z LENIENT;
    public static final z SMART;
    public static final z STRICT;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ z[] f68596a;

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f68596a.clone();
    }

    static {
        z zVar = new z("STRICT", 0);
        STRICT = zVar;
        z zVar2 = new z(com.ironsource.mediationsdk.l.f37558e, 1);
        SMART = zVar2;
        z zVar3 = new z("LENIENT", 2);
        LENIENT = zVar3;
        f68596a = new z[]{zVar, zVar2, zVar3};
    }
}
