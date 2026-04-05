package com.moloco.sdk;

import com.google.protobuf.MessageLiteOrBuilder;
import com.moloco.sdk.MetricsRequest$SDKInitFailureTrackingRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface z9 extends MessageLiteOrBuilder {
    MetricsRequest$SDKInitFailureTrackingRequest.ClientError getClientError();

    w9 getErrorTypeCase();

    MetricsRequest$SDKInitFailureTrackingRequest.ServerError getServerError();

    boolean hasClientError();

    boolean hasServerError();
}
