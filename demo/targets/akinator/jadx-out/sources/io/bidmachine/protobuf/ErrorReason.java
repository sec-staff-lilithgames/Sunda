package io.bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ja;
import com.explorestack.protobuf.p7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum ErrorReason implements ja {
    ERROR_REASON_INVALID(0),
    ERROR_REASON_NO_CONNECTION(100),
    ERROR_REASON_BAD_CONTENT(101),
    ERROR_REASON_TIMEOUT(102),
    ERROR_REASON_NO_CONTENT(103),
    ERROR_REASON_HANDLED_EXCEPTION(104),
    ERROR_REASON_WAS_CLOSED(105),
    ERROR_REASON_WAS_DESTROYED(106),
    ERROR_REASON_WAS_EXPIRED(107),
    ERROR_REASON_WAS_USED_ALREADY(111),
    ERROR_REASON_INTERNAL(108),
    ERROR_REASON_HTTP_SERVER_ERROR(109),
    ERROR_REASON_HTTP_BAD_REQUEST(110),
    ERROR_REASON_INVALID_JS_XHR(112),
    ERROR_REASON_HB_NETWORK(200),
    ERROR_REASON_PLACEHOLDER_TIMEOUT(201),
    UNRECOGNIZED(-1);

    public static final int ERROR_REASON_BAD_CONTENT_VALUE = 101;
    public static final int ERROR_REASON_HANDLED_EXCEPTION_VALUE = 104;
    public static final int ERROR_REASON_HB_NETWORK_VALUE = 200;
    public static final int ERROR_REASON_HTTP_BAD_REQUEST_VALUE = 110;
    public static final int ERROR_REASON_HTTP_SERVER_ERROR_VALUE = 109;
    public static final int ERROR_REASON_INTERNAL_VALUE = 108;
    public static final int ERROR_REASON_INVALID_JS_XHR_VALUE = 112;
    public static final int ERROR_REASON_INVALID_VALUE = 0;
    public static final int ERROR_REASON_NO_CONNECTION_VALUE = 100;
    public static final int ERROR_REASON_NO_CONTENT_VALUE = 103;
    public static final int ERROR_REASON_PLACEHOLDER_TIMEOUT_VALUE = 201;
    public static final int ERROR_REASON_TIMEOUT_VALUE = 102;
    public static final int ERROR_REASON_WAS_CLOSED_VALUE = 105;
    public static final int ERROR_REASON_WAS_DESTROYED_VALUE = 106;
    public static final int ERROR_REASON_WAS_EXPIRED_VALUE = 107;
    public static final int ERROR_REASON_WAS_USED_ALREADY_VALUE = 111;
    private final int value;
    private static final p7 internalValueMap = new p7() { // from class: io.bidmachine.protobuf.ErrorReason.1
        @Override // com.explorestack.protobuf.p7
        public ErrorReason findValueByNumber(int i10) {
            return ErrorReason.forNumber(i10);
        }
    };
    private static final ErrorReason[] VALUES = values();

    ErrorReason(int i10) {
        this.value = i10;
    }

    public static ErrorReason forNumber(int i10) {
        if (i10 == 0) {
            return ERROR_REASON_INVALID;
        }
        if (i10 == 200) {
            return ERROR_REASON_HB_NETWORK;
        }
        if (i10 == 201) {
            return ERROR_REASON_PLACEHOLDER_TIMEOUT;
        }
        switch (i10) {
            case 100:
                return ERROR_REASON_NO_CONNECTION;
            case 101:
                return ERROR_REASON_BAD_CONTENT;
            case 102:
                return ERROR_REASON_TIMEOUT;
            case 103:
                return ERROR_REASON_NO_CONTENT;
            case 104:
                return ERROR_REASON_HANDLED_EXCEPTION;
            case 105:
                return ERROR_REASON_WAS_CLOSED;
            case 106:
                return ERROR_REASON_WAS_DESTROYED;
            case 107:
                return ERROR_REASON_WAS_EXPIRED;
            case 108:
                return ERROR_REASON_INTERNAL;
            case 109:
                return ERROR_REASON_HTTP_SERVER_ERROR;
            case 110:
                return ERROR_REASON_HTTP_BAD_REQUEST;
            case 111:
                return ERROR_REASON_WAS_USED_ALREADY;
            case 112:
                return ERROR_REASON_INVALID_JS_XHR;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return ExtensionsProto.getDescriptor().getEnumTypes().get(3);
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
    public static ErrorReason valueOf(int i10) {
        return forNumber(i10);
    }

    public static ErrorReason valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
