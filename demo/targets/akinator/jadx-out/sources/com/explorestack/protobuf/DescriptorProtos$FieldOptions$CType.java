package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum DescriptorProtos$FieldOptions$CType implements ja {
    STRING(0),
    CORD(1),
    STRING_PIECE(2);

    public static final int CORD_VALUE = 1;
    public static final int STRING_PIECE_VALUE = 2;
    public static final int STRING_VALUE = 0;
    private final int value;
    private static final p7 internalValueMap = new j2();
    private static final DescriptorProtos$FieldOptions$CType[] VALUES = values();

    DescriptorProtos$FieldOptions$CType(int i10) {
        this.value = i10;
    }

    public static DescriptorProtos$FieldOptions$CType forNumber(int i10) {
        if (i10 == 0) {
            return STRING;
        }
        if (i10 == 1) {
            return CORD;
        }
        if (i10 != 2) {
            return null;
        }
        return STRING_PIECE;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return l2.getDescriptor().getEnumTypes().get(0);
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
    public static DescriptorProtos$FieldOptions$CType valueOf(int i10) {
        return forNumber(i10);
    }

    public static DescriptorProtos$FieldOptions$CType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
