package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum DescriptorProtos$FileOptions$OptimizeMode implements ja {
    SPEED(1),
    CODE_SIZE(2),
    LITE_RUNTIME(3);

    public static final int CODE_SIZE_VALUE = 2;
    public static final int LITE_RUNTIME_VALUE = 3;
    public static final int SPEED_VALUE = 1;
    private final int value;
    private static final p7 internalValueMap = new t2();
    private static final DescriptorProtos$FileOptions$OptimizeMode[] VALUES = values();

    DescriptorProtos$FileOptions$OptimizeMode(int i10) {
        this.value = i10;
    }

    public static DescriptorProtos$FileOptions$OptimizeMode forNumber(int i10) {
        if (i10 == 1) {
            return SPEED;
        }
        if (i10 == 2) {
            return CODE_SIZE;
        }
        if (i10 != 3) {
            return null;
        }
        return LITE_RUNTIME;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return u2.getDescriptor().getEnumTypes().get(0);
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
    public static DescriptorProtos$FileOptions$OptimizeMode valueOf(int i10) {
        return forNumber(i10);
    }

    public static DescriptorProtos$FileOptions$OptimizeMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
