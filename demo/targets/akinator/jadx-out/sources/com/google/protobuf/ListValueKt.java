package com.google.protobuf;

import com.google.protobuf.ListValue;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ListValueKt {
    public static final ListValueKt INSTANCE = new ListValueKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ListValue.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(ListValue.Builder builder) {
                e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ValuesProxy extends DslProxy {
            private ValuesProxy() {
            }
        }

        public /* synthetic */ Dsl(ListValue.Builder builder, u uVar) {
            this(builder);
        }

        public final /* synthetic */ ListValue _build() {
            ListValue listValueBuild = this._builder.build();
            e0.checkNotNullExpressionValue(listValueBuild, "_builder.build()");
            return listValueBuild;
        }

        public final /* synthetic */ void addAllValues(DslList dslList, Iterable values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            this._builder.addAllValues(values);
        }

        public final /* synthetic */ void addValues(DslList dslList, Value value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            this._builder.addValues(value);
        }

        public final /* synthetic */ void clearValues(DslList dslList) {
            e0.checkNotNullParameter(dslList, "<this>");
            this._builder.clearValues();
        }

        public final /* synthetic */ DslList getValues() {
            List<Value> valuesList = this._builder.getValuesList();
            e0.checkNotNullExpressionValue(valuesList, "_builder.getValuesList()");
            return new DslList(valuesList);
        }

        public final /* synthetic */ void plusAssignAllValues(DslList<Value, ValuesProxy> dslList, Iterable<Value> values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            addAllValues(dslList, values);
        }

        public final /* synthetic */ void plusAssignValues(DslList<Value, ValuesProxy> dslList, Value value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            addValues(dslList, value);
        }

        public final /* synthetic */ void setValues(DslList dslList, int i10, Value value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            this._builder.setValues(i10, value);
        }

        private Dsl(ListValue.Builder builder) {
            this._builder = builder;
        }
    }

    private ListValueKt() {
    }
}
