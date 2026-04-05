package android.support.v4.media.session;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaSessionCompat.a f4620a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(MediaSessionCompat.a aVar, Looper looper) {
        super(looper);
        this.f4620a = aVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        x xVar;
        MediaSessionCompat.a aVar;
        v vVar;
        if (message.what == 1) {
            synchronized (this.f4620a.f4556a) {
                xVar = (x) this.f4620a.f4559d.get();
                aVar = this.f4620a;
                vVar = aVar.f4560e;
            }
            if (xVar == null || aVar != xVar.getCallback() || vVar == null) {
                return;
            }
            xVar.setCurrentControllerInfo((androidx.media.l0) message.obj);
            this.f4620a.a(xVar, vVar);
            xVar.setCurrentControllerInfo(null);
        }
    }
}
