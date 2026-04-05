package gatewayprotocol.v1;

import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class NetworkCapabilityTransportsKt {
    public static final NetworkCapabilityTransportsKt INSTANCE = new NetworkCapabilityTransportsKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports _build() {
            NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransportsBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(networkCapabilityTransportsBuild, "_builder.build()");
            return networkCapabilityTransportsBuild;
        }

        public final void clearBluetooth() {
            this._builder.clearBluetooth();
        }

        public final void clearCellular() {
            this._builder.clearCellular();
        }

        public final void clearEthernet() {
            this._builder.clearEthernet();
        }

        public final void clearLowpan() {
            this._builder.clearLowpan();
        }

        public final void clearSatellite() {
            this._builder.clearSatellite();
        }

        public final void clearThread() {
            this._builder.clearThread();
        }

        public final void clearUsb() {
            this._builder.clearUsb();
        }

        public final void clearVpn() {
            this._builder.clearVpn();
        }

        public final void clearWifi() {
            this._builder.clearWifi();
        }

        public final void clearWifiAware() {
            this._builder.clearWifiAware();
        }

        public final boolean getBluetooth() {
            return this._builder.getBluetooth();
        }

        public final boolean getCellular() {
            return this._builder.getCellular();
        }

        public final boolean getEthernet() {
            return this._builder.getEthernet();
        }

        public final boolean getLowpan() {
            return this._builder.getLowpan();
        }

        public final boolean getSatellite() {
            return this._builder.getSatellite();
        }

        public final boolean getThread() {
            return this._builder.getThread();
        }

        public final boolean getUsb() {
            return this._builder.getUsb();
        }

        public final boolean getVpn() {
            return this._builder.getVpn();
        }

        public final boolean getWifi() {
            return this._builder.getWifi();
        }

        public final boolean getWifiAware() {
            return this._builder.getWifiAware();
        }

        public final boolean hasBluetooth() {
            return this._builder.hasBluetooth();
        }

        public final boolean hasCellular() {
            return this._builder.hasCellular();
        }

        public final boolean hasEthernet() {
            return this._builder.hasEthernet();
        }

        public final boolean hasLowpan() {
            return this._builder.hasLowpan();
        }

        public final boolean hasSatellite() {
            return this._builder.hasSatellite();
        }

        public final boolean hasThread() {
            return this._builder.hasThread();
        }

        public final boolean hasUsb() {
            return this._builder.hasUsb();
        }

        public final boolean hasVpn() {
            return this._builder.hasVpn();
        }

        public final boolean hasWifi() {
            return this._builder.hasWifi();
        }

        public final boolean hasWifiAware() {
            return this._builder.hasWifiAware();
        }

        public final void setBluetooth(boolean z10) {
            this._builder.setBluetooth(z10);
        }

        public final void setCellular(boolean z10) {
            this._builder.setCellular(z10);
        }

        public final void setEthernet(boolean z10) {
            this._builder.setEthernet(z10);
        }

        public final void setLowpan(boolean z10) {
            this._builder.setLowpan(z10);
        }

        public final void setSatellite(boolean z10) {
            this._builder.setSatellite(z10);
        }

        public final void setThread(boolean z10) {
            this._builder.setThread(z10);
        }

        public final void setUsb(boolean z10) {
            this._builder.setUsb(z10);
        }

        public final void setVpn(boolean z10) {
            this._builder.setVpn(z10);
        }

        public final void setWifi(boolean z10) {
            this._builder.setWifi(z10);
        }

        public final void setWifiAware(boolean z10) {
            this._builder.setWifiAware(z10);
        }

        private Dsl(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builder) {
            this._builder = builder;
        }
    }

    private NetworkCapabilityTransportsKt() {
    }
}
