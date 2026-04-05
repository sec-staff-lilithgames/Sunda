package com.unity3d.ads.core.data.repository;

import av.e;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.a;
import kv.p;
import tu.a0;
import tu.x0;
import uu.p0;
import uu.y0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidDiagnosticEventRepository implements DiagnosticEventRepository {
    private final MutableSharedFlow<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> _diagnosticEvents;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents;
    private final MutableStateFlow<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> batch;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents;
    private final MutableStateFlow<Boolean> configured;
    private final CoroutineScope coroutineScope;
    private final SharedFlow<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> diagnosticEvents;
    private final MutableStateFlow<Boolean> enabled;
    private final CoroutineTimer flushTimer;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private int maxBatchSize;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$configure$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements a {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            m3496invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3496invoke() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            AndroidDiagnosticEventRepository.this.flush();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$1", f = "AndroidDiagnosticEventRepository.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37791 extends n implements p {
        final /* synthetic */ List<DiagnosticEventRequestOuterClass.DiagnosticEvent> $events;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37791(List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list, d<? super C37791> dVar) {
            super(2, dVar);
            this.$events = list;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AndroidDiagnosticEventRepository.this.new C37791(this.$events, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = AndroidDiagnosticEventRepository.this._diagnosticEvents;
                List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list = this.$events;
                this.label = 1;
                if (mutableSharedFlow.emit(list, this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C37791) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public AndroidDiagnosticEventRepository(CoroutineTimer flushTimer, GetDiagnosticEventRequest getDiagnosticEventRequest, CoroutineDispatcher dispatcher) {
        e0.checkNotNullParameter(flushTimer, "flushTimer");
        e0.checkNotNullParameter(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        e0.checkNotNullParameter(dispatcher, "dispatcher");
        this.flushTimer = flushTimer;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.coroutineScope = CoroutineScopeKt.plus(CoroutineScopeKt.CoroutineScope(dispatcher), new CoroutineName("DiagnosticEventRepository"));
        this.batch = StateFlowKt.MutableStateFlow(p0.emptyList());
        this.maxBatchSize = Integer.MAX_VALUE;
        this.allowedEvents = Collections.synchronizedSet(new LinkedHashSet());
        this.blockedEvents = Collections.synchronizedSet(new LinkedHashSet());
        Boolean bool = Boolean.FALSE;
        this.enabled = StateFlowKt.MutableStateFlow(bool);
        this.configured = StateFlowKt.MutableStateFlow(bool);
        MutableSharedFlow<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(100, 0, null, 6, null);
        this._diagnosticEvents = mutableSharedFlowMutableSharedFlow$default;
        this.diagnosticEvents = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void addDiagnosticEvent(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value;
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value2;
        e0.checkNotNullParameter(diagnosticEvent, "diagnosticEvent");
        if (!this.configured.getValue().booleanValue()) {
            MutableStateFlow<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> mutableStateFlow = this.batch;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, y0.plus((Collection<? extends DiagnosticEventRequestOuterClass.DiagnosticEvent>) value2, diagnosticEvent)));
        } else if (this.enabled.getValue().booleanValue()) {
            MutableStateFlow<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> mutableStateFlow2 = this.batch;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, y0.plus((Collection<? extends DiagnosticEventRequestOuterClass.DiagnosticEvent>) value, diagnosticEvent)));
            if (this.batch.getValue().size() >= this.maxBatchSize) {
                flush();
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void clear() {
        MutableStateFlow<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> mutableStateFlow = this.batch;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), p0.emptyList())) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void configure(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticsEventsConfiguration) {
        e0.checkNotNullParameter(diagnosticsEventsConfiguration, "diagnosticsEventsConfiguration");
        this.configured.setValue(Boolean.TRUE);
        this.enabled.setValue(Boolean.valueOf(diagnosticsEventsConfiguration.getEnabled()));
        if (!this.enabled.getValue().booleanValue()) {
            clear();
            return;
        }
        this.maxBatchSize = diagnosticsEventsConfiguration.getMaxBatchSize();
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set = this.allowedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = diagnosticsEventsConfiguration.getAllowedEventsList();
        e0.checkNotNullExpressionValue(allowedEventsList, "diagnosticsEventsConfiguration.allowedEventsList");
        set.addAll(allowedEventsList);
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set2 = this.blockedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = diagnosticsEventsConfiguration.getBlockedEventsList();
        e0.checkNotNullExpressionValue(blockedEventsList, "diagnosticsEventsConfiguration.blockedEventsList");
        set2.addAll(blockedEventsList);
        this.flushTimer.start(0L, diagnosticsEventsConfiguration.getMaxBatchIntervalMs(), new AnonymousClass1());
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void flush() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value;
        if (this.enabled.getValue().booleanValue()) {
            MutableStateFlow<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> mutableStateFlow = this.batch;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, p0.emptyList()));
            List list = rv.f0.toList(rv.f0.filter(rv.f0.filter(rv.f0.map(y0.asSequence(value), new AndroidDiagnosticEventRepository$flush$events$2(this)), new AndroidDiagnosticEventRepository$flush$events$3(this)), new AndroidDiagnosticEventRepository$flush$events$4(this)));
            if (list.isEmpty()) {
                return;
            }
            DeviceLog.debug("Unity Ads Sending diagnostic batch enabled: " + this.enabled.getValue().booleanValue() + " size: " + list.size() + " :: " + list);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C37791(list, null), 3, null);
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public SharedFlow<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> getDiagnosticEvents() {
        return this.diagnosticEvents;
    }
}
