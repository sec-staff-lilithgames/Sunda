package ix;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface c extends MessageLiteOrBuilder {
    long getCardinality();

    long getEmpty();

    long getFilled();

    String getName();

    ByteString getNameBytes();

    long getTotal();
}
