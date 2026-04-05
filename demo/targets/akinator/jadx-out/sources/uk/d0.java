package uk;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface d0 extends MessageLiteOrBuilder {
    int getCode();

    Any getDetails(int i10);

    int getDetailsCount();

    List<Any> getDetailsList();

    String getMessage();

    ByteString getMessageBytes();
}
