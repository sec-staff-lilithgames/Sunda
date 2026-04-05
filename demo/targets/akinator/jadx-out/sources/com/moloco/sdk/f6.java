package com.moloco.sdk;

import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface f6 extends MessageLiteOrBuilder {
    d6 getBatteryStatus();

    int getBatteryStatusValue();

    boolean getLowPowMode();

    int getMaxBatteryLevel();

    boolean hasBatteryStatus();

    boolean hasLowPowMode();

    boolean hasMaxBatteryLevel();
}
