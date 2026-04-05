package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.MetricsRequest$SDKInitFailureTrackingRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class x9 extends GeneratedMessageLite.Builder implements y9 {
    public x9 clearServerHttpStatus() {
        copyOnWrite();
        ((MetricsRequest$SDKInitFailureTrackingRequest.ServerError) this.instance).clearServerHttpStatus();
        return this;
    }

    @Override // com.moloco.sdk.y9
    public int getServerHttpStatus() {
        return ((MetricsRequest$SDKInitFailureTrackingRequest.ServerError) this.instance).getServerHttpStatus();
    }

    @Override // com.moloco.sdk.y9
    public boolean hasServerHttpStatus() {
        return ((MetricsRequest$SDKInitFailureTrackingRequest.ServerError) this.instance).hasServerHttpStatus();
    }

    public x9 setServerHttpStatus(int i10) {
        copyOnWrite();
        ((MetricsRequest$SDKInitFailureTrackingRequest.ServerError) this.instance).setServerHttpStatus(i10);
        return this;
    }
}
