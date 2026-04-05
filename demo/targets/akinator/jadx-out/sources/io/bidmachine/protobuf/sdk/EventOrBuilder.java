package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.jb;
import io.bidmachine.protobuf.sdk.Event;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface EventOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    Struct getExtrasPrivate();

    jb getExtrasPrivateOrBuilder();

    Monitor getMonitor();

    MonitorOrBuilder getMonitorOrBuilder();

    Event.PayloadCase getPayloadCase();

    Reader getReader();

    ReaderOrBuilder getReaderOrBuilder();

    boolean hasExtrasPrivate();

    boolean hasMonitor();

    boolean hasReader();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
