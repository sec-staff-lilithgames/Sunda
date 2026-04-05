package com.explorestack.protobuf;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface k1 extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getName();

    ByteString getNameBytes();

    n1 getOptions();

    o1 getOptionsOrBuilder();

    String getReservedName(int i10);

    ByteString getReservedNameBytes(int i10);

    int getReservedNameCount();

    List<String> getReservedNameList();

    h1 getReservedRange(int i10);

    int getReservedRangeCount();

    List<h1> getReservedRangeList();

    i1 getReservedRangeOrBuilder(int i10);

    List<? extends i1> getReservedRangeOrBuilderList();

    r1 getValue(int i10);

    int getValueCount();

    List<r1> getValueList();

    s1 getValueOrBuilder(int i10);

    List<? extends s1> getValueOrBuilderList();

    boolean hasName();

    boolean hasOptions();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
