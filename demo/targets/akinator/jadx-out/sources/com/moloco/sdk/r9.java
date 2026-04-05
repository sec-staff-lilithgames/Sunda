package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.MetricsRequest$SDKInitFailureTrackingRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class r9 extends GeneratedMessageLite.Builder implements v9 {
    public r9 clearClientFailureType() {
        copyOnWrite();
        ((MetricsRequest$SDKInitFailureTrackingRequest.ClientError) this.instance).clearClientFailureType();
        return this;
    }

    @Override // com.moloco.sdk.v9
    public u9 getClientFailureType() {
        return ((MetricsRequest$SDKInitFailureTrackingRequest.ClientError) this.instance).getClientFailureType();
    }

    @Override // com.moloco.sdk.v9
    public int getClientFailureTypeValue() {
        return ((MetricsRequest$SDKInitFailureTrackingRequest.ClientError) this.instance).getClientFailureTypeValue();
    }

    @Override // com.moloco.sdk.v9
    public boolean hasClientFailureType() {
        return ((MetricsRequest$SDKInitFailureTrackingRequest.ClientError) this.instance).hasClientFailureType();
    }

    public r9 setClientFailureType(u9 u9Var) {
        copyOnWrite();
        ((MetricsRequest$SDKInitFailureTrackingRequest.ClientError) this.instance).setClientFailureType(u9Var);
        return this;
    }

    public r9 setClientFailureTypeValue(int i10) {
        copyOnWrite();
        ((MetricsRequest$SDKInitFailureTrackingRequest.ClientError) this.instance).setClientFailureTypeValue(i10);
        return this;
    }
}
