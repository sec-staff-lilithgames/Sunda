package eg;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class e extends g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f54359b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CarouselLayoutManager carouselLayoutManager) {
        super(1);
        this.f54359b = carouselLayoutManager;
    }

    @Override // eg.g
    public final int a() {
        return this.f54359b.getHeight();
    }

    @Override // eg.g
    public final int b() {
        return this.f54359b.getPaddingLeft();
    }

    @Override // eg.g
    public final int c() {
        CarouselLayoutManager carouselLayoutManager = this.f54359b;
        return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
    }

    public void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3) {
        float f10 = rectF2.top;
        float f11 = rectF3.top;
        if (f10 < f11 && rectF2.bottom > f11) {
            float f12 = f11 - f10;
            rectF.top += f12;
            rectF3.top += f12;
        }
        float f13 = rectF2.bottom;
        float f14 = rectF3.bottom;
        if (f13 <= f14 || rectF2.top >= f14) {
            return;
        }
        float f15 = f13 - f14;
        rectF.bottom = Math.max(rectF.bottom - f15, rectF.top);
        rectF2.bottom = Math.max(rectF2.bottom - f15, rectF2.top);
    }

    @Override // eg.g
    public final int d() {
        return 0;
    }

    @Override // eg.g
    public final int e() {
        return 0;
    }

    public float getMaskMargins(RecyclerView.g gVar) {
        return ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
    }

    public RectF getMaskRect(float f10, float f11, float f12, float f13) {
        return new RectF(0.0f, f12, f11, f10 - f12);
    }

    @Override // eg.g
    public void layoutDecoratedWithMargins(View view, int i10, int i11) {
        CarouselLayoutManager carouselLayoutManager = this.f54359b;
        int paddingLeft = carouselLayoutManager.getPaddingLeft();
        RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
        this.f54359b.layoutDecoratedWithMargins(view, paddingLeft, i10, carouselLayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin + paddingLeft, i11);
    }

    public void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.bottom <= rectF3.top) {
            float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
            rectF.bottom = fFloor;
            rectF.top = Math.min(rectF.top, fFloor);
        }
        if (rectF2.top >= rectF3.bottom) {
            float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
            rectF.top = fCeil;
            rectF.bottom = Math.max(fCeil, rectF.bottom);
        }
    }

    @Override // eg.g
    public void offsetChild(View view, Rect rect, float f10, float f11) {
        view.offsetTopAndBottom((int) (f11 - (rect.top + f10)));
    }
}
