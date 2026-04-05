package gatewayprotocol.v1;

import gatewayprotocol.v1.InitializationRequestOuterClass;
import h2.rl.UeklptUrP;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class InitializationDeviceInfoKt {
    public static final InitializationDeviceInfoKt INSTANCE = new InitializationDeviceInfoKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationRequestOuterClass.InitializationDeviceInfo.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationRequestOuterClass.InitializationDeviceInfo _build() {
            InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfoBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(initializationDeviceInfoBuild, "_builder.build()");
            return initializationDeviceInfoBuild;
        }

        public final void clearBatteryLevel() {
            this._builder.clearBatteryLevel();
        }

        public final void clearBatteryStatus() {
            this._builder.clearBatteryStatus();
        }

        public final void clearBundleId() {
            this._builder.clearBundleId();
        }

        public final void clearConnectionType() {
            this._builder.clearConnectionType();
        }

        public final void clearCurrentUiTheme() {
            this._builder.clearCurrentUiTheme();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearHashedDeviceName() {
            this._builder.clearHashedDeviceName();
        }

        public final void clearLanguage() {
            this._builder.clearLanguage();
        }

        public final void clearLocalList() {
            this._builder.clearLocalList();
        }

        public final void clearNetworkOperator() {
            this._builder.clearNetworkOperator();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearSystemBootTime() {
            this._builder.clearSystemBootTime();
        }

        public final void clearTotalDiskSpace() {
            this._builder.clearTotalDiskSpace();
        }

        public final void clearTotalRamMemory() {
            this._builder.clearTotalRamMemory();
        }

        public final void clearTrackingAuthStatus() {
            this._builder.clearTrackingAuthStatus();
        }

        public final double getBatteryLevel() {
            return this._builder.getBatteryLevel();
        }

        public final int getBatteryStatus() {
            return this._builder.getBatteryStatus();
        }

        public final String getBundleId() {
            String bundleId = this._builder.getBundleId();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bundleId, "_builder.getBundleId()");
            return bundleId;
        }

        public final String getConnectionType() {
            String connectionType = this._builder.getConnectionType();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(connectionType, "_builder.getConnectionType()");
            return connectionType;
        }

        public final long getCurrentUiTheme() {
            return this._builder.getCurrentUiTheme();
        }

        public final String getDeviceMake() {
            String deviceMake = this._builder.getDeviceMake();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(deviceMake, "_builder.getDeviceMake()");
            return deviceMake;
        }

        public final String getDeviceModel() {
            String deviceModel = this._builder.getDeviceModel();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(deviceModel, "_builder.getDeviceModel()");
            return deviceModel;
        }

        public final String getHashedDeviceName() {
            String hashedDeviceName = this._builder.getHashedDeviceName();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(hashedDeviceName, "_builder.getHashedDeviceName()");
            return hashedDeviceName;
        }

        public final String getLanguage() {
            String language = this._builder.getLanguage();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(language, "_builder.getLanguage()");
            return language;
        }

        public final String getLocalList() {
            String localList = this._builder.getLocalList();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(localList, "_builder.getLocalList()");
            return localList;
        }

        public final String getNetworkOperator() {
            String networkOperator = this._builder.getNetworkOperator();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(networkOperator, "_builder.getNetworkOperator()");
            return networkOperator;
        }

        public final String getOsVersion() {
            String osVersion = this._builder.getOsVersion();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(osVersion, "_builder.getOsVersion()");
            return osVersion;
        }

        public final long getSystemBootTime() {
            return this._builder.getSystemBootTime();
        }

        public final long getTotalDiskSpace() {
            return this._builder.getTotalDiskSpace();
        }

        public final long getTotalRamMemory() {
            return this._builder.getTotalRamMemory();
        }

        public final int getTrackingAuthStatus() {
            return this._builder.getTrackingAuthStatus();
        }

        public final boolean hasTrackingAuthStatus() {
            return this._builder.hasTrackingAuthStatus();
        }

        public final void setBatteryLevel(double d10) {
            this._builder.setBatteryLevel(d10);
        }

        public final void setBatteryStatus(int i10) {
            this._builder.setBatteryStatus(i10);
        }

        public final void setBundleId(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setBundleId(value);
        }

        public final void setCurrentUiTheme(long j10) {
            this._builder.setCurrentUiTheme(j10);
        }

        public final void setDeviceMake(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setDeviceMake(value);
        }

        public final void setDeviceModel(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setDeviceModel(value);
        }

        public final void setHashedDeviceName(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setHashedDeviceName(value);
        }

        public final void setLanguage(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setLanguage(value);
        }

        public final void setLocalList(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setLocalList(value);
        }

        public final void setNetworkOperator(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setNetworkOperator(value);
        }

        public final void setOsVersion(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setOsVersion(value);
        }

        public final void setSystemBootTime(long j10) {
            this._builder.setSystemBootTime(j10);
        }

        public final void setTotalDiskSpace(long j10) {
            this._builder.setTotalDiskSpace(j10);
        }

        public final void setTotalRamMemory(long j10) {
            this._builder.setTotalRamMemory(j10);
        }

        public final void setTrackingAuthStatus(int i10) {
            this._builder.setTrackingAuthStatus(i10);
        }

        private Dsl(InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder) {
            this._builder = builder;
        }

        public final void setConnectionType(String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, UeklptUrP.stNsEFOCCIMN);
            this._builder.setConnectionType(str);
        }
    }

    private InitializationDeviceInfoKt() {
    }
}
