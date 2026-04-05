package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.ui.components.widget.ACUnorderedCategoryListWidget;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ActivityIntroductionBinding implements a {
    public final Barrier barrier;
    public final AppCompatImageButton buttonCloseWithoutAccepting;
    public final AppCompatTextView buttonContinueWithoutAccepting;
    public final ConstraintLayout containerContinueWhitoutAccept;
    public final ConstraintLayout intBannerLayout;
    public final ConstraintLayout intBannerVerticalLayout;
    public final ConstraintLayout intLayout;
    public final AppCompatTextView intOnboardingDetails;
    public final AppCompatImageView introAppImage;
    public final ACUnorderedCategoryListWidget introductionActivityAcUnorderedListWidget;
    public final ImageView introductionActivityImageConsentablesApplicationExample;
    public final AppCompatTextView introductionActivityTextConsentableDetailAdditionnalText;
    public final AppCompatTextView introductionActivityTextConsentableDetailSeeMore;
    public final AppCompatButton introductionBtn1;
    public final AppCompatButton introductionBtn2;
    public final AppCompatImageView introductionBtnImgSettingsLeft;
    public final AppCompatImageView introductionBtnImgSettingsRight;
    public final AppCompatButton introductionBtnVertical1;
    public final AppCompatButton introductionBtnVertical2;
    public final AppCompatButton introductionBtnVerticalSettingsBottom;
    public final AppCompatButton introductionBtnVerticalSettingsTop;
    public final AppCompatImageView introductionIllustration;
    public final LinearLayoutCompat layoutTitle;
    private final ConstraintLayout rootView;
    public final NestedScrollView scrollView;
    public final AppCompatTextView textIntroduction;
    public final AppCompatTextView textTitle;

    private AppconsentV3ActivityIntroductionBinding(ConstraintLayout constraintLayout, Barrier barrier, AppCompatImageButton appCompatImageButton, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, ACUnorderedCategoryListWidget aCUnorderedCategoryListWidget, ImageView imageView, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatButton appCompatButton3, AppCompatButton appCompatButton4, AppCompatButton appCompatButton5, AppCompatButton appCompatButton6, AppCompatImageView appCompatImageView4, LinearLayoutCompat linearLayoutCompat, NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6) {
        this.rootView = constraintLayout;
        this.barrier = barrier;
        this.buttonCloseWithoutAccepting = appCompatImageButton;
        this.buttonContinueWithoutAccepting = appCompatTextView;
        this.containerContinueWhitoutAccept = constraintLayout2;
        this.intBannerLayout = constraintLayout3;
        this.intBannerVerticalLayout = constraintLayout4;
        this.intLayout = constraintLayout5;
        this.intOnboardingDetails = appCompatTextView2;
        this.introAppImage = appCompatImageView;
        this.introductionActivityAcUnorderedListWidget = aCUnorderedCategoryListWidget;
        this.introductionActivityImageConsentablesApplicationExample = imageView;
        this.introductionActivityTextConsentableDetailAdditionnalText = appCompatTextView3;
        this.introductionActivityTextConsentableDetailSeeMore = appCompatTextView4;
        this.introductionBtn1 = appCompatButton;
        this.introductionBtn2 = appCompatButton2;
        this.introductionBtnImgSettingsLeft = appCompatImageView2;
        this.introductionBtnImgSettingsRight = appCompatImageView3;
        this.introductionBtnVertical1 = appCompatButton3;
        this.introductionBtnVertical2 = appCompatButton4;
        this.introductionBtnVerticalSettingsBottom = appCompatButton5;
        this.introductionBtnVerticalSettingsTop = appCompatButton6;
        this.introductionIllustration = appCompatImageView4;
        this.layoutTitle = linearLayoutCompat;
        this.scrollView = nestedScrollView;
        this.textIntroduction = appCompatTextView5;
        this.textTitle = appCompatTextView6;
    }

    public static AppconsentV3ActivityIntroductionBinding bind(View view) {
        int i10 = R.id.barrier;
        Barrier barrier = (Barrier) b.findChildViewById(view, i10);
        if (barrier != null) {
            i10 = R.id.button_close_without_accepting;
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) b.findChildViewById(view, i10);
            if (appCompatImageButton != null) {
                i10 = R.id.button_continue_without_accepting;
                AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i10);
                if (appCompatTextView != null) {
                    i10 = R.id.container_continue_whitout_accept;
                    ConstraintLayout constraintLayout = (ConstraintLayout) b.findChildViewById(view, i10);
                    if (constraintLayout != null) {
                        i10 = R.id.int_banner_layout;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) b.findChildViewById(view, i10);
                        if (constraintLayout2 != null) {
                            i10 = R.id.int_banner_vertical_layout;
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) b.findChildViewById(view, i10);
                            if (constraintLayout3 != null) {
                                ConstraintLayout constraintLayout4 = (ConstraintLayout) view;
                                i10 = R.id.int_onboarding_details;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) b.findChildViewById(view, i10);
                                if (appCompatTextView2 != null) {
                                    i10 = R.id.intro_app_image;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) b.findChildViewById(view, i10);
                                    if (appCompatImageView != null) {
                                        i10 = R.id.introduction_activity_ac_unordered_list_widget;
                                        ACUnorderedCategoryListWidget aCUnorderedCategoryListWidget = (ACUnorderedCategoryListWidget) b.findChildViewById(view, i10);
                                        if (aCUnorderedCategoryListWidget != null) {
                                            i10 = R.id.introduction_activity_image_consentables_application_example;
                                            ImageView imageView = (ImageView) b.findChildViewById(view, i10);
                                            if (imageView != null) {
                                                i10 = R.id.introduction_activity_text_consentable_detail_additionnal_text;
                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) b.findChildViewById(view, i10);
                                                if (appCompatTextView3 != null) {
                                                    i10 = R.id.introduction_activity_text_consentable_detail_see_more;
                                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) b.findChildViewById(view, i10);
                                                    if (appCompatTextView4 != null) {
                                                        i10 = R.id.introduction_btn_1;
                                                        AppCompatButton appCompatButton = (AppCompatButton) b.findChildViewById(view, i10);
                                                        if (appCompatButton != null) {
                                                            i10 = R.id.introduction_btn_2;
                                                            AppCompatButton appCompatButton2 = (AppCompatButton) b.findChildViewById(view, i10);
                                                            if (appCompatButton2 != null) {
                                                                i10 = R.id.introduction_btn_img_settings_left;
                                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) b.findChildViewById(view, i10);
                                                                if (appCompatImageView2 != null) {
                                                                    i10 = R.id.introduction_btn_img_settings_right;
                                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) b.findChildViewById(view, i10);
                                                                    if (appCompatImageView3 != null) {
                                                                        i10 = R.id.introduction_btn_vertical_1;
                                                                        AppCompatButton appCompatButton3 = (AppCompatButton) b.findChildViewById(view, i10);
                                                                        if (appCompatButton3 != null) {
                                                                            i10 = R.id.introduction_btn_vertical_2;
                                                                            AppCompatButton appCompatButton4 = (AppCompatButton) b.findChildViewById(view, i10);
                                                                            if (appCompatButton4 != null) {
                                                                                i10 = R.id.introduction_btn_vertical_settings_bottom;
                                                                                AppCompatButton appCompatButton5 = (AppCompatButton) b.findChildViewById(view, i10);
                                                                                if (appCompatButton5 != null) {
                                                                                    i10 = R.id.introduction_btn_vertical_settings_top;
                                                                                    AppCompatButton appCompatButton6 = (AppCompatButton) b.findChildViewById(view, i10);
                                                                                    if (appCompatButton6 != null) {
                                                                                        i10 = R.id.introduction_illustration;
                                                                                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) b.findChildViewById(view, i10);
                                                                                        if (appCompatImageView4 != null) {
                                                                                            i10 = R.id.layout_title;
                                                                                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) b.findChildViewById(view, i10);
                                                                                            if (linearLayoutCompat != null) {
                                                                                                i10 = R.id.scroll_view;
                                                                                                NestedScrollView nestedScrollView = (NestedScrollView) b.findChildViewById(view, i10);
                                                                                                if (nestedScrollView != null) {
                                                                                                    i10 = R.id.text_introduction;
                                                                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) b.findChildViewById(view, i10);
                                                                                                    if (appCompatTextView5 != null) {
                                                                                                        i10 = R.id.text_title;
                                                                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) b.findChildViewById(view, i10);
                                                                                                        if (appCompatTextView6 != null) {
                                                                                                            return new AppconsentV3ActivityIntroductionBinding(constraintLayout4, barrier, appCompatImageButton, appCompatTextView, constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4, appCompatTextView2, appCompatImageView, aCUnorderedCategoryListWidget, imageView, appCompatTextView3, appCompatTextView4, appCompatButton, appCompatButton2, appCompatImageView2, appCompatImageView3, appCompatButton3, appCompatButton4, appCompatButton5, appCompatButton6, appCompatImageView4, linearLayoutCompat, nestedScrollView, appCompatTextView5, appCompatTextView6);
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

    public static AppconsentV3ActivityIntroductionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ActivityIntroductionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_activity_introduction, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
