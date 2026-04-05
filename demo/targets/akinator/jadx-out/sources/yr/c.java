package yr;

import java.io.IOException;
import java.net.Socket;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f94843b;

    public c(f fVar) {
        this.f94843b = fVar;
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        f fVar = this.f94843b;
        try {
            if (fVar.f94895k != null && fVar.f94888c.size() > 0) {
                pw.z0 z0Var = fVar.f94895k;
                pw.g gVar = fVar.f94888c;
                z0Var.write(gVar, gVar.size());
            }
        } catch (IOException e10) {
            fVar.f94890f.onException(e10);
        }
        fVar.f94888c.close();
        try {
            pw.z0 z0Var2 = fVar.f94895k;
            if (z0Var2 != null) {
                z0Var2.close();
            }
        } catch (IOException e11) {
            fVar.f94890f.onException(e11);
        }
        try {
            Socket socket = fVar.f94896l;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e12) {
            fVar.f94890f.onException(e12);
        }
    }
}
