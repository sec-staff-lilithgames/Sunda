package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ja;
import com.explorestack.protobuf.p7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum ErrorReasonAnalytics implements ja {
    ERROR_REASON_ANALYTICS_INVALID(0),
    ERROR_REASON_ANALYTICS_UNDEFINED(2000),
    ERROR_REASON_ANALYTICS_MONITOR_UNDEFINED(2100),
    ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT(ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT_VALUE),
    ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT(ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT_VALUE),
    ERROR_REASON_ANALYTICS_READER_UNDEFINED(2200),
    ERROR_REASON_ANALYTICS_READER_NO_CONTENT(2201),
    ERROR_REASON_ANALYTICS_READER_BAD_CONTENT(ERROR_REASON_ANALYTICS_READER_BAD_CONTENT_VALUE),
    ERROR_REASON_ANALYTICS_READER_NO_ACCESS(2203),
    UNRECOGNIZED(-1);

    public static final int ERROR_REASON_ANALYTICS_INVALID_VALUE = 0;
    public static final int ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT_VALUE = 2102;
    public static final int ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT_VALUE = 2101;
    public static final int ERROR_REASON_ANALYTICS_MONITOR_UNDEFINED_VALUE = 2100;
    public static final int ERROR_REASON_ANALYTICS_READER_BAD_CONTENT_VALUE = 2202;
    public static final int ERROR_REASON_ANALYTICS_READER_NO_ACCESS_VALUE = 2203;
    public static final int ERROR_REASON_ANALYTICS_READER_NO_CONTENT_VALUE = 2201;
    public static final int ERROR_REASON_ANALYTICS_READER_UNDEFINED_VALUE = 2200;
    public static final int ERROR_REASON_ANALYTICS_UNDEFINED_VALUE = 2000;
    private final int value;
    private static final p7 internalValueMap = new p7() { // from class: io.bidmachine.protobuf.sdk.ErrorReasonAnalytics.1
        @Override // com.explorestack.protobuf.p7
        public ErrorReasonAnalytics findValueByNumber(int i10) {
            return ErrorReasonAnalytics.forNumber(i10);
        }
    };
    private static final ErrorReasonAnalytics[] VALUES = values();

    ErrorReasonAnalytics(int i10) {
        this.value = i10;
    }

    public static ErrorReasonAnalytics forNumber(int i10) {
        if (i10 == 0) {
            return ERROR_REASON_ANALYTICS_INVALID;
        }
        if (i10 == 2000) {
            return ERROR_REASON_ANALYTICS_UNDEFINED;
        }
        switch (i10) {
            case 2100:
                return ERROR_REASON_ANALYTICS_MONITOR_UNDEFINED;
            case ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT_VALUE:
                return ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT;
            case ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT_VALUE:
                return ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT;
            default:
                switch (i10) {
                    case 2200:
                        return ERROR_REASON_ANALYTICS_READER_UNDEFINED;
                    case 2201:
                        return ERROR_REASON_ANALYTICS_READER_NO_CONTENT;
                    case ERROR_REASON_ANALYTICS_READER_BAD_CONTENT_VALUE:
                        return ERROR_REASON_ANALYTICS_READER_BAD_CONTENT;
                    case 2203:
                        return ERROR_REASON_ANALYTICS_READER_NO_ACCESS;
                    default:
                        return null;
                }
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return SDKErrorsProto.getDescriptor().getEnumTypes().get(0);
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
    public static ErrorReasonAnalytics valueOf(int i10) {
        return forNumber(i10);
    }

    public static ErrorReasonAnalytics valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
