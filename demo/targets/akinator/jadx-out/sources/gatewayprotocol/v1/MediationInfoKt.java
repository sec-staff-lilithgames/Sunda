package gatewayprotocol.v1;

import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class MediationInfoKt {
    public static final MediationInfoKt INSTANCE = new MediationInfoKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MediationInfoOuterClass.MediationInfo.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(MediationInfoOuterClass.MediationInfo.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(MediationInfoOuterClass.MediationInfo.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ MediationInfoOuterClass.MediationInfo _build() {
            MediationInfoOuterClass.MediationInfo mediationInfoBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(mediationInfoBuild, "_builder.build()");
            return mediationInfoBuild;
        }

        public final void clearAdapterVersion() {
            this._builder.clearAdapterVersion();
        }

        public final void clearCustomName() {
            this._builder.clearCustomName();
        }

        public final void clearProvider() {
            this._builder.clearProvider();
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final String getAdapterVersion() {
            String adapterVersion = this._builder.getAdapterVersion();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(adapterVersion, "_builder.getAdapterVersion()");
            return adapterVersion;
        }

        public final String getCustomName() {
            String customName = this._builder.getCustomName();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(customName, "_builder.getCustomName()");
            return customName;
        }

        public final ClientInfoOuterClass.MediationProvider getProvider() {
            ClientInfoOuterClass.MediationProvider provider = this._builder.getProvider();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(provider, "_builder.getProvider()");
            return provider;
        }

        public final int getProviderValue() {
            return this._builder.getProviderValue();
        }

        public final String getVersion() {
            String version = this._builder.getVersion();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(version, "_builder.getVersion()");
            return version;
        }

        public final boolean hasAdapterVersion() {
            return this._builder.hasAdapterVersion();
        }

        public final boolean hasCustomName() {
            return this._builder.hasCustomName();
        }

        public final boolean hasVersion() {
            return this._builder.hasVersion();
        }

        public final void setAdapterVersion(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setAdapterVersion(value);
        }

        public final void setCustomName(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setCustomName(value);
        }

        public final void setProvider(ClientInfoOuterClass.MediationProvider value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setProvider(value);
        }

        public final void setProviderValue(int i10) {
            this._builder.setProviderValue(i10);
        }

        public final void setVersion(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setVersion(value);
        }

        private Dsl(MediationInfoOuterClass.MediationInfo.Builder builder) {
            this._builder = builder;
        }
    }

    private MediationInfoKt() {
    }
}
