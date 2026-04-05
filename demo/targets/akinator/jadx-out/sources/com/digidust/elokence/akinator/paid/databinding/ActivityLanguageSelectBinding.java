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
public final class ActivityLanguageSelectBinding implements a {
    public final ImageView backImage;
    public final ListView languageList;
    public final RelativeLayout mainLayout;
    public final RelativeLayout relativeBackButton;
    private final RelativeLayout rootView;
    public final TextView scrollLanguageListText;
    public final TextView textTitleLanguage;
    public final RelativeLayout topTitle;

    private ActivityLanguageSelectBinding(RelativeLayout relativeLayout, ImageView imageView, ListView listView, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, TextView textView, TextView textView2, RelativeLayout relativeLayout4) {
        this.rootView = relativeLayout;
        this.backImage = imageView;
        this.languageList = listView;
        this.mainLayout = relativeLayout2;
        this.relativeBackButton = relativeLayout3;
        this.scrollLanguageListText = textView;
        this.textTitleLanguage = textView2;
        this.topTitle = relativeLayout4;
    }

    public static ActivityLanguageSelectBinding bind(View view) {
        int i10 = R.id.backImage;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.backImage);
        if (imageView != null) {
            i10 = R.id.languageList;
            ListView listView = (ListView) b.findChildViewById(view, R.id.languageList);
            if (listView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i10 = R.id.relativeBackButton;
                RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.relativeBackButton);
                if (relativeLayout2 != null) {
                    i10 = R.id.scrollLanguageListText;
                    TextView textView = (TextView) b.findChildViewById(view, R.id.scrollLanguageListText);
                    if (textView != null) {
                        i10 = R.id.textTitleLanguage;
                        TextView textView2 = (TextView) b.findChildViewById(view, R.id.textTitleLanguage);
                        if (textView2 != null) {
                            i10 = R.id.topTitle;
                            RelativeLayout relativeLayout3 = (RelativeLayout) b.findChildViewById(view, R.id.topTitle);
                            if (relativeLayout3 != null) {
                                return new ActivityLanguageSelectBinding(relativeLayout, imageView, listView, relativeLayout, relativeLayout2, textView, textView2, relativeLayout3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityLanguageSelectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityLanguageSelectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_language_select, viewGroup, false);
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
