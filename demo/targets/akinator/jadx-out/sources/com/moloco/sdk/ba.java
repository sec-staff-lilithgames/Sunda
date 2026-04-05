package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ba extends GeneratedMessageLite.Builder implements da {
    public ba clearFailure() {
        copyOnWrite();
        ((MetricsRequest$SDKInitTrackingRequest) this.instance).clearFailure();
        return this;
    }

    public ba clearInitStatus() {
        copyOnWrite();
        ((MetricsRequest$SDKInitTrackingRequest) this.instance).clearInitStatus();
        return this;
    }

    public ba clearLatencyMs() {
        copyOnWrite();
        ((MetricsRequest$SDKInitTrackingRequest) this.instance).clearLatencyMs();
        return this;
    }

    public ba clearSuccess() {
        copyOnWrite();
        ((MetricsRequest$SDKInitTrackingRequest) this.instance).clearSuccess();
        return this;
    }

    @Override // com.moloco.sdk.da
    public MetricsRequest$SDKInitFailureTrackingRequest getFailure() {
        return ((MetricsRequest$SDKInitTrackingRequest) this.instance).getFailure();
    }

    @Override // com.moloco.sdk.da
    public ca getInitStatusCase() {
        return ((MetricsRequest$SDKInitTrackingRequest) this.instance).getInitStatusCase();
    }

    @Override // com.moloco.sdk.da
    public long getLatencyMs() {
        return ((MetricsRequest$SDKInitTrackingRequest) this.instance).getLatencyMs();
    }

    @Override // com.moloco.sdk.da
    public MetricsRequest$SDKInitSuccessTrackingRequest getSuccess() {
        return ((MetricsRequest$SDKInitTrackingRequest) this.instance).getSuccess();
    }

    @Override // com.moloco.sdk.da
    public boolean hasFailure() {
        return ((MetricsRequest$SDKInitTrackingRequest) this.instance).hasFailure();
    }

    @Override // com.moloco.sdk.da
    public boolean hasLatencyMs() {
        return ((MetricsRequest$SDKInitTrackingRequest) this.instance).hasLatencyMs();
    }

    @Override // com.moloco.sdk.da
    public boolean hasSuccess() {
        return ((MetricsRequest$SDKInitTrackingRequest) this.instance).hasSuccess();
    }

    public ba mergeFailure(MetricsRequest$SDKInitFailureTrackingRequest metricsRequest$SDKInitFailureTrackingRequest) {
        copyOnWrite();
        ((MetricsRequest$SDKInitTrackingRequest) this.instance).mergeFailure(metricsRequest$SDKInitFailureTrackingRequest);
        return this;
    }

    public ba mergeSuccess(MetricsRequest$SDKInitSuccessTrackingRequest metricsRequest$SDKInitSuccessTrackingRequest) {
        copyOnWrite();
        ((MetricsRequest$SDKInitTrackingRequest) this.instance).mergeSuccess(metricsRequest$SDKInitSuccessTrackingRequest);
        return this;
    }

    public ba setFailure(MetricsRequest$SDKInitFailureTrackingRequest metricsRequest$SDKInitFailureTrackingRequest) {
        copyOnWrite();
        ((MetricsRequest$SDKInitTrackingRequest) this.instance).setFailure(metricsRequest$SDKInitFailureTrackingRequest);
        return this;
    }

    public ba setLatencyMs(long j10) {
        copyOnWrite();
        ((MetricsRequest$SDKInitTrackingRequest) this.instance).setLatencyMs(j10);
        return this;
    }

    public ba setSuccess(MetricsRequest$SDKInitSuccessTrackingRequest metricsRequest$SDKInitSuccessTrackingRequest) {
        copyOnWrite();
        ((MetricsRequest$SDKInitTrackingRequest) this.instance).setSuccess(metricsRequest$SDKInitSuccessTrackingRequest);
        return this;
    }

    public ba setFailure(q9 q9Var) {
        copyOnWrite();
        ((MetricsRequest$SDKInitTrackingRequest) this.instance).setFailure((MetricsRequest$SDKInitFailureTrackingRequest) q9Var.build());
        return this;
    }

    public ba setSuccess(aa aaVar) {
        copyOnWrite();
        ((MetricsRequest$SDKInitTrackingRequest) this.instance).setSuccess((MetricsRequest$SDKInitSuccessTrackingRequest) aaVar.build());
        return this;
    }
}
