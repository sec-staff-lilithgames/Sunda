package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.sfbx.appconsentv3.ui.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ViewProgressDialogBinding implements a {
    public final LinearLayoutCompat dialogContainer;
    public final ProgressBar progress;
    private final LinearLayoutCompat rootView;
    public final TextView textProgress;

    private AppconsentV3ViewProgressDialogBinding(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, ProgressBar progressBar, TextView textView) {
        this.rootView = linearLayoutCompat;
        this.dialogContainer = linearLayoutCompat2;
        this.progress = progressBar;
        this.textProgress = textView;
    }

    public static AppconsentV3ViewProgressDialogBinding bind(View view) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        int i10 = R.id.progress;
        ProgressBar progressBar = (ProgressBar) b.findChildViewById(view, i10);
        if (progressBar != null) {
            i10 = R.id.text_progress;
            TextView textView = (TextView) b.findChildViewById(view, i10);
            if (textView != null) {
                return new AppconsentV3ViewProgressDialogBinding(linearLayoutCompat, linearLayoutCompat, progressBar, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3ViewProgressDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ViewProgressDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_view_progress_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}
