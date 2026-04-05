package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class p extends View {

    /* renamed from: b, reason: collision with root package name */
    public int f5539b;

    /* renamed from: c, reason: collision with root package name */
    public View f5540c;

    /* renamed from: e, reason: collision with root package name */
    public int f5541e;

    public p(Context context) {
        super(context);
        this.f5539b = -1;
        this.f5540c = null;
        this.f5541e = 4;
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        super.setVisibility(this.f5541e);
        this.f5539b = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f5544c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f5539b = typedArrayObtainStyledAttributes.getResourceId(index, this.f5539b);
                } else if (index == 1) {
                    this.f5541e = typedArrayObtainStyledAttributes.getInt(index, this.f5541e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.f5540c;
    }

    public int getEmptyVisibility() {
        return this.f5541e;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View viewFindViewById;
        if (this.f5539b == i10) {
            return;
        }
        View view = this.f5540c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.a) this.f5540c.getLayoutParams()).f5330f0 = false;
            this.f5540c = null;
        }
        this.f5539b = i10;
        if (i10 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f5541e = i10;
    }

    public void updatePostMeasure(ConstraintLayout constraintLayout) {
        if (this.f5540c == null) {
            return;
        }
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        ConstraintLayout.a aVar2 = (ConstraintLayout.a) this.f5540c.getLayoutParams();
        aVar2.f5352q0.setVisibility(0);
        d3.f horizontalDimensionBehaviour = aVar.f5352q0.getHorizontalDimensionBehaviour();
        d3.f fVar = d3.f.f51766b;
        if (horizontalDimensionBehaviour != fVar) {
            aVar.f5352q0.setWidth(aVar2.f5352q0.getWidth());
        }
        if (aVar.f5352q0.getVerticalDimensionBehaviour() != fVar) {
            aVar.f5352q0.setHeight(aVar2.f5352q0.getHeight());
        }
        aVar2.f5352q0.setVisibility(8);
    }

    public void updatePreLayout(ConstraintLayout constraintLayout) {
        if (this.f5539b == -1 && !isInEditMode()) {
            setVisibility(this.f5541e);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f5539b);
        this.f5540c = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.a) viewFindViewById.getLayoutParams()).f5330f0 = true;
            this.f5540c.setVisibility(0);
            setVisibility(0);
        }
    }

    public p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5539b = -1;
        this.f5540c = null;
        this.f5541e = 4;
        a(attributeSet);
    }

    public p(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5539b = -1;
        this.f5540c = null;
        this.f5541e = 4;
        a(attributeSet);
    }

    public p(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.f5539b = -1;
        this.f5540c = null;
        this.f5541e = 4;
        a(attributeSet);
    }
}
