package androidx.appcompat.app;

import android.os.Message;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertController f4737b;

    public g(AlertController alertController) {
        this.f4737b = alertController;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        AlertController alertController = this.f4737b;
        Message messageObtain = (view != alertController.f4675o || (message3 = alertController.f4677q) == null) ? (view != alertController.f4679s || (message2 = alertController.f4681u) == null) ? (view != alertController.f4683w || (message = alertController.f4685y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
        if (messageObtain != null) {
            messageObtain.sendToTarget();
        }
        alertController.R.obtainMessage(1, alertController.f4662b).sendToTarget();
    }
}
