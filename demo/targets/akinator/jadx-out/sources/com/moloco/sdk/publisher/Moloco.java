package com.moloco.sdk.publisher;

import a1.k;
import android.content.Context;
import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import av.e;
import b0.e2;
import bv.f;
import bv.n;
import com.amazon.device.ads.DtbConstants;
import com.ironsource.Q6;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.acm.h;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.j0;
import com.moloco.sdk.internal.services.bidtoken.i;
import com.moloco.sdk.internal.services.bidtoken.j;
import com.moloco.sdk.internal.w;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import com.moloco.sdk.service_locator.a;
import com.vungle.ads.internal.protos.Sdk;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kv.p;
import sv.k0;
import tu.a0;
import tu.e0;
import tu.o;
import tu.q;
import tu.t;
import tu.v;
import tu.x0;
import tu.z;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Moloco {
    private static Job initJob;
    private static MolocoInitParams initParams;
    public static final Moloco INSTANCE = new Moloco();
    private static final o initializationHandler$delegate = q.lazy(new k(29));
    private static final o bidTokenHandler$delegate = q.lazy(new b(0));
    private static final o adCreator$delegate = q.lazy(new b(1));
    private static final CoroutineScope scope = com.google.android.gms.internal.play_billing.a.o();
    public static final int $stable = 8;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.moloco.sdk.publisher.Moloco$createBanner$1", f = "Moloco.kt", i = {}, l = {205}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.publisher.Moloco$createBanner$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ p $callback;
        final /* synthetic */ MediationInfo $mediationInfo;
        final /* synthetic */ String $watermarkString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MediationInfo mediationInfo, String str, String str2, p pVar, zu.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = pVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new AnonymousClass1(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object objA;
            v vVar;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                com.moloco.sdk.acm.recorder.c cVarCreate = com.moloco.sdk.acm.recorder.c.Companion.create(this.$mediationInfo.getName());
                com.moloco.sdk.internal.publisher.k adCreator = Moloco.INSTANCE.getAdCreator();
                String name = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                objA = adCreator.a(name, str, cVarCreate, str2, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                objA = obj;
            }
            w wVar = (w) objA;
            if (wVar instanceof w.b) {
                vVar = e0.to(((w.b) wVar).a(), null);
            } else {
                if (!(wVar instanceof w.a)) {
                    throw new t();
                }
                vVar = e0.to(null, ((w.a) wVar).a());
            }
            Banner banner = (Banner) vVar.component1();
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) vVar.component2();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("Banner for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(banner == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.invoke(banner, adCreateError);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.moloco.sdk.publisher.Moloco$createBannerTablet$1", f = "Moloco.kt", i = {}, l = {236}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.publisher.Moloco$createBannerTablet$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35701 extends n implements p {
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ p $callback;
        final /* synthetic */ MediationInfo $mediationInfo;
        final /* synthetic */ String $watermarkString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35701(MediationInfo mediationInfo, String str, String str2, p pVar, zu.d<? super C35701> dVar) {
            super(2, dVar);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = pVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new C35701(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            v vVar;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                com.moloco.sdk.acm.recorder.c cVarCreate = com.moloco.sdk.acm.recorder.c.Companion.create(this.$mediationInfo.getName());
                com.moloco.sdk.internal.publisher.k adCreator = Moloco.INSTANCE.getAdCreator();
                String name = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                objB = adCreator.b(name, str, cVarCreate, str2, this);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                objB = obj;
            }
            w wVar = (w) objB;
            if (wVar instanceof w.b) {
                vVar = e0.to(((w.b) wVar).a(), null);
            } else {
                if (!(wVar instanceof w.a)) {
                    throw new t();
                }
                vVar = e0.to(null, ((w.a) wVar).a());
            }
            Banner banner = (Banner) vVar.component1();
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) vVar.component2();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("Banner for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(banner == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.invoke(banner, adCreateError);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((C35701) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.moloco.sdk.publisher.Moloco$createInterstitial$1", f = "Moloco.kt", i = {}, l = {328}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.publisher.Moloco$createInterstitial$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35711 extends n implements p {
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ p $callback;
        final /* synthetic */ MediationInfo $mediationInfo;
        final /* synthetic */ String $watermarkString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35711(MediationInfo mediationInfo, String str, String str2, p pVar, zu.d<? super C35711> dVar) {
            super(2, dVar);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = pVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new C35711(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object objC;
            v vVar;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                com.moloco.sdk.acm.recorder.c cVarCreate = com.moloco.sdk.acm.recorder.c.Companion.create(this.$mediationInfo.getName());
                com.moloco.sdk.internal.publisher.k adCreator = Moloco.INSTANCE.getAdCreator();
                String name = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                objC = adCreator.c(name, str, cVarCreate, str2, this);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                objC = obj;
            }
            w wVar = (w) objC;
            if (wVar instanceof w.b) {
                vVar = e0.to(((w.b) wVar).a(), null);
            } else {
                if (!(wVar instanceof w.a)) {
                    throw new t();
                }
                vVar = e0.to(null, ((w.a) wVar).a());
            }
            InterstitialAd interstitialAd = (InterstitialAd) vVar.component1();
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) vVar.component2();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("Interstitial for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(interstitialAd == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.invoke(interstitialAd, adCreateError);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((C35711) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.moloco.sdk.publisher.Moloco$createMREC$1", f = "Moloco.kt", i = {}, l = {267}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.publisher.Moloco$createMREC$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35721 extends n implements p {
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ p $callback;
        final /* synthetic */ MediationInfo $mediationInfo;
        final /* synthetic */ String $watermarkString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35721(MediationInfo mediationInfo, String str, String str2, p pVar, zu.d<? super C35721> dVar) {
            super(2, dVar);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = pVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new C35721(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object objD;
            v vVar;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                com.moloco.sdk.acm.recorder.c cVarCreate = com.moloco.sdk.acm.recorder.c.Companion.create(this.$mediationInfo.getName());
                com.moloco.sdk.internal.publisher.k adCreator = Moloco.INSTANCE.getAdCreator();
                String name = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                objD = adCreator.d(name, str, cVarCreate, str2, this);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                objD = obj;
            }
            w wVar = (w) objD;
            if (wVar instanceof w.b) {
                vVar = e0.to(((w.b) wVar).a(), null);
            } else {
                if (!(wVar instanceof w.a)) {
                    throw new t();
                }
                vVar = e0.to(null, ((w.a) wVar).a());
            }
            Banner banner = (Banner) vVar.component1();
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) vVar.component2();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("MREC for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(banner == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.invoke(banner, adCreateError);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((C35721) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.moloco.sdk.publisher.Moloco$createNativeAd$1", f = "Moloco.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.publisher.Moloco$createNativeAd$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35731 extends n implements p {
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ p $callback;
        final /* synthetic */ MediationInfo $mediationInfo;
        final /* synthetic */ String $watermarkString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35731(MediationInfo mediationInfo, String str, String str2, p pVar, zu.d<? super C35731> dVar) {
            super(2, dVar);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = pVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new C35731(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object objE;
            v vVar;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                com.moloco.sdk.acm.recorder.c cVarCreate = com.moloco.sdk.acm.recorder.c.Companion.create(this.$mediationInfo.getName());
                com.moloco.sdk.internal.publisher.k adCreator = Moloco.INSTANCE.getAdCreator();
                String name = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                objE = adCreator.e(name, str, cVarCreate, str2, this);
                if (objE == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                objE = obj;
            }
            w wVar = (w) objE;
            if (wVar instanceof w.b) {
                vVar = e0.to(((w.b) wVar).a(), null);
            } else {
                if (!(wVar instanceof w.a)) {
                    throw new t();
                }
                vVar = e0.to(null, ((w.a) wVar).a());
            }
            NativeAd nativeAd = (NativeAd) vVar.component1();
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) vVar.component2();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("Native Ad for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(nativeAd == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.invoke(nativeAd, adCreateError);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((C35731) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.moloco.sdk.publisher.Moloco$createRewardedInterstitial$1", f = "Moloco.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.publisher.Moloco$createRewardedInterstitial$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35741 extends n implements p {
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ p $callback;
        final /* synthetic */ MediationInfo $mediationInfo;
        final /* synthetic */ String $watermarkString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35741(MediationInfo mediationInfo, String str, String str2, p pVar, zu.d<? super C35741> dVar) {
            super(2, dVar);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = pVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new C35741(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object objF;
            v vVar;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                com.moloco.sdk.acm.recorder.c cVarCreate = com.moloco.sdk.acm.recorder.c.Companion.create(this.$mediationInfo.getName());
                com.moloco.sdk.internal.publisher.k adCreator = Moloco.INSTANCE.getAdCreator();
                String name = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                objF = adCreator.f(name, str, cVarCreate, str2, this);
                if (objF == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                objF = obj;
            }
            w wVar = (w) objF;
            if (wVar instanceof w.b) {
                vVar = e0.to(((w.b) wVar).a(), null);
            } else {
                if (!(wVar instanceof w.a)) {
                    throw new t();
                }
                vVar = e0.to(null, ((w.a) wVar).a());
            }
            RewardedInterstitialAd rewardedInterstitialAd = (RewardedInterstitialAd) vVar.component1();
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) vVar.component2();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("Rewarded for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(rewardedInterstitialAd == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.invoke(rewardedInterstitialAd, adCreateError);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((C35741) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.moloco.sdk.publisher.Moloco$getBidToken$1", f = "Moloco.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.publisher.Moloco$getBidToken$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35751 extends n implements p {
        final /* synthetic */ MolocoBidTokenListener $listener;
        final /* synthetic */ com.moloco.sdk.acm.recorder.c $metricsRecorder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35751(com.moloco.sdk.acm.recorder.c cVar, MolocoBidTokenListener molocoBidTokenListener, zu.d<? super C35751> dVar) {
            super(2, dVar);
            this.$metricsRecorder = cVar;
            this.$listener = molocoBidTokenListener;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new C35751(this.$metricsRecorder, this.$listener, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Handling bid token request", null, false, 12, null);
                i bidTokenHandler = Moloco.INSTANCE.getBidTokenHandler();
                com.moloco.sdk.acm.recorder.c cVar = this.$metricsRecorder;
                MolocoBidTokenListener molocoBidTokenListener = this.$listener;
                this.label = 1;
                if (bidTokenHandler.a(cVar, molocoBidTokenListener, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((C35751) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.moloco.sdk.publisher.Moloco$initialize$1", f = "Moloco.kt", i = {}, l = {Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.publisher.Moloco$initialize$1, reason: invalid class name and case insensitive filesystem */
    public static final class C35761 extends n implements p {
        final /* synthetic */ MolocoInitParams $initParam;
        final /* synthetic */ MolocoInitializationListener $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35761(MolocoInitParams molocoInitParams, MolocoInitializationListener molocoInitializationListener, zu.d<? super C35761> dVar) {
            super(2, dVar);
            this.$initParam = molocoInitParams;
            this.$listener = molocoInitializationListener;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new C35761(this.$initParam, this.$listener, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00e3, code lost:
        
            if (r1.updateAndroidClientMetricsOnInitSuccess(r15) == r6) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                Method dump skipped, instructions count: 271
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.publisher.Moloco.C35761.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((C35761) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    private Moloco() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.moloco.sdk.internal.publisher.k adCreator_delegate$lambda$6() {
        return new com.moloco.sdk.internal.publisher.k(INSTANCE.getInitializationHandler().d(), a.h.f47463a.h(), new com.moloco.sdk.internal.publisher.n(null, 0L, 3, null), new Moloco$adCreator$2$1(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j bidTokenHandler_delegate$lambda$5() {
        return new j(com.moloco.sdk.internal.services.bidtoken.o.a(), INSTANCE.getInitializationHandler(), a.h.f47463a.h());
    }

    public static final void createBanner(MediationInfo mediationInfo, String adUnitId, String str, p callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mediationInfo, "mediationInfo");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating banner async for adUnitId: " + adUnitId, null, false, 12, null);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new AnonymousClass1(mediationInfo, adUnitId, str, callback, null), 3, null);
    }

    public static /* synthetic */ void createBanner$default(MediationInfo mediationInfo, String str, String str2, p pVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        createBanner(mediationInfo, str, str2, pVar);
    }

    public static final void createBannerTablet(MediationInfo mediationInfo, String adUnitId, String str, p callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mediationInfo, "mediationInfo");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating banner tablet async for adUnitId: " + adUnitId, null, false, 12, null);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C35701(mediationInfo, adUnitId, str, callback, null), 3, null);
    }

    public static /* synthetic */ void createBannerTablet$default(MediationInfo mediationInfo, String str, String str2, p pVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        createBannerTablet(mediationInfo, str, str2, pVar);
    }

    public static final void createInterstitial(MediationInfo mediationInfo, String adUnitId, String str, p callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mediationInfo, "mediationInfo");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating interstitial ad for mediation async for adUnitId: " + adUnitId, null, false, 12, null);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C35711(mediationInfo, adUnitId, str, callback, null), 3, null);
    }

    public static /* synthetic */ void createInterstitial$default(MediationInfo mediationInfo, String str, String str2, p pVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        createInterstitial(mediationInfo, str, str2, pVar);
    }

    public static final void createMREC(MediationInfo mediationInfo, String adUnitId, String str, p callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mediationInfo, "mediationInfo");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating banner MREC async for adUnitId: " + adUnitId, null, false, 12, null);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C35721(mediationInfo, adUnitId, str, callback, null), 3, null);
    }

    public static /* synthetic */ void createMREC$default(MediationInfo mediationInfo, String str, String str2, p pVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        createMREC(mediationInfo, str, str2, pVar);
    }

    public static final void createNativeAd(MediationInfo mediationInfo, String adUnitId, String str, p callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mediationInfo, "mediationInfo");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating native ad for mediation async for adUnitId: " + adUnitId, null, false, 12, null);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C35731(mediationInfo, adUnitId, str, callback, null), 3, null);
    }

    public static /* synthetic */ void createNativeAd$default(MediationInfo mediationInfo, String str, String str2, p pVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        createNativeAd(mediationInfo, str, str2, pVar);
    }

    public static final void createRewardedInterstitial(MediationInfo mediationInfo, String adUnitId, String str, p callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mediationInfo, "mediationInfo");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating rewarded ad for mediation async for adUnitId: " + adUnitId, null, false, 12, null);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C35741(mediationInfo, adUnitId, str, callback, null), 3, null);
    }

    public static /* synthetic */ void createRewardedInterstitial$default(MediationInfo mediationInfo, String str, String str2, p pVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        createRewardedInterstitial(mediationInfo, str, str2, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.moloco.sdk.internal.publisher.k getAdCreator() {
        return (com.moloco.sdk.internal.publisher.k) adCreator$delegate.getValue();
    }

    public static final String getBidRequestEndpoint() {
        String adServerUrl;
        Init$SDKInitResponse init$SDKInitResponseE = INSTANCE.getInitializationHandler().e();
        if (init$SDKInitResponseE == null || (adServerUrl = init$SDKInitResponseE.getAdServerUrl()) == null) {
            return null;
        }
        return (k0.startsWith$default(adServerUrl, DtbConstants.HTTP, false, 2, null) || k0.startsWith$default(adServerUrl, DtbConstants.HTTPS, false, 2, null)) ? adServerUrl : DtbConstants.HTTPS.concat(adServerUrl);
    }

    public static /* synthetic */ void getBidRequestEndpoint$annotations() {
    }

    public static final void getBidToken(MediationInfo mediationInfo, Context context, MolocoBidTokenListener listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mediationInfo, "mediationInfo");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        com.moloco.sdk.internal.android_context.b.a(context);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Fetching bid token", null, false, 12, null);
        BuildersKt__Builders_commonKt.launch$default(com.moloco.sdk.internal.scheduling.d.f46748a.b(), null, null, new C35751(com.moloco.sdk.acm.recorder.c.Companion.create(mediationInfo.getName()), listener, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i getBidTokenHandler() {
        return (i) bidTokenHandler$delegate.getValue();
    }

    public static /* synthetic */ void getInitJob$annotations() {
    }

    public static /* synthetic */ void getInitParams$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j0 getInitializationHandler() {
        return (j0) initializationHandler$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 initializationHandler_delegate$lambda$4() {
        return new j0(a.h.f47463a.h());
    }

    public static final void initialize(MolocoInitParams initParam) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initParam, "initParam");
        initialize$default(initParam, null, 2, null);
    }

    public static /* synthetic */ void initialize$default(MolocoInitParams molocoInitParams, MolocoInitializationListener molocoInitializationListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            molocoInitializationListener = null;
        }
        initialize(molocoInitParams, molocoInitializationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeAndroidClientMetrics(MolocoInitParams molocoInitParams) {
        if (!getInitializationHandler().c()) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Moloco", "ACM cannot be initialized as Moloco SDK cannot be initialized", null, false, 12, null);
            return;
        }
        com.moloco.sdk.internal.configs.a aVarC = com.moloco.sdk.internal.configs.b.c();
        com.moloco.sdk.acm.a aVar = com.moloco.sdk.acm.a.f45482a;
        String appKey = molocoInitParams.getAppKey();
        String strD = aVarC.d();
        Context appContext = molocoInitParams.getAppContext();
        long jC = aVarC.c();
        v vVar = e0.to("AppKey", molocoInitParams.getAppKey());
        a.e eVar = a.e.f47447a;
        com.moloco.sdk.acm.a.initialize$default(aVar, new com.moloco.sdk.acm.f(appKey, strD, appContext, jC, p1.mapOf(vVar, e0.to("AppBundle", eVar.h().invoke().b()), e0.to("AppVersion", eVar.h().invoke().c()), e0.to("SdkVersion", BuildConfig.SDK_VERSION_NAME), e0.to("OS", eVar.l().invoke().w()), e0.to(Q6.G, eVar.l().invoke().x()))), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeILRD() {
        Init$SDKInitResponse init$SDKInitResponseE = getInitializationHandler().e();
        if (init$SDKInitResponseE == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Moloco", "ILRD cannot be initialized as Moloco SDK is not initialized", null, false, 12, null);
            return;
        }
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(a.b.f47437a.g().b(init$SDKInitResponseE));
        if (thM7134exceptionOrNullimpl != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", e2.o(thM7134exceptionOrNullimpl, new StringBuilder("ILRD initialization failed. ")), null, false, 12, null);
        }
    }

    public static final boolean isInitialized() {
        return INSTANCE.getInitializationHandler().d().getValue() == Initialization.SUCCESS;
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    private final void logMolocoInfo(MolocoInitParams molocoInitParams) {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "Moloco", "=====================================", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "Moloco SDK initializing", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "SDK Version: 4.0.0", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "Mediation: " + molocoInitParams.getMediationInfo().getName(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "isInitialized: " + isInitialized(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "=====================================", null, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processInitConfigs(Init$SDKInitResponse init$SDKInitResponse) {
        if (init$SDKInitResponse.hasEventCollectionConfig()) {
            Init$SDKInitResponse.EventCollectionConfig eventCollectionConfig = init$SDKInitResponse.getEventCollectionConfig();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.debug$default(molocoLogger, "Moloco", "Init response has eventCollectionConfig", false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "eventCollectionConfig:", false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "eventCollectionEnabled: " + eventCollectionConfig.getEventCollectionEnabled(), false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "mrefCollectionEnabled: " + eventCollectionConfig.getMrefCollectionEnabled(), false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "appFgUrl: " + eventCollectionConfig.getAppForegroundTrackingUrl(), false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "appBgUrl: " + eventCollectionConfig.getAppBackgroundTrackingUrl(), false, 4, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVarC = a.k.f47476a.c();
            boolean eventCollectionEnabled = eventCollectionConfig.getEventCollectionEnabled();
            boolean mrefCollectionEnabled = eventCollectionConfig.getMrefCollectionEnabled();
            String appForegroundTrackingUrl = eventCollectionConfig.getAppForegroundTrackingUrl();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(appForegroundTrackingUrl, "getAppForegroundTrackingUrl(...)");
            String appBackgroundTrackingUrl = eventCollectionConfig.getAppBackgroundTrackingUrl();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(appBackgroundTrackingUrl, "getAppBackgroundTrackingUrl(...)");
            cVarC.a(eventCollectionEnabled, mrefCollectionEnabled, appForegroundTrackingUrl, appBackgroundTrackingUrl);
            if (eventCollectionConfig.getEventCollectionEnabled()) {
                a.b.f47437a.e().a();
            }
        } else {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "Moloco", "Init response does not have eventCollectionConfig", false, 4, null);
        }
        a.c.f47443a.b().a(init$SDKInitResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateAndroidClientMetricsOnInitSuccess(zu.d<? super x0> dVar) {
        Object objUpdateConfig = com.moloco.sdk.acm.a.f45482a.updateConfig(new h(((com.moloco.sdk.internal.configs.a) a.c.f47443a.b().a(com.moloco.sdk.internal.configs.a.class, com.moloco.sdk.internal.configs.b.c())).d(), bv.b.boxLong(r0.c())), dVar);
        return objUpdateConfig == e.getCOROUTINE_SUSPENDED() ? objUpdateConfig : x0.f87415a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (kotlinx.coroutines.JobKt.cancelAndJoin(r13, r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r13.b(r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clearState$moloco_sdk_release(zu.d<? super tu.x0> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.moloco.sdk.publisher.Moloco$clearState$1
            if (r0 == 0) goto L13
            r0 = r13
            com.moloco.sdk.publisher.Moloco$clearState$1 r0 = (com.moloco.sdk.publisher.Moloco$clearState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.moloco.sdk.publisher.Moloco$clearState$1 r0 = new com.moloco.sdk.publisher.Moloco$clearState$1
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            tu.a0.throwOnFailure(r13)
            goto L6f
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L35:
            java.lang.Object r2 = r0.L$0
            com.moloco.sdk.publisher.Moloco r2 = (com.moloco.sdk.publisher.Moloco) r2
            tu.a0.throwOnFailure(r13)
            goto L5e
        L3d:
            tu.a0.throwOnFailure(r13)
            com.moloco.sdk.internal.MolocoLogger r6 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r10 = 4
            r11 = 0
            java.lang.String r7 = "Moloco"
            java.lang.String r8 = "clearState() unit testing function called"
            r9 = 0
            com.moloco.sdk.internal.MolocoLogger.debug$default(r6, r7, r8, r9, r10, r11)
            com.moloco.sdk.publisher.Moloco.initParams = r5
            kotlinx.coroutines.Job r13 = com.moloco.sdk.publisher.Moloco.initJob
            if (r13 == 0) goto L5d
            r0.L$0 = r12
            r0.label = r4
            java.lang.Object r13 = kotlinx.coroutines.JobKt.cancelAndJoin(r13, r0)
            if (r13 != r1) goto L5d
            goto L6e
        L5d:
            r2 = r12
        L5e:
            com.moloco.sdk.publisher.Moloco.initJob = r5
            com.moloco.sdk.internal.publisher.j0 r13 = r2.getInitializationHandler()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r13 = r13.b(r0)
            if (r13 != r1) goto L6f
        L6e:
            return r1
        L6f:
            tu.x0 r13 = tu.x0.f87415a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.publisher.Moloco.clearState$moloco_sdk_release(zu.d):java.lang.Object");
    }

    public final String getAppKey$moloco_sdk_release() {
        MolocoInitParams molocoInitParams = initParams;
        if (molocoInitParams != null) {
            return molocoInitParams.getAppKey();
        }
        return null;
    }

    public final Job getInitJob() {
        return initJob;
    }

    public final MolocoInitParams getInitParams() {
        return initParams;
    }

    public final void setInitJob(Job job) {
        initJob = job;
    }

    public final void setInitParams(MolocoInitParams molocoInitParams) {
        initParams = molocoInitParams;
    }

    public static final synchronized void initialize(MolocoInitParams initParam, MolocoInitializationListener molocoInitializationListener) {
        try {
            kotlin.jvm.internal.e0.checkNotNullParameter(initParam, "initParam");
            Moloco moloco = INSTANCE;
            moloco.logMolocoInfo(initParam);
            if (initParam.getAppKey().length() == 0) {
                throw new IllegalArgumentException("Moloco SDK initialized with empty appKey");
            }
            if (isInitialized()) {
                if (kotlin.jvm.internal.e0.areEqual(initParam.getAppKey(), moloco.getAppKey$moloco_sdk_release())) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Already initialized. Returning and notifying listener", null, false, 12, null);
                    if (molocoInitializationListener != null) {
                        com.moloco.sdk.internal.publisher.k0.a(molocoInitializationListener, j0.f46315f.a());
                    }
                } else {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Already initialized but with different appKey. Returning error and notifying listener", null, false, 12, null);
                    if (molocoInitializationListener != null) {
                        com.moloco.sdk.internal.publisher.k0.a(molocoInitializationListener, j0.f46315f.a("Moloco SDK failed to initialize due to unexpected app key"));
                    }
                }
                return;
            }
            Job job = initJob;
            if (job == null || !job.isActive()) {
                initParams = initParam;
                com.moloco.sdk.internal.android_context.b.a(initParam.getAppContext());
                initJob = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.c.a().getIo()), null, null, new C35761(initParam, molocoInitializationListener, null), 3, null);
                return;
            }
            String appKey = initParam.getAppKey();
            MolocoInitParams molocoInitParams = initParams;
            if (kotlin.jvm.internal.e0.areEqual(appKey, molocoInitParams != null ? molocoInitParams.getAppKey() : null)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", QFzuMMDfrzagDN.RyicTMZhUCnKvtn, null, false, 12, null);
            } else {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Init Job active with different appKey. Notifying listener and avoiding init", null, false, 12, null);
                if (molocoInitializationListener != null) {
                    com.moloco.sdk.internal.publisher.k0.a(molocoInitializationListener, j0.f46315f.a("Moloco SDK failed to initialize due to unexpected app key"));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
