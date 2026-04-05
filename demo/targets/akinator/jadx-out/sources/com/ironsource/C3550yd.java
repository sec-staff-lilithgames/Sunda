package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.yd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3550yd {

    /* renamed from: a, reason: collision with root package name */
    private final V0 f39282a;

    /* renamed from: b, reason: collision with root package name */
    private final List<C3566zc> f39283b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3486v0 f39284c;

    /* renamed from: d, reason: collision with root package name */
    private final IronSource.a f39285d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.yd$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39286a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f39286a = iArr;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.yd$b */
    public static final class b extends AbstractRunnableC3273ie {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f39288c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AdapterBaseInterface f39289d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AdData f39290e;

        public b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
            this.f39288c = networkSettings;
            this.f39289d = adapterBaseInterface;
            this.f39290e = adData;
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            C3550yd c3550yd = C3550yd.this;
            NetworkSettings networkSettings = this.f39288c;
            AdapterBaseInterface networkAdapter = this.f39289d;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(networkAdapter, "networkAdapter");
            c3550yd.a(networkSettings, networkAdapter, this.f39290e);
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a(Throwable t10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(t10, "t");
            C3550yd.this.f39282a.e().h().g("initProvider - exception while calling networkAdapter.init with " + this.f39288c.getProviderName() + " - " + t10);
        }
    }

    public C3550yd(V0 adUnitTools, LevelPlay.AdFormat adFormat, List<C3566zc> providers, AbstractC3486v0 adUnitData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.e0.checkNotNullParameter(providers, "providers");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
        this.f39282a = adUnitTools;
        this.f39283b = providers;
        this.f39284c = adUnitData;
        this.f39285d = a(adFormat);
    }

    public final void a() {
        IronLog.INTERNAL.verbose(C3350n0.a(this.f39282a, (String) null, (String) null, 3, (Object) null));
        UUID uuidRandomUUID = UUID.randomUUID();
        Iterator<C3566zc> it = this.f39283b.iterator();
        while (it.hasNext()) {
            NetworkSettings networkSettingsF = it.next().f();
            AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettingsF, this.f39285d, uuidRandomUUID);
            if (a(networkSettingsF, adapterBaseInterfaceB)) {
                C3535xf.a(C3535xf.f39230a, new b(networkSettingsF, adapterBaseInterfaceB, this.f39284c.a(networkSettingsF)), 0L, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
        a("Start initializing provider %s on thread %s", networkSettings);
        adapterBaseInterface.init(adData, ContextProvider.getInstance().getApplicationContext(), null);
        a("Done initializing provider %s on thread %s", networkSettings);
    }

    private final void a(String str, NetworkSettings networkSettings) {
        IronLog.INTERNAL.verbose(C3350n0.a(this.f39282a, b0.e2.m(str, "format(format, *args)", 2, new Object[]{networkSettings.getProviderInstanceName(), Thread.currentThread().getName()}), (String) null, 2, (Object) null));
    }

    private final boolean a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null) {
            return false;
        }
        V0 v02 = this.f39282a;
        IronSource.a aVar = this.f39285d;
        String providerInstanceName = networkSettings.getProviderInstanceName();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        return !v02.a(adapterBaseInterface, aVar, providerInstanceName) && (networkSettings.shouldEarlyInit() || networkSettings.isIronSource() || networkSettings.isBidder(this.f39285d));
    }

    private final IronSource.a a(LevelPlay.AdFormat adFormat) {
        int i10 = a.f39286a[adFormat.ordinal()];
        if (i10 == 1) {
            return IronSource.a.REWARDED_VIDEO;
        }
        if (i10 == 2) {
            return IronSource.a.f37252c;
        }
        if (i10 == 3) {
            return IronSource.a.BANNER;
        }
        if (i10 == 4) {
            return IronSource.a.NATIVE_AD;
        }
        throw new tu.t();
    }
}
