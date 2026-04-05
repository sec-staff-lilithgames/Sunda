package kh;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface j3 extends MessageLiteOrBuilder {
    String getMetrics(int i10);

    ByteString getMetricsBytes(int i10);

    int getMetricsCount();

    List<String> getMetricsList();

    String getMonitoredResource();

    ByteString getMonitoredResourceBytes();
}
