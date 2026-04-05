package com.sfbx.appconsentv3.ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ViewSwitchBinding;
import com.sfbx.appconsentv3.ui.listener.SwitchViewListener;
import com.sfbx.appconsentv3.ui.util.DrawableExtsKt;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import com.sfbx.appconsentv3.ui.util.ViewExtsKt;
import e3.g;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import m3.a;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class SwitchView extends LinearLayoutCompat {
    public static final Companion Companion = new Companion(null);
    private static final long DURATION = 120;
    private final o appConsentTheme$delegate;
    private int backgroundCorner;
    private final AppconsentV3ViewSwitchBinding binding;
    private int imgPadding;
    private final SwitchView$listener$1 listener;
    private final int minTouchTranslation;
    private int paddingChild;
    private int paddingParent;
    private ConsentStatus status;
    private SwitchViewListener switchListener;
    private final View.OnTouchListener touchListener;
    private float translation;
    private int viewParentId;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConsentStatus.values().length];
            try {
                iArr[ConsentStatus.ALLOWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConsentStatus.DISALLOWED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConsentStatus.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwitchView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        e0.checkNotNullParameter(context, "context");
    }

    private final void disableDrawable(AppCompatImageView appCompatImageView) {
        appCompatImageView.setBackground(null);
        appCompatImageView.setImageDrawable(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enableDrawableOFF() {
        AppCompatImageView appCompatImageView = this.binding.switchDisallowed;
        e0.checkNotNullExpressionValue(appCompatImageView, "binding.switchDisallowed");
        setSwitchDrawable(appCompatImageView, R.drawable.appconsent_ic_v3_switch_disallowed, Integer.valueOf(getAppConsentTheme().getSwitchOffColor$appconsent_ui_v3_prodXchangeRelease()), getAppConsentTheme().getSwitchOffButtonColor$appconsent_ui_v3_prodXchangeRelease());
        AppCompatImageView appCompatImageView2 = this.binding.switchAllowed;
        e0.checkNotNullExpressionValue(appCompatImageView2, "binding.switchAllowed");
        disableDrawable(appCompatImageView2);
        setContainerBackgroundColor(getAppConsentTheme().getSwitchOffColor$appconsent_ui_v3_prodXchangeRelease());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enableDrawableON() {
        AppCompatImageView appCompatImageView = this.binding.switchAllowed;
        e0.checkNotNullExpressionValue(appCompatImageView, "binding.switchAllowed");
        setSwitchDrawable(appCompatImageView, R.drawable.appconsent_ic_v3_switch_allowed, Integer.valueOf(getAppConsentTheme().getSwitchOnColor$appconsent_ui_v3_prodXchangeRelease()), getAppConsentTheme().getSwitchOnButtonColor$appconsent_ui_v3_prodXchangeRelease());
        AppCompatImageView appCompatImageView2 = this.binding.switchDisallowed;
        e0.checkNotNullExpressionValue(appCompatImageView2, "binding.switchDisallowed");
        disableDrawable(appCompatImageView2);
        setContainerBackgroundColor(getAppConsentTheme().getSwitchOnColor$appconsent_ui_v3_prodXchangeRelease());
    }

    private final AppConsentTheme getAppConsentTheme() {
        return (AppConsentTheme) this.appConsentTheme$delegate.getValue();
    }

    private final GradientDrawable getGradientBackground(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setColors(new int[]{getAppConsentTheme().getSwitchOffColor$appconsent_ui_v3_prodXchangeRelease(), getAppConsentTheme().getSwitchOnColor$appconsent_ui_v3_prodXchangeRelease()});
        if (i10 > 0) {
            Context context = getContext();
            e0.checkNotNullExpressionValue(context, "context");
            gradientDrawable.setCornerRadius(ExtensionKt.dpToPx(i10, context));
        }
        return gradientDrawable;
    }

    private final void moveSwitchAllowed() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, this.translation, 0.0f, 0.0f);
        translateAnimation.setDuration(120L);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.sfbx.appconsentv3.ui.view.SwitchView.moveSwitchAllowed.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                e0.checkNotNullParameter(animation, "animation");
                SwitchView.this.enableDrawableON();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                e0.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                e0.checkNotNullParameter(animation, "animation");
            }
        });
        this.binding.switchDisallowed.startAnimation(translateAnimation);
    }

    private final void moveSwitchDisallowed() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -this.translation, 0.0f, 0.0f);
        translateAnimation.setDuration(120L);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.sfbx.appconsentv3.ui.view.SwitchView.moveSwitchDisallowed.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                e0.checkNotNullParameter(animation, "animation");
                SwitchView.this.enableDrawableOFF();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                e0.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                e0.checkNotNullParameter(animation, "animation");
            }
        });
        this.binding.switchAllowed.startAnimation(translateAnimation);
    }

    private final void setContainerBackgroundColor(int i10) {
        ConstraintLayout setContainerBackgroundColor$lambda$3 = this.binding.switchContainer;
        e0.checkNotNullExpressionValue(setContainerBackgroundColor$lambda$3, "setContainerBackgroundColor$lambda$3");
        setContainerBackgroundColor$lambda$3.setBackground(ViewExtsKt.getBackgroundSolid(setContainerBackgroundColor$lambda$3, i10, this.backgroundCorner));
        int i11 = this.paddingChild;
        setContainerBackgroundColor$lambda$3.setPadding(i11, i11, i11, i11);
        int i12 = this.paddingParent;
        setPadding(i12, 0, i12, 0);
    }

    private final void setContainerBackgroundGradient() {
        ConstraintLayout constraintLayout = this.binding.switchContainer;
        constraintLayout.setBackground(getGradientBackground(this.backgroundCorner));
        int i10 = this.paddingChild;
        constraintLayout.setPadding(i10, i10, i10, i10);
        int i11 = this.paddingParent;
        setPadding(i11, 0, i11, 0);
    }

    public static /* synthetic */ void setStatus$default(SwitchView switchView, ConsentStatus consentStatus, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        switchView.setStatus(consentStatus, z10);
    }

    private final void setSwitchDrawable(AppCompatImageView appCompatImageView, Drawable drawable, Integer num, int i10) {
        if (num != null) {
            drawable = DrawableExtsKt.applyTint(drawable, num.intValue());
        }
        appCompatImageView.setImageDrawable(drawable);
        appCompatImageView.setBackground(ViewExtsKt.getBackgroundSolid(appCompatImageView, i10, this.backgroundCorner));
        int i11 = this.imgPadding;
        appCompatImageView.setPadding(i11, i11, i11, i11);
    }

    private final void setSwitchTouchListener(ConsentStatus consentStatus) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[consentStatus.ordinal()];
        if (i10 == 1) {
            this.binding.switchAllowed.setOnTouchListener(this.touchListener);
            this.binding.switchDisallowed.setOnTouchListener(this.touchListener);
            this.binding.switchMixed.setOnTouchListener(null);
            if (hasOnClickListeners()) {
                return;
            }
            setOnClickListener(this.listener);
            return;
        }
        if (i10 == 2) {
            this.binding.switchAllowed.setOnTouchListener(this.touchListener);
            this.binding.switchDisallowed.setOnTouchListener(this.touchListener);
            this.binding.switchMixed.setOnTouchListener(null);
            if (hasOnClickListeners()) {
                return;
            }
            setOnClickListener(this.listener);
            return;
        }
        if (i10 != 3) {
            this.binding.switchAllowed.setOnTouchListener(null);
            this.binding.switchDisallowed.setOnTouchListener(null);
            this.binding.switchMixed.setOnTouchListener(null);
            if (hasOnClickListeners()) {
                setOnClickListener(null);
                return;
            }
            return;
        }
        this.binding.switchAllowed.setOnTouchListener(this.touchListener);
        this.binding.switchDisallowed.setOnTouchListener(this.touchListener);
        this.binding.switchMixed.setOnTouchListener(this.touchListener);
        if (hasOnClickListeners()) {
            return;
        }
        setOnClickListener(this.listener);
    }

    private final void setSwitchVisibility(ConsentStatus consentStatus) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[consentStatus.ordinal()];
        if (i10 == 1) {
            AppCompatImageView appCompatImageView = this.binding.switchAllowed;
            e0.checkNotNullExpressionValue(appCompatImageView, "binding.switchAllowed");
            appCompatImageView.setVisibility(0);
            AppCompatImageView appCompatImageView2 = this.binding.switchDisallowed;
            e0.checkNotNullExpressionValue(appCompatImageView2, "binding.switchDisallowed");
            appCompatImageView2.setVisibility(4);
            AppCompatImageView appCompatImageView3 = this.binding.switchSeparator;
            e0.checkNotNullExpressionValue(appCompatImageView3, "binding.switchSeparator");
            appCompatImageView3.setVisibility(8);
            AppCompatImageView appCompatImageView4 = this.binding.switchMixed;
            e0.checkNotNullExpressionValue(appCompatImageView4, "binding.switchMixed");
            appCompatImageView4.setVisibility(8);
            return;
        }
        if (i10 == 2) {
            AppCompatImageView appCompatImageView5 = this.binding.switchAllowed;
            e0.checkNotNullExpressionValue(appCompatImageView5, "binding.switchAllowed");
            appCompatImageView5.setVisibility(4);
            AppCompatImageView appCompatImageView6 = this.binding.switchDisallowed;
            e0.checkNotNullExpressionValue(appCompatImageView6, "binding.switchDisallowed");
            appCompatImageView6.setVisibility(0);
            AppCompatImageView appCompatImageView7 = this.binding.switchSeparator;
            e0.checkNotNullExpressionValue(appCompatImageView7, "binding.switchSeparator");
            appCompatImageView7.setVisibility(8);
            AppCompatImageView appCompatImageView8 = this.binding.switchMixed;
            e0.checkNotNullExpressionValue(appCompatImageView8, "binding.switchMixed");
            appCompatImageView8.setVisibility(8);
            return;
        }
        if (i10 != 3) {
            AppCompatImageView appCompatImageView9 = this.binding.switchAllowed;
            e0.checkNotNullExpressionValue(appCompatImageView9, "binding.switchAllowed");
            appCompatImageView9.setVisibility(0);
            AppCompatImageView appCompatImageView10 = this.binding.switchDisallowed;
            e0.checkNotNullExpressionValue(appCompatImageView10, "binding.switchDisallowed");
            appCompatImageView10.setVisibility(0);
            AppCompatImageView appCompatImageView11 = this.binding.switchSeparator;
            e0.checkNotNullExpressionValue(appCompatImageView11, "binding.switchSeparator");
            appCompatImageView11.setVisibility(0);
            AppCompatImageView appCompatImageView12 = this.binding.switchMixed;
            e0.checkNotNullExpressionValue(appCompatImageView12, "binding.switchMixed");
            appCompatImageView12.setVisibility(8);
            return;
        }
        AppCompatImageView appCompatImageView13 = this.binding.switchAllowed;
        e0.checkNotNullExpressionValue(appCompatImageView13, "binding.switchAllowed");
        appCompatImageView13.setVisibility(4);
        AppCompatImageView appCompatImageView14 = this.binding.switchDisallowed;
        e0.checkNotNullExpressionValue(appCompatImageView14, "binding.switchDisallowed");
        appCompatImageView14.setVisibility(4);
        AppCompatImageView appCompatImageView15 = this.binding.switchSeparator;
        e0.checkNotNullExpressionValue(appCompatImageView15, "binding.switchSeparator");
        appCompatImageView15.setVisibility(8);
        AppCompatImageView appCompatImageView16 = this.binding.switchMixed;
        e0.checkNotNullExpressionValue(appCompatImageView16, "binding.switchMixed");
        appCompatImageView16.setVisibility(0);
    }

    private final void updateLayoutClickable(ConsentStatus consentStatus) {
        if (consentStatus == ConsentStatus.ALLOWED || consentStatus == ConsentStatus.DISALLOWED) {
            setClickable(true);
            this.binding.switchAllowed.setClickable(false);
            this.binding.switchDisallowed.setClickable(false);
        } else {
            setClickable(false);
            this.binding.switchAllowed.setClickable(true);
            this.binding.switchDisallowed.setClickable(true);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.translation = g.B(this.paddingParent, this.paddingChild, 2, getWidth()) - this.binding.switchAllowed.getWidth();
    }

    public final void setSwitchListener(SwitchViewListener switchListener) {
        e0.checkNotNullParameter(switchListener, "switchListener");
        this.switchListener = switchListener;
    }

    public /* synthetic */ SwitchView(Context context, AttributeSet attributeSet, int i10, u uVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public final void setStatus(ConsentStatus newStatus, boolean z10) {
        e0.checkNotNullParameter(newStatus, "newStatus");
        updateLayoutClickable(newStatus);
        setSwitchVisibility(newStatus);
        setSwitchTouchListener(newStatus);
        int i10 = WhenMappings.$EnumSwitchMapping$0[newStatus.ordinal()];
        if (i10 == 1) {
            if (this.status == ConsentStatus.PENDING || !z10) {
                enableDrawableON();
            } else {
                moveSwitchAllowed();
            }
            this.status = ConsentStatus.ALLOWED;
            return;
        }
        if (i10 == 2) {
            if (this.status == ConsentStatus.PENDING || !z10) {
                enableDrawableOFF();
            } else {
                moveSwitchDisallowed();
            }
            this.status = ConsentStatus.DISALLOWED;
            return;
        }
        if (i10 == 3) {
            GradientDrawable gradientBackground = getGradientBackground(this.backgroundCorner);
            gradientBackground.setSize(this.binding.switchMixed.getDrawable().getMinimumWidth(), this.binding.switchMixed.getDrawable().getMinimumHeight());
            AppCompatImageView appCompatImageView = this.binding.switchMixed;
            e0.checkNotNullExpressionValue(appCompatImageView, PtLatqAYjEFT.xRb);
            setSwitchDrawable(appCompatImageView, gradientBackground, (Integer) null, a.getColor(getContext(), R.color.appconsent_v3_white));
            setContainerBackgroundGradient();
            this.status = ConsentStatus.MIXED;
            return;
        }
        AppCompatImageView appCompatImageView2 = this.binding.switchDisallowed;
        e0.checkNotNullExpressionValue(appCompatImageView2, "binding.switchDisallowed");
        setSwitchDrawable(appCompatImageView2, R.drawable.appconsent_ic_v3_switch_disallowed, Integer.valueOf(getAppConsentTheme().getSwitchUnsetColor$appconsent_ui_v3_prodXchangeRelease()), getAppConsentTheme().getSwitchOffButtonColor$appconsent_ui_v3_prodXchangeRelease());
        AppCompatImageView appCompatImageView3 = this.binding.switchAllowed;
        e0.checkNotNullExpressionValue(appCompatImageView3, "binding.switchAllowed");
        setSwitchDrawable(appCompatImageView3, R.drawable.appconsent_ic_v3_switch_allowed, Integer.valueOf(getAppConsentTheme().getSwitchUnsetColor$appconsent_ui_v3_prodXchangeRelease()), getAppConsentTheme().getSwitchOffButtonColor$appconsent_ui_v3_prodXchangeRelease());
        setContainerBackgroundColor(getAppConsentTheme().getSwitchUnsetColor$appconsent_ui_v3_prodXchangeRelease());
        this.status = ConsentStatus.PENDING;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View$OnClickListener, com.sfbx.appconsentv3.ui.view.SwitchView$listener$1] */
    public SwitchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e0.checkNotNullParameter(context, "context");
        this.backgroundCorner = 50;
        ConsentStatus consentStatus = ConsentStatus.PENDING;
        this.status = consentStatus;
        this.appConsentTheme$delegate = q.lazy(SwitchView$appConsentTheme$2.INSTANCE);
        this.minTouchTranslation = 20;
        ?? r02 = new View.OnClickListener() { // from class: com.sfbx.appconsentv3.ui.view.SwitchView$listener$1
            @Override // android.view.View.OnClickListener
            public void onClick(View v10) {
                e0.checkNotNullParameter(v10, "v");
                int id2 = v10.getId();
                if (!this.this$0.hasOnClickListeners()) {
                    this.this$0.setOnClickListener(this);
                }
                if (id2 == R.id.switch_disallowed) {
                    SwitchView switchView = this.this$0;
                    ConsentStatus consentStatus2 = switchView.status;
                    ConsentStatus consentStatus3 = ConsentStatus.DISALLOWED;
                    if (consentStatus2 == consentStatus3) {
                        consentStatus3 = ConsentStatus.ALLOWED;
                    }
                    SwitchView.setStatus$default(switchView, consentStatus3, false, 2, null);
                    SwitchViewListener switchViewListener = this.this$0.switchListener;
                    if (switchViewListener != null) {
                        switchViewListener.onSwitchChanged(this.this$0.status);
                        return;
                    }
                    return;
                }
                if (id2 == R.id.switch_allowed) {
                    SwitchView switchView2 = this.this$0;
                    ConsentStatus consentStatus4 = switchView2.status;
                    ConsentStatus consentStatus5 = ConsentStatus.ALLOWED;
                    if (consentStatus4 == consentStatus5) {
                        consentStatus5 = ConsentStatus.DISALLOWED;
                    }
                    SwitchView.setStatus$default(switchView2, consentStatus5, false, 2, null);
                    SwitchViewListener switchViewListener2 = this.this$0.switchListener;
                    if (switchViewListener2 != null) {
                        switchViewListener2.onSwitchChanged(this.this$0.status);
                        return;
                    }
                    return;
                }
                if (id2 == R.id.switch_container) {
                    SwitchView switchView3 = this.this$0;
                    ConsentStatus consentStatus6 = switchView3.status;
                    ConsentStatus consentStatus7 = ConsentStatus.ALLOWED;
                    if (consentStatus6 == consentStatus7) {
                        consentStatus7 = ConsentStatus.DISALLOWED;
                    }
                    SwitchView.setStatus$default(switchView3, consentStatus7, false, 2, null);
                    SwitchViewListener switchViewListener3 = this.this$0.switchListener;
                    if (switchViewListener3 != null) {
                        switchViewListener3.onSwitchChanged(this.this$0.status);
                        return;
                    }
                    return;
                }
                if (id2 == this.this$0.viewParentId) {
                    SwitchView switchView4 = this.this$0;
                    ConsentStatus consentStatus8 = switchView4.status;
                    ConsentStatus consentStatus9 = ConsentStatus.ALLOWED;
                    if (consentStatus8 == consentStatus9) {
                        consentStatus9 = ConsentStatus.DISALLOWED;
                    }
                    SwitchView.setStatus$default(switchView4, consentStatus9, false, 2, null);
                    SwitchViewListener switchViewListener4 = this.this$0.switchListener;
                    if (switchViewListener4 != null) {
                        switchViewListener4.onSwitchChanged(this.this$0.status);
                    }
                }
            }
        };
        this.listener = r02;
        AppconsentV3ViewSwitchBinding appconsentV3ViewSwitchBindingInflate = AppconsentV3ViewSwitchBinding.inflate(LayoutInflater.from(context), this, true);
        e0.checkNotNullExpressionValue(appconsentV3ViewSwitchBindingInflate, "inflate(inflater, this, true)");
        this.binding = appconsentV3ViewSwitchBindingInflate;
        this.viewParentId = appconsentV3ViewSwitchBindingInflate.getRoot().getId();
        this.paddingChild = context.getResources().getDimensionPixelSize(R.dimen.appconsent_v3_switch_padding_child);
        this.paddingParent = context.getResources().getDimensionPixelSize(R.dimen.appconsent_v3_switch_padding_parent);
        this.imgPadding = context.getResources().getDimensionPixelSize(R.dimen.appconsent_v3_switch_padding);
        this.backgroundCorner = context.getResources().getDimensionPixelSize(R.dimen.appconsent_v3_switch_background_corner);
        setOrientation(0);
        appconsentV3ViewSwitchBindingInflate.switchContainer.setOnClickListener(r02);
        appconsentV3ViewSwitchBindingInflate.switchDisallowed.setOnClickListener(r02);
        appconsentV3ViewSwitchBindingInflate.switchAllowed.setOnClickListener(r02);
        setStatus$default(this, consentStatus, false, 2, null);
        this.touchListener = new View.OnTouchListener() { // from class: com.sfbx.appconsentv3.ui.view.SwitchView$touchListener$1
            private boolean isActionMove;

            /* renamed from: x, reason: collision with root package name */
            private float f50576x;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View v10, MotionEvent event) {
                e0.checkNotNullParameter(v10, "v");
                e0.checkNotNullParameter(event, "event");
                int action = event.getAction();
                if (action == 0) {
                    this.isActionMove = false;
                    this.f50576x = event.getX();
                    return true;
                }
                if (action == 1) {
                    if (!this.isActionMove) {
                        v10.performClick();
                    }
                    return true;
                }
                if (action != 2) {
                    return false;
                }
                if (v10 == this.this$0.binding.switchAllowed && this.f50576x > event.getX() + this.this$0.minTouchTranslation) {
                    this.isActionMove = true;
                    SwitchView switchView = this.this$0;
                    ConsentStatus consentStatus2 = ConsentStatus.DISALLOWED;
                    SwitchView.setStatus$default(switchView, consentStatus2, false, 2, null);
                    SwitchViewListener switchViewListener = this.this$0.switchListener;
                    if (switchViewListener != null) {
                        switchViewListener.onSwitchChanged(consentStatus2);
                    }
                    return true;
                }
                if (v10 == this.this$0.binding.switchDisallowed && this.f50576x < event.getX() - this.this$0.minTouchTranslation) {
                    this.isActionMove = true;
                    SwitchView switchView2 = this.this$0;
                    ConsentStatus consentStatus3 = ConsentStatus.ALLOWED;
                    SwitchView.setStatus$default(switchView2, consentStatus3, false, 2, null);
                    SwitchViewListener switchViewListener2 = this.this$0.switchListener;
                    if (switchViewListener2 != null) {
                        switchViewListener2.onSwitchChanged(consentStatus3);
                    }
                    return true;
                }
                if (v10 == this.this$0.binding.switchMixed && this.f50576x > event.getX() + this.this$0.minTouchTranslation) {
                    this.isActionMove = true;
                    SwitchView switchView3 = this.this$0;
                    ConsentStatus consentStatus4 = ConsentStatus.DISALLOWED;
                    SwitchView.setStatus$default(switchView3, consentStatus4, false, 2, null);
                    SwitchViewListener switchViewListener3 = this.this$0.switchListener;
                    if (switchViewListener3 != null) {
                        switchViewListener3.onSwitchChanged(consentStatus4);
                    }
                    return true;
                }
                if (v10 != this.this$0.binding.switchMixed || this.f50576x >= event.getX() - this.this$0.minTouchTranslation) {
                    return false;
                }
                this.isActionMove = true;
                SwitchView switchView4 = this.this$0;
                ConsentStatus consentStatus5 = ConsentStatus.ALLOWED;
                SwitchView.setStatus$default(switchView4, consentStatus5, false, 2, null);
                SwitchViewListener switchViewListener4 = this.this$0.switchListener;
                if (switchViewListener4 != null) {
                    switchViewListener4.onSwitchChanged(consentStatus5);
                }
                return true;
            }
        };
    }

    private final void setSwitchDrawable(AppCompatImageView appCompatImageView, int i10, Integer num, int i11) {
        Drawable drawable = a.getDrawable(getContext(), i10);
        e0.checkNotNull(drawable);
        setSwitchDrawable(appCompatImageView, drawable, num, i11);
    }
}
