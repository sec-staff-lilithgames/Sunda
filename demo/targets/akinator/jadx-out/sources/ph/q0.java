package ph;

import java.io.Closeable;
import java.util.logging.Level;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class q0 implements r0 {
    @Override // ph.r0
    public final void suppress(Closeable closeable, Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return;
        }
        try {
            th2.addSuppressed(th3);
        } catch (Throwable unused) {
            p0.f81342a.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, th3);
        }
    }
}
