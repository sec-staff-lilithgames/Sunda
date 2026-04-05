package com.google.protobuf;

import com.google.protobuf.BytesValue;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class BytesValueKt {
    public static final BytesValueKt INSTANCE = new BytesValueKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final BytesValue.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(BytesValue.Builder builder) {
                e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(BytesValue.Builder builder, u uVar) {
            this(builder);
        }

        public final /* synthetic */ BytesValue _build() {
            BytesValue bytesValueBuild = this._builder.build();
            e0.checkNotNullExpressionValue(bytesValueBuild, "_builder.build()");
            return bytesValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final ByteString getValue() {
            ByteString value = this._builder.getValue();
            e0.checkNotNullExpressionValue(value, "_builder.getValue()");
            return value;
        }

        public final void setValue(ByteString value) {
            e0.checkNotNullParameter(value, "value");
            this._builder.setValue(value);
        }

        private Dsl(BytesValue.Builder builder) {
            this._builder = builder;
        }
    }

    private BytesValueKt() {
    }
}
