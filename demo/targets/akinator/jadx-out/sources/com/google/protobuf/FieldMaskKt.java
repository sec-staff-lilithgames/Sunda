package com.google.protobuf;

import com.google.protobuf.FieldMask;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class FieldMaskKt {
    public static final FieldMaskKt INSTANCE = new FieldMaskKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final FieldMask.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(FieldMask.Builder builder) {
                e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class PathsProxy extends DslProxy {
            private PathsProxy() {
            }
        }

        public /* synthetic */ Dsl(FieldMask.Builder builder, u uVar) {
            this(builder);
        }

        public final /* synthetic */ FieldMask _build() {
            FieldMask fieldMaskBuild = this._builder.build();
            e0.checkNotNullExpressionValue(fieldMaskBuild, "_builder.build()");
            return fieldMaskBuild;
        }

        public final /* synthetic */ void addAllPaths(DslList dslList, Iterable values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            this._builder.addAllPaths(values);
        }

        public final /* synthetic */ void addPaths(DslList dslList, String value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            this._builder.addPaths(value);
        }

        public final /* synthetic */ void clearPaths(DslList dslList) {
            e0.checkNotNullParameter(dslList, "<this>");
            this._builder.clearPaths();
        }

        public final DslList<String, PathsProxy> getPaths() {
            List<String> pathsList = this._builder.getPathsList();
            e0.checkNotNullExpressionValue(pathsList, "_builder.getPathsList()");
            return new DslList<>(pathsList);
        }

        public final /* synthetic */ void plusAssignAllPaths(DslList<String, PathsProxy> dslList, Iterable<String> values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            addAllPaths(dslList, values);
        }

        public final /* synthetic */ void plusAssignPaths(DslList<String, PathsProxy> dslList, String value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            addPaths(dslList, value);
        }

        public final /* synthetic */ void setPaths(DslList dslList, int i10, String value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            this._builder.setPaths(i10, value);
        }

        private Dsl(FieldMask.Builder builder) {
            this._builder = builder;
        }
    }

    private FieldMaskKt() {
    }
}
