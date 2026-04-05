package gatewayprotocol.v1;

import com.moloco.sdk.BKC.JzVV;
import gatewayprotocol.v1.ErrorOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ErrorKt {
    public static final ErrorKt INSTANCE = new ErrorKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ErrorOuterClass.Error.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(ErrorOuterClass.Error.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(ErrorOuterClass.Error.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final void clearErrorText() {
            this._builder.clearErrorText();
        }

        public final String getErrorText() {
            String errorText = this._builder.getErrorText();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(errorText, "_builder.getErrorText()");
            return errorText;
        }

        public final void setErrorText(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setErrorText(value);
        }

        private Dsl(ErrorOuterClass.Error.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ ErrorOuterClass.Error _build() {
            ErrorOuterClass.Error errorBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(errorBuild, JzVV.udDrRPSVZ);
            return errorBuild;
        }
    }

    private ErrorKt() {
    }
}
