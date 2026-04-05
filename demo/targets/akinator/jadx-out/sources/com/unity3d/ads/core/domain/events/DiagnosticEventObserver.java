package com.unity3d.ads.core.domain.events;

import av.e;
import bv.b;
import bv.f;
import bv.n;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventJob;
import com.unity3d.ads.core.domain.work.UniversalRequestWorkerData;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.p;
import n6.b0;
import n6.b1;
import n6.d0;
import n6.f;
import n6.f0;
import tu.a0;
import tu.x0;
import w0.i;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DiagnosticEventObserver {
    private final BackgroundWorker backgroundWorker;
    private final CoroutineDispatcher defaultDispatcher;
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final MutableStateFlow<Boolean> isRunning;
    private final UniversalRequestDataSource universalRequestDataSource;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2", f = "DiagnosticEventObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2$2", f = "DiagnosticEventObserver.kt", i = {1}, l = {42, 45}, m = "invokeSuspend", n = {"workId"}, s = {"L$0"})
        /* renamed from: com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2$2, reason: invalid class name and collision with other inner class name */
        public static final class C05432 extends n implements p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DiagnosticEventObserver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05432(DiagnosticEventObserver diagnosticEventObserver, d<? super C05432> dVar) {
                super(2, dVar);
                this.this$0 = diagnosticEventObserver;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                C05432 c05432 = new C05432(this.this$0, dVar);
                c05432.L$0 = obj;
                return c05432;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                String str;
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list = (List) this.L$0;
                    UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                    DiagnosticEventObserver diagnosticEventObserver = this.this$0;
                    UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.Companion;
                    UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                    e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
                    UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
                    dsl_create.setDiagnosticEventRequest(diagnosticEventObserver.getDiagnosticEventBatchRequest.invoke(list));
                    UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create._build();
                    GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
                    this.label = 1;
                    obj = getUniversalRequestForPayLoad.invoke(payload_build, this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.L$0;
                    a0.throwOnFailure(obj);
                    UniversalRequestWorkerData universalRequestWorkerData = new UniversalRequestWorkerData(str);
                    BackgroundWorker backgroundWorker = this.this$0.backgroundWorker;
                    n6.f fVarBuild = new f.a().setRequiredNetworkType(d0.f75706c).build();
                    e0.checkNotNullExpressionValue(fVarBuild, "Builder()\n            .s…TED)\n            .build()");
                    b1 b1VarBuild = ((f0.a) ((f0.a) ((f0.a) new f0.a((Class<? extends b0>) DiagnosticEventJob.class).setConstraints(fVarBuild)).setInputData(universalRequestWorkerData.invoke())).addTag(BackgroundWorker.TAG)).build();
                    e0.checkNotNullExpressionValue(b1VarBuild, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
                    backgroundWorker.getWorkManager().enqueue((f0) b1VarBuild);
                    return x0.f87415a;
                }
                a0.throwOnFailure(obj);
                String strC = i.c("randomUUID().toString()");
                UniversalRequestDataSource universalRequestDataSource = this.this$0.universalRequestDataSource;
                byte[] byteArray = ((UniversalRequestOuterClass.UniversalRequest) obj).toByteArray();
                e0.checkNotNullExpressionValue(byteArray, "fullRequest.toByteArray()");
                ByteString byteString = ByteStringsKt.toByteString(byteArray);
                this.L$0 = strC;
                this.label = 2;
                if (universalRequestDataSource.set(strC, byteString, this) != coroutine_suspended) {
                    str = strC;
                    UniversalRequestWorkerData universalRequestWorkerData2 = new UniversalRequestWorkerData(str);
                    BackgroundWorker backgroundWorker2 = this.this$0.backgroundWorker;
                    n6.f fVarBuild2 = new f.a().setRequiredNetworkType(d0.f75706c).build();
                    e0.checkNotNullExpressionValue(fVarBuild2, "Builder()\n            .s…TED)\n            .build()");
                    b1 b1VarBuild2 = ((f0.a) ((f0.a) ((f0.a) new f0.a((Class<? extends b0>) DiagnosticEventJob.class).setConstraints(fVarBuild2)).setInputData(universalRequestWorkerData2.invoke())).addTag(BackgroundWorker.TAG)).build();
                    e0.checkNotNullExpressionValue(b1VarBuild2, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
                    backgroundWorker2.getWorkManager().enqueue((f0) b1VarBuild2);
                    return x0.f87415a;
                }
                return coroutine_suspended;
            }

            @Override // kv.p
            public final Object invoke(List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list, d<? super x0> dVar) {
                return ((C05432) create(list, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        public AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return DiagnosticEventObserver.this.new AnonymousClass2(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Boolean bool;
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            MutableStateFlow mutableStateFlow = DiagnosticEventObserver.this.isRunning;
            do {
                value = mutableStateFlow.getValue();
                bool = (Boolean) value;
                bool.getClass();
            } while (!mutableStateFlow.compareAndSet(value, b.boxBoolean(true)));
            boolean zBooleanValue = bool.booleanValue();
            x0 x0Var = x0.f87415a;
            if (zBooleanValue) {
                return x0Var;
            }
            FlowKt.launchIn(FlowKt.onEach(DiagnosticEventObserver.this.diagnosticEventRepository.getDiagnosticEvents(), new C05432(DiagnosticEventObserver.this, null)), CoroutineScopeKt.CoroutineScope(DiagnosticEventObserver.this.defaultDispatcher));
            return x0Var;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public DiagnosticEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest, CoroutineDispatcher defaultDispatcher, DiagnosticEventRepository diagnosticEventRepository, UniversalRequestDataSource universalRequestDataSource, BackgroundWorker backgroundWorker) {
        e0.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        e0.checkNotNullParameter(getDiagnosticEventBatchRequest, "getDiagnosticEventBatchRequest");
        e0.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        e0.checkNotNullParameter(diagnosticEventRepository, "diagnosticEventRepository");
        e0.checkNotNullParameter(universalRequestDataSource, "universalRequestDataSource");
        e0.checkNotNullParameter(backgroundWorker, "backgroundWorker");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.getDiagnosticEventBatchRequest = getDiagnosticEventBatchRequest;
        this.defaultDispatcher = defaultDispatcher;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.isRunning = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    public final Object invoke(d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(this.defaultDispatcher, new AnonymousClass2(null), dVar);
        return objWithContext == e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }
}
