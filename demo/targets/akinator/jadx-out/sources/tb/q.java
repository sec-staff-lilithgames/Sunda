package tb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final q f86754b;

    /* renamed from: c, reason: collision with root package name */
    public static final q f86755c;

    /* renamed from: e, reason: collision with root package name */
    public static final q f86756e;

    /* renamed from: f, reason: collision with root package name */
    public static final q f86757f;

    /* renamed from: g, reason: collision with root package name */
    public static final q f86758g;

    /* renamed from: h, reason: collision with root package name */
    public static final q f86759h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ q[] f86760i;

    static {
        q qVar = new q("ACCEPT_SINGLE_VALUE_AS_ARRAY", 0);
        f86754b = qVar;
        q qVar2 = new q("ACCEPT_CASE_INSENSITIVE_PROPERTIES", 1);
        f86755c = qVar2;
        q qVar3 = new q("READ_UNKNOWN_ENUM_VALUES_AS_NULL", 2);
        f86756e = qVar3;
        q qVar4 = new q("READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE", 3);
        f86757f = qVar4;
        q qVar5 = new q("READ_DATE_TIMESTAMPS_AS_NANOSECONDS", 4);
        q qVar6 = new q("ACCEPT_CASE_INSENSITIVE_VALUES", 5);
        q qVar7 = new q("WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS", 6);
        q qVar8 = new q("WRITE_DATES_WITH_ZONE_ID", 7);
        q qVar9 = new q("WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", 8);
        f86758g = qVar9;
        q qVar10 = new q("WRITE_SORTED_MAP_ENTRIES", 9);
        f86759h = qVar10;
        f86760i = new q[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, new q("ADJUST_DATES_TO_CONTEXT_TIME_ZONE", 10)};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f86760i.clone();
    }
}
