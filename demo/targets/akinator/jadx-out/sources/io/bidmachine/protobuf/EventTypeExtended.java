package io.bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ja;
import com.explorestack.protobuf.p7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum EventTypeExtended implements ja {
    EVENT_TYPE_EXTENDED_INVALID(0),
    EVENT_TYPE_EXTENDED_AD_LOADED(500),
    EVENT_TYPE_EXTENDED_IMPRESSION(501),
    EVENT_TYPE_EXTENDED_VIEWABLE(502),
    EVENT_TYPE_EXTENDED_CLICK(503),
    EVENT_TYPE_EXTENDED_CLOSED(504),
    EVENT_TYPE_EXTENDED_AD_DESTROYED(505),
    EVENT_TYPE_EXTENDED_AD_EXPIRED(EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE),
    EVENT_TYPE_EXTENDED_CONTAINER_ADDED(512),
    EVENT_TYPE_EXTENDED_TOKEN_GENERATED(EVENT_TYPE_EXTENDED_TOKEN_GENERATED_VALUE),
    EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY(EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE),
    EVENT_TYPE_EXTENDED_BROKEN_CREATIVE_DETECTOR(EVENT_TYPE_EXTENDED_BROKEN_CREATIVE_DETECTOR_VALUE),
    EVENT_TYPE_EXTENDED_SESSION_INITIALIZED(506),
    EVENT_TYPE_EXTENDED_REQUEST_LOADED(507),
    EVENT_TYPE_EXTENDED_REQUEST_CANCELED(508),
    EVENT_TYPE_EXTENDED_REQUEST_EXPIRED(509),
    EVENT_TYPE_EXTENDED_REQUEST_DESTROYED(510),
    EVENT_TYPE_EXTENDED_START(600),
    EVENT_TYPE_EXTENDED_FIRST_QUARTILE(601),
    EVENT_TYPE_EXTENDED_MIDPOINT(602),
    EVENT_TYPE_EXTENDED_THIRD_QUARTILE(603),
    EVENT_TYPE_EXTENDED_COMPLETE(604),
    EVENT_TYPE_EXTENDED_MUTE(605),
    EVENT_TYPE_EXTENDED_UNMUTE(606),
    EVENT_TYPE_EXTENDED_SKIP(607),
    EVENT_TYPE_EXTENDED_PAUSE(608),
    EVENT_TYPE_EXTENDED_REWIND(609),
    EVENT_TYPE_EXTENDED_RESUME(610),
    EVENT_TYPE_EXTENDED_FULLSCREEN(611),
    EVENT_TYPE_EXTENDED_EXPAND(612),
    EVENT_TYPE_EXTENDED_COLLAPSE(613),
    EVENT_TYPE_EXTENDED_ACCEPT_INVITATION(614),
    EVENT_TYPE_EXTENDED_CLOSE(615),
    EVENT_TYPE_EXTENDED_CREATIVE_VIEW(616),
    EVENT_TYPE_EXTENDED_MRAID_CLICK(617),
    EVENT_TYPE_EXTENDED_MRAID_OPEN(618),
    EVENT_TYPE_EXTENDED_MRAID_LOADED(619),
    EVENT_TYPE_EXTENDED_SK_OVERLAY_PRESENTING(EVENT_TYPE_EXTENDED_SK_OVERLAY_PRESENTING_VALUE),
    EVENT_TYPE_EXTENDED_SK_OVERLAY_DISMISSING(EVENT_TYPE_EXTENDED_SK_OVERLAY_DISMISSING_VALUE),
    EVENT_TYPE_EXTENDED_HB_NETWORK_INITIALIZED(701),
    EVENT_TYPE_EXTENDED_HB_NETWORK_PREPARED(702),
    EVENT_TYPE_EXTENDED_ALL_HB_NETWORKS_PREPARED(703),
    EVENT_TYPE_EXTENDED_BURL(EVENT_TYPE_EXTENDED_BURL_VALUE),
    EVENT_TYPE_EXTENDED_NURL(EVENT_TYPE_EXTENDED_NURL_VALUE),
    EVENT_TYPE_EXTENDED_LURL(EVENT_TYPE_EXTENDED_LURL_VALUE),
    EVENT_TYPE_EXTENDED_CUSTOM(EVENT_TYPE_EXTENDED_CUSTOM_VALUE),
    EVENT_TYPE_EXTENDED_CUSTOM_LOSS(EVENT_TYPE_EXTENDED_CUSTOM_LOSS_VALUE),
    EVENT_TYPE_EXTENDED_CUSTOM_WIN(EVENT_TYPE_EXTENDED_CUSTOM_WIN_VALUE),
    EVENT_TYPE_EXTENDED_WATERFALL_STARTED(EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE),
    EVENT_TYPE_EXTENDED_AD_UNIT_LOADED(EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE),
    EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED(EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE),
    EVENT_TYPE_EXTENDED_WATERFALL_FINISHED(EVENT_TYPE_EXTENDED_WATERFALL_FINISHED_VALUE),
    EVENT_TYPE_EXTENDED_AD_UNIT_EXPIRED(EVENT_TYPE_EXTENDED_AD_UNIT_EXPIRED_VALUE),
    EVENT_TYPE_EXTENDED_AD_UNIT_INVALIDATED(EVENT_TYPE_EXTENDED_AD_UNIT_INVALIDATED_VALUE),
    EVENT_TYPE_EXTENDED_AD_UNIT_IMPRESSION(EVENT_TYPE_EXTENDED_AD_UNIT_IMPRESSION_VALUE),
    EVENT_TYPE_EXTENDED_AD_UNIT_WIN(EVENT_TYPE_EXTENDED_AD_UNIT_WIN_VALUE),
    EVENT_TYPE_EXTENDED_AD_UNIT_LOSS(EVENT_TYPE_EXTENDED_AD_UNIT_LOSS_VALUE),
    EVENT_TYPE_EXTENDED_AD_UNIT_PAID(EVENT_TYPE_EXTENDED_AD_UNIT_PAID_VALUE),
    EVENT_TYPE_EXTENDED_ERROR(1000),
    EVENT_TYPE_EXTENDED_TRACKING_ERROR(1001),
    EVENT_TYPE_CLICK_BY_SOURCE(EVENT_TYPE_CLICK_BY_SOURCE_VALUE),
    UNRECOGNIZED(-1);

    public static final int EVENT_TYPE_CLICK_BY_SOURCE_VALUE = 1101;
    public static final int EVENT_TYPE_EXTENDED_ACCEPT_INVITATION_VALUE = 614;
    public static final int EVENT_TYPE_EXTENDED_AD_DESTROYED_VALUE = 505;
    public static final int EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE = 511;
    public static final int EVENT_TYPE_EXTENDED_AD_LOADED_VALUE = 500;
    public static final int EVENT_TYPE_EXTENDED_AD_UNIT_EXPIRED_VALUE = 905;
    public static final int EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE = 903;
    public static final int EVENT_TYPE_EXTENDED_AD_UNIT_IMPRESSION_VALUE = 907;
    public static final int EVENT_TYPE_EXTENDED_AD_UNIT_INVALIDATED_VALUE = 906;
    public static final int EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE = 902;
    public static final int EVENT_TYPE_EXTENDED_AD_UNIT_LOSS_VALUE = 909;
    public static final int EVENT_TYPE_EXTENDED_AD_UNIT_PAID_VALUE = 910;
    public static final int EVENT_TYPE_EXTENDED_AD_UNIT_WIN_VALUE = 908;
    public static final int EVENT_TYPE_EXTENDED_ALL_HB_NETWORKS_PREPARED_VALUE = 703;
    public static final int EVENT_TYPE_EXTENDED_BROKEN_CREATIVE_DETECTOR_VALUE = 515;
    public static final int EVENT_TYPE_EXTENDED_BURL_VALUE = 801;
    public static final int EVENT_TYPE_EXTENDED_CLICK_VALUE = 503;
    public static final int EVENT_TYPE_EXTENDED_CLOSED_VALUE = 504;
    public static final int EVENT_TYPE_EXTENDED_CLOSE_VALUE = 615;
    public static final int EVENT_TYPE_EXTENDED_COLLAPSE_VALUE = 613;
    public static final int EVENT_TYPE_EXTENDED_COMPLETE_VALUE = 604;
    public static final int EVENT_TYPE_EXTENDED_CONTAINER_ADDED_VALUE = 512;
    public static final int EVENT_TYPE_EXTENDED_CREATIVE_VIEW_VALUE = 616;
    public static final int EVENT_TYPE_EXTENDED_CUSTOM_LOSS_VALUE = 805;
    public static final int EVENT_TYPE_EXTENDED_CUSTOM_VALUE = 804;
    public static final int EVENT_TYPE_EXTENDED_CUSTOM_WIN_VALUE = 806;
    public static final int EVENT_TYPE_EXTENDED_ERROR_VALUE = 1000;
    public static final int EVENT_TYPE_EXTENDED_EXPAND_VALUE = 612;
    public static final int EVENT_TYPE_EXTENDED_FIRST_QUARTILE_VALUE = 601;
    public static final int EVENT_TYPE_EXTENDED_FULLSCREEN_VALUE = 611;
    public static final int EVENT_TYPE_EXTENDED_HB_NETWORK_INITIALIZED_VALUE = 701;
    public static final int EVENT_TYPE_EXTENDED_HB_NETWORK_PREPARED_VALUE = 702;
    public static final int EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE = 514;
    public static final int EVENT_TYPE_EXTENDED_IMPRESSION_VALUE = 501;
    public static final int EVENT_TYPE_EXTENDED_INVALID_VALUE = 0;
    public static final int EVENT_TYPE_EXTENDED_LURL_VALUE = 803;
    public static final int EVENT_TYPE_EXTENDED_MIDPOINT_VALUE = 602;
    public static final int EVENT_TYPE_EXTENDED_MRAID_CLICK_VALUE = 617;
    public static final int EVENT_TYPE_EXTENDED_MRAID_LOADED_VALUE = 619;
    public static final int EVENT_TYPE_EXTENDED_MRAID_OPEN_VALUE = 618;
    public static final int EVENT_TYPE_EXTENDED_MUTE_VALUE = 605;
    public static final int EVENT_TYPE_EXTENDED_NURL_VALUE = 802;
    public static final int EVENT_TYPE_EXTENDED_PAUSE_VALUE = 608;
    public static final int EVENT_TYPE_EXTENDED_REQUEST_CANCELED_VALUE = 508;
    public static final int EVENT_TYPE_EXTENDED_REQUEST_DESTROYED_VALUE = 510;
    public static final int EVENT_TYPE_EXTENDED_REQUEST_EXPIRED_VALUE = 509;
    public static final int EVENT_TYPE_EXTENDED_REQUEST_LOADED_VALUE = 507;
    public static final int EVENT_TYPE_EXTENDED_RESUME_VALUE = 610;
    public static final int EVENT_TYPE_EXTENDED_REWIND_VALUE = 609;
    public static final int EVENT_TYPE_EXTENDED_SESSION_INITIALIZED_VALUE = 506;
    public static final int EVENT_TYPE_EXTENDED_SKIP_VALUE = 607;
    public static final int EVENT_TYPE_EXTENDED_SK_OVERLAY_DISMISSING_VALUE = 663;
    public static final int EVENT_TYPE_EXTENDED_SK_OVERLAY_PRESENTING_VALUE = 662;
    public static final int EVENT_TYPE_EXTENDED_START_VALUE = 600;
    public static final int EVENT_TYPE_EXTENDED_THIRD_QUARTILE_VALUE = 603;
    public static final int EVENT_TYPE_EXTENDED_TOKEN_GENERATED_VALUE = 513;
    public static final int EVENT_TYPE_EXTENDED_TRACKING_ERROR_VALUE = 1001;
    public static final int EVENT_TYPE_EXTENDED_UNMUTE_VALUE = 606;
    public static final int EVENT_TYPE_EXTENDED_VIEWABLE_VALUE = 502;
    public static final int EVENT_TYPE_EXTENDED_WATERFALL_FINISHED_VALUE = 904;
    public static final int EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE = 901;
    private final int value;
    private static final p7 internalValueMap = new p7() { // from class: io.bidmachine.protobuf.EventTypeExtended.1
        @Override // com.explorestack.protobuf.p7
        public EventTypeExtended findValueByNumber(int i10) {
            return EventTypeExtended.forNumber(i10);
        }
    };
    private static final EventTypeExtended[] VALUES = values();

    EventTypeExtended(int i10) {
        this.value = i10;
    }

    public static EventTypeExtended forNumber(int i10) {
        if (i10 == 0) {
            return EVENT_TYPE_EXTENDED_INVALID;
        }
        if (i10 == 1101) {
            return EVENT_TYPE_CLICK_BY_SOURCE;
        }
        if (i10 == 662) {
            return EVENT_TYPE_EXTENDED_SK_OVERLAY_PRESENTING;
        }
        if (i10 == 663) {
            return EVENT_TYPE_EXTENDED_SK_OVERLAY_DISMISSING;
        }
        if (i10 == 1000) {
            return EVENT_TYPE_EXTENDED_ERROR;
        }
        if (i10 == 1001) {
            return EVENT_TYPE_EXTENDED_TRACKING_ERROR;
        }
        switch (i10) {
            case 500:
                return EVENT_TYPE_EXTENDED_AD_LOADED;
            case 501:
                return EVENT_TYPE_EXTENDED_IMPRESSION;
            case 502:
                return EVENT_TYPE_EXTENDED_VIEWABLE;
            case 503:
                return EVENT_TYPE_EXTENDED_CLICK;
            case 504:
                return EVENT_TYPE_EXTENDED_CLOSED;
            case 505:
                return EVENT_TYPE_EXTENDED_AD_DESTROYED;
            case 506:
                return EVENT_TYPE_EXTENDED_SESSION_INITIALIZED;
            case 507:
                return EVENT_TYPE_EXTENDED_REQUEST_LOADED;
            case 508:
                return EVENT_TYPE_EXTENDED_REQUEST_CANCELED;
            case 509:
                return EVENT_TYPE_EXTENDED_REQUEST_EXPIRED;
            case 510:
                return EVENT_TYPE_EXTENDED_REQUEST_DESTROYED;
            case EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE:
                return EVENT_TYPE_EXTENDED_AD_EXPIRED;
            case 512:
                return EVENT_TYPE_EXTENDED_CONTAINER_ADDED;
            case EVENT_TYPE_EXTENDED_TOKEN_GENERATED_VALUE:
                return EVENT_TYPE_EXTENDED_TOKEN_GENERATED;
            case EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE:
                return EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY;
            case EVENT_TYPE_EXTENDED_BROKEN_CREATIVE_DETECTOR_VALUE:
                return EVENT_TYPE_EXTENDED_BROKEN_CREATIVE_DETECTOR;
            default:
                switch (i10) {
                    case 600:
                        return EVENT_TYPE_EXTENDED_START;
                    case 601:
                        return EVENT_TYPE_EXTENDED_FIRST_QUARTILE;
                    case 602:
                        return EVENT_TYPE_EXTENDED_MIDPOINT;
                    case 603:
                        return EVENT_TYPE_EXTENDED_THIRD_QUARTILE;
                    case 604:
                        return EVENT_TYPE_EXTENDED_COMPLETE;
                    case 605:
                        return EVENT_TYPE_EXTENDED_MUTE;
                    case 606:
                        return EVENT_TYPE_EXTENDED_UNMUTE;
                    case 607:
                        return EVENT_TYPE_EXTENDED_SKIP;
                    case 608:
                        return EVENT_TYPE_EXTENDED_PAUSE;
                    case 609:
                        return EVENT_TYPE_EXTENDED_REWIND;
                    case 610:
                        return EVENT_TYPE_EXTENDED_RESUME;
                    case 611:
                        return EVENT_TYPE_EXTENDED_FULLSCREEN;
                    case 612:
                        return EVENT_TYPE_EXTENDED_EXPAND;
                    case 613:
                        return EVENT_TYPE_EXTENDED_COLLAPSE;
                    case 614:
                        return EVENT_TYPE_EXTENDED_ACCEPT_INVITATION;
                    case 615:
                        return EVENT_TYPE_EXTENDED_CLOSE;
                    case 616:
                        return EVENT_TYPE_EXTENDED_CREATIVE_VIEW;
                    case 617:
                        return EVENT_TYPE_EXTENDED_MRAID_CLICK;
                    case 618:
                        return EVENT_TYPE_EXTENDED_MRAID_OPEN;
                    case 619:
                        return EVENT_TYPE_EXTENDED_MRAID_LOADED;
                    default:
                        switch (i10) {
                            case 701:
                                return EVENT_TYPE_EXTENDED_HB_NETWORK_INITIALIZED;
                            case 702:
                                return EVENT_TYPE_EXTENDED_HB_NETWORK_PREPARED;
                            case 703:
                                return EVENT_TYPE_EXTENDED_ALL_HB_NETWORKS_PREPARED;
                            default:
                                switch (i10) {
                                    case EVENT_TYPE_EXTENDED_BURL_VALUE:
                                        return EVENT_TYPE_EXTENDED_BURL;
                                    case EVENT_TYPE_EXTENDED_NURL_VALUE:
                                        return EVENT_TYPE_EXTENDED_NURL;
                                    case EVENT_TYPE_EXTENDED_LURL_VALUE:
                                        return EVENT_TYPE_EXTENDED_LURL;
                                    case EVENT_TYPE_EXTENDED_CUSTOM_VALUE:
                                        return EVENT_TYPE_EXTENDED_CUSTOM;
                                    case EVENT_TYPE_EXTENDED_CUSTOM_LOSS_VALUE:
                                        return EVENT_TYPE_EXTENDED_CUSTOM_LOSS;
                                    case EVENT_TYPE_EXTENDED_CUSTOM_WIN_VALUE:
                                        return EVENT_TYPE_EXTENDED_CUSTOM_WIN;
                                    default:
                                        switch (i10) {
                                            case EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE:
                                                return EVENT_TYPE_EXTENDED_WATERFALL_STARTED;
                                            case EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE:
                                                return EVENT_TYPE_EXTENDED_AD_UNIT_LOADED;
                                            case EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE:
                                                return EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED;
                                            case EVENT_TYPE_EXTENDED_WATERFALL_FINISHED_VALUE:
                                                return EVENT_TYPE_EXTENDED_WATERFALL_FINISHED;
                                            case EVENT_TYPE_EXTENDED_AD_UNIT_EXPIRED_VALUE:
                                                return EVENT_TYPE_EXTENDED_AD_UNIT_EXPIRED;
                                            case EVENT_TYPE_EXTENDED_AD_UNIT_INVALIDATED_VALUE:
                                                return EVENT_TYPE_EXTENDED_AD_UNIT_INVALIDATED;
                                            case EVENT_TYPE_EXTENDED_AD_UNIT_IMPRESSION_VALUE:
                                                return EVENT_TYPE_EXTENDED_AD_UNIT_IMPRESSION;
                                            case EVENT_TYPE_EXTENDED_AD_UNIT_WIN_VALUE:
                                                return EVENT_TYPE_EXTENDED_AD_UNIT_WIN;
                                            case EVENT_TYPE_EXTENDED_AD_UNIT_LOSS_VALUE:
                                                return EVENT_TYPE_EXTENDED_AD_UNIT_LOSS;
                                            case EVENT_TYPE_EXTENDED_AD_UNIT_PAID_VALUE:
                                                return EVENT_TYPE_EXTENDED_AD_UNIT_PAID;
                                            default:
                                                return null;
                                        }
                                }
                        }
                }
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return ExtensionsProto.getDescriptor().getEnumTypes().get(1);
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
    public static EventTypeExtended valueOf(int i10) {
        return forNumber(i10);
    }

    public static EventTypeExtended valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
