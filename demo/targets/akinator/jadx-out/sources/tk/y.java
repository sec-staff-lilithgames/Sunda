package tk;

import com.google.protobuf.ByteString;
import com.google.protobuf.Duration;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface y extends MessageLiteOrBuilder {
    String getName();

    ByteString getNameBytes();

    Duration getTimeout();

    boolean hasTimeout();
}
