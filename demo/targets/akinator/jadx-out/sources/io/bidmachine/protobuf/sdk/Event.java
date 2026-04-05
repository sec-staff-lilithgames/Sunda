package io.bidmachine.protobuf.sdk;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.c;
import com.explorestack.protobuf.cc;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.fa;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.jb;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.o7;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import io.bidmachine.protobuf.sdk.Monitor;
import io.bidmachine.protobuf.sdk.Reader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class Event extends k7 implements EventOrBuilder {
    public static final int EXTRAS_PRIVATE_FIELD_NUMBER = 3;
    public static final int MONITOR_FIELD_NUMBER = 1;
    public static final int READER_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private Struct extrasPrivate_;
    private byte memoizedIsInitialized;
    private int payloadCase_;
    private Object payload_;
    private static final Event DEFAULT_INSTANCE = new Event();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Event.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public Event parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new Event(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.protobuf.sdk.Event$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$sdk$Event$PayloadCase;

        static {
            int[] iArr = new int[PayloadCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$sdk$Event$PayloadCase = iArr;
            try {
                iArr[PayloadCase.MONITOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Event$PayloadCase[PayloadCase.READER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Event$PayloadCase[PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum PayloadCase implements o7, c {
        MONITOR(1),
        READER(2),
        PAYLOAD_NOT_SET(0);

        private final int value;

        PayloadCase(int i10) {
            this.value = i10;
        }

        public static PayloadCase forNumber(int i10) {
            if (i10 == 0) {
                return PAYLOAD_NOT_SET;
            }
            if (i10 == 1) {
                return MONITOR;
            }
            if (i10 != 2) {
                return null;
            }
            return READER;
        }

        @Override // com.explorestack.protobuf.o7
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PayloadCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static Event getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Event parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Event) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Event parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Event) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return super.equals(obj);
        }
        Event event = (Event) obj;
        if (hasExtrasPrivate() != event.hasExtrasPrivate()) {
            return false;
        }
        if ((hasExtrasPrivate() && !getExtrasPrivate().equals(event.getExtrasPrivate())) || !getPayloadCase().equals(event.getPayloadCase())) {
            return false;
        }
        int i10 = this.payloadCase_;
        if (i10 != 1) {
            if (i10 == 2 && !getReader().equals(event.getReader())) {
                return false;
            }
        } else if (!getMonitor().equals(event.getMonitor())) {
            return false;
        }
        return this.unknownFields.equals(event.unknownFields);
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public Struct getExtrasPrivate() {
        Struct struct = this.extrasPrivate_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public jb getExtrasPrivateOrBuilder() {
        return getExtrasPrivate();
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public Monitor getMonitor() {
        return this.payloadCase_ == 1 ? (Monitor) this.payload_ : Monitor.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public MonitorOrBuilder getMonitorOrBuilder() {
        return this.payloadCase_ == 1 ? (Monitor) this.payload_ : Monitor.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public PayloadCase getPayloadCase() {
        return PayloadCase.forNumber(this.payloadCase_);
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public Reader getReader() {
        return this.payloadCase_ == 2 ? (Reader) this.payload_ : Reader.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public ReaderOrBuilder getReaderOrBuilder() {
        return this.payloadCase_ == 2 ? (Reader) this.payload_ : Reader.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeMessageSize = this.payloadCase_ == 1 ? h0.computeMessageSize(1, (Monitor) this.payload_) : 0;
        if (this.payloadCase_ == 2) {
            iComputeMessageSize += h0.computeMessageSize(2, (Reader) this.payload_);
        }
        if (this.extrasPrivate_ != null) {
            iComputeMessageSize += h0.computeMessageSize(3, getExtrasPrivate());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public boolean hasExtrasPrivate() {
        return this.extrasPrivate_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public boolean hasMonitor() {
        return this.payloadCase_ == 1;
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public boolean hasReader() {
        return this.payloadCase_ == 2;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int iB;
        int iHashCode;
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode2 = getDescriptor().hashCode() + 779;
        if (hasExtrasPrivate()) {
            iHashCode2 = o2.B(iHashCode2, 37, 3, 53) + getExtrasPrivate().hashCode();
        }
        int i11 = this.payloadCase_;
        if (i11 != 1) {
            if (i11 == 2) {
                iB = o2.B(iHashCode2, 37, 2, 53);
                iHashCode = getReader().hashCode();
            }
            int iHashCode3 = this.unknownFields.hashCode() + (iHashCode2 * 29);
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }
        iB = o2.B(iHashCode2, 37, 1, 53);
        iHashCode = getMonitor().hashCode();
        iHashCode2 = iB + iHashCode;
        int iHashCode32 = this.unknownFields.hashCode() + (iHashCode2 * 29);
        this.memoizedHashCode = iHashCode32;
        return iHashCode32;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_fieldAccessorTable.ensureFieldAccessorsInitialized(Event.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.memoizedIsInitialized;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.k7
    public Object newInstance(j7 j7Var) {
        return new Event();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (this.payloadCase_ == 1) {
            h0Var.writeMessage(1, (Monitor) this.payload_);
        }
        if (this.payloadCase_ == 2) {
            h0Var.writeMessage(2, (Reader) this.payload_);
        }
        if (this.extrasPrivate_ != null) {
            h0Var.writeMessage(3, getExtrasPrivate());
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements EventOrBuilder {
        private xa extrasPrivateBuilder_;
        private Struct extrasPrivate_;
        private xa monitorBuilder_;
        private int payloadCase_;
        private Object payload_;
        private xa readerBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_descriptor;
        }

        private xa getExtrasPrivateFieldBuilder() {
            if (this.extrasPrivateBuilder_ == null) {
                this.extrasPrivateBuilder_ = new xa(getExtrasPrivate(), getParentForChildren(), isClean());
                this.extrasPrivate_ = null;
            }
            return this.extrasPrivateBuilder_;
        }

        private xa getMonitorFieldBuilder() {
            if (this.monitorBuilder_ == null) {
                if (this.payloadCase_ != 1) {
                    this.payload_ = Monitor.getDefaultInstance();
                }
                this.monitorBuilder_ = new xa((Monitor) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 1;
            onChanged();
            return this.monitorBuilder_;
        }

        private xa getReaderFieldBuilder() {
            if (this.readerBuilder_ == null) {
                if (this.payloadCase_ != 2) {
                    this.payload_ = Reader.getDefaultInstance();
                }
                this.readerBuilder_ = new xa((Reader) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 2;
            onChanged();
            return this.readerBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder clearExtrasPrivate() {
            if (this.extrasPrivateBuilder_ == null) {
                this.extrasPrivate_ = null;
                onChanged();
                return this;
            }
            this.extrasPrivate_ = null;
            this.extrasPrivateBuilder_ = null;
            return this;
        }

        public Builder clearMonitor() {
            xa xaVar = this.monitorBuilder_;
            if (xaVar == null) {
                if (this.payloadCase_ == 1) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.payloadCase_ == 1) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
            xaVar.clear();
            return this;
        }

        public Builder clearPayload() {
            this.payloadCase_ = 0;
            this.payload_ = null;
            onChanged();
            return this;
        }

        public Builder clearReader() {
            xa xaVar = this.readerBuilder_;
            if (xaVar == null) {
                if (this.payloadCase_ == 2) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.payloadCase_ == 2) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
            xaVar.clear();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public Struct getExtrasPrivate() {
            xa xaVar = this.extrasPrivateBuilder_;
            if (xaVar != null) {
                return (Struct) xaVar.getMessage();
            }
            Struct struct = this.extrasPrivate_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getExtrasPrivateBuilder() {
            onChanged();
            return (Struct.Builder) getExtrasPrivateFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public jb getExtrasPrivateOrBuilder() {
            xa xaVar = this.extrasPrivateBuilder_;
            if (xaVar != null) {
                return (jb) xaVar.getMessageOrBuilder();
            }
            Struct struct = this.extrasPrivate_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public Monitor getMonitor() {
            xa xaVar = this.monitorBuilder_;
            return xaVar == null ? this.payloadCase_ == 1 ? (Monitor) this.payload_ : Monitor.getDefaultInstance() : this.payloadCase_ == 1 ? (Monitor) xaVar.getMessage() : Monitor.getDefaultInstance();
        }

        public Monitor.Builder getMonitorBuilder() {
            return (Monitor.Builder) getMonitorFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public MonitorOrBuilder getMonitorOrBuilder() {
            xa xaVar;
            int i10 = this.payloadCase_;
            return (i10 != 1 || (xaVar = this.monitorBuilder_) == null) ? i10 == 1 ? (Monitor) this.payload_ : Monitor.getDefaultInstance() : (MonitorOrBuilder) xaVar.getMessageOrBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public Reader getReader() {
            xa xaVar = this.readerBuilder_;
            return xaVar == null ? this.payloadCase_ == 2 ? (Reader) this.payload_ : Reader.getDefaultInstance() : this.payloadCase_ == 2 ? (Reader) xaVar.getMessage() : Reader.getDefaultInstance();
        }

        public Reader.Builder getReaderBuilder() {
            return (Reader.Builder) getReaderFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public ReaderOrBuilder getReaderOrBuilder() {
            xa xaVar;
            int i10 = this.payloadCase_;
            return (i10 != 2 || (xaVar = this.readerBuilder_) == null) ? i10 == 2 ? (Reader) this.payload_ : Reader.getDefaultInstance() : (ReaderOrBuilder) xaVar.getMessageOrBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public boolean hasExtrasPrivate() {
            return (this.extrasPrivateBuilder_ == null && this.extrasPrivate_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public boolean hasMonitor() {
            return this.payloadCase_ == 1;
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public boolean hasReader() {
            return this.payloadCase_ == 2;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_fieldAccessorTable.ensureFieldAccessorsInitialized(Event.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeExtrasPrivate(Struct struct) {
            xa xaVar = this.extrasPrivateBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(struct);
                return this;
            }
            Struct struct2 = this.extrasPrivate_;
            if (struct2 != null) {
                this.extrasPrivate_ = a.i(struct2, struct);
            } else {
                this.extrasPrivate_ = struct;
            }
            onChanged();
            return this;
        }

        public Builder mergeMonitor(Monitor monitor) {
            xa xaVar = this.monitorBuilder_;
            if (xaVar == null) {
                if (this.payloadCase_ != 1 || this.payload_ == Monitor.getDefaultInstance()) {
                    this.payload_ = monitor;
                } else {
                    this.payload_ = Monitor.newBuilder((Monitor) this.payload_).mergeFrom(monitor).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 1) {
                    xaVar.mergeFrom(monitor);
                }
                this.monitorBuilder_.setMessage(monitor);
            }
            this.payloadCase_ = 1;
            return this;
        }

        public Builder mergeReader(Reader reader) {
            xa xaVar = this.readerBuilder_;
            if (xaVar == null) {
                if (this.payloadCase_ != 2 || this.payload_ == Reader.getDefaultInstance()) {
                    this.payload_ = reader;
                } else {
                    this.payload_ = Reader.newBuilder((Reader) this.payload_).mergeFrom(reader).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 2) {
                    xaVar.mergeFrom(reader);
                }
                this.readerBuilder_.setMessage(reader);
            }
            this.payloadCase_ = 2;
            return this;
        }

        public Builder setExtrasPrivate(Struct struct) {
            xa xaVar = this.extrasPrivateBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(struct);
                return this;
            }
            struct.getClass();
            this.extrasPrivate_ = struct;
            onChanged();
            return this;
        }

        public Builder setMonitor(Monitor monitor) {
            xa xaVar = this.monitorBuilder_;
            if (xaVar == null) {
                monitor.getClass();
                this.payload_ = monitor;
                onChanged();
            } else {
                xaVar.setMessage(monitor);
            }
            this.payloadCase_ = 1;
            return this;
        }

        public Builder setReader(Reader reader) {
            xa xaVar = this.readerBuilder_;
            if (xaVar == null) {
                reader.getClass();
                this.payload_ = reader;
                onChanged();
            } else {
                xaVar.setMessage(reader);
            }
            this.payloadCase_ = 2;
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.payloadCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Event build() {
            Event eventBuildPartial = buildPartial();
            if (eventBuildPartial.isInitialized()) {
                return eventBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) eventBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Event buildPartial() {
            Event event = new Event(this);
            if (this.payloadCase_ == 1) {
                xa xaVar = this.monitorBuilder_;
                if (xaVar == null) {
                    event.payload_ = this.payload_;
                } else {
                    event.payload_ = xaVar.build();
                }
            }
            if (this.payloadCase_ == 2) {
                xa xaVar2 = this.readerBuilder_;
                if (xaVar2 == null) {
                    event.payload_ = this.payload_;
                } else {
                    event.payload_ = xaVar2.build();
                }
            }
            xa xaVar3 = this.extrasPrivateBuilder_;
            if (xaVar3 == null) {
                event.extrasPrivate_ = this.extrasPrivate_;
            } else {
                event.extrasPrivate_ = (Struct) xaVar3.build();
            }
            event.payloadCase_ = this.payloadCase_;
            onBuilt();
            return event;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Event getDefaultInstanceForType() {
            return Event.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(gc gcVar) {
            return (Builder) super.setUnknownFields(gcVar);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(gc gcVar) {
            return (Builder) super.mergeUnknownFields(gcVar);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            if (this.extrasPrivateBuilder_ == null) {
                this.extrasPrivate_ = null;
            } else {
                this.extrasPrivate_ = null;
                this.extrasPrivateBuilder_ = null;
            }
            this.payloadCase_ = 0;
            this.payload_ = null;
            return this;
        }

        private Builder() {
            super(null);
            this.payloadCase_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder setExtrasPrivate(Struct.Builder builder) {
            xa xaVar = this.extrasPrivateBuilder_;
            if (xaVar == null) {
                this.extrasPrivate_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Event) {
                return mergeFrom((Event) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setMonitor(Monitor.Builder builder) {
            xa xaVar = this.monitorBuilder_;
            if (xaVar == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                xaVar.setMessage(builder.build());
            }
            this.payloadCase_ = 1;
            return this;
        }

        public Builder setReader(Reader.Builder builder) {
            xa xaVar = this.readerBuilder_;
            if (xaVar == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                xaVar.setMessage(builder.build());
            }
            this.payloadCase_ = 2;
            return this;
        }

        public Builder mergeFrom(Event event) {
            if (event == Event.getDefaultInstance()) {
                return this;
            }
            if (event.hasExtrasPrivate()) {
                mergeExtrasPrivate(event.getExtrasPrivate());
            }
            int i10 = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$sdk$Event$PayloadCase[event.getPayloadCase().ordinal()];
            if (i10 == 1) {
                mergeMonitor(event.getMonitor());
            } else if (i10 == 2) {
                mergeReader(event.getReader());
            }
            mergeUnknownFields(((k7) event).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.sdk.Event.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.Event.access$800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.Event r3 = (io.bidmachine.protobuf.sdk.Event) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.mergeFrom(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                io.bidmachine.protobuf.sdk.Event r4 = (io.bidmachine.protobuf.sdk.Event) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.mergeFrom(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Event.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.Event$Builder");
        }
    }

    public static Builder newBuilder(Event event) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(event);
    }

    public static Event parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (Event) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private Event(o6 o6Var) {
        super(o6Var);
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Event parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Event) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static Event parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Event) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Event getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Event parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (Event) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Event parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Event) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    private Event() {
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Event parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (Event) PARSER.parseFrom(bArr, m5Var);
    }

    public static Event parseFrom(InputStream inputStream) throws IOException {
        return (Event) k7.parseWithIOException(PARSER, inputStream);
    }

    private Event(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        this();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            Monitor.Builder builder = this.payloadCase_ == 1 ? ((Monitor) this.payload_).toBuilder() : null;
                            MessageLite message = yVar.readMessage(Monitor.parser(), m5Var);
                            this.payload_ = message;
                            if (builder != null) {
                                builder.mergeFrom((Monitor) message);
                                this.payload_ = builder.buildPartial();
                            }
                            this.payloadCase_ = 1;
                        } else if (tag == 18) {
                            Reader.Builder builder2 = this.payloadCase_ == 2 ? ((Reader) this.payload_).toBuilder() : null;
                            MessageLite message2 = yVar.readMessage(Reader.parser(), m5Var);
                            this.payload_ = message2;
                            if (builder2 != null) {
                                builder2.mergeFrom((Reader) message2);
                                this.payload_ = builder2.buildPartial();
                            }
                            this.payloadCase_ = 2;
                        } else if (tag != 26) {
                            if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                            }
                        } else {
                            Struct struct = this.extrasPrivate_;
                            Struct.Builder builder3 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                            this.extrasPrivate_ = struct2;
                            if (builder3 != null) {
                                builder3.mergeFrom(struct2);
                                this.extrasPrivate_ = builder3.buildPartial();
                            }
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static Event parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Event) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static Event parseFrom(y yVar) throws IOException {
        return (Event) k7.parseWithIOException(PARSER, yVar);
    }

    public static Event parseFrom(y yVar, m5 m5Var) throws IOException {
        return (Event) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
