package com.sfbx.appconsentv3.ui.ui.notice;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.e;
import com.google.android.material.bottomsheet.g;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3FragmentNoticeUserBinding;
import com.sfbx.appconsentv3.ui.di.UIInjector;
import com.sfbx.appconsentv3.ui.util.DrawableExtsKt;
import com.sfbx.appconsentv3.ui.util.ViewExtsKt;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class NoticeUserFragment extends g {
    public static final Companion Companion = new Companion(null);
    private AppconsentV3FragmentNoticeUserBinding _binding;
    private final o appConsentTheme$delegate = q.lazy(NoticeUserFragment$appConsentTheme$2.INSTANCE);
    private String userId;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final NoticeUserFragment newInstance() {
            return new NoticeUserFragment();
        }

        private Companion() {
        }
    }

    private final void copyUUID() {
        Object systemService = requireContext().getSystemService("clipboard");
        e0.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        String str = this.userId;
        if (str == null) {
            e0.throwUninitializedPropertyAccessException("userId");
            str = null;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("User id", str));
        Toast.makeText(getContext(), "UUID copied in the clipboard", 1).show();
    }

    private final AppConsentTheme getAppConsentTheme() {
        return (AppConsentTheme) this.appConsentTheme$delegate.getValue();
    }

    private final AppconsentV3FragmentNoticeUserBinding getBinding() {
        AppconsentV3FragmentNoticeUserBinding appconsentV3FragmentNoticeUserBinding = this._binding;
        e0.checkNotNull(appconsentV3FragmentNoticeUserBinding);
        return appconsentV3FragmentNoticeUserBinding;
    }

    public static final NoticeUserFragment newInstance() {
        return Companion.newInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$1(NoticeUserFragment this$0, DialogInterface dialogInterface) {
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNull(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        View viewFindViewById = ((e) dialogInterface).findViewById(R.id.design_bottom_sheet);
        e0.checkNotNull(viewFindViewById);
        BottomSheetBehavior.from((FrameLayout) viewFindViewById).setPeekHeight(this$0.getResources().getDisplayMetrics().heightPixels);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3$lambda$2(NoticeUserFragment this$0, View view) {
        e0.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5$lambda$4(NoticeUserFragment this$0, View view) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.copyUUID();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7$lambda$6(NoticeUserFragment this$0, View view) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.copyUUID();
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, com.sfbx.appconsentv3.ui.R.style.AppConsentV3Theme_BottomSheetDialogTheme);
    }

    @Override // com.google.android.material.bottomsheet.g, androidx.appcompat.app.w0, androidx.fragment.app.w
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        e0.checkNotNullExpressionValue(dialogOnCreateDialog, "super.onCreateDialog(savedInstanceState)");
        dialogOnCreateDialog.setOnShowListener(new b(this, 0));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        e0.checkNotNullParameter(inflater, "inflater");
        this._binding = AppconsentV3FragmentNoticeUserBinding.inflate(inflater, viewGroup, false);
        getBinding().getRoot().getBackground().setColorFilter(new PorterDuffColorFilter(getAppConsentTheme().getBannerBackgroundColor$appconsent_ui_v3_prodXchangeRelease(), PorterDuff.Mode.SRC));
        LinearLayoutCompat root = getBinding().getRoot();
        e0.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        e0.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        AppCompatImageView appCompatImageView = getBinding().appconsentClearNoticeUserImageClose;
        Drawable drawable = appCompatImageView.getDrawable();
        e0.checkNotNullExpressionValue(drawable, "drawable");
        DrawableExtsKt.applyTint(drawable, getAppConsentTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        final int i10 = 0;
        appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.sfbx.appconsentv3.ui.ui.notice.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ NoticeUserFragment f50561c;

            {
                this.f50561c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        NoticeUserFragment.onViewCreated$lambda$3$lambda$2(this.f50561c, view2);
                        break;
                    case 1:
                        NoticeUserFragment.onViewCreated$lambda$5$lambda$4(this.f50561c, view2);
                        break;
                    default:
                        NoticeUserFragment.onViewCreated$lambda$7$lambda$6(this.f50561c, view2);
                        break;
                }
            }
        });
        this.userId = UIInjector.INSTANCE.provideUserId();
        AppCompatTextView appCompatTextView = getBinding().appconsentClearNoticeUserTextUuid;
        String str = this.userId;
        if (str == null) {
            e0.throwUninitializedPropertyAccessException("userId");
            str = null;
        }
        appCompatTextView.setText(str);
        final int i11 = 1;
        appCompatTextView.setOnClickListener(new View.OnClickListener(this) { // from class: com.sfbx.appconsentv3.ui.ui.notice.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ NoticeUserFragment f50561c;

            {
                this.f50561c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        NoticeUserFragment.onViewCreated$lambda$3$lambda$2(this.f50561c, view2);
                        break;
                    case 1:
                        NoticeUserFragment.onViewCreated$lambda$5$lambda$4(this.f50561c, view2);
                        break;
                    default:
                        NoticeUserFragment.onViewCreated$lambda$7$lambda$6(this.f50561c, view2);
                        break;
                }
            }
        });
        AppCompatTextView onViewCreated$lambda$7 = getBinding().appconsentClearNoticeUserTextCopy;
        onViewCreated$lambda$7.setText(getAppConsentTheme().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(com.sfbx.appconsentv3.ui.R.string.appconsent_user_id_copy));
        onViewCreated$lambda$7.setTextColor(getAppConsentTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        final int i12 = 2;
        onViewCreated$lambda$7.setOnClickListener(new View.OnClickListener(this) { // from class: com.sfbx.appconsentv3.ui.ui.notice.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ NoticeUserFragment f50561c;

            {
                this.f50561c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        NoticeUserFragment.onViewCreated$lambda$3$lambda$2(this.f50561c, view2);
                        break;
                    case 1:
                        NoticeUserFragment.onViewCreated$lambda$5$lambda$4(this.f50561c, view2);
                        break;
                    default:
                        NoticeUserFragment.onViewCreated$lambda$7$lambda$6(this.f50561c, view2);
                        break;
                }
            }
        });
        e0.checkNotNullExpressionValue(onViewCreated$lambda$7, "onViewCreated$lambda$7");
        ViewExtsKt.underline(onViewCreated$lambda$7, getAppConsentTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        AppCompatTextView appCompatTextView2 = getBinding().appconsentClearNoticeUserTextTitle;
        appCompatTextView2.setText(getAppConsentTheme().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(com.sfbx.appconsentv3.ui.R.string.appconsent_user_id_title));
        appCompatTextView2.setTextColor(getAppConsentTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
        AppCompatTextView appCompatTextView3 = getBinding().appconsentClearNoticeUserTextDescription;
        appCompatTextView3.setText(getAppConsentTheme().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(com.sfbx.appconsentv3.ui.R.string.appconsent_user_id_description));
        appCompatTextView3.setTextColor(getAppConsentTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
        getBinding().appconsentClearNoticeUserTextUuid.setTextColor(getAppConsentTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
    }
}
