package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g2 implements i3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.f f7122a;

    public g2(RecyclerView.f fVar) {
        this.f7122a = fVar;
    }

    @Override // androidx.recyclerview.widget.i3
    public View getChildAt(int i10) {
        return this.f7122a.getChildAt(i10);
    }

    @Override // androidx.recyclerview.widget.i3
    public int getChildEnd(View view) {
        return this.f7122a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.g) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.i3
    public int getChildStart(View view) {
        return this.f7122a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.g) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.i3
    public int getParentEnd() {
        RecyclerView.f fVar = this.f7122a;
        return fVar.getHeight() - fVar.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.i3
    public int getParentStart() {
        return this.f7122a.getPaddingTop();
    }
}
