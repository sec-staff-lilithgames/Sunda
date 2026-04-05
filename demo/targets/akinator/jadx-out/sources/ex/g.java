package ex;

import com.google.protobuf.MessageLiteOrBuilder;
import pubsubBOCollector.MessageOuterClass$UpdateAppKeyList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface g extends MessageLiteOrBuilder {
    f getPayloadCase();

    e getType();

    int getTypeValue();

    MessageOuterClass$UpdateAppKeyList getUpdateAppKeyList();

    boolean hasUpdateAppKeyList();
}
