package tv;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final i f87439c;

    /* renamed from: e, reason: collision with root package name */
    public static final i f87440e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f87441f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f87442g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f87443h;

    /* renamed from: i, reason: collision with root package name */
    public static final i f87444i;

    /* renamed from: j, reason: collision with root package name */
    public static final i f87445j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ i[] f87446k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ cv.a f87447l;

    /* renamed from: b, reason: collision with root package name */
    public final TimeUnit f87448b;

    static {
        i iVar = new i("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f87439c = iVar;
        i iVar2 = new i("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        f87440e = iVar2;
        i iVar3 = new i("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f87441f = iVar3;
        i iVar4 = new i("SECONDS", 3, TimeUnit.SECONDS);
        f87442g = iVar4;
        i iVar5 = new i("MINUTES", 4, TimeUnit.MINUTES);
        f87443h = iVar5;
        i iVar6 = new i("HOURS", 5, TimeUnit.HOURS);
        f87444i = iVar6;
        i iVar7 = new i("DAYS", 6, TimeUnit.DAYS);
        f87445j = iVar7;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7};
        f87446k = iVarArr;
        f87447l = cv.b.enumEntries(iVarArr);
    }

    public i(String str, int i10, TimeUnit timeUnit) {
        this.f87448b = timeUnit;
    }

    public static cv.a getEntries() {
        return f87447l;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f87446k.clone();
    }

    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.f87448b;
    }
}
