package eg;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.d1;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class c extends d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f54356a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.f54356a = carouselLayoutManager;
    }

    @Override // androidx.recyclerview.widget.d1
    public int calculateDxToMakeVisible(View view, int i10) {
        CarouselLayoutManager carouselLayoutManager = this.f54356a;
        if (carouselLayoutManager.f29074g == null || !carouselLayoutManager.isHorizontal()) {
            return 0;
        }
        int position = carouselLayoutManager.getPosition(view);
        return (int) (carouselLayoutManager.f29068a - carouselLayoutManager.n(position, carouselLayoutManager.m(position)));
    }

    @Override // androidx.recyclerview.widget.d1
    public int calculateDyToMakeVisible(View view, int i10) {
        CarouselLayoutManager carouselLayoutManager = this.f54356a;
        if (carouselLayoutManager.f29074g == null || carouselLayoutManager.isHorizontal()) {
            return 0;
        }
        int position = carouselLayoutManager.getPosition(view);
        return (int) (carouselLayoutManager.f29068a - carouselLayoutManager.n(position, carouselLayoutManager.m(position)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public PointF computeScrollVectorForPosition(int i10) {
        return this.f54356a.computeScrollVectorForPosition(i10);
    }
}
