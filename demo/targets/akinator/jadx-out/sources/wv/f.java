package wv;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import metric.Metric$UserMetric;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface f extends MessageLiteOrBuilder {
    e getContentCase();

    Timestamp getCreatedAt();

    String getEmitter();

    ByteString getEmitterBytes();

    Metric$UserMetric getUserMetric();

    boolean hasCreatedAt();

    boolean hasUserMetric();
}
