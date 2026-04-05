package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.AudienceManagementResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AudienceManagementResponseKt {
    public static final AudienceManagementResponseKt INSTANCE = new AudienceManagementResponseKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ AudienceManagementResponseOuterClass.AudienceManagementResponse _build() {
            AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponseBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(audienceManagementResponseBuild, "_builder.build()");
            return audienceManagementResponseBuild;
        }

        public final void clearAudienceManagementData() {
            this._builder.clearAudienceManagementData();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final ByteString getAudienceManagementData() {
            ByteString audienceManagementData = this._builder.getAudienceManagementData();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(audienceManagementData, "_builder.getAudienceManagementData()");
            return audienceManagementData;
        }

        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(error, "_builder.getError()");
            return error;
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dsl, "<this>");
            return AudienceManagementResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final void setAudienceManagementData(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setAudienceManagementData(value);
        }

        public final void setError(ErrorOuterClass.Error value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setError(value);
        }

        private Dsl(AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder) {
            this._builder = builder;
        }
    }

    private AudienceManagementResponseKt() {
    }
}
