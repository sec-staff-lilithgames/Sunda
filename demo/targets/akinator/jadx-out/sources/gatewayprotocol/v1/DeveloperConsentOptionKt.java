package gatewayprotocol.v1;

import gatewayprotocol.v1.DeveloperConsentOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class DeveloperConsentOptionKt {
    public static final DeveloperConsentOptionKt INSTANCE = new DeveloperConsentOptionKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DeveloperConsentOuterClass.DeveloperConsentOption.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ DeveloperConsentOuterClass.DeveloperConsentOption _build() {
            DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOptionBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(developerConsentOptionBuild, "_builder.build()");
            return developerConsentOptionBuild;
        }

        public final void clearCustomType() {
            this._builder.clearCustomType();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getCustomType() {
            String customType = this._builder.getCustomType();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(customType, "_builder.getCustomType()");
            return customType;
        }

        public final DeveloperConsentOuterClass.DeveloperConsentType getType() {
            DeveloperConsentOuterClass.DeveloperConsentType type = this._builder.getType();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(type, "_builder.getType()");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final DeveloperConsentOuterClass.DeveloperConsentChoice getValue() {
            DeveloperConsentOuterClass.DeveloperConsentChoice value = this._builder.getValue();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(value, "_builder.getValue()");
            return value;
        }

        public final int getValueValue() {
            return this._builder.getValueValue();
        }

        public final boolean hasCustomType() {
            return this._builder.hasCustomType();
        }

        public final void setCustomType(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setCustomType(value);
        }

        public final void setType(DeveloperConsentOuterClass.DeveloperConsentType value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setType(value);
        }

        public final void setTypeValue(int i10) {
            this._builder.setTypeValue(i10);
        }

        public final void setValue(DeveloperConsentOuterClass.DeveloperConsentChoice value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setValue(value);
        }

        public final void setValueValue(int i10) {
            this._builder.setValueValue(i10);
        }

        private Dsl(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder) {
            this._builder = builder;
        }
    }

    private DeveloperConsentOptionKt() {
    }
}
