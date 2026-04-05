package com.moloco.sdk.internal.services.analytics;

import av.e;
import b0.e2;
import bv.n;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import p0.o2;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements com.moloco.sdk.internal.services.analytics.a {

    /* renamed from: a, reason: collision with root package name */
    public final k f46756a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f46757b;

    /* renamed from: c, reason: collision with root package name */
    public final c f46758c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f46759i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ long f46761k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, d<? super a> dVar) {
            super(2, dVar);
            this.f46761k = j10;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return b.this.new a(this.f46761k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46759i;
            b bVar = b.this;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar2 = bVar.f46757b;
                a.C0489a c0489a = a.C0489a.f50241a;
                String strA = bVar.f46758c.a();
                this.f46759i = 1;
                obj = bVar2.a(this.f46761k, c0489a, strA, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            bVar.f46756a.a((String) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.internal.services.analytics.b$b, reason: collision with other inner class name */
    public static final class C0387b extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f46762i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ long f46764k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f46765l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0387b(long j10, long j11, d<? super C0387b> dVar) {
            super(2, dVar);
            this.f46764k = j10;
            this.f46765l = j11;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C0387b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return b.this.new C0387b(this.f46764k, this.f46765l, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46762i;
            b bVar = b.this;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar2 = bVar.f46757b;
                a.b bVar3 = new a.b(this.f46765l);
                String strD = bVar.f46758c.d();
                this.f46762i = 1;
                obj = bVar2.a(this.f46764k, bVar3, strD, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            bVar.f46756a.a((String) obj);
            return x0.f87415a;
        }
    }

    public b(k persistentHttpRequest, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, c configService) {
        e0.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        e0.checkNotNullParameter(configService, "configService");
        this.f46756a = persistentHttpRequest;
        this.f46757b = customUserEventBuilderService;
        this.f46758c = configService;
    }

    @Override // com.moloco.sdk.internal.services.analytics.a
    public void a(long j10, long j11) {
        c cVar = this.f46758c;
        if (!cVar.c() || cVar.d().length() <= 0) {
            return;
        }
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sbR = e2.r(j10, "Recording applicationForeground with timestamp: ", ", lastBgTimestamp: ");
        sbR.append(j11);
        MolocoLogger.debug$default(molocoLogger, "AnalyticsService", sbR.toString(), false, 4, null);
        BuildersKt__Builders_commonKt.launch$default(com.moloco.sdk.internal.scheduling.d.f46748a.b(), null, null, new C0387b(j10, j11, null), 3, null);
    }

    @Override // com.moloco.sdk.internal.services.analytics.a
    public void a(long j10) {
        c cVar = this.f46758c;
        if (!cVar.c() || cVar.a().length() <= 0) {
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AnalyticsService", o2.m(j10, "Recording applicationBackground with timestamp: "), false, 4, null);
        BuildersKt__Builders_commonKt.launch$default(com.moloco.sdk.internal.scheduling.d.f46748a.b(), null, null, new a(j10, null), 3, null);
    }
}
