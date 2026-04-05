package com.moloco.sdk.internal.ilrd.provider;

import android.content.Context;
import bv.n;
import com.google.protobuf.GeneratedMessageLite;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.moloco.sdk.IlrdRequest$LevelPlayImpression;
import com.moloco.sdk.internal.ilrd.e;
import com.moloco.sdk.internal.ilrd.h;
import com.moloco.sdk.internal.ilrd.m;
import com.moloco.sdk.x7;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.p;
import tu.a0;
import tu.o;
import tu.q;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f46054a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineScope f46055b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.ilrd.model.a f46056c;

    /* renamed from: d, reason: collision with root package name */
    public final o f46057d;

    /* renamed from: e, reason: collision with root package name */
    public final o f46058e;

    /* renamed from: f, reason: collision with root package name */
    public final MutableStateFlow f46059f;

    /* renamed from: g, reason: collision with root package name */
    public final MutableSharedFlow f46060g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements ImpressionDataListener {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends n implements p {

            /* renamed from: i, reason: collision with root package name */
            public int f46062i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ d f46063j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ e f46064k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, e eVar, zu.d<? super a> dVar2) {
                super(2, dVar2);
                this.f46063j = dVar;
                this.f46064k = eVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new a(this.f46063j, this.f46064k, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f46062i;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    MutableSharedFlow mutableSharedFlow = this.f46063j.f46060g;
                    this.f46062i = 1;
                    if (mutableSharedFlow.emit(this.f46064k, this) == coroutine_suspended) {
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
        }

        public b() {
        }

        public void onImpressionSuccess(ImpressionData impressionData) {
            if (CoroutineScopeKt.isActive(d.this.f46055b) && impressionData != null) {
                BuildersKt__Builders_commonKt.launch$default(d.this.f46055b, null, null, new a(d.this, d.this.a(impressionData), null), 3, null);
            }
        }
    }

    static {
        new a(null);
    }

    public d(Context context, CoroutineScope scope) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(scope, "scope");
        this.f46054a = context;
        this.f46055b = scope;
        this.f46056c = com.moloco.sdk.internal.ilrd.model.a.f46036c;
        final int i10 = 0;
        this.f46057d = q.lazy(new kv.a(this) { // from class: com.moloco.sdk.internal.ilrd.provider.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f46053c;

            {
                this.f46053c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return d.d(this.f46053c);
                    default:
                        return d.c(this.f46053c);
                }
            }
        });
        final int i11 = 1;
        this.f46058e = q.lazy(new kv.a(this) { // from class: com.moloco.sdk.internal.ilrd.provider.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f46053c;

            {
                this.f46053c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return d.d(this.f46053c);
                    default:
                        return d.c(this.f46053c);
                }
            }
        });
        this.f46059f = StateFlowKt.MutableStateFlow(m.c.f46034a);
        this.f46060g = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    public static final SharedFlow c(d dVar) {
        return FlowKt.asSharedFlow(dVar.f46060g);
    }

    public static final StateFlow d(d dVar) {
        return FlowKt.asStateFlow(dVar.f46059f);
    }

    public final Object e() {
        Object objM7131constructorimpl;
        x0 x0Var = x0.f87415a;
        try {
            int i10 = z.f87419c;
            Class.forName("com.ironsource.mediationsdk.impressionData.ImpressionData");
            IronSource.addImpressionDataListener(d());
            objM7131constructorimpl = z.m7131constructorimpl(x0Var);
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(objM7131constructorimpl);
        return thM7134exceptionOrNullimpl == null ? z.m7131constructorimpl(x0Var) : z.m7131constructorimpl(a0.createFailure(thM7134exceptionOrNullimpl));
    }

    @Override // com.moloco.sdk.internal.ilrd.h
    public StateFlow<m> getState() {
        return (StateFlow) this.f46057d.getValue();
    }

    @Override // com.moloco.sdk.internal.ilrd.h
    public synchronized Object b() {
        Object objE;
        try {
            objE = e();
            Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(objE);
            if (thM7134exceptionOrNullimpl != null) {
                this.f46059f.setValue(new m.a(thM7134exceptionOrNullimpl.toString()));
            }
            if (z.m7137isSuccessimpl(objE)) {
                this.f46059f.setValue(m.b.f46033a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return objE;
    }

    @Override // com.moloco.sdk.internal.ilrd.h
    public SharedFlow<e> c() {
        return (SharedFlow) this.f46058e.getValue();
    }

    public final b d() {
        return new b();
    }

    @Override // com.moloco.sdk.internal.ilrd.h
    public com.moloco.sdk.internal.ilrd.model.a a() {
        return this.f46056c;
    }

    public final e a(ImpressionData impressionData) {
        x7 x7VarNewBuilder = IlrdRequest$LevelPlayImpression.newBuilder();
        try {
            int i10 = z.f87419c;
            String auctionId = impressionData.getAuctionId();
            z.m7131constructorimpl(auctionId != null ? x7VarNewBuilder.setAuctionId(auctionId) : null);
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            z.m7131constructorimpl(a0.createFailure(th2));
        }
        try {
            String adFormat = impressionData.getAdFormat();
            z.m7131constructorimpl(adFormat != null ? x7VarNewBuilder.setAdFormat(adFormat) : null);
        } catch (Throwable th3) {
            int i12 = z.f87419c;
            z.m7131constructorimpl(a0.createFailure(th3));
        }
        try {
            String adNetwork = impressionData.getAdNetwork();
            z.m7131constructorimpl(adNetwork != null ? x7VarNewBuilder.setNetworkName(adNetwork) : null);
        } catch (Throwable th4) {
            int i13 = z.f87419c;
            z.m7131constructorimpl(a0.createFailure(th4));
        }
        try {
            String instanceName = impressionData.getInstanceName();
            z.m7131constructorimpl(instanceName != null ? x7VarNewBuilder.setInstanceName(instanceName) : null);
        } catch (Throwable th5) {
            int i14 = z.f87419c;
            z.m7131constructorimpl(a0.createFailure(th5));
        }
        try {
            String instanceId = impressionData.getInstanceId();
            z.m7131constructorimpl(instanceId != null ? x7VarNewBuilder.setInstanceId(instanceId) : null);
        } catch (Throwable th6) {
            int i15 = z.f87419c;
            z.m7131constructorimpl(a0.createFailure(th6));
        }
        try {
            String country = impressionData.getCountry();
            z.m7131constructorimpl(country != null ? x7VarNewBuilder.setCountryCode(country) : null);
        } catch (Throwable th7) {
            int i16 = z.f87419c;
            z.m7131constructorimpl(a0.createFailure(th7));
        }
        try {
            String placement = impressionData.getPlacement();
            z.m7131constructorimpl(placement != null ? x7VarNewBuilder.setPlacement(placement) : null);
        } catch (Throwable th8) {
            int i17 = z.f87419c;
            z.m7131constructorimpl(a0.createFailure(th8));
        }
        try {
            Double revenue = impressionData.getRevenue();
            z.m7131constructorimpl(revenue != null ? x7VarNewBuilder.setRevenue(revenue.doubleValue()) : null);
        } catch (Throwable th9) {
            int i18 = z.f87419c;
            z.m7131constructorimpl(a0.createFailure(th9));
        }
        try {
            String precision = impressionData.getPrecision();
            z.m7131constructorimpl(precision != null ? x7VarNewBuilder.setPrecision(precision) : null);
        } catch (Throwable th10) {
            int i19 = z.f87419c;
            z.m7131constructorimpl(a0.createFailure(th10));
        }
        try {
            String ab2 = impressionData.getAb();
            z.m7131constructorimpl(ab2 != null ? x7VarNewBuilder.setAb(ab2) : null);
        } catch (Throwable th11) {
            int i20 = z.f87419c;
            z.m7131constructorimpl(a0.createFailure(th11));
        }
        try {
            String segmentName = impressionData.getSegmentName();
            z.m7131constructorimpl(segmentName != null ? x7VarNewBuilder.setSegmentName(segmentName) : null);
        } catch (Throwable th12) {
            int i21 = z.f87419c;
            z.m7131constructorimpl(a0.createFailure(th12));
        }
        try {
            Double lifetimeRevenue = impressionData.getLifetimeRevenue();
            z.m7131constructorimpl(lifetimeRevenue != null ? x7VarNewBuilder.setLifetimeRevenue(lifetimeRevenue.doubleValue()) : null);
        } catch (Throwable th13) {
            int i22 = z.f87419c;
            z.m7131constructorimpl(a0.createFailure(th13));
        }
        try {
            String encryptedCPM = impressionData.getEncryptedCPM();
            z.m7131constructorimpl(encryptedCPM != null ? x7VarNewBuilder.setEncryptedCpm(encryptedCPM) : null);
        } catch (Throwable th14) {
            int i23 = z.f87419c;
            z.m7131constructorimpl(a0.createFailure(th14));
        }
        try {
            String creativeId = impressionData.getCreativeId();
            z.m7131constructorimpl(creativeId != null ? x7VarNewBuilder.setCreativeId(creativeId) : null);
        } catch (Throwable th15) {
            int i24 = z.f87419c;
            z.m7131constructorimpl(a0.createFailure(th15));
        }
        GeneratedMessageLite generatedMessageLiteBuild = x7VarNewBuilder.build();
        e0.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
        return new e((IlrdRequest$LevelPlayImpression) generatedMessageLiteBuild);
    }
}
