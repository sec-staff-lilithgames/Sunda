package gatewayprotocol.v1;

import androidx.core.app.NotificationCompat;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class NetworkCapabilityTransportsOuterClass {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class NetworkCapabilityTransports extends GeneratedMessageLite<NetworkCapabilityTransports, Builder> implements NetworkCapabilityTransportsOrBuilder {
        public static final int BLUETOOTH_FIELD_NUMBER = 1;
        public static final int CELLULAR_FIELD_NUMBER = 2;
        private static final NetworkCapabilityTransports DEFAULT_INSTANCE;
        public static final int ETHERNET_FIELD_NUMBER = 3;
        public static final int LOWPAN_FIELD_NUMBER = 4;
        private static volatile Parser<NetworkCapabilityTransports> PARSER = null;
        public static final int SATELLITE_FIELD_NUMBER = 5;
        public static final int THREAD_FIELD_NUMBER = 6;
        public static final int USB_FIELD_NUMBER = 7;
        public static final int VPN_FIELD_NUMBER = 8;
        public static final int WIFI_AWARE_FIELD_NUMBER = 10;
        public static final int WIFI_FIELD_NUMBER = 9;
        private int bitField0_;
        private boolean bluetooth_;
        private boolean cellular_;
        private boolean ethernet_;
        private boolean lowpan_;
        private boolean satellite_;
        private boolean thread_;
        private boolean usb_;
        private boolean vpn_;
        private boolean wifiAware_;
        private boolean wifi_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<NetworkCapabilityTransports, Builder> implements NetworkCapabilityTransportsOrBuilder {
            public /* synthetic */ Builder(wl.z zVar) {
                this();
            }

            public Builder clearBluetooth() {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).clearBluetooth();
                return this;
            }

            public Builder clearCellular() {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).clearCellular();
                return this;
            }

            public Builder clearEthernet() {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).clearEthernet();
                return this;
            }

            public Builder clearLowpan() {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).clearLowpan();
                return this;
            }

            public Builder clearSatellite() {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).clearSatellite();
                return this;
            }

            public Builder clearThread() {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).clearThread();
                return this;
            }

            public Builder clearUsb() {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).clearUsb();
                return this;
            }

            public Builder clearVpn() {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).clearVpn();
                return this;
            }

            public Builder clearWifi() {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).clearWifi();
                return this;
            }

            public Builder clearWifiAware() {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).clearWifiAware();
                return this;
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getBluetooth() {
                return ((NetworkCapabilityTransports) this.instance).getBluetooth();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getCellular() {
                return ((NetworkCapabilityTransports) this.instance).getCellular();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getEthernet() {
                return ((NetworkCapabilityTransports) this.instance).getEthernet();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getLowpan() {
                return ((NetworkCapabilityTransports) this.instance).getLowpan();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getSatellite() {
                return ((NetworkCapabilityTransports) this.instance).getSatellite();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getThread() {
                return ((NetworkCapabilityTransports) this.instance).getThread();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getUsb() {
                return ((NetworkCapabilityTransports) this.instance).getUsb();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getVpn() {
                return ((NetworkCapabilityTransports) this.instance).getVpn();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getWifi() {
                return ((NetworkCapabilityTransports) this.instance).getWifi();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getWifiAware() {
                return ((NetworkCapabilityTransports) this.instance).getWifiAware();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasBluetooth() {
                return ((NetworkCapabilityTransports) this.instance).hasBluetooth();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasCellular() {
                return ((NetworkCapabilityTransports) this.instance).hasCellular();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasEthernet() {
                return ((NetworkCapabilityTransports) this.instance).hasEthernet();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasLowpan() {
                return ((NetworkCapabilityTransports) this.instance).hasLowpan();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasSatellite() {
                return ((NetworkCapabilityTransports) this.instance).hasSatellite();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasThread() {
                return ((NetworkCapabilityTransports) this.instance).hasThread();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasUsb() {
                return ((NetworkCapabilityTransports) this.instance).hasUsb();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasVpn() {
                return ((NetworkCapabilityTransports) this.instance).hasVpn();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasWifi() {
                return ((NetworkCapabilityTransports) this.instance).hasWifi();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasWifiAware() {
                return ((NetworkCapabilityTransports) this.instance).hasWifiAware();
            }

            public Builder setBluetooth(boolean z10) {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).setBluetooth(z10);
                return this;
            }

            public Builder setCellular(boolean z10) {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).setCellular(z10);
                return this;
            }

            public Builder setEthernet(boolean z10) {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).setEthernet(z10);
                return this;
            }

            public Builder setLowpan(boolean z10) {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).setLowpan(z10);
                return this;
            }

            public Builder setSatellite(boolean z10) {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).setSatellite(z10);
                return this;
            }

            public Builder setThread(boolean z10) {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).setThread(z10);
                return this;
            }

            public Builder setUsb(boolean z10) {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).setUsb(z10);
                return this;
            }

            public Builder setVpn(boolean z10) {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).setVpn(z10);
                return this;
            }

            public Builder setWifi(boolean z10) {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).setWifi(z10);
                return this;
            }

            public Builder setWifiAware(boolean z10) {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).setWifiAware(z10);
                return this;
            }

            private Builder() {
                super(NetworkCapabilityTransports.DEFAULT_INSTANCE);
            }
        }

        static {
            NetworkCapabilityTransports networkCapabilityTransports = new NetworkCapabilityTransports();
            DEFAULT_INSTANCE = networkCapabilityTransports;
            GeneratedMessageLite.registerDefaultInstance(NetworkCapabilityTransports.class, networkCapabilityTransports);
        }

        private NetworkCapabilityTransports() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBluetooth() {
            this.bitField0_ &= -2;
            this.bluetooth_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCellular() {
            this.bitField0_ &= -3;
            this.cellular_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEthernet() {
            this.bitField0_ &= -5;
            this.ethernet_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLowpan() {
            this.bitField0_ &= -9;
            this.lowpan_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSatellite() {
            this.bitField0_ &= -17;
            this.satellite_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearThread() {
            this.bitField0_ &= -33;
            this.thread_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUsb() {
            this.bitField0_ &= -65;
            this.usb_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVpn() {
            this.bitField0_ &= -129;
            this.vpn_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWifi() {
            this.bitField0_ &= -257;
            this.wifi_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWifiAware() {
            this.bitField0_ &= -513;
            this.wifiAware_ = false;
        }

        public static NetworkCapabilityTransports getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NetworkCapabilityTransports parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetworkCapabilityTransports parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NetworkCapabilityTransports> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBluetooth(boolean z10) {
            this.bitField0_ |= 1;
            this.bluetooth_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCellular(boolean z10) {
            this.bitField0_ |= 2;
            this.cellular_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEthernet(boolean z10) {
            this.bitField0_ |= 4;
            this.ethernet_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLowpan(boolean z10) {
            this.bitField0_ |= 8;
            this.lowpan_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSatellite(boolean z10) {
            this.bitField0_ |= 16;
            this.satellite_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThread(boolean z10) {
            this.bitField0_ |= 32;
            this.thread_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsb(boolean z10) {
            this.bitField0_ |= 64;
            this.usb_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVpn(boolean z10) {
            this.bitField0_ |= 128;
            this.vpn_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifi(boolean z10) {
            this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
            this.wifi_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifiAware(boolean z10) {
            this.bitField0_ |= 512;
            this.wifiAware_ = z10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            wl.z zVar = null;
            switch (wl.z.f90733a[methodToInvoke.ordinal()]) {
                case 1:
                    return new NetworkCapabilityTransports();
                case 2:
                    return new Builder(zVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t", new Object[]{"bitField0_", "bluetooth_", "cellular_", "ethernet_", "lowpan_", "satellite_", "thread_", "usb_", "vpn_", "wifi_", "wifiAware_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<NetworkCapabilityTransports> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (NetworkCapabilityTransports.class) {
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

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getBluetooth() {
            return this.bluetooth_;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getCellular() {
            return this.cellular_;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getEthernet() {
            return this.ethernet_;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getLowpan() {
            return this.lowpan_;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getSatellite() {
            return this.satellite_;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getThread() {
            return this.thread_;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getUsb() {
            return this.usb_;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getVpn() {
            return this.vpn_;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getWifi() {
            return this.wifi_;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getWifiAware() {
            return this.wifiAware_;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasBluetooth() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasCellular() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasEthernet() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasLowpan() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasSatellite() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasThread() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasUsb() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasVpn() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasWifi() {
            return (this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasWifiAware() {
            return (this.bitField0_ & 512) != 0;
        }

        public static Builder newBuilder(NetworkCapabilityTransports networkCapabilityTransports) {
            return DEFAULT_INSTANCE.createBuilder(networkCapabilityTransports);
        }

        public static NetworkCapabilityTransports parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetworkCapabilityTransports parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NetworkCapabilityTransports parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NetworkCapabilityTransports parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NetworkCapabilityTransports parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NetworkCapabilityTransports parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NetworkCapabilityTransports parseFrom(InputStream inputStream) throws IOException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetworkCapabilityTransports parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetworkCapabilityTransports parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NetworkCapabilityTransports parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface NetworkCapabilityTransportsOrBuilder extends MessageLiteOrBuilder {
        boolean getBluetooth();

        boolean getCellular();

        boolean getEthernet();

        boolean getLowpan();

        boolean getSatellite();

        boolean getThread();

        boolean getUsb();

        boolean getVpn();

        boolean getWifi();

        boolean getWifiAware();

        boolean hasBluetooth();

        boolean hasCellular();

        boolean hasEthernet();

        boolean hasLowpan();

        boolean hasSatellite();

        boolean hasThread();

        boolean hasUsb();

        boolean hasVpn();

        boolean hasWifi();

        boolean hasWifiAware();
    }

    private NetworkCapabilityTransportsOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
