package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FragmentOldPartageAppsBinding implements a {
    public final ListView appsList;
    public final View cancelView;
    public final RelativeLayout layoutPartage;
    private final RelativeLayout rootView;
    public final TextView textPartage;

    private FragmentOldPartageAppsBinding(RelativeLayout relativeLayout, ListView listView, View view, RelativeLayout relativeLayout2, TextView textView) {
        this.rootView = relativeLayout;
        this.appsList = listView;
        this.cancelView = view;
        this.layoutPartage = relativeLayout2;
        this.textPartage = textView;
    }

    public static FragmentOldPartageAppsBinding bind(View view) {
        int i10 = R.id.appsList;
        ListView listView = (ListView) b.findChildViewById(view, R.id.appsList);
        if (listView != null) {
            i10 = R.id.cancelView;
            View viewFindChildViewById = b.findChildViewById(view, R.id.cancelView);
            if (viewFindChildViewById != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i10 = R.id.textPartage;
                TextView textView = (TextView) b.findChildViewById(view, R.id.textPartage);
                if (textView != null) {
                    return new FragmentOldPartageAppsBinding(relativeLayout, listView, viewFindChildViewById, relativeLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentOldPartageAppsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOldPartageAppsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_old_partage_apps, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
