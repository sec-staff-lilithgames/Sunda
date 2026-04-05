package com.explorestack.protobuf.compiler;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ja;
import com.explorestack.protobuf.p7;
import rb.c;
import rb.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum PluginProtos$CodeGeneratorResponse$Feature implements ja {
    FEATURE_NONE(0),
    FEATURE_PROTO3_OPTIONAL(1);

    public static final int FEATURE_NONE_VALUE = 0;
    public static final int FEATURE_PROTO3_OPTIONAL_VALUE = 1;
    private final int value;
    private static final p7 internalValueMap = new c();
    private static final PluginProtos$CodeGeneratorResponse$Feature[] VALUES = values();

    PluginProtos$CodeGeneratorResponse$Feature(int i10) {
        this.value = i10;
    }

    public static PluginProtos$CodeGeneratorResponse$Feature forNumber(int i10) {
        if (i10 == 0) {
            return FEATURE_NONE;
        }
        if (i10 != 1) {
            return null;
        }
        return FEATURE_PROTO3_OPTIONAL;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return h.getDescriptor().getEnumTypes().get(0);
    }

    public static p7 internalGetValueMap() {
        return internalValueMap;
    }

    @Override // com.explorestack.protobuf.ja
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.explorestack.protobuf.ja, com.explorestack.protobuf.o7
    public final int getNumber() {
        return this.value;
    }

    @Override // com.explorestack.protobuf.ja
    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
    }

    @Deprecated
    public static PluginProtos$CodeGeneratorResponse$Feature valueOf(int i10) {
        return forNumber(i10);
    }

    public static PluginProtos$CodeGeneratorResponse$Feature valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
