package wv;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface c extends MessageLiteOrBuilder {
    String getName();

    ByteString getNameBytes();

    Timestamp getTimestamp();

    boolean hasTimestamp();
}
