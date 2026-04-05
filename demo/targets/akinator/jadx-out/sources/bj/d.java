package bj;

import com.google.firebase.inappmessaging.ClientAppInfo;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface d extends MessageLiteOrBuilder {
    String getCampaignId();

    ByteString getCampaignIdBytes();

    ClientAppInfo getClientApp();

    long getClientTimestampMillis();

    g0 getDismissType();

    int getEngagementMetricsDeliveryRetryCount();

    c getEventCase();

    j0 getEventType();

    u0 getFetchErrorReason();

    String getFiamSdkVersion();

    ByteString getFiamSdkVersionBytes();

    String getProjectNumber();

    ByteString getProjectNumberBytes();

    z1 getRenderErrorReason();

    boolean hasCampaignId();

    boolean hasClientApp();

    boolean hasClientTimestampMillis();

    boolean hasDismissType();

    boolean hasEngagementMetricsDeliveryRetryCount();

    boolean hasEventType();

    boolean hasFetchErrorReason();

    boolean hasFiamSdkVersion();

    boolean hasProjectNumber();

    boolean hasRenderErrorReason();
}
