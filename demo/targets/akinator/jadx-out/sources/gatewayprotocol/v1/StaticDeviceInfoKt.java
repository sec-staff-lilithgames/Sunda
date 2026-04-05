package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class StaticDeviceInfoKt {
    public static final StaticDeviceInfoKt INSTANCE = new StaticDeviceInfoKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AndroidKt {
        public static final AndroidKt INSTANCE = new AndroidKt();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder _builder;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder) {
                    kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder, kotlin.jvm.internal.u uVar) {
                this(builder);
            }

            public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo.Android _build() {
                StaticDeviceInfoOuterClass.StaticDeviceInfo.Android androidBuild = this._builder.build();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(androidBuild, "_builder.build()");
                return androidBuild;
            }

            public final void clearAndroidFingerprint() {
                this._builder.clearAndroidFingerprint();
            }

            public final void clearApiLevel() {
                this._builder.clearApiLevel();
            }

            public final void clearApkDeveloperSigningCertificateHash() {
                this._builder.clearApkDeveloperSigningCertificateHash();
            }

            public final void clearAppInstaller() {
                this._builder.clearAppInstaller();
            }

            public final void clearBuildBoard() {
                this._builder.clearBuildBoard();
            }

            public final void clearBuildBootloader() {
                this._builder.clearBuildBootloader();
            }

            public final void clearBuildBrand() {
                this._builder.clearBuildBrand();
            }

            public final void clearBuildDevice() {
                this._builder.clearBuildDevice();
            }

            public final void clearBuildDisplay() {
                this._builder.clearBuildDisplay();
            }

            public final void clearBuildFingerprint() {
                this._builder.clearBuildFingerprint();
            }

            public final void clearBuildHardware() {
                this._builder.clearBuildHardware();
            }

            public final void clearBuildHost() {
                this._builder.clearBuildHost();
            }

            public final void clearBuildId() {
                this._builder.clearBuildId();
            }

            public final void clearBuildProduct() {
                this._builder.clearBuildProduct();
            }

            public final void clearDisplayScreenDensity() {
                this._builder.clearDisplayScreenDensity();
            }

            public final void clearExtensionVersion() {
                this._builder.clearExtensionVersion();
            }

            public final void clearPhoneType() {
                this._builder.clearPhoneType();
            }

            public final void clearSimOperator() {
                this._builder.clearSimOperator();
            }

            public final void clearTotalDiskSpaceInternal() {
                this._builder.clearTotalDiskSpaceInternal();
            }

            public final void clearVersionCode() {
                this._builder.clearVersionCode();
            }

            public final String getAndroidFingerprint() {
                String androidFingerprint = this._builder.getAndroidFingerprint();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(androidFingerprint, "_builder.getAndroidFingerprint()");
                return androidFingerprint;
            }

            public final int getApiLevel() {
                return this._builder.getApiLevel();
            }

            public final String getApkDeveloperSigningCertificateHash() {
                String apkDeveloperSigningCertificateHash = this._builder.getApkDeveloperSigningCertificateHash();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(apkDeveloperSigningCertificateHash, "_builder.getApkDeveloperSigningCertificateHash()");
                return apkDeveloperSigningCertificateHash;
            }

            public final String getAppInstaller() {
                String appInstaller = this._builder.getAppInstaller();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(appInstaller, "_builder.getAppInstaller()");
                return appInstaller;
            }

            public final String getBuildBoard() {
                String buildBoard = this._builder.getBuildBoard();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(buildBoard, "_builder.getBuildBoard()");
                return buildBoard;
            }

            public final String getBuildBootloader() {
                String buildBootloader = this._builder.getBuildBootloader();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(buildBootloader, "_builder.getBuildBootloader()");
                return buildBootloader;
            }

            public final String getBuildBrand() {
                String buildBrand = this._builder.getBuildBrand();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(buildBrand, "_builder.getBuildBrand()");
                return buildBrand;
            }

            public final String getBuildDevice() {
                String buildDevice = this._builder.getBuildDevice();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(buildDevice, "_builder.getBuildDevice()");
                return buildDevice;
            }

            public final String getBuildDisplay() {
                String buildDisplay = this._builder.getBuildDisplay();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(buildDisplay, "_builder.getBuildDisplay()");
                return buildDisplay;
            }

            public final String getBuildFingerprint() {
                String buildFingerprint = this._builder.getBuildFingerprint();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(buildFingerprint, "_builder.getBuildFingerprint()");
                return buildFingerprint;
            }

            public final String getBuildHardware() {
                String buildHardware = this._builder.getBuildHardware();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(buildHardware, "_builder.getBuildHardware()");
                return buildHardware;
            }

            public final String getBuildHost() {
                String buildHost = this._builder.getBuildHost();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(buildHost, "_builder.getBuildHost()");
                return buildHost;
            }

            public final String getBuildId() {
                String buildId = this._builder.getBuildId();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(buildId, "_builder.getBuildId()");
                return buildId;
            }

            public final String getBuildProduct() {
                String buildProduct = this._builder.getBuildProduct();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(buildProduct, "_builder.getBuildProduct()");
                return buildProduct;
            }

            public final int getDisplayScreenDensity() {
                return this._builder.getDisplayScreenDensity();
            }

            public final int getExtensionVersion() {
                return this._builder.getExtensionVersion();
            }

            public final int getPhoneType() {
                return this._builder.getPhoneType();
            }

            public final String getSimOperator() {
                String simOperator = this._builder.getSimOperator();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(simOperator, "_builder.getSimOperator()");
                return simOperator;
            }

            public final long getTotalDiskSpaceInternal() {
                return this._builder.getTotalDiskSpaceInternal();
            }

            public final int getVersionCode() {
                return this._builder.getVersionCode();
            }

            public final boolean hasAndroidFingerprint() {
                return this._builder.hasAndroidFingerprint();
            }

            public final boolean hasApiLevel() {
                return this._builder.hasApiLevel();
            }

            public final boolean hasApkDeveloperSigningCertificateHash() {
                return this._builder.hasApkDeveloperSigningCertificateHash();
            }

            public final boolean hasAppInstaller() {
                return this._builder.hasAppInstaller();
            }

            public final boolean hasBuildBoard() {
                return this._builder.hasBuildBoard();
            }

            public final boolean hasBuildBootloader() {
                return this._builder.hasBuildBootloader();
            }

            public final boolean hasBuildBrand() {
                return this._builder.hasBuildBrand();
            }

            public final boolean hasBuildDevice() {
                return this._builder.hasBuildDevice();
            }

            public final boolean hasBuildDisplay() {
                return this._builder.hasBuildDisplay();
            }

            public final boolean hasBuildFingerprint() {
                return this._builder.hasBuildFingerprint();
            }

            public final boolean hasBuildHardware() {
                return this._builder.hasBuildHardware();
            }

            public final boolean hasBuildHost() {
                return this._builder.hasBuildHost();
            }

            public final boolean hasBuildId() {
                return this._builder.hasBuildId();
            }

            public final boolean hasBuildProduct() {
                return this._builder.hasBuildProduct();
            }

            public final boolean hasDisplayScreenDensity() {
                return this._builder.hasDisplayScreenDensity();
            }

            public final boolean hasExtensionVersion() {
                return this._builder.hasExtensionVersion();
            }

            public final boolean hasPhoneType() {
                return this._builder.hasPhoneType();
            }

            public final boolean hasSimOperator() {
                return this._builder.hasSimOperator();
            }

            public final boolean hasTotalDiskSpaceInternal() {
                return this._builder.hasTotalDiskSpaceInternal();
            }

            public final boolean hasVersionCode() {
                return this._builder.hasVersionCode();
            }

            public final void setAndroidFingerprint(String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setAndroidFingerprint(value);
            }

            public final void setApiLevel(int i10) {
                this._builder.setApiLevel(i10);
            }

            public final void setApkDeveloperSigningCertificateHash(String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setApkDeveloperSigningCertificateHash(value);
            }

            public final void setAppInstaller(String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setAppInstaller(value);
            }

            public final void setBuildBoard(String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setBuildBoard(value);
            }

            public final void setBuildBootloader(String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setBuildBootloader(value);
            }

            public final void setBuildBrand(String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setBuildBrand(value);
            }

            public final void setBuildDevice(String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setBuildDevice(value);
            }

            public final void setBuildDisplay(String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setBuildDisplay(value);
            }

            public final void setBuildFingerprint(String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setBuildFingerprint(value);
            }

            public final void setBuildHardware(String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setBuildHardware(value);
            }

            public final void setBuildHost(String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setBuildHost(value);
            }

            public final void setBuildId(String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setBuildId(value);
            }

            public final void setBuildProduct(String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setBuildProduct(value);
            }

            public final void setDisplayScreenDensity(int i10) {
                this._builder.setDisplayScreenDensity(i10);
            }

            public final void setExtensionVersion(int i10) {
                this._builder.setExtensionVersion(i10);
            }

            public final void setPhoneType(int i10) {
                this._builder.setPhoneType(i10);
            }

            public final void setSimOperator(String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setSimOperator(value);
            }

            public final void setTotalDiskSpaceInternal(long j10) {
                this._builder.setTotalDiskSpaceInternal(j10);
            }

            public final void setVersionCode(int i10) {
                this._builder.setVersionCode(i10);
            }

            private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder) {
                this._builder = builder;
            }
        }

        private AndroidKt() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class StoresProxy extends DslProxy {
            private StoresProxy() {
            }
        }

        public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo _build() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfoBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(staticDeviceInfoBuild, "_builder.build()");
            return staticDeviceInfoBuild;
        }

        public final /* synthetic */ void addAllStores(DslList dslList, Iterable values) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(values, "values");
            this._builder.addAllStores(values);
        }

        public final /* synthetic */ void addStores(DslList dslList, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.addStores(value);
        }

        public final void clearAndroid() {
            this._builder.clearAndroid();
        }

        public final void clearAppDebuggable() {
            this._builder.clearAppDebuggable();
        }

        public final void clearBundleId() {
            this._builder.clearBundleId();
        }

        public final void clearBundleVersion() {
            this._builder.clearBundleVersion();
        }

        public final void clearCpuCount() {
            this._builder.clearCpuCount();
        }

        public final void clearCpuModel() {
            this._builder.clearCpuModel();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearGpuModel() {
            this._builder.clearGpuModel();
        }

        public final void clearIos() {
            this._builder.clearIos();
        }

        public final void clearMadeWithUnity() {
            this._builder.clearMadeWithUnity();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearPlatformSpecific() {
            this._builder.clearPlatformSpecific();
        }

        public final void clearRooted() {
            this._builder.clearRooted();
        }

        public final void clearScreenDensity() {
            this._builder.clearScreenDensity();
        }

        public final void clearScreenHeight() {
            this._builder.clearScreenHeight();
        }

        public final void clearScreenSize() {
            this._builder.clearScreenSize();
        }

        public final void clearScreenWidth() {
            this._builder.clearScreenWidth();
        }

        public final /* synthetic */ void clearStores(DslList dslList) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            this._builder.clearStores();
        }

        public final void clearTotalDiskSpace() {
            this._builder.clearTotalDiskSpace();
        }

        public final void clearTotalRamMemory() {
            this._builder.clearTotalRamMemory();
        }

        public final void clearWebviewUa() {
            this._builder.clearWebviewUa();
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getAndroid() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2 = this._builder.getAndroid();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(android2, "_builder.getAndroid()");
            return android2;
        }

        public final boolean getAppDebuggable() {
            return this._builder.getAppDebuggable();
        }

        public final String getBundleId() {
            String bundleId = this._builder.getBundleId();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bundleId, "_builder.getBundleId()");
            return bundleId;
        }

        public final String getBundleVersion() {
            String bundleVersion = this._builder.getBundleVersion();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bundleVersion, "_builder.getBundleVersion()");
            return bundleVersion;
        }

        public final long getCpuCount() {
            return this._builder.getCpuCount();
        }

        public final String getCpuModel() {
            String cpuModel = this._builder.getCpuModel();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(cpuModel, "_builder.getCpuModel()");
            return cpuModel;
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

        public final String getGpuModel() {
            String gpuModel = this._builder.getGpuModel();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(gpuModel, "_builder.getGpuModel()");
            return gpuModel;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getIos() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios = this._builder.getIos();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(ios, "_builder.getIos()");
            return ios;
        }

        public final boolean getMadeWithUnity() {
            return this._builder.getMadeWithUnity();
        }

        public final String getOsVersion() {
            String osVersion = this._builder.getOsVersion();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(osVersion, "_builder.getOsVersion()");
            return osVersion;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase platformSpecificCase = this._builder.getPlatformSpecificCase();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(platformSpecificCase, "_builder.getPlatformSpecificCase()");
            return platformSpecificCase;
        }

        public final boolean getRooted() {
            return this._builder.getRooted();
        }

        public final int getScreenDensity() {
            return this._builder.getScreenDensity();
        }

        public final int getScreenHeight() {
            return this._builder.getScreenHeight();
        }

        public final int getScreenSize() {
            return this._builder.getScreenSize();
        }

        public final int getScreenWidth() {
            return this._builder.getScreenWidth();
        }

        public final DslList<String, StoresProxy> getStores() {
            List<String> storesList = this._builder.getStoresList();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(storesList, "_builder.getStoresList()");
            return new DslList<>(storesList);
        }

        public final long getTotalDiskSpace() {
            return this._builder.getTotalDiskSpace();
        }

        public final long getTotalRamMemory() {
            return this._builder.getTotalRamMemory();
        }

        public final String getWebviewUa() {
            String webviewUa = this._builder.getWebviewUa();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(webviewUa, "_builder.getWebviewUa()");
            return webviewUa;
        }

        public final boolean hasAndroid() {
            return this._builder.hasAndroid();
        }

        public final boolean hasAppDebuggable() {
            return this._builder.hasAppDebuggable();
        }

        public final boolean hasBundleId() {
            return this._builder.hasBundleId();
        }

        public final boolean hasBundleVersion() {
            return this._builder.hasBundleVersion();
        }

        public final boolean hasCpuCount() {
            return this._builder.hasCpuCount();
        }

        public final boolean hasCpuModel() {
            return this._builder.hasCpuModel();
        }

        public final boolean hasDeviceMake() {
            return this._builder.hasDeviceMake();
        }

        public final boolean hasDeviceModel() {
            return this._builder.hasDeviceModel();
        }

        public final boolean hasGpuModel() {
            return this._builder.hasGpuModel();
        }

        public final boolean hasIos() {
            return this._builder.hasIos();
        }

        public final boolean hasMadeWithUnity() {
            return this._builder.hasMadeWithUnity();
        }

        public final boolean hasOsVersion() {
            return this._builder.hasOsVersion();
        }

        public final boolean hasRooted() {
            return this._builder.hasRooted();
        }

        public final boolean hasScreenDensity() {
            return this._builder.hasScreenDensity();
        }

        public final boolean hasScreenHeight() {
            return this._builder.hasScreenHeight();
        }

        public final boolean hasScreenSize() {
            return this._builder.hasScreenSize();
        }

        public final boolean hasScreenWidth() {
            return this._builder.hasScreenWidth();
        }

        public final boolean hasTotalDiskSpace() {
            return this._builder.hasTotalDiskSpace();
        }

        public final boolean hasTotalRamMemory() {
            return this._builder.hasTotalRamMemory();
        }

        public final boolean hasWebviewUa() {
            return this._builder.hasWebviewUa();
        }

        public final /* synthetic */ void plusAssignAllStores(DslList<String, StoresProxy> dslList, Iterable<String> values) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(values, "values");
            addAllStores(dslList, values);
        }

        public final /* synthetic */ void plusAssignStores(DslList<String, StoresProxy> dslList, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            addStores(dslList, value);
        }

        public final void setAndroid(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setAndroid(value);
        }

        public final void setAppDebuggable(boolean z10) {
            this._builder.setAppDebuggable(z10);
        }

        public final void setBundleId(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setBundleId(value);
        }

        public final void setBundleVersion(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setBundleVersion(value);
        }

        public final void setCpuCount(long j10) {
            this._builder.setCpuCount(j10);
        }

        public final void setCpuModel(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setCpuModel(value);
        }

        public final void setDeviceMake(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setDeviceMake(value);
        }

        public final void setDeviceModel(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setDeviceModel(value);
        }

        public final void setGpuModel(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setGpuModel(value);
        }

        public final void setIos(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setIos(value);
        }

        public final void setMadeWithUnity(boolean z10) {
            this._builder.setMadeWithUnity(z10);
        }

        public final void setOsVersion(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setOsVersion(value);
        }

        public final void setRooted(boolean z10) {
            this._builder.setRooted(z10);
        }

        public final void setScreenDensity(int i10) {
            this._builder.setScreenDensity(i10);
        }

        public final void setScreenHeight(int i10) {
            this._builder.setScreenHeight(i10);
        }

        public final void setScreenSize(int i10) {
            this._builder.setScreenSize(i10);
        }

        public final void setScreenWidth(int i10) {
            this._builder.setScreenWidth(i10);
        }

        public final /* synthetic */ void setStores(DslList dslList, int i10, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setStores(i10, value);
        }

        public final void setTotalDiskSpace(long j10) {
            this._builder.setTotalDiskSpace(j10);
        }

        public final void setTotalRamMemory(long j10) {
            this._builder.setTotalRamMemory(j10);
        }

        public final void setWebviewUa(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setWebviewUa(value);
        }

        private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
            this._builder = builder;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class IosKt {
        public static final IosKt INSTANCE = new IosKt();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder _builder;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder) {
                    kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class SkadnetworkIdProxy extends DslProxy {
                private SkadnetworkIdProxy() {
                }
            }

            public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder, kotlin.jvm.internal.u uVar) {
                this(builder);
            }

            public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios _build() {
                StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios iosBuild = this._builder.build();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(iosBuild, "_builder.build()");
                return iosBuild;
            }

            public final /* synthetic */ void addAllSkadnetworkId(DslList dslList, Iterable values) {
                kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
                kotlin.jvm.internal.e0.checkNotNullParameter(values, "values");
                this._builder.addAllSkadnetworkId(values);
            }

            public final /* synthetic */ void addSkadnetworkId(DslList dslList, String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.addSkadnetworkId(value);
            }

            public final void clearBuiltSdkVersion() {
                this._builder.clearBuiltSdkVersion();
            }

            public final void clearBundleVersionFull() {
                this._builder.clearBundleVersionFull();
            }

            public final void clearCanMakePayments() {
                this._builder.clearCanMakePayments();
            }

            public final void clearScreenScale() {
                this._builder.clearScreenScale();
            }

            public final void clearSimulator() {
                this._builder.clearSimulator();
            }

            public final /* synthetic */ void clearSkadnetworkId(DslList dslList) {
                kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
                this._builder.clearSkadnetworkId();
            }

            public final void clearSystemBootTime() {
                this._builder.clearSystemBootTime();
            }

            public final void clearXcodeBuildVersion() {
                this._builder.clearXcodeBuildVersion();
            }

            public final void clearXcodeSdkBuildVersion() {
                this._builder.clearXcodeSdkBuildVersion();
            }

            public final void clearXcodeVersion() {
                this._builder.clearXcodeVersion();
            }

            public final String getBuiltSdkVersion() {
                String builtSdkVersion = this._builder.getBuiltSdkVersion();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(builtSdkVersion, "_builder.getBuiltSdkVersion()");
                return builtSdkVersion;
            }

            public final String getBundleVersionFull() {
                String bundleVersionFull = this._builder.getBundleVersionFull();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(bundleVersionFull, "_builder.getBundleVersionFull()");
                return bundleVersionFull;
            }

            public final boolean getCanMakePayments() {
                return this._builder.getCanMakePayments();
            }

            public final int getScreenScale() {
                return this._builder.getScreenScale();
            }

            public final boolean getSimulator() {
                return this._builder.getSimulator();
            }

            public final DslList<String, SkadnetworkIdProxy> getSkadnetworkId() {
                List<String> skadnetworkIdList = this._builder.getSkadnetworkIdList();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(skadnetworkIdList, "_builder.getSkadnetworkIdList()");
                return new DslList<>(skadnetworkIdList);
            }

            public final long getSystemBootTime() {
                return this._builder.getSystemBootTime();
            }

            public final String getXcodeBuildVersion() {
                String xcodeBuildVersion = this._builder.getXcodeBuildVersion();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(xcodeBuildVersion, "_builder.getXcodeBuildVersion()");
                return xcodeBuildVersion;
            }

            public final String getXcodeSdkBuildVersion() {
                String xcodeSdkBuildVersion = this._builder.getXcodeSdkBuildVersion();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(xcodeSdkBuildVersion, "_builder.getXcodeSdkBuildVersion()");
                return xcodeSdkBuildVersion;
            }

            public final String getXcodeVersion() {
                String xcodeVersion = this._builder.getXcodeVersion();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(xcodeVersion, "_builder.getXcodeVersion()");
                return xcodeVersion;
            }

            public final boolean hasBuiltSdkVersion() {
                return this._builder.hasBuiltSdkVersion();
            }

            public final boolean hasBundleVersionFull() {
                return this._builder.hasBundleVersionFull();
            }

            public final boolean hasCanMakePayments() {
                return this._builder.hasCanMakePayments();
            }

            public final boolean hasScreenScale() {
                return this._builder.hasScreenScale();
            }

            public final boolean hasSimulator() {
                return this._builder.hasSimulator();
            }

            public final boolean hasSystemBootTime() {
                return this._builder.hasSystemBootTime();
            }

            public final boolean hasXcodeBuildVersion() {
                return this._builder.hasXcodeBuildVersion();
            }

            public final boolean hasXcodeSdkBuildVersion() {
                return this._builder.hasXcodeSdkBuildVersion();
            }

            public final boolean hasXcodeVersion() {
                return this._builder.hasXcodeVersion();
            }

            public final /* synthetic */ void plusAssignAllSkadnetworkId(DslList<String, SkadnetworkIdProxy> dslList, Iterable<String> values) {
                kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
                kotlin.jvm.internal.e0.checkNotNullParameter(values, "values");
                addAllSkadnetworkId(dslList, values);
            }

            public final /* synthetic */ void plusAssignSkadnetworkId(DslList<String, SkadnetworkIdProxy> dslList, String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                addSkadnetworkId(dslList, value);
            }

            public final void setBuiltSdkVersion(String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setBuiltSdkVersion(value);
            }

            public final void setBundleVersionFull(String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setBundleVersionFull(value);
            }

            public final void setCanMakePayments(boolean z10) {
                this._builder.setCanMakePayments(z10);
            }

            public final void setScreenScale(int i10) {
                this._builder.setScreenScale(i10);
            }

            public final void setSimulator(boolean z10) {
                this._builder.setSimulator(z10);
            }

            public final /* synthetic */ void setSkadnetworkId(DslList dslList, int i10, String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setSkadnetworkId(i10, value);
            }

            public final void setSystemBootTime(long j10) {
                this._builder.setSystemBootTime(j10);
            }

            public final void setXcodeBuildVersion(String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setXcodeBuildVersion(value);
            }

            public final void setXcodeSdkBuildVersion(String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setXcodeSdkBuildVersion(value);
            }

            public final void setXcodeVersion(String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setXcodeVersion(value);
            }

            private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder) {
                this._builder = builder;
            }
        }

        private IosKt() {
        }
    }

    private StaticDeviceInfoKt() {
    }

    /* renamed from: -initializeandroid, reason: not valid java name */
    public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android m4103initializeandroid(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        AndroidKt.Dsl.Companion companion = AndroidKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builderNewBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        AndroidKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeios, reason: not valid java name */
    public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios m4104initializeios(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        IosKt.Dsl.Companion companion = IosKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builderNewBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        IosKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
