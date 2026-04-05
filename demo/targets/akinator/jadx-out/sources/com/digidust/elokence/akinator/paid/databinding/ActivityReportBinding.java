package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityReportBinding implements a {
    public final ImageView backgroundFond;
    public final RelativeLayout mainLayout;
    public final ListView reportAnswerList;
    private final RelativeLayout rootView;
    public final TextView textReport;

    private ActivityReportBinding(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, ListView listView, TextView textView) {
        this.rootView = relativeLayout;
        this.backgroundFond = imageView;
        this.mainLayout = relativeLayout2;
        this.reportAnswerList = listView;
        this.textReport = textView;
    }

    public static ActivityReportBinding bind(View view) {
        int i10 = R.id.backgroundFond;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.backgroundFond);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i10 = R.id.reportAnswerList;
            ListView listView = (ListView) b.findChildViewById(view, R.id.reportAnswerList);
            if (listView != null) {
                i10 = R.id.textReport;
                TextView textView = (TextView) b.findChildViewById(view, R.id.textReport);
                if (textView != null) {
                    return new ActivityReportBinding(relativeLayout, imageView, relativeLayout, listView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityReportBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityReportBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_report, viewGroup, false);
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
