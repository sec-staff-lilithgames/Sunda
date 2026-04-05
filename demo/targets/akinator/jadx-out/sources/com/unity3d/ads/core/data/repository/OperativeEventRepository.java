package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class OperativeEventRepository {
    private final MutableSharedFlow<OperativeEventRequestOuterClass.OperativeEventRequest> _operativeEvents;
    private final SharedFlow<OperativeEventRequestOuterClass.OperativeEventRequest> operativeEvents;

    public OperativeEventRepository() {
        MutableSharedFlow<OperativeEventRequestOuterClass.OperativeEventRequest> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(10, 10, BufferOverflow.DROP_OLDEST);
        this._operativeEvents = MutableSharedFlow;
        this.operativeEvents = FlowKt.asSharedFlow(MutableSharedFlow);
    }

    public final void addOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
        e0.checkNotNullParameter(operativeEventRequest, "operativeEventRequest");
        this._operativeEvents.tryEmit(operativeEventRequest);
    }

    public final SharedFlow<OperativeEventRequestOuterClass.OperativeEventRequest> getOperativeEvents() {
        return this.operativeEvents;
    }
}
