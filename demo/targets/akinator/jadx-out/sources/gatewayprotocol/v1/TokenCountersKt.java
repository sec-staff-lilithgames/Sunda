package gatewayprotocol.v1;

import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class TokenCountersKt {
    public static final TokenCountersKt INSTANCE = new TokenCountersKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final HeaderBiddingTokenOuterClass.TokenCounters.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(HeaderBiddingTokenOuterClass.TokenCounters.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(HeaderBiddingTokenOuterClass.TokenCounters.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ HeaderBiddingTokenOuterClass.TokenCounters _build() {
            HeaderBiddingTokenOuterClass.TokenCounters tokenCountersBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(tokenCountersBuild, "_builder.build()");
            return tokenCountersBuild;
        }

        public final void clearSeq() {
            this._builder.clearSeq();
        }

        public final void clearStarts() {
            this._builder.clearStarts();
        }

        public final void clearWins() {
            this._builder.clearWins();
        }

        public final int getSeq() {
            return this._builder.getSeq();
        }

        public final int getStarts() {
            return this._builder.getStarts();
        }

        public final int getWins() {
            return this._builder.getWins();
        }

        public final void setSeq(int i10) {
            this._builder.setSeq(i10);
        }

        public final void setStarts(int i10) {
            this._builder.setStarts(i10);
        }

        public final void setWins(int i10) {
            this._builder.setWins(i10);
        }

        private Dsl(HeaderBiddingTokenOuterClass.TokenCounters.Builder builder) {
            this._builder = builder;
        }
    }

    private TokenCountersKt() {
    }
}
