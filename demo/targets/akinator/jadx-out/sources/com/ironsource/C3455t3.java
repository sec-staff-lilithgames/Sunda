package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.t3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3455t3 implements InterfaceC3170d1 {

    /* renamed from: a, reason: collision with root package name */
    private final V3 f38905a;

    /* renamed from: b, reason: collision with root package name */
    private final Dd f38906b;

    /* renamed from: c, reason: collision with root package name */
    private final IronSource.a f38907c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.t3$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38908a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.f37252c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38908a = iArr;
        }
    }

    public C3455t3(V3 adFormatConfigurations, Dd dd2, IronSource.a adFormat) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        this.f38905a = adFormatConfigurations;
        this.f38906b = dd2;
        this.f38907c = adFormat;
    }

    @Override // com.ironsource.InterfaceC3170d1
    public InterfaceC3321l9 a(InterfaceC3567zd providerName) {
        NetworkSettings networkSettingsB;
        Zd zdF;
        kotlin.jvm.internal.e0.checkNotNullParameter(providerName, "providerName");
        Dd dd2 = this.f38906b;
        if (dd2 == null || (networkSettingsB = dd2.b(providerName.value())) == null) {
            return null;
        }
        int i10 = a.f38908a[this.f38907c.ordinal()];
        if (i10 == 1) {
            V2 v2C = this.f38905a.c();
            if (v2C != null) {
                return new C3118a3(new C3134b1(networkSettingsB, networkSettingsB.getBannerSettings(), this.f38907c), v2C);
            }
            return null;
        }
        if (i10 != 2) {
            if (i10 == 3 && (zdF = this.f38905a.f()) != null) {
                return new Md(new C3134b1(networkSettingsB, networkSettingsB.getRewardedVideoSettings(), this.f38907c), zdF);
            }
            return null;
        }
        F9 f9D = this.f38905a.d();
        if (f9D != null) {
            return new I9(new C3134b1(networkSettingsB, networkSettingsB.getInterstitialSettings(), this.f38907c), f9D);
        }
        return null;
    }
}
