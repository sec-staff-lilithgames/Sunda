package wp;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f90775a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, Looper looper) {
        super(looper);
        this.f90775a = dVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        d dVar = this.f90775a;
        c cVar = dVar.f90781g;
        if (cVar != null) {
            int i10 = message.what;
            if (i10 == 0) {
                cVar.onFail(dVar);
            } else if (i10 == 1) {
                cVar.onPathSuccess(dVar, (Uri) message.obj);
            } else {
                if (i10 != 2) {
                    return;
                }
                cVar.onImageSuccess(dVar, (Bitmap) message.obj);
            }
        }
    }
}
