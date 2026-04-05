package gatewayprotocol.v1;

import gatewayprotocol.v1.NativeConfigurationOuterClass;
import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class RequestPolicyKt {
    public static final RequestPolicyKt INSTANCE = new RequestPolicyKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.RequestPolicy.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.RequestPolicy.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.RequestPolicy.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.RequestPolicy _build() {
            NativeConfigurationOuterClass.RequestPolicy requestPolicyBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(requestPolicyBuild, "_builder.build()");
            return requestPolicyBuild;
        }

        public final void clearRetryPolicy() {
            this._builder.clearRetryPolicy();
        }

        public final void clearTimeoutPolicy() {
            this._builder.clearTimeoutPolicy();
        }

        public final NativeConfigurationOuterClass.RequestRetryPolicy getRetryPolicy() {
            NativeConfigurationOuterClass.RequestRetryPolicy retryPolicy = this._builder.getRetryPolicy();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(retryPolicy, "_builder.getRetryPolicy()");
            return retryPolicy;
        }

        public final boolean hasRetryPolicy() {
            return this._builder.hasRetryPolicy();
        }

        public final boolean hasTimeoutPolicy() {
            return this._builder.hasTimeoutPolicy();
        }

        public final void setRetryPolicy(NativeConfigurationOuterClass.RequestRetryPolicy value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setRetryPolicy(value);
        }

        public final void setTimeoutPolicy(NativeConfigurationOuterClass.RequestTimeoutPolicy value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setTimeoutPolicy(value);
        }

        private Dsl(NativeConfigurationOuterClass.RequestPolicy.Builder builder) {
            this._builder = builder;
        }

        public final NativeConfigurationOuterClass.RequestTimeoutPolicy getTimeoutPolicy() {
            NativeConfigurationOuterClass.RequestTimeoutPolicy timeoutPolicy = this._builder.getTimeoutPolicy();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(timeoutPolicy, uQjDr.LbKlsjhmodTKjYU);
            return timeoutPolicy;
        }
    }

    private RequestPolicyKt() {
    }
}
