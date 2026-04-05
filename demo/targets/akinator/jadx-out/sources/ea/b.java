package ea;

import com.digidust.elokence.akinator.graphic.carousel.CarouselLayoutManager;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f53995b;

    public b(CarouselLayoutManager carouselLayoutManager, int i10) {
        this.f53995b = carouselLayoutManager;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f53995b.f21763g.iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
    }
}
