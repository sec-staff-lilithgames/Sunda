package com.sfbx.appconsent.core.model;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p0.o2;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class TranslatableText {
    public static final Companion Companion = new Companion(null);
    private final String locale;
    private final String value;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<TranslatableText> serializer() {
            return TranslatableText$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @f
    public /* synthetic */ TranslatableText(int i10, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 3, TranslatableText$$serializer.INSTANCE.getDescriptor());
        }
        this.locale = str;
        this.value = str2;
    }

    public static /* synthetic */ TranslatableText copy$default(TranslatableText translatableText, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = translatableText.locale;
        }
        if ((i10 & 2) != 0) {
            str2 = translatableText.value;
        }
        return translatableText.copy(str, str2);
    }

    public static final void write$Self(TranslatableText self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.locale);
        output.encodeStringElement(serialDesc, 1, self.value);
    }

    public final String component1() {
        return this.locale;
    }

    public final String component2() {
        return this.value;
    }

    public final TranslatableText copy(String locale, String value) {
        e0.checkNotNullParameter(locale, "locale");
        e0.checkNotNullParameter(value, "value");
        return new TranslatableText(locale, value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslatableText)) {
            return false;
        }
        TranslatableText translatableText = (TranslatableText) obj;
        return e0.areEqual(this.locale, translatableText.locale) && e0.areEqual(this.value, translatableText.value);
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.locale.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TranslatableText(locale=");
        sb2.append(this.locale);
        sb2.append(", value=");
        return o2.q(sb2, this.value, ')');
    }

    public TranslatableText(String locale, String value) {
        e0.checkNotNullParameter(locale, "locale");
        e0.checkNotNullParameter(value, "value");
        this.locale = locale;
        this.value = value;
    }
}
