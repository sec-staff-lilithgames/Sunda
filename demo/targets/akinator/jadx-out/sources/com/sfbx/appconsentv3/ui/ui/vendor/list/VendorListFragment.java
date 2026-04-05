package com.sfbx.appconsentv3.ui.ui.vendor.list;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.app.m;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.s2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import av.e;
import bv.f;
import bv.n;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.g;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3FragmentVendorListBinding;
import com.sfbx.appconsentv3.ui.model.QrCodeData;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.ui.consentable.detail.VendorAdapter;
import com.sfbx.appconsentv3.ui.ui.notice.b;
import com.sfbx.appconsentv3.ui.ui.privacy.PrivacyPolicyActivity;
import com.sfbx.appconsentv3.ui.util.AlertDialogUtil;
import com.sfbx.appconsentv3.ui.util.DrawableExtsKt;
import com.sfbx.appconsentv3.ui.viewmodel.ViewModelFactory;
import io.sfbx.appconsent.logger.ACLogger;
import io.sfbx.appconsent.logger.ACLoggerContract;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kv.a;
import kv.l;
import kv.p;
import tu.a0;
import tu.k;
import tu.o;
import tu.q;
import tu.x0;
import uu.p0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VendorListFragment extends g implements VendorAdapter.VendorListener {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_CONSENTABLE_ID = "key_consentable_id";
    private static final String KEY_IS_LEG_VENDOR = "key_is_leg_vendor";
    private AppconsentV3FragmentVendorListBinding _binding;
    private Job jobQrCode;
    private m qrCodeDialog;
    private final o appConsentTheme$delegate = q.lazy(VendorListFragment$appConsentTheme$2.INSTANCE);
    private final o viewModelFactory$delegate = q.lazy(VendorListFragment$viewModelFactory$2.INSTANCE);
    private final o mViewModel$delegate = s2.createViewModelLazy(this, c1.getOrCreateKotlinClass(VendorListViewModel.class), new VendorListFragment$special$$inlined$viewModels$default$2(new VendorListFragment$special$$inlined$viewModels$default$1(this)), new VendorListFragment$mViewModel$2(this));

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ VendorListFragment newInstance$default(Companion companion, int i10, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = -1;
            }
            if ((i11 & 2) != 0) {
                z10 = false;
            }
            return companion.newInstance(i10, z10);
        }

        public final VendorListFragment newInstance(int i10, boolean z10) {
            VendorListFragment vendorListFragment = new VendorListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(VendorListFragment.KEY_CONSENTABLE_ID, i10);
            bundle.putBoolean(VendorListFragment.KEY_IS_LEG_VENDOR, z10);
            vendorListFragment.setArguments(bundle);
            return vendorListFragment;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListFragment$onStart$1", f = "VendorListFragment.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListFragment$onStart$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        int label;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return VendorListFragment.this.new AnonymousClass1(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                SharedFlow<Response<QrCodeData>> qrCode = VendorListFragment.this.getMViewModel().getQrCode();
                final VendorListFragment vendorListFragment = VendorListFragment.this;
                FlowCollector<? super Response<QrCodeData>> flowCollector = new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListFragment.onStart.1.1

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListFragment$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C05391 extends f0 implements a {
                        final /* synthetic */ VendorListFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C05391(VendorListFragment vendorListFragment) {
                            super(0);
                            this.this$0 = vendorListFragment;
                        }

                        @Override // kv.a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m3473invoke();
                            return x0.f87415a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m3473invoke() {
                            ACLogger aCLogger = ACLogger.INSTANCE;
                            ACLoggerContract.DefaultImpls.d$default(aCLogger, "VendorListFragment", "QR code onCanceled Called", null, 4, null);
                            if (this.this$0.qrCodeDialog != null) {
                                m mVar = this.this$0.qrCodeDialog;
                                if (mVar != null) {
                                    mVar.dismiss();
                                }
                                ACLoggerContract.DefaultImpls.d$default(aCLogger, "VendorListFragment", "qrcode dialog dismissed", null, 4, null);
                                this.this$0.qrCodeDialog = null;
                                this.this$0.getMViewModel().qrCodeDismissed();
                            }
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((Response<QrCodeData>) obj2, (d<? super x0>) dVar);
                    }

                    public final Object emit(Response<QrCodeData> response, d<? super x0> dVar) {
                        if (response instanceof Response.Success) {
                            AlertDialogUtil alertDialogUtil = AlertDialogUtil.INSTANCE;
                            Context contextRequireContext = vendorListFragment.requireContext();
                            e0.checkNotNullExpressionValue(contextRequireContext, "this@VendorListFragment.requireContext()");
                            Response.Success success = (Response.Success) response;
                            m mVarBuildQrCode$appconsent_ui_v3_prodXchangeRelease = alertDialogUtil.buildQrCode$appconsent_ui_v3_prodXchangeRelease(contextRequireContext, vendorListFragment.getAppConsentTheme(), ((QrCodeData) success.getData()).getTitle(), ((QrCodeData) success.getData()).getDescription(), ((QrCodeData) success.getData()).getQrCode(), new C05391(vendorListFragment));
                            if (mVarBuildQrCode$appconsent_ui_v3_prodXchangeRelease != null) {
                                VendorListFragment vendorListFragment2 = vendorListFragment;
                                if (vendorListFragment2.qrCodeDialog != null) {
                                    m mVar = vendorListFragment2.qrCodeDialog;
                                    if (mVar != null) {
                                        mVar.dismiss();
                                    }
                                    vendorListFragment2.qrCodeDialog = null;
                                }
                                vendorListFragment2.qrCodeDialog = mVarBuildQrCode$appconsent_ui_v3_prodXchangeRelease;
                                mVarBuildQrCode$appconsent_ui_v3_prodXchangeRelease.show();
                            }
                            vendorListFragment.getMViewModel().qrCodePopupDisplayed();
                        } else if (response instanceof Response.Error) {
                            Toast.makeText(vendorListFragment.requireContext(), vendorListFragment.getAppConsentTheme().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_v3_qr_code_error_loading), 0).show();
                            m mVar2 = vendorListFragment.qrCodeDialog;
                            if (mVar2 != null) {
                                mVar2.dismiss();
                            }
                            vendorListFragment.qrCodeDialog = null;
                            vendorListFragment.getMViewModel().qrCodeDismissed();
                        }
                        return x0.f87415a;
                    }
                };
                this.label = 1;
                if (qrCode.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            throw new k();
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListFragment$onViewCreated$3, reason: invalid class name */
    public static final class AnonymousClass3 extends f0 implements l {
        final /* synthetic */ VendorAdapter $vendorAdapter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(VendorAdapter vendorAdapter) {
            super(1);
            this.$vendorAdapter = vendorAdapter;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Response<? extends List<Vendor>>) obj);
            return x0.f87415a;
        }

        public final void invoke(Response<? extends List<Vendor>> response) {
            this.$vendorAdapter.submitList(response instanceof Response.Success ? (List) ((Response.Success) response).getData() : p0.emptyList());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListFragment$onViewCreated$4, reason: invalid class name */
    public static final class AnonymousClass4 extends f0 implements l {
        final /* synthetic */ boolean $isLegVendor;
        final /* synthetic */ VendorAdapter $vendorAdapter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(VendorAdapter vendorAdapter, boolean z10) {
            super(1);
            this.$vendorAdapter = vendorAdapter;
            this.$isLegVendor = z10;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Response<Consentable>) obj);
            return x0.f87415a;
        }

        public final void invoke(Response<Consentable> response) {
            List<Object> listEmptyList;
            if (response instanceof Response.Success) {
                List<Vendor> vendors = ((Consentable) ((Response.Success) response).getData()).getVendors();
                boolean z10 = this.$isLegVendor;
                listEmptyList = new ArrayList<>();
                for (Object obj : vendors) {
                    if (((Vendor) obj).isLegVendor() == z10) {
                        listEmptyList.add(obj);
                    }
                }
            } else {
                listEmptyList = p0.emptyList();
            }
            this.$vendorAdapter.submitList(listEmptyList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppConsentTheme getAppConsentTheme() {
        return (AppConsentTheme) this.appConsentTheme$delegate.getValue();
    }

    private final AppconsentV3FragmentVendorListBinding getBinding() {
        AppconsentV3FragmentVendorListBinding appconsentV3FragmentVendorListBinding = this._binding;
        e0.checkNotNull(appconsentV3FragmentVendorListBinding);
        return appconsentV3FragmentVendorListBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VendorListViewModel getMViewModel() {
        return (VendorListViewModel) this.mViewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewModelFactory getViewModelFactory() {
        return (ViewModelFactory) this.viewModelFactory$delegate.getValue();
    }

    public static final VendorListFragment newInstance(int i10, boolean z10) {
        return Companion.newInstance(i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$1(VendorListFragment this$0, DialogInterface dialogInterface) {
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNull(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        View viewFindViewById = ((com.google.android.material.bottomsheet.e) dialogInterface).findViewById(com.digidust.elokence.akinator.freemium.R.id.design_bottom_sheet);
        e0.checkNotNull(viewFindViewById);
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = this$0.getResources().getDisplayMetrics().heightPixels;
        frameLayout.setLayoutParams(layoutParams);
        BottomSheetBehavior.from(frameLayout).setState(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4$lambda$3(VendorListFragment this$0, View view) {
        e0.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5(l tmp0, Object obj) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$6(l tmp0, Object obj) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // com.sfbx.appconsentv3.ui.ui.consentable.detail.VendorAdapter.VendorListener
    public void onClickPolicy(String url, String vendorName, String title) {
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(vendorName, "vendorName");
        e0.checkNotNullParameter(title, "title");
        if (url.length() <= 0 || !URLUtil.isValidUrl(url)) {
            return;
        }
        if (getMViewModel().isNeedToDisplayQrCode()) {
            VendorListViewModel.getQrCode$default(getMViewModel(), vendorName, title, url, false, 8, null);
            return;
        }
        Context context = getContext();
        if (context != null) {
            startActivity(PrivacyPolicyActivity.Companion.startIntent$default(PrivacyPolicyActivity.Companion, context, url, vendorName, false, 8, null));
        }
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.AppConsentV3Theme_BottomSheetDialogTheme);
    }

    @Override // com.google.android.material.bottomsheet.g, androidx.appcompat.app.w0, androidx.fragment.app.w
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        e0.checkNotNullExpressionValue(dialogOnCreateDialog, "super.onCreateDialog(savedInstanceState)");
        dialogOnCreateDialog.setOnShowListener(new b(this, 1));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        e0.checkNotNullParameter(inflater, "inflater");
        this._binding = AppconsentV3FragmentVendorListBinding.inflate(inflater, viewGroup, false);
        getBinding().getRoot().getBackground().setColorFilter(new PorterDuffColorFilter(getAppConsentTheme().getBannerBackgroundColor$appconsent_ui_v3_prodXchangeRelease(), PorterDuff.Mode.SRC_IN));
        ConstraintLayout root = getBinding().getRoot();
        e0.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (getMViewModel().isNeedToDisplayQrCode()) {
            this.jobQrCode = BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.c1.getLifecycleScope(this), null, null, new AnonymousClass1(null), 3, null);
            if (getMViewModel().getQrCodeShowing()) {
                m mVar = this.qrCodeDialog;
                if (mVar == null || !(mVar == null || mVar.isShowing())) {
                    getMViewModel().displayLastQrCode();
                }
            }
        }
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.Fragment
    public void onStop() {
        m mVar = this.qrCodeDialog;
        if (mVar != null) {
            mVar.dismiss();
        }
        this.qrCodeDialog = null;
        Job job = this.jobQrCode;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.jobQrCode = null;
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        e0.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        int i10 = arguments != null ? arguments.getInt(KEY_CONSENTABLE_ID) : -1;
        Bundle arguments2 = getArguments();
        boolean z10 = arguments2 != null ? arguments2.getBoolean(KEY_IS_LEG_VENDOR) : false;
        VendorAdapter vendorAdapter = new VendorAdapter(this, null, true, 2, null);
        RecyclerView recyclerView = getBinding().recyclerVendors;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(vendorAdapter);
        AppCompatImageView appCompatImageView = getBinding().imageClose;
        Drawable drawable = appCompatImageView.getDrawable();
        e0.checkNotNullExpressionValue(drawable, "drawable");
        DrawableExtsKt.applyTint(drawable, getAppConsentTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        appCompatImageView.setOnClickListener(new com.applovin.mediation.nativeAds.a(this, 13));
        getBinding().textTitle.setText(getAppConsentTheme().getVendorGlobalTitle$appconsent_ui_v3_prodXchangeRelease());
        getBinding().textTitle.setTextColor(getAppConsentTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
        if (i10 == -1) {
            getMViewModel().getVendors().observe(getViewLifecycleOwner(), new com.sfbx.appconsentv3.ui.ui.consentable.detail.a(16, new AnonymousClass3(vendorAdapter)));
        } else {
            getMViewModel().getConsentable(i10).observe(getViewLifecycleOwner(), new com.sfbx.appconsentv3.ui.ui.consentable.detail.a(17, new AnonymousClass4(vendorAdapter, z10)));
        }
    }

    @Override // com.sfbx.appconsentv3.ui.ui.consentable.detail.VendorAdapter.VendorListener
    public void onClickSeeAll(boolean z10) {
    }
}
