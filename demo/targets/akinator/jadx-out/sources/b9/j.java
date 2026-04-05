package b9;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f8950b;

    public j(k kVar) {
        this.f8950b = kVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        k kVar = this.f8950b;
        if (i10 == 1) {
            kVar.b((h) message.obj);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        kVar.f8954d.clear((h) message.obj);
        return false;
    }
}
