package com.explorestack.protobuf;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface y5 extends MessageOrBuilder {
    Field$Cardinality getCardinality();

    int getCardinalityValue();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getDefaultValue();

    ByteString getDefaultValueBytes();

    String getJsonName();

    ByteString getJsonNameBytes();

    Field$Kind getKind();

    int getKindValue();

    String getName();

    ByteString getNameBytes();

    int getNumber();

    int getOneofIndex();

    da getOptions(int i10);

    int getOptionsCount();

    List<da> getOptionsList();

    ea getOptionsOrBuilder(int i10);

    List<? extends ea> getOptionsOrBuilderList();

    boolean getPacked();

    String getTypeUrl();

    ByteString getTypeUrlBytes();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
