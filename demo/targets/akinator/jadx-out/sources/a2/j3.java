package a2;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class j3 extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public boolean f3666b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(Context context) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        int childCount = super.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            }
            if (((j5) childAt).isInvalidated()) {
                this.f3666b = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f3666b = false;
                }
            }
        }
    }

    public final void drawChild$ui_release(j1.e0 canvas, View view, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        super.drawChild(j1.d.getNativeCanvas(canvas), view, j10);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f3666b) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
