package io.bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ja;
import com.explorestack.protobuf.p7;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum HeaderBiddingType implements ja {
    HEADER_BIDDING_TYPE_INVALID(0),
    HEADER_BIDDING_TYPE_DISABLED(-1),
    HEADER_BIDDING_TYPE_ENABLED(1),
    UNRECOGNIZED(-1);

    public static final int HEADER_BIDDING_TYPE_DISABLED_VALUE = -1;
    public static final int HEADER_BIDDING_TYPE_ENABLED_VALUE = 1;
    public static final int HEADER_BIDDING_TYPE_INVALID_VALUE = 0;
    private final int value;
    private static final p7 internalValueMap = new p7() { // from class: io.bidmachine.protobuf.HeaderBiddingType.1
        @Override // com.explorestack.protobuf.p7
        public HeaderBiddingType findValueByNumber(int i10) {
            return HeaderBiddingType.forNumber(i10);
        }
    };
    private static final HeaderBiddingType[] VALUES = values();

    HeaderBiddingType(int i10) {
        this.value = i10;
    }

    public static HeaderBiddingType forNumber(int i10) {
        if (i10 == -1) {
            return HEADER_BIDDING_TYPE_DISABLED;
        }
        if (i10 == 0) {
            return HEADER_BIDDING_TYPE_INVALID;
        }
        if (i10 != 1) {
            return null;
        }
        return HEADER_BIDDING_TYPE_ENABLED;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return ExtensionsProto.getDescriptor().getEnumTypes().get(4);
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
    public static HeaderBiddingType valueOf(int i10) {
        return forNumber(i10);
    }

    public static HeaderBiddingType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException(wHkgq.RZQuGdQ);
    }
}
