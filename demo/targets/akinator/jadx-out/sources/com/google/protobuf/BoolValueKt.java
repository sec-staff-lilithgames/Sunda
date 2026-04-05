package com.google.protobuf;

import com.google.protobuf.BoolValue;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class BoolValueKt {
    public static final BoolValueKt INSTANCE = new BoolValueKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final BoolValue.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(BoolValue.Builder builder) {
                e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(BoolValue.Builder builder, u uVar) {
            this(builder);
        }

        public final /* synthetic */ BoolValue _build() {
            BoolValue boolValueBuild = this._builder.build();
            e0.checkNotNullExpressionValue(boolValueBuild, "_builder.build()");
            return boolValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final boolean getValue() {
            return this._builder.getValue();
        }

        public final void setValue(boolean z10) {
            this._builder.setValue(z10);
        }

        private Dsl(BoolValue.Builder builder) {
            this._builder = builder;
        }
    }

    private BoolValueKt() {
    }
}
