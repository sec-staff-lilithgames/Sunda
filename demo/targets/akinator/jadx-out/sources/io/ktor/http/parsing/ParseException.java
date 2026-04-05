package io.ktor.http.parsing;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ParseException extends IllegalArgumentException {
    private final Throwable cause;
    private final String message;

    public /* synthetic */ ParseException(String str, Throwable th2, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParseException(String message, Throwable th2) {
        super(message, th2);
        e0.checkNotNullParameter(message, "message");
        this.message = message;
        this.cause = th2;
    }
}
