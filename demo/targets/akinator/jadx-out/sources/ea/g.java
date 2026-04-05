package ea;

import androidx.recyclerview.widget.RecyclerView;
import com.digidust.elokence.akinator.graphic.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class g extends RecyclerView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f53997a = true;

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        super.onScrollStateChanged(recyclerView, i10);
        RecyclerView.f layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof CarouselLayoutManager)) {
            this.f53997a = true;
            return;
        }
        CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) layoutManager;
        if (!this.f53997a && i10 == 0) {
            int iRound = Math.round(carouselLayoutManager.f());
            Integer num = carouselLayoutManager.f21757a;
            int iIntValue = ((num == null ? 0 : num.intValue()) * iRound) - carouselLayoutManager.f21762f.f52251b;
            if (carouselLayoutManager.getOrientation() == 0) {
                recyclerView.smoothScrollBy(iIntValue, 0);
            } else {
                recyclerView.smoothScrollBy(0, iIntValue);
            }
            this.f53997a = true;
        }
        if (1 == i10 || 2 == i10) {
            this.f53997a = false;
        }
    }
}
