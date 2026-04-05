package q;

import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y3 {
    public static void setTooltipText(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            x3.a(view, charSequence);
        } else {
            a4.setTooltipText(view, charSequence);
        }
    }
}
