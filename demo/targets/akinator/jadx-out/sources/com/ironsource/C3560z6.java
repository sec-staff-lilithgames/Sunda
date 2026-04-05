package com.ironsource;

import android.app.Activity;
import com.ironsource.C3458t6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.z6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3560z6 implements InterfaceC3543y6, C3458t6.b, C3458t6.a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f39349f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final String f39350g = "Fullscreen ProgressiveOnLoaded Strategy";

    /* renamed from: a, reason: collision with root package name */
    private final C3350n0 f39351a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3475u6 f39352b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3509w6 f39353c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3526x6 f39354d;

    /* renamed from: e, reason: collision with root package name */
    private E6 f39355e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.z6$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    public C3560z6(C3350n0 adTools, InterfaceC3475u6 factory, InterfaceC3509w6 fullscreenAdUnitListener, InterfaceC3526x6 listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(factory, "factory");
        kotlin.jvm.internal.e0.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f39351a = adTools;
        this.f39352b = factory;
        this.f39353c = fullscreenAdUnitListener;
        this.f39354d = listener;
        this.f39355e = new A6(this);
    }

    public final C3350n0 a() {
        return this.f39351a;
    }

    public final InterfaceC3475u6 b() {
        return this.f39352b;
    }

    public final InterfaceC3509w6 c() {
        return this.f39353c;
    }

    public final InterfaceC3526x6 d() {
        return this.f39354d;
    }

    @Override // com.ironsource.InterfaceC3543y6
    public void loadAd() {
        this.f39355e.loadAd();
    }

    public final void a(E6 state) {
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        this.f39355e = state;
    }

    @Override // com.ironsource.C3458t6.b
    public void b(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f39355e.b(adUnit, adInfo);
    }

    @Override // com.ironsource.C3458t6.b
    public void c(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f39355e.c(adUnit, adInfo);
    }

    @Override // com.ironsource.InterfaceC3543y6
    public void a(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f39355e.a(activity);
    }

    @Override // com.ironsource.C3458t6.b
    public void b(C3458t6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f39355e.b(adUnit, ironSourceError);
    }

    @Override // com.ironsource.C3458t6.b
    public void a(C3458t6 adUnit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f39355e.a(adUnit);
    }

    @Override // com.ironsource.C3458t6.a
    public void a(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f39355e.a(adUnit, adInfo);
    }

    @Override // com.ironsource.C3458t6.a
    public void a(C3458t6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f39355e.a(adUnit, ironSourceError);
    }

    public final void a(String message) {
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        this.f39351a.e().h().f("Fullscreen ProgressiveOnLoaded Strategy - " + message);
    }
}
