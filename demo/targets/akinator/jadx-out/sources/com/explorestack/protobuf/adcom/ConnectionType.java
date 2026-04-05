package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ja;
import com.explorestack.protobuf.p7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum ConnectionType implements ja {
    CONNECTION_TYPE_INVALID(0),
    CONNECTION_TYPE_ETHERNET(1),
    CONNECTION_TYPE_WIFI(2),
    CONNECTION_TYPE_CELLULAR_NETWORK_UNKNOWN(3),
    CONNECTION_TYPE_CELLULAR_NETWORK_2G(4),
    CONNECTION_TYPE_CELLULAR_NETWORK_3G(5),
    CONNECTION_TYPE_CELLULAR_NETWORK_4G(6),
    CONNECTION_TYPE_CELLULAR_NETWORK_5G(7),
    UNRECOGNIZED(-1);

    public static final int CONNECTION_TYPE_CELLULAR_NETWORK_2G_VALUE = 4;
    public static final int CONNECTION_TYPE_CELLULAR_NETWORK_3G_VALUE = 5;
    public static final int CONNECTION_TYPE_CELLULAR_NETWORK_4G_VALUE = 6;
    public static final int CONNECTION_TYPE_CELLULAR_NETWORK_5G_VALUE = 7;
    public static final int CONNECTION_TYPE_CELLULAR_NETWORK_UNKNOWN_VALUE = 3;
    public static final int CONNECTION_TYPE_ETHERNET_VALUE = 1;
    public static final int CONNECTION_TYPE_INVALID_VALUE = 0;
    public static final int CONNECTION_TYPE_WIFI_VALUE = 2;
    private final int value;
    private static final p7 internalValueMap = new p7() { // from class: com.explorestack.protobuf.adcom.ConnectionType.1
        @Override // com.explorestack.protobuf.p7
        public ConnectionType findValueByNumber(int i10) {
            return ConnectionType.forNumber(i10);
        }
    };
    private static final ConnectionType[] VALUES = values();

    ConnectionType(int i10) {
        this.value = i10;
    }

    public static ConnectionType forNumber(int i10) {
        switch (i10) {
            case 0:
                return CONNECTION_TYPE_INVALID;
            case 1:
                return CONNECTION_TYPE_ETHERNET;
            case 2:
                return CONNECTION_TYPE_WIFI;
            case 3:
                return CONNECTION_TYPE_CELLULAR_NETWORK_UNKNOWN;
            case 4:
                return CONNECTION_TYPE_CELLULAR_NETWORK_2G;
            case 5:
                return CONNECTION_TYPE_CELLULAR_NETWORK_3G;
            case 6:
                return CONNECTION_TYPE_CELLULAR_NETWORK_4G;
            case 7:
                return CONNECTION_TYPE_CELLULAR_NETWORK_5G;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor) com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.A(5);
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
    public static ConnectionType valueOf(int i10) {
        return forNumber(i10);
    }

    public static ConnectionType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
