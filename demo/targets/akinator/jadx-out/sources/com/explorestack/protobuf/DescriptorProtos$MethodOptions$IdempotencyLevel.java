package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum DescriptorProtos$MethodOptions$IdempotencyLevel implements ja {
    IDEMPOTENCY_UNKNOWN(0),
    NO_SIDE_EFFECTS(1),
    IDEMPOTENT(2);

    public static final int IDEMPOTENCY_UNKNOWN_VALUE = 0;
    public static final int IDEMPOTENT_VALUE = 2;
    public static final int NO_SIDE_EFFECTS_VALUE = 1;
    private final int value;
    private static final p7 internalValueMap = new o3();
    private static final DescriptorProtos$MethodOptions$IdempotencyLevel[] VALUES = values();

    DescriptorProtos$MethodOptions$IdempotencyLevel(int i10) {
        this.value = i10;
    }

    public static DescriptorProtos$MethodOptions$IdempotencyLevel forNumber(int i10) {
        if (i10 == 0) {
            return IDEMPOTENCY_UNKNOWN;
        }
        if (i10 == 1) {
            return NO_SIDE_EFFECTS;
        }
        if (i10 != 2) {
            return null;
        }
        return IDEMPOTENT;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return p3.getDescriptor().getEnumTypes().get(0);
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
    public static DescriptorProtos$MethodOptions$IdempotencyLevel valueOf(int i10) {
        return forNumber(i10);
    }

    public static DescriptorProtos$MethodOptions$IdempotencyLevel valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
