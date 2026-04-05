package com.explorestack.protobuf;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface v2 extends t6 {
    boolean getCcEnableArenas();

    boolean getCcGenericServices();

    String getCsharpNamespace();

    ByteString getCsharpNamespaceBytes();

    @Override // com.explorestack.protobuf.t6, com.explorestack.protobuf.MessageOrBuilder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ Message getDefaultInstanceForType();

    @Override // com.explorestack.protobuf.t6, com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    boolean getDeprecated();

    @Override // com.explorestack.protobuf.t6
    /* synthetic */ Object getExtension(e5 e5Var);

    @Override // com.explorestack.protobuf.t6
    /* synthetic */ Object getExtension(e5 e5Var, int i10);

    @Override // com.explorestack.protobuf.t6
    /* synthetic */ Object getExtension(e6 e6Var);

    @Override // com.explorestack.protobuf.t6
    /* synthetic */ Object getExtension(e6 e6Var, int i10);

    @Override // com.explorestack.protobuf.t6
    /* synthetic */ Object getExtension(f5 f5Var);

    @Override // com.explorestack.protobuf.t6
    /* synthetic */ Object getExtension(f5 f5Var, int i10);

    @Override // com.explorestack.protobuf.t6
    /* synthetic */ int getExtensionCount(e5 e5Var);

    @Override // com.explorestack.protobuf.t6
    /* synthetic */ int getExtensionCount(e6 e6Var);

    @Override // com.explorestack.protobuf.t6
    /* synthetic */ int getExtensionCount(f5 f5Var);

    String getGoPackage();

    ByteString getGoPackageBytes();

    @Deprecated
    boolean getJavaGenerateEqualsAndHash();

    boolean getJavaGenericServices();

    boolean getJavaMultipleFiles();

    String getJavaOuterClassname();

    ByteString getJavaOuterClassnameBytes();

    String getJavaPackage();

    ByteString getJavaPackageBytes();

    boolean getJavaStringCheckUtf8();

    String getObjcClassPrefix();

    ByteString getObjcClassPrefixBytes();

    DescriptorProtos$FileOptions$OptimizeMode getOptimizeFor();

    String getPhpClassPrefix();

    ByteString getPhpClassPrefixBytes();

    boolean getPhpGenericServices();

    String getPhpMetadataNamespace();

    ByteString getPhpMetadataNamespaceBytes();

    String getPhpNamespace();

    ByteString getPhpNamespaceBytes();

    boolean getPyGenericServices();

    String getRubyPackage();

    ByteString getRubyPackageBytes();

    String getSwiftPrefix();

    ByteString getSwiftPrefixBytes();

    v4 getUninterpretedOption(int i10);

    int getUninterpretedOptionCount();

    List<v4> getUninterpretedOptionList();

    w4 getUninterpretedOptionOrBuilder(int i10);

    List<? extends w4> getUninterpretedOptionOrBuilderList();

    boolean hasCcEnableArenas();

    boolean hasCcGenericServices();

    boolean hasCsharpNamespace();

    boolean hasDeprecated();

    @Override // com.explorestack.protobuf.t6
    /* synthetic */ boolean hasExtension(e5 e5Var);

    @Override // com.explorestack.protobuf.t6
    /* synthetic */ boolean hasExtension(e6 e6Var);

    @Override // com.explorestack.protobuf.t6
    /* synthetic */ boolean hasExtension(f5 f5Var);

    boolean hasGoPackage();

    @Deprecated
    boolean hasJavaGenerateEqualsAndHash();

    boolean hasJavaGenericServices();

    boolean hasJavaMultipleFiles();

    boolean hasJavaOuterClassname();

    boolean hasJavaPackage();

    boolean hasJavaStringCheckUtf8();

    boolean hasObjcClassPrefix();

    boolean hasOptimizeFor();

    boolean hasPhpClassPrefix();

    boolean hasPhpGenericServices();

    boolean hasPhpMetadataNamespace();

    boolean hasPhpNamespace();

    boolean hasPyGenericServices();

    boolean hasRubyPackage();

    boolean hasSwiftPrefix();

    @Override // com.explorestack.protobuf.t6, com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
