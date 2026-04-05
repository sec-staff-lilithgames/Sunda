package com.google.protobuf;

import com.google.protobuf.Value;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ValueKt {
    public static final ValueKt INSTANCE = new ValueKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Value.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Value.Builder builder) {
                e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Value.Builder builder, u uVar) {
            this(builder);
        }

        public final /* synthetic */ Value _build() {
            Value valueBuild = this._builder.build();
            e0.checkNotNullExpressionValue(valueBuild, "_builder.build()");
            return valueBuild;
        }

        public final void clearBoolValue() {
            this._builder.clearBoolValue();
        }

        public final void clearKind() {
            this._builder.clearKind();
        }

        public final void clearListValue() {
            this._builder.clearListValue();
        }

        public final void clearNullValue() {
            this._builder.clearNullValue();
        }

        public final void clearNumberValue() {
            this._builder.clearNumberValue();
        }

        public final void clearStringValue() {
            this._builder.clearStringValue();
        }

        public final void clearStructValue() {
            this._builder.clearStructValue();
        }

        public final boolean getBoolValue() {
            return this._builder.getBoolValue();
        }

        public final Value.KindCase getKindCase() {
            Value.KindCase kindCase = this._builder.getKindCase();
            e0.checkNotNullExpressionValue(kindCase, "_builder.getKindCase()");
            return kindCase;
        }

        public final ListValue getListValue() {
            ListValue listValue = this._builder.getListValue();
            e0.checkNotNullExpressionValue(listValue, "_builder.getListValue()");
            return listValue;
        }

        public final NullValue getNullValue() {
            NullValue nullValue = this._builder.getNullValue();
            e0.checkNotNullExpressionValue(nullValue, "_builder.getNullValue()");
            return nullValue;
        }

        public final int getNullValueValue() {
            return this._builder.getNullValueValue();
        }

        public final double getNumberValue() {
            return this._builder.getNumberValue();
        }

        public final String getStringValue() {
            String stringValue = this._builder.getStringValue();
            e0.checkNotNullExpressionValue(stringValue, "_builder.getStringValue()");
            return stringValue;
        }

        public final Struct getStructValue() {
            Struct structValue = this._builder.getStructValue();
            e0.checkNotNullExpressionValue(structValue, "_builder.getStructValue()");
            return structValue;
        }

        public final boolean hasBoolValue() {
            return this._builder.hasBoolValue();
        }

        public final boolean hasListValue() {
            return this._builder.hasListValue();
        }

        public final boolean hasNullValue() {
            return this._builder.hasNullValue();
        }

        public final boolean hasNumberValue() {
            return this._builder.hasNumberValue();
        }

        public final boolean hasStringValue() {
            return this._builder.hasStringValue();
        }

        public final boolean hasStructValue() {
            return this._builder.hasStructValue();
        }

        public final void setBoolValue(boolean z10) {
            this._builder.setBoolValue(z10);
        }

        public final void setListValue(ListValue value) {
            e0.checkNotNullParameter(value, "value");
            this._builder.setListValue(value);
        }

        public final void setNullValue(NullValue value) {
            e0.checkNotNullParameter(value, "value");
            this._builder.setNullValue(value);
        }

        public final void setNullValueValue(int i10) {
            this._builder.setNullValueValue(i10);
        }

        public final void setNumberValue(double d10) {
            this._builder.setNumberValue(d10);
        }

        public final void setStringValue(String value) {
            e0.checkNotNullParameter(value, "value");
            this._builder.setStringValue(value);
        }

        public final void setStructValue(Struct value) {
            e0.checkNotNullParameter(value, "value");
            this._builder.setStructValue(value);
        }

        private Dsl(Value.Builder builder) {
            this._builder = builder;
        }
    }

    private ValueKt() {
    }
}
