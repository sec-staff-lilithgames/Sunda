package com.google.protobuf;

import com.google.protobuf.DoubleValue;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DoubleValueKt {
    public static final DoubleValueKt INSTANCE = new DoubleValueKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DoubleValue.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DoubleValue.Builder builder) {
                e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DoubleValue.Builder builder, u uVar) {
            this(builder);
        }

        public final /* synthetic */ DoubleValue _build() {
            DoubleValue doubleValueBuild = this._builder.build();
            e0.checkNotNullExpressionValue(doubleValueBuild, "_builder.build()");
            return doubleValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final double getValue() {
            return this._builder.getValue();
        }

        public final void setValue(double d10) {
            this._builder.setValue(d10);
        }

        private Dsl(DoubleValue.Builder builder) {
            this._builder = builder;
        }
    }

    private DoubleValueKt() {
    }
}
