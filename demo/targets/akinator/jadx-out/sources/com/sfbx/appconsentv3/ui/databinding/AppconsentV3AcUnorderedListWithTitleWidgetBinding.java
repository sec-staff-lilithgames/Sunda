package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.ui.components.widget.ACUnorderedListWidget;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3AcUnorderedListWithTitleWidgetBinding implements a {
    public final ConstraintLayout acUnorderedListWidget;
    public final ACUnorderedListWidget acUnorderedListWithTitleContent;
    public final AppCompatTextView acUnorderedListWithTitleTitleTextview;
    private final ConstraintLayout rootView;

    private AppconsentV3AcUnorderedListWithTitleWidgetBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ACUnorderedListWidget aCUnorderedListWidget, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.acUnorderedListWidget = constraintLayout2;
        this.acUnorderedListWithTitleContent = aCUnorderedListWidget;
        this.acUnorderedListWithTitleTitleTextview = appCompatTextView;
    }

    public static AppconsentV3AcUnorderedListWithTitleWidgetBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = R.id.ac_unordered_list_with_title_content;
        ACUnorderedListWidget aCUnorderedListWidget = (ACUnorderedListWidget) b.findChildViewById(view, i10);
        if (aCUnorderedListWidget != null) {
            i10 = R.id.ac_unordered_list_with_title_title_textview;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i10);
            if (appCompatTextView != null) {
                return new AppconsentV3AcUnorderedListWithTitleWidgetBinding(constraintLayout, constraintLayout, aCUnorderedListWidget, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3AcUnorderedListWithTitleWidgetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3AcUnorderedListWithTitleWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_ac_unordered_list_with_title_widget, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
