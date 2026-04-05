package qk;

import com.google.firebase.inappmessaging.ExperimentPayloadProto$ExperimentPayload;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface c extends MessageLiteOrBuilder {
    long getCampaignEndTimeMillis();

    String getCampaignId();

    ByteString getCampaignIdBytes();

    String getCampaignName();

    ByteString getCampaignNameBytes();

    long getCampaignStartTimeMillis();

    ExperimentPayloadProto$ExperimentPayload getExperimentPayload();

    boolean hasExperimentPayload();
}
