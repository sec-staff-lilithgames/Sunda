package com.ironsource;

import android.app.Activity;
import com.ironsource.C3458t6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class F6 implements InterfaceC3543y6, C3458t6.b, C3458t6.a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f34356f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final String f34357g = "Fullscreen ProgressiveOnShown Strategy";

    /* renamed from: a, reason: collision with root package name */
    private final C3350n0 f34358a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3475u6 f34359b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3509w6 f34360c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3526x6 f34361d;

    /* renamed from: e, reason: collision with root package name */
    private L6 f34362e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    public F6(C3350n0 adTools, InterfaceC3475u6 factory, InterfaceC3509w6 fullscreenAdUnitListener, InterfaceC3526x6 listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(factory, "factory");
        kotlin.jvm.internal.e0.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f34358a = adTools;
        this.f34359b = factory;
        this.f34360c = fullscreenAdUnitListener;
        this.f34361d = listener;
        this.f34362e = new G6(this, null, false, 4, null);
    }

    public final C3350n0 a() {
        return this.f34358a;
    }

    public final InterfaceC3475u6 b() {
        return this.f34359b;
    }

    public final InterfaceC3509w6 c() {
        return this.f34360c;
    }

    public final InterfaceC3526x6 d() {
        return this.f34361d;
    }

    @Override // com.ironsource.InterfaceC3543y6
    public void loadAd() {
        this.f34362e.loadAd();
    }

    @Override // com.ironsource.InterfaceC3543y6
    public void a(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f34362e.a(activity);
    }

    @Override // com.ironsource.C3458t6.b
    public void b(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34362e.c(adInfo);
    }

    @Override // com.ironsource.C3458t6.b
    public void c(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34362e.b(adInfo);
    }

    public final void a(L6 state) {
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        this.f34362e = state;
    }

    @Override // com.ironsource.C3458t6.b
    public void b(C3458t6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f34362e.a(ironSourceError);
    }

    public final void a(String message) {
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        this.f34358a.e().h().f("Fullscreen ProgressiveOnShown Strategy - " + message);
    }

    @Override // com.ironsource.C3458t6.a
    public void a(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34362e.a(adInfo);
    }

    @Override // com.ironsource.C3458t6.a
    public void a(C3458t6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f34362e.c(ironSourceError);
    }

    @Override // com.ironsource.C3458t6.b
    public void a(C3458t6 adUnit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f34362e.a();
    }
}
