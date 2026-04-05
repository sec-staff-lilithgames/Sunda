package o9;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.digidust.elokence.akinator.activities.SendFormActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l7 implements da.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SendFormActivity f78323a;

    public l7(SendFormActivity sendFormActivity) {
        this.f78323a = sendFormActivity;
    }

    @Override // da.i
    public void onFcmToken() {
        ((ClipboardManager) this.f78323a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ca.m.sharedInstance().getFcmToken()));
    }

    @Override // da.i
    public void onJetonId() {
        ClipboardManager clipboardManager = (ClipboardManager) this.f78323a.getSystemService("clipboard");
        int i10 = SendFormActivity.O;
        clipboardManager.setPrimaryClip(ClipData.newPlainText("label", ca.m.sharedInstance().getFcmToken().split(":")[0]));
    }
}
