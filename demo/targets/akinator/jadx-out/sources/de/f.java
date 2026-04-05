package de;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.util.n1;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.drm.b f52125a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.google.android.exoplayer2.drm.b bVar, Looper looper) {
        super(looper);
        this.f52125a = bVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        Iterator it = this.f52125a.f27420m.iterator();
        while (it.hasNext()) {
            com.google.android.exoplayer2.drm.a aVar = (com.google.android.exoplayer2.drm.a) it.next();
            if (aVar.hasSessionId(bArr)) {
                if (message.what == 2 && aVar.f27380e == 0 && aVar.f27391p == 4) {
                    n1.castNonNull(aVar.f27397v);
                    aVar.a(false);
                    return;
                }
                return;
            }
        }
    }
}
