package kh;

import com.google.api.UsageRule;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface g5 extends MessageLiteOrBuilder {
    String getProducerNotificationChannel();

    ByteString getProducerNotificationChannelBytes();

    String getRequirements(int i10);

    ByteString getRequirementsBytes(int i10);

    int getRequirementsCount();

    List<String> getRequirementsList();

    UsageRule getRules(int i10);

    int getRulesCount();

    List<UsageRule> getRulesList();
}
