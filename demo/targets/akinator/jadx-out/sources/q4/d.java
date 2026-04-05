package q4;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends x3.b {
    @Override // x3.b
    public void onInitializeAccessibilityNodeInfo(View view, y3.c cVar) {
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        if (DrawerLayout.g(view)) {
            return;
        }
        cVar.setParent(null);
    }
}
