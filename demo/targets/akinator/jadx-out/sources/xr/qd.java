package xr;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class qd implements fe {
    @Override // xr.fe, xr.we
    public void messagesAvailable(ve veVar) throws IOException {
        while (true) {
            InputStream next = veVar.next();
            if (next == null) {
                return;
            }
            try {
                next.close();
            } catch (IOException e10) {
                while (true) {
                    InputStream next2 = veVar.next();
                    if (next2 == null) {
                        throw new RuntimeException(e10);
                    }
                    try {
                        next2.close();
                    } catch (IOException e11) {
                        zd.f93336z.log(Level.WARNING, "Exception closing stream", (Throwable) e11);
                    }
                }
            }
        }
    }

    @Override // xr.fe
    public void halfClosed() {
    }

    @Override // xr.fe, xr.we
    public void onReady() {
    }

    @Override // xr.fe
    public void closed(wr.m6 m6Var) {
    }
}
