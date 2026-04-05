package com.sfbx.appconsentv3.ui.ui.vendor.detail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.URLUtil;
import android.widget.Toast;
import androidx.appcompat.app.m;
import androidx.lifecycle.i3;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import av.e;
import bv.f;
import bv.n;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsent.core.model.DataCategoryCore;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsentv3.ui.AppConsentActivity;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ActivityVendorDetailBinding;
import com.sfbx.appconsentv3.ui.domain.model.VendorDetailsDomain;
import com.sfbx.appconsentv3.ui.listener.SwitchViewListener;
import com.sfbx.appconsentv3.ui.model.QrCodeData;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.ui.privacy.PrivacyPolicyActivity;
import com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel;
import com.sfbx.appconsentv3.ui.ui.vendor.detail.VendorDetailAdapter;
import com.sfbx.appconsentv3.ui.ui.vendor.detail.VendorDetailAdapter.ConsentableAdapter;
import com.sfbx.appconsentv3.ui.ui.vendor.detail.VendorDetailAdapter.HeaderAdapter;
import com.sfbx.appconsentv3.ui.ui.vendor.refine.RefineByVendorTabFragment;
import com.sfbx.appconsentv3.ui.util.AlertDialogUtil;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import com.sfbx.appconsentv3.ui.view.RejectButtonView;
import io.sfbx.appconsent.logger.ACLogger;
import io.sfbx.appconsent.logger.ACLoggerContract;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
import kv.l;
import kv.p;
import tu.a0;
import tu.k;
import tu.o;
import tu.x0;
import uu.p0;
import uu.q0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VendorDetailActivity extends AppConsentActivity implements VendorDetailAdapter.VendorListener, SwitchViewListener, RejectButtonView.RejectButtonListener {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_ID = "extra_id";
    private static final String EXTRA_STATUS = "extra_status";
    private AppconsentV3ActivityVendorDetailBinding binding;
    private VendorDetailAdapter.CategoriesHeaderAdapter categoriesHeaderAdapter;
    private VendorDetailAdapter.ConsentableHeaderAdapter consentableHeaderAdapter;
    private VendorDetailAdapter.ConsentableLITHeaderAdapter consentableLITHeaderAdapter;
    private VendorDetailAdapter.HeaderAdapter headerAdapter;
    private Job jobQrCode;
    private List<Consentable> mConsentables;
    private boolean mIsNeedToDisplayLegitimateInterest;
    private Vendor mVendor;
    private final o mViewModel$delegate;
    private List<DataCategoryCore> mdataCategories;
    private m qrCodeDialog;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final Intent getStartIntent(Context context, int i10, ConsentStatus status) {
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(status, "status");
            Intent intent = new Intent(context, (Class<?>) VendorDetailActivity.class);
            intent.putExtra(VendorDetailActivity.EXTRA_ID, i10);
            intent.putExtra(VendorDetailActivity.EXTRA_STATUS, status);
            return intent;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.detail.VendorDetailActivity$onClick$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        final /* synthetic */ boolean $isRejected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z10) {
            super(1);
            this.$isRejected = z10;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Response<Boolean>) obj);
            return x0.f87415a;
        }

        public final void invoke(Response<Boolean> response) {
            if (response instanceof Response.Success) {
                Vendor vendor = VendorDetailActivity.this.mVendor;
                Vendor vendor2 = null;
                if (vendor == null) {
                    e0.throwUninitializedPropertyAccessException("mVendor");
                    vendor = null;
                }
                vendor.setLegIntStatus(this.$isRejected ? ConsentStatus.DISALLOWED : ConsentStatus.ALLOWED);
                VendorDetailAdapter.ConsentableLITHeaderAdapter consentableLITHeaderAdapter = VendorDetailActivity.this.consentableLITHeaderAdapter;
                if (consentableLITHeaderAdapter == null) {
                    e0.throwUninitializedPropertyAccessException("consentableLITHeaderAdapter");
                    consentableLITHeaderAdapter = null;
                }
                Vendor vendor3 = VendorDetailActivity.this.mVendor;
                if (vendor3 == null) {
                    e0.throwUninitializedPropertyAccessException("mVendor");
                } else {
                    vendor2 = vendor3;
                }
                consentableLITHeaderAdapter.submitStatus(vendor2.getLegIntStatus());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.vendor.detail.VendorDetailActivity$onStart$1", f = "VendorDetailActivity.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.detail.VendorDetailActivity$onStart$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37281 extends n implements p {
        int label;

        public C37281(d<? super C37281> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return VendorDetailActivity.this.new C37281(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                SharedFlow<Response<QrCodeData>> qrCode = VendorDetailActivity.this.getMViewModel().getQrCode();
                final VendorDetailActivity vendorDetailActivity = VendorDetailActivity.this;
                FlowCollector<? super Response<QrCodeData>> flowCollector = new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.vendor.detail.VendorDetailActivity.onStart.1.1

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.detail.VendorDetailActivity$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C05371 extends f0 implements kv.a {
                        final /* synthetic */ VendorDetailActivity this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C05371(VendorDetailActivity vendorDetailActivity) {
                            super(0);
                            this.this$0 = vendorDetailActivity;
                        }

                        @Override // kv.a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m3472invoke();
                            return x0.f87415a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m3472invoke() {
                            ACLogger aCLogger = ACLogger.INSTANCE;
                            ACLoggerContract.DefaultImpls.d$default(aCLogger, "VendorDetailActivity", "QR code onCanceled Called", null, 4, null);
                            if (this.this$0.qrCodeDialog != null) {
                                m mVar = this.this$0.qrCodeDialog;
                                if (mVar != null) {
                                    mVar.dismiss();
                                }
                                ACLoggerContract.DefaultImpls.d$default(aCLogger, "VendorDetailActivity", "qrcode dialog dismissed", null, 4, null);
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
                            VendorDetailActivity vendorDetailActivity2 = vendorDetailActivity;
                            Response.Success success = (Response.Success) response;
                            m mVarBuildQrCode$appconsent_ui_v3_prodXchangeRelease = alertDialogUtil.buildQrCode$appconsent_ui_v3_prodXchangeRelease(vendorDetailActivity2, vendorDetailActivity2.getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease(), ((QrCodeData) success.getData()).getTitle(), ((QrCodeData) success.getData()).getDescription(), ((QrCodeData) success.getData()).getQrCode(), new C05371(vendorDetailActivity));
                            if (mVarBuildQrCode$appconsent_ui_v3_prodXchangeRelease != null) {
                                VendorDetailActivity vendorDetailActivity3 = vendorDetailActivity;
                                if (vendorDetailActivity3.qrCodeDialog != null) {
                                    m mVar = vendorDetailActivity3.qrCodeDialog;
                                    if (mVar != null) {
                                        mVar.dismiss();
                                    }
                                    vendorDetailActivity3.qrCodeDialog = null;
                                }
                                vendorDetailActivity3.qrCodeDialog = mVarBuildQrCode$appconsent_ui_v3_prodXchangeRelease;
                                mVarBuildQrCode$appconsent_ui_v3_prodXchangeRelease.show();
                            }
                            vendorDetailActivity.getMViewModel().qrCodePopupDisplayed();
                        } else if (response instanceof Response.Error) {
                            VendorDetailActivity vendorDetailActivity4 = vendorDetailActivity;
                            Toast.makeText(vendorDetailActivity4, vendorDetailActivity4.getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_v3_qr_code_error_loading), 0).show();
                            m mVar2 = vendorDetailActivity.qrCodeDialog;
                            if (mVar2 != null) {
                                mVar2.dismiss();
                            }
                            vendorDetailActivity.qrCodeDialog = null;
                            vendorDetailActivity.getMViewModel().qrCodeDismissed();
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
            return ((C37281) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.detail.VendorDetailActivity$onSwitchChanged$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37291 extends f0 implements l {
        final /* synthetic */ ConsentStatus $newStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37291(ConsentStatus consentStatus) {
            super(1);
            this.$newStatus = consentStatus;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Response<Boolean>) obj);
            return x0.f87415a;
        }

        public final void invoke(Response<Boolean> response) {
            if (response instanceof Response.Success) {
                Vendor vendor = VendorDetailActivity.this.mVendor;
                VendorDetailAdapter.ConsentableHeaderAdapter consentableHeaderAdapter = null;
                if (vendor == null) {
                    e0.throwUninitializedPropertyAccessException("mVendor");
                    vendor = null;
                }
                vendor.setStatus(this.$newStatus);
                VendorDetailAdapter.ConsentableHeaderAdapter consentableHeaderAdapter2 = VendorDetailActivity.this.consentableHeaderAdapter;
                if (consentableHeaderAdapter2 == null) {
                    e0.throwUninitializedPropertyAccessException("consentableHeaderAdapter");
                } else {
                    consentableHeaderAdapter = consentableHeaderAdapter2;
                }
                consentableHeaderAdapter.submitStatus(this.$newStatus);
            }
        }
    }

    public VendorDetailActivity() {
        super(false, 1, null);
        this.mViewModel$delegate = new i3(c1.getOrCreateKotlinClass(VendorViewModel.class), new VendorDetailActivity$special$$inlined$viewModels$2(this), new VendorDetailActivity$mViewModel$2(this));
        this.mdataCategories = p0.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VendorViewModel getMViewModel() {
        return (VendorViewModel) this.mViewModel$delegate.getValue();
    }

    public static final Intent getStartIntent(Context context, int i10, ConsentStatus consentStatus) {
        return Companion.getStartIntent(context, i10, consentStatus);
    }

    private final void loadUI() {
        Object next;
        Object next2;
        Object next3;
        VendorDetailAdapter vendorDetailAdapter = new VendorDetailAdapter();
        List<Consentable> list = this.mConsentables;
        Vendor vendor = null;
        if (list == null) {
            e0.throwUninitializedPropertyAccessException("mConsentables");
            list = null;
        }
        ArrayList<Consentable> arrayList = new ArrayList();
        for (Object obj : list) {
            Consentable consentable = (Consentable) obj;
            Iterator<T> it = consentable.getVendors().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it.next();
                int id2 = ((Vendor) next3).getId();
                Vendor vendor2 = this.mVendor;
                if (vendor2 == null) {
                    e0.throwUninitializedPropertyAccessException("mVendor");
                    vendor2 = null;
                }
                if (id2 == vendor2.getId()) {
                    break;
                }
            }
            Vendor vendor3 = (Vendor) next3;
            if (vendor3 != null && !vendor3.isLegVendor() && (consentable.getType() == ConsentableType.PURPOSE || consentable.getType() == ConsentableType.EXTRA_PURPOSE || consentable.getType() == ConsentableType.SPECIAL_FEATURE || consentable.getType() == ConsentableType.EXTRA_SPECIAL_FEATURE)) {
                arrayList.add(obj);
            }
        }
        List<Consentable> list2 = this.mConsentables;
        if (list2 == null) {
            e0.throwUninitializedPropertyAccessException("mConsentables");
            list2 = null;
        }
        ArrayList<Consentable> arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            Consentable consentable2 = (Consentable) obj2;
            Iterator<T> it2 = consentable2.getVendors().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                int id3 = ((Vendor) next2).getId();
                Vendor vendor4 = this.mVendor;
                if (vendor4 == null) {
                    e0.throwUninitializedPropertyAccessException("mVendor");
                    vendor4 = null;
                }
                if (id3 == vendor4.getId()) {
                    break;
                }
            }
            Vendor vendor5 = (Vendor) next2;
            if (vendor5 != null && vendor5.isLegVendor() && this.mIsNeedToDisplayLegitimateInterest && (consentable2.getType() == ConsentableType.PURPOSE || consentable2.getType() == ConsentableType.EXTRA_PURPOSE || consentable2.getType() == ConsentableType.SPECIAL_FEATURE || consentable2.getType() == ConsentableType.EXTRA_SPECIAL_FEATURE)) {
                arrayList2.add(obj2);
            }
        }
        List<Consentable> list3 = this.mConsentables;
        if (list3 == null) {
            e0.throwUninitializedPropertyAccessException("mConsentables");
            list3 = null;
        }
        ArrayList<Consentable> arrayList3 = new ArrayList();
        for (Object obj3 : list3) {
            Consentable consentable3 = (Consentable) obj3;
            Iterator<T> it3 = consentable3.getVendors().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                int id4 = ((Vendor) next).getId();
                Vendor vendor6 = this.mVendor;
                if (vendor6 == null) {
                    e0.throwUninitializedPropertyAccessException("mVendor");
                    vendor6 = null;
                }
                if (id4 == vendor6.getId()) {
                    break;
                }
            }
            if (next != null && (consentable3.getType() == ConsentableType.SPECIAL_PURPOSE || consentable3.getType() == ConsentableType.FEATURE || consentable3.getType() == ConsentableType.EXTRA_SPECIAL_PURPOSE || consentable3.getType() == ConsentableType.EXTRA_FEATURE)) {
                arrayList3.add(obj3);
            }
        }
        int actionBarColor$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getActionBarColor$appconsent_ui_v3_prodXchangeRelease();
        int actionBarTextColor$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getActionBarTextColor$appconsent_ui_v3_prodXchangeRelease();
        int buttonBackgroundColor$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease();
        Vendor vendor7 = this.mVendor;
        if (vendor7 == null) {
            e0.throwUninitializedPropertyAccessException("mVendor");
            vendor7 = null;
        }
        ExtensionKt.setupCustomTitle(this, actionBarColor$appconsent_ui_v3_prodXchangeRelease, actionBarTextColor$appconsent_ui_v3_prodXchangeRelease, buttonBackgroundColor$appconsent_ui_v3_prodXchangeRelease, vendor7.getName());
        AppconsentV3ActivityVendorDetailBinding appconsentV3ActivityVendorDetailBinding = this.binding;
        if (appconsentV3ActivityVendorDetailBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityVendorDetailBinding = null;
        }
        appconsentV3ActivityVendorDetailBinding.recyclerVendorDetail.setBackgroundColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        ArrayList arrayList4 = new ArrayList();
        VendorDetailAdapter.HeaderAdapter headerAdapter = vendorDetailAdapter.new HeaderAdapter(this);
        this.headerAdapter = headerAdapter;
        arrayList4.add(headerAdapter);
        Vendor vendor8 = this.mVendor;
        if (vendor8 == null) {
            e0.throwUninitializedPropertyAccessException("mVendor");
            vendor8 = null;
        }
        VendorDetailAdapter.CategoriesHeaderAdapter categoriesHeaderAdapter = new VendorDetailAdapter.CategoriesHeaderAdapter(vendorDetailAdapter, vendor8.getDataCategoriesByLanguage(this.mdataCategories, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getLanguage$appconsent_ui_v3_prodXchangeRelease()));
        this.categoriesHeaderAdapter = categoriesHeaderAdapter;
        arrayList4.add(categoriesHeaderAdapter);
        VendorDetailAdapter.ConsentableHeaderAdapter consentableHeaderAdapter = new VendorDetailAdapter.ConsentableHeaderAdapter(vendorDetailAdapter, arrayList, this);
        Vendor vendor9 = this.mVendor;
        if (vendor9 == null) {
            e0.throwUninitializedPropertyAccessException("mVendor");
            vendor9 = null;
        }
        consentableHeaderAdapter.submitStatus(vendor9.getStatus());
        this.consentableHeaderAdapter = consentableHeaderAdapter;
        arrayList4.add(consentableHeaderAdapter);
        VendorDetailAdapter.ConsentableAdapter consentableAdapter = vendorDetailAdapter.new ConsentableAdapter();
        ArrayList arrayList5 = new ArrayList(q0.collectionSizeOrDefault(arrayList, 10));
        for (Consentable consentable4 : arrayList) {
            Vendor vendor10 = this.mVendor;
            if (vendor10 == null) {
                e0.throwUninitializedPropertyAccessException("mVendor");
                vendor10 = null;
            }
            arrayList5.add(new VendorDetailAdapter.ConsentableAdapterItem(consentable4, vendor10));
        }
        consentableAdapter.submitList(arrayList5);
        arrayList4.add(consentableAdapter);
        Vendor vendor11 = this.mVendor;
        if (vendor11 == null) {
            e0.throwUninitializedPropertyAccessException("mVendor");
            vendor11 = null;
        }
        if (vendor11.isLegVendor() && true == this.mIsNeedToDisplayLegitimateInterest) {
            VendorDetailAdapter.ConsentableLITHeaderAdapter consentableLITHeaderAdapter = new VendorDetailAdapter.ConsentableLITHeaderAdapter(vendorDetailAdapter, arrayList2, this, this);
            Vendor vendor12 = this.mVendor;
            if (vendor12 == null) {
                e0.throwUninitializedPropertyAccessException("mVendor");
                vendor12 = null;
            }
            consentableLITHeaderAdapter.submitStatus(vendor12.getLegIntStatus());
            this.consentableLITHeaderAdapter = consentableLITHeaderAdapter;
            arrayList4.add(consentableLITHeaderAdapter);
            VendorDetailAdapter.ConsentableAdapter consentableAdapter2 = vendorDetailAdapter.new ConsentableAdapter();
            ArrayList arrayList6 = new ArrayList(q0.collectionSizeOrDefault(arrayList2, 10));
            for (Consentable consentable5 : arrayList2) {
                Vendor vendor13 = this.mVendor;
                if (vendor13 == null) {
                    e0.throwUninitializedPropertyAccessException("mVendor");
                    vendor13 = null;
                }
                arrayList6.add(new VendorDetailAdapter.ConsentableAdapterItem(consentable5, vendor13));
            }
            consentableAdapter2.submitList(arrayList6);
            arrayList4.add(consentableAdapter2);
        }
        arrayList4.add(new VendorDetailAdapter.ConsentableMandatoryHeaderAdapter(vendorDetailAdapter, arrayList3));
        VendorDetailAdapter.ConsentableAdapter consentableAdapter3 = vendorDetailAdapter.new ConsentableAdapter();
        ArrayList arrayList7 = new ArrayList(q0.collectionSizeOrDefault(arrayList3, 10));
        for (Consentable consentable6 : arrayList3) {
            Vendor vendor14 = this.mVendor;
            if (vendor14 == null) {
                e0.throwUninitializedPropertyAccessException("mVendor");
                vendor14 = null;
            }
            arrayList7.add(new VendorDetailAdapter.ConsentableAdapterItem(consentable6, vendor14));
        }
        consentableAdapter3.submitList(arrayList7);
        arrayList4.add(consentableAdapter3);
        r rVar = new r(arrayList4);
        AppconsentV3ActivityVendorDetailBinding appconsentV3ActivityVendorDetailBinding2 = this.binding;
        if (appconsentV3ActivityVendorDetailBinding2 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityVendorDetailBinding2 = null;
        }
        RecyclerView recyclerView = appconsentV3ActivityVendorDetailBinding2.recyclerVendorDetail;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(rVar);
        Vendor vendor15 = this.mVendor;
        if (vendor15 == null) {
            e0.throwUninitializedPropertyAccessException("mVendor");
        } else {
            vendor = vendor15;
        }
        if (vendor.getIabId() == null) {
            loadVendorExpiration();
        }
    }

    private final void loadVendorExpiration() {
        Vendor vendor = this.mVendor;
        Vendor vendor2 = null;
        if (vendor == null) {
            e0.throwUninitializedPropertyAccessException("mVendor");
            vendor = null;
        }
        Long cookieMaxAgeSeconds = vendor.getCookieMaxAgeSeconds();
        if (cookieMaxAgeSeconds != null) {
            long jLongValue = cookieMaxAgeSeconds.longValue();
            Vendor vendor3 = this.mVendor;
            if (vendor3 == null) {
                e0.throwUninitializedPropertyAccessException("mVendor");
            } else {
                vendor2 = vendor3;
            }
            Boolean usesNonCookieAccess = vendor2.getUsesNonCookieAccess();
            if (usesNonCookieAccess != null) {
                getMViewModel().getVendorExpiration(jLongValue, usesNonCookieAccess.booleanValue()).observe(this, new com.sfbx.appconsentv3.ui.ui.consentable.detail.a(13, new VendorDetailActivity$loadVendorExpiration$1$1$1(this)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadVendorExpiration$lambda$19$lambda$18$lambda$17(l tmp0, Object obj) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void noVendorFoundError(Throwable th2) {
        ACLogger aCLogger = ACLogger.INSTANCE;
        e0.checkNotNullExpressionValue("VendorDetailActivity", "VendorDetailActivity::class.java.simpleName");
        aCLogger.e("VendorDetailActivity", "A problem occurred when trying to find specific vendor after click on it", th2);
        finish();
    }

    public static /* synthetic */ void noVendorFoundError$default(VendorDetailActivity vendorDetailActivity, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        vendorDetailActivity.noVendorFoundError(th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClick$lambda$21(l tmp0, Object obj) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSwitchChanged$lambda$20(l tmp0, Object obj) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void setStatusToResult() {
        RefineByVendorTabFragment.Companion companion = RefineByVendorTabFragment.Companion;
        Vendor vendor = this.mVendor;
        Vendor vendor2 = null;
        if (vendor == null) {
            e0.throwUninitializedPropertyAccessException("mVendor");
            vendor = null;
        }
        int id2 = vendor.getId();
        Vendor vendor3 = this.mVendor;
        if (vendor3 == null) {
            e0.throwUninitializedPropertyAccessException("mVendor");
        } else {
            vendor2 = vendor3;
        }
        setResult(-1, companion.getResultIntent(id2, vendor2.getStatus()));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setStatusToResult();
        super.onBackPressed();
    }

    @Override // com.sfbx.appconsentv3.ui.view.RejectButtonView.RejectButtonListener
    public void onClick(boolean z10) {
        VendorViewModel mViewModel = getMViewModel();
        Vendor vendor = this.mVendor;
        if (vendor == null) {
            e0.throwUninitializedPropertyAccessException("mVendor");
            vendor = null;
        }
        mViewModel.rejectLITVendors(z10, vendor.getId()).observe(this, new com.sfbx.appconsentv3.ui.ui.consentable.detail.a(14, new AnonymousClass1(z10)));
    }

    @Override // com.sfbx.appconsentv3.ui.ui.vendor.detail.VendorDetailAdapter.VendorListener
    public void onClickLegitimateInterest(String legitimateInterest) {
        e0.checkNotNullParameter(legitimateInterest, "legitimateInterest");
        Vendor vendor = this.mVendor;
        Vendor vendor2 = null;
        if (vendor == null) {
            e0.throwUninitializedPropertyAccessException("mVendor");
            vendor = null;
        }
        String legitimateInterestByNoticeLocale = vendor.getLegitimateInterestByNoticeLocale(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getLanguage$appconsent_ui_v3_prodXchangeRelease());
        if (legitimateInterestByNoticeLocale.length() <= 0 || !URLUtil.isValidUrl(legitimateInterestByNoticeLocale)) {
            return;
        }
        if (getMViewModel().isNeedToDisplayQrCode()) {
            VendorViewModel mViewModel = getMViewModel();
            Vendor vendor3 = this.mVendor;
            if (vendor3 == null) {
                e0.throwUninitializedPropertyAccessException("mVendor");
            } else {
                vendor2 = vendor3;
            }
            VendorViewModel.getQrCode$default(mViewModel, vendor2.getName(), legitimateInterest, legitimateInterestByNoticeLocale, false, 8, null);
            return;
        }
        PrivacyPolicyActivity.Companion companion = PrivacyPolicyActivity.Companion;
        Vendor vendor4 = this.mVendor;
        if (vendor4 == null) {
            e0.throwUninitializedPropertyAccessException("mVendor");
        } else {
            vendor2 = vendor4;
        }
        startActivity(companion.startIntent(this, legitimateInterestByNoticeLocale, vendor2.getName(), true));
    }

    @Override // com.sfbx.appconsentv3.ui.ui.vendor.detail.VendorDetailAdapter.VendorListener
    public void onClickPolicy(String vendorPolicy) {
        e0.checkNotNullParameter(vendorPolicy, "vendorPolicy");
        Vendor vendor = this.mVendor;
        Vendor vendor2 = null;
        if (vendor == null) {
            e0.throwUninitializedPropertyAccessException("mVendor");
            vendor = null;
        }
        String privacyPolicy = vendor.getPrivacyPolicy(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getLanguage$appconsent_ui_v3_prodXchangeRelease());
        if (privacyPolicy.length() > 0 && URLUtil.isValidUrl(privacyPolicy)) {
            if (getMViewModel().isNeedToDisplayQrCode()) {
                VendorViewModel mViewModel = getMViewModel();
                Vendor vendor3 = this.mVendor;
                if (vendor3 == null) {
                    e0.throwUninitializedPropertyAccessException("mVendor");
                } else {
                    vendor2 = vendor3;
                }
                VendorViewModel.getQrCode$default(mViewModel, vendor2.getName(), vendorPolicy, privacyPolicy, false, 8, null);
                return;
            }
            PrivacyPolicyActivity.Companion companion = PrivacyPolicyActivity.Companion;
            Vendor vendor4 = this.mVendor;
            if (vendor4 == null) {
                e0.throwUninitializedPropertyAccessException("mVendor");
            } else {
                vendor2 = vendor4;
            }
            startActivity(PrivacyPolicyActivity.Companion.startIntent$default(companion, this, privacyPolicy, vendor2.getName(), false, 8, null));
        }
    }

    @Override // com.sfbx.appconsentv3.ui.AppConsentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppconsentV3ActivityVendorDetailBinding appconsentV3ActivityVendorDetailBindingInflate = AppconsentV3ActivityVendorDetailBinding.inflate(getLayoutInflater());
        e0.checkNotNullExpressionValue(appconsentV3ActivityVendorDetailBindingInflate, "inflate(layoutInflater)");
        this.binding = appconsentV3ActivityVendorDetailBindingInflate;
        AppconsentV3ActivityVendorDetailBinding appconsentV3ActivityVendorDetailBinding = null;
        if (appconsentV3ActivityVendorDetailBindingInflate == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityVendorDetailBindingInflate = null;
        }
        RecyclerView root = appconsentV3ActivityVendorDetailBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "binding.root");
        setCustomContentViewFromLayer2(root);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            throw new IllegalArgumentException();
        }
        int i10 = extras.getInt(EXTRA_ID);
        Bundle extras2 = getIntent().getExtras();
        Serializable serializable = extras2 != null ? extras2.getSerializable(EXTRA_STATUS) : null;
        e0.checkNotNull(serializable, "null cannot be cast to non-null type com.sfbx.appconsent.core.model.ConsentStatus");
        ConsentStatus consentStatus = (ConsentStatus) serializable;
        try {
            VendorDetailsDomain vendorDetails = getMViewModel().getVendorDetails(i10);
            this.mVendor = vendorDetails.getVendor();
            this.mdataCategories = vendorDetails.getDataCategories();
            this.mIsNeedToDisplayLegitimateInterest = getMViewModel().isNeedToDisplayLegitimateInterest();
            Vendor vendor = this.mVendor;
            if (vendor == null) {
                e0.throwUninitializedPropertyAccessException("mVendor");
                vendor = null;
            }
            vendor.setStatus(consentStatus);
            List<Consentable> consentables = getMViewModel().getConsentables();
            ArrayList arrayList = new ArrayList();
            for (Object obj : consentables) {
                List<Vendor> vendors = ((Consentable) obj).getVendors();
                if (!(vendors instanceof Collection) || !vendors.isEmpty()) {
                    Iterator<T> it = vendors.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((Vendor) it.next()).getId() == i10) {
                                arrayList.add(obj);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            this.mConsentables = arrayList;
            AppconsentV3ActivityVendorDetailBinding appconsentV3ActivityVendorDetailBinding2 = this.binding;
            if (appconsentV3ActivityVendorDetailBinding2 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                appconsentV3ActivityVendorDetailBinding = appconsentV3ActivityVendorDetailBinding2;
            }
            appconsentV3ActivityVendorDetailBinding.recyclerVendorDetail.setBackgroundColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
            loadUI();
        } catch (Throwable th2) {
            noVendorFoundError(th2);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        e0.checkNotNullParameter(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        setStatusToResult();
        finish();
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (getMViewModel().isNeedToDisplayQrCode()) {
            this.jobQrCode = BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.c1.getLifecycleScope(this), null, null, new C37281(null), 3, null);
            if (getMViewModel().getQrCodeShowing()) {
                m mVar = this.qrCodeDialog;
                if (mVar == null || !(mVar == null || mVar.isShowing())) {
                    getMViewModel().displayLastQrCode();
                }
            }
        }
    }

    @Override // com.sfbx.appconsentv3.ui.AppConsentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
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

    @Override // com.sfbx.appconsentv3.ui.listener.SwitchViewListener
    public void onSwitchChanged(ConsentStatus newStatus) {
        e0.checkNotNullParameter(newStatus, "newStatus");
        VendorViewModel mViewModel = getMViewModel();
        Vendor vendor = this.mVendor;
        Vendor vendor2 = null;
        if (vendor == null) {
            e0.throwUninitializedPropertyAccessException("mVendor");
            vendor = null;
        }
        mViewModel.sendSwitchPurposeObjectIsOnOffTrackEvent(vendor.getId(), newStatus == ConsentStatus.ALLOWED);
        VendorViewModel mViewModel2 = getMViewModel();
        Vendor vendor3 = this.mVendor;
        if (vendor3 == null) {
            e0.throwUninitializedPropertyAccessException("mVendor");
        } else {
            vendor2 = vendor3;
        }
        mViewModel2.setVendorStatus(vendor2.getId(), newStatus).observe(this, new com.sfbx.appconsentv3.ui.ui.consentable.detail.a(15, new C37291(newStatus)));
    }
}
