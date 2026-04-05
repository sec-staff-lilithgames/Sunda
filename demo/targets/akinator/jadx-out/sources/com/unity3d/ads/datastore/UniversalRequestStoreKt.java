package com.unity3d.ads.datastore;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UniversalRequestStoreKt {
    public static final UniversalRequestStoreKt INSTANCE = new UniversalRequestStoreKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UniversalRequestStoreOuterClass.UniversalRequestStore.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder) {
                e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class UniversalRequestMapProxy extends DslProxy {
            private UniversalRequestMapProxy() {
            }
        }

        public /* synthetic */ Dsl(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder, u uVar) {
            this(builder);
        }

        public final /* synthetic */ UniversalRequestStoreOuterClass.UniversalRequestStore _build() {
            UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStoreBuild = this._builder.build();
            e0.checkNotNullExpressionValue(universalRequestStoreBuild, "_builder.build()");
            return universalRequestStoreBuild;
        }

        public final /* synthetic */ void clearUniversalRequestMap(DslMap dslMap) {
            e0.checkNotNullParameter(dslMap, "<this>");
            this._builder.clearUniversalRequestMap();
        }

        public final /* synthetic */ DslMap getUniversalRequestMapMap() {
            Map<String, ByteString> universalRequestMapMap = this._builder.getUniversalRequestMapMap();
            e0.checkNotNullExpressionValue(universalRequestMapMap, "_builder.getUniversalRequestMapMap()");
            return new DslMap(universalRequestMapMap);
        }

        public final /* synthetic */ void putAllUniversalRequestMap(DslMap dslMap, Map map) {
            e0.checkNotNullParameter(dslMap, "<this>");
            e0.checkNotNullParameter(map, "map");
            this._builder.putAllUniversalRequestMap(map);
        }

        public final void putUniversalRequestMap(DslMap<String, ByteString, UniversalRequestMapProxy> dslMap, String key, ByteString value) {
            e0.checkNotNullParameter(dslMap, "<this>");
            e0.checkNotNullParameter(key, "key");
            e0.checkNotNullParameter(value, "value");
            this._builder.putUniversalRequestMap(key, value);
        }

        public final /* synthetic */ void removeUniversalRequestMap(DslMap dslMap, String key) {
            e0.checkNotNullParameter(dslMap, "<this>");
            e0.checkNotNullParameter(key, "key");
            this._builder.removeUniversalRequestMap(key);
        }

        public final /* synthetic */ void setUniversalRequestMap(DslMap<String, ByteString, UniversalRequestMapProxy> dslMap, String key, ByteString value) {
            e0.checkNotNullParameter(dslMap, "<this>");
            e0.checkNotNullParameter(key, "key");
            e0.checkNotNullParameter(value, "value");
            putUniversalRequestMap(dslMap, key, value);
        }

        private Dsl(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder) {
            this._builder = builder;
        }
    }

    private UniversalRequestStoreKt() {
    }
}
