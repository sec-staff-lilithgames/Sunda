package com.moloco.sdk.internal.ilrd.provider;

import android.content.Context;
import android.os.Bundle;
import av.e;
import bv.n;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.IlrdRequest$MaxImpression;
import com.moloco.sdk.internal.ilrd.f;
import com.moloco.sdk.internal.ilrd.h;
import com.moloco.sdk.internal.ilrd.m;
import com.moloco.sdk.z7;
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
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f46041a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineScope f46042b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.ilrd.model.a f46043c;

    /* renamed from: d, reason: collision with root package name */
    public final o f46044d;

    /* renamed from: e, reason: collision with root package name */
    public final o f46045e;

    /* renamed from: f, reason: collision with root package name */
    public final MutableStateFlow f46046f;

    /* renamed from: g, reason: collision with root package name */
    public final MutableSharedFlow f46047g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.internal.ilrd.provider.b$b, reason: collision with other inner class name */
    public static final class C0372b implements AppLovinCommunicatorSubscriber {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.internal.ilrd.provider.b$b$a */
        public static final class a extends n implements p {

            /* renamed from: i, reason: collision with root package name */
            public int f46049i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ b f46050j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ f f46051k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, f fVar, zu.d<? super a> dVar) {
                super(2, dVar);
                this.f46050j = bVar;
                this.f46051k = fVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new a(this.f46050j, this.f46051k, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.f46049i;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    MutableSharedFlow mutableSharedFlow = this.f46050j.f46047g;
                    this.f46049i = 1;
                    if (mutableSharedFlow.emit(this.f46051k, this) == coroutine_suspended) {
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

        public C0372b() {
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorEntity
        public String getCommunicatorId() {
            return "Moloco";
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
        public void onMessageReceived(AppLovinCommunicatorMessage message) {
            e0.checkNotNullParameter(message, "message");
            b bVar = b.this;
            if (CoroutineScopeKt.isActive(bVar.f46042b) && e0.areEqual("max_revenue_events", message.getTopic())) {
                Bundle messageData = message.getMessageData();
                e0.checkNotNullExpressionValue(messageData, "getMessageData(...)");
                BuildersKt__Builders_commonKt.launch$default(bVar.f46042b, null, null, new a(bVar, bVar.a(messageData), null), 3, null);
            }
        }
    }

    static {
        new a(null);
    }

    public b(Context context, CoroutineScope scope) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(scope, "scope");
        this.f46041a = context;
        this.f46042b = scope;
        this.f46043c = com.moloco.sdk.internal.ilrd.model.a.f46035b;
        final int i10 = 0;
        this.f46044d = q.lazy(new kv.a(this) { // from class: com.moloco.sdk.internal.ilrd.provider.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f46040c;

            {
                this.f46040c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return b.d(this.f46040c);
                    default:
                        return b.c(this.f46040c);
                }
            }
        });
        final int i11 = 1;
        this.f46045e = q.lazy(new kv.a(this) { // from class: com.moloco.sdk.internal.ilrd.provider.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f46040c;

            {
                this.f46040c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return b.d(this.f46040c);
                    default:
                        return b.c(this.f46040c);
                }
            }
        });
        this.f46046f = StateFlowKt.MutableStateFlow(m.c.f46034a);
        this.f46047g = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    public static final SharedFlow c(b bVar) {
        return FlowKt.asSharedFlow(bVar.f46047g);
    }

    public static final StateFlow d(b bVar) {
        return FlowKt.asStateFlow(bVar.f46046f);
    }

    public final Object e() {
        Object objM7131constructorimpl;
        try {
            int i10 = z.f87419c;
            int i11 = AppLovinCommunicatorMessage.f13387b;
            objM7131constructorimpl = z.m7131constructorimpl(AppLovinCommunicator.getInstance(this.f46041a));
        } catch (Throwable th2) {
            int i12 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(objM7131constructorimpl);
        if (thM7134exceptionOrNullimpl != null) {
            return z.m7131constructorimpl(a0.createFailure(thM7134exceptionOrNullimpl));
        }
        ((AppLovinCommunicator) objM7131constructorimpl).subscribe(d(), "max_revenue_events");
        return z.m7131constructorimpl(x0.f87415a);
    }

    @Override // com.moloco.sdk.internal.ilrd.h
    public StateFlow<m> getState() {
        return (StateFlow) this.f46044d.getValue();
    }

    @Override // com.moloco.sdk.internal.ilrd.h
    public synchronized Object b() {
        Object objE;
        try {
            objE = e();
            Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(objE);
            if (thM7134exceptionOrNullimpl != null) {
                this.f46046f.setValue(new m.a(thM7134exceptionOrNullimpl.toString()));
            }
            if (z.m7137isSuccessimpl(objE)) {
                this.f46046f.setValue(m.b.f46033a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return objE;
    }

    @Override // com.moloco.sdk.internal.ilrd.h
    public SharedFlow<f> c() {
        return (SharedFlow) this.f46045e.getValue();
    }

    public final C0372b d() {
        return new C0372b();
    }

    @Override // com.moloco.sdk.internal.ilrd.h
    public com.moloco.sdk.internal.ilrd.model.a a() {
        return this.f46043c;
    }

    public final f a(Bundle bundle) {
        double d10 = bundle.getDouble("revenue");
        String string = bundle.getString("country_code");
        String string2 = bundle.getString("network_name");
        String string3 = bundle.getString("max_ad_unit_id");
        String string4 = bundle.getString("third_party_ad_placement_id");
        String string5 = bundle.getString("ad_format");
        String string6 = bundle.getString("user_segment");
        String string7 = bundle.getString("id");
        z7 z7VarNewBuilder = IlrdRequest$MaxImpression.newBuilder();
        z7VarNewBuilder.setRevenue(d10);
        if (string != null) {
            z7VarNewBuilder.setCountryCode(string);
        }
        if (string2 != null) {
            z7VarNewBuilder.setNetworkName(string2);
        }
        if (string3 != null) {
            z7VarNewBuilder.setMaxAdUnitId(string3);
        }
        if (string4 != null) {
            z7VarNewBuilder.setThirdPartyAdPlacementId(string4);
        }
        if (string5 != null) {
            z7VarNewBuilder.setAdFormat(string5);
        }
        if (string6 != null) {
            z7VarNewBuilder.setUserSegment(string6);
        }
        if (string7 != null) {
            z7VarNewBuilder.setId(string7);
        }
        GeneratedMessageLite generatedMessageLiteBuild = z7VarNewBuilder.build();
        e0.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
        return new f((IlrdRequest$MaxImpression) generatedMessageLiteBuild);
    }
}
