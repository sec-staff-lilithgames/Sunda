package com.google.protobuf;

import com.google.protobuf.Int64Value;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Int64ValueKt {
    public static final Int64ValueKt INSTANCE = new Int64ValueKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Int64Value.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Int64Value.Builder builder) {
                e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Int64Value.Builder builder, u uVar) {
            this(builder);
        }

        public final /* synthetic */ Int64Value _build() {
            Int64Value int64ValueBuild = this._builder.build();
            e0.checkNotNullExpressionValue(int64ValueBuild, "_builder.build()");
            return int64ValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final long getValue() {
            return this._builder.getValue();
        }

        public final void setValue(long j10) {
            this._builder.setValue(j10);
        }

        private Dsl(Int64Value.Builder builder) {
            this._builder = builder;
        }
    }

    private Int64ValueKt() {
    }
}
