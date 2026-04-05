package com.ironsource;

import android.app.Activity;
import com.ironsource.C3458t6;
import com.ironsource.InterfaceC3543y6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class M6 implements InterfaceC3543y6, C3458t6.b, C3458t6.a {

    /* renamed from: a, reason: collision with root package name */
    private final C3350n0 f34838a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3543y6.a f34839b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3475u6 f34840c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3509w6 f34841d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3526x6 f34842e;

    /* renamed from: f, reason: collision with root package name */
    private C3458t6 f34843f;

    public M6(C3350n0 adTools, InterfaceC3543y6.a config, InterfaceC3475u6 fullscreenAdUnitFactory, InterfaceC3509w6 fullscreenAdUnitListener, InterfaceC3526x6 listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.e0.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f34838a = adTools;
        this.f34839b = config;
        this.f34840c = fullscreenAdUnitFactory;
        this.f34841d = fullscreenAdUnitListener;
        this.f34842e = listener;
    }

    public final C3350n0 a() {
        return this.f34838a;
    }

    public final InterfaceC3543y6.a b() {
        return this.f34839b;
    }

    @Override // com.ironsource.C3458t6.b
    public void c(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34842e.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC3543y6
    public void loadAd() {
        C3458t6 c3458t6A = this.f34840c.a(true, this.f34841d);
        c3458t6A.a(this);
        this.f34843f = c3458t6A;
    }

    @Override // com.ironsource.InterfaceC3543y6
    public void a(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        C3458t6 c3458t6 = this.f34843f;
        if (c3458t6 != null) {
            c3458t6.a(activity, this);
        }
    }

    @Override // com.ironsource.C3458t6.b
    public void b(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34842e.b(adInfo);
    }

    @Override // com.ironsource.C3458t6.b
    public void a(C3458t6 adUnit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f34843f = null;
        this.f34842e.a();
    }

    @Override // com.ironsource.C3458t6.b
    public void b(C3458t6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f34842e.a(ironSourceError);
    }

    @Override // com.ironsource.C3458t6.a
    public void a(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34842e.a(adInfo);
    }

    @Override // com.ironsource.C3458t6.a
    public void a(C3458t6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f34842e.c(ironSourceError);
    }
}
