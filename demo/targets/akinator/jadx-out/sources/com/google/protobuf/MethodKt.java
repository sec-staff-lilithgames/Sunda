package com.google.protobuf;

import com.google.protobuf.Method;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class MethodKt {
    public static final MethodKt INSTANCE = new MethodKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Method.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Method.Builder builder) {
                e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Method.Builder builder, u uVar) {
            this(builder);
        }

        public final /* synthetic */ Method _build() {
            Method methodBuild = this._builder.build();
            e0.checkNotNullExpressionValue(methodBuild, "_builder.build()");
            return methodBuild;
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            this._builder.addAllOptions(values);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            this._builder.addOptions(value);
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            e0.checkNotNullParameter(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final void clearRequestStreaming() {
            this._builder.clearRequestStreaming();
        }

        public final void clearRequestTypeUrl() {
            this._builder.clearRequestTypeUrl();
        }

        public final void clearResponseStreaming() {
            this._builder.clearResponseStreaming();
        }

        public final void clearResponseTypeUrl() {
            this._builder.clearResponseTypeUrl();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
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

        public final boolean getRequestStreaming() {
            return this._builder.getRequestStreaming();
        }

        public final String getRequestTypeUrl() {
            String requestTypeUrl = this._builder.getRequestTypeUrl();
            e0.checkNotNullExpressionValue(requestTypeUrl, "_builder.getRequestTypeUrl()");
            return requestTypeUrl;
        }

        public final boolean getResponseStreaming() {
            return this._builder.getResponseStreaming();
        }

        public final String getResponseTypeUrl() {
            String responseTypeUrl = this._builder.getResponseTypeUrl();
            e0.checkNotNullExpressionValue(responseTypeUrl, "_builder.getResponseTypeUrl()");
            return responseTypeUrl;
        }

        public final Syntax getSyntax() {
            Syntax syntax = this._builder.getSyntax();
            e0.checkNotNullExpressionValue(syntax, "_builder.getSyntax()");
            return syntax;
        }

        public final int getSyntaxValue() {
            return this._builder.getSyntaxValue();
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> values) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(values, "values");
            addAllOptions(dslList, values);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option value) {
            e0.checkNotNullParameter(dslList, "<this>");
            e0.checkNotNullParameter(value, "value");
            addOptions(dslList, value);
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

        public final void setRequestStreaming(boolean z10) {
            this._builder.setRequestStreaming(z10);
        }

        public final void setRequestTypeUrl(String value) {
            e0.checkNotNullParameter(value, "value");
            this._builder.setRequestTypeUrl(value);
        }

        public final void setResponseStreaming(boolean z10) {
            this._builder.setResponseStreaming(z10);
        }

        public final void setResponseTypeUrl(String value) {
            e0.checkNotNullParameter(value, "value");
            this._builder.setResponseTypeUrl(value);
        }

        public final void setSyntax(Syntax value) {
            e0.checkNotNullParameter(value, "value");
            this._builder.setSyntax(value);
        }

        public final void setSyntaxValue(int i10) {
            this._builder.setSyntaxValue(i10);
        }

        private Dsl(Method.Builder builder) {
            this._builder = builder;
        }
    }

    private MethodKt() {
    }
}
