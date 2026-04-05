package sn;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import io.bidmachine.media3.common.util.a1;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class g extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f85979a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, Looper looper) {
        super(looper);
        this.f85979a = lVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        Iterator it = this.f85979a.f86003m.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.hasSessionId(bArr)) {
                if (message.what == 2 && dVar.f85941e == 0 && dVar.f85952p == 4) {
                    a1.castNonNull(dVar.f85958v);
                    dVar.a(false);
                    return;
                }
                return;
            }
        }
    }
}
