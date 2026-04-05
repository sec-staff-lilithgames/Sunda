package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidTransactionEventRepository implements TransactionEventRepository {
    private final MutableSharedFlow<TransactionEventRequestOuterClass.TransactionEventRequest> _transactionEvents;
    private final SharedFlow<TransactionEventRequestOuterClass.TransactionEventRequest> transactionEvents;

    public AndroidTransactionEventRepository() {
        MutableSharedFlow<TransactionEventRequestOuterClass.TransactionEventRequest> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(10, 10, BufferOverflow.DROP_OLDEST);
        this._transactionEvents = MutableSharedFlow;
        this.transactionEvents = FlowKt.asSharedFlow(MutableSharedFlow);
    }

    @Override // com.unity3d.ads.core.data.repository.TransactionEventRepository
    public void addTransactionEvent(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
        e0.checkNotNullParameter(transactionEventRequest, "transactionEventRequest");
        this._transactionEvents.tryEmit(transactionEventRequest);
    }

    @Override // com.unity3d.ads.core.data.repository.TransactionEventRepository
    public SharedFlow<TransactionEventRequestOuterClass.TransactionEventRequest> getTransactionEvents() {
        return this.transactionEvents;
    }
}
