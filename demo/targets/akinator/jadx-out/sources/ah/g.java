package ah;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class g implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f4425b;

    public g(j jVar) {
        this.f4425b = jVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        j jVar = this.f4425b;
        i iVar = (i) message.obj;
        synchronized (jVar.f4428a) {
            try {
                if (jVar.f4429b == iVar || jVar.f4430c == iVar) {
                    if (iVar.f4426a.get() != null) {
                        throw new ClassCastException();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
