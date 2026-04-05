package bj;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.type.Date;
import com.google.type.TimeOfDay;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface j extends MessageLiteOrBuilder {
    Date getDate();

    TimeOfDay getTime();

    String getTimeZone();

    ByteString getTimeZoneBytes();

    boolean hasDate();

    boolean hasTime();
}
