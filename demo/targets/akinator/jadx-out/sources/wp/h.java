package wp;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f90789a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, Looper looper) {
        super(looper);
        this.f90789a = jVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        j jVar = this.f90789a;
        i iVar = jVar.f90790b;
        if (iVar != null) {
            int i10 = message.what;
            if (i10 == 0) {
                iVar.onVideoLoadingError(jVar);
            } else {
                if (i10 != 1) {
                    return;
                }
                iVar.onVideoLoaded(jVar, (Uri) message.obj);
            }
        }
    }
}
