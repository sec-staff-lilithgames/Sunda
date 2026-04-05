package wp;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import io.bidmachine.iab.vast.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f90782a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, Looper looper) {
        super(looper);
        this.f90782a = gVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        g gVar = this.f90782a;
        f fVar = gVar.f90785e;
        if (fVar != null) {
            int i10 = message.what;
            if (i10 == 0) {
                fVar.onVideoLoadingError(gVar);
            } else {
                if (i10 != 1) {
                    return;
                }
                Pair pair = (Pair) message.obj;
                fVar.onVideoLoaded(gVar, (Uri) pair.first, (t) pair.second);
            }
        }
    }
}
