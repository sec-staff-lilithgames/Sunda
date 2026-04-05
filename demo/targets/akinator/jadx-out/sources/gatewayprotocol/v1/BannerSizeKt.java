package gatewayprotocol.v1;

import gatewayprotocol.v1.AdRequestOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class BannerSizeKt {
    public static final BannerSizeKt INSTANCE = new BannerSizeKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AdRequestOuterClass.BannerSize.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdRequestOuterClass.BannerSize.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AdRequestOuterClass.BannerSize.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ AdRequestOuterClass.BannerSize _build() {
            AdRequestOuterClass.BannerSize bannerSizeBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bannerSizeBuild, "_builder.build()");
            return bannerSizeBuild;
        }

        public final void clearHeight() {
            this._builder.clearHeight();
        }

        public final void clearWidth() {
            this._builder.clearWidth();
        }

        public final int getHeight() {
            return this._builder.getHeight();
        }

        public final int getWidth() {
            return this._builder.getWidth();
        }

        public final void setHeight(int i10) {
            this._builder.setHeight(i10);
        }

        public final void setWidth(int i10) {
            this._builder.setWidth(i10);
        }

        private Dsl(AdRequestOuterClass.BannerSize.Builder builder) {
            this._builder = builder;
        }
    }

    private BannerSizeKt() {
    }
}
