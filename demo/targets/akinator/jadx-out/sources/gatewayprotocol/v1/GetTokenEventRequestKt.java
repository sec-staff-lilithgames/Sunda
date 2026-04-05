package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class GetTokenEventRequestKt {
    public static final GetTokenEventRequestKt INSTANCE = new GetTokenEventRequestKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ GetTokenEventRequestOuterClass.GetTokenEventRequest _build() {
            GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequestBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(getTokenEventRequestBuild, "_builder.build()");
            return getTokenEventRequestBuild;
        }

        public final void clearBanner() {
            this._builder.clearBanner();
        }

        public final void clearInterstitial() {
            this._builder.clearInterstitial();
        }

        public final void clearRewarded() {
            this._builder.clearRewarded();
        }

        public final void clearTokenId() {
            this._builder.clearTokenId();
        }

        public final ByteString getBanner() {
            ByteString banner = this._builder.getBanner();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(banner, "_builder.getBanner()");
            return banner;
        }

        public final ByteString getInterstitial() {
            ByteString interstitial = this._builder.getInterstitial();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(interstitial, "_builder.getInterstitial()");
            return interstitial;
        }

        public final ByteString getRewarded() {
            ByteString rewarded = this._builder.getRewarded();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(rewarded, "_builder.getRewarded()");
            return rewarded;
        }

        public final ByteString getTokenId() {
            ByteString tokenId = this._builder.getTokenId();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(tokenId, "_builder.getTokenId()");
            return tokenId;
        }

        public final boolean hasBanner() {
            return this._builder.hasBanner();
        }

        public final boolean hasInterstitial() {
            return this._builder.hasInterstitial();
        }

        public final boolean hasRewarded() {
            return this._builder.hasRewarded();
        }

        public final void setBanner(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setBanner(value);
        }

        public final void setInterstitial(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setInterstitial(value);
        }

        public final void setRewarded(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setRewarded(value);
        }

        public final void setTokenId(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setTokenId(value);
        }

        private Dsl(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private GetTokenEventRequestKt() {
    }
}
