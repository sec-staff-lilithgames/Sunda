package qw;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p extends pw.c {

    /* renamed from: p, reason: collision with root package name */
    public final Socket f83602p;

    public p(Socket socket) {
        e0.checkNotNullParameter(socket, "socket");
        this.f83602p = socket;
    }

    @Override // pw.c
    public final IOException a(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // pw.c
    public final void b() throws IOException {
        Socket socket = this.f83602p;
        try {
            socket.close();
        } catch (AssertionError e10) {
            if (!w.isAndroidGetsocknameError(e10)) {
                throw e10;
            }
            w.f83634a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        } catch (Exception e11) {
            w.f83634a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e11);
        }
    }
}
