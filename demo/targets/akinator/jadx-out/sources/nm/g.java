package nm;

import com.inmobi.unification.sdk.InitializationStatus;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f77041b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f77042c;

    /* renamed from: e, reason: collision with root package name */
    public static final g f77043e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f77044f;

    /* renamed from: g, reason: collision with root package name */
    public static final g f77045g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ g[] f77046h;

    static {
        g gVar = new g("Idle", 0);
        f77041b = gVar;
        g gVar2 = new g("Running", 1);
        f77042c = gVar2;
        g gVar3 = new g(InitializationStatus.SUCCESS, 2);
        f77043e = gVar3;
        g gVar4 = new g("Fail", 3);
        f77044f = gVar4;
        g gVar5 = new g("Canceled", 4);
        f77045g = gVar5;
        f77046h = new g[]{gVar, gVar2, gVar3, gVar4, gVar5};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f77046h.clone();
    }
}
