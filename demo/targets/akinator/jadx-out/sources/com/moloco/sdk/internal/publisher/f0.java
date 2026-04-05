package com.moloco.sdk.internal.publisher;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f46252b = new f0(com.ironsource.mediationsdk.l.f37554a, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f46253c = new f0("BANNER_TABLET", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final f0 f46254e = new f0("MREC", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final f0 f46255f = new f0("NATIVE_AD_MEDIATION", 3);

    /* renamed from: g, reason: collision with root package name */
    public static final f0 f46256g = new f0("NATIVE_BANNER", 4);

    /* renamed from: h, reason: collision with root package name */
    public static final f0 f46257h = new f0("INTERSTITIAL", 5);

    /* renamed from: i, reason: collision with root package name */
    public static final f0 f46258i = new f0("REWARDED", 6);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ f0[] f46259j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ cv.a f46260k;

    static {
        f0[] f0VarArrA = a();
        f46259j = f0VarArrA;
        f46260k = cv.b.enumEntries(f0VarArrA);
    }

    public f0(String str, int i10) {
    }

    public static final /* synthetic */ f0[] a() {
        return new f0[]{f46252b, f46253c, f46254e, f46255f, f46256g, f46257h, f46258i};
    }

    public static cv.a b() {
        return f46260k;
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f46259j.clone();
    }
}
