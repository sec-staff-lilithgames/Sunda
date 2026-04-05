package j6;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import y3.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j implements x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f69141b;

    public j(m mVar) {
        this.f69141b = mVar;
    }

    @Override // y3.x
    public boolean perform(View view, y3.p pVar) {
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = this.f69141b.f69147d;
        if (viewPager2.isUserInputEnabled()) {
            viewPager2.c(currentItem, true);
        }
        return true;
    }
}
