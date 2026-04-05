package p;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface a0 {
    boolean collapseItemActionView(m mVar, q qVar);

    boolean expandItemActionView(m mVar, q qVar);

    boolean flagActionItems();

    int getId();

    c0 getMenuView(ViewGroup viewGroup);

    void initForMenu(Context context, m mVar);

    void onCloseMenu(m mVar, boolean z10);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(i0 i0Var);

    void setCallback(z zVar);

    void updateMenuView(boolean z10);
}
