package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface b9 extends MessageLiteOrBuilder {
    boolean getEnabled();

    int getPollingIntervalSeconds();

    String getUrl();

    ByteString getUrlBytes();
}
