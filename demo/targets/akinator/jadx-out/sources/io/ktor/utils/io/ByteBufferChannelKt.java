package io.ktor.utils.io;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteBufferChannelKt {
    private static final int BYTE_BUFFER_CAPACITY = 4088;
    public static final String DEFAULT_CLOSE_MESSAGE = "Byte channel was closed";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void rethrowClosed(Throwable th2) throws Throwable {
        Throwable thTryCopyException;
        try {
            thTryCopyException = ExceptionUtilsJvmKt.tryCopyException(th2, th2);
        } catch (Throwable unused) {
            thTryCopyException = null;
        }
        if (thTryCopyException == null) {
            throw th2;
        }
        throw thTryCopyException;
    }
}
