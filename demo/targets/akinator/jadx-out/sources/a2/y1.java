package a2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y1 extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3888b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3889c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(Context context) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        setClipChildren(false);
        this.f3888b = new HashMap();
        this.f3889c = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void drawView(u2.o view, Canvas canvas) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        view.draw(canvas);
    }

    public final HashMap<u2.o, z1.b0> getHolderToLayoutNode() {
        return this.f3888b;
    }

    public final HashMap<z1.b0, u2.o> getLayoutNodeToHolder() {
        return this.f3889c;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View child, View target) {
        kotlin.jvm.internal.e0.checkNotNullParameter(child, "child");
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Set<u2.o> setKeySet = this.f3888b.keySet();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(setKeySet, "holderToLayoutNode.keys");
        for (u2.o oVar : setKeySet) {
            oVar.layout(oVar.getLeft(), oVar.getTop(), oVar.getRight(), oVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        Set setKeySet = this.f3888b.keySet();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(setKeySet, "holderToLayoutNode.keys");
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            ((u2.o) it.next()).remeasure();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            z1.b0 b0Var = (z1.b0) this.f3888b.get(childAt);
            if (childAt.isLayoutRequested() && b0Var != null) {
                z1.b0.requestRemeasure$ui_release$default(b0Var, false, 1, null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public Void invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }
}
