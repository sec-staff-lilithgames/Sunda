package da;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class k extends Dialog {
    public k(Context context) {
        super(context);
    }

    public static k show(Context context) {
        k kVar = new k(context);
        if (kVar.getWindow() != null) {
            kVar.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            kVar.getWindow().requestFeature(1);
        }
        kVar.setContentView(R.layout.layout_loading);
        kVar.setCancelable(false);
        kVar.show();
        return kVar;
    }

    public void setText(String str) {
        TextView textView = (TextView) findViewById(R.id.textInLoading);
        if (textView != null) {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    public k(Context context, int i10) {
        super(context, i10);
    }
}
