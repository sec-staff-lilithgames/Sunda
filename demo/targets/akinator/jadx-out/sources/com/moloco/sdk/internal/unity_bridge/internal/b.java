package com.moloco.sdk.internal.unity_bridge.internal;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.lh;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import io.ktor.util.collections.ConcurrentMap;
import kotlin.jvm.internal.e0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentMap f47205a = new ConcurrentMap(0, 1, null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements AdLoad.Listener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f47207b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterstitialAd f47208c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Handler f47209d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MolocoUnityLoadCallback f47210e;

        public a(String str, InterstitialAd interstitialAd, Handler handler, MolocoUnityLoadCallback molocoUnityLoadCallback) {
            this.f47207b = str;
            this.f47208c = interstitialAd;
            this.f47209d = handler;
            this.f47210e = molocoUnityLoadCallback;
        }

        public static final void a(MolocoUnityLoadCallback molocoUnityLoadCallback, String str) {
            molocoUnityLoadCallback.onAdLoadSuccess(str);
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadFailed(MolocoAdError molocoAdError) {
            e0.checkNotNullParameter(molocoAdError, "molocoAdError");
            this.f47209d.post(new lh(this.f47210e, 12, this.f47207b, molocoAdError));
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadSuccess(MolocoAd molocoAd) {
            e0.checkNotNullParameter(molocoAd, "molocoAd");
            ConcurrentMap concurrentMap = b.this.f47205a;
            InterstitialAd interstitialAd = this.f47208c;
            String str = this.f47207b;
            concurrentMap.put(str, interstitialAd);
            this.f47209d.post(new com.moloco.sdk.internal.unity_bridge.internal.a(this.f47210e, str, 1));
        }

        public static final void a(MolocoUnityLoadCallback molocoUnityLoadCallback, String str, MolocoAdError molocoAdError) {
            molocoUnityLoadCallback.onAdLoadFailed(str, molocoAdError.toString());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.internal.unity_bridge.internal.b$b, reason: collision with other inner class name */
    public static final class C0390b implements InterstitialAdShowListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Handler f47211a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MolocoUnityShowCallback f47212b;

        public C0390b(Handler handler, MolocoUnityShowCallback molocoUnityShowCallback) {
            this.f47211a = handler;
            this.f47212b = molocoUnityShowCallback;
        }

        public static final void a(MolocoUnityShowCallback molocoUnityShowCallback, MolocoAdError molocoAdError) {
            molocoUnityShowCallback.onAdShowFailed(molocoAdError.getAdUnitId(), molocoAdError.toString());
        }

        public static final void b(MolocoUnityShowCallback molocoUnityShowCallback, MolocoAd molocoAd) {
            molocoUnityShowCallback.onAdHidden(molocoAd.getAdUnitId());
        }

        public static final void c(MolocoUnityShowCallback molocoUnityShowCallback, MolocoAd molocoAd) {
            molocoUnityShowCallback.onAdShowSuccess(molocoAd.getAdUnitId());
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdClicked(MolocoAd molocoAd) {
            e0.checkNotNullParameter(molocoAd, "molocoAd");
            this.f47211a.post(new c(this.f47212b, molocoAd, 1));
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdHidden(MolocoAd molocoAd) {
            e0.checkNotNullParameter(molocoAd, "molocoAd");
            this.f47211a.post(new c(this.f47212b, molocoAd, 0));
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowFailed(MolocoAdError molocoAdError) {
            e0.checkNotNullParameter(molocoAdError, "molocoAdError");
            this.f47211a.post(new com.ironsource.environment.thread.a(4, this.f47212b, molocoAdError));
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowSuccess(MolocoAd molocoAd) {
            e0.checkNotNullParameter(molocoAd, "molocoAd");
            this.f47211a.post(new c(this.f47212b, molocoAd, 2));
        }

        public static final void a(MolocoUnityShowCallback molocoUnityShowCallback, MolocoAd molocoAd) {
            molocoUnityShowCallback.onAdClicked(molocoAd.getAdUnitId());
        }
    }

    public final void a(String mediation, String adUnitId, String bidResponse, MolocoUnityLoadCallback unityLoadCallback) {
        e0.checkNotNullParameter(mediation, "mediation");
        e0.checkNotNullParameter(adUnitId, "adUnitId");
        e0.checkNotNullParameter(bidResponse, "bidResponse");
        e0.checkNotNullParameter(unityLoadCallback, "unityLoadCallback");
        Moloco.createInterstitial$default(new MediationInfo(mediation), adUnitId, null, new com.applovin.mediation.adapters.c(a(), this, adUnitId, bidResponse, unityLoadCallback, 1), 4, null);
    }

    public static final x0 a(Handler handler, b bVar, String str, String str2, MolocoUnityLoadCallback molocoUnityLoadCallback, InterstitialAd interstitialAd, MolocoAdError.AdCreateError adCreateError) {
        x0 x0Var = x0.f87415a;
        if (adCreateError != null) {
            handler.post(new lh(molocoUnityLoadCallback, 11, str, adCreateError));
            return x0Var;
        }
        e0.checkNotNull(interstitialAd, "null cannot be cast to non-null type com.moloco.sdk.publisher.InterstitialAd");
        bVar.a(interstitialAd, str, str2, handler, molocoUnityLoadCallback);
        return x0Var;
    }

    public static final void a(MolocoUnityLoadCallback molocoUnityLoadCallback, String str, MolocoAdError.AdCreateError adCreateError) {
        molocoUnityLoadCallback.onAdLoadFailed(str, adCreateError.toString());
    }

    public final void a(String adUnitId, MolocoUnityShowCallback callback) {
        e0.checkNotNullParameter(adUnitId, "adUnitId");
        e0.checkNotNullParameter(callback, "callback");
        Handler handlerA = a();
        InterstitialAd interstitialAd = (InterstitialAd) this.f47205a.get(adUnitId);
        if (interstitialAd != null && interstitialAd.isLoaded()) {
            interstitialAd.show(new C0390b(handlerA, callback));
            return;
        }
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        handlerA.post(new com.ironsource.environment.thread.a(3, callback, adUnitId));
    }

    public static final void a(MolocoUnityShowCallback molocoUnityShowCallback, String str) {
        molocoUnityShowCallback.onAdShowFailed(str, "Ad cannot be shown as it was not loaded");
    }

    public final void a(InterstitialAd interstitialAd, String str, String str2, Handler handler, MolocoUnityLoadCallback molocoUnityLoadCallback) {
        InterstitialAd interstitialAd2 = (InterstitialAd) this.f47205a.get(str);
        if (interstitialAd2 != null) {
            if (interstitialAd2.isLoaded()) {
                handler.post(new com.moloco.sdk.internal.unity_bridge.internal.a(molocoUnityLoadCallback, str, 0));
                return;
            }
            interstitialAd2.destroy();
        }
        interstitialAd.load(str2, new a(str, interstitialAd, handler, molocoUnityLoadCallback));
    }

    public static final void a(MolocoUnityLoadCallback molocoUnityLoadCallback, String str) {
        molocoUnityLoadCallback.onAdLoadSuccess(str);
    }

    public final Handler a() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            return new Handler(looperMyLooper);
        }
        throw new IllegalStateException("Can't create handler inside thread " + Thread.currentThread() + " that has not called Looper.prepare()");
    }
}
