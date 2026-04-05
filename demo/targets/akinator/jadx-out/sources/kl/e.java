package kl;

import com.ironsource.mediationsdk.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f71582b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f71583c;

    /* renamed from: e, reason: collision with root package name */
    public static final e f71584e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f71585f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ e[] f71586g;

    static {
        e eVar = new e("UNSPECIFIED", 0);
        f71582b = eVar;
        e eVar2 = new e("INTERSTITIAL", 1);
        f71583c = eVar2;
        e eVar3 = new e("REWARDED", 2);
        f71584e = eVar3;
        e eVar4 = new e(l.f37554a, 3);
        f71585f = eVar4;
        f71586g = new e[]{eVar, eVar2, eVar3, eVar4};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f71586g.clone();
    }
}
