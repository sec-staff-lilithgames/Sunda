package qg;

import android.view.View;
import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class k0 implements Comparator {
    @Override // java.util.Comparator
    public int compare(View view, View view2) {
        return view.getTop() - view2.getTop();
    }
}
