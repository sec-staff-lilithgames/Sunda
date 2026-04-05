package com.google.protobuf;

import com.google.protobuf.Int32Value;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Int32ValueKt {
    public static final Int32ValueKt INSTANCE = new Int32ValueKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Int32Value.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Int32Value.Builder builder) {
                e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Int32Value.Builder builder, u uVar) {
            this(builder);
        }

        public final /* synthetic */ Int32Value _build() {
            Int32Value int32ValueBuild = this._builder.build();
            e0.checkNotNullExpressionValue(int32ValueBuild, "_builder.build()");
            return int32ValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final int getValue() {
            return this._builder.getValue();
        }

        public final void setValue(int i10) {
            this._builder.setValue(i10);
        }

        private Dsl(Int32Value.Builder builder) {
            this._builder = builder;
        }
    }

    private Int32ValueKt() {
    }
}
