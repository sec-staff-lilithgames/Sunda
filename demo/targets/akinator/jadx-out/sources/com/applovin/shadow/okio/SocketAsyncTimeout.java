package com.applovin.shadow.okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
final class SocketAsyncTimeout extends AsyncTimeout {
    private final Socket socket;

    public SocketAsyncTimeout(Socket socket) {
        e0.checkNotNullParameter(socket, "socket");
        this.socket = socket;
    }

    @Override // com.applovin.shadow.okio.AsyncTimeout
    public IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // com.applovin.shadow.okio.AsyncTimeout
    public void timedOut() throws IOException {
        try {
            this.socket.close();
        } catch (AssertionError e10) {
            if (!Okio.isAndroidGetsocknameError(e10)) {
                throw e10;
            }
            Okio__JvmOkioKt.logger.log(Level.WARNING, "Failed to close timed out socket " + this.socket, (Throwable) e10);
        } catch (Exception e11) {
            Okio__JvmOkioKt.logger.log(Level.WARNING, "Failed to close timed out socket " + this.socket, (Throwable) e11);
        }
    }
}
