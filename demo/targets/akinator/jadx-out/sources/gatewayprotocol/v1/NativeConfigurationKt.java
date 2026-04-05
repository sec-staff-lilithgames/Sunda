package gatewayprotocol.v1;

import be.nVUQ.UupKET;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class NativeConfigurationKt {
    public static final NativeConfigurationKt INSTANCE = new NativeConfigurationKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.NativeConfiguration.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class AdditionalStorePackagesProxy extends DslProxy {
            private AdditionalStorePackagesProxy() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ObservableAndroidActivitiesProxy extends DslProxy {
            private ObservableAndroidActivitiesProxy() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.NativeConfiguration _build() {
            NativeConfigurationOuterClass.NativeConfiguration nativeConfigurationBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(nativeConfigurationBuild, "_builder.build()");
            return nativeConfigurationBuild;
        }

        public final /* synthetic */ void addAdditionalStorePackages(DslList dslList, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.addAdditionalStorePackages(value);
        }

        public final /* synthetic */ void addAllObservableAndroidActivities(DslList dslList, Iterable values) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(values, "values");
            this._builder.addAllObservableAndroidActivities(values);
        }

        public final /* synthetic */ void addObservableAndroidActivities(DslList dslList, ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.addObservableAndroidActivities(value);
        }

        public final void clearAdOperations() {
            this._builder.clearAdOperations();
        }

        public final void clearAdPolicy() {
            this._builder.clearAdPolicy();
        }

        public final /* synthetic */ void clearAdditionalStorePackages(DslList dslList) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            this._builder.clearAdditionalStorePackages();
        }

        public final void clearCachedAssetsConfiguration() {
            this._builder.clearCachedAssetsConfiguration();
        }

        public final void clearCachedWebviewFilesConfiguration() {
            this._builder.clearCachedWebviewFilesConfiguration();
        }

        public final void clearDebugSettings() {
            this._builder.clearDebugSettings();
        }

        public final void clearDefaultShowCompletionState() {
            this._builder.clearDefaultShowCompletionState();
        }

        public final void clearDiagnosticEvents() {
            this._builder.clearDiagnosticEvents();
        }

        public final void clearDownloadPolicy() {
            this._builder.clearDownloadPolicy();
        }

        public final void clearEnableIapEvent() {
            this._builder.clearEnableIapEvent();
        }

        public final void clearEnableOm() {
            this._builder.clearEnableOm();
        }

        public final void clearFeatureFlags() {
            this._builder.clearFeatureFlags();
        }

        public final void clearInitPolicy() {
            this._builder.clearInitPolicy();
        }

        public final /* synthetic */ void clearObservableAndroidActivities(DslList dslList) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            this._builder.clearObservableAndroidActivities();
        }

        public final void clearOperativeEventPolicy() {
            this._builder.clearOperativeEventPolicy();
        }

        public final void clearOtherPolicy() {
            this._builder.clearOtherPolicy();
        }

        public final NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperations() {
            NativeConfigurationOuterClass.AdOperationsConfiguration adOperations = this._builder.getAdOperations();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(adOperations, "_builder.getAdOperations()");
            return adOperations;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getAdPolicy() {
            NativeConfigurationOuterClass.RequestPolicy adPolicy = this._builder.getAdPolicy();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(adPolicy, "_builder.getAdPolicy()");
            return adPolicy;
        }

        public final DslList<String, AdditionalStorePackagesProxy> getAdditionalStorePackages() {
            List<String> additionalStorePackagesList = this._builder.getAdditionalStorePackagesList();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(additionalStorePackagesList, "_builder.getAdditionalStorePackagesList()");
            return new DslList<>(additionalStorePackagesList);
        }

        public final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedAssetsConfiguration() {
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = this._builder.getCachedAssetsConfiguration();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(cachedAssetsConfiguration, "_builder.getCachedAssetsConfiguration()");
            return cachedAssetsConfiguration;
        }

        public final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedWebviewFilesConfiguration() {
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = this._builder.getCachedWebviewFilesConfiguration();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(cachedWebviewFilesConfiguration, "_builder.getCachedWebviewFilesConfiguration()");
            return cachedWebviewFilesConfiguration;
        }

        public final NativeConfigurationOuterClass.DebugSettings getDebugSettings() {
            NativeConfigurationOuterClass.DebugSettings debugSettings = this._builder.getDebugSettings();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(debugSettings, "_builder.getDebugSettings()");
            return debugSettings;
        }

        public final NativeConfigurationOuterClass.ShowCompletionState getDefaultShowCompletionState() {
            NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = this._builder.getDefaultShowCompletionState();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(defaultShowCompletionState, "_builder.getDefaultShowCompletionState()");
            return defaultShowCompletionState;
        }

        public final int getDefaultShowCompletionStateValue() {
            return this._builder.getDefaultShowCompletionStateValue();
        }

        public final NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEvents() {
            NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEvents = this._builder.getDiagnosticEvents();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(diagnosticEvents, "_builder.getDiagnosticEvents()");
            return diagnosticEvents;
        }

        public final boolean getEnableIapEvent() {
            return this._builder.getEnableIapEvent();
        }

        public final boolean getEnableOm() {
            return this._builder.getEnableOm();
        }

        public final NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
            NativeConfigurationOuterClass.FeatureFlags featureFlags = this._builder.getFeatureFlags();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(featureFlags, "_builder.getFeatureFlags()");
            return featureFlags;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getInitPolicy() {
            NativeConfigurationOuterClass.RequestPolicy initPolicy = this._builder.getInitPolicy();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(initPolicy, "_builder.getInitPolicy()");
            return initPolicy;
        }

        public final /* synthetic */ DslList getObservableAndroidActivities() {
            List<ByteString> observableAndroidActivitiesList = this._builder.getObservableAndroidActivitiesList();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(observableAndroidActivitiesList, "_builder.getObservableAndroidActivitiesList()");
            return new DslList(observableAndroidActivitiesList);
        }

        public final NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicy() {
            NativeConfigurationOuterClass.RequestPolicy operativeEventPolicy = this._builder.getOperativeEventPolicy();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(operativeEventPolicy, "_builder.getOperativeEventPolicy()");
            return operativeEventPolicy;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getOtherPolicy() {
            NativeConfigurationOuterClass.RequestPolicy otherPolicy = this._builder.getOtherPolicy();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(otherPolicy, "_builder.getOtherPolicy()");
            return otherPolicy;
        }

        public final boolean hasAdOperations() {
            return this._builder.hasAdOperations();
        }

        public final boolean hasAdPolicy() {
            return this._builder.hasAdPolicy();
        }

        public final boolean hasCachedAssetsConfiguration() {
            return this._builder.hasCachedAssetsConfiguration();
        }

        public final boolean hasCachedWebviewFilesConfiguration() {
            return this._builder.hasCachedWebviewFilesConfiguration();
        }

        public final boolean hasDebugSettings() {
            return this._builder.hasDebugSettings();
        }

        public final boolean hasDiagnosticEvents() {
            return this._builder.hasDiagnosticEvents();
        }

        public final boolean hasDownloadPolicy() {
            return this._builder.hasDownloadPolicy();
        }

        public final boolean hasFeatureFlags() {
            return this._builder.hasFeatureFlags();
        }

        public final boolean hasInitPolicy() {
            return this._builder.hasInitPolicy();
        }

        public final boolean hasOperativeEventPolicy() {
            return this._builder.hasOperativeEventPolicy();
        }

        public final boolean hasOtherPolicy() {
            return this._builder.hasOtherPolicy();
        }

        public final /* synthetic */ void plusAssignAdditionalStorePackages(DslList<String, AdditionalStorePackagesProxy> dslList, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            addAdditionalStorePackages(dslList, value);
        }

        public final /* synthetic */ void plusAssignAllAdditionalStorePackages(DslList<String, AdditionalStorePackagesProxy> dslList, Iterable<String> values) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(values, "values");
            addAllAdditionalStorePackages(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllObservableAndroidActivities(DslList<ByteString, ObservableAndroidActivitiesProxy> dslList, Iterable<? extends ByteString> values) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(values, "values");
            addAllObservableAndroidActivities(dslList, values);
        }

        public final /* synthetic */ void plusAssignObservableAndroidActivities(DslList<ByteString, ObservableAndroidActivitiesProxy> dslList, ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            addObservableAndroidActivities(dslList, value);
        }

        public final void setAdOperations(NativeConfigurationOuterClass.AdOperationsConfiguration value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setAdOperations(value);
        }

        public final void setAdPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setAdPolicy(value);
        }

        public final /* synthetic */ void setAdditionalStorePackages(DslList dslList, int i10, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setAdditionalStorePackages(i10, value);
        }

        public final void setCachedAssetsConfiguration(NativeConfigurationOuterClass.CachedAssetsConfiguration value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setCachedAssetsConfiguration(value);
        }

        public final void setCachedWebviewFilesConfiguration(NativeConfigurationOuterClass.CachedAssetsConfiguration value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setCachedWebviewFilesConfiguration(value);
        }

        public final void setDebugSettings(NativeConfigurationOuterClass.DebugSettings value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setDebugSettings(value);
        }

        public final void setDefaultShowCompletionState(NativeConfigurationOuterClass.ShowCompletionState value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setDefaultShowCompletionState(value);
        }

        public final void setDefaultShowCompletionStateValue(int i10) {
            this._builder.setDefaultShowCompletionStateValue(i10);
        }

        public final void setDiagnosticEvents(NativeConfigurationOuterClass.DiagnosticEventsConfiguration value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setDiagnosticEvents(value);
        }

        public final void setDownloadPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setDownloadPolicy(value);
        }

        public final void setEnableIapEvent(boolean z10) {
            this._builder.setEnableIapEvent(z10);
        }

        public final void setEnableOm(boolean z10) {
            this._builder.setEnableOm(z10);
        }

        public final void setFeatureFlags(NativeConfigurationOuterClass.FeatureFlags value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setFeatureFlags(value);
        }

        public final void setInitPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setInitPolicy(value);
        }

        public final /* synthetic */ void setObservableAndroidActivities(DslList dslList, int i10, ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setObservableAndroidActivities(i10, value);
        }

        public final void setOperativeEventPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setOperativeEventPolicy(value);
        }

        public final void setOtherPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setOtherPolicy(value);
        }

        private Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ void addAllAdditionalStorePackages(DslList dslList, Iterable values) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, UupKET.tquqLovjkk);
            kotlin.jvm.internal.e0.checkNotNullParameter(values, "values");
            this._builder.addAllAdditionalStorePackages(values);
        }

        public final NativeConfigurationOuterClass.RequestPolicy getDownloadPolicy() {
            NativeConfigurationOuterClass.RequestPolicy downloadPolicy = this._builder.getDownloadPolicy();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(downloadPolicy, PtLatqAYjEFT.IJKsdF);
            return downloadPolicy;
        }
    }

    private NativeConfigurationKt() {
    }
}
