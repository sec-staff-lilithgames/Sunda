package bj;

import com.google.firebase.inappmessaging.CommonTypesProto$TriggerParam;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface p extends MessageLiteOrBuilder {
    int getCount();

    String getName();

    ByteString getNameBytes();

    long getPreviousTimestampMillis();

    long getTimestampMillis();

    CommonTypesProto$TriggerParam getTriggerParams(int i10);

    int getTriggerParamsCount();

    List<CommonTypesProto$TriggerParam> getTriggerParamsList();
}
