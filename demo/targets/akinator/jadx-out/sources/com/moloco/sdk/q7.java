package com.moloco.sdk;

import com.google.protobuf.MessageLiteOrBuilder;
import com.moloco.sdk.ConfigsOuterClass$Configs;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface q7 extends MessageLiteOrBuilder {
    ConfigsOuterClass$Configs.AndroidConfigs getAndroidConfig();

    k7 getClientConfigsCase();

    ConfigsOuterClass$Configs.CommonConfigs getCommonConfigs();

    ConfigsOuterClass$Configs.IOSConfigs getIosConfig();

    boolean hasAndroidConfig();

    boolean hasCommonConfigs();

    boolean hasIosConfig();
}
