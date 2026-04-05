package ah;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            message.obj.getClass();
            throw new ClassCastException();
        }
        if (i10 != 1) {
            return false;
        }
        message.obj.getClass();
        throw new ClassCastException();
    }
}
