package bj;

import com.google.firebase.inappmessaging.CommonTypesProto$Event;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface d0 extends MessageLiteOrBuilder {
    c0 getConditionCase();

    CommonTypesProto$Event getEvent();

    y getFiamTrigger();

    int getFiamTriggerValue();

    boolean hasEvent();

    boolean hasFiamTrigger();
}
