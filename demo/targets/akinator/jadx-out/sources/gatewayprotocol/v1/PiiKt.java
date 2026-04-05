package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.PiiOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class PiiKt {
    public static final PiiKt INSTANCE = new PiiKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final PiiOuterClass.Pii.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(PiiOuterClass.Pii.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(PiiOuterClass.Pii.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ PiiOuterClass.Pii _build() {
            PiiOuterClass.Pii piiBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(piiBuild, "_builder.build()");
            return piiBuild;
        }

        public final void clearAdvertisingId() {
            this._builder.clearAdvertisingId();
        }

        public final void clearAppsetId() {
            this._builder.clearAppsetId();
        }

        public final void clearFid() {
            this._builder.clearFid();
        }

        public final void clearOpenAdvertisingTrackingId() {
            this._builder.clearOpenAdvertisingTrackingId();
        }

        public final void clearVendorId() {
            this._builder.clearVendorId();
        }

        public final ByteString getAdvertisingId() {
            ByteString advertisingId = this._builder.getAdvertisingId();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(advertisingId, "_builder.getAdvertisingId()");
            return advertisingId;
        }

        public final String getAppsetId() {
            String appsetId = this._builder.getAppsetId();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(appsetId, "_builder.getAppsetId()");
            return appsetId;
        }

        public final String getFid() {
            String fid = this._builder.getFid();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(fid, "_builder.getFid()");
            return fid;
        }

        public final ByteString getOpenAdvertisingTrackingId() {
            ByteString openAdvertisingTrackingId = this._builder.getOpenAdvertisingTrackingId();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(openAdvertisingTrackingId, "_builder.getOpenAdvertisingTrackingId()");
            return openAdvertisingTrackingId;
        }

        public final ByteString getVendorId() {
            ByteString vendorId = this._builder.getVendorId();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(vendorId, "_builder.getVendorId()");
            return vendorId;
        }

        public final boolean hasAppsetId() {
            return this._builder.hasAppsetId();
        }

        public final boolean hasFid() {
            return this._builder.hasFid();
        }

        public final void setAdvertisingId(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setAdvertisingId(value);
        }

        public final void setAppsetId(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setAppsetId(value);
        }

        public final void setFid(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setFid(value);
        }

        public final void setOpenAdvertisingTrackingId(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setOpenAdvertisingTrackingId(value);
        }

        public final void setVendorId(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setVendorId(value);
        }

        private Dsl(PiiOuterClass.Pii.Builder builder) {
            this._builder = builder;
        }
    }

    private PiiKt() {
    }
}
