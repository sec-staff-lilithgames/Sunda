package com.google.protobuf;

import com.google.protobuf.Type;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class TypeKt {
    public static final TypeKt INSTANCE = new TypeKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Type.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Type.Builder builder) {
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

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class OneofsProxy extends DslProxy {
            private OneofsProxy() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Type.Builder builder, u uVar) {
            this(builder);
        }

        public final /* synthetic */ Type _build() {
            Type typeBuild = this._builder.build();
            e0.checkNotNullExpressionValue(typeBuild, "_builder.build()");
            return typeBuild;
        }

        public final /* synthetic */ void addAllFields(DslList dslList, Iterable values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            this._builder.addAllFields(values);
        }

        public final /* synthetic */ void addAllOneofs(DslList dslList, Iterable values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            this._builder.addAllOneofs(values);
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            this._builder.addAllOptions(values);
        }

        public final /* synthetic */ void addFields(DslList dslList, Field value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            this._builder.addFields(value);
        }

        public final /* synthetic */ void addOneofs(DslList dslList, String value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            this._builder.addOneofs(value);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            this._builder.addOptions(value);
        }

        public final void clearEdition() {
            this._builder.clearEdition();
        }

        public final /* synthetic */ void clearFields(DslList dslList) {
            e0.checkNotNullParameter(dslList, "<this>");
            this._builder.clearFields();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final /* synthetic */ void clearOneofs(DslList dslList) {
            e0.checkNotNullParameter(dslList, "<this>");
            this._builder.clearOneofs();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            e0.checkNotNullParameter(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final void clearSourceContext() {
            this._builder.clearSourceContext();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
        }

        public final String getEdition() {
            String edition = this._builder.getEdition();
            e0.checkNotNullExpressionValue(edition, "_builder.getEdition()");
            return edition;
        }

        public final /* synthetic */ DslList getFields() {
            List<Field> fieldsList = this._builder.getFieldsList();
            e0.checkNotNullExpressionValue(fieldsList, "_builder.getFieldsList()");
            return new DslList(fieldsList);
        }

        public final String getName() {
            String name = this._builder.getName();
            e0.checkNotNullExpressionValue(name, "_builder.getName()");
            return name;
        }

        public final DslList<String, OneofsProxy> getOneofs() {
            List<String> oneofsList = this._builder.getOneofsList();
            e0.checkNotNullExpressionValue(oneofsList, "_builder.getOneofsList()");
            return new DslList<>(oneofsList);
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            e0.checkNotNullExpressionValue(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        public final SourceContext getSourceContext() {
            SourceContext sourceContext = this._builder.getSourceContext();
            e0.checkNotNullExpressionValue(sourceContext, "_builder.getSourceContext()");
            return sourceContext;
        }

        public final Syntax getSyntax() {
            Syntax syntax = this._builder.getSyntax();
            e0.checkNotNullExpressionValue(syntax, "_builder.getSyntax()");
            return syntax;
        }

        public final int getSyntaxValue() {
            return this._builder.getSyntaxValue();
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        public final /* synthetic */ void plusAssignAllFields(DslList<Field, FieldsProxy> dslList, Iterable<Field> values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            addAllFields(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            addAllOptions(dslList, values);
        }

        public final /* synthetic */ void plusAssignFields(DslList<Field, FieldsProxy> dslList, Field value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            addFields(dslList, value);
        }

        public final /* synthetic */ void plusAssignOneofs(DslList<String, OneofsProxy> dslList, String value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            addOneofs(dslList, value);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            addOptions(dslList, value);
        }

        public final void setEdition(String value) {
            e0.checkNotNullParameter(value, "value");
            this._builder.setEdition(value);
        }

        public final /* synthetic */ void setFields(DslList dslList, int i10, Field value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            this._builder.setFields(i10, value);
        }

        public final void setName(String value) {
            e0.checkNotNullParameter(value, "value");
            this._builder.setName(value);
        }

        public final /* synthetic */ void setOneofs(DslList dslList, int i10, String value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            this._builder.setOneofs(i10, value);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i10, Option value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            this._builder.setOptions(i10, value);
        }

        public final void setSourceContext(SourceContext value) {
            e0.checkNotNullParameter(value, "value");
            this._builder.setSourceContext(value);
        }

        public final void setSyntax(Syntax value) {
            e0.checkNotNullParameter(value, "value");
            this._builder.setSyntax(value);
        }

        public final void setSyntaxValue(int i10) {
            this._builder.setSyntaxValue(i10);
        }

        private Dsl(Type.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ void plusAssignAllOneofs(DslList<String, OneofsProxy> dslList, Iterable<String> iterable) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(iterable, QCmNMSGd.DxuxpFQFmkBPiR);
            addAllOneofs(dslList, iterable);
        }
    }

    private TypeKt() {
    }
}
