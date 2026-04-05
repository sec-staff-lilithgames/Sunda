package x4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f91730b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f91731c;

    /* renamed from: e, reason: collision with root package name */
    public static final b f91732e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f91733f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f91734g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f91735h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f91736i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f91737j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ b[] f91738k;

    static {
        b bVar = new b("PENALTY_LOG", 0);
        f91730b = bVar;
        b bVar2 = new b("PENALTY_DEATH", 1);
        f91731c = bVar2;
        b bVar3 = new b("DETECT_FRAGMENT_REUSE", 2);
        f91732e = bVar3;
        b bVar4 = new b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f91733f = bVar4;
        b bVar5 = new b("DETECT_RETAIN_INSTANCE_USAGE", 4);
        f91734g = bVar5;
        b bVar6 = new b("DETECT_SET_USER_VISIBLE_HINT", 5);
        f91735h = bVar6;
        b bVar7 = new b("DETECT_TARGET_FRAGMENT_USAGE", 6);
        f91736i = bVar7;
        b bVar8 = new b("DETECT_WRONG_FRAGMENT_CONTAINER", 7);
        f91737j = bVar8;
        f91738k = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f91738k.clone();
    }
}
