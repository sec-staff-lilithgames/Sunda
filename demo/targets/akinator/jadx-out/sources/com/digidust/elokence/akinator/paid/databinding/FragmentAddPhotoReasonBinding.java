package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FragmentAddPhotoReasonBinding implements a {
    public final RelativeLayout mainLayout;
    private final RelativeLayout rootView;
    public final TextView textAskReason;
    public final TextView textReasonDuel;
    public final TextView textReasonIncorrect;

    private FragmentAddPhotoReasonBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = relativeLayout;
        this.mainLayout = relativeLayout2;
        this.textAskReason = textView;
        this.textReasonDuel = textView2;
        this.textReasonIncorrect = textView3;
    }

    public static FragmentAddPhotoReasonBinding bind(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i10 = R.id.textAskReason;
        TextView textView = (TextView) b.findChildViewById(view, R.id.textAskReason);
        if (textView != null) {
            i10 = R.id.textReasonDuel;
            TextView textView2 = (TextView) b.findChildViewById(view, R.id.textReasonDuel);
            if (textView2 != null) {
                i10 = R.id.textReasonIncorrect;
                TextView textView3 = (TextView) b.findChildViewById(view, R.id.textReasonIncorrect);
                if (textView3 != null) {
                    return new FragmentAddPhotoReasonBinding(relativeLayout, relativeLayout, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentAddPhotoReasonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAddPhotoReasonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_add_photo_reason, viewGroup, false);
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
