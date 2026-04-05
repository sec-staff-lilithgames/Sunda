package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.MetricsRequest$SDKInitFailureTrackingRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class q9 extends GeneratedMessageLite.Builder implements z9 {
    public q9 clearClientError() {
        copyOnWrite();
        ((MetricsRequest$SDKInitFailureTrackingRequest) this.instance).clearClientError();
        return this;
    }

    public q9 clearErrorType() {
        copyOnWrite();
        ((MetricsRequest$SDKInitFailureTrackingRequest) this.instance).clearErrorType();
        return this;
    }

    public q9 clearServerError() {
        copyOnWrite();
        ((MetricsRequest$SDKInitFailureTrackingRequest) this.instance).clearServerError();
        return this;
    }

    @Override // com.moloco.sdk.z9
    public MetricsRequest$SDKInitFailureTrackingRequest.ClientError getClientError() {
        return ((MetricsRequest$SDKInitFailureTrackingRequest) this.instance).getClientError();
    }

    @Override // com.moloco.sdk.z9
    public w9 getErrorTypeCase() {
        return ((MetricsRequest$SDKInitFailureTrackingRequest) this.instance).getErrorTypeCase();
    }

    @Override // com.moloco.sdk.z9
    public MetricsRequest$SDKInitFailureTrackingRequest.ServerError getServerError() {
        return ((MetricsRequest$SDKInitFailureTrackingRequest) this.instance).getServerError();
    }

    @Override // com.moloco.sdk.z9
    public boolean hasClientError() {
        return ((MetricsRequest$SDKInitFailureTrackingRequest) this.instance).hasClientError();
    }

    @Override // com.moloco.sdk.z9
    public boolean hasServerError() {
        return ((MetricsRequest$SDKInitFailureTrackingRequest) this.instance).hasServerError();
    }

    public q9 mergeClientError(MetricsRequest$SDKInitFailureTrackingRequest.ClientError clientError) {
        copyOnWrite();
        ((MetricsRequest$SDKInitFailureTrackingRequest) this.instance).mergeClientError(clientError);
        return this;
    }

    public q9 mergeServerError(MetricsRequest$SDKInitFailureTrackingRequest.ServerError serverError) {
        copyOnWrite();
        ((MetricsRequest$SDKInitFailureTrackingRequest) this.instance).mergeServerError(serverError);
        return this;
    }

    public q9 setClientError(MetricsRequest$SDKInitFailureTrackingRequest.ClientError clientError) {
        copyOnWrite();
        ((MetricsRequest$SDKInitFailureTrackingRequest) this.instance).setClientError(clientError);
        return this;
    }

    public q9 setServerError(MetricsRequest$SDKInitFailureTrackingRequest.ServerError serverError) {
        copyOnWrite();
        ((MetricsRequest$SDKInitFailureTrackingRequest) this.instance).setServerError(serverError);
        return this;
    }

    public q9 setClientError(r9 r9Var) {
        copyOnWrite();
        ((MetricsRequest$SDKInitFailureTrackingRequest) this.instance).setClientError((MetricsRequest$SDKInitFailureTrackingRequest.ClientError) r9Var.build());
        return this;
    }

    public q9 setServerError(x9 x9Var) {
        copyOnWrite();
        ((MetricsRequest$SDKInitFailureTrackingRequest) this.instance).setServerError((MetricsRequest$SDKInitFailureTrackingRequest.ServerError) x9Var.build());
        return this;
    }
}
