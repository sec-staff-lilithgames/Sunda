package kh;

import com.google.protobuf.Duration;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface l2 extends MessageLiteOrBuilder {
    Duration getIngestDelay();

    @Deprecated
    b2 getLaunchStage();

    @Deprecated
    int getLaunchStageValue();

    Duration getSamplePeriod();

    boolean hasIngestDelay();

    boolean hasSamplePeriod();
}
