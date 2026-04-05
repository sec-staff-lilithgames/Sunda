package com.google.protobuf;

import com.google.protobuf.Enum;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import i2.hQ.aTNDubNmpwAqdU;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class EnumKt {
    public static final EnumKt INSTANCE = new EnumKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Enum.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Enum.Builder builder) {
                e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class EnumvalueProxy extends DslProxy {
            private EnumvalueProxy() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Enum.Builder builder, u uVar) {
            this(builder);
        }

        public final /* synthetic */ Enum _build() {
            Enum enumBuild = this._builder.build();
            e0.checkNotNullExpressionValue(enumBuild, "_builder.build()");
            return enumBuild;
        }

        public final /* synthetic */ void addAllEnumvalue(DslList dslList, Iterable values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            this._builder.addAllEnumvalue(values);
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            this._builder.addAllOptions(values);
        }

        public final /* synthetic */ void addEnumvalue(DslList dslList, EnumValue value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            this._builder.addEnumvalue(value);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            this._builder.addOptions(value);
        }

        public final void clearEdition() {
            this._builder.clearEdition();
        }

        public final /* synthetic */ void clearEnumvalue(DslList dslList) {
            e0.checkNotNullParameter(dslList, "<this>");
            this._builder.clearEnumvalue();
        }

        public final void clearName() {
            this._builder.clearName();
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

        public final /* synthetic */ DslList getEnumvalue() {
            List<EnumValue> enumvalueList = this._builder.getEnumvalueList();
            e0.checkNotNullExpressionValue(enumvalueList, "_builder.getEnumvalueList()");
            return new DslList(enumvalueList);
        }

        public final String getName() {
            String name = this._builder.getName();
            e0.checkNotNullExpressionValue(name, "_builder.getName()");
            return name;
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

        public final /* synthetic */ void plusAssignAllEnumvalue(DslList<EnumValue, EnumvalueProxy> dslList, Iterable<EnumValue> values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            addAllEnumvalue(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            addAllOptions(dslList, values);
        }

        public final /* synthetic */ void plusAssignEnumvalue(DslList<EnumValue, EnumvalueProxy> dslList, EnumValue value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            addEnumvalue(dslList, value);
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

        public final /* synthetic */ void setEnumvalue(DslList dslList, int i10, EnumValue value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            this._builder.setEnumvalue(i10, value);
        }

        public final void setName(String value) {
            e0.checkNotNullParameter(value, "value");
            this._builder.setName(value);
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

        public final void setSyntaxValue(int i10) {
            this._builder.setSyntaxValue(i10);
        }

        private Dsl(Enum.Builder builder) {
            this._builder = builder;
        }

        public final void setSyntax(Syntax syntax) {
            e0.checkNotNullParameter(syntax, aTNDubNmpwAqdU.KIH);
            this._builder.setSyntax(syntax);
        }
    }

    private EnumKt() {
    }
}
