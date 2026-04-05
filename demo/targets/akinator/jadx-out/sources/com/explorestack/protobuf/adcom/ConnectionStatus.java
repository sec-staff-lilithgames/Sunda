package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ja;
import com.explorestack.protobuf.p7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum ConnectionStatus implements ja {
    CONNECTION_STATUS_UNDEFINED(0),
    CONNECTION_STATUS_ENABLED(1),
    CONNECTION_STATUS_DISABLED(2),
    UNRECOGNIZED(-1);

    public static final int CONNECTION_STATUS_DISABLED_VALUE = 2;
    public static final int CONNECTION_STATUS_ENABLED_VALUE = 1;
    public static final int CONNECTION_STATUS_UNDEFINED_VALUE = 0;
    private final int value;
    private static final p7 internalValueMap = new p7() { // from class: com.explorestack.protobuf.adcom.ConnectionStatus.1
        @Override // com.explorestack.protobuf.p7
        public ConnectionStatus findValueByNumber(int i10) {
            return ConnectionStatus.forNumber(i10);
        }
    };
    private static final ConnectionStatus[] VALUES = values();

    ConnectionStatus(int i10) {
        this.value = i10;
    }

    public static ConnectionStatus forNumber(int i10) {
        if (i10 == 0) {
            return CONNECTION_STATUS_UNDEFINED;
        }
        if (i10 == 1) {
            return CONNECTION_STATUS_ENABLED;
        }
        if (i10 != 2) {
            return null;
        }
        return CONNECTION_STATUS_DISABLED;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor) com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.A(31);
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
    public static ConnectionStatus valueOf(int i10) {
        return forNumber(i10);
    }

    public static ConnectionStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
