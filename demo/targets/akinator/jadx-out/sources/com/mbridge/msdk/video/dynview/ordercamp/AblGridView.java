package com.mbridge.msdk.video.dynview.ordercamp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class AblGridView extends GridView {
    public AblGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public AblGridView(Context context) {
        super(context);
    }

    public AblGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
