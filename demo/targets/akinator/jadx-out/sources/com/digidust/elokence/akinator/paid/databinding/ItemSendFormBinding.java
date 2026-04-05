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
public final class ItemSendFormBinding implements a {
    private final RelativeLayout rootView;
    public final TextView textLeftLine;
    public final TextView textRightLine;

    private ItemSendFormBinding(RelativeLayout relativeLayout, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.textLeftLine = textView;
        this.textRightLine = textView2;
    }

    public static ItemSendFormBinding bind(View view) {
        int i10 = R.id.textLeftLine;
        TextView textView = (TextView) b.findChildViewById(view, R.id.textLeftLine);
        if (textView != null) {
            i10 = R.id.textRightLine;
            TextView textView2 = (TextView) b.findChildViewById(view, R.id.textRightLine);
            if (textView2 != null) {
                return new ItemSendFormBinding((RelativeLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemSendFormBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSendFormBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_send_form, viewGroup, false);
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
