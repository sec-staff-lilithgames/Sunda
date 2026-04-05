package com.explorestack.protobuf;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface a3 extends MessageOrBuilder {
    int getBegin();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    int getEnd();

    int getPath(int i10);

    int getPathCount();

    List<Integer> getPathList();

    String getSourceFile();

    ByteString getSourceFileBytes();

    boolean hasBegin();

    boolean hasEnd();

    boolean hasSourceFile();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
