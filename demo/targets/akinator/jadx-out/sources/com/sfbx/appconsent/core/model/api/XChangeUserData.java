package com.sfbx.appconsent.core.model.api;

import com.sfbx.appconsent.core.util.ExtensionKt;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import sv.n0;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class XChangeUserData {
    public static final Companion Companion = new Companion(null);
    private final String emailSHA256;
    private final String externalId;
    private final String phoneSHA256;
    private final Long timestampCollect;
    private final String unstructuredData;
    private final XChangeDataAddress xChangeDataAddress;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        private String emailSHA256;
        private String externalId;
        private String phoneSHA256;
        private Long timestampCollect;
        private String unstructuredData;
        private XChangeDataAddress xChangeDataAddress;

        public Builder() {
            this(null, null, null, null, null, null, 63, null);
        }

        public final XChangeUserData build() {
            return new XChangeUserData(this.emailSHA256, this.externalId, this.phoneSHA256, this.xChangeDataAddress, this.timestampCollect, this.unstructuredData, null);
        }

        public final Builder email(String email) {
            e0.checkNotNullParameter(email, "email");
            String string = n0.trim(email).toString();
            Locale locale = Locale.getDefault();
            e0.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = string.toLowerCase(locale);
            e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.emailSHA256 = ExtensionKt.sha256(lowerCase);
            return this;
        }

        public final Builder externalId(String externalId) {
            e0.checkNotNullParameter(externalId, "externalId");
            this.externalId = externalId;
            return this;
        }

        public final Builder phoneNumber(String phoneNumber) {
            e0.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.phoneSHA256 = ExtensionKt.sha256(ExtensionKt.formatNumber$default(phoneNumber, null, 1, null));
            return this;
        }

        public final Builder unstructuredData(String unstructuredData) {
            e0.checkNotNullParameter(unstructuredData, "unstructuredData");
            this.unstructuredData = unstructuredData;
            return this;
        }

        public final Builder xChangeInfoAddress(XChangeDataAddress xChangeDataAddress) {
            e0.checkNotNullParameter(xChangeDataAddress, "xChangeDataAddress");
            this.xChangeDataAddress = xChangeDataAddress;
            return this;
        }

        public Builder(String str, String str2, String str3, XChangeDataAddress xChangeDataAddress, Long l9, String str4) {
            this.emailSHA256 = str;
            this.externalId = str2;
            this.phoneSHA256 = str3;
            this.xChangeDataAddress = xChangeDataAddress;
            this.timestampCollect = l9;
            this.unstructuredData = str4;
        }

        public /* synthetic */ Builder(String str, String str2, String str3, XChangeDataAddress xChangeDataAddress, Long l9, String str4, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : xChangeDataAddress, (i10 & 16) != 0 ? null : l9, (i10 & 32) != 0 ? null : str4);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<XChangeUserData> serializer() {
            return XChangeUserData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ XChangeUserData(String str, String str2, String str3, XChangeDataAddress xChangeDataAddress, Long l9, String str4, u uVar) {
        this(str, str2, str3, xChangeDataAddress, l9, str4);
    }

    public static final void write$Self(XChangeUserData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.emailSHA256);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.externalId);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.phoneSHA256);
        output.encodeNullableSerializableElement(serialDesc, 3, XChangeDataAddress$$serializer.INSTANCE, self.xChangeDataAddress);
        output.encodeNullableSerializableElement(serialDesc, 4, LongSerializer.INSTANCE, self.timestampCollect);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.unstructuredData);
    }

    public final String getEmailSHA256() {
        return this.emailSHA256;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final String getPhoneSHA256() {
        return this.phoneSHA256;
    }

    public final Long getTimestampCollect() {
        return this.timestampCollect;
    }

    public final String getUnstructuredData() {
        return this.unstructuredData;
    }

    public final XChangeDataAddress getXChangeDataAddress() {
        return this.xChangeDataAddress;
    }

    @f
    public /* synthetic */ XChangeUserData(int i10, String str, String str2, String str3, XChangeDataAddress xChangeDataAddress, Long l9, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i10 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 63, XChangeUserData$$serializer.INSTANCE.getDescriptor());
        }
        this.emailSHA256 = str;
        this.externalId = str2;
        this.phoneSHA256 = str3;
        this.xChangeDataAddress = xChangeDataAddress;
        this.timestampCollect = l9;
        this.unstructuredData = str4;
    }

    private XChangeUserData(String str, String str2, String str3, XChangeDataAddress xChangeDataAddress, Long l9, String str4) {
        this.emailSHA256 = str;
        this.externalId = str2;
        this.phoneSHA256 = str3;
        this.xChangeDataAddress = xChangeDataAddress;
        this.timestampCollect = l9;
        this.unstructuredData = str4;
    }
}
