package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.jb;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface h extends MessageOrBuilder {
    Context.App getApp();

    Context.AppOrBuilder getAppOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    Context.Device getDevice();

    Context.DeviceOrBuilder getDeviceOrBuilder();

    Struct getExt();

    jb getExtOrBuilder();

    Any getExtProto(int i10);

    int getExtProtoCount();

    List<Any> getExtProtoList();

    com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

    List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

    Context.Regs getRegs();

    Context.RegsOrBuilder getRegsOrBuilder();

    Context.Restrictions getRestrictions();

    Context.RestrictionsOrBuilder getRestrictionsOrBuilder();

    Context.User getUser();

    Context.UserOrBuilder getUserOrBuilder();

    boolean hasApp();

    boolean hasDevice();

    boolean hasExt();

    boolean hasRegs();

    boolean hasRestrictions();

    boolean hasUser();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
