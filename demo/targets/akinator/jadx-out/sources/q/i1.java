package q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface i1 {
    void animateToVisibility(int i10);

    boolean canShowOverflowMenu();

    void collapseActionView();

    void dismissPopupMenus();

    Context getContext();

    View getCustomView();

    int getDisplayOptions();

    int getDropdownItemCount();

    int getDropdownSelectedPosition();

    int getHeight();

    Menu getMenu();

    int getNavigationMode();

    CharSequence getSubtitle();

    CharSequence getTitle();

    ViewGroup getViewGroup();

    int getVisibility();

    boolean hasEmbeddedTabs();

    boolean hasExpandedActionView();

    boolean hasIcon();

    boolean hasLogo();

    boolean hideOverflowMenu();

    void initIndeterminateProgress();

    void initProgress();

    boolean isOverflowMenuShowPending();

    boolean isOverflowMenuShowing();

    boolean isTitleTruncated();

    void restoreHierarchyState(SparseArray<Parcelable> sparseArray);

    void saveHierarchyState(SparseArray<Parcelable> sparseArray);

    void setBackgroundDrawable(Drawable drawable);

    void setCollapsible(boolean z10);

    void setCustomView(View view);

    void setDefaultNavigationContentDescription(int i10);

    void setDefaultNavigationIcon(Drawable drawable);

    void setDisplayOptions(int i10);

    void setDropdownParams(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener);

    void setDropdownSelectedPosition(int i10);

    void setEmbeddedTabView(androidx.appcompat.widget.k kVar);

    void setHomeButtonEnabled(boolean z10);

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setLogo(int i10);

    void setLogo(Drawable drawable);

    void setMenu(Menu menu, p.z zVar);

    void setMenuCallbacks(p.z zVar, p.k kVar);

    void setMenuPrepared();

    void setNavigationContentDescription(int i10);

    void setNavigationContentDescription(CharSequence charSequence);

    void setNavigationIcon(int i10);

    void setNavigationIcon(Drawable drawable);

    void setNavigationMode(int i10);

    void setSubtitle(CharSequence charSequence);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i10);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    x3.m2 setupAnimatorToVisibility(int i10, long j10);

    boolean showOverflowMenu();
}
