package com.explorestack.protobuf.openrtb;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ja;
import com.explorestack.protobuf.p7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum LossReason implements ja {
    LOSS_REASON_BID_WON(0),
    LOSS_REASON_INTERNAL_ERROR(1),
    LOSS_REASON_IMPRESSION_OPPORTUNITY_EXPIRED(2),
    LOSS_REASON_INVALID_BID_RESPONSE(3),
    LOSS_REASON_INVALID_DEAL_ID(4),
    LOSS_REASON_INVALID_AUCTION_ID(5),
    LOSS_REASON_INVALID_ADVERTISER_DOMAIN(6),
    LOSS_REASON_MISSING_MARKUP(7),
    LOSS_REASON_MISSING_CREATIVE_ID(8),
    LOSS_REASON_MISSING_BID_PRICE(9),
    LOSS_REASON_MISSING_CREATIVE_APPROVAL_DATA(10),
    LOSS_REASON_BELOW_AUCTION_FLOOR(100),
    LOSS_REASON_BELOW_DEAL_FLOOR(101),
    LOSS_REASON_LOST_TO_HIGHER_BID(102),
    LOSS_REASON_LOST_TO_A_DEAL(103),
    LOSS_REASON_SEAT_BLOCKED(104),
    LOSS_REASON_CREATIVE_FILTERED_GENERAL(200),
    LOSS_REASON_CREATIVE_FILTERED_PENDING_PROCESSING(201),
    LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED(202),
    LOSS_REASON_CREATIVE_FILTERED_SIZE_NOT_ALLOWED(203),
    LOSS_REASON_CREATIVE_FILTERED_INCORRECT_CREATIVE_FORMAT(204),
    LOSS_REASON_CREATIVE_FILTERED_ADVERTISER_EXCLUSIONS(205),
    LOSS_REASON_CREATIVE_FILTERED_NOT_SECURE(206),
    LOSS_REASON_CREATIVE_FILTERED_LANGUAGE_EXCLUSIONS(207),
    LOSS_REASON_CREATIVE_FILTERED_CATEGORY_EXCLUSIONS(208),
    LOSS_REASON_CREATIVE_FILTERED_CREATIVE_ATTRIBUTE_EXCLUSIONS(209),
    LOSS_REASON_CREATIVE_FILTERED_AD_TYPE_EXCLUSIONS(210),
    LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG(LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE),
    LOSS_REASON_CREATIVE_FILTERED_NOT_ALLOWED_IN_DEAL(212),
    UNRECOGNIZED(-1);

    public static final int LOSS_REASON_BELOW_AUCTION_FLOOR_VALUE = 100;
    public static final int LOSS_REASON_BELOW_DEAL_FLOOR_VALUE = 101;
    public static final int LOSS_REASON_BID_WON_VALUE = 0;
    public static final int LOSS_REASON_CREATIVE_FILTERED_ADVERTISER_EXCLUSIONS_VALUE = 205;
    public static final int LOSS_REASON_CREATIVE_FILTERED_AD_TYPE_EXCLUSIONS_VALUE = 210;
    public static final int LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE = 211;
    public static final int LOSS_REASON_CREATIVE_FILTERED_CATEGORY_EXCLUSIONS_VALUE = 208;
    public static final int LOSS_REASON_CREATIVE_FILTERED_CREATIVE_ATTRIBUTE_EXCLUSIONS_VALUE = 209;
    public static final int LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE = 202;
    public static final int LOSS_REASON_CREATIVE_FILTERED_GENERAL_VALUE = 200;
    public static final int LOSS_REASON_CREATIVE_FILTERED_INCORRECT_CREATIVE_FORMAT_VALUE = 204;
    public static final int LOSS_REASON_CREATIVE_FILTERED_LANGUAGE_EXCLUSIONS_VALUE = 207;
    public static final int LOSS_REASON_CREATIVE_FILTERED_NOT_ALLOWED_IN_DEAL_VALUE = 212;
    public static final int LOSS_REASON_CREATIVE_FILTERED_NOT_SECURE_VALUE = 206;
    public static final int LOSS_REASON_CREATIVE_FILTERED_PENDING_PROCESSING_VALUE = 201;
    public static final int LOSS_REASON_CREATIVE_FILTERED_SIZE_NOT_ALLOWED_VALUE = 203;
    public static final int LOSS_REASON_IMPRESSION_OPPORTUNITY_EXPIRED_VALUE = 2;
    public static final int LOSS_REASON_INTERNAL_ERROR_VALUE = 1;
    public static final int LOSS_REASON_INVALID_ADVERTISER_DOMAIN_VALUE = 6;
    public static final int LOSS_REASON_INVALID_AUCTION_ID_VALUE = 5;
    public static final int LOSS_REASON_INVALID_BID_RESPONSE_VALUE = 3;
    public static final int LOSS_REASON_INVALID_DEAL_ID_VALUE = 4;
    public static final int LOSS_REASON_LOST_TO_A_DEAL_VALUE = 103;
    public static final int LOSS_REASON_LOST_TO_HIGHER_BID_VALUE = 102;
    public static final int LOSS_REASON_MISSING_BID_PRICE_VALUE = 9;
    public static final int LOSS_REASON_MISSING_CREATIVE_APPROVAL_DATA_VALUE = 10;
    public static final int LOSS_REASON_MISSING_CREATIVE_ID_VALUE = 8;
    public static final int LOSS_REASON_MISSING_MARKUP_VALUE = 7;
    public static final int LOSS_REASON_SEAT_BLOCKED_VALUE = 104;
    private final int value;
    private static final p7 internalValueMap = new a();
    private static final LossReason[] VALUES = values();

    LossReason(int i10) {
        this.value = i10;
    }

    public static LossReason forNumber(int i10) {
        switch (i10) {
            case 0:
                return LOSS_REASON_BID_WON;
            case 1:
                return LOSS_REASON_INTERNAL_ERROR;
            case 2:
                return LOSS_REASON_IMPRESSION_OPPORTUNITY_EXPIRED;
            case 3:
                return LOSS_REASON_INVALID_BID_RESPONSE;
            case 4:
                return LOSS_REASON_INVALID_DEAL_ID;
            case 5:
                return LOSS_REASON_INVALID_AUCTION_ID;
            case 6:
                return LOSS_REASON_INVALID_ADVERTISER_DOMAIN;
            case 7:
                return LOSS_REASON_MISSING_MARKUP;
            case 8:
                return LOSS_REASON_MISSING_CREATIVE_ID;
            case 9:
                return LOSS_REASON_MISSING_BID_PRICE;
            case 10:
                return LOSS_REASON_MISSING_CREATIVE_APPROVAL_DATA;
            default:
                switch (i10) {
                    case 100:
                        return LOSS_REASON_BELOW_AUCTION_FLOOR;
                    case 101:
                        return LOSS_REASON_BELOW_DEAL_FLOOR;
                    case 102:
                        return LOSS_REASON_LOST_TO_HIGHER_BID;
                    case 103:
                        return LOSS_REASON_LOST_TO_A_DEAL;
                    case 104:
                        return LOSS_REASON_SEAT_BLOCKED;
                    default:
                        switch (i10) {
                            case 200:
                                return LOSS_REASON_CREATIVE_FILTERED_GENERAL;
                            case 201:
                                return LOSS_REASON_CREATIVE_FILTERED_PENDING_PROCESSING;
                            case 202:
                                return LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED;
                            case 203:
                                return LOSS_REASON_CREATIVE_FILTERED_SIZE_NOT_ALLOWED;
                            case 204:
                                return LOSS_REASON_CREATIVE_FILTERED_INCORRECT_CREATIVE_FORMAT;
                            case 205:
                                return LOSS_REASON_CREATIVE_FILTERED_ADVERTISER_EXCLUSIONS;
                            case 206:
                                return LOSS_REASON_CREATIVE_FILTERED_NOT_SECURE;
                            case 207:
                                return LOSS_REASON_CREATIVE_FILTERED_LANGUAGE_EXCLUSIONS;
                            case 208:
                                return LOSS_REASON_CREATIVE_FILTERED_CATEGORY_EXCLUSIONS;
                            case 209:
                                return LOSS_REASON_CREATIVE_FILTERED_CREATIVE_ATTRIBUTE_EXCLUSIONS;
                            case 210:
                                return LOSS_REASON_CREATIVE_FILTERED_AD_TYPE_EXCLUSIONS;
                            case LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE:
                                return LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG;
                            case 212:
                                return LOSS_REASON_CREATIVE_FILTERED_NOT_ALLOWED_IN_DEAL;
                            default:
                                return null;
                        }
                }
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return d.getDescriptor().getEnumTypes().get(1);
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
    public static LossReason valueOf(int i10) {
        return forNumber(i10);
    }

    public static LossReason valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
