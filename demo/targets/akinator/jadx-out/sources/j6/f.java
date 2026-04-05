package j6;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements i2 {
    @Override // androidx.recyclerview.widget.i2
    public void onChildViewAttachedToWindow(View view) {
        RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) gVar).width != -1 || ((ViewGroup.MarginLayoutParams) gVar).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    @Override // androidx.recyclerview.widget.i2
    public void onChildViewDetachedFromWindow(View view) {
    }
}
