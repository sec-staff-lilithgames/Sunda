package wk;

import com.google.protobuf.Duration;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.type.TimeZone;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface j extends MessageLiteOrBuilder {
    int getDay();

    int getHours();

    int getMinutes();

    int getMonth();

    int getNanos();

    int getSeconds();

    i getTimeOffsetCase();

    TimeZone getTimeZone();

    Duration getUtcOffset();

    int getYear();

    boolean hasTimeZone();

    boolean hasUtcOffset();
}
