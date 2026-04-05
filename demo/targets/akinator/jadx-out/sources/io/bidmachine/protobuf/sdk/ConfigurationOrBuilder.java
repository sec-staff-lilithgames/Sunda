package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.ib;
import io.bidmachine.protobuf.sdk.Monitor;
import io.bidmachine.protobuf.sdk.Reader;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface ConfigurationOrBuilder extends MessageOrBuilder {
    StringValue getBpk();

    ib getBpkOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    Monitor.Configuration getMonitors(int i10);

    int getMonitorsCount();

    List<Monitor.Configuration> getMonitorsList();

    Monitor.ConfigurationOrBuilder getMonitorsOrBuilder(int i10);

    List<? extends Monitor.ConfigurationOrBuilder> getMonitorsOrBuilderList();

    Reader.Configuration getReaders(int i10);

    int getReadersCount();

    List<Reader.Configuration> getReadersList();

    Reader.ConfigurationOrBuilder getReadersOrBuilder(int i10);

    List<? extends Reader.ConfigurationOrBuilder> getReadersOrBuilderList();

    boolean hasBpk();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
