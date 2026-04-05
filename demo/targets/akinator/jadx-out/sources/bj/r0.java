package bj;

import com.google.firebase.inappmessaging.ExperimentPayloadProto$ExperimentLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface r0 extends MessageLiteOrBuilder {
    String getActivateEventToLog();

    ByteString getActivateEventToLogBytes();

    String getClearEventToLog();

    ByteString getClearEventToLogBytes();

    String getExperimentId();

    ByteString getExperimentIdBytes();

    long getExperimentStartTimeMillis();

    ExperimentPayloadProto$ExperimentLite getOngoingExperiments(int i10);

    int getOngoingExperimentsCount();

    List<ExperimentPayloadProto$ExperimentLite> getOngoingExperimentsList();

    q0 getOverflowPolicy();

    int getOverflowPolicyValue();

    String getSetEventToLog();

    ByteString getSetEventToLogBytes();

    long getTimeToLiveMillis();

    String getTimeoutEventToLog();

    ByteString getTimeoutEventToLogBytes();

    String getTriggerEvent();

    ByteString getTriggerEventBytes();

    long getTriggerTimeoutMillis();

    String getTtlExpiryEventToLog();

    ByteString getTtlExpiryEventToLogBytes();

    String getVariantId();

    ByteString getVariantIdBytes();
}
