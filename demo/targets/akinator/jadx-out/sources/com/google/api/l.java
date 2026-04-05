package com.google.api;

import com.google.api.Distribution;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface l extends MessageLiteOrBuilder {
    Distribution.BucketOptions.Explicit getExplicitBuckets();

    Distribution.BucketOptions.Exponential getExponentialBuckets();

    Distribution.BucketOptions.Linear getLinearBuckets();

    k getOptionsCase();

    boolean hasExplicitBuckets();

    boolean hasExponentialBuckets();

    boolean hasLinearBuckets();
}
