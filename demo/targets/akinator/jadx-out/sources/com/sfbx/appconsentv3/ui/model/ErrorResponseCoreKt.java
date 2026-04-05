package com.sfbx.appconsentv3.ui.model;

import com.sfbx.appconsent.core.model.api.proto.ErrorCode;
import com.sfbx.appconsent.core.model.api.proto.ErrorResponse;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ErrorResponseCoreKt {
    public static final ErrorResponseCore convertTo(ErrorResponse errorResponse) {
        e0.checkNotNullParameter(errorResponse, "<this>");
        return new ErrorResponseCore(convertTo(errorResponse.getCode()), errorResponse.getDescription());
    }

    public static final ErrorCodeCore convertTo(ErrorCode errorCode) {
        e0.checkNotNullParameter(errorCode, "<this>");
        return ErrorCodeCore.UNKNOWN;
    }
}
