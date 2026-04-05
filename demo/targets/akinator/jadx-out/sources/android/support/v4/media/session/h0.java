package android.support.v4.media.session;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h0 extends Handler {
    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        int i10 = message.what;
        if (i10 == 1001 || i10 == 1002) {
            throw null;
        }
    }

    public void postCallbackRegistered(int i10, int i11) {
        obtainMessage(1001, i10, i11).sendToTarget();
    }

    public void postCallbackUnregistered(int i10, int i11) {
        obtainMessage(1002, i10, i11).sendToTarget();
    }
}
