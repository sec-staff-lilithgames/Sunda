package com.google.protobuf;

import com.google.protobuf.Struct;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class StructKt {
    public static final StructKt INSTANCE = new StructKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Struct.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Struct.Builder builder) {
                e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class FieldsProxy extends DslProxy {
            private FieldsProxy() {
            }
        }

        public /* synthetic */ Dsl(Struct.Builder builder, u uVar) {
            this(builder);
        }

        public final /* synthetic */ Struct _build() {
            Struct structBuild = this._builder.build();
            e0.checkNotNullExpressionValue(structBuild, "_builder.build()");
            return structBuild;
        }

        public final /* synthetic */ void clearFields(DslMap dslMap) {
            e0.checkNotNullParameter(dslMap, "<this>");
            this._builder.clearFields();
        }

        public final /* synthetic */ DslMap getFieldsMap() {
            Map<String, Value> fieldsMap = this._builder.getFieldsMap();
            e0.checkNotNullExpressionValue(fieldsMap, "_builder.getFieldsMap()");
            return new DslMap(fieldsMap);
        }

        public final /* synthetic */ void putAllFields(DslMap dslMap, Map map) {
            e0.checkNotNullParameter(dslMap, "<this>");
            e0.checkNotNullParameter(map, "map");
            this._builder.putAllFields(map);
        }

        public final void putFields(DslMap<String, Value, FieldsProxy> dslMap, String key, Value value) {
            e0.checkNotNullParameter(dslMap, "<this>");
            e0.checkNotNullParameter(key, "key");
            e0.checkNotNullParameter(value, "value");
            this._builder.putFields(key, value);
        }

        public final /* synthetic */ void removeFields(DslMap dslMap, String key) {
            e0.checkNotNullParameter(dslMap, "<this>");
            e0.checkNotNullParameter(key, "key");
            this._builder.removeFields(key);
        }

        public final /* synthetic */ void setFields(DslMap<String, Value, FieldsProxy> dslMap, String key, Value value) {
            e0.checkNotNullParameter(dslMap, "<this>");
            e0.checkNotNullParameter(key, "key");
            e0.checkNotNullParameter(value, "value");
            putFields(dslMap, key, value);
        }

        private Dsl(Struct.Builder builder) {
            this._builder = builder;
        }
    }

    private StructKt() {
    }
}
