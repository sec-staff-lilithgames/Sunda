package wv;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import java.util.List;
import metric.Metric$Event;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface h extends MessageLiteOrBuilder {
    String getAppKey();

    ByteString getAppKeyBytes();

    String getCmpHash();

    ByteString getCmpHashBytes();

    Metric$Event getEvents(int i10);

    int getEventsCount();

    List<Metric$Event> getEventsList();

    String getIp();

    ByteString getIpBytes();

    String getOrigin();

    ByteString getOriginBytes();

    Timestamp getSavedAt();

    String getTruncatedIp();

    ByteString getTruncatedIpBytes();

    String getUserAgent();

    ByteString getUserAgentBytes();

    String getUuid();

    ByteString getUuidBytes();

    String getUuidHash();

    ByteString getUuidHashBytes();

    boolean hasSavedAt();
}
