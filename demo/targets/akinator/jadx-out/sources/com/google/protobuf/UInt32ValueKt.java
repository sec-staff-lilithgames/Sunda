package com.google.protobuf;

import com.google.protobuf.UInt32Value;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class UInt32ValueKt {
    public static final UInt32ValueKt INSTANCE = new UInt32ValueKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UInt32Value.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UInt32Value.Builder builder) {
                e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(UInt32Value.Builder builder, u uVar) {
            this(builder);
        }

        public final /* synthetic */ UInt32Value _build() {
            UInt32Value uInt32ValueBuild = this._builder.build();
            e0.checkNotNullExpressionValue(uInt32ValueBuild, "_builder.build()");
            return uInt32ValueBuild;
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

        private Dsl(UInt32Value.Builder builder) {
            this._builder = builder;
        }
    }

    private UInt32ValueKt() {
    }
}
