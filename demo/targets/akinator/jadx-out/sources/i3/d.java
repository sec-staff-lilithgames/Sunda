package i3;

import android.view.View;
import java.util.Comparator;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements Comparator {
    @Override // java.util.Comparator
    public int compare(View view, View view2) {
        float z10 = z1.getZ(view);
        float z11 = z1.getZ(view2);
        if (z10 > z11) {
            return -1;
        }
        return z10 < z11 ? 1 : 0;
    }
}
