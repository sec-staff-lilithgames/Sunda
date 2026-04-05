package gatewayprotocol.v1;

import androidx.core.app.NotificationCompat;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.ClientInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class InitializationRequestOuterClass {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class InitializationDeviceInfo extends GeneratedMessageLite<InitializationDeviceInfo, Builder> implements InitializationDeviceInfoOrBuilder {
        public static final int BATTERY_LEVEL_FIELD_NUMBER = 11;
        public static final int BATTERY_STATUS_FIELD_NUMBER = 12;
        public static final int BUNDLE_ID_FIELD_NUMBER = 1;
        public static final int CONNECTION_TYPE_FIELD_NUMBER = 16;
        public static final int CURRENT_UI_THEME_FIELD_NUMBER = 9;
        private static final InitializationDeviceInfo DEFAULT_INSTANCE;
        public static final int DEVICE_MAKE_FIELD_NUMBER = 2;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 3;
        public static final int HASHED_DEVICE_NAME_FIELD_NUMBER = 8;
        public static final int LANGUAGE_FIELD_NUMBER = 14;
        public static final int LOCAL_LIST_FIELD_NUMBER = 15;
        public static final int NETWORK_OPERATOR_FIELD_NUMBER = 10;
        public static final int OS_VERSION_FIELD_NUMBER = 4;
        private static volatile Parser<InitializationDeviceInfo> PARSER = null;
        public static final int SYSTEM_BOOT_TIME_FIELD_NUMBER = 13;
        public static final int TOTAL_DISK_SPACE_FIELD_NUMBER = 6;
        public static final int TOTAL_RAM_MEMORY_FIELD_NUMBER = 7;
        public static final int TRACKING_AUTH_STATUS_FIELD_NUMBER = 5;
        private double batteryLevel_;
        private int batteryStatus_;
        private int bitField0_;
        private long currentUiTheme_;
        private long systemBootTime_;
        private long totalDiskSpace_;
        private long totalRamMemory_;
        private int trackingAuthStatus_;
        private String bundleId_ = "";
        private String deviceMake_ = "";
        private String deviceModel_ = "";
        private String osVersion_ = "";
        private String hashedDeviceName_ = "";
        private String networkOperator_ = "";
        private String language_ = "";
        private String localList_ = "";
        private String connectionType_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<InitializationDeviceInfo, Builder> implements InitializationDeviceInfoOrBuilder {
            public /* synthetic */ Builder(wl.u uVar) {
                this();
            }

            public Builder clearBatteryLevel() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearBatteryLevel();
                return this;
            }

            public Builder clearBatteryStatus() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearBatteryStatus();
                return this;
            }

            public Builder clearBundleId() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearBundleId();
                return this;
            }

            public Builder clearConnectionType() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearConnectionType();
                return this;
            }

            public Builder clearCurrentUiTheme() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearCurrentUiTheme();
                return this;
            }

            public Builder clearDeviceMake() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearDeviceMake();
                return this;
            }

            public Builder clearDeviceModel() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearDeviceModel();
                return this;
            }

            public Builder clearHashedDeviceName() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearHashedDeviceName();
                return this;
            }

            public Builder clearLanguage() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearLanguage();
                return this;
            }

            public Builder clearLocalList() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearLocalList();
                return this;
            }

            public Builder clearNetworkOperator() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearNetworkOperator();
                return this;
            }

            public Builder clearOsVersion() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearOsVersion();
                return this;
            }

            public Builder clearSystemBootTime() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearSystemBootTime();
                return this;
            }

            public Builder clearTotalDiskSpace() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearTotalDiskSpace();
                return this;
            }

            public Builder clearTotalRamMemory() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearTotalRamMemory();
                return this;
            }

            public Builder clearTrackingAuthStatus() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearTrackingAuthStatus();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public double getBatteryLevel() {
                return ((InitializationDeviceInfo) this.instance).getBatteryLevel();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public int getBatteryStatus() {
                return ((InitializationDeviceInfo) this.instance).getBatteryStatus();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public String getBundleId() {
                return ((InitializationDeviceInfo) this.instance).getBundleId();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public ByteString getBundleIdBytes() {
                return ((InitializationDeviceInfo) this.instance).getBundleIdBytes();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public String getConnectionType() {
                return ((InitializationDeviceInfo) this.instance).getConnectionType();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public ByteString getConnectionTypeBytes() {
                return ((InitializationDeviceInfo) this.instance).getConnectionTypeBytes();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public long getCurrentUiTheme() {
                return ((InitializationDeviceInfo) this.instance).getCurrentUiTheme();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public String getDeviceMake() {
                return ((InitializationDeviceInfo) this.instance).getDeviceMake();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public ByteString getDeviceMakeBytes() {
                return ((InitializationDeviceInfo) this.instance).getDeviceMakeBytes();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public String getDeviceModel() {
                return ((InitializationDeviceInfo) this.instance).getDeviceModel();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public ByteString getDeviceModelBytes() {
                return ((InitializationDeviceInfo) this.instance).getDeviceModelBytes();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public String getHashedDeviceName() {
                return ((InitializationDeviceInfo) this.instance).getHashedDeviceName();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public ByteString getHashedDeviceNameBytes() {
                return ((InitializationDeviceInfo) this.instance).getHashedDeviceNameBytes();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public String getLanguage() {
                return ((InitializationDeviceInfo) this.instance).getLanguage();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public ByteString getLanguageBytes() {
                return ((InitializationDeviceInfo) this.instance).getLanguageBytes();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public String getLocalList() {
                return ((InitializationDeviceInfo) this.instance).getLocalList();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public ByteString getLocalListBytes() {
                return ((InitializationDeviceInfo) this.instance).getLocalListBytes();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public String getNetworkOperator() {
                return ((InitializationDeviceInfo) this.instance).getNetworkOperator();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public ByteString getNetworkOperatorBytes() {
                return ((InitializationDeviceInfo) this.instance).getNetworkOperatorBytes();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public String getOsVersion() {
                return ((InitializationDeviceInfo) this.instance).getOsVersion();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public ByteString getOsVersionBytes() {
                return ((InitializationDeviceInfo) this.instance).getOsVersionBytes();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public long getSystemBootTime() {
                return ((InitializationDeviceInfo) this.instance).getSystemBootTime();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public long getTotalDiskSpace() {
                return ((InitializationDeviceInfo) this.instance).getTotalDiskSpace();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public long getTotalRamMemory() {
                return ((InitializationDeviceInfo) this.instance).getTotalRamMemory();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public int getTrackingAuthStatus() {
                return ((InitializationDeviceInfo) this.instance).getTrackingAuthStatus();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public boolean hasTrackingAuthStatus() {
                return ((InitializationDeviceInfo) this.instance).hasTrackingAuthStatus();
            }

            public Builder setBatteryLevel(double d10) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setBatteryLevel(d10);
                return this;
            }

            public Builder setBatteryStatus(int i10) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setBatteryStatus(i10);
                return this;
            }

            public Builder setBundleId(String str) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setBundleId(str);
                return this;
            }

            public Builder setBundleIdBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setBundleIdBytes(byteString);
                return this;
            }

            public Builder setConnectionType(String str) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setConnectionType(str);
                return this;
            }

            public Builder setConnectionTypeBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setConnectionTypeBytes(byteString);
                return this;
            }

            public Builder setCurrentUiTheme(long j10) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setCurrentUiTheme(j10);
                return this;
            }

            public Builder setDeviceMake(String str) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setDeviceMake(str);
                return this;
            }

            public Builder setDeviceMakeBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setDeviceMakeBytes(byteString);
                return this;
            }

            public Builder setDeviceModel(String str) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setDeviceModel(str);
                return this;
            }

            public Builder setDeviceModelBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setDeviceModelBytes(byteString);
                return this;
            }

            public Builder setHashedDeviceName(String str) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setHashedDeviceName(str);
                return this;
            }

            public Builder setHashedDeviceNameBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setHashedDeviceNameBytes(byteString);
                return this;
            }

            public Builder setLanguage(String str) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setLanguage(str);
                return this;
            }

            public Builder setLanguageBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setLanguageBytes(byteString);
                return this;
            }

            public Builder setLocalList(String str) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setLocalList(str);
                return this;
            }

            public Builder setLocalListBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setLocalListBytes(byteString);
                return this;
            }

            public Builder setNetworkOperator(String str) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setNetworkOperator(str);
                return this;
            }

            public Builder setNetworkOperatorBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setNetworkOperatorBytes(byteString);
                return this;
            }

            public Builder setOsVersion(String str) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setOsVersion(str);
                return this;
            }

            public Builder setOsVersionBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setOsVersionBytes(byteString);
                return this;
            }

            public Builder setSystemBootTime(long j10) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setSystemBootTime(j10);
                return this;
            }

            public Builder setTotalDiskSpace(long j10) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setTotalDiskSpace(j10);
                return this;
            }

            public Builder setTotalRamMemory(long j10) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setTotalRamMemory(j10);
                return this;
            }

            public Builder setTrackingAuthStatus(int i10) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setTrackingAuthStatus(i10);
                return this;
            }

            private Builder() {
                super(InitializationDeviceInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            InitializationDeviceInfo initializationDeviceInfo = new InitializationDeviceInfo();
            DEFAULT_INSTANCE = initializationDeviceInfo;
            GeneratedMessageLite.registerDefaultInstance(InitializationDeviceInfo.class, initializationDeviceInfo);
        }

        private InitializationDeviceInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatteryLevel() {
            this.batteryLevel_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatteryStatus() {
            this.batteryStatus_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBundleId() {
            this.bundleId_ = getDefaultInstance().getBundleId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectionType() {
            this.connectionType_ = getDefaultInstance().getConnectionType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentUiTheme() {
            this.currentUiTheme_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceMake() {
            this.deviceMake_ = getDefaultInstance().getDeviceMake();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceModel() {
            this.deviceModel_ = getDefaultInstance().getDeviceModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHashedDeviceName() {
            this.hashedDeviceName_ = getDefaultInstance().getHashedDeviceName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLanguage() {
            this.language_ = getDefaultInstance().getLanguage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocalList() {
            this.localList_ = getDefaultInstance().getLocalList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkOperator() {
            this.networkOperator_ = getDefaultInstance().getNetworkOperator();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOsVersion() {
            this.osVersion_ = getDefaultInstance().getOsVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSystemBootTime() {
            this.systemBootTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalDiskSpace() {
            this.totalDiskSpace_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalRamMemory() {
            this.totalRamMemory_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackingAuthStatus() {
            this.bitField0_ &= -2;
            this.trackingAuthStatus_ = 0;
        }

        public static InitializationDeviceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static InitializationDeviceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationDeviceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<InitializationDeviceInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatteryLevel(double d10) {
            this.batteryLevel_ = d10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatteryStatus(int i10) {
            this.batteryStatus_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBundleId(String str) {
            str.getClass();
            this.bundleId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBundleIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.bundleId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionType(String str) {
            str.getClass();
            this.connectionType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.connectionType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentUiTheme(long j10) {
            this.currentUiTheme_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceMake(String str) {
            str.getClass();
            this.deviceMake_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceMakeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceMake_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModel(String str) {
            str.getClass();
            this.deviceModel_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModelBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceModel_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHashedDeviceName(String str) {
            str.getClass();
            this.hashedDeviceName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHashedDeviceNameBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.hashedDeviceName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguage(String str) {
            str.getClass();
            this.language_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguageBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.language_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocalList(String str) {
            str.getClass();
            this.localList_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocalListBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.localList_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkOperator(String str) {
            str.getClass();
            this.networkOperator_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkOperatorBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.networkOperator_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersion(String str) {
            str.getClass();
            this.osVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersionBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.osVersion_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSystemBootTime(long j10) {
            this.systemBootTime_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalDiskSpace(long j10) {
            this.totalDiskSpace_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalRamMemory(long j10) {
            this.totalRamMemory_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackingAuthStatus(int i10) {
            this.bitField0_ |= 1;
            this.trackingAuthStatus_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            wl.u uVar = null;
            switch (wl.u.f90728a[methodToInvoke.ordinal()]) {
                case 1:
                    return new InitializationDeviceInfo();
                case 2:
                    return new Builder(uVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005င\u0000\u0006\u0002\u0007\u0002\bȈ\t\u0002\nȈ\u000b\u0000\f\u0004\r\u0002\u000eȈ\u000fȈ\u0010Ȉ", new Object[]{"bitField0_", "bundleId_", "deviceMake_", "deviceModel_", "osVersion_", "trackingAuthStatus_", "totalDiskSpace_", "totalRamMemory_", "hashedDeviceName_", "currentUiTheme_", "networkOperator_", "batteryLevel_", "batteryStatus_", "systemBootTime_", "language_", "localList_", "connectionType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<InitializationDeviceInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (InitializationDeviceInfo.class) {
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

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public double getBatteryLevel() {
            return this.batteryLevel_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public int getBatteryStatus() {
            return this.batteryStatus_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public String getBundleId() {
            return this.bundleId_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public ByteString getBundleIdBytes() {
            return ByteString.copyFromUtf8(this.bundleId_);
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public String getConnectionType() {
            return this.connectionType_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public ByteString getConnectionTypeBytes() {
            return ByteString.copyFromUtf8(this.connectionType_);
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public long getCurrentUiTheme() {
            return this.currentUiTheme_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public String getDeviceMake() {
            return this.deviceMake_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public ByteString getDeviceMakeBytes() {
            return ByteString.copyFromUtf8(this.deviceMake_);
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public String getDeviceModel() {
            return this.deviceModel_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public ByteString getDeviceModelBytes() {
            return ByteString.copyFromUtf8(this.deviceModel_);
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public String getHashedDeviceName() {
            return this.hashedDeviceName_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public ByteString getHashedDeviceNameBytes() {
            return ByteString.copyFromUtf8(this.hashedDeviceName_);
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public String getLanguage() {
            return this.language_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public ByteString getLanguageBytes() {
            return ByteString.copyFromUtf8(this.language_);
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public String getLocalList() {
            return this.localList_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public ByteString getLocalListBytes() {
            return ByteString.copyFromUtf8(this.localList_);
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public String getNetworkOperator() {
            return this.networkOperator_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public ByteString getNetworkOperatorBytes() {
            return ByteString.copyFromUtf8(this.networkOperator_);
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public String getOsVersion() {
            return this.osVersion_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public ByteString getOsVersionBytes() {
            return ByteString.copyFromUtf8(this.osVersion_);
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public long getSystemBootTime() {
            return this.systemBootTime_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public long getTotalDiskSpace() {
            return this.totalDiskSpace_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public long getTotalRamMemory() {
            return this.totalRamMemory_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public int getTrackingAuthStatus() {
            return this.trackingAuthStatus_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public boolean hasTrackingAuthStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(InitializationDeviceInfo initializationDeviceInfo) {
            return DEFAULT_INSTANCE.createBuilder(initializationDeviceInfo);
        }

        public static InitializationDeviceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationDeviceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static InitializationDeviceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static InitializationDeviceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static InitializationDeviceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static InitializationDeviceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static InitializationDeviceInfo parseFrom(InputStream inputStream) throws IOException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationDeviceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationDeviceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static InitializationDeviceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface InitializationDeviceInfoOrBuilder extends MessageLiteOrBuilder {
        double getBatteryLevel();

        int getBatteryStatus();

        String getBundleId();

        ByteString getBundleIdBytes();

        String getConnectionType();

        ByteString getConnectionTypeBytes();

        long getCurrentUiTheme();

        String getDeviceMake();

        ByteString getDeviceMakeBytes();

        String getDeviceModel();

        ByteString getDeviceModelBytes();

        String getHashedDeviceName();

        ByteString getHashedDeviceNameBytes();

        String getLanguage();

        ByteString getLanguageBytes();

        String getLocalList();

        ByteString getLocalListBytes();

        String getNetworkOperator();

        ByteString getNetworkOperatorBytes();

        String getOsVersion();

        ByteString getOsVersionBytes();

        long getSystemBootTime();

        long getTotalDiskSpace();

        long getTotalRamMemory();

        int getTrackingAuthStatus();

        boolean hasTrackingAuthStatus();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class InitializationRequest extends GeneratedMessageLite<InitializationRequest, Builder> implements InitializationRequestOrBuilder {
        public static final int ANALYTICS_USER_ID_FIELD_NUMBER = 8;
        public static final int AUID_FIELD_NUMBER = 7;
        public static final int AUID_STRING_FIELD_NUMBER = 11;
        public static final int CACHE_FIELD_NUMBER = 5;
        public static final int CLIENT_INFO_FIELD_NUMBER = 1;
        private static final InitializationRequest DEFAULT_INSTANCE;
        public static final int DEVICE_INFO_FIELD_NUMBER = 9;
        public static final int EXTERNAL_USER_IDENTIFIER_FIELD_NUMBER = 15;
        public static final int EXTRAS_FIELD_NUMBER = 16;
        public static final int IDFI_FIELD_NUMBER = 3;
        public static final int IS_FIRST_INIT_FIELD_NUMBER = 10;
        public static final int LEGACY_FLOW_USER_CONSENT_FIELD_NUMBER = 6;
        private static volatile Parser<InitializationRequest> PARSER = null;
        public static final int PRIVACY_FIELD_NUMBER = 2;
        public static final int SESSION_ID_FIELD_NUMBER = 4;
        public static final int UADS_INIT_BLOB_FIELD_NUMBER = 12;
        public static final int UNITY_BUILD_GUID_FIELD_NUMBER = 17;
        public static final int UNITY_INSTALLATION_ID_FIELD_NUMBER = 13;
        public static final int UNITY_MEGA_SESSION_ID_FIELD_NUMBER = 14;
        private String analyticsUserId_;
        private String auidString_;
        private ByteString auid_;
        private int bitField0_;
        private ByteString cache_;
        private ClientInfoOuterClass.ClientInfo clientInfo_;
        private InitializationDeviceInfo deviceInfo_;
        private String externalUserIdentifier_;
        private MapFieldLite<String, String> extras_ = MapFieldLite.emptyMapField();
        private String idfi_;
        private boolean isFirstInit_;
        private String legacyFlowUserConsent_;
        private ByteString privacy_;
        private ByteString sessionId_;
        private ByteString uadsInitBlob_;
        private String unityBuildGuid_;
        private ByteString unityInstallationId_;
        private ByteString unityMegaSessionId_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<InitializationRequest, Builder> implements InitializationRequestOrBuilder {
            public /* synthetic */ Builder(wl.u uVar) {
                this();
            }

            public Builder clearAnalyticsUserId() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearAnalyticsUserId();
                return this;
            }

            public Builder clearAuid() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearAuid();
                return this;
            }

            public Builder clearAuidString() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearAuidString();
                return this;
            }

            public Builder clearCache() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearCache();
                return this;
            }

            public Builder clearClientInfo() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearClientInfo();
                return this;
            }

            public Builder clearDeviceInfo() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearDeviceInfo();
                return this;
            }

            public Builder clearExternalUserIdentifier() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearExternalUserIdentifier();
                return this;
            }

            public Builder clearExtras() {
                copyOnWrite();
                ((InitializationRequest) this.instance).getMutableExtrasMap().clear();
                return this;
            }

            public Builder clearIdfi() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearIdfi();
                return this;
            }

            public Builder clearIsFirstInit() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearIsFirstInit();
                return this;
            }

            public Builder clearLegacyFlowUserConsent() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearLegacyFlowUserConsent();
                return this;
            }

            public Builder clearPrivacy() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearPrivacy();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearSessionId();
                return this;
            }

            public Builder clearUadsInitBlob() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearUadsInitBlob();
                return this;
            }

            public Builder clearUnityBuildGuid() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearUnityBuildGuid();
                return this;
            }

            public Builder clearUnityInstallationId() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearUnityInstallationId();
                return this;
            }

            public Builder clearUnityMegaSessionId() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearUnityMegaSessionId();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean containsExtras(String str) {
                str.getClass();
                return ((InitializationRequest) this.instance).getExtrasMap().containsKey(str);
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public String getAnalyticsUserId() {
                return ((InitializationRequest) this.instance).getAnalyticsUserId();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ByteString getAnalyticsUserIdBytes() {
                return ((InitializationRequest) this.instance).getAnalyticsUserIdBytes();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ByteString getAuid() {
                return ((InitializationRequest) this.instance).getAuid();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public String getAuidString() {
                return ((InitializationRequest) this.instance).getAuidString();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ByteString getAuidStringBytes() {
                return ((InitializationRequest) this.instance).getAuidStringBytes();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ByteString getCache() {
                return ((InitializationRequest) this.instance).getCache();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ClientInfoOuterClass.ClientInfo getClientInfo() {
                return ((InitializationRequest) this.instance).getClientInfo();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public InitializationDeviceInfo getDeviceInfo() {
                return ((InitializationRequest) this.instance).getDeviceInfo();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public String getExternalUserIdentifier() {
                return ((InitializationRequest) this.instance).getExternalUserIdentifier();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ByteString getExternalUserIdentifierBytes() {
                return ((InitializationRequest) this.instance).getExternalUserIdentifierBytes();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            @Deprecated
            public Map<String, String> getExtras() {
                return getExtrasMap();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public int getExtrasCount() {
                return ((InitializationRequest) this.instance).getExtrasMap().size();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public Map<String, String> getExtrasMap() {
                return Collections.unmodifiableMap(((InitializationRequest) this.instance).getExtrasMap());
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public String getExtrasOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> extrasMap = ((InitializationRequest) this.instance).getExtrasMap();
                return extrasMap.containsKey(str) ? extrasMap.get(str) : str2;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public String getExtrasOrThrow(String str) {
                str.getClass();
                Map<String, String> extrasMap = ((InitializationRequest) this.instance).getExtrasMap();
                if (extrasMap.containsKey(str)) {
                    return extrasMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public String getIdfi() {
                return ((InitializationRequest) this.instance).getIdfi();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ByteString getIdfiBytes() {
                return ((InitializationRequest) this.instance).getIdfiBytes();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean getIsFirstInit() {
                return ((InitializationRequest) this.instance).getIsFirstInit();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public String getLegacyFlowUserConsent() {
                return ((InitializationRequest) this.instance).getLegacyFlowUserConsent();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ByteString getLegacyFlowUserConsentBytes() {
                return ((InitializationRequest) this.instance).getLegacyFlowUserConsentBytes();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ByteString getPrivacy() {
                return ((InitializationRequest) this.instance).getPrivacy();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ByteString getSessionId() {
                return ((InitializationRequest) this.instance).getSessionId();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ByteString getUadsInitBlob() {
                return ((InitializationRequest) this.instance).getUadsInitBlob();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public String getUnityBuildGuid() {
                return ((InitializationRequest) this.instance).getUnityBuildGuid();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ByteString getUnityBuildGuidBytes() {
                return ((InitializationRequest) this.instance).getUnityBuildGuidBytes();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ByteString getUnityInstallationId() {
                return ((InitializationRequest) this.instance).getUnityInstallationId();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ByteString getUnityMegaSessionId() {
                return ((InitializationRequest) this.instance).getUnityMegaSessionId();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasAnalyticsUserId() {
                return ((InitializationRequest) this.instance).hasAnalyticsUserId();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasAuid() {
                return ((InitializationRequest) this.instance).hasAuid();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasAuidString() {
                return ((InitializationRequest) this.instance).hasAuidString();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasCache() {
                return ((InitializationRequest) this.instance).hasCache();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasClientInfo() {
                return ((InitializationRequest) this.instance).hasClientInfo();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasDeviceInfo() {
                return ((InitializationRequest) this.instance).hasDeviceInfo();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasExternalUserIdentifier() {
                return ((InitializationRequest) this.instance).hasExternalUserIdentifier();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasLegacyFlowUserConsent() {
                return ((InitializationRequest) this.instance).hasLegacyFlowUserConsent();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasPrivacy() {
                return ((InitializationRequest) this.instance).hasPrivacy();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasUadsInitBlob() {
                return ((InitializationRequest) this.instance).hasUadsInitBlob();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasUnityBuildGuid() {
                return ((InitializationRequest) this.instance).hasUnityBuildGuid();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasUnityInstallationId() {
                return ((InitializationRequest) this.instance).hasUnityInstallationId();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasUnityMegaSessionId() {
                return ((InitializationRequest) this.instance).hasUnityMegaSessionId();
            }

            public Builder mergeClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
                copyOnWrite();
                ((InitializationRequest) this.instance).mergeClientInfo(clientInfo);
                return this;
            }

            public Builder mergeDeviceInfo(InitializationDeviceInfo initializationDeviceInfo) {
                copyOnWrite();
                ((InitializationRequest) this.instance).mergeDeviceInfo(initializationDeviceInfo);
                return this;
            }

            public Builder putAllExtras(Map<String, String> map) {
                copyOnWrite();
                ((InitializationRequest) this.instance).getMutableExtrasMap().putAll(map);
                return this;
            }

            public Builder putExtras(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((InitializationRequest) this.instance).getMutableExtrasMap().put(str, str2);
                return this;
            }

            public Builder removeExtras(String str) {
                str.getClass();
                copyOnWrite();
                ((InitializationRequest) this.instance).getMutableExtrasMap().remove(str);
                return this;
            }

            public Builder setAnalyticsUserId(String str) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setAnalyticsUserId(str);
                return this;
            }

            public Builder setAnalyticsUserIdBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((InitializationRequest) this.instance).setAnalyticsUserIdBytes(byteString);
                return this;
            }

            public Builder setAuid(ByteString byteString) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setAuid(byteString);
                return this;
            }

            public Builder setAuidString(String str) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setAuidString(str);
                return this;
            }

            public Builder setAuidStringBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((InitializationRequest) this.instance).setAuidStringBytes(byteString);
                return this;
            }

            public Builder setCache(ByteString byteString) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setCache(byteString);
                return this;
            }

            public Builder setClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setClientInfo(clientInfo);
                return this;
            }

            public Builder setDeviceInfo(InitializationDeviceInfo initializationDeviceInfo) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setDeviceInfo(initializationDeviceInfo);
                return this;
            }

            public Builder setExternalUserIdentifier(String str) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setExternalUserIdentifier(str);
                return this;
            }

            public Builder setExternalUserIdentifierBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((InitializationRequest) this.instance).setExternalUserIdentifierBytes(byteString);
                return this;
            }

            public Builder setIdfi(String str) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setIdfi(str);
                return this;
            }

            public Builder setIdfiBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((InitializationRequest) this.instance).setIdfiBytes(byteString);
                return this;
            }

            public Builder setIsFirstInit(boolean z10) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setIsFirstInit(z10);
                return this;
            }

            public Builder setLegacyFlowUserConsent(String str) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setLegacyFlowUserConsent(str);
                return this;
            }

            public Builder setLegacyFlowUserConsentBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((InitializationRequest) this.instance).setLegacyFlowUserConsentBytes(byteString);
                return this;
            }

            public Builder setPrivacy(ByteString byteString) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setPrivacy(byteString);
                return this;
            }

            public Builder setSessionId(ByteString byteString) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setSessionId(byteString);
                return this;
            }

            public Builder setUadsInitBlob(ByteString byteString) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setUadsInitBlob(byteString);
                return this;
            }

            public Builder setUnityBuildGuid(String str) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setUnityBuildGuid(str);
                return this;
            }

            public Builder setUnityBuildGuidBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((InitializationRequest) this.instance).setUnityBuildGuidBytes(byteString);
                return this;
            }

            public Builder setUnityInstallationId(ByteString byteString) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setUnityInstallationId(byteString);
                return this;
            }

            public Builder setUnityMegaSessionId(ByteString byteString) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setUnityMegaSessionId(byteString);
                return this;
            }

            private Builder() {
                super(InitializationRequest.DEFAULT_INSTANCE);
            }

            public Builder setClientInfo(ClientInfoOuterClass.ClientInfo.Builder builder) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setClientInfo(builder.build());
                return this;
            }

            public Builder setDeviceInfo(InitializationDeviceInfo.Builder builder) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setDeviceInfo(builder.build());
                return this;
            }
        }

        static {
            InitializationRequest initializationRequest = new InitializationRequest();
            DEFAULT_INSTANCE = initializationRequest;
            GeneratedMessageLite.registerDefaultInstance(InitializationRequest.class, initializationRequest);
        }

        private InitializationRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.privacy_ = byteString;
            this.idfi_ = "";
            this.sessionId_ = byteString;
            this.cache_ = byteString;
            this.legacyFlowUserConsent_ = "";
            this.auid_ = byteString;
            this.analyticsUserId_ = "";
            this.auidString_ = "";
            this.uadsInitBlob_ = byteString;
            this.unityInstallationId_ = byteString;
            this.unityMegaSessionId_ = byteString;
            this.externalUserIdentifier_ = "";
            this.unityBuildGuid_ = "";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnalyticsUserId() {
            this.bitField0_ &= -33;
            this.analyticsUserId_ = getDefaultInstance().getAnalyticsUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuid() {
            this.bitField0_ &= -17;
            this.auid_ = getDefaultInstance().getAuid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuidString() {
            this.bitField0_ &= -129;
            this.auidString_ = getDefaultInstance().getAuidString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCache() {
            this.bitField0_ &= -5;
            this.cache_ = getDefaultInstance().getCache();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientInfo() {
            this.clientInfo_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceInfo() {
            this.deviceInfo_ = null;
            this.bitField0_ &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExternalUserIdentifier() {
            this.bitField0_ &= -2049;
            this.externalUserIdentifier_ = getDefaultInstance().getExternalUserIdentifier();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdfi() {
            this.idfi_ = getDefaultInstance().getIdfi();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsFirstInit() {
            this.isFirstInit_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLegacyFlowUserConsent() {
            this.bitField0_ &= -9;
            this.legacyFlowUserConsent_ = getDefaultInstance().getLegacyFlowUserConsent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrivacy() {
            this.bitField0_ &= -3;
            this.privacy_ = getDefaultInstance().getPrivacy();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUadsInitBlob() {
            this.bitField0_ &= -257;
            this.uadsInitBlob_ = getDefaultInstance().getUadsInitBlob();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnityBuildGuid() {
            this.bitField0_ &= -4097;
            this.unityBuildGuid_ = getDefaultInstance().getUnityBuildGuid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnityInstallationId() {
            this.bitField0_ &= -513;
            this.unityInstallationId_ = getDefaultInstance().getUnityInstallationId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnityMegaSessionId() {
            this.bitField0_ &= -1025;
            this.unityMegaSessionId_ = getDefaultInstance().getUnityMegaSessionId();
        }

        public static InitializationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableExtrasMap() {
            return internalGetMutableExtras();
        }

        private MapFieldLite<String, String> internalGetExtras() {
            return this.extras_;
        }

        private MapFieldLite<String, String> internalGetMutableExtras() {
            if (!this.extras_.isMutable()) {
                this.extras_ = this.extras_.mutableCopy();
            }
            return this.extras_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
            clientInfo.getClass();
            ClientInfoOuterClass.ClientInfo clientInfo2 = this.clientInfo_;
            if (clientInfo2 == null || clientInfo2 == ClientInfoOuterClass.ClientInfo.getDefaultInstance()) {
                this.clientInfo_ = clientInfo;
            } else {
                this.clientInfo_ = ClientInfoOuterClass.ClientInfo.newBuilder(this.clientInfo_).mergeFrom((ClientInfoOuterClass.ClientInfo.Builder) clientInfo).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDeviceInfo(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.getClass();
            InitializationDeviceInfo initializationDeviceInfo2 = this.deviceInfo_;
            if (initializationDeviceInfo2 == null || initializationDeviceInfo2 == InitializationDeviceInfo.getDefaultInstance()) {
                this.deviceInfo_ = initializationDeviceInfo;
            } else {
                this.deviceInfo_ = InitializationDeviceInfo.newBuilder(this.deviceInfo_).mergeFrom((InitializationDeviceInfo.Builder) initializationDeviceInfo).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static InitializationRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (InitializationRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<InitializationRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnalyticsUserId(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.analyticsUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnalyticsUserIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.analyticsUserId_ = byteString.toStringUtf8();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuid(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 16;
            this.auid_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuidString(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.auidString_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuidStringBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.auidString_ = byteString.toStringUtf8();
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCache(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 4;
            this.cache_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
            clientInfo.getClass();
            this.clientInfo_ = clientInfo;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceInfo(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.getClass();
            this.deviceInfo_ = initializationDeviceInfo;
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExternalUserIdentifier(String str) {
            str.getClass();
            this.bitField0_ |= 2048;
            this.externalUserIdentifier_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExternalUserIdentifierBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.externalUserIdentifier_ = byteString.toStringUtf8();
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdfi(String str) {
            str.getClass();
            this.idfi_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdfiBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.idfi_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsFirstInit(boolean z10) {
            this.isFirstInit_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLegacyFlowUserConsent(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.legacyFlowUserConsent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLegacyFlowUserConsentBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.legacyFlowUserConsent_ = byteString.toStringUtf8();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrivacy(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 2;
            this.privacy_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(ByteString byteString) {
            byteString.getClass();
            this.sessionId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUadsInitBlob(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
            this.uadsInitBlob_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnityBuildGuid(String str) {
            str.getClass();
            this.bitField0_ |= 4096;
            this.unityBuildGuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnityBuildGuidBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.unityBuildGuid_ = byteString.toStringUtf8();
            this.bitField0_ |= 4096;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnityInstallationId(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 512;
            this.unityInstallationId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnityMegaSessionId(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 1024;
            this.unityMegaSessionId_ = byteString;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean containsExtras(String str) {
            str.getClass();
            return internalGetExtras().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            wl.u uVar = null;
            switch (wl.u.f90728a[methodToInvoke.ordinal()]) {
                case 1:
                    return new InitializationRequest();
                case 2:
                    return new Builder(uVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0001\u0001\u0011\u0011\u0001\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003Ȉ\u0004\n\u0005ည\u0002\u0006ለ\u0003\u0007ည\u0004\bለ\u0005\tဉ\u0006\n\u0007\u000bለ\u0007\fည\b\rည\t\u000eည\n\u000fለ\u000b\u00102\u0011ለ\f", new Object[]{"bitField0_", "clientInfo_", "privacy_", "idfi_", "sessionId_", "cache_", "legacyFlowUserConsent_", "auid_", "analyticsUserId_", "deviceInfo_", "isFirstInit_", "auidString_", "uadsInitBlob_", "unityInstallationId_", "unityMegaSessionId_", "externalUserIdentifier_", "extras_", c0.f57488a, "unityBuildGuid_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<InitializationRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (InitializationRequest.class) {
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

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public String getAnalyticsUserId() {
            return this.analyticsUserId_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ByteString getAnalyticsUserIdBytes() {
            return ByteString.copyFromUtf8(this.analyticsUserId_);
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ByteString getAuid() {
            return this.auid_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public String getAuidString() {
            return this.auidString_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ByteString getAuidStringBytes() {
            return ByteString.copyFromUtf8(this.auidString_);
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ByteString getCache() {
            return this.cache_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this.clientInfo_;
            return clientInfo == null ? ClientInfoOuterClass.ClientInfo.getDefaultInstance() : clientInfo;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public InitializationDeviceInfo getDeviceInfo() {
            InitializationDeviceInfo initializationDeviceInfo = this.deviceInfo_;
            return initializationDeviceInfo == null ? InitializationDeviceInfo.getDefaultInstance() : initializationDeviceInfo;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public String getExternalUserIdentifier() {
            return this.externalUserIdentifier_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ByteString getExternalUserIdentifierBytes() {
            return ByteString.copyFromUtf8(this.externalUserIdentifier_);
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        @Deprecated
        public Map<String, String> getExtras() {
            return getExtrasMap();
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public int getExtrasCount() {
            return internalGetExtras().size();
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public Map<String, String> getExtrasMap() {
            return Collections.unmodifiableMap(internalGetExtras());
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public String getExtrasOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetExtras = internalGetExtras();
            return mapFieldLiteInternalGetExtras.containsKey(str) ? mapFieldLiteInternalGetExtras.get(str) : str2;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public String getExtrasOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetExtras = internalGetExtras();
            if (mapFieldLiteInternalGetExtras.containsKey(str)) {
                return mapFieldLiteInternalGetExtras.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public String getIdfi() {
            return this.idfi_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ByteString getIdfiBytes() {
            return ByteString.copyFromUtf8(this.idfi_);
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean getIsFirstInit() {
            return this.isFirstInit_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public String getLegacyFlowUserConsent() {
            return this.legacyFlowUserConsent_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ByteString getLegacyFlowUserConsentBytes() {
            return ByteString.copyFromUtf8(this.legacyFlowUserConsent_);
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ByteString getPrivacy() {
            return this.privacy_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ByteString getSessionId() {
            return this.sessionId_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ByteString getUadsInitBlob() {
            return this.uadsInitBlob_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public String getUnityBuildGuid() {
            return this.unityBuildGuid_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ByteString getUnityBuildGuidBytes() {
            return ByteString.copyFromUtf8(this.unityBuildGuid_);
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ByteString getUnityInstallationId() {
            return this.unityInstallationId_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ByteString getUnityMegaSessionId() {
            return this.unityMegaSessionId_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasAnalyticsUserId() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasAuid() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasAuidString() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasCache() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasClientInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasDeviceInfo() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasExternalUserIdentifier() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasLegacyFlowUserConsent() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasPrivacy() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasUadsInitBlob() {
            return (this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasUnityBuildGuid() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasUnityInstallationId() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasUnityMegaSessionId() {
            return (this.bitField0_ & 1024) != 0;
        }

        public static Builder newBuilder(InitializationRequest initializationRequest) {
            return DEFAULT_INSTANCE.createBuilder(initializationRequest);
        }

        public static InitializationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static InitializationRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static InitializationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static InitializationRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static InitializationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static InitializationRequest parseFrom(InputStream inputStream) throws IOException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static InitializationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface InitializationRequestOrBuilder extends MessageLiteOrBuilder {
        boolean containsExtras(String str);

        String getAnalyticsUserId();

        ByteString getAnalyticsUserIdBytes();

        ByteString getAuid();

        String getAuidString();

        ByteString getAuidStringBytes();

        ByteString getCache();

        ClientInfoOuterClass.ClientInfo getClientInfo();

        InitializationDeviceInfo getDeviceInfo();

        String getExternalUserIdentifier();

        ByteString getExternalUserIdentifierBytes();

        @Deprecated
        Map<String, String> getExtras();

        int getExtrasCount();

        Map<String, String> getExtrasMap();

        String getExtrasOrDefault(String str, String str2);

        String getExtrasOrThrow(String str);

        String getIdfi();

        ByteString getIdfiBytes();

        boolean getIsFirstInit();

        String getLegacyFlowUserConsent();

        ByteString getLegacyFlowUserConsentBytes();

        ByteString getPrivacy();

        ByteString getSessionId();

        ByteString getUadsInitBlob();

        String getUnityBuildGuid();

        ByteString getUnityBuildGuidBytes();

        ByteString getUnityInstallationId();

        ByteString getUnityMegaSessionId();

        boolean hasAnalyticsUserId();

        boolean hasAuid();

        boolean hasAuidString();

        boolean hasCache();

        boolean hasClientInfo();

        boolean hasDeviceInfo();

        boolean hasExternalUserIdentifier();

        boolean hasLegacyFlowUserConsent();

        boolean hasPrivacy();

        boolean hasUadsInitBlob();

        boolean hasUnityBuildGuid();

        boolean hasUnityInstallationId();

        boolean hasUnityMegaSessionId();
    }

    private InitializationRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
