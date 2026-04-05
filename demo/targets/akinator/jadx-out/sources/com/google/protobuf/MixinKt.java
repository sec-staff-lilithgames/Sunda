package com.google.protobuf;

import com.google.protobuf.Mixin;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class MixinKt {
    public static final MixinKt INSTANCE = new MixinKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Mixin.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Mixin.Builder builder) {
                e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Mixin.Builder builder, u uVar) {
            this(builder);
        }

        public final /* synthetic */ Mixin _build() {
            Mixin mixinBuild = this._builder.build();
            e0.checkNotNullExpressionValue(mixinBuild, "_builder.build()");
            return mixinBuild;
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearRoot() {
            this._builder.clearRoot();
        }

        public final String getName() {
            String name = this._builder.getName();
            e0.checkNotNullExpressionValue(name, "_builder.getName()");
            return name;
        }

        public final String getRoot() {
            String root = this._builder.getRoot();
            e0.checkNotNullExpressionValue(root, "_builder.getRoot()");
            return root;
        }

        public final void setName(String value) {
            e0.checkNotNullParameter(value, "value");
            this._builder.setName(value);
        }

        public final void setRoot(String value) {
            e0.checkNotNullParameter(value, "value");
            this._builder.setRoot(value);
        }

        private Dsl(Mixin.Builder builder) {
            this._builder = builder;
        }
    }

    private MixinKt() {
    }
}
