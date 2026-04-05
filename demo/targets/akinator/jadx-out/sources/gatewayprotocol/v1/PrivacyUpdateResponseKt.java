package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class PrivacyUpdateResponseKt {
    public static final PrivacyUpdateResponseKt INSTANCE = new PrivacyUpdateResponseKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse _build() {
            PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponseBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(privacyUpdateResponseBuild, "_builder.build()");
            return privacyUpdateResponseBuild;
        }

        public final void clearContent() {
            this._builder.clearContent();
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final ByteString getContent() {
            ByteString content = this._builder.getContent();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(content, "_builder.getContent()");
            return content;
        }

        public final int getVersion() {
            return this._builder.getVersion();
        }

        public final void setContent(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setContent(value);
        }

        public final void setVersion(int i10) {
            this._builder.setVersion(i10);
        }

        private Dsl(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder) {
            this._builder = builder;
        }
    }

    private PrivacyUpdateResponseKt() {
    }
}
