package q;

import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface n0 {
    void dismiss();

    Drawable getBackground();

    CharSequence getHintText();

    int getHorizontalOffset();

    int getHorizontalOriginalOffset();

    int getVerticalOffset();

    boolean isShowing();

    void setAdapter(ListAdapter listAdapter);

    void setBackgroundDrawable(Drawable drawable);

    void setHorizontalOffset(int i10);

    void setHorizontalOriginalOffset(int i10);

    void setPromptText(CharSequence charSequence);

    void setVerticalOffset(int i10);

    void show(int i10, int i11);
}
