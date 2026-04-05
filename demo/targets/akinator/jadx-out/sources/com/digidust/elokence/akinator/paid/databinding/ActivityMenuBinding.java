package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityMenuBinding implements a {
    public final ImageView SwitchTTS;
    public final ImageView backImage;
    public final ItemTopConnectedBinding connectedLayout;
    public final ImageView effectImage;
    public final ImageView facebookLogo;
    public final RelativeLayout layoutPublicite;
    public final RelativeLayout layoutRetirerConsentement;
    public final ScrollView mainLayout;
    public final ImageView musiqueImage;
    public final ItemTopNotConnectedBinding notConnectedLayout;
    public final ImageView planetIcon;
    public final RelativeLayout relativeBackButton;
    private final ScrollView rootView;
    public final TextView textActivationTTS;
    public final TextView textCompte;
    public final TextView textCredit;
    public final TextView textDebugAdSdk;
    public final TextView textEffet;
    public final TextView textLangue;
    public final TextView textLangueChoisi;
    public final TextView textMessage;
    public final TextView textModeEnfant;
    public final TextView textModeEnfantChoisi;
    public final TextView textMusique;
    public final TextView textNote;
    public final TextView textPolitiqueConf;
    public final TextView textPublicite;
    public final RelativeLayout textRelativeCompte;
    public final RelativeLayout textRelativeLangue;
    public final TextView textRestaure;
    public final TextView textRetirerConsentement;
    public final TextView textTitleAchat;
    public final TextView textTitleAvis;
    public final TextView textTitleInformation;
    public final TextView textTitleParam;
    public final RelativeLayout ttsSettings;
    public final ImageView twitterLogo;

    private ActivityMenuBinding(ScrollView scrollView, ImageView imageView, ImageView imageView2, ItemTopConnectedBinding itemTopConnectedBinding, ImageView imageView3, ImageView imageView4, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ScrollView scrollView2, ImageView imageView5, ItemTopNotConnectedBinding itemTopNotConnectedBinding, ImageView imageView6, RelativeLayout relativeLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, RelativeLayout relativeLayout6, ImageView imageView7) {
        this.rootView = scrollView;
        this.SwitchTTS = imageView;
        this.backImage = imageView2;
        this.connectedLayout = itemTopConnectedBinding;
        this.effectImage = imageView3;
        this.facebookLogo = imageView4;
        this.layoutPublicite = relativeLayout;
        this.layoutRetirerConsentement = relativeLayout2;
        this.mainLayout = scrollView2;
        this.musiqueImage = imageView5;
        this.notConnectedLayout = itemTopNotConnectedBinding;
        this.planetIcon = imageView6;
        this.relativeBackButton = relativeLayout3;
        this.textActivationTTS = textView;
        this.textCompte = textView2;
        this.textCredit = textView3;
        this.textDebugAdSdk = textView4;
        this.textEffet = textView5;
        this.textLangue = textView6;
        this.textLangueChoisi = textView7;
        this.textMessage = textView8;
        this.textModeEnfant = textView9;
        this.textModeEnfantChoisi = textView10;
        this.textMusique = textView11;
        this.textNote = textView12;
        this.textPolitiqueConf = textView13;
        this.textPublicite = textView14;
        this.textRelativeCompte = relativeLayout4;
        this.textRelativeLangue = relativeLayout5;
        this.textRestaure = textView15;
        this.textRetirerConsentement = textView16;
        this.textTitleAchat = textView17;
        this.textTitleAvis = textView18;
        this.textTitleInformation = textView19;
        this.textTitleParam = textView20;
        this.ttsSettings = relativeLayout6;
        this.twitterLogo = imageView7;
    }

    public static ActivityMenuBinding bind(View view) {
        int i10 = R.id.SwitchTTS;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.SwitchTTS);
        if (imageView != null) {
            i10 = R.id.backImage;
            ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.backImage);
            if (imageView2 != null) {
                i10 = R.id.connectedLayout;
                View viewFindChildViewById = b.findChildViewById(view, R.id.connectedLayout);
                if (viewFindChildViewById != null) {
                    ItemTopConnectedBinding itemTopConnectedBindingBind = ItemTopConnectedBinding.bind(viewFindChildViewById);
                    i10 = R.id.effectImage;
                    ImageView imageView3 = (ImageView) b.findChildViewById(view, R.id.effectImage);
                    if (imageView3 != null) {
                        i10 = R.id.facebookLogo;
                        ImageView imageView4 = (ImageView) b.findChildViewById(view, R.id.facebookLogo);
                        if (imageView4 != null) {
                            i10 = R.id.layoutPublicite;
                            RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.layoutPublicite);
                            if (relativeLayout != null) {
                                i10 = R.id.layoutRetirerConsentement;
                                RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.layoutRetirerConsentement);
                                if (relativeLayout2 != null) {
                                    ScrollView scrollView = (ScrollView) view;
                                    i10 = R.id.musiqueImage;
                                    ImageView imageView5 = (ImageView) b.findChildViewById(view, R.id.musiqueImage);
                                    if (imageView5 != null) {
                                        i10 = R.id.notConnectedLayout;
                                        View viewFindChildViewById2 = b.findChildViewById(view, R.id.notConnectedLayout);
                                        if (viewFindChildViewById2 != null) {
                                            ItemTopNotConnectedBinding itemTopNotConnectedBindingBind = ItemTopNotConnectedBinding.bind(viewFindChildViewById2);
                                            i10 = R.id.planetIcon;
                                            ImageView imageView6 = (ImageView) b.findChildViewById(view, R.id.planetIcon);
                                            if (imageView6 != null) {
                                                i10 = R.id.relativeBackButton;
                                                RelativeLayout relativeLayout3 = (RelativeLayout) b.findChildViewById(view, R.id.relativeBackButton);
                                                if (relativeLayout3 != null) {
                                                    i10 = R.id.textActivationTTS;
                                                    TextView textView = (TextView) b.findChildViewById(view, R.id.textActivationTTS);
                                                    if (textView != null) {
                                                        i10 = R.id.textCompte;
                                                        TextView textView2 = (TextView) b.findChildViewById(view, R.id.textCompte);
                                                        if (textView2 != null) {
                                                            i10 = R.id.textCredit;
                                                            TextView textView3 = (TextView) b.findChildViewById(view, R.id.textCredit);
                                                            if (textView3 != null) {
                                                                i10 = R.id.textDebugAdSdk;
                                                                TextView textView4 = (TextView) b.findChildViewById(view, R.id.textDebugAdSdk);
                                                                if (textView4 != null) {
                                                                    i10 = R.id.textEffet;
                                                                    TextView textView5 = (TextView) b.findChildViewById(view, R.id.textEffet);
                                                                    if (textView5 != null) {
                                                                        i10 = R.id.textLangue;
                                                                        TextView textView6 = (TextView) b.findChildViewById(view, R.id.textLangue);
                                                                        if (textView6 != null) {
                                                                            i10 = R.id.textLangueChoisi;
                                                                            TextView textView7 = (TextView) b.findChildViewById(view, R.id.textLangueChoisi);
                                                                            if (textView7 != null) {
                                                                                i10 = R.id.textMessage;
                                                                                TextView textView8 = (TextView) b.findChildViewById(view, R.id.textMessage);
                                                                                if (textView8 != null) {
                                                                                    i10 = R.id.textModeEnfant;
                                                                                    TextView textView9 = (TextView) b.findChildViewById(view, R.id.textModeEnfant);
                                                                                    if (textView9 != null) {
                                                                                        i10 = R.id.textModeEnfantChoisi;
                                                                                        TextView textView10 = (TextView) b.findChildViewById(view, R.id.textModeEnfantChoisi);
                                                                                        if (textView10 != null) {
                                                                                            i10 = R.id.textMusique;
                                                                                            TextView textView11 = (TextView) b.findChildViewById(view, R.id.textMusique);
                                                                                            if (textView11 != null) {
                                                                                                i10 = R.id.textNote;
                                                                                                TextView textView12 = (TextView) b.findChildViewById(view, R.id.textNote);
                                                                                                if (textView12 != null) {
                                                                                                    i10 = R.id.textPolitiqueConf;
                                                                                                    TextView textView13 = (TextView) b.findChildViewById(view, R.id.textPolitiqueConf);
                                                                                                    if (textView13 != null) {
                                                                                                        i10 = R.id.textPublicite;
                                                                                                        TextView textView14 = (TextView) b.findChildViewById(view, R.id.textPublicite);
                                                                                                        if (textView14 != null) {
                                                                                                            i10 = R.id.textRelativeCompte;
                                                                                                            RelativeLayout relativeLayout4 = (RelativeLayout) b.findChildViewById(view, R.id.textRelativeCompte);
                                                                                                            if (relativeLayout4 != null) {
                                                                                                                i10 = R.id.textRelativeLangue;
                                                                                                                RelativeLayout relativeLayout5 = (RelativeLayout) b.findChildViewById(view, R.id.textRelativeLangue);
                                                                                                                if (relativeLayout5 != null) {
                                                                                                                    i10 = R.id.textRestaure;
                                                                                                                    TextView textView15 = (TextView) b.findChildViewById(view, R.id.textRestaure);
                                                                                                                    if (textView15 != null) {
                                                                                                                        i10 = R.id.textRetirerConsentement;
                                                                                                                        TextView textView16 = (TextView) b.findChildViewById(view, R.id.textRetirerConsentement);
                                                                                                                        if (textView16 != null) {
                                                                                                                            i10 = R.id.textTitleAchat;
                                                                                                                            TextView textView17 = (TextView) b.findChildViewById(view, R.id.textTitleAchat);
                                                                                                                            if (textView17 != null) {
                                                                                                                                i10 = R.id.textTitleAvis;
                                                                                                                                TextView textView18 = (TextView) b.findChildViewById(view, R.id.textTitleAvis);
                                                                                                                                if (textView18 != null) {
                                                                                                                                    i10 = R.id.textTitleInformation;
                                                                                                                                    TextView textView19 = (TextView) b.findChildViewById(view, R.id.textTitleInformation);
                                                                                                                                    if (textView19 != null) {
                                                                                                                                        i10 = R.id.textTitleParam;
                                                                                                                                        TextView textView20 = (TextView) b.findChildViewById(view, R.id.textTitleParam);
                                                                                                                                        if (textView20 != null) {
                                                                                                                                            i10 = R.id.ttsSettings;
                                                                                                                                            RelativeLayout relativeLayout6 = (RelativeLayout) b.findChildViewById(view, R.id.ttsSettings);
                                                                                                                                            if (relativeLayout6 != null) {
                                                                                                                                                i10 = R.id.twitterLogo;
                                                                                                                                                ImageView imageView7 = (ImageView) b.findChildViewById(view, R.id.twitterLogo);
                                                                                                                                                if (imageView7 != null) {
                                                                                                                                                    return new ActivityMenuBinding(scrollView, imageView, imageView2, itemTopConnectedBindingBind, imageView3, imageView4, relativeLayout, relativeLayout2, scrollView, imageView5, itemTopNotConnectedBindingBind, imageView6, relativeLayout3, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, relativeLayout4, relativeLayout5, textView15, textView16, textView17, textView18, textView19, textView20, relativeLayout6, imageView7);
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

    public static ActivityMenuBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_menu, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public ScrollView getRoot() {
        return this.rootView;
    }
}
