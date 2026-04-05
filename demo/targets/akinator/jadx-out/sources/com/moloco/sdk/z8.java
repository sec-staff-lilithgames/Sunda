package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface z8 extends MessageLiteOrBuilder {
    boolean getEnabled();

    int getMaxBatchSize();

    int getMaxSessionLen();

    String getRawImpUrl();

    ByteString getRawImpUrlBytes();

    int getRetryCount();

    int getSessionExp();

    h9 getSupportedNetworks(int i10);

    int getSupportedNetworksCount();

    List<h9> getSupportedNetworksList();

    int getSupportedNetworksValue(int i10);

    List<Integer> getSupportedNetworksValueList();

    int getUploadInterval();
}
