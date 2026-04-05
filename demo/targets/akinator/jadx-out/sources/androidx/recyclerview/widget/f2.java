package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f2 implements i3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.f f7120a;

    public f2(RecyclerView.f fVar) {
        this.f7120a = fVar;
    }

    @Override // androidx.recyclerview.widget.i3
    public View getChildAt(int i10) {
        return this.f7120a.getChildAt(i10);
    }

    @Override // androidx.recyclerview.widget.i3
    public int getChildEnd(View view) {
        return this.f7120a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.g) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.i3
    public int getChildStart(View view) {
        return this.f7120a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.g) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.i3
    public int getParentEnd() {
        RecyclerView.f fVar = this.f7120a;
        return fVar.getWidth() - fVar.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.i3
    public int getParentStart() {
        return this.f7120a.getPaddingLeft();
    }
}
