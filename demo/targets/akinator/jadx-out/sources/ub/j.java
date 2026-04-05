package ub;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j implements ic.k {

    /* renamed from: b, reason: collision with root package name */
    public static final j f88242b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f88243c;

    /* renamed from: e, reason: collision with root package name */
    public static final j f88244e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f88245f;

    /* renamed from: g, reason: collision with root package name */
    public static final j f88246g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ j[] f88247h;

    static {
        j jVar = new j("INTERN_FIELD_NAMES", 0);
        f88242b = jVar;
        j jVar2 = new j("CANONICALIZE_FIELD_NAMES", 1);
        f88243c = jVar2;
        j jVar3 = new j("FAIL_ON_SYMBOL_HASH_OVERFLOW", 2);
        f88244e = jVar3;
        j jVar4 = new j("USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING", 3);
        f88245f = jVar4;
        j jVar5 = new j("CHARSET_DETECTION", 4);
        f88246g = jVar5;
        f88247h = new j[]{jVar, jVar2, jVar3, jVar4, jVar5};
    }

    public static int collectDefaults() {
        int mask = 0;
        for (j jVar : values()) {
            if (jVar.enabledByDefault()) {
                mask |= jVar.getMask();
            }
        }
        return mask;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f88247h.clone();
    }

    @Override // ic.k
    public boolean enabledByDefault() {
        return true;
    }

    @Override // ic.k
    public boolean enabledIn(int i10) {
        return (i10 & getMask()) != 0;
    }

    @Override // ic.k
    public int getMask() {
        return 1 << ordinal();
    }
}
