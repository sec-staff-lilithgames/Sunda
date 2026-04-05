package e;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.os.ResultReceiver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f52952b;

    public e(ResultReceiver resultReceiver) {
        this.f52952b = resultReceiver;
    }

    @Override // e.b, e.c
    public void send(int i10, Bundle bundle) {
        ResultReceiver resultReceiver = this.f52952b;
        Handler handler = resultReceiver.f4641c;
        if (handler != null) {
            handler.post(new f(resultReceiver, i10, bundle));
        } else {
            resultReceiver.a(i10, bundle);
        }
    }
}
