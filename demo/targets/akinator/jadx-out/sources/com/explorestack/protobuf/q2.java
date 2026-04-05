package com.explorestack.protobuf;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface q2 extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getDependency(int i10);

    ByteString getDependencyBytes(int i10);

    int getDependencyCount();

    List<String> getDependencyList();

    j1 getEnumType(int i10);

    int getEnumTypeCount();

    List<j1> getEnumTypeList();

    k1 getEnumTypeOrBuilder(int i10);

    List<? extends k1> getEnumTypeOrBuilderList();

    f2 getExtension(int i10);

    int getExtensionCount();

    List<f2> getExtensionList();

    g2 getExtensionOrBuilder(int i10);

    List<? extends g2> getExtensionOrBuilderList();

    b1 getMessageType(int i10);

    int getMessageTypeCount();

    List<b1> getMessageTypeList();

    c1 getMessageTypeOrBuilder(int i10);

    List<? extends c1> getMessageTypeOrBuilderList();

    String getName();

    ByteString getNameBytes();

    u2 getOptions();

    v2 getOptionsOrBuilder();

    String getPackage();

    ByteString getPackageBytes();

    int getPublicDependency(int i10);

    int getPublicDependencyCount();

    List<Integer> getPublicDependencyList();

    b4 getService(int i10);

    int getServiceCount();

    List<b4> getServiceList();

    c4 getServiceOrBuilder(int i10);

    List<? extends c4> getServiceOrBuilderList();

    n4 getSourceCodeInfo();

    o4 getSourceCodeInfoOrBuilder();

    String getSyntax();

    ByteString getSyntaxBytes();

    int getWeakDependency(int i10);

    int getWeakDependencyCount();

    List<Integer> getWeakDependencyList();

    boolean hasName();

    boolean hasOptions();

    boolean hasPackage();

    boolean hasSourceCodeInfo();

    boolean hasSyntax();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
