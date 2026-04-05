package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum DescriptorProtos$FieldDescriptorProto$Label implements ja {
    LABEL_OPTIONAL(1),
    LABEL_REQUIRED(2),
    LABEL_REPEATED(3);

    public static final int LABEL_OPTIONAL_VALUE = 1;
    public static final int LABEL_REPEATED_VALUE = 3;
    public static final int LABEL_REQUIRED_VALUE = 2;
    private final int value;
    private static final p7 internalValueMap = new d2();
    private static final DescriptorProtos$FieldDescriptorProto$Label[] VALUES = values();

    DescriptorProtos$FieldDescriptorProto$Label(int i10) {
        this.value = i10;
    }

    public static DescriptorProtos$FieldDescriptorProto$Label forNumber(int i10) {
        if (i10 == 1) {
            return LABEL_OPTIONAL;
        }
        if (i10 == 2) {
            return LABEL_REQUIRED;
        }
        if (i10 != 3) {
            return null;
        }
        return LABEL_REPEATED;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return f2.getDescriptor().getEnumTypes().get(1);
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
    public static DescriptorProtos$FieldDescriptorProto$Label valueOf(int i10) {
        return forNumber(i10);
    }

    public static DescriptorProtos$FieldDescriptorProto$Label valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
