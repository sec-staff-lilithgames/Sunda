package io.bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ja;
import com.explorestack.protobuf.p7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum AdCacheControl implements ja {
    AD_CACHE_CONTROL_DISABLED(0),
    AD_CACHE_CONTROL_ENABLED(1),
    UNRECOGNIZED(-1);

    public static final int AD_CACHE_CONTROL_DISABLED_VALUE = 0;
    public static final int AD_CACHE_CONTROL_ENABLED_VALUE = 1;
    private final int value;
    private static final p7 internalValueMap = new p7() { // from class: io.bidmachine.protobuf.AdCacheControl.1
        @Override // com.explorestack.protobuf.p7
        public AdCacheControl findValueByNumber(int i10) {
            return AdCacheControl.forNumber(i10);
        }
    };
    private static final AdCacheControl[] VALUES = values();

    AdCacheControl(int i10) {
        this.value = i10;
    }

    public static AdCacheControl forNumber(int i10) {
        if (i10 == 0) {
            return AD_CACHE_CONTROL_DISABLED;
        }
        if (i10 != 1) {
            return null;
        }
        return AD_CACHE_CONTROL_ENABLED;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return ExtensionsProto.getDescriptor().getEnumTypes().get(5);
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
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // com.explorestack.protobuf.ja
    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return getDescriptor().getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }

    @Deprecated
    public static AdCacheControl valueOf(int i10) {
        return forNumber(i10);
    }

    public static AdCacheControl valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
