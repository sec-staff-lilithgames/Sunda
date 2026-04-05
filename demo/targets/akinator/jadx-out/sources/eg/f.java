package eg;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class f extends g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f54360b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CarouselLayoutManager carouselLayoutManager) {
        super(0);
        this.f54360b = carouselLayoutManager;
    }

    @Override // eg.g
    public final int a() {
        CarouselLayoutManager carouselLayoutManager = this.f54360b;
        return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
    }

    @Override // eg.g
    public final int b() {
        return 0;
    }

    @Override // eg.g
    public final int c() {
        return this.f54360b.getWidth();
    }

    public void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3) {
        float f10 = rectF2.left;
        float f11 = rectF3.left;
        if (f10 < f11 && rectF2.right > f11) {
            float f12 = f11 - f10;
            rectF.left += f12;
            rectF2.left += f12;
        }
        float f13 = rectF2.right;
        float f14 = rectF3.right;
        if (f13 <= f14 || rectF2.left >= f14) {
            return;
        }
        float f15 = f13 - f14;
        rectF.right = Math.max(rectF.right - f15, rectF.left);
        rectF2.right = Math.max(rectF2.right - f15, rectF2.left);
    }

    @Override // eg.g
    public final int d() {
        CarouselLayoutManager carouselLayoutManager = this.f54360b;
        if (carouselLayoutManager.q()) {
            return carouselLayoutManager.getWidth();
        }
        return 0;
    }

    @Override // eg.g
    public final int e() {
        return this.f54360b.getPaddingTop();
    }

    public float getMaskMargins(RecyclerView.g gVar) {
        return ((ViewGroup.MarginLayoutParams) gVar).rightMargin + ((ViewGroup.MarginLayoutParams) gVar).leftMargin;
    }

    public RectF getMaskRect(float f10, float f11, float f12, float f13) {
        return new RectF(f13, 0.0f, f11 - f13, f10);
    }

    @Override // eg.g
    public void layoutDecoratedWithMargins(View view, int i10, int i11) {
        CarouselLayoutManager carouselLayoutManager = this.f54360b;
        int paddingTop = carouselLayoutManager.getPaddingTop();
        RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
        this.f54360b.layoutDecoratedWithMargins(view, i10, paddingTop, i11, carouselLayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin + paddingTop);
    }

    public void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.right <= rectF3.left) {
            float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
            rectF.right = fFloor;
            rectF.left = Math.min(rectF.left, fFloor);
        }
        if (rectF2.left >= rectF3.right) {
            float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
            rectF.left = fCeil;
            rectF.right = Math.max(fCeil, rectF.right);
        }
    }

    @Override // eg.g
    public void offsetChild(View view, Rect rect, float f10, float f11) {
        view.offsetLeftAndRight((int) (f11 - (rect.left + f10)));
    }
}
