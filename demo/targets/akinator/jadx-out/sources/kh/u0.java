package kh;

import com.google.protobuf.Any;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface u0 extends MessageLiteOrBuilder {
    Any getAttachments(int i10);

    int getAttachmentsCount();

    List<Any> getAttachmentsList();

    Timestamp getTimestamp();

    double getValue();

    boolean hasTimestamp();
}
