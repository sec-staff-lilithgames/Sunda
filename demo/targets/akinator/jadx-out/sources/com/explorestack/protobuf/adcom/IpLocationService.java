package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ja;
import com.explorestack.protobuf.p7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum IpLocationService implements ja {
    IP_LOCATION_SERVICE_INVALID(0),
    IP_LOCATION_SERVICE_IP2LOCATION(1),
    IP_LOCATION_SERVICE_NEUSTAR(2),
    IP_LOCATION_SERVICE_MAXMIND(3),
    IP_LOCATION_SERVICE_NETAQUITY(4),
    UNRECOGNIZED(-1);

    public static final int IP_LOCATION_SERVICE_INVALID_VALUE = 0;
    public static final int IP_LOCATION_SERVICE_IP2LOCATION_VALUE = 1;
    public static final int IP_LOCATION_SERVICE_MAXMIND_VALUE = 3;
    public static final int IP_LOCATION_SERVICE_NETAQUITY_VALUE = 4;
    public static final int IP_LOCATION_SERVICE_NEUSTAR_VALUE = 2;
    private final int value;
    private static final p7 internalValueMap = new p();
    private static final IpLocationService[] VALUES = values();

    IpLocationService(int i10) {
        this.value = i10;
    }

    public static IpLocationService forNumber(int i10) {
        if (i10 == 0) {
            return IP_LOCATION_SERVICE_INVALID;
        }
        if (i10 == 1) {
            return IP_LOCATION_SERVICE_IP2LOCATION;
        }
        if (i10 == 2) {
            return IP_LOCATION_SERVICE_NEUSTAR;
        }
        if (i10 == 3) {
            return IP_LOCATION_SERVICE_MAXMIND;
        }
        if (i10 != 4) {
            return null;
        }
        return IP_LOCATION_SERVICE_NETAQUITY;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor) com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.A(16);
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
    public static IpLocationService valueOf(int i10) {
        return forNumber(i10);
    }

    public static IpLocationService valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
