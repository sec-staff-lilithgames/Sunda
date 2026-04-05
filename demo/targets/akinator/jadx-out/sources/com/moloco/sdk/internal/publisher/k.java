package com.moloco.sdk.internal.publisher;

import android.content.Context;
import android.view.ViewParent;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.k;
import com.moloco.sdk.internal.w;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.service_locator.a;
import java.util.Locale;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final StateFlow f46350a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.i f46351b;

    /* renamed from: c, reason: collision with root package name */
    public final n f46352c;

    /* renamed from: d, reason: collision with root package name */
    public final kv.l f46353d;

    /* renamed from: e, reason: collision with root package name */
    public final zu.m f46354e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public f0 f46355i;

        /* renamed from: j, reason: collision with root package name */
        public com.moloco.sdk.acm.recorder.c f46356j;

        /* renamed from: k, reason: collision with root package name */
        public com.moloco.sdk.acm.g f46357k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f46358l;

        /* renamed from: n, reason: collision with root package name */
        public int f46360n;

        public b(zu.d<? super b> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46358l = obj;
            this.f46360n |= Integer.MIN_VALUE;
            return k.this.a(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f46361i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ kv.l f46362j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kv.l lVar, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f46362j = lVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.internal.e> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new c(this.f46362j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46361i;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
                return obj;
            }
            tu.a0.throwOnFailure(obj);
            this.f46361i = 1;
            Object objInvoke = this.f46362j.invoke(this);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public f0 f46363i;

        /* renamed from: j, reason: collision with root package name */
        public String f46364j;

        /* renamed from: k, reason: collision with root package name */
        public com.moloco.sdk.acm.g f46365k;

        /* renamed from: l, reason: collision with root package name */
        public long f46366l;

        /* renamed from: m, reason: collision with root package name */
        public int f46367m;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.c f46369o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f46370p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f46371q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f46372r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.acm.recorder.c cVar, String str, String str2, String str3, zu.d<? super d> dVar) {
            super(2, dVar);
            this.f46369o = cVar;
            this.f46370p = str;
            this.f46371q = str2;
            this.f46372r = str3;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.internal.w> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return k.this.new d(this.f46369o, this.f46370p, this.f46371q, this.f46372r, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            f0 f0Var;
            long jInvoke;
            String strA;
            Object objA;
            com.moloco.sdk.acm.g gVar;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46367m;
            String str = this.f46370p;
            com.moloco.sdk.acm.recorder.c cVar = this.f46369o;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                f0Var = f0.f46252b;
                k kVar = k.this;
                jInvoke = kVar.f46351b.invoke();
                strA = kVar.a();
                com.moloco.sdk.acm.g gVarWithTag = cVar.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.c.f45878j.c()).withTag(com.moloco.sdk.internal.client_metrics_data.b.f45864e.c(), f0Var.name()).withTag("initial_sdk_init_state", strA);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + f0Var + " ad with adUnitId: " + str, null, false, 12, null);
                kv.l lVar = kVar.f46353d;
                this.f46363i = f0Var;
                this.f46364j = strA;
                this.f46365k = gVarWithTag;
                this.f46366l = jInvoke;
                this.f46367m = 1;
                objA = kVar.a(lVar, f0Var, cVar, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                gVar = gVarWithTag;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j10 = this.f46366l;
                com.moloco.sdk.acm.g gVar2 = this.f46365k;
                strA = this.f46364j;
                f0Var = this.f46363i;
                tu.a0.throwOnFailure(obj);
                jInvoke = j10;
                gVar = gVar2;
                objA = obj;
            }
            String str2 = strA;
            com.moloco.sdk.internal.e eVar = (com.moloco.sdk.internal.e) objA;
            if (eVar != null) {
                Context contextA = com.moloco.sdk.service_locator.a.f47434a.a();
                com.moloco.sdk.internal.services.r rVarE = a.b.f47437a.e();
                a.h hVar = a.h.f47463a;
                ViewParent viewParentB = eVar.b(contextA, rVarE, this.f46370p, hVar.j(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b(this.f46371q), new j(AdFormatType.BANNER, com.moloco.sdk.internal.mediators.a.a(this.f46372r), null), hVar.i(), k.b.f46069c, this.f46369o);
                if (viewParentB != null) {
                    com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.f45847l.c());
                    com.moloco.sdk.internal.client_metrics_data.b bVar = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
                    cVar.recordCountEvent(dVar.withTag(bVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.b.f45864e.c(), f0Var.name()).withTag("initial_sdk_init_state", str2));
                    cVar.recordTimerEvent(gVar.withTag(bVar.c(), "success"));
                    if (viewParentB instanceof e0) {
                        ((e0) viewParentB).setCreateAdObjectStartTime(jInvoke);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + f0Var + " ad with adUnitId: " + str, null, false, 12, null);
                    return new w.b(viewParentB);
                }
            }
            MolocoAdError.AdCreateError adCreateErrorA = k.this.a(this.f46370p, str2, gVar, f0Var, this.f46369o);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + f0Var + " with reason: " + adCreateErrorA, null, false, 12, null);
            return new w.a(adCreateErrorA);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public f0 f46373i;

        /* renamed from: j, reason: collision with root package name */
        public String f46374j;

        /* renamed from: k, reason: collision with root package name */
        public com.moloco.sdk.acm.g f46375k;

        /* renamed from: l, reason: collision with root package name */
        public long f46376l;

        /* renamed from: m, reason: collision with root package name */
        public int f46377m;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.c f46379o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f46380p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f46381q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f46382r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.moloco.sdk.acm.recorder.c cVar, String str, String str2, String str3, zu.d<? super e> dVar) {
            super(2, dVar);
            this.f46379o = cVar;
            this.f46380p = str;
            this.f46381q = str2;
            this.f46382r = str3;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.internal.w> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return k.this.new e(this.f46379o, this.f46380p, this.f46381q, this.f46382r, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            f0 f0Var;
            long jInvoke;
            String strA;
            Object objA;
            com.moloco.sdk.acm.g gVar;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46377m;
            String str = this.f46380p;
            com.moloco.sdk.acm.recorder.c cVar = this.f46379o;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                f0Var = f0.f46253c;
                k kVar = k.this;
                jInvoke = kVar.f46351b.invoke();
                strA = kVar.a();
                com.moloco.sdk.acm.g gVarWithTag = cVar.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.c.f45878j.c()).withTag(com.moloco.sdk.internal.client_metrics_data.b.f45864e.c(), f0Var.name()).withTag("initial_sdk_init_state", strA);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + f0Var + " ad with adUnitId: " + str, null, false, 12, null);
                kv.l lVar = kVar.f46353d;
                this.f46373i = f0Var;
                this.f46374j = strA;
                this.f46375k = gVarWithTag;
                this.f46376l = jInvoke;
                this.f46377m = 1;
                objA = kVar.a(lVar, f0Var, cVar, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                gVar = gVarWithTag;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j10 = this.f46376l;
                com.moloco.sdk.acm.g gVar2 = this.f46375k;
                strA = this.f46374j;
                f0Var = this.f46373i;
                tu.a0.throwOnFailure(obj);
                jInvoke = j10;
                gVar = gVar2;
                objA = obj;
            }
            String str2 = strA;
            com.moloco.sdk.internal.e eVar = (com.moloco.sdk.internal.e) objA;
            if (eVar != null) {
                Context contextA = com.moloco.sdk.service_locator.a.f47434a.a();
                com.moloco.sdk.internal.services.r rVarE = a.b.f47437a.e();
                a.h hVar = a.h.f47463a;
                ViewParent viewParentC = eVar.c(contextA, rVarE, this.f46380p, hVar.j(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b(this.f46381q), new j(AdFormatType.BANNER, com.moloco.sdk.internal.mediators.a.a(this.f46382r), null), hVar.i(), k.c.f46070c, this.f46379o);
                if (viewParentC != null) {
                    com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.f45847l.c());
                    com.moloco.sdk.internal.client_metrics_data.b bVar = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
                    cVar.recordCountEvent(dVar.withTag(bVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.b.f45864e.c(), f0Var.name()).withTag("initial_sdk_init_state", str2));
                    cVar.recordTimerEvent(gVar.withTag(bVar.c(), "success"));
                    if (viewParentC instanceof e0) {
                        ((e0) viewParentC).setCreateAdObjectStartTime(jInvoke);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + f0Var + " ad with adUnitId: " + str, null, false, 12, null);
                    return new w.b(viewParentC);
                }
            }
            MolocoAdError.AdCreateError adCreateErrorA = k.this.a(this.f46380p, str2, gVar, f0Var, this.f46379o);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + f0Var + " with reason: " + adCreateErrorA, null, false, 12, null);
            return new w.a(adCreateErrorA);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public f0 f46383i;

        /* renamed from: j, reason: collision with root package name */
        public String f46384j;

        /* renamed from: k, reason: collision with root package name */
        public com.moloco.sdk.acm.g f46385k;

        /* renamed from: l, reason: collision with root package name */
        public long f46386l;

        /* renamed from: m, reason: collision with root package name */
        public int f46387m;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.c f46389o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f46390p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f46391q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f46392r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.acm.recorder.c cVar, String str, String str2, String str3, zu.d<? super f> dVar) {
            super(2, dVar);
            this.f46389o = cVar;
            this.f46390p = str;
            this.f46391q = str2;
            this.f46392r = str3;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.internal.w> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return k.this.new f(this.f46389o, this.f46390p, this.f46391q, this.f46392r, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            f0 f0Var;
            long jInvoke;
            String strA;
            Object objA;
            com.moloco.sdk.acm.g gVar;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46387m;
            String str = this.f46390p;
            com.moloco.sdk.acm.recorder.c cVar = this.f46389o;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                f0Var = f0.f46257h;
                k kVar = k.this;
                jInvoke = kVar.f46351b.invoke();
                strA = kVar.a();
                com.moloco.sdk.acm.g gVarWithTag = cVar.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.c.f45878j.c()).withTag(com.moloco.sdk.internal.client_metrics_data.b.f45864e.c(), f0Var.name()).withTag("initial_sdk_init_state", strA);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + f0Var + " ad with adUnitId: " + str, null, false, 12, null);
                kv.l lVar = kVar.f46353d;
                this.f46383i = f0Var;
                this.f46384j = strA;
                this.f46385k = gVarWithTag;
                this.f46386l = jInvoke;
                this.f46387m = 1;
                objA = kVar.a(lVar, f0Var, cVar, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                gVar = gVarWithTag;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j10 = this.f46386l;
                com.moloco.sdk.acm.g gVar2 = this.f46385k;
                strA = this.f46384j;
                f0Var = this.f46383i;
                tu.a0.throwOnFailure(obj);
                jInvoke = j10;
                gVar = gVar2;
                objA = obj;
            }
            String str2 = strA;
            com.moloco.sdk.internal.e eVar = (com.moloco.sdk.internal.e) objA;
            if (eVar != null) {
                Context contextA = com.moloco.sdk.service_locator.a.f47434a.a();
                com.moloco.sdk.internal.services.r rVarE = a.b.f47437a.e();
                a.h hVar = a.h.f47463a;
                InterstitialAd interstitialAdA = eVar.a(contextA, rVarE, this.f46390p, hVar.j(), hVar.f(), a.i.f47469a.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b(this.f46391q), new j(AdFormatType.INTERSTITIAL, com.moloco.sdk.internal.mediators.a.b(this.f46392r), null), this.f46389o);
                if (interstitialAdA != null) {
                    com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.f45847l.c());
                    com.moloco.sdk.internal.client_metrics_data.b bVar = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
                    cVar.recordCountEvent(dVar.withTag(bVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.b.f45864e.c(), f0Var.name()).withTag("initial_sdk_init_state", str2.toString()));
                    cVar.recordTimerEvent(gVar.withTag(bVar.c(), "success"));
                    if (interstitialAdA instanceof e0) {
                        ((e0) interstitialAdA).setCreateAdObjectStartTime(jInvoke);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + f0Var + " ad with adUnitId: " + str, null, false, 12, null);
                    return new w.b(interstitialAdA);
                }
            }
            MolocoAdError.AdCreateError adCreateErrorA = k.this.a(this.f46390p, str2, gVar, f0Var, this.f46389o);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + f0Var + " with reason: " + adCreateErrorA, null, false, 12, null);
            return new w.a(adCreateErrorA);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public f0 f46393i;

        /* renamed from: j, reason: collision with root package name */
        public String f46394j;

        /* renamed from: k, reason: collision with root package name */
        public com.moloco.sdk.acm.g f46395k;

        /* renamed from: l, reason: collision with root package name */
        public long f46396l;

        /* renamed from: m, reason: collision with root package name */
        public int f46397m;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.c f46399o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f46400p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f46401q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f46402r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.moloco.sdk.acm.recorder.c cVar, String str, String str2, String str3, zu.d<? super g> dVar) {
            super(2, dVar);
            this.f46399o = cVar;
            this.f46400p = str;
            this.f46401q = str2;
            this.f46402r = str3;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.internal.w> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return k.this.new g(this.f46399o, this.f46400p, this.f46401q, this.f46402r, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            f0 f0Var;
            long jA;
            String strA;
            Object objA;
            com.moloco.sdk.acm.g gVar;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46397m;
            String str = this.f46400p;
            com.moloco.sdk.acm.recorder.c cVar = this.f46399o;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                f0Var = f0.f46254e;
                k kVar = k.this;
                jA = kVar.f46351b.a();
                strA = kVar.a();
                com.moloco.sdk.acm.g gVarWithTag = cVar.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.c.f45878j.c()).withTag(com.moloco.sdk.internal.client_metrics_data.b.f45864e.c(), f0Var.name()).withTag("initial_sdk_init_state", strA);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + f0Var + " ad with adUnitId: " + str, null, false, 12, null);
                kv.l lVar = kVar.f46353d;
                this.f46393i = f0Var;
                this.f46394j = strA;
                this.f46395k = gVarWithTag;
                this.f46396l = jA;
                this.f46397m = 1;
                objA = kVar.a(lVar, f0Var, cVar, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                gVar = gVarWithTag;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j10 = this.f46396l;
                com.moloco.sdk.acm.g gVar2 = this.f46395k;
                strA = this.f46394j;
                f0Var = this.f46393i;
                tu.a0.throwOnFailure(obj);
                jA = j10;
                gVar = gVar2;
                objA = obj;
            }
            String str2 = strA;
            com.moloco.sdk.internal.e eVar = (com.moloco.sdk.internal.e) objA;
            if (eVar != null) {
                Context contextA = com.moloco.sdk.service_locator.a.f47434a.a();
                com.moloco.sdk.internal.services.r rVarE = a.b.f47437a.e();
                a.h hVar = a.h.f47463a;
                ViewParent viewParentA = eVar.a(contextA, rVarE, this.f46400p, hVar.j(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b(this.f46401q), new j(AdFormatType.MREC, com.moloco.sdk.internal.mediators.a.a(this.f46402r), null), hVar.i(), k.a.f46068c, this.f46399o);
                if (viewParentA != null) {
                    com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.f45847l.c());
                    com.moloco.sdk.internal.client_metrics_data.b bVar = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
                    cVar.recordCountEvent(dVar.withTag(bVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.b.f45864e.c(), f0Var.name()).withTag("initial_sdk_init_state", str2.toString()));
                    cVar.recordTimerEvent(gVar.withTag(bVar.c(), "success"));
                    if (viewParentA instanceof e0) {
                        ((e0) viewParentA).setCreateAdObjectStartTime(jA);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + f0Var + " ad with adUnitId: " + str, null, false, 12, null);
                    return new w.b(viewParentA);
                }
            }
            MolocoAdError.AdCreateError adCreateErrorA = k.this.a(this.f46400p, str2, gVar, f0Var, this.f46399o);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + f0Var + " with reason: " + adCreateErrorA, null, false, 12, null);
            return new w.a(adCreateErrorA);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public f0 f46403i;

        /* renamed from: j, reason: collision with root package name */
        public String f46404j;

        /* renamed from: k, reason: collision with root package name */
        public com.moloco.sdk.acm.g f46405k;

        /* renamed from: l, reason: collision with root package name */
        public long f46406l;

        /* renamed from: m, reason: collision with root package name */
        public int f46407m;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.c f46409o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f46410p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f46411q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f46412r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.moloco.sdk.acm.recorder.c cVar, String str, String str2, String str3, zu.d<? super h> dVar) {
            super(2, dVar);
            this.f46409o = cVar;
            this.f46410p = str;
            this.f46411q = str2;
            this.f46412r = str3;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.internal.w> dVar) {
            return ((h) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return k.this.new h(this.f46409o, this.f46410p, this.f46411q, this.f46412r, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            f0 f0Var;
            long jA;
            String strA;
            Object objA;
            com.moloco.sdk.acm.g gVar;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46407m;
            String str = this.f46410p;
            com.moloco.sdk.acm.recorder.c cVar = this.f46409o;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                f0Var = f0.f46255f;
                k kVar = k.this;
                jA = kVar.f46351b.a();
                strA = kVar.a();
                com.moloco.sdk.acm.g gVarWithTag = cVar.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.c.f45878j.c()).withTag(com.moloco.sdk.internal.client_metrics_data.b.f45864e.c(), f0Var.name()).withTag("initial_sdk_init_state", strA);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + f0Var + " ad with adUnitId: " + str, null, false, 12, null);
                kv.l lVar = kVar.f46353d;
                this.f46403i = f0Var;
                this.f46404j = strA;
                this.f46405k = gVarWithTag;
                this.f46406l = jA;
                this.f46407m = 1;
                objA = kVar.a(lVar, f0Var, cVar, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                gVar = gVarWithTag;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j10 = this.f46406l;
                com.moloco.sdk.acm.g gVar2 = this.f46405k;
                strA = this.f46404j;
                f0Var = this.f46403i;
                tu.a0.throwOnFailure(obj);
                jA = j10;
                gVar = gVar2;
                objA = obj;
            }
            String str2 = strA;
            com.moloco.sdk.internal.e eVar = (com.moloco.sdk.internal.e) objA;
            if (eVar != null) {
                Context contextA = com.moloco.sdk.service_locator.a.f47434a.a();
                com.moloco.sdk.internal.services.r rVarE = a.b.f47437a.e();
                com.moloco.sdk.internal.services.y yVarI = a.e.f47447a.i();
                a.h hVar = a.h.f47463a;
                NativeAd nativeAdA = eVar.a(contextA, rVarE, yVarI, this.f46410p, hVar.j(), hVar.f(), a.i.f47469a.c(), hVar.i(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b(this.f46411q), new j(AdFormatType.NATIVE, com.moloco.sdk.internal.mediators.a.c(this.f46412r), null), hVar.h(), a.C0394a.f47435a.b(), this.f46409o);
                if (nativeAdA != null) {
                    com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.f45847l.c());
                    com.moloco.sdk.internal.client_metrics_data.b bVar = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
                    cVar.recordCountEvent(dVar.withTag(bVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.b.f45864e.c(), f0Var.name()).withTag("initial_sdk_init_state", str2.toString()));
                    cVar.recordTimerEvent(gVar.withTag(bVar.c(), "success"));
                    if (nativeAdA instanceof e0) {
                        ((e0) nativeAdA).setCreateAdObjectStartTime(jA);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + f0Var + " ad with adUnitId: " + str, null, false, 12, null);
                    return new w.b(nativeAdA);
                }
            }
            MolocoAdError.AdCreateError adCreateErrorA = k.this.a(this.f46410p, str2, gVar, f0Var, this.f46409o);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + f0Var + " with reason: " + adCreateErrorA, null, false, 12, null);
            return new w.a(adCreateErrorA);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public f0 f46413i;

        /* renamed from: j, reason: collision with root package name */
        public String f46414j;

        /* renamed from: k, reason: collision with root package name */
        public com.moloco.sdk.acm.g f46415k;

        /* renamed from: l, reason: collision with root package name */
        public long f46416l;

        /* renamed from: m, reason: collision with root package name */
        public int f46417m;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.c f46419o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f46420p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f46421q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f46422r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.moloco.sdk.acm.recorder.c cVar, String str, String str2, String str3, zu.d<? super i> dVar) {
            super(2, dVar);
            this.f46419o = cVar;
            this.f46420p = str;
            this.f46421q = str2;
            this.f46422r = str3;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.internal.w> dVar) {
            return ((i) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return k.this.new i(this.f46419o, this.f46420p, this.f46421q, this.f46422r, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            f0 f0Var;
            long jInvoke;
            String strA;
            Object objA;
            com.moloco.sdk.acm.g gVar;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46417m;
            String str = this.f46420p;
            com.moloco.sdk.acm.recorder.c cVar = this.f46419o;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                f0Var = f0.f46258i;
                k kVar = k.this;
                jInvoke = kVar.f46351b.invoke();
                strA = kVar.a();
                com.moloco.sdk.acm.g gVarWithTag = cVar.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.c.f45878j.c()).withTag(com.moloco.sdk.internal.client_metrics_data.b.f45864e.c(), f0Var.name()).withTag("initial_sdk_init_state", strA);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + f0Var + " ad with adUnitId: " + str, null, false, 12, null);
                kv.l lVar = kVar.f46353d;
                this.f46413i = f0Var;
                this.f46414j = strA;
                this.f46415k = gVarWithTag;
                this.f46416l = jInvoke;
                this.f46417m = 1;
                objA = kVar.a(lVar, f0Var, cVar, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                gVar = gVarWithTag;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j10 = this.f46416l;
                com.moloco.sdk.acm.g gVar2 = this.f46415k;
                strA = this.f46414j;
                f0Var = this.f46413i;
                tu.a0.throwOnFailure(obj);
                jInvoke = j10;
                gVar = gVar2;
                objA = obj;
            }
            String str2 = strA;
            com.moloco.sdk.internal.e eVar = (com.moloco.sdk.internal.e) objA;
            if (eVar != null) {
                Context contextA = com.moloco.sdk.service_locator.a.f47434a.a();
                com.moloco.sdk.internal.services.r rVarE = a.b.f47437a.e();
                a.h hVar = a.h.f47463a;
                RewardedInterstitialAd rewardedInterstitialAdB = eVar.b(contextA, rVarE, this.f46420p, hVar.j(), hVar.f(), a.i.f47469a.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b(this.f46421q), new j(AdFormatType.REWARDED, com.moloco.sdk.internal.mediators.a.b(this.f46422r), null), this.f46419o);
                if (rewardedInterstitialAdB != null) {
                    com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.f45847l.c());
                    com.moloco.sdk.internal.client_metrics_data.b bVar = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
                    cVar.recordCountEvent(dVar.withTag(bVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.b.f45864e.c(), f0Var.name()).withTag("initial_sdk_init_state", str2));
                    cVar.recordTimerEvent(gVar.withTag(bVar.c(), "success"));
                    if (rewardedInterstitialAdB instanceof e0) {
                        ((e0) rewardedInterstitialAdB).setCreateAdObjectStartTime(jInvoke);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + f0Var + " ad with adUnitId: " + str, null, false, 12, null);
                    return new w.b(rewardedInterstitialAdB);
                }
            }
            MolocoAdError.AdCreateError adCreateErrorA = k.this.a(this.f46420p, str2, gVar, f0Var, this.f46419o);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + f0Var + " with reason: " + adCreateErrorA, null, false, 12, null);
            return new w.a(adCreateErrorA);
        }
    }

    static {
        new a(null);
    }

    public k(StateFlow<? extends Initialization> initializationState, com.moloco.sdk.internal.services.i timeProviderService, n adCreatorConfiguration, kv.l awaitAdFactory) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initializationState, "initializationState");
        kotlin.jvm.internal.e0.checkNotNullParameter(timeProviderService, "timeProviderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(adCreatorConfiguration, "adCreatorConfiguration");
        kotlin.jvm.internal.e0.checkNotNullParameter(awaitAdFactory, "awaitAdFactory");
        this.f46350a = initializationState;
        this.f46351b = timeProviderService;
        this.f46352c = adCreatorConfiguration;
        this.f46353d = awaitAdFactory;
        this.f46354e = com.moloco.sdk.internal.scheduling.c.a().getDefault();
    }

    public final Object d(String str, String str2, com.moloco.sdk.acm.recorder.c cVar, String str3, zu.d<? super com.moloco.sdk.internal.w> dVar) {
        return BuildersKt.withContext(this.f46354e, new g(cVar, str2, str3, str, null), dVar);
    }

    public final Object e(String str, String str2, com.moloco.sdk.acm.recorder.c cVar, String str3, zu.d<? super com.moloco.sdk.internal.w> dVar) {
        return BuildersKt.withContext(this.f46354e, new h(cVar, str2, str3, str, null), dVar);
    }

    public final Object f(String str, String str2, com.moloco.sdk.acm.recorder.c cVar, String str3, zu.d<? super com.moloco.sdk.internal.w> dVar) {
        return BuildersKt.withContext(this.f46354e, new i(cVar, str2, str3, str, null), dVar);
    }

    public static /* synthetic */ Object d(k kVar, String str, String str2, com.moloco.sdk.acm.recorder.c cVar, String str3, zu.d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        return kVar.d(str, str2, cVar, str3, dVar);
    }

    public static /* synthetic */ Object e(k kVar, String str, String str2, com.moloco.sdk.acm.recorder.c cVar, String str3, zu.d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        return kVar.e(str, str2, cVar, str3, dVar);
    }

    public static /* synthetic */ Object f(k kVar, String str, String str2, com.moloco.sdk.acm.recorder.c cVar, String str3, zu.d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        return kVar.f(str, str2, cVar, str3, dVar);
    }

    public final Object b(String str, String str2, com.moloco.sdk.acm.recorder.c cVar, String str3, zu.d<? super com.moloco.sdk.internal.w> dVar) {
        return BuildersKt.withContext(this.f46354e, new e(cVar, str2, str3, str, null), dVar);
    }

    public final Object c(String str, String str2, com.moloco.sdk.acm.recorder.c cVar, String str3, zu.d<? super com.moloco.sdk.internal.w> dVar) {
        return BuildersKt.withContext(this.f46354e, new f(cVar, str2, str3, str, null), dVar);
    }

    public static /* synthetic */ Object b(k kVar, String str, String str2, com.moloco.sdk.acm.recorder.c cVar, String str3, zu.d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        return kVar.b(str, str2, cVar, str3, dVar);
    }

    public static /* synthetic */ Object c(k kVar, String str, String str2, com.moloco.sdk.acm.recorder.c cVar, String str3, zu.d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        return kVar.c(str, str2, cVar, str3, dVar);
    }

    public final Object a(String str, String str2, com.moloco.sdk.acm.recorder.c cVar, String str3, zu.d<? super com.moloco.sdk.internal.w> dVar) {
        return BuildersKt.withContext(this.f46354e, new d(cVar, str2, str3, str, null), dVar);
    }

    public static /* synthetic */ Object a(k kVar, String str, String str2, com.moloco.sdk.acm.recorder.c cVar, String str3, zu.d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        return kVar.a(str, str2, cVar, str3, (zu.d<? super com.moloco.sdk.internal.w>) dVar);
    }

    public final MolocoAdError.AdCreateError a(String str, String str2, com.moloco.sdk.acm.g gVar, f0 f0Var, com.moloco.sdk.acm.recorder.c cVar) {
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.f45847l.c());
        com.moloco.sdk.internal.client_metrics_data.b bVar = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
        com.moloco.sdk.acm.d dVarWithTag = dVar.withTag(bVar.c(), "failure").withTag("initial_sdk_init_state", str2).withTag(com.moloco.sdk.internal.client_metrics_data.b.f45864e.c(), f0Var.name());
        Initialization initialization = (Initialization) this.f46350a.getValue();
        int i10 = initialization == null ? -1 : l.f46423a[initialization.ordinal()];
        if (i10 == -1) {
            com.moloco.sdk.internal.error.c cVarF = a.b.f47437a.f();
            StringBuilder sb2 = new StringBuilder("CREATE_");
            String upperCase = f0Var.name().toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb2.append(upperCase);
            sb2.append("_AD_FAILED_SDK_INIT_NOT_COMPLETED");
            com.moloco.sdk.internal.error.b.a(cVarF, sb2.toString(), null, 2, null);
            com.moloco.sdk.acm.g gVarWithTag = gVar.withTag(bVar.c(), "failure");
            com.moloco.sdk.internal.client_metrics_data.b bVar2 = com.moloco.sdk.internal.client_metrics_data.b.f45863c;
            cVar.recordTimerEvent(gVarWithTag.withTag(bVar2.c(), "sdk_init_not_completed"));
            cVar.recordCountEvent(dVarWithTag.withTag(bVar2.c(), "sdk_init_not_completed"));
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AdCreator", "Cannot retrieve AdFactory as SDK init was not called or not completed", null, false, 12, null);
            return MolocoAdError.AdCreateError.SDK_INIT_WAS_NOT_COMPLETED;
        }
        if (i10 == 1) {
            com.moloco.sdk.internal.error.b.a(a.b.f47437a.f(), "UNABLE_TO_CREATE_AD", null, 2, null);
            com.moloco.sdk.acm.g gVarWithTag2 = gVar.withTag(bVar.c(), "failure");
            com.moloco.sdk.internal.client_metrics_data.b bVar3 = com.moloco.sdk.internal.client_metrics_data.b.f45863c;
            cVar.recordTimerEvent(gVarWithTag2.withTag(bVar3.c(), "unable_to_create_ad"));
            cVar.recordCountEvent(dVarWithTag.withTag(bVar3.c(), "unable_to_create_ad"));
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AdCreator", a.b.k("Could not find the adUnitId that was requested for load: ", str), null, false, 12, null);
            return MolocoAdError.AdCreateError.UNABLE_TO_CREATE_AD;
        }
        if (i10 == 2) {
            com.moloco.sdk.internal.error.c cVarF2 = a.b.f47437a.f();
            StringBuilder sb3 = new StringBuilder("CREATE_");
            String upperCase2 = f0Var.name().toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            sb3.append(upperCase2);
            sb3.append("_AD_FAILED_SDK_INIT_FAILED");
            com.moloco.sdk.internal.error.b.a(cVarF2, sb3.toString(), null, 2, null);
            com.moloco.sdk.acm.g gVarWithTag3 = gVar.withTag(bVar.c(), "failure");
            com.moloco.sdk.internal.client_metrics_data.b bVar4 = com.moloco.sdk.internal.client_metrics_data.b.f45863c;
            cVar.recordTimerEvent(gVarWithTag3.withTag(bVar4.c(), "sdk_init_failed"));
            cVar.recordCountEvent(dVarWithTag.withTag(bVar4.c(), "sdk_init_failed"));
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AdCreator", "Cannot create AdFactory as SDK init was failure", null, false, 12, null);
            return MolocoAdError.AdCreateError.SDK_INIT_FAILED;
        }
        throw new tu.t();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kv.l r19, com.moloco.sdk.internal.publisher.f0 r20, com.moloco.sdk.acm.recorder.c r21, zu.d<? super com.moloco.sdk.internal.e> r22) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.k.a(kv.l, com.moloco.sdk.internal.publisher.f0, com.moloco.sdk.acm.recorder.c, zu.d):java.lang.Object");
    }

    public final String a() {
        String strName;
        Initialization initialization = (Initialization) this.f46350a.getValue();
        if (initialization == null || (strName = initialization.name()) == null) {
            return "not_invoked_or_in_progress";
        }
        String lowerCase = strName.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase == null ? "not_invoked_or_in_progress" : lowerCase;
    }
}
