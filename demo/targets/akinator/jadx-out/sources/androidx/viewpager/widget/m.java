package androidx.viewpager.widget;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m implements Comparator {
    @Override // java.util.Comparator
    public int compare(View view, View view2) {
        ViewPager.a aVar = (ViewPager.a) view.getLayoutParams();
        ViewPager.a aVar2 = (ViewPager.a) view2.getLayoutParams();
        boolean z10 = aVar.f7345a;
        return z10 != aVar2.f7345a ? z10 ? 1 : -1 : aVar.f7349e - aVar2.f7349e;
    }
}
