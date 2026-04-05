package com.google.protobuf;

import com.google.protobuf.Api;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ApiKt {
    public static final ApiKt INSTANCE = new ApiKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Api.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Api.Builder builder) {
                e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class MethodsProxy extends DslProxy {
            private MethodsProxy() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class MixinsProxy extends DslProxy {
            private MixinsProxy() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Api.Builder builder, u uVar) {
            this(builder);
        }

        public final /* synthetic */ Api _build() {
            Api apiBuild = this._builder.build();
            e0.checkNotNullExpressionValue(apiBuild, "_builder.build()");
            return apiBuild;
        }

        public final /* synthetic */ void addAllMethods(DslList dslList, Iterable values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            this._builder.addAllMethods(values);
        }

        public final /* synthetic */ void addAllMixins(DslList dslList, Iterable values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            this._builder.addAllMixins(values);
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            this._builder.addAllOptions(values);
        }

        public final /* synthetic */ void addMethods(DslList dslList, Method value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            this._builder.addMethods(value);
        }

        public final /* synthetic */ void addMixins(DslList dslList, Mixin value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            this._builder.addMixins(value);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            this._builder.addOptions(value);
        }

        public final /* synthetic */ void clearMethods(DslList dslList) {
            e0.checkNotNullParameter(dslList, "<this>");
            this._builder.clearMethods();
        }

        public final /* synthetic */ void clearMixins(DslList dslList) {
            e0.checkNotNullParameter(dslList, "<this>");
            this._builder.clearMixins();
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

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final /* synthetic */ DslList getMethods() {
            List<Method> methodsList = this._builder.getMethodsList();
            e0.checkNotNullExpressionValue(methodsList, "_builder.getMethodsList()");
            return new DslList(methodsList);
        }

        public final /* synthetic */ DslList getMixins() {
            List<Mixin> mixinsList = this._builder.getMixinsList();
            e0.checkNotNullExpressionValue(mixinsList, "_builder.getMixinsList()");
            return new DslList(mixinsList);
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

        public final String getVersion() {
            String version = this._builder.getVersion();
            e0.checkNotNullExpressionValue(version, "_builder.getVersion()");
            return version;
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        public final /* synthetic */ void plusAssignAllMethods(DslList<Method, MethodsProxy> dslList, Iterable<Method> values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            addAllMethods(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllMixins(DslList<Mixin, MixinsProxy> dslList, Iterable<Mixin> values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            addAllMixins(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            addAllOptions(dslList, values);
        }

        public final /* synthetic */ void plusAssignMethods(DslList<Method, MethodsProxy> dslList, Method value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            addMethods(dslList, value);
        }

        public final /* synthetic */ void plusAssignMixins(DslList<Mixin, MixinsProxy> dslList, Mixin value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            addMixins(dslList, value);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            addOptions(dslList, value);
        }

        public final /* synthetic */ void setMethods(DslList dslList, int i10, Method value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            this._builder.setMethods(i10, value);
        }

        public final /* synthetic */ void setMixins(DslList dslList, int i10, Mixin value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            this._builder.setMixins(i10, value);
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

        public final void setSyntax(Syntax value) {
            e0.checkNotNullParameter(value, "value");
            this._builder.setSyntax(value);
        }

        public final void setSyntaxValue(int i10) {
            this._builder.setSyntaxValue(i10);
        }

        public final void setVersion(String value) {
            e0.checkNotNullParameter(value, "value");
            this._builder.setVersion(value);
        }

        private Dsl(Api.Builder builder) {
            this._builder = builder;
        }
    }

    private ApiKt() {
    }
}
