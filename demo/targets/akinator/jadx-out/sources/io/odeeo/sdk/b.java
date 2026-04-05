package io.odeeo.sdk;

import android.net.ConnectivityManager;
import io.odeeo.sdk.advertisement.AdLoader;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements io.odeeo.internal.x0.b<AdUnit> {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<Executor> f68025a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<ConnectivityManager> f68026b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<io.odeeo.internal.o1.e> f68027c;

    /* renamed from: d, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<AdLoader> f68028d;

    /* renamed from: e, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<io.odeeo.internal.j1.i> f68029e;

    /* renamed from: f, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<i> f68030f;

    /* renamed from: g, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<io.odeeo.internal.k1.a> f68031g;

    /* renamed from: h, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<io.odeeo.internal.r1.a> f68032h;

    public b(io.odeeo.internal.x1.a<Executor> aVar, io.odeeo.internal.x1.a<ConnectivityManager> aVar2, io.odeeo.internal.x1.a<io.odeeo.internal.o1.e> aVar3, io.odeeo.internal.x1.a<AdLoader> aVar4, io.odeeo.internal.x1.a<io.odeeo.internal.j1.i> aVar5, io.odeeo.internal.x1.a<i> aVar6, io.odeeo.internal.x1.a<io.odeeo.internal.k1.a> aVar7, io.odeeo.internal.x1.a<io.odeeo.internal.r1.a> aVar8) {
        this.f68025a = aVar;
        this.f68026b = aVar2;
        this.f68027c = aVar3;
        this.f68028d = aVar4;
        this.f68029e = aVar5;
        this.f68030f = aVar6;
        this.f68031g = aVar7;
        this.f68032h = aVar8;
    }

    public static io.odeeo.internal.x0.b<AdUnit> create(io.odeeo.internal.x1.a<Executor> aVar, io.odeeo.internal.x1.a<ConnectivityManager> aVar2, io.odeeo.internal.x1.a<io.odeeo.internal.o1.e> aVar3, io.odeeo.internal.x1.a<AdLoader> aVar4, io.odeeo.internal.x1.a<io.odeeo.internal.j1.i> aVar5, io.odeeo.internal.x1.a<i> aVar6, io.odeeo.internal.x1.a<io.odeeo.internal.k1.a> aVar7, io.odeeo.internal.x1.a<io.odeeo.internal.r1.a> aVar8) {
        return new b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static void injectAdLoader(AdUnit adUnit, AdLoader adLoader) {
        adUnit.adLoader = adLoader;
    }

    public static void injectAvailabilityCallback(AdUnit adUnit, io.odeeo.internal.k1.a aVar) {
        adUnit.availabilityCallback = aVar;
    }

    public static void injectConnectivityManager(AdUnit adUnit, ConnectivityManager connectivityManager) {
        adUnit.connectivityManager = connectivityManager;
    }

    public static void injectEventTrackingManager(AdUnit adUnit, io.odeeo.internal.o1.e eVar) {
        adUnit.eventTrackingManager = eVar;
    }

    public static void injectGenerateBidRequestDataUseCase(AdUnit adUnit, io.odeeo.internal.r1.a aVar) {
        adUnit.generateBidRequestDataUseCase = aVar;
    }

    public static void injectImageController(AdUnit adUnit, io.odeeo.internal.j1.i iVar) {
        adUnit.imageController = iVar;
    }

    public static void injectMainThreadExecutor(AdUnit adUnit, Executor executor) {
        adUnit.mainThreadExecutor = executor;
    }

    public static void injectOdeeoAudioManager(AdUnit adUnit, i iVar) {
        adUnit.odeeoAudioManager = iVar;
    }

    @Override // io.odeeo.internal.x0.b
    public void injectMembers(AdUnit adUnit) {
        injectMainThreadExecutor(adUnit, this.f68025a.get());
        injectConnectivityManager(adUnit, this.f68026b.get());
        injectEventTrackingManager(adUnit, this.f68027c.get());
        injectAdLoader(adUnit, this.f68028d.get());
        injectImageController(adUnit, this.f68029e.get());
        injectOdeeoAudioManager(adUnit, this.f68030f.get());
        injectAvailabilityCallback(adUnit, this.f68031g.get());
        injectGenerateBidRequestDataUseCase(adUnit, this.f68032h.get());
    }
}
