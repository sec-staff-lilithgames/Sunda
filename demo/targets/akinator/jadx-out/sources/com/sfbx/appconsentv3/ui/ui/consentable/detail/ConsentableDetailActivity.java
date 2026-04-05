package com.sfbx.appconsentv3.ui.ui.consentable.detail;

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
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsentv3.ui.AppConsentActivity;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ActivityConsentableDetailBinding;
import com.sfbx.appconsentv3.ui.model.QrCodeData;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.ui.consentable.detail.HeaderAdapter;
import com.sfbx.appconsentv3.ui.ui.consentable.detail.HeaderAdapter.DescriptionHeaderAdapter;
import com.sfbx.appconsentv3.ui.ui.consentable.detail.VendorAdapter;
import com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationActivity;
import com.sfbx.appconsentv3.ui.ui.notice.NoticeActivity;
import com.sfbx.appconsentv3.ui.ui.privacy.PrivacyPolicyActivity;
import com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListFragment;
import com.sfbx.appconsentv3.ui.util.AlertDialogUtil;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import com.sfbx.appconsentv3.ui.view.RejectButtonView;
import io.sfbx.appconsent.logger.ACLogger;
import io.sfbx.appconsent.logger.ACLoggerContract;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
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
import uu.y0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConsentableDetailActivity extends AppConsentActivity implements VendorAdapter.VendorListener, RejectButtonView.RejectButtonListener {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_ID = "extra_id";
    private static final String EXTRA_STATUS = "extra_status";
    private static final String EXTRA_TYPE = "extra_type";
    private AppconsentV3ActivityConsentableDetailBinding binding;

    /* renamed from: id, reason: collision with root package name */
    private int f50545id;
    private Job jobQrCode;
    private Consentable mConsentable;
    private Boolean mIsLegitimateInteresetMustBeDisplayed;
    private final o mViewModel$delegate;
    private m qrCodeDialog;
    private ConsentStatus status;
    private ConsentableType type;
    private HeaderAdapter.VendorLITHeaderAdapter vendorLITHeaderAdapter;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final Intent getStartIntent(Context context, int i10, ConsentableType type, ConsentStatus status) {
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(type, "type");
            e0.checkNotNullParameter(status, "status");
            Intent intent = new Intent(context, (Class<?>) ConsentableDetailActivity.class);
            intent.putExtra(ConsentableDetailActivity.EXTRA_ID, i10);
            intent.putExtra(ConsentableDetailActivity.EXTRA_TYPE, type);
            intent.putExtra(ConsentableDetailActivity.EXTRA_STATUS, status);
            return intent;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailActivity$onClick$1, reason: invalid class name */
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
                HeaderAdapter.VendorLITHeaderAdapter vendorLITHeaderAdapter = ConsentableDetailActivity.this.vendorLITHeaderAdapter;
                Consentable consentable = null;
                if (vendorLITHeaderAdapter == null) {
                    e0.throwUninitializedPropertyAccessException("vendorLITHeaderAdapter");
                    vendorLITHeaderAdapter = null;
                }
                vendorLITHeaderAdapter.submitStatus(this.$isRejected ? ConsentStatus.DISALLOWED : ConsentStatus.ALLOWED);
                Consentable consentable2 = ConsentableDetailActivity.this.mConsentable;
                if (consentable2 == null) {
                    e0.throwUninitializedPropertyAccessException("mConsentable");
                } else {
                    consentable = consentable2;
                }
                List<Vendor> vendors = consentable.getVendors();
                ArrayList arrayList = new ArrayList();
                for (Object obj : vendors) {
                    if (((Vendor) obj).isLegVendor()) {
                        arrayList.add(obj);
                    }
                }
                boolean z10 = this.$isRejected;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Vendor) it.next()).setStatus(z10 ? ConsentStatus.DISALLOWED : ConsentStatus.ALLOWED);
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailActivity$onStart$1", f = "ConsentableDetailActivity.kt", i = {}, l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailActivity$onStart$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37031 extends n implements p {
        int label;

        public C37031(d<? super C37031> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return ConsentableDetailActivity.this.new C37031(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                SharedFlow<Response<QrCodeData>> qrCode = ConsentableDetailActivity.this.getMViewModel().getQrCode();
                final ConsentableDetailActivity consentableDetailActivity = ConsentableDetailActivity.this;
                FlowCollector<? super Response<QrCodeData>> flowCollector = new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailActivity.onStart.1.1

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    /* renamed from: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailActivity$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C05121 extends f0 implements kv.a {
                        final /* synthetic */ ConsentableDetailActivity this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C05121(ConsentableDetailActivity consentableDetailActivity) {
                            super(0);
                            this.this$0 = consentableDetailActivity;
                        }

                        @Override // kv.a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m3468invoke();
                            return x0.f87415a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m3468invoke() {
                            ACLogger aCLogger = ACLogger.INSTANCE;
                            ACLoggerContract.DefaultImpls.d$default(aCLogger, "ConsentableDetailActivity", "QR code onCanceled Called", null, 4, null);
                            if (this.this$0.qrCodeDialog != null) {
                                m mVar = this.this$0.qrCodeDialog;
                                if (mVar != null) {
                                    mVar.dismiss();
                                }
                                ACLoggerContract.DefaultImpls.d$default(aCLogger, "ConsentableDetailActivity", "qrcode dialog dismissed", null, 4, null);
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
                            ConsentableDetailActivity consentableDetailActivity2 = consentableDetailActivity;
                            Response.Success success = (Response.Success) response;
                            m mVarBuildQrCode$appconsent_ui_v3_prodXchangeRelease = alertDialogUtil.buildQrCode$appconsent_ui_v3_prodXchangeRelease(consentableDetailActivity2, consentableDetailActivity2.getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease(), ((QrCodeData) success.getData()).getTitle(), ((QrCodeData) success.getData()).getDescription(), ((QrCodeData) success.getData()).getQrCode(), new C05121(consentableDetailActivity));
                            if (mVarBuildQrCode$appconsent_ui_v3_prodXchangeRelease != null) {
                                ConsentableDetailActivity consentableDetailActivity3 = consentableDetailActivity;
                                if (consentableDetailActivity3.qrCodeDialog != null) {
                                    m mVar = consentableDetailActivity3.qrCodeDialog;
                                    if (mVar != null) {
                                        mVar.dismiss();
                                    }
                                    consentableDetailActivity3.qrCodeDialog = null;
                                }
                                consentableDetailActivity3.qrCodeDialog = mVarBuildQrCode$appconsent_ui_v3_prodXchangeRelease;
                                mVarBuildQrCode$appconsent_ui_v3_prodXchangeRelease.show();
                            }
                            consentableDetailActivity.getMViewModel().qrCodePopupDisplayed();
                        } else if (response instanceof Response.Error) {
                            ConsentableDetailActivity consentableDetailActivity4 = consentableDetailActivity;
                            Toast.makeText(consentableDetailActivity4, consentableDetailActivity4.getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_v3_qr_code_error_loading), 0).show();
                            m mVar2 = consentableDetailActivity.qrCodeDialog;
                            if (mVar2 != null) {
                                mVar2.dismiss();
                            }
                            consentableDetailActivity.qrCodeDialog = null;
                            consentableDetailActivity.getMViewModel().qrCodeDismissed();
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
            return ((C37031) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public ConsentableDetailActivity() {
        super(false, 1, null);
        this.mViewModel$delegate = new i3(c1.getOrCreateKotlinClass(ConsentableDetailViewModel.class), new ConsentableDetailActivity$special$$inlined$viewModels$2(this), new ConsentableDetailActivity$mViewModel$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConsentableDetailViewModel getMViewModel() {
        return (ConsentableDetailViewModel) this.mViewModel$delegate.getValue();
    }

    public static final Intent getStartIntent(Context context, int i10, ConsentableType consentableType, ConsentStatus consentStatus) {
        return Companion.getStartIntent(context, i10, consentableType, consentStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClick$lambda$9(l tmp0, Object obj) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void setStatusToResult() {
        Intent resultIntent;
        Consentable consentable = this.mConsentable;
        Consentable consentable2 = null;
        if (consentable == null) {
            e0.throwUninitializedPropertyAccessException("mConsentable");
            consentable = null;
        }
        if (consentable.isGeolocation()) {
            GeolocationActivity.Companion companion = GeolocationActivity.Companion;
            Consentable consentable3 = this.mConsentable;
            if (consentable3 == null) {
                e0.throwUninitializedPropertyAccessException("mConsentable");
                consentable3 = null;
            }
            int id2 = consentable3.getId();
            Consentable consentable4 = this.mConsentable;
            if (consentable4 == null) {
                e0.throwUninitializedPropertyAccessException("mConsentable");
            } else {
                consentable2 = consentable4;
            }
            resultIntent = companion.getResultIntent(id2, consentable2.getStatus());
        } else {
            NoticeActivity.Companion companion2 = NoticeActivity.Companion;
            Consentable consentable5 = this.mConsentable;
            if (consentable5 == null) {
                e0.throwUninitializedPropertyAccessException("mConsentable");
                consentable5 = null;
            }
            int id3 = consentable5.getId();
            Consentable consentable6 = this.mConsentable;
            if (consentable6 == null) {
                e0.throwUninitializedPropertyAccessException("mConsentable");
                consentable6 = null;
            }
            ConsentableType type = consentable6.getType();
            Consentable consentable7 = this.mConsentable;
            if (consentable7 == null) {
                e0.throwUninitializedPropertyAccessException("mConsentable");
            } else {
                consentable2 = consentable7;
            }
            resultIntent = companion2.getResultIntent(id3, type, consentable2.getStatus());
        }
        setResult(-1, resultIntent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setStatusToResult();
        super.onBackPressed();
    }

    @Override // com.sfbx.appconsentv3.ui.view.RejectButtonView.RejectButtonListener
    public void onClick(boolean z10) {
        ConsentableDetailViewModel mViewModel = getMViewModel();
        int i10 = this.f50545id;
        ConsentableType consentableType = this.type;
        if (consentableType == null) {
            e0.throwUninitializedPropertyAccessException("type");
            consentableType = null;
        }
        mViewModel.rejectLITVendors(i10, consentableType, z10).observe(this, new a(0, new AnonymousClass1(z10)));
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
            ConsentableDetailViewModel.getQrCode$default(getMViewModel(), vendorName, title, url, false, 8, null);
        } else {
            startActivity(PrivacyPolicyActivity.Companion.startIntent$default(PrivacyPolicyActivity.Companion, this, url, vendorName, false, 8, null));
        }
    }

    @Override // com.sfbx.appconsentv3.ui.ui.consentable.detail.VendorAdapter.VendorListener
    public void onClickSeeAll(boolean z10) {
        VendorListFragment.Companion companion = VendorListFragment.Companion;
        Consentable consentable = this.mConsentable;
        if (consentable == null) {
            e0.throwUninitializedPropertyAccessException("mConsentable");
            consentable = null;
        }
        companion.newInstance(consentable.getId(), z10).show(getSupportFragmentManager(), (String) null);
    }

    @Override // com.sfbx.appconsentv3.ui.AppConsentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppconsentV3ActivityConsentableDetailBinding appconsentV3ActivityConsentableDetailBindingInflate = AppconsentV3ActivityConsentableDetailBinding.inflate(getLayoutInflater());
        e0.checkNotNullExpressionValue(appconsentV3ActivityConsentableDetailBindingInflate, "inflate(layoutInflater)");
        this.binding = appconsentV3ActivityConsentableDetailBindingInflate;
        AppconsentV3ActivityConsentableDetailBinding appconsentV3ActivityConsentableDetailBinding = null;
        if (appconsentV3ActivityConsentableDetailBindingInflate == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityConsentableDetailBindingInflate = null;
        }
        RecyclerView root = appconsentV3ActivityConsentableDetailBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "binding.root");
        setCustomContentViewFromLayer2(root);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            throw new IllegalArgumentException();
        }
        this.f50545id = extras.getInt(EXTRA_ID);
        Bundle extras2 = getIntent().getExtras();
        Serializable serializable = extras2 != null ? extras2.getSerializable(EXTRA_TYPE) : null;
        e0.checkNotNull(serializable, "null cannot be cast to non-null type com.sfbx.appconsent.core.model.ConsentableType");
        this.type = (ConsentableType) serializable;
        Bundle extras3 = getIntent().getExtras();
        Serializable serializable2 = extras3 != null ? extras3.getSerializable(EXTRA_STATUS) : null;
        e0.checkNotNull(serializable2, "null cannot be cast to non-null type com.sfbx.appconsent.core.model.ConsentStatus");
        this.status = (ConsentStatus) serializable2;
        ConsentableDetailViewModel mViewModel = getMViewModel();
        int i10 = this.f50545id;
        ConsentableType consentableType = this.type;
        if (consentableType == null) {
            e0.throwUninitializedPropertyAccessException("type");
            consentableType = null;
        }
        this.mConsentable = mViewModel.getConsentable(i10, consentableType);
        this.mIsLegitimateInteresetMustBeDisplayed = Boolean.valueOf(getMViewModel().isLegintableMustBeDisplayed());
        if (this.type == null) {
            e0.throwUninitializedPropertyAccessException("type");
        }
        ConsentableType.Companion companion = ConsentableType.Companion;
        getMViewModel().sendClickDetailPurposeTrackEvent(this.f50545id);
        Consentable consentable = this.mConsentable;
        if (consentable == null) {
            e0.throwUninitializedPropertyAccessException("mConsentable");
            consentable = null;
        }
        ConsentStatus consentStatus = this.status;
        if (consentStatus == null) {
            e0.throwUninitializedPropertyAccessException("status");
            consentStatus = null;
        }
        consentable.setStatus(consentStatus);
        Consentable consentable2 = this.mConsentable;
        if (consentable2 == null) {
            e0.throwUninitializedPropertyAccessException("mConsentable");
            consentable2 = null;
        }
        List<Vendor> vendors = consentable2.getVendors();
        ArrayList arrayList = new ArrayList();
        for (Object obj : vendors) {
            if (!((Vendor) obj).isLegVendor()) {
                arrayList.add(obj);
            }
        }
        List<Object> listSortedWith = y0.sortedWith(arrayList, new Comparator() { // from class: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailActivity$onCreate$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                String name = ((Vendor) t10).getName();
                Locale locale = Locale.getDefault();
                e0.checkNotNullExpressionValue(locale, "getDefault()");
                String lowerCase = name.toLowerCase(locale);
                e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                String name2 = ((Vendor) t11).getName();
                Locale locale2 = Locale.getDefault();
                e0.checkNotNullExpressionValue(locale2, "getDefault()");
                String lowerCase2 = name2.toLowerCase(locale2);
                e0.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                return xu.d.compareValues(lowerCase, lowerCase2);
            }
        });
        Consentable consentable3 = this.mConsentable;
        if (consentable3 == null) {
            e0.throwUninitializedPropertyAccessException("mConsentable");
            consentable3 = null;
        }
        List<Vendor> vendors2 = consentable3.getVendors();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : vendors2) {
            if (((Vendor) obj2).isLegVendor()) {
                arrayList2.add(obj2);
            }
        }
        List<Object> listSortedWith2 = y0.sortedWith(arrayList2, new Comparator() { // from class: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailActivity$onCreate$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                String name = ((Vendor) t10).getName();
                Locale locale = Locale.getDefault();
                e0.checkNotNullExpressionValue(locale, "getDefault()");
                String lowerCase = name.toLowerCase(locale);
                e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                String name2 = ((Vendor) t11).getName();
                Locale locale2 = Locale.getDefault();
                e0.checkNotNullExpressionValue(locale2, "getDefault()");
                String lowerCase2 = name2.toLowerCase(locale2);
                e0.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                return xu.d.compareValues(lowerCase, lowerCase2);
            }
        });
        Consentable consentable4 = this.mConsentable;
        if (consentable4 == null) {
            e0.throwUninitializedPropertyAccessException("mConsentable");
            consentable4 = null;
        }
        ExtensionKt.setupCustomTitle(this, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getActionBarColor$appconsent_ui_v3_prodXchangeRelease(), getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getActionBarTextColor$appconsent_ui_v3_prodXchangeRelease(), getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease(), consentable4.getNameAsString(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getLanguage$appconsent_ui_v3_prodXchangeRelease()));
        AppconsentV3ActivityConsentableDetailBinding appconsentV3ActivityConsentableDetailBinding2 = this.binding;
        if (appconsentV3ActivityConsentableDetailBinding2 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityConsentableDetailBinding2 = null;
        }
        appconsentV3ActivityConsentableDetailBinding2.recyclerConsentableDetail.setBackgroundColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        ArrayList arrayList3 = new ArrayList();
        Consentable consentable5 = this.mConsentable;
        if (consentable5 == null) {
            e0.throwUninitializedPropertyAccessException("mConsentable");
            consentable5 = null;
        }
        HeaderAdapter headerAdapter = new HeaderAdapter(consentable5, this.mIsLegitimateInteresetMustBeDisplayed);
        arrayList3.add(headerAdapter.new DescriptionHeaderAdapter());
        arrayList3.add(new HeaderAdapter.VendorHeaderAdapter(headerAdapter, new ConsentableDetailActivity$onCreate$vendorHeaderAdapter$1(this)));
        VendorAdapter vendorAdapter = new VendorAdapter(this, null, false, 6, null);
        vendorAdapter.submitList(listSortedWith);
        arrayList3.add(vendorAdapter);
        if (e0.areEqual(Boolean.TRUE, this.mIsLegitimateInteresetMustBeDisplayed)) {
            HeaderAdapter.VendorLITHeaderAdapter vendorLITHeaderAdapter = new HeaderAdapter.VendorLITHeaderAdapter(headerAdapter, this);
            this.vendorLITHeaderAdapter = vendorLITHeaderAdapter;
            arrayList3.add(vendorLITHeaderAdapter);
            Consentable consentable6 = this.mConsentable;
            if (consentable6 == null) {
                e0.throwUninitializedPropertyAccessException("mConsentable");
                consentable6 = null;
            }
            VendorAdapter vendorAdapter2 = new VendorAdapter(this, consentable6.getType(), false, 4, null);
            vendorAdapter2.submitList(listSortedWith2);
            arrayList3.add(vendorAdapter2);
        }
        r rVar = new r(arrayList3);
        AppconsentV3ActivityConsentableDetailBinding appconsentV3ActivityConsentableDetailBinding3 = this.binding;
        if (appconsentV3ActivityConsentableDetailBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            appconsentV3ActivityConsentableDetailBinding = appconsentV3ActivityConsentableDetailBinding3;
        }
        RecyclerView recyclerView = appconsentV3ActivityConsentableDetailBinding.recyclerConsentableDetail;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(rVar);
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
            this.jobQrCode = BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.c1.getLifecycleScope(this), null, null, new C37031(null), 3, null);
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
}
