package com.sfbx.appconsentv3.ui.model;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ErrorResponseCore {
    private final ErrorCodeCore code;
    private final String description;

    public ErrorResponseCore(ErrorCodeCore code, String str) {
        e0.checkNotNullParameter(code, "code");
        this.code = code;
        this.description = str;
    }

    public static /* synthetic */ ErrorResponseCore copy$default(ErrorResponseCore errorResponseCore, ErrorCodeCore errorCodeCore, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            errorCodeCore = errorResponseCore.code;
        }
        if ((i10 & 2) != 0) {
            str = errorResponseCore.description;
        }
        return errorResponseCore.copy(errorCodeCore, str);
    }

    public final ErrorCodeCore component1() {
        return this.code;
    }

    public final String component2() {
        return this.description;
    }

    public final ErrorResponseCore copy(ErrorCodeCore code, String str) {
        e0.checkNotNullParameter(code, "code");
        return new ErrorResponseCore(code, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorResponseCore)) {
            return false;
        }
        ErrorResponseCore errorResponseCore = (ErrorResponseCore) obj;
        return this.code == errorResponseCore.code && e0.areEqual(this.description, errorResponseCore.description);
    }

    public final ErrorCodeCore getCode() {
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
        StringBuilder sb2 = new StringBuilder("ErrorResponseCore(code=");
        sb2.append(this.code);
        sb2.append(", description=");
        return o2.q(sb2, this.description, ')');
    }

    public /* synthetic */ ErrorResponseCore(ErrorCodeCore errorCodeCore, String str, int i10, u uVar) {
        this(errorCodeCore, (i10 & 2) != 0 ? null : str);
    }
}
