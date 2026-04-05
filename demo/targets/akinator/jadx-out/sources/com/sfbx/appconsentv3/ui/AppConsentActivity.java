package com.sfbx.appconsentv3.ui;

import a2.s;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.m;
import androidx.appcompat.app.v;
import com.applovin.impl.k9;
import com.applovin.impl.sdk.ad.f;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ViewProgressDialogBinding;
import com.sfbx.appconsentv3.ui.di.UIInjector;
import com.sfbx.appconsentv3.ui.viewmodel.AbstractTrackingViewModel;
import com.sfbx.appconsentv3.ui.viewmodel.ViewModelFactory;
import io.sfbx.appconsent.logger.ACLogger;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import o3.b;
import o3.c;
import tu.o;
import tu.q;
import x3.d4;
import x3.e3;
import x3.r2;
import x3.t3;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class AppConsentActivity extends AppCompatActivity {
    private final o appConsentTheme$delegate;
    private final boolean dialogMode;
    private final o progress$delegate;
    private final o viewModelFactory$delegate;
    private AppconsentV3ViewProgressDialogBinding viewProgressDialogBinding;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SpecialMetricParam {
        private final int consentableId;
        private final ConsentStatus newStatus;
        private final ConsentableType type;

        public SpecialMetricParam(int i10, ConsentableType type, ConsentStatus newStatus) {
            e0.checkNotNullParameter(type, "type");
            e0.checkNotNullParameter(newStatus, "newStatus");
            this.consentableId = i10;
            this.type = type;
            this.newStatus = newStatus;
        }

        public static /* synthetic */ SpecialMetricParam copy$default(SpecialMetricParam specialMetricParam, int i10, ConsentableType consentableType, ConsentStatus consentStatus, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = specialMetricParam.consentableId;
            }
            if ((i11 & 2) != 0) {
                consentableType = specialMetricParam.type;
            }
            if ((i11 & 4) != 0) {
                consentStatus = specialMetricParam.newStatus;
            }
            return specialMetricParam.copy(i10, consentableType, consentStatus);
        }

        public final int component1() {
            return this.consentableId;
        }

        public final ConsentableType component2() {
            return this.type;
        }

        public final ConsentStatus component3() {
            return this.newStatus;
        }

        public final SpecialMetricParam copy(int i10, ConsentableType type, ConsentStatus newStatus) {
            e0.checkNotNullParameter(type, "type");
            e0.checkNotNullParameter(newStatus, "newStatus");
            return new SpecialMetricParam(i10, type, newStatus);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpecialMetricParam)) {
                return false;
            }
            SpecialMetricParam specialMetricParam = (SpecialMetricParam) obj;
            return this.consentableId == specialMetricParam.consentableId && this.type == specialMetricParam.type && this.newStatus == specialMetricParam.newStatus;
        }

        public final int getConsentableId() {
            return this.consentableId;
        }

        public final ConsentStatus getNewStatus() {
            return this.newStatus;
        }

        public final ConsentableType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.newStatus.hashCode() + ((this.type.hashCode() + (Integer.hashCode(this.consentableId) * 31)) * 31);
        }

        public String toString() {
            return "SpecialMetricParam(consentableId=" + this.consentableId + ", type=" + this.type + ", newStatus=" + this.newStatus + ')';
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConsentableType.values().length];
            try {
                iArr[ConsentableType.PURPOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConsentableType.EXTRA_PURPOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConsentableType.SPECIAL_PURPOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConsentableType.EXTRA_SPECIAL_PURPOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AppConsentActivity() {
        this(false, 1, null);
    }

    private final void applyInsetsToView(c cVar, View view, boolean z10, AppConsentTheme appConsentTheme, boolean z11) {
        boolean enableIllustrations$appconsent_ui_v3_prodXchangeRelease = appConsentTheme.getEnableIllustrations$appconsent_ui_v3_prodXchangeRelease();
        Resources resources = view.getContext().getResources();
        e0.checkNotNullExpressionValue(resources, "view.context.resources");
        updateLayoutParams(view, cVar, (z10 && z11 && enableIllustrations$appconsent_ui_v3_prodXchangeRelease) ? 0 : cVar.f77433b + getCustomMarginTop(z10, enableIllustrations$appconsent_ui_v3_prodXchangeRelease, z11, resources));
    }

    private final void applyWindowInsetsListener(View view, boolean z10, AppConsentTheme appConsentTheme, boolean z11) {
        z1.setOnApplyWindowInsetsListener(view, new f(this, z10, appConsentTheme, z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e3 applyWindowInsetsListener$lambda$3(AppConsentActivity this$0, boolean z10, AppConsentTheme appConsentTheme, boolean z11, View v10, e3 windowInsets) throws Throwable {
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNullParameter(appConsentTheme, "$appConsentTheme");
        e0.checkNotNullExpressionValue(windowInsets, "windowInsets");
        e0.checkNotNullExpressionValue(v10, "v");
        this$0.executeWindowsInsetsListener$appconsent_ui_v3_prodXchangeRelease(windowInsets, v10, z10, appConsentTheme, z11);
        return e3.f91568b;
    }

    private final void defineEdgeToEdgeCompat(View view, AppConsentTheme appConsentTheme, boolean z10, boolean z11, boolean z12) {
        try {
            if (UIInjector.INSTANCE.isAppRuntimeAndTargetAPI35OrAbove$appconsent_ui_v3_prodXchangeRelease()) {
                Window window = getWindow();
                e0.checkNotNullExpressionValue(window, "window");
                try {
                    updateAppearanceLightStatusBars(z10, z11, appConsentTheme, view, window);
                    if (z12) {
                        applyWindowInsetsListener(view, z10, appConsentTheme, z11);
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
    }

    public static /* synthetic */ void defineEdgeToEdgeCompat$default(AppConsentActivity appConsentActivity, View view, AppConsentTheme appConsentTheme, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defineEdgeToEdgeCompat");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z13 = z10;
        if ((i10 & 16) != 0) {
            z12 = true;
        }
        appConsentActivity.defineEdgeToEdgeCompat(view, appConsentTheme, z13, z11, z12);
    }

    private final void defineStatusBarColor() {
        if (UIInjector.INSTANCE.isAppRuntimeAndTargetAPI35OrAbove$appconsent_ui_v3_prodXchangeRelease() || getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getStatusBarColor$appconsent_ui_v3_prodXchangeRelease() == 0) {
            return;
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getStatusBarColor$appconsent_ui_v3_prodXchangeRelease());
    }

    public static /* synthetic */ void displaySpinner$default(AppConsentActivity appConsentActivity, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: displaySpinner");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        appConsentActivity.displaySpinner(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void displaySpinner$lambda$1(boolean z10, AppConsentActivity this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        if (z10) {
            this$0.getProgress().show();
        } else if (this$0.getProgress().isShowing()) {
            this$0.getProgress().dismiss();
        }
    }

    private final int getCustomMarginTop(boolean z10, boolean z11, boolean z12, Resources resources) throws Resources.NotFoundException {
        float dimension;
        if (!z10) {
            dimension = resources.getDimension(R.dimen.appconsent_v3_margin_large);
        } else {
            if (z11 || !z12) {
                return 0;
            }
            dimension = resources.getDimension(R.dimen.appconsent_v3_margin_xs);
        }
        return (int) dimension;
    }

    private final c getInsets(e3 e3Var) {
        try {
            return e3Var.getInsets(t3.systemBars());
        } catch (Exception unused) {
            return null;
        }
    }

    private final m getProgress() {
        return (m) this.progress$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStop$lambda$0(AppConsentActivity this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.getProgress().dismiss();
    }

    private final void removeWindowInsetsListener(View view) {
        try {
            z1.setOnApplyWindowInsetsListener(view, null);
        } catch (Exception unused) {
        }
    }

    private final void resizePopupWindowSizeIfPopupModeIsActivated(boolean z10) {
        if (!this.dialogMode || z10) {
            return;
        }
        try {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            getWindow().setLayout((int) (displayMetrics.widthPixels * 0.9f), (int) (displayMetrics.heightPixels * 0.85f));
        } catch (Throwable th2) {
            ACLogger aCLogger = ACLogger.INSTANCE;
            e0.checkNotNullExpressionValue("AppConsentActivity", "AppConsentActivity::class.java.simpleName");
            aCLogger.e("AppConsentActivity", "Unable to force resize dialog", th2);
        }
    }

    private final void setCustomContentView(View view, boolean z10, boolean z11, boolean z12) {
        setContentView(view);
        resizePopupWindowSizeIfPopupModeIsActivated(z11);
        defineEdgeToEdgeCompat(view, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease(), z10, z11, z12);
    }

    public static /* synthetic */ void setCustomContentView$default(AppConsentActivity appConsentActivity, View view, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCustomContentView");
        }
        if ((i10 & 8) != 0) {
            z12 = true;
        }
        appConsentActivity.setCustomContentView(view, z10, z11, z12);
    }

    private final void updateAppearanceLightStatusBars(boolean z10, boolean z11, AppConsentTheme appConsentTheme, View view, Window window) {
        d4 insetsController;
        try {
            boolean z12 = true;
            if ((!(z10 & z11 & (!appConsentTheme.getEnableIllustrations$appconsent_ui_v3_prodXchangeRelease())) && !(!z10)) || (insetsController = r2.getInsetsController(window, view)) == null) {
                return;
            }
            if (b.calculateContrast(insetsController.isAppearanceLightStatusBars() ? -1 : -7829368, appConsentTheme.getBannerBackgroundColor$appconsent_ui_v3_prodXchangeRelease()) <= 1.5d) {
                z12 = false;
            }
            insetsController.setAppearanceLightStatusBars(z12);
        } catch (Exception unused) {
        }
    }

    private final void updateLayoutParams(View view, c cVar, int i10) {
        try {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = cVar.f77432a;
            marginLayoutParams.bottomMargin = cVar.f77435d;
            marginLayoutParams.rightMargin = cVar.f77434c;
            marginLayoutParams.topMargin = i10;
            view.setLayoutParams(marginLayoutParams);
        } catch (Exception unused) {
        }
    }

    private final void updateOrientation() {
        if ((getResources().getConfiguration().screenLayout & 15) == 2 || (getResources().getConfiguration().screenLayout & 15) == 1 || !getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getTabletModalScreen$appconsent_ui_v3_prodXchangeRelease()) {
            return;
        }
        updateOrientationViewSize();
    }

    private final void updateOrientationViewSize() {
        int iWidth;
        int iHeight;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = getWindowManager().getCurrentWindowMetrics();
            e0.checkNotNullExpressionValue(currentWindowMetrics, "windowManager.currentWindowMetrics");
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
            e0.checkNotNullExpressionValue(insetsIgnoringVisibility, "windowMetrics.windowInse…Insets.Type.systemBars())");
            currentWindowMetrics.getBounds().width();
            int unused = insetsIgnoringVisibility.left;
            iWidth = currentWindowMetrics.getBounds().width();
            iHeight = currentWindowMetrics.getBounds().height();
        } else {
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i10 = point.x;
            int i11 = point.y;
            iWidth = i10;
            iHeight = i11;
        }
        float f10 = iHeight;
        float f11 = iWidth;
        float f12 = f10 / f11;
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (getResources().getConfiguration().orientation == 1) {
            attributes.height = iWidth;
            attributes.width = (int) (f11 / f12);
        } else {
            attributes.height = iHeight;
            attributes.width = (int) (f10 / (f11 / f10));
        }
        attributes.alpha = 1.0f;
        attributes.dimAmount = 0.5f;
        Window window = getWindow();
        e0.checkNotNull(attributes, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        window.setAttributes(attributes);
    }

    private final void updateTheme() {
        if (this.dialogMode) {
            return;
        }
        setTheme(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getTheme$appconsent_ui_v3_prodXchangeRelease());
    }

    public void displaySpinner(boolean z10) {
        runOnUiThread(new k9(z10, this, 2));
    }

    public final void executeWindowsInsetsListener$appconsent_ui_v3_prodXchangeRelease(e3 windowInsets, View view, boolean z10, AppConsentTheme appConsentTheme, boolean z11) throws Throwable {
        View view2;
        e0.checkNotNullParameter(windowInsets, "windowInsets");
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(appConsentTheme, "appConsentTheme");
        try {
            c insets = getInsets(windowInsets);
            if (insets != null) {
                view2 = view;
                try {
                    applyInsetsToView(insets, view2, z10, appConsentTheme, z11);
                } catch (Exception unused) {
                    removeWindowInsetsListener(view2);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    removeWindowInsetsListener(view2);
                    throw th3;
                }
            } else {
                view2 = view;
            }
            removeWindowInsetsListener(view2);
        } catch (Exception unused2) {
            view2 = view;
        } catch (Throwable th4) {
            th = th4;
            view2 = view;
        }
    }

    public final AppConsentTheme getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease() {
        return (AppConsentTheme) this.appConsentTheme$delegate.getValue();
    }

    public final ViewModelFactory getViewModelFactory$appconsent_ui_v3_prodXchangeRelease() {
        return (ViewModelFactory) this.viewModelFactory$delegate.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        updateOrientation();
        updateTheme();
        super.onCreate(bundle);
        v.setCompatVectorFromResourcesEnabled(true);
        AppconsentV3ViewProgressDialogBinding appconsentV3ViewProgressDialogBindingInflate = AppconsentV3ViewProgressDialogBinding.inflate(getLayoutInflater());
        e0.checkNotNullExpressionValue(appconsentV3ViewProgressDialogBindingInflate, "inflate(layoutInflater)");
        this.viewProgressDialogBinding = appconsentV3ViewProgressDialogBindingInflate;
        defineStatusBarColor();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        runOnUiThread(new s(this, 25));
        super.onStop();
    }

    public final void sendSpecialMetricByType(SpecialMetricParam specialMetricParam, AbstractTrackingViewModel viewModel) {
        e0.checkNotNullParameter(specialMetricParam, "specialMetricParam");
        e0.checkNotNullParameter(viewModel, "viewModel");
        int i10 = WhenMappings.$EnumSwitchMapping$0[specialMetricParam.getType().ordinal()];
        if (i10 == 1 || i10 == 2) {
            viewModel.sendSwitchPurposeObjectIsOnOffTrackEvent(specialMetricParam.getConsentableId(), specialMetricParam.getNewStatus() == ConsentStatus.ALLOWED);
        } else if (i10 == 3 || i10 == 4) {
            viewModel.sendSwitchSpecialPurposeObjectIsOnOffTrackEvent(specialMetricParam.getConsentableId(), specialMetricParam.getNewStatus() == ConsentStatus.ALLOWED);
        }
    }

    public final void setCustomContentViewFromFinishActivity(View view) {
        e0.checkNotNullParameter(view, "view");
        setCustomContentView(view, false, false, false);
    }

    public final void setCustomContentViewFromLayer1(View view) {
        e0.checkNotNullParameter(view, "view");
        setCustomContentView$default(this, view, true, false, false, 8, null);
    }

    public final void setCustomContentViewFromLayer2(View view) {
        e0.checkNotNullParameter(view, "view");
        setCustomContentView$default(this, view, false, false, false, 8, null);
    }

    public final void setCustomContentViewFullScreenModeFromLayer1(View view) {
        e0.checkNotNullParameter(view, "view");
        setCustomContentView$default(this, view, true, true, false, 8, null);
    }

    public /* synthetic */ AppConsentActivity(boolean z10, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10);
    }

    public AppConsentActivity(boolean z10) {
        this.dialogMode = z10;
        this.appConsentTheme$delegate = q.lazy(AppConsentActivity$appConsentTheme$2.INSTANCE);
        this.viewModelFactory$delegate = q.lazy(AppConsentActivity$viewModelFactory$2.INSTANCE);
        this.progress$delegate = q.lazy(new AppConsentActivity$progress$2(this));
    }
}
