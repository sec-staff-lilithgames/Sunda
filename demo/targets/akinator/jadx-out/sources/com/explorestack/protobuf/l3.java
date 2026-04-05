package com.explorestack.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface l3 extends MessageOrBuilder {
    boolean getClientStreaming();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getInputType();

    ByteString getInputTypeBytes();

    String getName();

    ByteString getNameBytes();

    p3 getOptions();

    q3 getOptionsOrBuilder();

    String getOutputType();

    ByteString getOutputTypeBytes();

    boolean getServerStreaming();

    boolean hasClientStreaming();

    boolean hasInputType();

    boolean hasName();

    boolean hasOptions();

    boolean hasOutputType();

    boolean hasServerStreaming();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
