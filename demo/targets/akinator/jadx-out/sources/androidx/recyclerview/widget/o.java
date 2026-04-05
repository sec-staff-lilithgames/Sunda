package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface o {
    void addView(View view, int i10);

    void attachViewToParent(View view, int i10, ViewGroup.LayoutParams layoutParams);

    void detachViewFromParent(int i10);

    View getChildAt(int i10);

    int getChildCount();

    RecyclerView.n getChildViewHolder(View view);

    int indexOfChild(View view);

    void onEnteredHiddenState(View view);

    void onLeftHiddenState(View view);

    void removeAllViews();

    void removeViewAt(int i10);
}
