package rk;

import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface o extends MessageLiteOrBuilder {
    long getExpirationEpochTimestampMillis();

    CampaignProto$ThickContent getMessages(int i10);

    int getMessagesCount();

    List<CampaignProto$ThickContent> getMessagesList();
}
