package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.u4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3473u4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f39040a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39041b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39042c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39043d;

    public C3473u4() {
        this(null, null, null, null, 15, null);
    }

    public final String a() {
        return this.f39040a;
    }

    public final String b() {
        return this.f39041b;
    }

    public final String c() {
        return this.f39042c;
    }

    public final String d() {
        return this.f39043d;
    }

    public final String e() {
        return this.f39043d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3473u4)) {
            return false;
        }
        C3473u4 c3473u4 = (C3473u4) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f39040a, c3473u4.f39040a) && kotlin.jvm.internal.e0.areEqual(this.f39041b, c3473u4.f39041b) && kotlin.jvm.internal.e0.areEqual(this.f39042c, c3473u4.f39042c) && kotlin.jvm.internal.e0.areEqual(this.f39043d, c3473u4.f39043d);
    }

    public final String f() {
        return this.f39042c;
    }

    public final String g() {
        return this.f39040a;
    }

    public final String h() {
        return this.f39041b;
    }

    public int hashCode() {
        return this.f39043d.hashCode() + p0.o2.e(p0.o2.e(this.f39040a.hashCode() * 31, 31, this.f39041b), 31, this.f39042c);
    }

    public String toString() {
        String str = this.f39040a;
        String str2 = this.f39041b;
        return p0.o2.r(b3.h.b("CustomAdapterSettings(customNetworkAdapterName=", str, ", customRewardedVideoAdapterName=", str2, ", customInterstitialAdapterName="), this.f39042c, ", customBannerAdapterName=", this.f39043d, ")");
    }

    public C3473u4(String customNetworkAdapterName, String customRewardedVideoAdapterName, String customInterstitialAdapterName, String customBannerAdapterName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        kotlin.jvm.internal.e0.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        kotlin.jvm.internal.e0.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        kotlin.jvm.internal.e0.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        this.f39040a = customNetworkAdapterName;
        this.f39041b = customRewardedVideoAdapterName;
        this.f39042c = customInterstitialAdapterName;
        this.f39043d = customBannerAdapterName;
    }

    public final C3473u4 a(String customNetworkAdapterName, String customRewardedVideoAdapterName, String customInterstitialAdapterName, String customBannerAdapterName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        kotlin.jvm.internal.e0.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        kotlin.jvm.internal.e0.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        kotlin.jvm.internal.e0.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        return new C3473u4(customNetworkAdapterName, customRewardedVideoAdapterName, customInterstitialAdapterName, customBannerAdapterName);
    }

    public static /* synthetic */ C3473u4 a(C3473u4 c3473u4, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c3473u4.f39040a;
        }
        if ((i10 & 2) != 0) {
            str2 = c3473u4.f39041b;
        }
        if ((i10 & 4) != 0) {
            str3 = c3473u4.f39042c;
        }
        if ((i10 & 8) != 0) {
            str4 = c3473u4.f39043d;
        }
        return c3473u4.a(str, str2, str3, str4);
    }

    public /* synthetic */ C3473u4(String str, String str2, String str3, String str4, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }
}
