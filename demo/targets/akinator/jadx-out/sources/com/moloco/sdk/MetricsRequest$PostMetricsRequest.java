package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MetricsRequest$PostMetricsRequest extends GeneratedMessageLite<MetricsRequest$PostMetricsRequest, k9> implements p9 {
    public static final int COUNTS_FIELD_NUMBER = 1;
    private static final MetricsRequest$PostMetricsRequest DEFAULT_INSTANCE;
    public static final int DURATIONS_FIELD_NUMBER = 2;
    private static volatile Parser<MetricsRequest$PostMetricsRequest> PARSER;
    private Internal.ProtobufList<CountEvent> counts_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<TimerEvent> durations_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class CountEvent extends GeneratedMessageLite<CountEvent, l9> implements m9 {
        public static final int COUNT_FIELD_NUMBER = 2;
        private static final CountEvent DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile Parser<CountEvent> PARSER = null;
        public static final int TAGS_FIELD_NUMBER = 3;
        private int count_;
        private String name_ = "";
        private Internal.ProtobufList<String> tags_ = GeneratedMessageLite.emptyProtobufList();

        static {
            CountEvent countEvent = new CountEvent();
            DEFAULT_INSTANCE = countEvent;
            GeneratedMessageLite.registerDefaultInstance(CountEvent.class, countEvent);
        }

        private CountEvent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTags(Iterable<String> iterable) {
            ensureTagsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.tags_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTags(String str) {
            str.getClass();
            ensureTagsIsMutable();
            this.tags_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTagsBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureTagsIsMutable();
            this.tags_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCount() {
            this.count_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTags() {
            this.tags_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureTagsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.tags_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.tags_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static CountEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static l9 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CountEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CountEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CountEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CountEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CountEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCount(int i10) {
            this.count_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTags(int i10, String str) {
            str.getClass();
            ensureTagsIsMutable();
            this.tags_.set(i10, str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (j9.f47261a[methodToInvoke.ordinal()]) {
                case 1:
                    return new CountEvent();
                case 2:
                    return new l9(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u000b\u0003Ț", new Object[]{"name_", "count_", "tags_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CountEvent> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CountEvent.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.moloco.sdk.m9
        public int getCount() {
            return this.count_;
        }

        @Override // com.moloco.sdk.m9
        public String getName() {
            return this.name_;
        }

        @Override // com.moloco.sdk.m9
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.moloco.sdk.m9
        public String getTags(int i10) {
            return this.tags_.get(i10);
        }

        @Override // com.moloco.sdk.m9
        public ByteString getTagsBytes(int i10) {
            return ByteString.copyFromUtf8(this.tags_.get(i10));
        }

        @Override // com.moloco.sdk.m9
        public int getTagsCount() {
            return this.tags_.size();
        }

        @Override // com.moloco.sdk.m9
        public List<String> getTagsList() {
            return this.tags_;
        }

        public static l9 newBuilder(CountEvent countEvent) {
            return DEFAULT_INSTANCE.createBuilder(countEvent);
        }

        public static CountEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CountEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CountEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CountEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CountEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CountEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CountEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CountEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CountEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CountEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CountEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CountEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CountEvent parseFrom(InputStream inputStream) throws IOException {
            return (CountEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CountEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CountEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CountEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CountEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CountEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CountEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class TimerEvent extends GeneratedMessageLite<TimerEvent, n9> implements o9 {
        private static final TimerEvent DEFAULT_INSTANCE;
        public static final int ELAPSED_TIME_MILLIS_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile Parser<TimerEvent> PARSER = null;
        public static final int TAGS_FIELD_NUMBER = 3;
        private long elapsedTimeMillis_;
        private String name_ = "";
        private Internal.ProtobufList<String> tags_ = GeneratedMessageLite.emptyProtobufList();

        static {
            TimerEvent timerEvent = new TimerEvent();
            DEFAULT_INSTANCE = timerEvent;
            GeneratedMessageLite.registerDefaultInstance(TimerEvent.class, timerEvent);
        }

        private TimerEvent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTags(Iterable<String> iterable) {
            ensureTagsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.tags_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTags(String str) {
            str.getClass();
            ensureTagsIsMutable();
            this.tags_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTagsBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureTagsIsMutable();
            this.tags_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearElapsedTimeMillis() {
            this.elapsedTimeMillis_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTags() {
            this.tags_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureTagsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.tags_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.tags_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static TimerEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static n9 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TimerEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TimerEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TimerEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TimerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<TimerEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setElapsedTimeMillis(long j10) {
            this.elapsedTimeMillis_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTags(int i10, String str) {
            str.getClass();
            ensureTagsIsMutable();
            this.tags_.set(i10, str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (j9.f47261a[methodToInvoke.ordinal()]) {
                case 1:
                    return new TimerEvent();
                case 2:
                    return new n9(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0003\u0003Ț", new Object[]{"name_", "elapsedTimeMillis_", "tags_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TimerEvent> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (TimerEvent.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.moloco.sdk.o9
        public long getElapsedTimeMillis() {
            return this.elapsedTimeMillis_;
        }

        @Override // com.moloco.sdk.o9
        public String getName() {
            return this.name_;
        }

        @Override // com.moloco.sdk.o9
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.moloco.sdk.o9
        public String getTags(int i10) {
            return this.tags_.get(i10);
        }

        @Override // com.moloco.sdk.o9
        public ByteString getTagsBytes(int i10) {
            return ByteString.copyFromUtf8(this.tags_.get(i10));
        }

        @Override // com.moloco.sdk.o9
        public int getTagsCount() {
            return this.tags_.size();
        }

        @Override // com.moloco.sdk.o9
        public List<String> getTagsList() {
            return this.tags_;
        }

        public static n9 newBuilder(TimerEvent timerEvent) {
            return DEFAULT_INSTANCE.createBuilder(timerEvent);
        }

        public static TimerEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TimerEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TimerEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TimerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TimerEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TimerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TimerEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TimerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TimerEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TimerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TimerEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TimerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TimerEvent parseFrom(InputStream inputStream) throws IOException {
            return (TimerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TimerEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TimerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TimerEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TimerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TimerEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TimerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    static {
        MetricsRequest$PostMetricsRequest metricsRequest$PostMetricsRequest = new MetricsRequest$PostMetricsRequest();
        DEFAULT_INSTANCE = metricsRequest$PostMetricsRequest;
        GeneratedMessageLite.registerDefaultInstance(MetricsRequest$PostMetricsRequest.class, metricsRequest$PostMetricsRequest);
    }

    private MetricsRequest$PostMetricsRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCounts(Iterable<? extends CountEvent> iterable) {
        ensureCountsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.counts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDurations(Iterable<? extends TimerEvent> iterable) {
        ensureDurationsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.durations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCounts(CountEvent countEvent) {
        countEvent.getClass();
        ensureCountsIsMutable();
        this.counts_.add(countEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDurations(TimerEvent timerEvent) {
        timerEvent.getClass();
        ensureDurationsIsMutable();
        this.durations_.add(timerEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCounts() {
        this.counts_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDurations() {
        this.durations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureCountsIsMutable() {
        Internal.ProtobufList<CountEvent> protobufList = this.counts_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.counts_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureDurationsIsMutable() {
        Internal.ProtobufList<TimerEvent> protobufList = this.durations_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.durations_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static MetricsRequest$PostMetricsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static k9 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MetricsRequest$PostMetricsRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricsRequest$PostMetricsRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MetricsRequest$PostMetricsRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCounts(int i10) {
        ensureCountsIsMutable();
        this.counts_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDurations(int i10) {
        ensureDurationsIsMutable();
        this.durations_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCounts(int i10, CountEvent countEvent) {
        countEvent.getClass();
        ensureCountsIsMutable();
        this.counts_.set(i10, countEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurations(int i10, TimerEvent timerEvent) {
        timerEvent.getClass();
        ensureDurationsIsMutable();
        this.durations_.set(i10, timerEvent);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (j9.f47261a[methodToInvoke.ordinal()]) {
            case 1:
                return new MetricsRequest$PostMetricsRequest();
            case 2:
                return new k9(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"counts_", CountEvent.class, "durations_", TimerEvent.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MetricsRequest$PostMetricsRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MetricsRequest$PostMetricsRequest.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.moloco.sdk.p9
    public CountEvent getCounts(int i10) {
        return this.counts_.get(i10);
    }

    @Override // com.moloco.sdk.p9
    public int getCountsCount() {
        return this.counts_.size();
    }

    @Override // com.moloco.sdk.p9
    public List<CountEvent> getCountsList() {
        return this.counts_;
    }

    public m9 getCountsOrBuilder(int i10) {
        return this.counts_.get(i10);
    }

    public List<? extends m9> getCountsOrBuilderList() {
        return this.counts_;
    }

    @Override // com.moloco.sdk.p9
    public TimerEvent getDurations(int i10) {
        return this.durations_.get(i10);
    }

    @Override // com.moloco.sdk.p9
    public int getDurationsCount() {
        return this.durations_.size();
    }

    @Override // com.moloco.sdk.p9
    public List<TimerEvent> getDurationsList() {
        return this.durations_;
    }

    public o9 getDurationsOrBuilder(int i10) {
        return this.durations_.get(i10);
    }

    public List<? extends o9> getDurationsOrBuilderList() {
        return this.durations_;
    }

    public static k9 newBuilder(MetricsRequest$PostMetricsRequest metricsRequest$PostMetricsRequest) {
        return DEFAULT_INSTANCE.createBuilder(metricsRequest$PostMetricsRequest);
    }

    public static MetricsRequest$PostMetricsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricsRequest$PostMetricsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MetricsRequest$PostMetricsRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCounts(int i10, CountEvent countEvent) {
        countEvent.getClass();
        ensureCountsIsMutable();
        this.counts_.add(i10, countEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDurations(int i10, TimerEvent timerEvent) {
        timerEvent.getClass();
        ensureDurationsIsMutable();
        this.durations_.add(i10, timerEvent);
    }

    public static MetricsRequest$PostMetricsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MetricsRequest$PostMetricsRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MetricsRequest$PostMetricsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MetricsRequest$PostMetricsRequest parseFrom(InputStream inputStream) throws IOException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricsRequest$PostMetricsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricsRequest$PostMetricsRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MetricsRequest$PostMetricsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
