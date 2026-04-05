package qk;

import com.google.firebase.inappmessaging.CommonTypesProto$CampaignTime;
import com.google.firebase.inappmessaging.CommonTypesProto$Priority;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface e extends MessageLiteOrBuilder {
    CommonTypesProto$CampaignTime getEndTime();

    String getExperimentId();

    ByteString getExperimentIdBytes();

    CommonTypesProto$Priority getPriority();

    int getSelectedVariantIndex();

    CommonTypesProto$CampaignTime getStartTime();

    boolean hasEndTime();

    boolean hasPriority();

    boolean hasStartTime();
}
