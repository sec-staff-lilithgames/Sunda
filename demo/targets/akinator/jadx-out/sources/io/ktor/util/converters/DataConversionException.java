package io.ktor.util.converters;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class DataConversionException extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public DataConversionException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataConversionException(String message) {
        super(message);
        e0.checkNotNullParameter(message, "message");
    }

    public /* synthetic */ DataConversionException(String str, int i10, u uVar) {
        this((i10 & 1) != 0 ? "Invalid data format" : str);
    }
}
