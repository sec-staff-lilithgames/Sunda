package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorAddMagicButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityHomeBinding implements a {
    public final DrawerLayout activityDrawerLayout;
    public final ImageView akinatorImage;
    public final ImageView akinatorTete;
    public final ImageView akinatorTitle;
    public final ImageView bgThemeSelection;
    public final ImageView btnSelectionTheme;
    public final ImageView buttonOpenMenu;
    public final ImageView buttonProfile;
    public final FrameLayout containerCross;
    public final RelativeLayout contentFrame;
    public final ProgressBar countdownTimer;
    public final ImageView crossOverlayTheme;
    public final RelativeLayout generalBannerComLayout;
    public final ImageView homeOverlayButton;
    public final LinearLayout homeOverlayMessageLayout;
    public final TextView homeOverlayText;
    public final ListView listViewThemeSelection;
    public final RelativeLayout overlayThemeSelection;
    public final AkinatorAddMagicButton playButton;
    private final DrawerLayout rootView;
    public final TextView textDescriptionGame;
    public final TextView textPanneauChoixTheme;
    public final TextView textSelectionTheme;
    public final ImageView themeImageChoosen;
    public final RelativeLayout themeSelectionLayout;
    public final TextView timerTextView;

    private ActivityHomeBinding(DrawerLayout drawerLayout, DrawerLayout drawerLayout2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, FrameLayout frameLayout, RelativeLayout relativeLayout, ProgressBar progressBar, ImageView imageView8, RelativeLayout relativeLayout2, ImageView imageView9, LinearLayout linearLayout, TextView textView, ListView listView, RelativeLayout relativeLayout3, AkinatorAddMagicButton akinatorAddMagicButton, TextView textView2, TextView textView3, TextView textView4, ImageView imageView10, RelativeLayout relativeLayout4, TextView textView5) {
        this.rootView = drawerLayout;
        this.activityDrawerLayout = drawerLayout2;
        this.akinatorImage = imageView;
        this.akinatorTete = imageView2;
        this.akinatorTitle = imageView3;
        this.bgThemeSelection = imageView4;
        this.btnSelectionTheme = imageView5;
        this.buttonOpenMenu = imageView6;
        this.buttonProfile = imageView7;
        this.containerCross = frameLayout;
        this.contentFrame = relativeLayout;
        this.countdownTimer = progressBar;
        this.crossOverlayTheme = imageView8;
        this.generalBannerComLayout = relativeLayout2;
        this.homeOverlayButton = imageView9;
        this.homeOverlayMessageLayout = linearLayout;
        this.homeOverlayText = textView;
        this.listViewThemeSelection = listView;
        this.overlayThemeSelection = relativeLayout3;
        this.playButton = akinatorAddMagicButton;
        this.textDescriptionGame = textView2;
        this.textPanneauChoixTheme = textView3;
        this.textSelectionTheme = textView4;
        this.themeImageChoosen = imageView10;
        this.themeSelectionLayout = relativeLayout4;
        this.timerTextView = textView5;
    }

    public static ActivityHomeBinding bind(View view) {
        DrawerLayout drawerLayout = (DrawerLayout) view;
        int i10 = R.id.akinatorImage;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.akinatorImage);
        if (imageView != null) {
            i10 = R.id.akinatorTete;
            ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.akinatorTete);
            if (imageView2 != null) {
                i10 = R.id.akinatorTitle;
                ImageView imageView3 = (ImageView) b.findChildViewById(view, R.id.akinatorTitle);
                if (imageView3 != null) {
                    i10 = R.id.bgThemeSelection;
                    ImageView imageView4 = (ImageView) b.findChildViewById(view, R.id.bgThemeSelection);
                    if (imageView4 != null) {
                        i10 = R.id.btn_selectionTheme;
                        ImageView imageView5 = (ImageView) b.findChildViewById(view, R.id.btn_selectionTheme);
                        if (imageView5 != null) {
                            i10 = R.id.buttonOpenMenu;
                            ImageView imageView6 = (ImageView) b.findChildViewById(view, R.id.buttonOpenMenu);
                            if (imageView6 != null) {
                                i10 = R.id.buttonProfile;
                                ImageView imageView7 = (ImageView) b.findChildViewById(view, R.id.buttonProfile);
                                if (imageView7 != null) {
                                    i10 = R.id.containerCross;
                                    FrameLayout frameLayout = (FrameLayout) b.findChildViewById(view, R.id.containerCross);
                                    if (frameLayout != null) {
                                        i10 = R.id.content_frame;
                                        RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.content_frame);
                                        if (relativeLayout != null) {
                                            i10 = R.id.countdownTimer;
                                            ProgressBar progressBar = (ProgressBar) b.findChildViewById(view, R.id.countdownTimer);
                                            if (progressBar != null) {
                                                i10 = R.id.crossOverlayTheme;
                                                ImageView imageView8 = (ImageView) b.findChildViewById(view, R.id.crossOverlayTheme);
                                                if (imageView8 != null) {
                                                    i10 = R.id.generalBannerComLayout;
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.generalBannerComLayout);
                                                    if (relativeLayout2 != null) {
                                                        i10 = R.id.homeOverlayButton;
                                                        ImageView imageView9 = (ImageView) b.findChildViewById(view, R.id.homeOverlayButton);
                                                        if (imageView9 != null) {
                                                            i10 = R.id.homeOverlayMessageLayout;
                                                            LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.homeOverlayMessageLayout);
                                                            if (linearLayout != null) {
                                                                i10 = R.id.homeOverlayText;
                                                                TextView textView = (TextView) b.findChildViewById(view, R.id.homeOverlayText);
                                                                if (textView != null) {
                                                                    i10 = R.id.listViewThemeSelection;
                                                                    ListView listView = (ListView) b.findChildViewById(view, R.id.listViewThemeSelection);
                                                                    if (listView != null) {
                                                                        i10 = R.id.overlayThemeSelection;
                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) b.findChildViewById(view, R.id.overlayThemeSelection);
                                                                        if (relativeLayout3 != null) {
                                                                            i10 = R.id.playButton;
                                                                            AkinatorAddMagicButton akinatorAddMagicButton = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.playButton);
                                                                            if (akinatorAddMagicButton != null) {
                                                                                i10 = R.id.textDescriptionGame;
                                                                                TextView textView2 = (TextView) b.findChildViewById(view, R.id.textDescriptionGame);
                                                                                if (textView2 != null) {
                                                                                    i10 = R.id.textPanneauChoixTheme;
                                                                                    TextView textView3 = (TextView) b.findChildViewById(view, R.id.textPanneauChoixTheme);
                                                                                    if (textView3 != null) {
                                                                                        i10 = R.id.textSelectionTheme;
                                                                                        TextView textView4 = (TextView) b.findChildViewById(view, R.id.textSelectionTheme);
                                                                                        if (textView4 != null) {
                                                                                            i10 = R.id.themeImageChoosen;
                                                                                            ImageView imageView10 = (ImageView) b.findChildViewById(view, R.id.themeImageChoosen);
                                                                                            if (imageView10 != null) {
                                                                                                i10 = R.id.themeSelectionLayout;
                                                                                                RelativeLayout relativeLayout4 = (RelativeLayout) b.findChildViewById(view, R.id.themeSelectionLayout);
                                                                                                if (relativeLayout4 != null) {
                                                                                                    i10 = R.id.timerTextView;
                                                                                                    TextView textView5 = (TextView) b.findChildViewById(view, R.id.timerTextView);
                                                                                                    if (textView5 != null) {
                                                                                                        return new ActivityHomeBinding(drawerLayout, drawerLayout, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, frameLayout, relativeLayout, progressBar, imageView8, relativeLayout2, imageView9, linearLayout, textView, listView, relativeLayout3, akinatorAddMagicButton, textView2, textView3, textView4, imageView10, relativeLayout4, textView5);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityHomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_home, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public DrawerLayout getRoot() {
        return this.rootView;
    }
}
