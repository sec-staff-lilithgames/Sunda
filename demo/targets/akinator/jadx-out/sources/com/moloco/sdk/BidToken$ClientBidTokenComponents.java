package com.moloco.sdk;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class BidToken$ClientBidTokenComponents extends GeneratedMessageLite<BidToken$ClientBidTokenComponents, g6> implements f7 {
    public static final int ACCESSIBILITY_INFO_FIELD_NUMBER = 11;
    public static final int AD_INFO_FIELD_NUMBER = 8;
    public static final int AUDIO_INFO_FIELD_NUMBER = 10;
    public static final int BATTERY_INFO_FIELD_NUMBER = 9;
    private static final BidToken$ClientBidTokenComponents DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 3;
    public static final int DIR_INFO_FIELD_NUMBER = 6;
    public static final int IDFV_FIELD_NUMBER = 1;
    public static final int IMP_LVL_REV_DATA_FIELD_NUMBER = 12;
    public static final int INFO_FIELD_NUMBER = 4;
    public static final int MEMORY_INFO_FIELD_NUMBER = 5;
    public static final int NETWORK_INFO_FIELD_NUMBER = 7;
    private static volatile Parser<BidToken$ClientBidTokenComponents> PARSER = null;
    public static final int PRIVACY_FIELD_NUMBER = 2;
    private AccessibilityInfo accessibilityInfo_;
    private AdvertisingInfo adInfo_;
    private AudioInfo audioInfo_;
    private BatteryInfo batteryInfo_;
    private int bitField0_;
    private Device device_;
    private DirInfo dirInfo_;
    private String idfv_ = "";
    private ImpLvlRevData impLvlRevData_;
    private SdkInfo info_;
    private MemoryInfo memoryInfo_;
    private NetworkInfo networkInfo_;
    private Privacy privacy_;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AccessibilityInfo extends GeneratedMessageLite<AccessibilityInfo, s5> implements t5 {
        public static final int ACCESSIBILITY_CAPTIONING_ENABLED_FIELD_NUMBER = 1;
        public static final int ACCESSIBILITY_LARGE_POINTER_ICON_FIELD_NUMBER = 2;
        private static final AccessibilityInfo DEFAULT_INSTANCE;
        public static final int FONT_SCALE_FIELD_NUMBER = 4;
        private static volatile Parser<AccessibilityInfo> PARSER = null;
        public static final int REDUCE_BRIGHT_COLORS_ACTIVATED_FIELD_NUMBER = 3;
        private boolean accessibilityCaptioningEnabled_;
        private boolean accessibilityLargePointerIcon_;
        private int bitField0_;
        private float fontScale_;
        private boolean reduceBrightColorsActivated_;

        static {
            AccessibilityInfo accessibilityInfo = new AccessibilityInfo();
            DEFAULT_INSTANCE = accessibilityInfo;
            GeneratedMessageLite.registerDefaultInstance(AccessibilityInfo.class, accessibilityInfo);
        }

        private AccessibilityInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAccessibilityCaptioningEnabled() {
            this.bitField0_ &= -2;
            this.accessibilityCaptioningEnabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAccessibilityLargePointerIcon() {
            this.bitField0_ &= -3;
            this.accessibilityLargePointerIcon_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFontScale() {
            this.bitField0_ &= -9;
            this.fontScale_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReduceBrightColorsActivated() {
            this.bitField0_ &= -5;
            this.reduceBrightColorsActivated_ = false;
        }

        public static AccessibilityInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static s5 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AccessibilityInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AccessibilityInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AccessibilityInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AccessibilityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AccessibilityInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccessibilityCaptioningEnabled(boolean z10) {
            this.bitField0_ |= 1;
            this.accessibilityCaptioningEnabled_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccessibilityLargePointerIcon(boolean z10) {
            this.bitField0_ |= 2;
            this.accessibilityLargePointerIcon_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFontScale(float f10) {
            this.bitField0_ |= 8;
            this.fontScale_ = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReduceBrightColorsActivated(boolean z10) {
            this.bitField0_ |= 4;
            this.reduceBrightColorsActivated_ = z10;
        }

        @Override // com.moloco.sdk.t5
        public boolean getAccessibilityCaptioningEnabled() {
            return this.accessibilityCaptioningEnabled_;
        }

        @Override // com.moloco.sdk.t5
        public boolean getAccessibilityLargePointerIcon() {
            return this.accessibilityLargePointerIcon_;
        }

        @Override // com.moloco.sdk.t5
        public float getFontScale() {
            return this.fontScale_;
        }

        @Override // com.moloco.sdk.t5
        public boolean getReduceBrightColorsActivated() {
            return this.reduceBrightColorsActivated_;
        }

        @Override // com.moloco.sdk.t5
        public boolean hasAccessibilityCaptioningEnabled() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.moloco.sdk.t5
        public boolean hasAccessibilityLargePointerIcon() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.moloco.sdk.t5
        public boolean hasFontScale() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.moloco.sdk.t5
        public boolean hasReduceBrightColorsActivated() {
            return (this.bitField0_ & 4) != 0;
        }

        public static s5 newBuilder(AccessibilityInfo accessibilityInfo) {
            return DEFAULT_INSTANCE.createBuilder(accessibilityInfo);
        }

        public static AccessibilityInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AccessibilityInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AccessibilityInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AccessibilityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (d5.f45721a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AccessibilityInfo();
                case 2:
                    return new s5(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ခ\u0003", new Object[]{"bitField0_", QpyI.tTgs, "accessibilityLargePointerIcon_", "reduceBrightColorsActivated_", "fontScale_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AccessibilityInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AccessibilityInfo.class) {
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

        public static AccessibilityInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AccessibilityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AccessibilityInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AccessibilityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AccessibilityInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AccessibilityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AccessibilityInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AccessibilityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AccessibilityInfo parseFrom(InputStream inputStream) throws IOException {
            return (AccessibilityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AccessibilityInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AccessibilityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AccessibilityInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AccessibilityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AccessibilityInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AccessibilityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AdvertisingInfo extends GeneratedMessageLite<AdvertisingInfo, u5> implements v5 {
        private static final AdvertisingInfo DEFAULT_INSTANCE;
        public static final int DNT_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile Parser<AdvertisingInfo> PARSER;
        private int bitField0_;
        private boolean dnt_;
        private String id_ = "";

        static {
            AdvertisingInfo advertisingInfo = new AdvertisingInfo();
            DEFAULT_INSTANCE = advertisingInfo;
            GeneratedMessageLite.registerDefaultInstance(AdvertisingInfo.class, advertisingInfo);
        }

        private AdvertisingInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDnt() {
            this.bitField0_ &= -3;
            this.dnt_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.bitField0_ &= -2;
            this.id_ = getDefaultInstance().getId();
        }

        public static AdvertisingInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static u5 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AdvertisingInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdvertisingInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdvertisingInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdvertisingInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AdvertisingInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDnt(boolean z10) {
            this.bitField0_ |= 2;
            this.dnt_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (d5.f45721a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AdvertisingInfo();
                case 2:
                    return new u5(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "id_", "dnt_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AdvertisingInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AdvertisingInfo.class) {
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

        @Override // com.moloco.sdk.v5
        public boolean getDnt() {
            return this.dnt_;
        }

        @Override // com.moloco.sdk.v5
        public String getId() {
            return this.id_;
        }

        @Override // com.moloco.sdk.v5
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.moloco.sdk.v5
        public boolean hasDnt() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.moloco.sdk.v5
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        public static u5 newBuilder(AdvertisingInfo advertisingInfo) {
            return DEFAULT_INSTANCE.createBuilder(advertisingInfo);
        }

        public static AdvertisingInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdvertisingInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdvertisingInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdvertisingInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdvertisingInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdvertisingInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdvertisingInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdvertisingInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdvertisingInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdvertisingInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdvertisingInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdvertisingInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdvertisingInfo parseFrom(InputStream inputStream) throws IOException {
            return (AdvertisingInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdvertisingInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdvertisingInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdvertisingInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdvertisingInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdvertisingInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdvertisingInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AudioInfo extends GeneratedMessageLite<AudioInfo, w5> implements a6 {
        private static final AudioInfo DEFAULT_INSTANCE;
        public static final int MUTE_SWITCH_FIELD_NUMBER = 1;
        private static volatile Parser<AudioInfo> PARSER = null;
        public static final int VOL_FIELD_NUMBER = 2;
        private int bitField0_;
        private int muteSwitch_;
        private int vol_;

        static {
            AudioInfo audioInfo = new AudioInfo();
            DEFAULT_INSTANCE = audioInfo;
            GeneratedMessageLite.registerDefaultInstance(AudioInfo.class, audioInfo);
        }

        private AudioInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMuteSwitch() {
            this.bitField0_ &= -2;
            this.muteSwitch_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVol() {
            this.bitField0_ &= -3;
            this.vol_ = 0;
        }

        public static AudioInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static w5 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AudioInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AudioInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AudioInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AudioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AudioInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMuteSwitch(z5 z5Var) {
            this.muteSwitch_ = z5Var.getNumber();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMuteSwitchValue(int i10) {
            this.bitField0_ |= 1;
            this.muteSwitch_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVol(int i10) {
            this.bitField0_ |= 2;
            this.vol_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (d5.f45721a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AudioInfo();
                case 2:
                    return new w5(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "muteSwitch_", "vol_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AudioInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AudioInfo.class) {
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

        @Override // com.moloco.sdk.a6
        public z5 getMuteSwitch() {
            z5 z5VarForNumber = z5.forNumber(this.muteSwitch_);
            return z5VarForNumber == null ? z5.UNRECOGNIZED : z5VarForNumber;
        }

        @Override // com.moloco.sdk.a6
        public int getMuteSwitchValue() {
            return this.muteSwitch_;
        }

        @Override // com.moloco.sdk.a6
        public int getVol() {
            return this.vol_;
        }

        @Override // com.moloco.sdk.a6
        public boolean hasMuteSwitch() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.moloco.sdk.a6
        public boolean hasVol() {
            return (this.bitField0_ & 2) != 0;
        }

        public static w5 newBuilder(AudioInfo audioInfo) {
            return DEFAULT_INSTANCE.createBuilder(audioInfo);
        }

        public static AudioInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudioInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AudioInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AudioInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AudioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AudioInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AudioInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AudioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AudioInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AudioInfo parseFrom(InputStream inputStream) throws IOException {
            return (AudioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AudioInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AudioInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AudioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AudioInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class BatteryInfo extends GeneratedMessageLite<BatteryInfo, e6> implements f6 {
        public static final int BATTERY_STATUS_FIELD_NUMBER = 2;
        private static final BatteryInfo DEFAULT_INSTANCE;
        public static final int LOW_POW_MODE_FIELD_NUMBER = 3;
        public static final int MAX_BATTERY_LEVEL_FIELD_NUMBER = 1;
        private static volatile Parser<BatteryInfo> PARSER;
        private int batteryStatus_;
        private int bitField0_;
        private boolean lowPowMode_;
        private int maxBatteryLevel_;

        static {
            BatteryInfo batteryInfo = new BatteryInfo();
            DEFAULT_INSTANCE = batteryInfo;
            GeneratedMessageLite.registerDefaultInstance(BatteryInfo.class, batteryInfo);
        }

        private BatteryInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatteryStatus() {
            this.bitField0_ &= -3;
            this.batteryStatus_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLowPowMode() {
            this.bitField0_ &= -5;
            this.lowPowMode_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxBatteryLevel() {
            this.bitField0_ &= -2;
            this.maxBatteryLevel_ = 0;
        }

        public static BatteryInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static e6 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BatteryInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BatteryInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BatteryInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<BatteryInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatteryStatus(d6 d6Var) {
            this.batteryStatus_ = d6Var.getNumber();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatteryStatusValue(int i10) {
            this.bitField0_ |= 2;
            this.batteryStatus_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLowPowMode(boolean z10) {
            this.bitField0_ |= 4;
            this.lowPowMode_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxBatteryLevel(int i10) {
            this.bitField0_ |= 1;
            this.maxBatteryLevel_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (d5.f45721a[methodToInvoke.ordinal()]) {
                case 1:
                    return new BatteryInfo();
                case 2:
                    return new e6(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "maxBatteryLevel_", "batteryStatus_", "lowPowMode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BatteryInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (BatteryInfo.class) {
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

        @Override // com.moloco.sdk.f6
        public d6 getBatteryStatus() {
            d6 d6VarForNumber = d6.forNumber(this.batteryStatus_);
            return d6VarForNumber == null ? d6.UNRECOGNIZED : d6VarForNumber;
        }

        @Override // com.moloco.sdk.f6
        public int getBatteryStatusValue() {
            return this.batteryStatus_;
        }

        @Override // com.moloco.sdk.f6
        public boolean getLowPowMode() {
            return this.lowPowMode_;
        }

        @Override // com.moloco.sdk.f6
        public int getMaxBatteryLevel() {
            return this.maxBatteryLevel_;
        }

        @Override // com.moloco.sdk.f6
        public boolean hasBatteryStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.moloco.sdk.f6
        public boolean hasLowPowMode() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.moloco.sdk.f6
        public boolean hasMaxBatteryLevel() {
            return (this.bitField0_ & 1) != 0;
        }

        public static e6 newBuilder(BatteryInfo batteryInfo) {
            return DEFAULT_INSTANCE.createBuilder(batteryInfo);
        }

        public static BatteryInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BatteryInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BatteryInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BatteryInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BatteryInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BatteryInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BatteryInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BatteryInfo parseFrom(InputStream inputStream) throws IOException {
            return (BatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BatteryInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BatteryInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BatteryInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Device extends GeneratedMessageLite<Device, h6> implements l6 {
        public static final int BRAND_FIELD_NUMBER = 23;
        public static final int CARRIER_FIELD_NUMBER = 6;
        public static final int DBT_FIELD_NUMBER = 15;
        private static final Device DEFAULT_INSTANCE;
        public static final int DEVICETYPE_FIELD_NUMBER = 7;
        public static final int GEO_FIELD_NUMBER = 9;
        public static final int HARDWARE_FIELD_NUMBER = 22;
        public static final int HAS_GY_FIELD_NUMBER = 17;
        public static final int HWV_FIELD_NUMBER = 5;
        public static final int H_FIELD_NUMBER = 11;
        public static final int JS_FIELD_NUMBER = 8;
        public static final int KB_LOC_FIELD_NUMBER = 18;
        public static final int LANGUAGE_FIELD_NUMBER = 1;
        public static final int LOCALE_FIELD_NUMBER = 19;
        public static final int MAKE_FIELD_NUMBER = 3;
        public static final int MODEL_FIELD_NUMBER = 4;
        public static final int ORTN_FIELD_NUMBER = 16;
        public static final int OSV_FIELD_NUMBER = 2;
        public static final int OS_FIELD_NUMBER = 14;
        private static volatile Parser<Device> PARSER = null;
        public static final int PPI_FIELD_NUMBER = 12;
        public static final int PXRATIO_FIELD_NUMBER = 13;
        public static final int W_FIELD_NUMBER = 10;
        public static final int XDPI_FIELD_NUMBER = 20;
        public static final int YDPI_FIELD_NUMBER = 21;
        private int bitField0_;
        private long dbt_;
        private int devicetype_;
        private Geo geo_;
        private int h_;
        private boolean hasGy_;
        private int js_;
        private int ortn_;
        private int ppi_;
        private double pxratio_;
        private int w_;
        private float xdpi_;
        private float ydpi_;
        private String language_ = "";
        private String osv_ = "";
        private String make_ = "";
        private String model_ = "";
        private String hwv_ = "";
        private String carrier_ = "";
        private String os_ = "";
        private String kbLoc_ = "";
        private String locale_ = "";
        private String hardware_ = "";
        private String brand_ = "";

        static {
            Device device = new Device();
            DEFAULT_INSTANCE = device;
            GeneratedMessageLite.registerDefaultInstance(Device.class, device);
        }

        private Device() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBrand() {
            this.bitField0_ &= -4194305;
            this.brand_ = getDefaultInstance().getBrand();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCarrier() {
            this.bitField0_ &= -33;
            this.carrier_ = getDefaultInstance().getCarrier();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDbt() {
            this.bitField0_ &= -16385;
            this.dbt_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDevicetype() {
            this.bitField0_ &= -65;
            this.devicetype_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGeo() {
            this.geo_ = null;
            this.bitField0_ &= -257;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearH() {
            this.bitField0_ &= -1025;
            this.h_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHardware() {
            this.bitField0_ &= -2097153;
            this.hardware_ = getDefaultInstance().getHardware();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHasGy() {
            this.bitField0_ &= -65537;
            this.hasGy_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHwv() {
            this.bitField0_ &= -17;
            this.hwv_ = getDefaultInstance().getHwv();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJs() {
            this.bitField0_ &= -129;
            this.js_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKbLoc() {
            this.bitField0_ &= -131073;
            this.kbLoc_ = getDefaultInstance().getKbLoc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLanguage() {
            this.bitField0_ &= -2;
            this.language_ = getDefaultInstance().getLanguage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocale() {
            this.bitField0_ &= -262145;
            this.locale_ = getDefaultInstance().getLocale();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMake() {
            this.bitField0_ &= -5;
            this.make_ = getDefaultInstance().getMake();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModel() {
            this.bitField0_ &= -9;
            this.model_ = getDefaultInstance().getModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOrtn() {
            this.bitField0_ &= -32769;
            this.ortn_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOs() {
            this.bitField0_ &= -8193;
            this.os_ = getDefaultInstance().getOs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOsv() {
            this.bitField0_ &= -3;
            this.osv_ = getDefaultInstance().getOsv();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPpi() {
            this.bitField0_ &= -2049;
            this.ppi_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPxratio() {
            this.bitField0_ &= -4097;
            this.pxratio_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearW() {
            this.bitField0_ &= -513;
            this.w_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearXdpi() {
            this.bitField0_ &= -524289;
            this.xdpi_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearYdpi() {
            this.bitField0_ &= -1048577;
            this.ydpi_ = 0.0f;
        }

        public static Device getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGeo(Geo geo) {
            geo.getClass();
            Geo geo2 = this.geo_;
            if (geo2 == null || geo2 == Geo.getDefaultInstance()) {
                this.geo_ = geo;
            } else {
                this.geo_ = (Geo) ((o6) Geo.newBuilder(this.geo_).mergeFrom((o6) geo)).buildPartial();
            }
            this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
        }

        public static h6 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Device parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Device) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Device parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Device> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBrand(String str) {
            str.getClass();
            this.bitField0_ |= 4194304;
            this.brand_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBrandBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.brand_ = byteString.toStringUtf8();
            this.bitField0_ |= 4194304;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCarrier(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.carrier_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCarrierBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.carrier_ = byteString.toStringUtf8();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDbt(long j10) {
            this.bitField0_ |= 16384;
            this.dbt_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDevicetype(int i10) {
            this.bitField0_ |= 64;
            this.devicetype_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGeo(Geo geo) {
            geo.getClass();
            this.geo_ = geo;
            this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setH(int i10) {
            this.bitField0_ |= 1024;
            this.h_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHardware(String str) {
            str.getClass();
            this.bitField0_ |= 2097152;
            this.hardware_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHardwareBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.hardware_ = byteString.toStringUtf8();
            this.bitField0_ |= 2097152;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHasGy(boolean z10) {
            this.bitField0_ |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
            this.hasGy_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHwv(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.hwv_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHwvBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.hwv_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJs(int i10) {
            this.bitField0_ |= 128;
            this.js_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKbLoc(String str) {
            str.getClass();
            this.bitField0_ |= 131072;
            this.kbLoc_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKbLocBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.kbLoc_ = byteString.toStringUtf8();
            this.bitField0_ |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguage(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.language_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguageBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.language_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocale(String str) {
            str.getClass();
            this.bitField0_ |= 262144;
            this.locale_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocaleBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.locale_ = byteString.toStringUtf8();
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMake(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.make_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMakeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.make_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModel(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.model_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModelBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.model_ = byteString.toStringUtf8();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrtn(k6 k6Var) {
            this.ortn_ = k6Var.getNumber();
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrtnValue(int i10) {
            this.bitField0_ |= 32768;
            this.ortn_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOs(String str) {
            str.getClass();
            this.bitField0_ |= Segment.SIZE;
            this.os_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.os_ = byteString.toStringUtf8();
            this.bitField0_ |= Segment.SIZE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsv(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.osv_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsvBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.osv_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPpi(int i10) {
            this.bitField0_ |= 2048;
            this.ppi_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPxratio(double d10) {
            this.bitField0_ |= 4096;
            this.pxratio_ = d10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setW(int i10) {
            this.bitField0_ |= 512;
            this.w_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setXdpi(float f10) {
            this.bitField0_ |= 524288;
            this.xdpi_ = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setYdpi(float f10) {
            this.bitField0_ |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            this.ydpi_ = f10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (d5.f45721a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Device();
                case 2:
                    return new h6(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ဋ\u0006\bဋ\u0007\tဉ\b\nဋ\t\u000bဋ\n\fဋ\u000b\rက\f\u000eለ\r\u000fဃ\u000e\u0010ဌ\u000f\u0011ဇ\u0010\u0012ለ\u0011\u0013ለ\u0012\u0014ခ\u0013\u0015ခ\u0014\u0016ለ\u0015\u0017ለ\u0016", new Object[]{"bitField0_", "language_", "osv_", "make_", "model_", "hwv_", "carrier_", "devicetype_", "js_", "geo_", "w_", "h_", "ppi_", "pxratio_", "os_", "dbt_", "ortn_", "hasGy_", "kbLoc_", "locale_", "xdpi_", "ydpi_", "hardware_", "brand_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Device> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Device.class) {
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

        @Override // com.moloco.sdk.l6
        public String getBrand() {
            return this.brand_;
        }

        @Override // com.moloco.sdk.l6
        public ByteString getBrandBytes() {
            return ByteString.copyFromUtf8(this.brand_);
        }

        @Override // com.moloco.sdk.l6
        public String getCarrier() {
            return this.carrier_;
        }

        @Override // com.moloco.sdk.l6
        public ByteString getCarrierBytes() {
            return ByteString.copyFromUtf8(this.carrier_);
        }

        @Override // com.moloco.sdk.l6
        public long getDbt() {
            return this.dbt_;
        }

        @Override // com.moloco.sdk.l6
        public int getDevicetype() {
            return this.devicetype_;
        }

        @Override // com.moloco.sdk.l6
        public Geo getGeo() {
            Geo geo = this.geo_;
            return geo == null ? Geo.getDefaultInstance() : geo;
        }

        @Override // com.moloco.sdk.l6
        public int getH() {
            return this.h_;
        }

        @Override // com.moloco.sdk.l6
        public String getHardware() {
            return this.hardware_;
        }

        @Override // com.moloco.sdk.l6
        public ByteString getHardwareBytes() {
            return ByteString.copyFromUtf8(this.hardware_);
        }

        @Override // com.moloco.sdk.l6
        public boolean getHasGy() {
            return this.hasGy_;
        }

        @Override // com.moloco.sdk.l6
        public String getHwv() {
            return this.hwv_;
        }

        @Override // com.moloco.sdk.l6
        public ByteString getHwvBytes() {
            return ByteString.copyFromUtf8(this.hwv_);
        }

        @Override // com.moloco.sdk.l6
        public int getJs() {
            return this.js_;
        }

        @Override // com.moloco.sdk.l6
        public String getKbLoc() {
            return this.kbLoc_;
        }

        @Override // com.moloco.sdk.l6
        public ByteString getKbLocBytes() {
            return ByteString.copyFromUtf8(this.kbLoc_);
        }

        @Override // com.moloco.sdk.l6
        public String getLanguage() {
            return this.language_;
        }

        @Override // com.moloco.sdk.l6
        public ByteString getLanguageBytes() {
            return ByteString.copyFromUtf8(this.language_);
        }

        @Override // com.moloco.sdk.l6
        public String getLocale() {
            return this.locale_;
        }

        @Override // com.moloco.sdk.l6
        public ByteString getLocaleBytes() {
            return ByteString.copyFromUtf8(this.locale_);
        }

        @Override // com.moloco.sdk.l6
        public String getMake() {
            return this.make_;
        }

        @Override // com.moloco.sdk.l6
        public ByteString getMakeBytes() {
            return ByteString.copyFromUtf8(this.make_);
        }

        @Override // com.moloco.sdk.l6
        public String getModel() {
            return this.model_;
        }

        @Override // com.moloco.sdk.l6
        public ByteString getModelBytes() {
            return ByteString.copyFromUtf8(this.model_);
        }

        @Override // com.moloco.sdk.l6
        public k6 getOrtn() {
            k6 k6VarForNumber = k6.forNumber(this.ortn_);
            return k6VarForNumber == null ? k6.UNRECOGNIZED : k6VarForNumber;
        }

        @Override // com.moloco.sdk.l6
        public int getOrtnValue() {
            return this.ortn_;
        }

        @Override // com.moloco.sdk.l6
        public String getOs() {
            return this.os_;
        }

        @Override // com.moloco.sdk.l6
        public ByteString getOsBytes() {
            return ByteString.copyFromUtf8(this.os_);
        }

        @Override // com.moloco.sdk.l6
        public String getOsv() {
            return this.osv_;
        }

        @Override // com.moloco.sdk.l6
        public ByteString getOsvBytes() {
            return ByteString.copyFromUtf8(this.osv_);
        }

        @Override // com.moloco.sdk.l6
        public int getPpi() {
            return this.ppi_;
        }

        @Override // com.moloco.sdk.l6
        public double getPxratio() {
            return this.pxratio_;
        }

        @Override // com.moloco.sdk.l6
        public int getW() {
            return this.w_;
        }

        @Override // com.moloco.sdk.l6
        public float getXdpi() {
            return this.xdpi_;
        }

        @Override // com.moloco.sdk.l6
        public float getYdpi() {
            return this.ydpi_;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasBrand() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasCarrier() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasDbt() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasDevicetype() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasGeo() {
            return (this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasH() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasHardware() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasHasGy() {
            return (this.bitField0_ & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasHwv() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasJs() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasKbLoc() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasLanguage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasLocale() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasMake() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasModel() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasOrtn() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasOs() {
            return (this.bitField0_ & Segment.SIZE) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasOsv() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasPpi() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasPxratio() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasW() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasXdpi() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.moloco.sdk.l6
        public boolean hasYdpi() {
            return (this.bitField0_ & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
        }

        public static h6 newBuilder(Device device) {
            return DEFAULT_INSTANCE.createBuilder(device);
        }

        public static Device parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Device) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Device parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Device parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Device parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Device parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Device parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Device parseFrom(InputStream inputStream) throws IOException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Device parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Device parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Device parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DirInfo extends GeneratedMessageLite<DirInfo, m6> implements n6 {
        private static final DirInfo DEFAULT_INSTANCE;
        public static final int DSIZE_BYTES_FIELD_NUMBER = 1;
        private static volatile Parser<DirInfo> PARSER;
        private int bitField0_;
        private long dsizeBytes_;

        static {
            DirInfo dirInfo = new DirInfo();
            DEFAULT_INSTANCE = dirInfo;
            GeneratedMessageLite.registerDefaultInstance(DirInfo.class, dirInfo);
        }

        private DirInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDsizeBytes() {
            this.bitField0_ &= -2;
            this.dsizeBytes_ = 0L;
        }

        public static DirInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static m6 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DirInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DirInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DirInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DirInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DirInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDsizeBytes(long j10) {
            this.bitField0_ |= 1;
            this.dsizeBytes_ = j10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (d5.f45721a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DirInfo();
                case 2:
                    return new m6(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"bitField0_", "dsizeBytes_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DirInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (DirInfo.class) {
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

        @Override // com.moloco.sdk.n6
        public long getDsizeBytes() {
            return this.dsizeBytes_;
        }

        @Override // com.moloco.sdk.n6
        public boolean hasDsizeBytes() {
            return (this.bitField0_ & 1) != 0;
        }

        public static m6 newBuilder(DirInfo dirInfo) {
            return DEFAULT_INSTANCE.createBuilder(dirInfo);
        }

        public static DirInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DirInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DirInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DirInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DirInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DirInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DirInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DirInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DirInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DirInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DirInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DirInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DirInfo parseFrom(InputStream inputStream) throws IOException {
            return (DirInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DirInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DirInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DirInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DirInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DirInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DirInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Geo extends GeneratedMessageLite<Geo, o6> implements p6 {
        private static final Geo DEFAULT_INSTANCE;
        private static volatile Parser<Geo> PARSER = null;
        public static final int UTCOFFSET_FIELD_NUMBER = 1;
        private int bitField0_;
        private int utcoffset_;

        static {
            Geo geo = new Geo();
            DEFAULT_INSTANCE = geo;
            GeneratedMessageLite.registerDefaultInstance(Geo.class, geo);
        }

        private Geo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUtcoffset() {
            this.bitField0_ &= -2;
            this.utcoffset_ = 0;
        }

        public static Geo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static o6 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Geo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Geo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Geo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Geo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUtcoffset(int i10) {
            this.bitField0_ |= 1;
            this.utcoffset_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (d5.f45721a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Geo();
                case 2:
                    return new o6(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"bitField0_", "utcoffset_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Geo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Geo.class) {
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

        @Override // com.moloco.sdk.p6
        public int getUtcoffset() {
            return this.utcoffset_;
        }

        @Override // com.moloco.sdk.p6
        public boolean hasUtcoffset() {
            return (this.bitField0_ & 1) != 0;
        }

        public static o6 newBuilder(Geo geo) {
            return DEFAULT_INSTANCE.createBuilder(geo);
        }

        public static Geo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Geo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Geo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Geo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Geo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Geo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Geo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Geo parseFrom(InputStream inputStream) throws IOException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Geo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Geo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Geo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ImpLvlRevData extends GeneratedMessageLite<ImpLvlRevData, q6> implements t6 {
        private static final ImpLvlRevData DEFAULT_INSTANCE;
        public static final int IMP_COUNTS_FIELD_NUMBER = 4;
        public static final int LAST_IMP_TS_FIELD_NUMBER = 2;
        private static volatile Parser<ImpLvlRevData> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        public static final int SESSION_START_TS_FIELD_NUMBER = 3;
        private ImpCounts impCounts_;
        private long lastImpTs_;
        private String sessionId_ = "";
        private long sessionStartTs_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ImpCounts extends GeneratedMessageLite<ImpCounts, r6> implements s6 {
            public static final int BANNER_FIELD_NUMBER = 4;
            private static final ImpCounts DEFAULT_INSTANCE;
            public static final int INTERSTITIAL_FIELD_NUMBER = 1;
            public static final int MREC_FIELD_NUMBER = 3;
            public static final int NATIVE_FIELD_NUMBER = 5;
            private static volatile Parser<ImpCounts> PARSER = null;
            public static final int REWARDED_FIELD_NUMBER = 2;
            private int banner_;
            private int interstitial_;
            private int mrec_;
            private int native_;
            private int rewarded_;

            static {
                ImpCounts impCounts = new ImpCounts();
                DEFAULT_INSTANCE = impCounts;
                GeneratedMessageLite.registerDefaultInstance(ImpCounts.class, impCounts);
            }

            private ImpCounts() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBanner() {
                this.banner_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearInterstitial() {
                this.interstitial_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMrec() {
                this.mrec_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNative() {
                this.native_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRewarded() {
                this.rewarded_ = 0;
            }

            public static ImpCounts getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static r6 newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ImpCounts parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ImpCounts) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ImpCounts parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (ImpCounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ImpCounts> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBanner(int i10) {
                this.banner_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInterstitial(int i10) {
                this.interstitial_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMrec(int i10) {
                this.mrec_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNative(int i10) {
                this.native_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRewarded(int i10) {
                this.rewarded_ = i10;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (d5.f45721a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ImpCounts();
                    case 2:
                        return new r6(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004", new Object[]{"interstitial_", "rewarded_", "mrec_", "banner_", "native_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ImpCounts> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ImpCounts.class) {
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

            @Override // com.moloco.sdk.s6
            public int getBanner() {
                return this.banner_;
            }

            @Override // com.moloco.sdk.s6
            public int getInterstitial() {
                return this.interstitial_;
            }

            @Override // com.moloco.sdk.s6
            public int getMrec() {
                return this.mrec_;
            }

            @Override // com.moloco.sdk.s6
            public int getNative() {
                return this.native_;
            }

            @Override // com.moloco.sdk.s6
            public int getRewarded() {
                return this.rewarded_;
            }

            public static r6 newBuilder(ImpCounts impCounts) {
                return DEFAULT_INSTANCE.createBuilder(impCounts);
            }

            public static ImpCounts parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (ImpCounts) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ImpCounts parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (ImpCounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ImpCounts parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (ImpCounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ImpCounts parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (ImpCounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ImpCounts parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (ImpCounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ImpCounts parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (ImpCounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ImpCounts parseFrom(InputStream inputStream) throws IOException {
                return (ImpCounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ImpCounts parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (ImpCounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ImpCounts parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (ImpCounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ImpCounts parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (ImpCounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        static {
            ImpLvlRevData impLvlRevData = new ImpLvlRevData();
            DEFAULT_INSTANCE = impLvlRevData;
            GeneratedMessageLite.registerDefaultInstance(ImpLvlRevData.class, impLvlRevData);
        }

        private ImpLvlRevData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpCounts() {
            this.impCounts_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastImpTs() {
            this.lastImpTs_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionStartTs() {
            this.sessionStartTs_ = 0L;
        }

        public static ImpLvlRevData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeImpCounts(ImpCounts impCounts) {
            impCounts.getClass();
            ImpCounts impCounts2 = this.impCounts_;
            if (impCounts2 == null || impCounts2 == ImpCounts.getDefaultInstance()) {
                this.impCounts_ = impCounts;
            } else {
                this.impCounts_ = (ImpCounts) ((r6) ImpCounts.newBuilder(this.impCounts_).mergeFrom((r6) impCounts)).buildPartial();
            }
        }

        public static q6 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ImpLvlRevData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ImpLvlRevData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ImpLvlRevData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ImpLvlRevData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ImpLvlRevData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpCounts(ImpCounts impCounts) {
            impCounts.getClass();
            this.impCounts_ = impCounts;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastImpTs(long j10) {
            this.lastImpTs_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.sessionId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionStartTs(long j10) {
            this.sessionStartTs_ = j10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (d5.f45721a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ImpLvlRevData();
                case 2:
                    return new q6(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\t", new Object[]{"sessionId_", "lastImpTs_", "sessionStartTs_", "impCounts_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ImpLvlRevData> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ImpLvlRevData.class) {
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

        @Override // com.moloco.sdk.t6
        public ImpCounts getImpCounts() {
            ImpCounts impCounts = this.impCounts_;
            return impCounts == null ? ImpCounts.getDefaultInstance() : impCounts;
        }

        @Override // com.moloco.sdk.t6
        public long getLastImpTs() {
            return this.lastImpTs_;
        }

        @Override // com.moloco.sdk.t6
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.moloco.sdk.t6
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.moloco.sdk.t6
        public long getSessionStartTs() {
            return this.sessionStartTs_;
        }

        @Override // com.moloco.sdk.t6
        public boolean hasImpCounts() {
            return this.impCounts_ != null;
        }

        public static q6 newBuilder(ImpLvlRevData impLvlRevData) {
            return DEFAULT_INSTANCE.createBuilder(impLvlRevData);
        }

        public static ImpLvlRevData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImpLvlRevData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ImpLvlRevData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ImpLvlRevData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ImpLvlRevData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ImpLvlRevData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ImpLvlRevData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ImpLvlRevData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ImpLvlRevData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ImpLvlRevData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ImpLvlRevData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ImpLvlRevData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ImpLvlRevData parseFrom(InputStream inputStream) throws IOException {
            return (ImpLvlRevData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ImpLvlRevData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImpLvlRevData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ImpLvlRevData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ImpLvlRevData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ImpLvlRevData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImpLvlRevData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class MemoryInfo extends GeneratedMessageLite<MemoryInfo, u6> implements v6 {
        private static final MemoryInfo DEFAULT_INSTANCE;
        public static final int LOW_MEM_FIELD_NUMBER = 1;
        public static final int LOW_MEM_THRESHOLD_BYTES_FIELD_NUMBER = 2;
        private static volatile Parser<MemoryInfo> PARSER = null;
        public static final int TOTAL_MEM_BYTES_FIELD_NUMBER = 3;
        private int bitField0_;
        private long lowMemThresholdBytes_;
        private boolean lowMem_;
        private long totalMemBytes_;

        static {
            MemoryInfo memoryInfo = new MemoryInfo();
            DEFAULT_INSTANCE = memoryInfo;
            GeneratedMessageLite.registerDefaultInstance(MemoryInfo.class, memoryInfo);
        }

        private MemoryInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLowMem() {
            this.bitField0_ &= -2;
            this.lowMem_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLowMemThresholdBytes() {
            this.bitField0_ &= -3;
            this.lowMemThresholdBytes_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalMemBytes() {
            this.bitField0_ &= -5;
            this.totalMemBytes_ = 0L;
        }

        public static MemoryInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static u6 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static MemoryInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MemoryInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoryInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MemoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<MemoryInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLowMem(boolean z10) {
            this.bitField0_ |= 1;
            this.lowMem_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLowMemThresholdBytes(long j10) {
            this.bitField0_ |= 2;
            this.lowMemThresholdBytes_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalMemBytes(long j10) {
            this.bitField0_ |= 4;
            this.totalMemBytes_ = j10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (d5.f45721a[methodToInvoke.ordinal()]) {
                case 1:
                    return new MemoryInfo();
                case 2:
                    return new u6(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"bitField0_", "lowMem_", "lowMemThresholdBytes_", "totalMemBytes_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MemoryInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (MemoryInfo.class) {
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

        @Override // com.moloco.sdk.v6
        public boolean getLowMem() {
            return this.lowMem_;
        }

        @Override // com.moloco.sdk.v6
        public long getLowMemThresholdBytes() {
            return this.lowMemThresholdBytes_;
        }

        @Override // com.moloco.sdk.v6
        public long getTotalMemBytes() {
            return this.totalMemBytes_;
        }

        @Override // com.moloco.sdk.v6
        public boolean hasLowMem() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.moloco.sdk.v6
        public boolean hasLowMemThresholdBytes() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.moloco.sdk.v6
        public boolean hasTotalMemBytes() {
            return (this.bitField0_ & 4) != 0;
        }

        public static u6 newBuilder(MemoryInfo memoryInfo) {
            return DEFAULT_INSTANCE.createBuilder(memoryInfo);
        }

        public static MemoryInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MemoryInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MemoryInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MemoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MemoryInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MemoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MemoryInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MemoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MemoryInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MemoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MemoryInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MemoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MemoryInfo parseFrom(InputStream inputStream) throws IOException {
            return (MemoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoryInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MemoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MemoryInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MemoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MemoryInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MemoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class NetworkInfo extends GeneratedMessageLite<NetworkInfo, w6> implements a7 {
        private static final NetworkInfo DEFAULT_INSTANCE;
        public static final int MCC_FIELD_NUMBER = 3;
        public static final int MNC_FIELD_NUMBER = 4;
        private static volatile Parser<NetworkInfo> PARSER = null;
        public static final int RESTRICTED_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private int mcc_;
        private int mnc_;
        private boolean restricted_;
        private int type_;

        static {
            NetworkInfo networkInfo = new NetworkInfo();
            DEFAULT_INSTANCE = networkInfo;
            GeneratedMessageLite.registerDefaultInstance(NetworkInfo.class, networkInfo);
        }

        private NetworkInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMcc() {
            this.bitField0_ &= -5;
            this.mcc_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMnc() {
            this.bitField0_ &= -9;
            this.mnc_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRestricted() {
            this.bitField0_ &= -3;
            this.restricted_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static NetworkInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static w6 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NetworkInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NetworkInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetworkInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NetworkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NetworkInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMcc(int i10) {
            this.bitField0_ |= 4;
            this.mcc_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMnc(int i10) {
            this.bitField0_ |= 8;
            this.mnc_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRestricted(boolean z10) {
            this.bitField0_ |= 2;
            this.restricted_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(z6 z6Var) {
            this.type_ = z6Var.getNumber();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i10) {
            this.bitField0_ |= 1;
            this.type_ = i10;
        }

        @Override // com.moloco.sdk.a7
        public int getMcc() {
            return this.mcc_;
        }

        @Override // com.moloco.sdk.a7
        public int getMnc() {
            return this.mnc_;
        }

        @Override // com.moloco.sdk.a7
        public boolean getRestricted() {
            return this.restricted_;
        }

        @Override // com.moloco.sdk.a7
        public z6 getType() {
            z6 z6VarForNumber = z6.forNumber(this.type_);
            return z6VarForNumber == null ? z6.UNRECOGNIZED : z6VarForNumber;
        }

        @Override // com.moloco.sdk.a7
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.moloco.sdk.a7
        public boolean hasMcc() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.moloco.sdk.a7
        public boolean hasMnc() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.moloco.sdk.a7
        public boolean hasRestricted() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.moloco.sdk.a7
        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static w6 newBuilder(NetworkInfo networkInfo) {
            return DEFAULT_INSTANCE.createBuilder(networkInfo);
        }

        public static NetworkInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NetworkInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetworkInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NetworkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (d5.f45721a[methodToInvoke.ordinal()]) {
                case 1:
                    return new NetworkInfo();
                case 2:
                    return new w6(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "type_", "restricted_", "mcc_", QpyI.YlRjFIr});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<NetworkInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (NetworkInfo.class) {
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

        public static NetworkInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NetworkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NetworkInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NetworkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NetworkInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NetworkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NetworkInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NetworkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NetworkInfo parseFrom(InputStream inputStream) throws IOException {
            return (NetworkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetworkInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NetworkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetworkInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NetworkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NetworkInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NetworkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Privacy extends GeneratedMessageLite<Privacy, b7> implements c7 {
        public static final int CCPA_FIELD_NUMBER = 1;
        public static final int COPPA_FIELD_NUMBER = 3;
        private static final Privacy DEFAULT_INSTANCE;
        public static final int GDPR_FIELD_NUMBER = 2;
        private static volatile Parser<Privacy> PARSER = null;
        public static final int TCF_CONSENT_STRING_FIELD_NUMBER = 5;
        public static final int US_PRIVACY_FIELD_NUMBER = 4;
        private int bitField0_;
        private boolean ccpa_;
        private boolean coppa_;
        private boolean gdpr_;
        private String usPrivacy_ = "";
        private String tcfConsentString_ = "";

        static {
            Privacy privacy = new Privacy();
            DEFAULT_INSTANCE = privacy;
            GeneratedMessageLite.registerDefaultInstance(Privacy.class, privacy);
        }

        private Privacy() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCcpa() {
            this.bitField0_ &= -2;
            this.ccpa_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCoppa() {
            this.bitField0_ &= -5;
            this.coppa_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGdpr() {
            this.bitField0_ &= -3;
            this.gdpr_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTcfConsentString() {
            this.bitField0_ &= -17;
            this.tcfConsentString_ = getDefaultInstance().getTcfConsentString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUsPrivacy() {
            this.bitField0_ &= -9;
            this.usPrivacy_ = getDefaultInstance().getUsPrivacy();
        }

        public static Privacy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static b7 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Privacy parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Privacy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Privacy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Privacy> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCcpa(boolean z10) {
            this.bitField0_ |= 1;
            this.ccpa_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoppa(boolean z10) {
            this.bitField0_ |= 4;
            this.coppa_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGdpr(boolean z10) {
            this.bitField0_ |= 2;
            this.gdpr_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTcfConsentString(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.tcfConsentString_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTcfConsentStringBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.tcfConsentString_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsPrivacy(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.usPrivacy_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsPrivacyBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.usPrivacy_ = byteString.toStringUtf8();
            this.bitField0_ |= 8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (d5.f45721a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Privacy();
                case 2:
                    return new b7(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ለ\u0003\u0005ለ\u0004", new Object[]{"bitField0_", "ccpa_", "gdpr_", "coppa_", "usPrivacy_", "tcfConsentString_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Privacy> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Privacy.class) {
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

        @Override // com.moloco.sdk.c7
        public boolean getCcpa() {
            return this.ccpa_;
        }

        @Override // com.moloco.sdk.c7
        public boolean getCoppa() {
            return this.coppa_;
        }

        @Override // com.moloco.sdk.c7
        public boolean getGdpr() {
            return this.gdpr_;
        }

        @Override // com.moloco.sdk.c7
        public String getTcfConsentString() {
            return this.tcfConsentString_;
        }

        @Override // com.moloco.sdk.c7
        public ByteString getTcfConsentStringBytes() {
            return ByteString.copyFromUtf8(this.tcfConsentString_);
        }

        @Override // com.moloco.sdk.c7
        public String getUsPrivacy() {
            return this.usPrivacy_;
        }

        @Override // com.moloco.sdk.c7
        public ByteString getUsPrivacyBytes() {
            return ByteString.copyFromUtf8(this.usPrivacy_);
        }

        @Override // com.moloco.sdk.c7
        public boolean hasCcpa() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.moloco.sdk.c7
        public boolean hasCoppa() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.moloco.sdk.c7
        public boolean hasGdpr() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.moloco.sdk.c7
        public boolean hasTcfConsentString() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.moloco.sdk.c7
        public boolean hasUsPrivacy() {
            return (this.bitField0_ & 8) != 0;
        }

        public static b7 newBuilder(Privacy privacy) {
            return DEFAULT_INSTANCE.createBuilder(privacy);
        }

        public static Privacy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Privacy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Privacy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Privacy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Privacy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Privacy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Privacy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Privacy parseFrom(InputStream inputStream) throws IOException {
            return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Privacy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Privacy parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Privacy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SdkInfo extends GeneratedMessageLite<SdkInfo, d7> implements e7 {
        private static final SdkInfo DEFAULT_INSTANCE;
        public static final int INITIALIZED_FIELD_NUMBER = 1;
        private static volatile Parser<SdkInfo> PARSER;
        private int bitField0_;
        private boolean initialized_;

        static {
            SdkInfo sdkInfo = new SdkInfo();
            DEFAULT_INSTANCE = sdkInfo;
            GeneratedMessageLite.registerDefaultInstance(SdkInfo.class, sdkInfo);
        }

        private SdkInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitialized() {
            this.bitField0_ &= -2;
            this.initialized_ = false;
        }

        public static SdkInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static d7 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SdkInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SdkInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SdkInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SdkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SdkInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitialized(boolean z10) {
            this.bitField0_ |= 1;
            this.initialized_ = z10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (d5.f45721a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SdkInfo();
                case 2:
                    return new d7(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "initialized_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SdkInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SdkInfo.class) {
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

        @Override // com.moloco.sdk.e7
        public boolean getInitialized() {
            return this.initialized_;
        }

        @Override // com.moloco.sdk.e7
        public boolean hasInitialized() {
            return (this.bitField0_ & 1) != 0;
        }

        public static d7 newBuilder(SdkInfo sdkInfo) {
            return DEFAULT_INSTANCE.createBuilder(sdkInfo);
        }

        public static SdkInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SdkInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SdkInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SdkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SdkInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SdkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SdkInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SdkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SdkInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SdkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SdkInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SdkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SdkInfo parseFrom(InputStream inputStream) throws IOException {
            return (SdkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SdkInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SdkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SdkInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SdkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SdkInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SdkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    static {
        BidToken$ClientBidTokenComponents bidToken$ClientBidTokenComponents = new BidToken$ClientBidTokenComponents();
        DEFAULT_INSTANCE = bidToken$ClientBidTokenComponents;
        GeneratedMessageLite.registerDefaultInstance(BidToken$ClientBidTokenComponents.class, bidToken$ClientBidTokenComponents);
    }

    private BidToken$ClientBidTokenComponents() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessibilityInfo() {
        this.accessibilityInfo_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdInfo() {
        this.adInfo_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioInfo() {
        this.audioInfo_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatteryInfo() {
        this.batteryInfo_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDevice() {
        this.device_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDirInfo() {
        this.dirInfo_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdfv() {
        this.bitField0_ &= -2;
        this.idfv_ = getDefaultInstance().getIdfv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImpLvlRevData() {
        this.impLvlRevData_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfo() {
        this.info_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemoryInfo() {
        this.memoryInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkInfo() {
        this.networkInfo_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrivacy() {
        this.privacy_ = null;
    }

    public static BidToken$ClientBidTokenComponents getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAccessibilityInfo(AccessibilityInfo accessibilityInfo) {
        accessibilityInfo.getClass();
        AccessibilityInfo accessibilityInfo2 = this.accessibilityInfo_;
        if (accessibilityInfo2 == null || accessibilityInfo2 == AccessibilityInfo.getDefaultInstance()) {
            this.accessibilityInfo_ = accessibilityInfo;
        } else {
            this.accessibilityInfo_ = (AccessibilityInfo) ((s5) AccessibilityInfo.newBuilder(this.accessibilityInfo_).mergeFrom((s5) accessibilityInfo)).buildPartial();
        }
        this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdInfo(AdvertisingInfo advertisingInfo) {
        advertisingInfo.getClass();
        AdvertisingInfo advertisingInfo2 = this.adInfo_;
        if (advertisingInfo2 == null || advertisingInfo2 == AdvertisingInfo.getDefaultInstance()) {
            this.adInfo_ = advertisingInfo;
        } else {
            this.adInfo_ = (AdvertisingInfo) ((u5) AdvertisingInfo.newBuilder(this.adInfo_).mergeFrom((u5) advertisingInfo)).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAudioInfo(AudioInfo audioInfo) {
        audioInfo.getClass();
        AudioInfo audioInfo2 = this.audioInfo_;
        if (audioInfo2 == null || audioInfo2 == AudioInfo.getDefaultInstance()) {
            this.audioInfo_ = audioInfo;
        } else {
            this.audioInfo_ = (AudioInfo) ((w5) AudioInfo.newBuilder(this.audioInfo_).mergeFrom((w5) audioInfo)).buildPartial();
        }
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBatteryInfo(BatteryInfo batteryInfo) {
        batteryInfo.getClass();
        BatteryInfo batteryInfo2 = this.batteryInfo_;
        if (batteryInfo2 == null || batteryInfo2 == BatteryInfo.getDefaultInstance()) {
            this.batteryInfo_ = batteryInfo;
        } else {
            this.batteryInfo_ = (BatteryInfo) ((e6) BatteryInfo.newBuilder(this.batteryInfo_).mergeFrom((e6) batteryInfo)).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDevice(Device device) {
        device.getClass();
        Device device2 = this.device_;
        if (device2 == null || device2 == Device.getDefaultInstance()) {
            this.device_ = device;
        } else {
            this.device_ = (Device) ((h6) Device.newBuilder(this.device_).mergeFrom((h6) device)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDirInfo(DirInfo dirInfo) {
        dirInfo.getClass();
        DirInfo dirInfo2 = this.dirInfo_;
        if (dirInfo2 == null || dirInfo2 == DirInfo.getDefaultInstance()) {
            this.dirInfo_ = dirInfo;
        } else {
            this.dirInfo_ = (DirInfo) ((m6) DirInfo.newBuilder(this.dirInfo_).mergeFrom((m6) dirInfo)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeImpLvlRevData(ImpLvlRevData impLvlRevData) {
        impLvlRevData.getClass();
        ImpLvlRevData impLvlRevData2 = this.impLvlRevData_;
        if (impLvlRevData2 == null || impLvlRevData2 == ImpLvlRevData.getDefaultInstance()) {
            this.impLvlRevData_ = impLvlRevData;
        } else {
            this.impLvlRevData_ = (ImpLvlRevData) ((q6) ImpLvlRevData.newBuilder(this.impLvlRevData_).mergeFrom((q6) impLvlRevData)).buildPartial();
        }
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInfo(SdkInfo sdkInfo) {
        sdkInfo.getClass();
        SdkInfo sdkInfo2 = this.info_;
        if (sdkInfo2 == null || sdkInfo2 == SdkInfo.getDefaultInstance()) {
            this.info_ = sdkInfo;
        } else {
            this.info_ = (SdkInfo) ((d7) SdkInfo.newBuilder(this.info_).mergeFrom((d7) sdkInfo)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMemoryInfo(MemoryInfo memoryInfo) {
        memoryInfo.getClass();
        MemoryInfo memoryInfo2 = this.memoryInfo_;
        if (memoryInfo2 == null || memoryInfo2 == MemoryInfo.getDefaultInstance()) {
            this.memoryInfo_ = memoryInfo;
        } else {
            this.memoryInfo_ = (MemoryInfo) ((u6) MemoryInfo.newBuilder(this.memoryInfo_).mergeFrom((u6) memoryInfo)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNetworkInfo(NetworkInfo networkInfo) {
        networkInfo.getClass();
        NetworkInfo networkInfo2 = this.networkInfo_;
        if (networkInfo2 == null || networkInfo2 == NetworkInfo.getDefaultInstance()) {
            this.networkInfo_ = networkInfo;
        } else {
            this.networkInfo_ = (NetworkInfo) ((w6) NetworkInfo.newBuilder(this.networkInfo_).mergeFrom((w6) networkInfo)).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePrivacy(Privacy privacy) {
        privacy.getClass();
        Privacy privacy2 = this.privacy_;
        if (privacy2 == null || privacy2 == Privacy.getDefaultInstance()) {
            this.privacy_ = privacy;
        } else {
            this.privacy_ = (Privacy) ((b7) Privacy.newBuilder(this.privacy_).mergeFrom((b7) privacy)).buildPartial();
        }
    }

    public static g6 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BidToken$ClientBidTokenComponents parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BidToken$ClientBidTokenComponents) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BidToken$ClientBidTokenComponents parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BidToken$ClientBidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BidToken$ClientBidTokenComponents> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessibilityInfo(AccessibilityInfo accessibilityInfo) {
        accessibilityInfo.getClass();
        this.accessibilityInfo_ = accessibilityInfo;
        this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdInfo(AdvertisingInfo advertisingInfo) {
        advertisingInfo.getClass();
        this.adInfo_ = advertisingInfo;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioInfo(AudioInfo audioInfo) {
        audioInfo.getClass();
        this.audioInfo_ = audioInfo;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatteryInfo(BatteryInfo batteryInfo) {
        batteryInfo.getClass();
        this.batteryInfo_ = batteryInfo;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDevice(Device device) {
        device.getClass();
        this.device_ = device;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirInfo(DirInfo dirInfo) {
        dirInfo.getClass();
        this.dirInfo_ = dirInfo;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdfv(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.idfv_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdfvBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.idfv_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpLvlRevData(ImpLvlRevData impLvlRevData) {
        impLvlRevData.getClass();
        this.impLvlRevData_ = impLvlRevData;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(SdkInfo sdkInfo) {
        sdkInfo.getClass();
        this.info_ = sdkInfo;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryInfo(MemoryInfo memoryInfo) {
        memoryInfo.getClass();
        this.memoryInfo_ = memoryInfo;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkInfo(NetworkInfo networkInfo) {
        networkInfo.getClass();
        this.networkInfo_ = networkInfo;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrivacy(Privacy privacy) {
        privacy.getClass();
        this.privacy_ = privacy;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (d5.f45721a[methodToInvoke.ordinal()]) {
            case 1:
                return new BidToken$ClientBidTokenComponents();
            case 2:
                return new g6(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ለ\u0000\u0002\t\u0003\t\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0005\tဉ\u0006\nဉ\u0007\u000bဉ\b\fဉ\t", new Object[]{"bitField0_", "idfv_", "privacy_", "device_", "info_", "memoryInfo_", "dirInfo_", "networkInfo_", "adInfo_", "batteryInfo_", "audioInfo_", "accessibilityInfo_", "impLvlRevData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BidToken$ClientBidTokenComponents> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BidToken$ClientBidTokenComponents.class) {
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

    @Override // com.moloco.sdk.f7
    public AccessibilityInfo getAccessibilityInfo() {
        AccessibilityInfo accessibilityInfo = this.accessibilityInfo_;
        return accessibilityInfo == null ? AccessibilityInfo.getDefaultInstance() : accessibilityInfo;
    }

    @Override // com.moloco.sdk.f7
    public AdvertisingInfo getAdInfo() {
        AdvertisingInfo advertisingInfo = this.adInfo_;
        return advertisingInfo == null ? AdvertisingInfo.getDefaultInstance() : advertisingInfo;
    }

    @Override // com.moloco.sdk.f7
    public AudioInfo getAudioInfo() {
        AudioInfo audioInfo = this.audioInfo_;
        return audioInfo == null ? AudioInfo.getDefaultInstance() : audioInfo;
    }

    @Override // com.moloco.sdk.f7
    public BatteryInfo getBatteryInfo() {
        BatteryInfo batteryInfo = this.batteryInfo_;
        return batteryInfo == null ? BatteryInfo.getDefaultInstance() : batteryInfo;
    }

    @Override // com.moloco.sdk.f7
    public Device getDevice() {
        Device device = this.device_;
        return device == null ? Device.getDefaultInstance() : device;
    }

    @Override // com.moloco.sdk.f7
    public DirInfo getDirInfo() {
        DirInfo dirInfo = this.dirInfo_;
        return dirInfo == null ? DirInfo.getDefaultInstance() : dirInfo;
    }

    @Override // com.moloco.sdk.f7
    public String getIdfv() {
        return this.idfv_;
    }

    @Override // com.moloco.sdk.f7
    public ByteString getIdfvBytes() {
        return ByteString.copyFromUtf8(this.idfv_);
    }

    @Override // com.moloco.sdk.f7
    public ImpLvlRevData getImpLvlRevData() {
        ImpLvlRevData impLvlRevData = this.impLvlRevData_;
        return impLvlRevData == null ? ImpLvlRevData.getDefaultInstance() : impLvlRevData;
    }

    @Override // com.moloco.sdk.f7
    public SdkInfo getInfo() {
        SdkInfo sdkInfo = this.info_;
        return sdkInfo == null ? SdkInfo.getDefaultInstance() : sdkInfo;
    }

    @Override // com.moloco.sdk.f7
    public MemoryInfo getMemoryInfo() {
        MemoryInfo memoryInfo = this.memoryInfo_;
        return memoryInfo == null ? MemoryInfo.getDefaultInstance() : memoryInfo;
    }

    @Override // com.moloco.sdk.f7
    public NetworkInfo getNetworkInfo() {
        NetworkInfo networkInfo = this.networkInfo_;
        return networkInfo == null ? NetworkInfo.getDefaultInstance() : networkInfo;
    }

    @Override // com.moloco.sdk.f7
    public Privacy getPrivacy() {
        Privacy privacy = this.privacy_;
        return privacy == null ? Privacy.getDefaultInstance() : privacy;
    }

    @Override // com.moloco.sdk.f7
    public boolean hasAccessibilityInfo() {
        return (this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
    }

    @Override // com.moloco.sdk.f7
    public boolean hasAdInfo() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.moloco.sdk.f7
    public boolean hasAudioInfo() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.moloco.sdk.f7
    public boolean hasBatteryInfo() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.moloco.sdk.f7
    public boolean hasDevice() {
        return this.device_ != null;
    }

    @Override // com.moloco.sdk.f7
    public boolean hasDirInfo() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.moloco.sdk.f7
    public boolean hasIdfv() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.moloco.sdk.f7
    public boolean hasImpLvlRevData() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.moloco.sdk.f7
    public boolean hasInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.moloco.sdk.f7
    public boolean hasMemoryInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.moloco.sdk.f7
    public boolean hasNetworkInfo() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.moloco.sdk.f7
    public boolean hasPrivacy() {
        return this.privacy_ != null;
    }

    public static g6 newBuilder(BidToken$ClientBidTokenComponents bidToken$ClientBidTokenComponents) {
        return DEFAULT_INSTANCE.createBuilder(bidToken$ClientBidTokenComponents);
    }

    public static BidToken$ClientBidTokenComponents parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$ClientBidTokenComponents) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BidToken$ClientBidTokenComponents parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$ClientBidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BidToken$ClientBidTokenComponents parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BidToken$ClientBidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BidToken$ClientBidTokenComponents parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$ClientBidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BidToken$ClientBidTokenComponents parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BidToken$ClientBidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BidToken$ClientBidTokenComponents parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$ClientBidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BidToken$ClientBidTokenComponents parseFrom(InputStream inputStream) throws IOException {
        return (BidToken$ClientBidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BidToken$ClientBidTokenComponents parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$ClientBidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BidToken$ClientBidTokenComponents parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BidToken$ClientBidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BidToken$ClientBidTokenComponents parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$ClientBidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
