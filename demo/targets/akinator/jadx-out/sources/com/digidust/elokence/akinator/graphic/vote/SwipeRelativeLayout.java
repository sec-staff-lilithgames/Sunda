package com.digidust.elokence.akinator.graphic.vote;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class SwipeRelativeLayout extends RelativeLayout {
    public SwipeRelativeLayout(Context context) {
        super(context);
        setClipChildren(false);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        getLayoutParams();
        ArrayList arrayList = new ArrayList();
        View childAt = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = getChildAt(i10);
            if (childAt2 instanceof SwipeDeck) {
                childAt = getChildAt(i10);
            } else {
                arrayList.add(childAt2);
            }
        }
        removeAllViews();
        removeAllViewsInLayout();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            addViewInLayout(view, -1, view.getLayoutParams(), true);
        }
        if (childAt != null) {
            addViewInLayout(childAt, -1, childAt.getLayoutParams(), true);
        }
        invalidate();
        requestLayout();
    }

    public SwipeRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setClipChildren(false);
    }

    public SwipeRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setClipChildren(false);
    }

    public SwipeRelativeLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        setClipChildren(false);
    }
}
