package eg;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class d extends RecyclerView.e {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f54357a;

    /* renamed from: b, reason: collision with root package name */
    public List f54358b;

    public d() {
        Paint paint = new Paint();
        this.f54357a = paint;
        this.f54358b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.l lVar) throws Resources.NotFoundException {
        Canvas canvas2;
        super.onDrawOver(canvas, recyclerView, lVar);
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f54357a;
        paint.setStrokeWidth(dimension);
        for (j jVar : this.f54358b) {
            paint.setColor(o3.b.blendARGB(-65281, -16776961, jVar.f54375c));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).isHorizontal()) {
                canvas2 = canvas;
                canvas2.drawLine(jVar.f54374b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f29078k.e(), jVar.f54374b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f29078k.a(), paint);
            } else {
                float fB = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f29078k.b();
                float f10 = jVar.f54374b;
                float fC = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f29078k.c();
                float f11 = jVar.f54374b;
                canvas2 = canvas;
                canvas2.drawLine(fB, f10, fC, f11, paint);
            }
            canvas = canvas2;
        }
    }
}
