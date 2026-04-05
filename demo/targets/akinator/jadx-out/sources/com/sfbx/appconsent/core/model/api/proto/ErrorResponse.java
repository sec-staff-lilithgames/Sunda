package com.sfbx.appconsent.core.model.api.proto;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p0.o2;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class ErrorResponse {
    public static final Companion Companion = new Companion(null);
    private final ErrorCode code;
    private final String description;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<ErrorResponse> serializer() {
            return ErrorResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @f
    public /* synthetic */ ErrorResponse(int i10, ErrorCode errorCode, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, ErrorResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.code = errorCode;
        if ((i10 & 2) == 0) {
            this.description = null;
        } else {
            this.description = str;
        }
    }

    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, ErrorCode errorCode, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            errorCode = errorResponse.code;
        }
        if ((i10 & 2) != 0) {
            str = errorResponse.description;
        }
        return errorResponse.copy(errorCode, str);
    }

    public static final void write$Self(ErrorResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeSerializableElement(serialDesc, 0, ErrorCode.Companion.serializer(), self.code);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.description == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.description);
    }

    public final ErrorCode component1() {
        return this.code;
    }

    public final String component2() {
        return this.description;
    }

    public final ErrorResponse copy(ErrorCode code, String str) {
        e0.checkNotNullParameter(code, "code");
        return new ErrorResponse(code, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) obj;
        return this.code == errorResponse.code && e0.areEqual(this.description, errorResponse.description);
    }

    public final ErrorCode getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        String str = this.description;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ErrorResponse(code=");
        sb2.append(this.code);
        sb2.append(", description=");
        return o2.q(sb2, this.description, ')');
    }

    public ErrorResponse(ErrorCode code, String str) {
        e0.checkNotNullParameter(code, "code");
        this.code = code;
        this.description = str;
    }

    public /* synthetic */ ErrorResponse(ErrorCode errorCode, String str, int i10, u uVar) {
        this(errorCode, (i10 & 2) != 0 ? null : str);
    }
}
