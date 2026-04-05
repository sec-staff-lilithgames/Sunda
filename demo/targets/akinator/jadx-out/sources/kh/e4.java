package kh;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface e4 extends MessageLiteOrBuilder {
    boolean containsValues(String str);

    long getDefaultLimit();

    String getDescription();

    ByteString getDescriptionBytes();

    String getDisplayName();

    ByteString getDisplayNameBytes();

    String getDuration();

    ByteString getDurationBytes();

    long getFreeTier();

    long getMaxLimit();

    String getMetric();

    ByteString getMetricBytes();

    String getName();

    ByteString getNameBytes();

    String getUnit();

    ByteString getUnitBytes();

    @Deprecated
    Map<String, Long> getValues();

    int getValuesCount();

    Map<String, Long> getValuesMap();

    long getValuesOrDefault(String str, long j10);

    long getValuesOrThrow(String str);
}
