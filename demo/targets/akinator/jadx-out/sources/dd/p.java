package dd;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class p {
    public static void rethrowIfFatal(Throwable th2) throws Error, RuntimeException {
        if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof ClassCircularityError) || (th2 instanceof ClassFormatError) || (th2 instanceof IncompatibleClassChangeError) || (th2 instanceof BootstrapMethodError) || (th2 instanceof VerifyError)) {
            if (th2 instanceof Error) {
                throw ((Error) th2);
            }
            if (!(th2 instanceof RuntimeException)) {
                throw new RuntimeException(th2);
            }
            throw ((RuntimeException) th2);
        }
    }

    public static <T> T throwSneaky(IOException iOException) throws IOException {
        throw iOException;
    }
}
