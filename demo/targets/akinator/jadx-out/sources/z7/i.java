package z7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f97607b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f97608c;

    /* renamed from: e, reason: collision with root package name */
    public static final i f97609e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f97610f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ i[] f97611g;

    static {
        i iVar = new i("MASK_MODE_ADD", 0);
        f97607b = iVar;
        i iVar2 = new i("MASK_MODE_SUBTRACT", 1);
        f97608c = iVar2;
        i iVar3 = new i("MASK_MODE_INTERSECT", 2);
        f97609e = iVar3;
        i iVar4 = new i("MASK_MODE_NONE", 3);
        f97610f = iVar4;
        f97611g = new i[]{iVar, iVar2, iVar3, iVar4};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f97611g.clone();
    }
}
