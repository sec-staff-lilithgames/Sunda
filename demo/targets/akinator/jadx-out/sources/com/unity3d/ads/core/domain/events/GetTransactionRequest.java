package com.unity3d.ads.core.domain.events;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface GetTransactionRequest {
    Object invoke(List<TransactionEventRequestOuterClass.TransactionData> list, String str, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, d<? super TransactionEventRequestOuterClass.TransactionEventRequest> dVar);
}
