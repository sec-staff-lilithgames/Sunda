package com.explorestack.protobuf;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface w4 extends MessageOrBuilder {
    String getAggregateValue();

    ByteString getAggregateValueBytes();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    double getDoubleValue();

    String getIdentifierValue();

    ByteString getIdentifierValueBytes();

    t4 getName(int i10);

    int getNameCount();

    List<t4> getNameList();

    u4 getNameOrBuilder(int i10);

    List<? extends u4> getNameOrBuilderList();

    long getNegativeIntValue();

    long getPositiveIntValue();

    ByteString getStringValue();

    boolean hasAggregateValue();

    boolean hasDoubleValue();

    boolean hasIdentifierValue();

    boolean hasNegativeIntValue();

    boolean hasPositiveIntValue();

    boolean hasStringValue();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
