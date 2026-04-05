package o9;

import android.content.Intent;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import com.digidust.elokence.akinator.activities.SendFormActivity;
import com.digidust.elokence.akinator.activities.WebviewCGV;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class k7 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SendFormActivity f78302c;

    public /* synthetic */ k7(SendFormActivity sendFormActivity, int i10) {
        this.f78301b = i10;
        this.f78302c = sendFormActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f78301b;
        SendFormActivity sendFormActivity = this.f78302c;
        switch (i10) {
            case 0:
                int i11 = SendFormActivity.O;
                sendFormActivity.onBackPressed();
                break;
            case 1:
                sendFormActivity.C.clearFocus();
                break;
            case 2:
                if ((!sendFormActivity.D.isChecked() || !sendFormActivity.E.isChecked() || !sendFormActivity.F.isChecked() || !sendFormActivity.G.isChecked()) && sendFormActivity.C.length() != 0) {
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    StringBuilder sb2 = new StringBuilder("mailto:support@elokence.com?subject=");
                    sb2.append(Uri.encode("Akinator / " + sendFormActivity.getChoiceRadioButton()));
                    sb2.append("&body=\n\n");
                    sb2.append(Uri.encode(lb.b1.sharedInstance().getTraductionFromToken("MENU_LAISSER_MESSAGE_DESCRIPTION") + ":\n" + ((Object) sendFormActivity.C.getText()) + "\n\n" + lb.b1.sharedInstance().getTraductionFromToken("MENU_LAISSER_MESSAGE_CAPTURE_D_ECRAN_EXPLICATION") + "\n\n\n" + sendFormActivity.H + "\n\nTechnical Data:\n"));
                    Iterator it = sendFormActivity.K.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        sb2.append(Uri.encode(((String) pair.first) + ": " + ((String) pair.second) + "\n"));
                    }
                    intent.setData(Uri.parse(sb2.toString()));
                    sendFormActivity.startActivity(Intent.createChooser(intent, lb.b1.sharedInstance().getTraductionFromToken("Envoyer un email")));
                    break;
                } else {
                    sendFormActivity.runOnUiThread(new ji.t(sendFormActivity, 28));
                    break;
                }
                break;
            default:
                int i12 = SendFormActivity.O;
                sendFormActivity.getClass();
                Intent intent2 = new Intent(sendFormActivity, (Class<?>) WebviewCGV.class);
                intent2.putExtra("url", "https://cgu.akinator.com/app/privacy/" + lb.b1.sharedInstance().getApplicationLanguage());
                sendFormActivity.startActivity(intent2);
                break;
        }
    }
}
