package com.explorestack.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface v8 {
    Message convertKeyAndValueToMessage(Object obj, Object obj2);

    void convertMessageToKeyAndValue(Message message, Map<Object, Object> map);

    Message getMessageDefaultInstance();
}
