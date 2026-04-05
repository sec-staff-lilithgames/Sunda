package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityNetworkInvitationBinding implements a {
    public final ImageView akinatorImage;
    public final Button buttonNoNetworkInvitation;
    public final ImageView crossNetworkInvitation;
    public final ItemNetwotkInvitationBinding itemNetworkInvitation;
    public final RelativeLayout mainLayout;
    private final RelativeLayout rootView;

    private ActivityNetworkInvitationBinding(RelativeLayout relativeLayout, ImageView imageView, Button button, ImageView imageView2, ItemNetwotkInvitationBinding itemNetwotkInvitationBinding, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.akinatorImage = imageView;
        this.buttonNoNetworkInvitation = button;
        this.crossNetworkInvitation = imageView2;
        this.itemNetworkInvitation = itemNetwotkInvitationBinding;
        this.mainLayout = relativeLayout2;
    }

    public static ActivityNetworkInvitationBinding bind(View view) {
        int i10 = R.id.akinatorImage;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.akinatorImage);
        if (imageView != null) {
            i10 = R.id.buttonNoNetworkInvitation;
            Button button = (Button) b.findChildViewById(view, R.id.buttonNoNetworkInvitation);
            if (button != null) {
                i10 = R.id.crossNetworkInvitation;
                ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.crossNetworkInvitation);
                if (imageView2 != null) {
                    i10 = R.id.itemNetworkInvitation;
                    View viewFindChildViewById = b.findChildViewById(view, R.id.itemNetworkInvitation);
                    if (viewFindChildViewById != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        return new ActivityNetworkInvitationBinding(relativeLayout, imageView, button, imageView2, ItemNetwotkInvitationBinding.bind(viewFindChildViewById), relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityNetworkInvitationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityNetworkInvitationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_network_invitation, viewGroup, false);
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
