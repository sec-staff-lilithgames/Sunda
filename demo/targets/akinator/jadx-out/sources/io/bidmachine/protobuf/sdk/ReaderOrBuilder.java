package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.sb;
import io.bidmachine.protobuf.sdk.Reader;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface ReaderOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getName();

    ByteString getNameBytes();

    Reader.Record getRecords(int i10);

    int getRecordsCount();

    List<Reader.Record> getRecordsList();

    Reader.RecordOrBuilder getRecordsOrBuilder(int i10);

    List<? extends Reader.RecordOrBuilder> getRecordsOrBuilderList();

    Timestamp getTimestamp();

    sb getTimestampOrBuilder();

    boolean hasTimestamp();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
