package gatewayprotocol.v1;

import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class FeatureFlagsKt {
    public static final FeatureFlagsKt INSTANCE = new FeatureFlagsKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.FeatureFlags.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.FeatureFlags.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.FeatureFlags.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.FeatureFlags _build() {
            NativeConfigurationOuterClass.FeatureFlags featureFlagsBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(featureFlagsBuild, "_builder.build()");
            return featureFlagsBuild;
        }

        public final void clearAppSheetBugCheckEnabled() {
            this._builder.clearAppSheetBugCheckEnabled();
        }

        public final void clearBoldSdkNextSessionEnabled() {
            this._builder.clearBoldSdkNextSessionEnabled();
        }

        public final void clearOpenglGpuEnabled() {
            this._builder.clearOpenglGpuEnabled();
        }

        public final void clearOpportunityIdPlacementValidation() {
            this._builder.clearOpportunityIdPlacementValidation();
        }

        public final void clearRecoverTerminatedWebviews() {
            this._builder.clearRecoverTerminatedWebviews();
        }

        public final void clearShouldHandleWebviewCaching() {
            this._builder.clearShouldHandleWebviewCaching();
        }

        public final void clearShouldSendIapHistory() {
            this._builder.clearShouldSendIapHistory();
        }

        public final boolean getAppSheetBugCheckEnabled() {
            return this._builder.getAppSheetBugCheckEnabled();
        }

        public final boolean getBoldSdkNextSessionEnabled() {
            return this._builder.getBoldSdkNextSessionEnabled();
        }

        public final boolean getOpenglGpuEnabled() {
            return this._builder.getOpenglGpuEnabled();
        }

        public final boolean getOpportunityIdPlacementValidation() {
            return this._builder.getOpportunityIdPlacementValidation();
        }

        public final boolean getRecoverTerminatedWebviews() {
            return this._builder.getRecoverTerminatedWebviews();
        }

        public final boolean getShouldHandleWebviewCaching() {
            return this._builder.getShouldHandleWebviewCaching();
        }

        public final boolean getShouldSendIapHistory() {
            return this._builder.getShouldSendIapHistory();
        }

        public final void setAppSheetBugCheckEnabled(boolean z10) {
            this._builder.setAppSheetBugCheckEnabled(z10);
        }

        public final void setBoldSdkNextSessionEnabled(boolean z10) {
            this._builder.setBoldSdkNextSessionEnabled(z10);
        }

        public final void setOpenglGpuEnabled(boolean z10) {
            this._builder.setOpenglGpuEnabled(z10);
        }

        public final void setOpportunityIdPlacementValidation(boolean z10) {
            this._builder.setOpportunityIdPlacementValidation(z10);
        }

        public final void setRecoverTerminatedWebviews(boolean z10) {
            this._builder.setRecoverTerminatedWebviews(z10);
        }

        public final void setShouldHandleWebviewCaching(boolean z10) {
            this._builder.setShouldHandleWebviewCaching(z10);
        }

        public final void setShouldSendIapHistory(boolean z10) {
            this._builder.setShouldSendIapHistory(z10);
        }

        private Dsl(NativeConfigurationOuterClass.FeatureFlags.Builder builder) {
            this._builder = builder;
        }
    }

    private FeatureFlagsKt() {
    }
}
