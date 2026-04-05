package ga;

import android.os.Handler;
import android.os.Message;
import com.digidust.elokence.akinator.graphic.pickerview.lib.WheelView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WheelView f57479a;

    public c(WheelView wheelView) {
        this.f57479a = wheelView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        WheelView wheelView = this.f57479a;
        if (i10 == 1000) {
            wheelView.invalidate();
        } else if (i10 == 2000) {
            wheelView.a(2);
        } else {
            if (i10 != 3000) {
                return;
            }
            wheelView.getClass();
        }
    }
}
