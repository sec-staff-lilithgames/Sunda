package com.moloco.sdk;

import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface v6 extends MessageLiteOrBuilder {
    boolean getLowMem();

    long getLowMemThresholdBytes();

    long getTotalMemBytes();

    boolean hasLowMem();

    boolean hasLowMemThresholdBytes();

    boolean hasTotalMemBytes();
}
