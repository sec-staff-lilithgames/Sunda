package io.ktor.client.plugins.logging;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class MessageLengthLimitingLogger implements Logger {
    private final Logger delegate;
    private final int maxLength;
    private final int minLength;

    public MessageLengthLimitingLogger() {
        this(0, 0, null, 7, null);
    }

    private final void logLong(String str) {
        while (true) {
            int length = str.length();
            int i10 = this.maxLength;
            if (length <= i10) {
                this.delegate.log(str);
                return;
            }
            String strSubstring = str.substring(0, i10);
            e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            int i11 = this.maxLength;
            int iLastIndexOf$default = n0.lastIndexOf$default((CharSequence) strSubstring, '\n', 0, false, 6, (Object) null);
            if (iLastIndexOf$default >= this.minLength) {
                strSubstring = strSubstring.substring(0, iLastIndexOf$default);
                e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                i11 = iLastIndexOf$default + 1;
            }
            this.delegate.log(strSubstring);
            str = str.substring(i11);
            e0.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
        }
    }

    @Override // io.ktor.client.plugins.logging.Logger
    public void log(String message) {
        e0.checkNotNullParameter(message, "message");
        logLong(message);
    }

    public MessageLengthLimitingLogger(int i10, int i11, Logger delegate) {
        e0.checkNotNullParameter(delegate, "delegate");
        this.maxLength = i10;
        this.minLength = i11;
        this.delegate = delegate;
    }

    public /* synthetic */ MessageLengthLimitingLogger(int i10, int i11, Logger logger, int i12, u uVar) {
        this((i12 & 1) != 0 ? 4000 : i10, (i12 & 2) != 0 ? IronSourceError.ERROR_CAPPING_VALIDATION_FAILED : i11, (i12 & 4) != 0 ? LoggerJvmKt.getDEFAULT(Logger.Companion) : logger);
    }
}
