package qk;

import com.google.firebase.inappmessaging.CommonTypesProto$Priority;
import com.google.firebase.inappmessaging.CommonTypesProto$TriggeringCondition;
import com.google.firebase.inappmessaging.MessagesProto$Content;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ExperimentalCampaignPayload;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$VanillaCampaignPayload;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface i extends MessageLiteOrBuilder {
    boolean containsDataBundle(String str);

    MessagesProto$Content getContent();

    @Deprecated
    Map<String, String> getDataBundle();

    int getDataBundleCount();

    Map<String, String> getDataBundleMap();

    String getDataBundleOrDefault(String str, String str2);

    String getDataBundleOrThrow(String str);

    CampaignProto$ExperimentalCampaignPayload getExperimentalPayload();

    boolean getIsTestCampaign();

    h getPayloadCase();

    CommonTypesProto$Priority getPriority();

    CommonTypesProto$TriggeringCondition getTriggeringConditions(int i10);

    int getTriggeringConditionsCount();

    List<CommonTypesProto$TriggeringCondition> getTriggeringConditionsList();

    CampaignProto$VanillaCampaignPayload getVanillaPayload();

    boolean hasContent();

    boolean hasExperimentalPayload();

    boolean hasPriority();

    boolean hasVanillaPayload();
}
