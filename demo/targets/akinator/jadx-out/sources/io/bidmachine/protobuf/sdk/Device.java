package io.bidmachine.protobuf.sdk;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.cc;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.f8;
import com.explorestack.protobuf.fa;
import com.explorestack.protobuf.g8;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.ka;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.x7;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class Device extends k7 implements DeviceOrBuilder {
    public static final int ACCESS_FIELD_NUMBER = 19;
    public static final int AIRPLANE_FIELD_NUMBER = 12;
    public static final int APILEVEL_FIELD_NUMBER = 31;
    public static final int ATTS_FIELD_NUMBER = 22;
    public static final int AUDIOCONTEXT_FIELD_NUMBER = 24;
    public static final int BATTERYLEVEL_FIELD_NUMBER = 9;
    public static final int BATTERYSAVER_FIELD_NUMBER = 10;
    public static final int BM_IFV_FIELD_NUMBER = 2;
    public static final int CHARGING_FIELD_NUMBER = 7;
    public static final int CONNECTION_FIELD_NUMBER = 23;
    public static final int CPUNAME_FIELD_NUMBER = 25;
    public static final int CPUVENDOR_FIELD_NUMBER = 26;
    public static final int DARKMODE_FIELD_NUMBER = 11;
    public static final int DEVICENAME_FIELD_NUMBER = 14;
    public static final int DISKSPACE_FIELD_NUMBER = 4;
    public static final int DND_FIELD_NUMBER = 13;
    public static final int FREEMEM_FIELD_NUMBER = 30;
    public static final int GPUNAME_FIELD_NUMBER = 27;
    public static final int GPUVENDOR_FIELD_NUMBER = 28;
    public static final int HEADSETNAME_FIELD_NUMBER = 20;
    public static final int HEADSET_FIELD_NUMBER = 8;
    public static final int IFV_FIELD_NUMBER = 1;
    public static final int INPUTLANGUAGE_FIELD_NUMBER = 3;
    public static final int JAILBREAK_FIELD_NUMBER = 17;
    public static final int LASTBOOTUP_FIELD_NUMBER = 18;
    public static final int RINGMUTE_FIELD_NUMBER = 6;
    public static final int SCREENBRIGHT_FIELD_NUMBER = 16;
    public static final int TIMEZONE_FIELD_NUMBER = 29;
    public static final int TIME_FIELD_NUMBER = 15;
    public static final int TOTALDISK_FIELD_NUMBER = 5;
    public static final int TOTALMEM_FIELD_NUMBER = 21;
    private static final long serialVersionUID = 0;
    private volatile Object access_;
    private boolean airplane_;
    private int apilevel_;
    private int atts_;
    private Context.Device.AudioContext audioContext_;
    private float batterylevel_;
    private boolean batterysaver_;
    private volatile Object bmIfv_;
    private boolean charging_;
    private Context.Device.Connection connection_;
    private volatile Object cpuname_;
    private volatile Object cpuvendor_;
    private boolean darkmode_;
    private volatile Object devicename_;
    private long diskspace_;
    private boolean dnd_;
    private long freemem_;
    private volatile Object gpuname_;
    private volatile Object gpuvendor_;
    private boolean headset_;
    private volatile Object headsetname_;
    private volatile Object ifv_;
    private g8 inputlanguage_;
    private boolean jailbreak_;
    private long lastbootup_;
    private byte memoizedIsInitialized;
    private boolean ringmute_;
    private float screenbright_;
    private long time_;
    private volatile Object timezone_;
    private long totaldisk_;
    private long totalmem_;
    private static final Device DEFAULT_INSTANCE = new Device();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Device.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public Device parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new Device(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements DeviceOrBuilder {
        private Object access_;
        private boolean airplane_;
        private int apilevel_;
        private int atts_;
        private xa audioContextBuilder_;
        private Context.Device.AudioContext audioContext_;
        private float batterylevel_;
        private boolean batterysaver_;
        private int bitField0_;
        private Object bmIfv_;
        private boolean charging_;
        private xa connectionBuilder_;
        private Context.Device.Connection connection_;
        private Object cpuname_;
        private Object cpuvendor_;
        private boolean darkmode_;
        private Object devicename_;
        private long diskspace_;
        private boolean dnd_;
        private long freemem_;
        private Object gpuname_;
        private Object gpuvendor_;
        private boolean headset_;
        private Object headsetname_;
        private Object ifv_;
        private g8 inputlanguage_;
        private boolean jailbreak_;
        private long lastbootup_;
        private boolean ringmute_;
        private float screenbright_;
        private long time_;
        private Object timezone_;
        private long totaldisk_;
        private long totalmem_;

        private Builder() {
            super(null);
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.inputlanguage_ = f8.f22138e;
            this.devicename_ = "";
            this.access_ = "";
            this.headsetname_ = "";
            this.cpuname_ = "";
            this.cpuvendor_ = "";
            this.gpuname_ = "";
            this.gpuvendor_ = "";
            this.timezone_ = "";
            maybeForceBuilderInitialization();
        }

        private void ensureInputlanguageIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.inputlanguage_ = new f8(this.inputlanguage_);
                this.bitField0_ |= 1;
            }
        }

        private xa getAudioContextFieldBuilder() {
            if (this.audioContextBuilder_ == null) {
                this.audioContextBuilder_ = new xa(getAudioContext(), getParentForChildren(), isClean());
                this.audioContext_ = null;
            }
            return this.audioContextBuilder_;
        }

        private xa getConnectionFieldBuilder() {
            if (this.connectionBuilder_ == null) {
                this.connectionBuilder_ = new xa(getConnection(), getParentForChildren(), isClean());
                this.connection_ = null;
            }
            return this.connectionBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Device_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder addAllInputlanguage(Iterable<String> iterable) {
            ensureInputlanguageIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.inputlanguage_);
            onChanged();
            return this;
        }

        public Builder addInputlanguage(String str) {
            str.getClass();
            ensureInputlanguageIsMutable();
            this.inputlanguage_.add((g8) str);
            onChanged();
            return this;
        }

        public Builder addInputlanguageBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            ensureInputlanguageIsMutable();
            this.inputlanguage_.add(byteString);
            onChanged();
            return this;
        }

        public Builder clearAccess() {
            this.access_ = Device.getDefaultInstance().getAccess();
            onChanged();
            return this;
        }

        public Builder clearAirplane() {
            this.airplane_ = false;
            onChanged();
            return this;
        }

        public Builder clearApilevel() {
            this.apilevel_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAtts() {
            this.atts_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAudioContext() {
            if (this.audioContextBuilder_ == null) {
                this.audioContext_ = null;
                onChanged();
                return this;
            }
            this.audioContext_ = null;
            this.audioContextBuilder_ = null;
            return this;
        }

        public Builder clearBatterylevel() {
            this.batterylevel_ = 0.0f;
            onChanged();
            return this;
        }

        public Builder clearBatterysaver() {
            this.batterysaver_ = false;
            onChanged();
            return this;
        }

        public Builder clearBmIfv() {
            this.bmIfv_ = Device.getDefaultInstance().getBmIfv();
            onChanged();
            return this;
        }

        public Builder clearCharging() {
            this.charging_ = false;
            onChanged();
            return this;
        }

        public Builder clearConnection() {
            if (this.connectionBuilder_ == null) {
                this.connection_ = null;
                onChanged();
                return this;
            }
            this.connection_ = null;
            this.connectionBuilder_ = null;
            return this;
        }

        public Builder clearCpuname() {
            this.cpuname_ = Device.getDefaultInstance().getCpuname();
            onChanged();
            return this;
        }

        public Builder clearCpuvendor() {
            this.cpuvendor_ = Device.getDefaultInstance().getCpuvendor();
            onChanged();
            return this;
        }

        public Builder clearDarkmode() {
            this.darkmode_ = false;
            onChanged();
            return this;
        }

        public Builder clearDevicename() {
            this.devicename_ = Device.getDefaultInstance().getDevicename();
            onChanged();
            return this;
        }

        public Builder clearDiskspace() {
            this.diskspace_ = 0L;
            onChanged();
            return this;
        }

        public Builder clearDnd() {
            this.dnd_ = false;
            onChanged();
            return this;
        }

        public Builder clearFreemem() {
            this.freemem_ = 0L;
            onChanged();
            return this;
        }

        public Builder clearGpuname() {
            this.gpuname_ = Device.getDefaultInstance().getGpuname();
            onChanged();
            return this;
        }

        public Builder clearGpuvendor() {
            this.gpuvendor_ = Device.getDefaultInstance().getGpuvendor();
            onChanged();
            return this;
        }

        public Builder clearHeadset() {
            this.headset_ = false;
            onChanged();
            return this;
        }

        public Builder clearHeadsetname() {
            this.headsetname_ = Device.getDefaultInstance().getHeadsetname();
            onChanged();
            return this;
        }

        public Builder clearIfv() {
            this.ifv_ = Device.getDefaultInstance().getIfv();
            onChanged();
            return this;
        }

        public Builder clearInputlanguage() {
            this.inputlanguage_ = f8.f22138e;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearJailbreak() {
            this.jailbreak_ = false;
            onChanged();
            return this;
        }

        public Builder clearLastbootup() {
            this.lastbootup_ = 0L;
            onChanged();
            return this;
        }

        public Builder clearRingmute() {
            this.ringmute_ = false;
            onChanged();
            return this;
        }

        public Builder clearScreenbright() {
            this.screenbright_ = 0.0f;
            onChanged();
            return this;
        }

        public Builder clearTime() {
            this.time_ = 0L;
            onChanged();
            return this;
        }

        public Builder clearTimezone() {
            this.timezone_ = Device.getDefaultInstance().getTimezone();
            onChanged();
            return this;
        }

        public Builder clearTotaldisk() {
            this.totaldisk_ = 0L;
            onChanged();
            return this;
        }

        public Builder clearTotalmem() {
            this.totalmem_ = 0L;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getAccess() {
            Object obj = this.access_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.access_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getAccessBytes() {
            Object obj = this.access_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.access_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getAirplane() {
            return this.airplane_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public int getApilevel() {
            return this.apilevel_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public int getAtts() {
            return this.atts_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public Context.Device.AudioContext getAudioContext() {
            xa xaVar = this.audioContextBuilder_;
            if (xaVar != null) {
                return (Context.Device.AudioContext) xaVar.getMessage();
            }
            Context.Device.AudioContext audioContext = this.audioContext_;
            return audioContext == null ? Context.Device.AudioContext.getDefaultInstance() : audioContext;
        }

        public Context.Device.AudioContext.Builder getAudioContextBuilder() {
            onChanged();
            return (Context.Device.AudioContext.Builder) getAudioContextFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public Context.Device.AudioContextOrBuilder getAudioContextOrBuilder() {
            xa xaVar = this.audioContextBuilder_;
            if (xaVar != null) {
                return (Context.Device.AudioContextOrBuilder) xaVar.getMessageOrBuilder();
            }
            Context.Device.AudioContext audioContext = this.audioContext_;
            return audioContext == null ? Context.Device.AudioContext.getDefaultInstance() : audioContext;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public float getBatterylevel() {
            return this.batterylevel_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getBatterysaver() {
            return this.batterysaver_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getBmIfv() {
            Object obj = this.bmIfv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bmIfv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getBmIfvBytes() {
            Object obj = this.bmIfv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bmIfv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getCharging() {
            return this.charging_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public Context.Device.Connection getConnection() {
            xa xaVar = this.connectionBuilder_;
            if (xaVar != null) {
                return (Context.Device.Connection) xaVar.getMessage();
            }
            Context.Device.Connection connection = this.connection_;
            return connection == null ? Context.Device.Connection.getDefaultInstance() : connection;
        }

        public Context.Device.Connection.Builder getConnectionBuilder() {
            onChanged();
            return (Context.Device.Connection.Builder) getConnectionFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public Context.Device.ConnectionOrBuilder getConnectionOrBuilder() {
            xa xaVar = this.connectionBuilder_;
            if (xaVar != null) {
                return (Context.Device.ConnectionOrBuilder) xaVar.getMessageOrBuilder();
            }
            Context.Device.Connection connection = this.connection_;
            return connection == null ? Context.Device.Connection.getDefaultInstance() : connection;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getCpuname() {
            Object obj = this.cpuname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cpuname_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getCpunameBytes() {
            Object obj = this.cpuname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cpuname_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getCpuvendor() {
            Object obj = this.cpuvendor_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cpuvendor_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getCpuvendorBytes() {
            Object obj = this.cpuvendor_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cpuvendor_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getDarkmode() {
            return this.darkmode_;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Device_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getDevicename() {
            Object obj = this.devicename_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.devicename_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getDevicenameBytes() {
            Object obj = this.devicename_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.devicename_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public long getDiskspace() {
            return this.diskspace_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getDnd() {
            return this.dnd_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public long getFreemem() {
            return this.freemem_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getGpuname() {
            Object obj = this.gpuname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.gpuname_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getGpunameBytes() {
            Object obj = this.gpuname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.gpuname_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getGpuvendor() {
            Object obj = this.gpuvendor_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.gpuvendor_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getGpuvendorBytes() {
            Object obj = this.gpuvendor_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.gpuvendor_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getHeadset() {
            return this.headset_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getHeadsetname() {
            Object obj = this.headsetname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.headsetname_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getHeadsetnameBytes() {
            Object obj = this.headsetname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.headsetname_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getIfv() {
            Object obj = this.ifv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ifv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getIfvBytes() {
            Object obj = this.ifv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getInputlanguage(int i10) {
            return (String) this.inputlanguage_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getInputlanguageBytes(int i10) {
            return this.inputlanguage_.getByteString(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public int getInputlanguageCount() {
            return this.inputlanguage_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getJailbreak() {
            return this.jailbreak_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public long getLastbootup() {
            return this.lastbootup_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getRingmute() {
            return this.ringmute_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public float getScreenbright() {
            return this.screenbright_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public long getTime() {
            return this.time_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getTimezone() {
            Object obj = this.timezone_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.timezone_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getTimezoneBytes() {
            Object obj = this.timezone_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.timezone_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public long getTotaldisk() {
            return this.totaldisk_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public long getTotalmem() {
            return this.totalmem_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean hasAudioContext() {
            return (this.audioContextBuilder_ == null && this.audioContext_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean hasConnection() {
            return (this.connectionBuilder_ == null && this.connection_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Device_fieldAccessorTable.ensureFieldAccessorsInitialized(Device.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAudioContext(Context.Device.AudioContext audioContext) {
            xa xaVar = this.audioContextBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(audioContext);
                return this;
            }
            Context.Device.AudioContext audioContext2 = this.audioContext_;
            if (audioContext2 != null) {
                this.audioContext_ = Context.Device.AudioContext.newBuilder(audioContext2).mergeFrom(audioContext).buildPartial();
            } else {
                this.audioContext_ = audioContext;
            }
            onChanged();
            return this;
        }

        public Builder mergeConnection(Context.Device.Connection connection) {
            xa xaVar = this.connectionBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(connection);
                return this;
            }
            Context.Device.Connection connection2 = this.connection_;
            if (connection2 != null) {
                this.connection_ = Context.Device.Connection.newBuilder(connection2).mergeFrom(connection).buildPartial();
            } else {
                this.connection_ = connection;
            }
            onChanged();
            return this;
        }

        public Builder setAccess(String str) {
            str.getClass();
            this.access_ = str;
            onChanged();
            return this;
        }

        public Builder setAccessBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.access_ = byteString;
            onChanged();
            return this;
        }

        public Builder setAirplane(boolean z10) {
            this.airplane_ = z10;
            onChanged();
            return this;
        }

        public Builder setApilevel(int i10) {
            this.apilevel_ = i10;
            onChanged();
            return this;
        }

        public Builder setAtts(int i10) {
            this.atts_ = i10;
            onChanged();
            return this;
        }

        public Builder setAudioContext(Context.Device.AudioContext audioContext) {
            xa xaVar = this.audioContextBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(audioContext);
                return this;
            }
            audioContext.getClass();
            this.audioContext_ = audioContext;
            onChanged();
            return this;
        }

        public Builder setBatterylevel(float f10) {
            this.batterylevel_ = f10;
            onChanged();
            return this;
        }

        public Builder setBatterysaver(boolean z10) {
            this.batterysaver_ = z10;
            onChanged();
            return this;
        }

        public Builder setBmIfv(String str) {
            str.getClass();
            this.bmIfv_ = str;
            onChanged();
            return this;
        }

        public Builder setBmIfvBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.bmIfv_ = byteString;
            onChanged();
            return this;
        }

        public Builder setCharging(boolean z10) {
            this.charging_ = z10;
            onChanged();
            return this;
        }

        public Builder setConnection(Context.Device.Connection connection) {
            xa xaVar = this.connectionBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(connection);
                return this;
            }
            connection.getClass();
            this.connection_ = connection;
            onChanged();
            return this;
        }

        public Builder setCpuname(String str) {
            str.getClass();
            this.cpuname_ = str;
            onChanged();
            return this;
        }

        public Builder setCpunameBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.cpuname_ = byteString;
            onChanged();
            return this;
        }

        public Builder setCpuvendor(String str) {
            str.getClass();
            this.cpuvendor_ = str;
            onChanged();
            return this;
        }

        public Builder setCpuvendorBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.cpuvendor_ = byteString;
            onChanged();
            return this;
        }

        public Builder setDarkmode(boolean z10) {
            this.darkmode_ = z10;
            onChanged();
            return this;
        }

        public Builder setDevicename(String str) {
            str.getClass();
            this.devicename_ = str;
            onChanged();
            return this;
        }

        public Builder setDevicenameBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.devicename_ = byteString;
            onChanged();
            return this;
        }

        public Builder setDiskspace(long j10) {
            this.diskspace_ = j10;
            onChanged();
            return this;
        }

        public Builder setDnd(boolean z10) {
            this.dnd_ = z10;
            onChanged();
            return this;
        }

        public Builder setFreemem(long j10) {
            this.freemem_ = j10;
            onChanged();
            return this;
        }

        public Builder setGpuname(String str) {
            str.getClass();
            this.gpuname_ = str;
            onChanged();
            return this;
        }

        public Builder setGpunameBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.gpuname_ = byteString;
            onChanged();
            return this;
        }

        public Builder setGpuvendor(String str) {
            str.getClass();
            this.gpuvendor_ = str;
            onChanged();
            return this;
        }

        public Builder setGpuvendorBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.gpuvendor_ = byteString;
            onChanged();
            return this;
        }

        public Builder setHeadset(boolean z10) {
            this.headset_ = z10;
            onChanged();
            return this;
        }

        public Builder setHeadsetname(String str) {
            str.getClass();
            this.headsetname_ = str;
            onChanged();
            return this;
        }

        public Builder setHeadsetnameBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.headsetname_ = byteString;
            onChanged();
            return this;
        }

        public Builder setIfv(String str) {
            str.getClass();
            this.ifv_ = str;
            onChanged();
            return this;
        }

        public Builder setIfvBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.ifv_ = byteString;
            onChanged();
            return this;
        }

        public Builder setInputlanguage(int i10, String str) {
            str.getClass();
            ensureInputlanguageIsMutable();
            this.inputlanguage_.set(i10, (int) str);
            onChanged();
            return this;
        }

        public Builder setJailbreak(boolean z10) {
            this.jailbreak_ = z10;
            onChanged();
            return this;
        }

        public Builder setLastbootup(long j10) {
            this.lastbootup_ = j10;
            onChanged();
            return this;
        }

        public Builder setRingmute(boolean z10) {
            this.ringmute_ = z10;
            onChanged();
            return this;
        }

        public Builder setScreenbright(float f10) {
            this.screenbright_ = f10;
            onChanged();
            return this;
        }

        public Builder setTime(long j10) {
            this.time_ = j10;
            onChanged();
            return this;
        }

        public Builder setTimezone(String str) {
            str.getClass();
            this.timezone_ = str;
            onChanged();
            return this;
        }

        public Builder setTimezoneBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.timezone_ = byteString;
            onChanged();
            return this;
        }

        public Builder setTotaldisk(long j10) {
            this.totaldisk_ = j10;
            onChanged();
            return this;
        }

        public Builder setTotalmem(long j10) {
            this.totalmem_ = j10;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ka getInputlanguageList() {
            return this.inputlanguage_.getUnmodifiableView();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Device build() {
            Device deviceBuildPartial = buildPartial();
            if (deviceBuildPartial.isInitialized()) {
                return deviceBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Device buildPartial() {
            Device device = new Device(this);
            device.ifv_ = this.ifv_;
            device.bmIfv_ = this.bmIfv_;
            if ((this.bitField0_ & 1) != 0) {
                this.inputlanguage_ = this.inputlanguage_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            device.inputlanguage_ = this.inputlanguage_;
            device.diskspace_ = this.diskspace_;
            device.totaldisk_ = this.totaldisk_;
            device.ringmute_ = this.ringmute_;
            device.charging_ = this.charging_;
            device.headset_ = this.headset_;
            device.batterylevel_ = this.batterylevel_;
            device.batterysaver_ = this.batterysaver_;
            device.darkmode_ = this.darkmode_;
            device.airplane_ = this.airplane_;
            device.dnd_ = this.dnd_;
            device.devicename_ = this.devicename_;
            device.time_ = this.time_;
            device.screenbright_ = this.screenbright_;
            device.jailbreak_ = this.jailbreak_;
            device.lastbootup_ = this.lastbootup_;
            device.access_ = this.access_;
            device.headsetname_ = this.headsetname_;
            device.totalmem_ = this.totalmem_;
            device.atts_ = this.atts_;
            device.cpuname_ = this.cpuname_;
            device.cpuvendor_ = this.cpuvendor_;
            device.gpuname_ = this.gpuname_;
            device.gpuvendor_ = this.gpuvendor_;
            device.timezone_ = this.timezone_;
            device.freemem_ = this.freemem_;
            device.apilevel_ = this.apilevel_;
            xa xaVar = this.connectionBuilder_;
            if (xaVar == null) {
                device.connection_ = this.connection_;
            } else {
                device.connection_ = (Context.Device.Connection) xaVar.build();
            }
            xa xaVar2 = this.audioContextBuilder_;
            if (xaVar2 == null) {
                device.audioContext_ = this.audioContext_;
            } else {
                device.audioContext_ = (Context.Device.AudioContext) xaVar2.build();
            }
            onBuilt();
            return device;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Device getDefaultInstanceForType() {
            return Device.getDefaultInstance();
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
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.inputlanguage_ = f8.f22138e;
            this.bitField0_ &= -2;
            this.diskspace_ = 0L;
            this.totaldisk_ = 0L;
            this.ringmute_ = false;
            this.charging_ = false;
            this.headset_ = false;
            this.batterylevel_ = 0.0f;
            this.batterysaver_ = false;
            this.darkmode_ = false;
            this.airplane_ = false;
            this.dnd_ = false;
            this.devicename_ = "";
            this.time_ = 0L;
            this.screenbright_ = 0.0f;
            this.jailbreak_ = false;
            this.lastbootup_ = 0L;
            this.access_ = "";
            this.headsetname_ = "";
            this.totalmem_ = 0L;
            this.atts_ = 0;
            this.cpuname_ = "";
            this.cpuvendor_ = "";
            this.gpuname_ = "";
            this.gpuvendor_ = "";
            this.timezone_ = "";
            this.freemem_ = 0L;
            this.apilevel_ = 0;
            if (this.connectionBuilder_ == null) {
                this.connection_ = null;
            } else {
                this.connection_ = null;
                this.connectionBuilder_ = null;
            }
            if (this.audioContextBuilder_ == null) {
                this.audioContext_ = null;
                return this;
            }
            this.audioContext_ = null;
            this.audioContextBuilder_ = null;
            return this;
        }

        public Builder setAudioContext(Context.Device.AudioContext.Builder builder) {
            xa xaVar = this.audioContextBuilder_;
            if (xaVar == null) {
                this.audioContext_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setConnection(Context.Device.Connection.Builder builder) {
            xa xaVar = this.connectionBuilder_;
            if (xaVar == null) {
                this.connection_ = builder.build();
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
            if (message instanceof Device) {
                return mergeFrom((Device) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Device device) {
            if (device == Device.getDefaultInstance()) {
                return this;
            }
            if (!device.getIfv().isEmpty()) {
                this.ifv_ = device.ifv_;
                onChanged();
            }
            if (!device.getBmIfv().isEmpty()) {
                this.bmIfv_ = device.bmIfv_;
                onChanged();
            }
            if (!device.inputlanguage_.isEmpty()) {
                if (this.inputlanguage_.isEmpty()) {
                    this.inputlanguage_ = device.inputlanguage_;
                    this.bitField0_ &= -2;
                } else {
                    ensureInputlanguageIsMutable();
                    this.inputlanguage_.addAll(device.inputlanguage_);
                }
                onChanged();
            }
            if (device.getDiskspace() != 0) {
                setDiskspace(device.getDiskspace());
            }
            if (device.getTotaldisk() != 0) {
                setTotaldisk(device.getTotaldisk());
            }
            if (device.getRingmute()) {
                setRingmute(device.getRingmute());
            }
            if (device.getCharging()) {
                setCharging(device.getCharging());
            }
            if (device.getHeadset()) {
                setHeadset(device.getHeadset());
            }
            if (device.getBatterylevel() != 0.0f) {
                setBatterylevel(device.getBatterylevel());
            }
            if (device.getBatterysaver()) {
                setBatterysaver(device.getBatterysaver());
            }
            if (device.getDarkmode()) {
                setDarkmode(device.getDarkmode());
            }
            if (device.getAirplane()) {
                setAirplane(device.getAirplane());
            }
            if (device.getDnd()) {
                setDnd(device.getDnd());
            }
            if (!device.getDevicename().isEmpty()) {
                this.devicename_ = device.devicename_;
                onChanged();
            }
            if (device.getTime() != 0) {
                setTime(device.getTime());
            }
            if (device.getScreenbright() != 0.0f) {
                setScreenbright(device.getScreenbright());
            }
            if (device.getJailbreak()) {
                setJailbreak(device.getJailbreak());
            }
            if (device.getLastbootup() != 0) {
                setLastbootup(device.getLastbootup());
            }
            if (!device.getAccess().isEmpty()) {
                this.access_ = device.access_;
                onChanged();
            }
            if (!device.getHeadsetname().isEmpty()) {
                this.headsetname_ = device.headsetname_;
                onChanged();
            }
            if (device.getTotalmem() != 0) {
                setTotalmem(device.getTotalmem());
            }
            if (device.getAtts() != 0) {
                setAtts(device.getAtts());
            }
            if (!device.getCpuname().isEmpty()) {
                this.cpuname_ = device.cpuname_;
                onChanged();
            }
            if (!device.getCpuvendor().isEmpty()) {
                this.cpuvendor_ = device.cpuvendor_;
                onChanged();
            }
            if (!device.getGpuname().isEmpty()) {
                this.gpuname_ = device.gpuname_;
                onChanged();
            }
            if (!device.getGpuvendor().isEmpty()) {
                this.gpuvendor_ = device.gpuvendor_;
                onChanged();
            }
            if (!device.getTimezone().isEmpty()) {
                this.timezone_ = device.timezone_;
                onChanged();
            }
            if (device.getFreemem() != 0) {
                setFreemem(device.getFreemem());
            }
            if (device.getApilevel() != 0) {
                setApilevel(device.getApilevel());
            }
            if (device.hasConnection()) {
                mergeConnection(device.getConnection());
            }
            if (device.hasAudioContext()) {
                mergeAudioContext(device.getAudioContext());
            }
            mergeUnknownFields(((k7) device).unknownFields);
            onChanged();
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.inputlanguage_ = f8.f22138e;
            this.devicename_ = "";
            this.access_ = "";
            this.headsetname_ = "";
            this.cpuname_ = "";
            this.cpuvendor_ = "";
            this.gpuname_ = "";
            this.gpuvendor_ = "";
            this.timezone_ = "";
            maybeForceBuilderInitialization();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.sdk.Device.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.Device.access$3600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.Device r3 = (io.bidmachine.protobuf.sdk.Device) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.Device r4 = (io.bidmachine.protobuf.sdk.Device) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Device.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.Device$Builder");
        }
    }

    public static Device getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Device_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Device parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Device) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Device parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Device) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Device)) {
            return super.equals(obj);
        }
        Device device = (Device) obj;
        if (!getIfv().equals(device.getIfv()) || !getBmIfv().equals(device.getBmIfv()) || !getInputlanguageList().equals(device.getInputlanguageList()) || getDiskspace() != device.getDiskspace() || getTotaldisk() != device.getTotaldisk() || getRingmute() != device.getRingmute() || getCharging() != device.getCharging() || getHeadset() != device.getHeadset() || Float.floatToIntBits(getBatterylevel()) != Float.floatToIntBits(device.getBatterylevel()) || getBatterysaver() != device.getBatterysaver() || getDarkmode() != device.getDarkmode() || getAirplane() != device.getAirplane() || getDnd() != device.getDnd() || !getDevicename().equals(device.getDevicename()) || getTime() != device.getTime() || Float.floatToIntBits(getScreenbright()) != Float.floatToIntBits(device.getScreenbright()) || getJailbreak() != device.getJailbreak() || getLastbootup() != device.getLastbootup() || !getAccess().equals(device.getAccess()) || !getHeadsetname().equals(device.getHeadsetname()) || getTotalmem() != device.getTotalmem() || getAtts() != device.getAtts() || !getCpuname().equals(device.getCpuname()) || !getCpuvendor().equals(device.getCpuvendor()) || !getGpuname().equals(device.getGpuname()) || !getGpuvendor().equals(device.getGpuvendor()) || !getTimezone().equals(device.getTimezone()) || getFreemem() != device.getFreemem() || getApilevel() != device.getApilevel() || hasConnection() != device.hasConnection()) {
            return false;
        }
        if ((!hasConnection() || getConnection().equals(device.getConnection())) && hasAudioContext() == device.hasAudioContext()) {
            return (!hasAudioContext() || getAudioContext().equals(device.getAudioContext())) && this.unknownFields.equals(device.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getAccess() {
        Object obj = this.access_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.access_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getAccessBytes() {
        Object obj = this.access_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.access_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getAirplane() {
        return this.airplane_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public int getApilevel() {
        return this.apilevel_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public int getAtts() {
        return this.atts_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public Context.Device.AudioContext getAudioContext() {
        Context.Device.AudioContext audioContext = this.audioContext_;
        return audioContext == null ? Context.Device.AudioContext.getDefaultInstance() : audioContext;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public Context.Device.AudioContextOrBuilder getAudioContextOrBuilder() {
        return getAudioContext();
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public float getBatterylevel() {
        return this.batterylevel_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getBatterysaver() {
        return this.batterysaver_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getBmIfv() {
        Object obj = this.bmIfv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bmIfv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getBmIfvBytes() {
        Object obj = this.bmIfv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bmIfv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getCharging() {
        return this.charging_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public Context.Device.Connection getConnection() {
        Context.Device.Connection connection = this.connection_;
        return connection == null ? Context.Device.Connection.getDefaultInstance() : connection;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public Context.Device.ConnectionOrBuilder getConnectionOrBuilder() {
        return getConnection();
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getCpuname() {
        Object obj = this.cpuname_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.cpuname_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getCpunameBytes() {
        Object obj = this.cpuname_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.cpuname_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getCpuvendor() {
        Object obj = this.cpuvendor_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.cpuvendor_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getCpuvendorBytes() {
        Object obj = this.cpuvendor_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.cpuvendor_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getDarkmode() {
        return this.darkmode_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getDevicename() {
        Object obj = this.devicename_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.devicename_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getDevicenameBytes() {
        Object obj = this.devicename_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.devicename_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public long getDiskspace() {
        return this.diskspace_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getDnd() {
        return this.dnd_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public long getFreemem() {
        return this.freemem_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getGpuname() {
        Object obj = this.gpuname_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.gpuname_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getGpunameBytes() {
        Object obj = this.gpuname_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.gpuname_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getGpuvendor() {
        Object obj = this.gpuvendor_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.gpuvendor_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getGpuvendorBytes() {
        Object obj = this.gpuvendor_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.gpuvendor_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getHeadset() {
        return this.headset_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getHeadsetname() {
        Object obj = this.headsetname_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.headsetname_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getHeadsetnameBytes() {
        Object obj = this.headsetname_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.headsetname_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getIfv() {
        Object obj = this.ifv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ifv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getIfvBytes() {
        Object obj = this.ifv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ifv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getInputlanguage(int i10) {
        return (String) this.inputlanguage_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getInputlanguageBytes(int i10) {
        return this.inputlanguage_.getByteString(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public int getInputlanguageCount() {
        return this.inputlanguage_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getJailbreak() {
        return this.jailbreak_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public long getLastbootup() {
        return this.lastbootup_;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getRingmute() {
        return this.ringmute_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public float getScreenbright() {
        return this.screenbright_;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getIfvBytes().isEmpty() ? k7.computeStringSize(1, this.ifv_) : 0;
        if (!getBmIfvBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(2, this.bmIfv_);
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.inputlanguage_.size(); i11++) {
            iE = a.e(this.inputlanguage_, i11, iE);
        }
        int size = getInputlanguageList().size() + iComputeStringSize + iE;
        long j10 = this.diskspace_;
        if (j10 != 0) {
            size += h0.computeUInt64Size(4, j10);
        }
        long j11 = this.totaldisk_;
        if (j11 != 0) {
            size += h0.computeUInt64Size(5, j11);
        }
        boolean z10 = this.ringmute_;
        if (z10) {
            size += h0.computeBoolSize(6, z10);
        }
        boolean z11 = this.charging_;
        if (z11) {
            size += h0.computeBoolSize(7, z11);
        }
        boolean z12 = this.headset_;
        if (z12) {
            size += h0.computeBoolSize(8, z12);
        }
        float f10 = this.batterylevel_;
        if (f10 != 0.0f) {
            size += h0.computeFloatSize(9, f10);
        }
        boolean z13 = this.batterysaver_;
        if (z13) {
            size += h0.computeBoolSize(10, z13);
        }
        boolean z14 = this.darkmode_;
        if (z14) {
            size += h0.computeBoolSize(11, z14);
        }
        boolean z15 = this.airplane_;
        if (z15) {
            size += h0.computeBoolSize(12, z15);
        }
        boolean z16 = this.dnd_;
        if (z16) {
            size += h0.computeBoolSize(13, z16);
        }
        if (!getDevicenameBytes().isEmpty()) {
            size += k7.computeStringSize(14, this.devicename_);
        }
        long j12 = this.time_;
        if (j12 != 0) {
            size += h0.computeUInt64Size(15, j12);
        }
        float f11 = this.screenbright_;
        if (f11 != 0.0f) {
            size += h0.computeFloatSize(16, f11);
        }
        boolean z17 = this.jailbreak_;
        if (z17) {
            size += h0.computeBoolSize(17, z17);
        }
        long j13 = this.lastbootup_;
        if (j13 != 0) {
            size += h0.computeUInt64Size(18, j13);
        }
        if (!getAccessBytes().isEmpty()) {
            size += k7.computeStringSize(19, this.access_);
        }
        if (!getHeadsetnameBytes().isEmpty()) {
            size += k7.computeStringSize(20, this.headsetname_);
        }
        long j14 = this.totalmem_;
        if (j14 != 0) {
            size += h0.computeUInt64Size(21, j14);
        }
        int i12 = this.atts_;
        if (i12 != 0) {
            size += h0.computeUInt32Size(22, i12);
        }
        if (this.connection_ != null) {
            size += h0.computeMessageSize(23, getConnection());
        }
        if (this.audioContext_ != null) {
            size += h0.computeMessageSize(24, getAudioContext());
        }
        if (!getCpunameBytes().isEmpty()) {
            size += k7.computeStringSize(25, this.cpuname_);
        }
        if (!getCpuvendorBytes().isEmpty()) {
            size += k7.computeStringSize(26, this.cpuvendor_);
        }
        if (!getGpunameBytes().isEmpty()) {
            size += k7.computeStringSize(27, this.gpuname_);
        }
        if (!getGpuvendorBytes().isEmpty()) {
            size += k7.computeStringSize(28, this.gpuvendor_);
        }
        if (!getTimezoneBytes().isEmpty()) {
            size += k7.computeStringSize(29, this.timezone_);
        }
        long j15 = this.freemem_;
        if (j15 != 0) {
            size += h0.computeUInt64Size(30, j15);
        }
        int i13 = this.apilevel_;
        if (i13 != 0) {
            size += h0.computeUInt32Size(31, i13);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public long getTime() {
        return this.time_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getTimezone() {
        Object obj = this.timezone_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.timezone_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getTimezoneBytes() {
        Object obj = this.timezone_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.timezone_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public long getTotaldisk() {
        return this.totaldisk_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public long getTotalmem() {
        return this.totalmem_;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean hasAudioContext() {
        return this.audioContext_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean hasConnection() {
        return this.connection_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getBmIfv().hashCode() + ((((getIfv().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
        if (getInputlanguageCount() > 0) {
            iHashCode = o2.B(iHashCode, 37, 3, 53) + getInputlanguageList().hashCode();
        }
        int apilevel = getApilevel() + ((((x7.hashLong(getFreemem()) + ((((getTimezone().hashCode() + ((((getGpuvendor().hashCode() + ((((getGpuname().hashCode() + ((((getCpuvendor().hashCode() + ((((getCpuname().hashCode() + ((((getAtts() + ((((x7.hashLong(getTotalmem()) + ((((getHeadsetname().hashCode() + ((((getAccess().hashCode() + ((((x7.hashLong(getLastbootup()) + ((((x7.hashBoolean(getJailbreak()) + ((((Float.floatToIntBits(getScreenbright()) + ((((x7.hashLong(getTime()) + ((((getDevicename().hashCode() + ((((x7.hashBoolean(getDnd()) + ((((x7.hashBoolean(getAirplane()) + ((((x7.hashBoolean(getDarkmode()) + ((((x7.hashBoolean(getBatterysaver()) + ((((Float.floatToIntBits(getBatterylevel()) + ((((x7.hashBoolean(getHeadset()) + ((((x7.hashBoolean(getCharging()) + ((((x7.hashBoolean(getRingmute()) + ((((x7.hashLong(getTotaldisk()) + ((((x7.hashLong(getDiskspace()) + o2.B(iHashCode, 37, 4, 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 37) + 10) * 53)) * 37) + 11) * 53)) * 37) + 12) * 53)) * 37) + 13) * 53)) * 37) + 14) * 53)) * 37) + 15) * 53)) * 37) + 16) * 53)) * 37) + 17) * 53)) * 37) + 18) * 53)) * 37) + 19) * 53)) * 37) + 20) * 53)) * 37) + 21) * 53)) * 37) + 22) * 53)) * 37) + 25) * 53)) * 37) + 26) * 53)) * 37) + 27) * 53)) * 37) + 28) * 53)) * 37) + 29) * 53)) * 37) + 30) * 53)) * 37) + 31) * 53);
        if (hasConnection()) {
            apilevel = o2.B(apilevel, 37, 23, 53) + getConnection().hashCode();
        }
        if (hasAudioContext()) {
            apilevel = o2.B(apilevel, 37, 24, 53) + getAudioContext().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (apilevel * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Device_fieldAccessorTable.ensureFieldAccessorsInitialized(Device.class, Builder.class);
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
        return new Device();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (!getIfvBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            k7.writeString(h0Var, 2, this.bmIfv_);
        }
        int iF = 0;
        while (iF < this.inputlanguage_.size()) {
            iF = a.f(this.inputlanguage_, iF, h0Var, 3, iF, 1);
        }
        long j10 = this.diskspace_;
        if (j10 != 0) {
            h0Var.writeUInt64(4, j10);
        }
        long j11 = this.totaldisk_;
        if (j11 != 0) {
            h0Var.writeUInt64(5, j11);
        }
        boolean z10 = this.ringmute_;
        if (z10) {
            h0Var.writeBool(6, z10);
        }
        boolean z11 = this.charging_;
        if (z11) {
            h0Var.writeBool(7, z11);
        }
        boolean z12 = this.headset_;
        if (z12) {
            h0Var.writeBool(8, z12);
        }
        float f10 = this.batterylevel_;
        if (f10 != 0.0f) {
            h0Var.writeFloat(9, f10);
        }
        boolean z13 = this.batterysaver_;
        if (z13) {
            h0Var.writeBool(10, z13);
        }
        boolean z14 = this.darkmode_;
        if (z14) {
            h0Var.writeBool(11, z14);
        }
        boolean z15 = this.airplane_;
        if (z15) {
            h0Var.writeBool(12, z15);
        }
        boolean z16 = this.dnd_;
        if (z16) {
            h0Var.writeBool(13, z16);
        }
        if (!getDevicenameBytes().isEmpty()) {
            k7.writeString(h0Var, 14, this.devicename_);
        }
        long j12 = this.time_;
        if (j12 != 0) {
            h0Var.writeUInt64(15, j12);
        }
        float f11 = this.screenbright_;
        if (f11 != 0.0f) {
            h0Var.writeFloat(16, f11);
        }
        boolean z17 = this.jailbreak_;
        if (z17) {
            h0Var.writeBool(17, z17);
        }
        long j13 = this.lastbootup_;
        if (j13 != 0) {
            h0Var.writeUInt64(18, j13);
        }
        if (!getAccessBytes().isEmpty()) {
            k7.writeString(h0Var, 19, this.access_);
        }
        if (!getHeadsetnameBytes().isEmpty()) {
            k7.writeString(h0Var, 20, this.headsetname_);
        }
        long j14 = this.totalmem_;
        if (j14 != 0) {
            h0Var.writeUInt64(21, j14);
        }
        int i10 = this.atts_;
        if (i10 != 0) {
            h0Var.writeUInt32(22, i10);
        }
        if (this.connection_ != null) {
            h0Var.writeMessage(23, getConnection());
        }
        if (this.audioContext_ != null) {
            h0Var.writeMessage(24, getAudioContext());
        }
        if (!getCpunameBytes().isEmpty()) {
            k7.writeString(h0Var, 25, this.cpuname_);
        }
        if (!getCpuvendorBytes().isEmpty()) {
            k7.writeString(h0Var, 26, this.cpuvendor_);
        }
        if (!getGpunameBytes().isEmpty()) {
            k7.writeString(h0Var, 27, this.gpuname_);
        }
        if (!getGpuvendorBytes().isEmpty()) {
            k7.writeString(h0Var, 28, this.gpuvendor_);
        }
        if (!getTimezoneBytes().isEmpty()) {
            k7.writeString(h0Var, 29, this.timezone_);
        }
        long j15 = this.freemem_;
        if (j15 != 0) {
            h0Var.writeUInt64(30, j15);
        }
        int i11 = this.apilevel_;
        if (i11 != 0) {
            h0Var.writeUInt32(31, i11);
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static Builder newBuilder(Device device) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(device);
    }

    public static Device parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (Device) PARSER.parseFrom(byteBuffer, m5Var);
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ka getInputlanguageList() {
        return this.inputlanguage_;
    }

    private Device(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Device parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Device) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static Device parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Device) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Device getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Device parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (Device) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Device() {
        this.memoizedIsInitialized = (byte) -1;
        this.ifv_ = "";
        this.bmIfv_ = "";
        this.inputlanguage_ = f8.f22138e;
        this.devicename_ = "";
        this.access_ = "";
        this.headsetname_ = "";
        this.cpuname_ = "";
        this.cpuvendor_ = "";
        this.gpuname_ = "";
        this.gpuvendor_ = "";
        this.timezone_ = "";
    }

    public static Device parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Device) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static Device parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (Device) PARSER.parseFrom(bArr, m5Var);
    }

    public static Device parseFrom(InputStream inputStream) throws IOException {
        return (Device) k7.parseWithIOException(PARSER, inputStream);
    }

    public static Device parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Device) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static Device parseFrom(y yVar) throws IOException {
        return (Device) k7.parseWithIOException(PARSER, yVar);
    }

    public static Device parseFrom(y yVar, m5 m5Var) throws IOException {
        return (Device) k7.parseWithIOException(PARSER, yVar, m5Var);
    }

    private Device(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        this();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    switch (tag) {
                        case 0:
                            z10 = true;
                        case 10:
                            this.ifv_ = yVar.readStringRequireUtf8();
                        case 18:
                            this.bmIfv_ = yVar.readStringRequireUtf8();
                        case 26:
                            String stringRequireUtf8 = yVar.readStringRequireUtf8();
                            z11 = z11;
                            if (!z11) {
                                this.inputlanguage_ = new f8();
                                z11 = true;
                            }
                            this.inputlanguage_.add((g8) stringRequireUtf8);
                        case 32:
                            this.diskspace_ = yVar.readUInt64();
                        case 40:
                            this.totaldisk_ = yVar.readUInt64();
                        case 48:
                            this.ringmute_ = yVar.readBool();
                        case 56:
                            this.charging_ = yVar.readBool();
                        case 64:
                            this.headset_ = yVar.readBool();
                        case 77:
                            this.batterylevel_ = yVar.readFloat();
                        case 80:
                            this.batterysaver_ = yVar.readBool();
                        case 88:
                            this.darkmode_ = yVar.readBool();
                        case 96:
                            this.airplane_ = yVar.readBool();
                        case 104:
                            this.dnd_ = yVar.readBool();
                        case 114:
                            this.devicename_ = yVar.readStringRequireUtf8();
                        case AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL /* 120 */:
                            this.time_ = yVar.readUInt64();
                        case OMSDK_JS_WRITE_FAILED_VALUE:
                            this.screenbright_ = yVar.readFloat();
                        case PRIVACY_URL_ERROR_VALUE:
                            this.jailbreak_ = yVar.readBool();
                        case 144:
                            this.lastbootup_ = yVar.readUInt64();
                        case 154:
                            this.access_ = yVar.readStringRequireUtf8();
                        case 162:
                            this.headsetname_ = yVar.readStringRequireUtf8();
                        case 168:
                            this.totalmem_ = yVar.readUInt64();
                        case 176:
                            this.atts_ = yVar.readUInt32();
                        case 186:
                            Context.Device.Connection connection = this.connection_;
                            Context.Device.Connection.Builder builder = connection != null ? connection.toBuilder() : null;
                            Context.Device.Connection connection2 = (Context.Device.Connection) yVar.readMessage(Context.Device.Connection.parser(), m5Var);
                            this.connection_ = connection2;
                            if (builder != null) {
                                builder.mergeFrom(connection2);
                                this.connection_ = builder.buildPartial();
                            }
                        case 194:
                            Context.Device.AudioContext audioContext = this.audioContext_;
                            Context.Device.AudioContext.Builder builder2 = audioContext != null ? audioContext.toBuilder() : null;
                            Context.Device.AudioContext audioContext2 = (Context.Device.AudioContext) yVar.readMessage(Context.Device.AudioContext.parser(), m5Var);
                            this.audioContext_ = audioContext2;
                            if (builder2 != null) {
                                builder2.mergeFrom(audioContext2);
                                this.audioContext_ = builder2.buildPartial();
                            }
                        case 202:
                            this.cpuname_ = yVar.readStringRequireUtf8();
                        case 210:
                            this.cpuvendor_ = yVar.readStringRequireUtf8();
                        case MRAID_JS_DOES_NOT_EXIST_VALUE:
                            this.gpuname_ = yVar.readStringRequireUtf8();
                        case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                            this.gpuvendor_ = yVar.readStringRequireUtf8();
                        case 234:
                            this.timezone_ = yVar.readStringRequireUtf8();
                        case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                            this.freemem_ = yVar.readUInt64();
                        case 248:
                            this.apilevel_ = yVar.readUInt32();
                        default:
                            if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                z10 = true;
                            }
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                if (z11) {
                    this.inputlanguage_ = this.inputlanguage_.getUnmodifiableView();
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.inputlanguage_ = this.inputlanguage_.getUnmodifiableView();
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }
}
