package j6;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q1;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o extends q1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f69148c;

    public o(ViewPager2 viewPager2) {
        this.f69148c = viewPager2;
    }

    @Override // androidx.recyclerview.widget.q1, androidx.recyclerview.widget.w2
    public View findSnapView(RecyclerView.f fVar) {
        if (this.f69148c.isFakeDragging()) {
            return null;
        }
        return super.findSnapView(fVar);
    }
}
