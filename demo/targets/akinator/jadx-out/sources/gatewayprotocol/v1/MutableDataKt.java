package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class MutableDataKt {
    public static final MutableDataKt INSTANCE = new MutableDataKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MutableDataOuterClass.MutableData.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(MutableDataOuterClass.MutableData.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(MutableDataOuterClass.MutableData.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ MutableDataOuterClass.MutableData _build() {
            MutableDataOuterClass.MutableData mutableDataBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(mutableDataBuild, "_builder.build()");
            return mutableDataBuild;
        }

        public final void clearAllowedPii() {
            this._builder.clearAllowedPii();
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final void clearCurrentState() {
            this._builder.clearCurrentState();
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final void clearPrivacyFsm() {
            this._builder.clearPrivacyFsm();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearSessionToken() {
            this._builder.clearSessionToken();
        }

        public final AllowedPiiOuterClass.AllowedPii getAllowedPii() {
            AllowedPiiOuterClass.AllowedPii allowedPii = this._builder.getAllowedPii();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(allowedPii, "_builder.getAllowedPii()");
            return allowedPii;
        }

        public final AllowedPiiOuterClass.AllowedPii getAllowedPiiOrNull(Dsl dsl) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dsl, "<this>");
            return MutableDataKtKt.getAllowedPiiOrNull(dsl._builder);
        }

        public final ByteString getCache() {
            ByteString cache = this._builder.getCache();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(cache, "_builder.getCache()");
            return cache;
        }

        public final ByteString getCurrentState() {
            ByteString currentState = this._builder.getCurrentState();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(currentState, "_builder.getCurrentState()");
            return currentState;
        }

        public final ByteString getPrivacy() {
            ByteString privacy = this._builder.getPrivacy();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(privacy, "_builder.getPrivacy()");
            return privacy;
        }

        public final ByteString getPrivacyFsm() {
            ByteString privacyFsm = this._builder.getPrivacyFsm();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(privacyFsm, "_builder.getPrivacyFsm()");
            return privacyFsm;
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(Dsl dsl) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dsl, "<this>");
            return MutableDataKtKt.getSessionCountersOrNull(dsl._builder);
        }

        public final ByteString getSessionToken() {
            ByteString sessionToken = this._builder.getSessionToken();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(sessionToken, "_builder.getSessionToken()");
            return sessionToken;
        }

        public final boolean hasAllowedPii() {
            return this._builder.hasAllowedPii();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final boolean hasCurrentState() {
            return this._builder.hasCurrentState();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final boolean hasPrivacyFsm() {
            return this._builder.hasPrivacyFsm();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasSessionToken() {
            return this._builder.hasSessionToken();
        }

        public final void setAllowedPii(AllowedPiiOuterClass.AllowedPii value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setAllowedPii(value);
        }

        public final void setCache(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setCache(value);
        }

        public final void setCurrentState(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setCurrentState(value);
        }

        public final void setPrivacy(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setPrivacy(value);
        }

        public final void setPrivacyFsm(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setPrivacyFsm(value);
        }

        public final void setSessionCounters(SessionCountersOuterClass.SessionCounters value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setSessionCounters(value);
        }

        public final void setSessionToken(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setSessionToken(value);
        }

        private Dsl(MutableDataOuterClass.MutableData.Builder builder) {
            this._builder = builder;
        }
    }

    private MutableDataKt() {
    }
}
