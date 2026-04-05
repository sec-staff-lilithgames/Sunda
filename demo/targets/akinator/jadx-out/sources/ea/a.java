package ea;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.d1;
import com.digidust.elokence.akinator.graphic.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a extends d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f53994a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.f53994a = carouselLayoutManager;
    }

    @Override // androidx.recyclerview.widget.d1
    public int calculateDxToMakeVisible(View view, int i10) {
        CarouselLayoutManager carouselLayoutManager = this.f53994a;
        if (!carouselLayoutManager.canScrollHorizontally()) {
            return 0;
        }
        return Math.round(carouselLayoutManager.g(carouselLayoutManager.getPosition(view)) * (carouselLayoutManager.f21757a != null ? r4.intValue() : 0));
    }

    @Override // androidx.recyclerview.widget.d1
    public int calculateDyToMakeVisible(View view, int i10) {
        CarouselLayoutManager carouselLayoutManager = this.f53994a;
        if (!carouselLayoutManager.canScrollVertically()) {
            return 0;
        }
        return Math.round(carouselLayoutManager.g(carouselLayoutManager.getPosition(view)) * (carouselLayoutManager.f21757a != null ? r4.intValue() : 0));
    }
}
