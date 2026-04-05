package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ItemNetwotkInvitationBinding implements a {
    public final TextView descriptionNetworkInvitation;
    public final ImageView fbImage;
    public final ImageView instaImage;
    public final LinearLayout linearLayoutNetworkInvitation;
    private final RelativeLayout rootView;
    public final TextView titleNetworkInvitation;
    public final ImageView twitterImage;

    private ItemNetwotkInvitationBinding(RelativeLayout relativeLayout, TextView textView, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView2, ImageView imageView3) {
        this.rootView = relativeLayout;
        this.descriptionNetworkInvitation = textView;
        this.fbImage = imageView;
        this.instaImage = imageView2;
        this.linearLayoutNetworkInvitation = linearLayout;
        this.titleNetworkInvitation = textView2;
        this.twitterImage = imageView3;
    }

    public static ItemNetwotkInvitationBinding bind(View view) {
        int i10 = R.id.descriptionNetworkInvitation;
        TextView textView = (TextView) b.findChildViewById(view, R.id.descriptionNetworkInvitation);
        if (textView != null) {
            i10 = R.id.fbImage;
            ImageView imageView = (ImageView) b.findChildViewById(view, R.id.fbImage);
            if (imageView != null) {
                i10 = R.id.instaImage;
                ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.instaImage);
                if (imageView2 != null) {
                    i10 = R.id.linearLayoutNetworkInvitation;
                    LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.linearLayoutNetworkInvitation);
                    if (linearLayout != null) {
                        i10 = R.id.titleNetworkInvitation;
                        TextView textView2 = (TextView) b.findChildViewById(view, R.id.titleNetworkInvitation);
                        if (textView2 != null) {
                            i10 = R.id.twitterImage;
                            ImageView imageView3 = (ImageView) b.findChildViewById(view, R.id.twitterImage);
                            if (imageView3 != null) {
                                return new ItemNetwotkInvitationBinding((RelativeLayout) view, textView, imageView, imageView2, linearLayout, textView2, imageView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemNetwotkInvitationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemNetwotkInvitationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_netwotk_invitation, viewGroup, false);
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
