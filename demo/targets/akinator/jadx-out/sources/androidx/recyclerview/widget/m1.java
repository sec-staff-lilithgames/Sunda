package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m1 extends o1 {
    @Override // androidx.recyclerview.widget.o1
    public int getDecoratedEnd(View view) {
        return this.f7206a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.g) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.o1
    public int getDecoratedMeasurement(View view) {
        RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
        return this.f7206a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.o1
    public int getDecoratedMeasurementInOther(View view) {
        RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
        return this.f7206a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.o1
    public int getDecoratedStart(View view) {
        return this.f7206a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.g) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.o1
    public int getEnd() {
        return this.f7206a.getWidth();
    }

    @Override // androidx.recyclerview.widget.o1
    public int getEndAfterPadding() {
        RecyclerView.f fVar = this.f7206a;
        return fVar.getWidth() - fVar.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.o1
    public int getEndPadding() {
        return this.f7206a.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.o1
    public int getMode() {
        return this.f7206a.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.o1
    public int getModeInOther() {
        return this.f7206a.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.o1
    public int getStartAfterPadding() {
        return this.f7206a.getPaddingLeft();
    }

    @Override // androidx.recyclerview.widget.o1
    public int getTotalSpace() {
        RecyclerView.f fVar = this.f7206a;
        return (fVar.getWidth() - fVar.getPaddingLeft()) - fVar.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.o1
    public int getTransformedEndWithDecoration(View view) {
        RecyclerView.f fVar = this.f7206a;
        Rect rect = this.f7208c;
        fVar.getTransformedBoundingBox(view, true, rect);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.o1
    public int getTransformedStartWithDecoration(View view) {
        RecyclerView.f fVar = this.f7206a;
        Rect rect = this.f7208c;
        fVar.getTransformedBoundingBox(view, true, rect);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.o1
    public void offsetChild(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    @Override // androidx.recyclerview.widget.o1
    public void offsetChildren(int i10) {
        this.f7206a.offsetChildrenHorizontal(i10);
    }
}
