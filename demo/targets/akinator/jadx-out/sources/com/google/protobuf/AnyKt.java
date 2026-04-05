package com.google.protobuf;

import com.google.protobuf.Any;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class AnyKt {
    public static final AnyKt INSTANCE = new AnyKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Any.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Any.Builder builder) {
                e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Any.Builder builder, u uVar) {
            this(builder);
        }

        public final /* synthetic */ Any _build() {
            Any anyBuild = this._builder.build();
            e0.checkNotNullExpressionValue(anyBuild, "_builder.build()");
            return anyBuild;
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getTypeUrl() {
            String typeUrl = this._builder.getTypeUrl();
            e0.checkNotNullExpressionValue(typeUrl, "_builder.getTypeUrl()");
            return typeUrl;
        }

        public final ByteString getValue() {
            ByteString value = this._builder.getValue();
            e0.checkNotNullExpressionValue(value, "_builder.getValue()");
            return value;
        }

        public final void setTypeUrl(String value) {
            e0.checkNotNullParameter(value, "value");
            this._builder.setTypeUrl(value);
        }

        public final void setValue(ByteString value) {
            e0.checkNotNullParameter(value, "value");
            this._builder.setValue(value);
        }

        private Dsl(Any.Builder builder) {
            this._builder = builder;
        }
    }

    private AnyKt() {
    }
}
