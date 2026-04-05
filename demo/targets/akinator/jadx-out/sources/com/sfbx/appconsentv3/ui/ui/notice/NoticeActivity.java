package com.sfbx.appconsentv3.ui.ui.notice;

import af.g;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.i3;
import androidx.lifecycle.u1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsentv3.ui.AppConsentActivity;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ActivityNoticeBinding;
import com.sfbx.appconsentv3.ui.listener.ConsentableListener;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailActivity;
import com.sfbx.appconsentv3.ui.ui.consentable.mandatory.MandatoryActivity;
import com.sfbx.appconsentv3.ui.ui.consentable.stack.StackActivity;
import com.sfbx.appconsentv3.ui.ui.finish.FinishActivity;
import com.sfbx.appconsentv3.ui.ui.notice.NoticeAdapter;
import com.sfbx.appconsentv3.ui.ui.notice.NoticeAdapter.CopyrightAdapter;
import com.sfbx.appconsentv3.ui.ui.notice.NoticeAdapter.IllustratedAdapter;
import com.sfbx.appconsentv3.ui.ui.vendor.refine.RefineByVendorActivity;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import com.sfbx.appconsentv3.ui.util.SfbxIABWebViewThrowable;
import com.sfbx.appconsentv3.ui.view.NoticeBannerView;
import i.d;
import io.sfbx.appconsent.logger.ACLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class NoticeActivity extends AppConsentActivity implements NoticeBannerView.OnClickButtonListener, ConsentableListener, NoticeAdapter.DescriptionListener, NoticeAdapter.HeaderSwitchListener, NoticeAdapter.MandatoryListener, NoticeAdapter.VendorsListener {
    private static final String EXTRA_ID = "extra_id";
    private static final String EXTRA_STATUS = "extra_status";
    private static final String EXTRA_TRIGGERED = "extra_triggered";
    private static final String EXTRA_TYPE = "extra_type";
    private final u1 acceptAllObserver;
    private AppconsentV3ActivityNoticeBinding binding;
    private final u1 consentablesObserver;
    private boolean displayHeader;
    private NoticeAdapter.ButtonActionAdapter mButtonActionAdapter;
    private final ConsentableAdapter mConsentableAdapter;
    private List<Consentable> mConsentables;
    private final ConsentableAdapter mExtraConsentableAdapter;
    private NoticeAdapter.HeaderSwitchAdapter mHeaderSwitchAdapter;
    private final ConsentableAdapter mSpecialFeatureAdapter;
    private final o mViewModel$delegate;
    private final u1 refuseAllObserver;
    private final u1 saveConsentsObserver;
    private final u1 setConsentObserver;
    private final d startForResult;
    private boolean triggeredByUser;
    public static final Companion Companion = new Companion(null);
    private static final String tag = "NoticeActivity";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final Intent getResultIntent(int i10, ConsentableType type, ConsentStatus status) {
            e0.checkNotNullParameter(type, "type");
            e0.checkNotNullParameter(status, "status");
            Intent intent = new Intent();
            intent.putExtra(NoticeActivity.EXTRA_ID, i10);
            intent.putExtra(NoticeActivity.EXTRA_TYPE, type);
            intent.putExtra(NoticeActivity.EXTRA_STATUS, status);
            return intent;
        }

        public final Intent getStartIntent(Context context, boolean z10) {
            e0.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) NoticeActivity.class);
            intent.putExtra(NoticeActivity.EXTRA_TRIGGERED, z10);
            return intent;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConsentableType.values().length];
            try {
                iArr[ConsentableType.STACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConsentableType.PURPOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConsentableType.SPECIAL_PURPOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NoticeActivity() {
        super(false, 1, null);
        this.mViewModel$delegate = new i3(c1.getOrCreateKotlinClass(NoticeViewModel.class), new NoticeActivity$special$$inlined$viewModels$2(this), new NoticeActivity$mViewModel$2(this));
        this.mConsentableAdapter = new ConsentableAdapter(this);
        this.mExtraConsentableAdapter = new ConsentableAdapter(this);
        this.mSpecialFeatureAdapter = new ConsentableAdapter(this);
        this.mConsentables = new ArrayList();
        d dVarRegisterForActivityResult = registerForActivityResult(new j.d(), new g(this, 16));
        e0.checkNotNullExpressionValue(dVarRegisterForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.startForResult = dVarRegisterForActivityResult;
        final int i10 = 0;
        this.setConsentObserver = new u1(this) { // from class: com.sfbx.appconsentv3.ui.ui.notice.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ NoticeActivity f50557c;

            {
                this.f50557c = this;
            }

            @Override // androidx.lifecycle.u1
            public final void onChanged(Object obj) {
                switch (i10) {
                    case 0:
                        NoticeActivity.setConsentObserver$lambda$4(this.f50557c, (Response) obj);
                        break;
                    case 1:
                        NoticeActivity.saveConsentsObserver$lambda$5(this.f50557c, (Response) obj);
                        break;
                    case 2:
                        NoticeActivity.acceptAllObserver$lambda$8(this.f50557c, (Response) obj);
                        break;
                    case 3:
                        NoticeActivity.refuseAllObserver$lambda$11(this.f50557c, (Response) obj);
                        break;
                    default:
                        NoticeActivity.consentablesObserver$lambda$13(this.f50557c, (Response) obj);
                        break;
                }
            }
        };
        final int i11 = 1;
        this.saveConsentsObserver = new u1(this) { // from class: com.sfbx.appconsentv3.ui.ui.notice.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ NoticeActivity f50557c;

            {
                this.f50557c = this;
            }

            @Override // androidx.lifecycle.u1
            public final void onChanged(Object obj) {
                switch (i11) {
                    case 0:
                        NoticeActivity.setConsentObserver$lambda$4(this.f50557c, (Response) obj);
                        break;
                    case 1:
                        NoticeActivity.saveConsentsObserver$lambda$5(this.f50557c, (Response) obj);
                        break;
                    case 2:
                        NoticeActivity.acceptAllObserver$lambda$8(this.f50557c, (Response) obj);
                        break;
                    case 3:
                        NoticeActivity.refuseAllObserver$lambda$11(this.f50557c, (Response) obj);
                        break;
                    default:
                        NoticeActivity.consentablesObserver$lambda$13(this.f50557c, (Response) obj);
                        break;
                }
            }
        };
        final int i12 = 2;
        this.acceptAllObserver = new u1(this) { // from class: com.sfbx.appconsentv3.ui.ui.notice.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ NoticeActivity f50557c;

            {
                this.f50557c = this;
            }

            @Override // androidx.lifecycle.u1
            public final void onChanged(Object obj) {
                switch (i12) {
                    case 0:
                        NoticeActivity.setConsentObserver$lambda$4(this.f50557c, (Response) obj);
                        break;
                    case 1:
                        NoticeActivity.saveConsentsObserver$lambda$5(this.f50557c, (Response) obj);
                        break;
                    case 2:
                        NoticeActivity.acceptAllObserver$lambda$8(this.f50557c, (Response) obj);
                        break;
                    case 3:
                        NoticeActivity.refuseAllObserver$lambda$11(this.f50557c, (Response) obj);
                        break;
                    default:
                        NoticeActivity.consentablesObserver$lambda$13(this.f50557c, (Response) obj);
                        break;
                }
            }
        };
        final int i13 = 3;
        this.refuseAllObserver = new u1(this) { // from class: com.sfbx.appconsentv3.ui.ui.notice.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ NoticeActivity f50557c;

            {
                this.f50557c = this;
            }

            @Override // androidx.lifecycle.u1
            public final void onChanged(Object obj) {
                switch (i13) {
                    case 0:
                        NoticeActivity.setConsentObserver$lambda$4(this.f50557c, (Response) obj);
                        break;
                    case 1:
                        NoticeActivity.saveConsentsObserver$lambda$5(this.f50557c, (Response) obj);
                        break;
                    case 2:
                        NoticeActivity.acceptAllObserver$lambda$8(this.f50557c, (Response) obj);
                        break;
                    case 3:
                        NoticeActivity.refuseAllObserver$lambda$11(this.f50557c, (Response) obj);
                        break;
                    default:
                        NoticeActivity.consentablesObserver$lambda$13(this.f50557c, (Response) obj);
                        break;
                }
            }
        };
        final int i14 = 4;
        this.consentablesObserver = new u1(this) { // from class: com.sfbx.appconsentv3.ui.ui.notice.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ NoticeActivity f50557c;

            {
                this.f50557c = this;
            }

            @Override // androidx.lifecycle.u1
            public final void onChanged(Object obj) {
                switch (i14) {
                    case 0:
                        NoticeActivity.setConsentObserver$lambda$4(this.f50557c, (Response) obj);
                        break;
                    case 1:
                        NoticeActivity.saveConsentsObserver$lambda$5(this.f50557c, (Response) obj);
                        break;
                    case 2:
                        NoticeActivity.acceptAllObserver$lambda$8(this.f50557c, (Response) obj);
                        break;
                    case 3:
                        NoticeActivity.refuseAllObserver$lambda$11(this.f50557c, (Response) obj);
                        break;
                    default:
                        NoticeActivity.consentablesObserver$lambda$13(this.f50557c, (Response) obj);
                        break;
                }
            }
        };
    }

    private final void acceptAll() {
        getMViewModel().acceptAll(!this.triggeredByUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void acceptAllObserver$lambda$8(NoticeActivity this$0, Response response) {
        e0.checkNotNullParameter(this$0, "this$0");
        if (response instanceof Response.Success) {
            List<Consentable> list = this$0.mConsentables;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Consentable consentable = (Consentable) obj;
                if (consentable.getType() != ConsentableType.SPECIAL_PURPOSE && consentable.getType() != ConsentableType.FEATURE) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Consentable) it.next()).setStatus(ConsentStatus.ALLOWED);
            }
            AppconsentV3ActivityNoticeBinding appconsentV3ActivityNoticeBinding = this$0.binding;
            if (appconsentV3ActivityNoticeBinding == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityNoticeBinding = null;
            }
            RecyclerView.a adapter = appconsentV3ActivityNoticeBinding.recyclerConsentable.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            this$0.checkStatus();
        }
    }

    private final void checkStatus() {
        NoticeAdapter.ButtonActionAdapter buttonActionAdapter;
        updateGlobalSwitch();
        if (isStatusPending() || (buttonActionAdapter = this.mButtonActionAdapter) == null) {
            return;
        }
        buttonActionAdapter.updateBannerUI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void consentablesObserver$lambda$13(NoticeActivity this$0, Response response) {
        e0.checkNotNullParameter(this$0, "this$0");
        AppconsentV3ActivityNoticeBinding appconsentV3ActivityNoticeBinding = null;
        if (response instanceof Response.Success) {
            AppconsentV3ActivityNoticeBinding appconsentV3ActivityNoticeBinding2 = this$0.binding;
            if (appconsentV3ActivityNoticeBinding2 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                appconsentV3ActivityNoticeBinding = appconsentV3ActivityNoticeBinding2;
            }
            appconsentV3ActivityNoticeBinding.noticeLoader.setVisibility(8);
            this$0.loadData((List) ((Response.Success) response).getData());
            return;
        }
        if (!(response instanceof Response.Error)) {
            if (response instanceof Response.Loading) {
                AppconsentV3ActivityNoticeBinding appconsentV3ActivityNoticeBinding3 = this$0.binding;
                if (appconsentV3ActivityNoticeBinding3 == null) {
                    e0.throwUninitializedPropertyAccessException("binding");
                } else {
                    appconsentV3ActivityNoticeBinding = appconsentV3ActivityNoticeBinding3;
                }
                appconsentV3ActivityNoticeBinding.noticeLoader.setVisibility(0);
                return;
            }
            return;
        }
        AppconsentV3ActivityNoticeBinding appconsentV3ActivityNoticeBinding4 = this$0.binding;
        if (appconsentV3ActivityNoticeBinding4 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            appconsentV3ActivityNoticeBinding = appconsentV3ActivityNoticeBinding4;
        }
        appconsentV3ActivityNoticeBinding.noticeLoader.setVisibility(8);
        ACLogger aCLogger = ACLogger.INSTANCE;
        String tag2 = tag;
        e0.checkNotNullExpressionValue(tag2, "tag");
        Response.Error error = (Response.Error) response;
        aCLogger.e(tag2, error.getError());
        if ((error.getError().getCause() instanceof SfbxIABWebViewThrowable) || (error.getError() instanceof NoSuchElementException)) {
            Intent intent = this$0.getIntent();
            intent.putExtra("SFBX_IAB_WEBVIEW_THROWABLE", true);
            this$0.setResult(0, intent);
        } else {
            this$0.setResult(0);
        }
        this$0.finish();
    }

    private final NoticeViewModel getMViewModel() {
        return (NoticeViewModel) this.mViewModel$delegate.getValue();
    }

    public static final Intent getResultIntent(int i10, ConsentableType consentableType, ConsentStatus consentStatus) {
        return Companion.getResultIntent(i10, consentableType, consentStatus);
    }

    public static final Intent getStartIntent(Context context, boolean z10) {
        return Companion.getStartIntent(context, z10);
    }

    private final void initRecycler() {
        boolean z10;
        AppconsentV3ActivityNoticeBinding appconsentV3ActivityNoticeBinding;
        NoticeAdapter noticeAdapter = new NoticeAdapter();
        NoticeAdapter.DescriptionHeaderAdapter descriptionHeaderAdapter = new NoticeAdapter.DescriptionHeaderAdapter(noticeAdapter, this.displayHeader, this);
        this.mHeaderSwitchAdapter = new NoticeAdapter.HeaderSwitchAdapter(noticeAdapter, this);
        List<Consentable> purposesCategoryDisplay = ExtensionKt.getPurposesCategoryDisplay(this.mConsentables);
        this.mConsentableAdapter.submitList(purposesCategoryDisplay);
        String noticeLabelDataCollectionText$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getNoticeLabelDataCollectionText$appconsent_ui_v3_prodXchangeRelease();
        if (!purposesCategoryDisplay.isEmpty()) {
            z10 = true;
            break;
        }
        List<Consentable> list = this.mConsentables;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Consentable) it.next()).getType() == ConsentableType.SPECIAL_PURPOSE) {
                    List<Consentable> list2 = this.mConsentables;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((Consentable) it2.next()).getType() == ConsentableType.EXTRA_PURPOSE) {
                            }
                        }
                    }
                }
            }
            z10 = true;
            break;
        }
        z10 = false;
        NoticeAdapter.LabelAdapter labelAdapter = new NoticeAdapter.LabelAdapter(noticeAdapter, noticeLabelDataCollectionText$appconsent_ui_v3_prodXchangeRelease, z10, 0, 4, null);
        List<Consentable> list3 = this.mConsentables;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            if (((Consentable) obj).getType() == ConsentableType.SPECIAL_PURPOSE) {
                arrayList.add(obj);
            }
        }
        NoticeAdapter.DisplayMandatoryAdapter displayMandatoryAdapter = new NoticeAdapter.DisplayMandatoryAdapter(noticeAdapter, arrayList, this);
        this.mExtraConsentableAdapter.submitList(ExtensionKt.getExtraCategoryDisplay(this.mConsentables));
        NoticeAdapter.LabelAdapter labelAdapter2 = new NoticeAdapter.LabelAdapter(noticeAdapter, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getNoticeLabelExtraUsageText$appconsent_ui_v3_prodXchangeRelease(), !r4.isEmpty(), 2);
        this.mSpecialFeatureAdapter.submitList(ExtensionKt.getFeatureCategoryDisplay(this.mConsentables));
        NoticeAdapter.LabelAdapter labelAdapter3 = new NoticeAdapter.LabelAdapter(noticeAdapter, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getNoticeLabelOtherUsageText$appconsent_ui_v3_prodXchangeRelease(), !r4.isEmpty(), 3);
        List<Consentable> list4 = this.mConsentables;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list4) {
            if (((Consentable) obj2).getType() == ConsentableType.FEATURE) {
                arrayList2.add(obj2);
            }
        }
        NoticeAdapter.DisplayMandatoryAdapter displayMandatoryAdapter2 = new NoticeAdapter.DisplayMandatoryAdapter(noticeAdapter, arrayList2, this);
        NoticeAdapter.DisplayVendorsAdapter displayVendorsAdapter = new NoticeAdapter.DisplayVendorsAdapter(noticeAdapter, this, getMViewModel().getVendors());
        NoticeAdapter.CopyrightAdapter copyrightAdapter = noticeAdapter.new CopyrightAdapter();
        this.mButtonActionAdapter = new NoticeAdapter.ButtonActionAdapter(noticeAdapter, this);
        NoticeAdapter.IllustratedAdapter illustratedAdapter = noticeAdapter.new IllustratedAdapter(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getEnableIllustrations$appconsent_ui_v3_prodXchangeRelease());
        AppconsentV3ActivityNoticeBinding appconsentV3ActivityNoticeBinding2 = this.binding;
        if (appconsentV3ActivityNoticeBinding2 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityNoticeBinding2 = null;
        }
        RecyclerView recyclerView = appconsentV3ActivityNoticeBinding2.recyclerConsentable;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        NoticeAdapter.HeaderSwitchAdapter headerSwitchAdapter = this.mHeaderSwitchAdapter;
        e0.checkNotNull(headerSwitchAdapter);
        ConsentableAdapter consentableAdapter = this.mConsentableAdapter;
        ConsentableAdapter consentableAdapter2 = this.mExtraConsentableAdapter;
        ConsentableAdapter consentableAdapter3 = this.mSpecialFeatureAdapter;
        NoticeAdapter.ButtonActionAdapter buttonActionAdapter = this.mButtonActionAdapter;
        e0.checkNotNull(buttonActionAdapter);
        recyclerView.setAdapter(new r(descriptionHeaderAdapter, headerSwitchAdapter, labelAdapter, consentableAdapter, displayMandatoryAdapter, labelAdapter2, consentableAdapter2, labelAdapter3, consentableAdapter3, displayMandatoryAdapter2, displayVendorsAdapter, buttonActionAdapter, illustratedAdapter, copyrightAdapter));
        AppconsentV3ActivityNoticeBinding appconsentV3ActivityNoticeBinding3 = this.binding;
        if (appconsentV3ActivityNoticeBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityNoticeBinding = null;
        } else {
            appconsentV3ActivityNoticeBinding = appconsentV3ActivityNoticeBinding3;
        }
        appconsentV3ActivityNoticeBinding.recyclerConsentable.setVisibility(0);
        checkStatus();
    }

    private final void initUI() {
        initRecycler();
        AppconsentV3ActivityNoticeBinding appconsentV3ActivityNoticeBinding = this.binding;
        if (appconsentV3ActivityNoticeBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityNoticeBinding = null;
        }
        appconsentV3ActivityNoticeBinding.intLayout.setBackgroundColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
    }

    private final boolean isStatusPending() {
        List<Consentable> list = this.mConsentables;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Consentable consentable = (Consentable) obj;
            if (consentable.getType() != ConsentableType.SPECIAL_PURPOSE && consentable.getType() != ConsentableType.FEATURE) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Consentable) it.next()).getStatus() == ConsentStatus.PENDING) {
                return true;
            }
        }
        return false;
    }

    private final void loadData(List<Consentable> list) {
        if (!this.triggeredByUser) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((Consentable) obj).isGeolocation()) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        this.mConsentables = list;
        initUI();
    }

    private final void refuseAll() {
        getMViewModel().refuseAll(!this.triggeredByUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refuseAllObserver$lambda$11(NoticeActivity this$0, Response response) {
        e0.checkNotNullParameter(this$0, "this$0");
        if (response instanceof Response.Success) {
            List<Consentable> list = this$0.mConsentables;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Consentable consentable = (Consentable) obj;
                if (consentable.getType() != ConsentableType.SPECIAL_PURPOSE && consentable.getType() != ConsentableType.FEATURE) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Consentable) it.next()).setStatus(ConsentStatus.DISALLOWED);
            }
            AppconsentV3ActivityNoticeBinding appconsentV3ActivityNoticeBinding = this$0.binding;
            if (appconsentV3ActivityNoticeBinding == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityNoticeBinding = null;
            }
            RecyclerView.a adapter = appconsentV3ActivityNoticeBinding.recyclerConsentable.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            this$0.checkStatus();
        }
    }

    private final void resetLastModificationBeforeQuitIfNecesary() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 0 && getIntent().getFlags() == 268435456) {
            getMViewModel().resetLastModification();
        }
    }

    private final void saveConsents() {
        if (isStatusPending()) {
            return;
        }
        getMViewModel().saveConsents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveConsentsObserver$lambda$5(NoticeActivity this$0, Response response) {
        e0.checkNotNullParameter(this$0, "this$0");
        if (response instanceof Response.Success) {
            this$0.displaySpinner(false);
            if (!this$0.getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getDisplaySuccessScreen$appconsent_ui_v3_prodXchangeRelease()) {
                this$0.setResult(-1);
                this$0.finish();
                return;
            } else {
                this$0.setResult(-1);
                this$0.startActivity(FinishActivity.Companion.getStartIntent(this$0));
                this$0.finish();
                return;
            }
        }
        if (!(response instanceof Response.Error)) {
            if (response instanceof Response.Loading) {
                this$0.displaySpinner(true);
            }
        } else {
            this$0.displaySpinner(false);
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag2 = tag;
            e0.checkNotNullExpressionValue(tag2, "tag");
            aCLogger.e(tag2, ((Response.Error) response).getError());
        }
    }

    private final void sendTrackEvent(Consentable consentable) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[consentable.getType().ordinal()];
        if (i10 == 1) {
            getMViewModel().sendClickStackTrackEvent(consentable.getId());
        } else {
            if (i10 != 2) {
                return;
            }
            getMViewModel().sendClickDetailPurposeTrackEvent(consentable.getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setConsentObserver$lambda$4(NoticeActivity this$0, Response response) {
        e0.checkNotNullParameter(this$0, "this$0");
        AppconsentV3ActivityNoticeBinding appconsentV3ActivityNoticeBinding = null;
        Object obj = null;
        if (!(response instanceof Response.Success)) {
            if (response instanceof Response.Error) {
                AppconsentV3ActivityNoticeBinding appconsentV3ActivityNoticeBinding2 = this$0.binding;
                if (appconsentV3ActivityNoticeBinding2 == null) {
                    e0.throwUninitializedPropertyAccessException("binding");
                } else {
                    appconsentV3ActivityNoticeBinding = appconsentV3ActivityNoticeBinding2;
                }
                RecyclerView.a adapter = appconsentV3ActivityNoticeBinding.recyclerConsentable.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                ACLogger aCLogger = ACLogger.INSTANCE;
                e0.checkNotNullExpressionValue("NoticeActivity", "this::class.java.simpleName");
                aCLogger.e("NoticeActivity", ((Response.Error) response).getError());
                return;
            }
            return;
        }
        Iterator<T> it = this$0.mConsentables.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Consentable consentable = (Consentable) next;
            Response.Success success = (Response.Success) response;
            if (consentable.getId() == ((Consentable) success.getData()).getId() && consentable.getType() == ((Consentable) success.getData()).getType()) {
                obj = next;
                break;
            }
        }
        Consentable consentable2 = (Consentable) obj;
        if (consentable2 != null) {
            consentable2.setStatus(((Consentable) ((Response.Success) response).getData()).getStatus());
        }
        this$0.checkStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startForResult$lambda$1(NoticeActivity this$0, ActivityResult activityResult) {
        e0.checkNotNullParameter(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            List<Consentable> consentablesInCache = this$0.getMViewModel().getConsentablesInCache();
            if (!this$0.triggeredByUser) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : consentablesInCache) {
                    if (!((Consentable) obj).isGeolocation()) {
                        arrayList.add(obj);
                    }
                }
                consentablesInCache = arrayList;
            }
            this$0.mConsentables = consentablesInCache;
            this$0.mConsentableAdapter.submitList(ExtensionKt.getPurposesCategoryDisplay(consentablesInCache));
            this$0.mExtraConsentableAdapter.submitList(ExtensionKt.getExtraCategoryDisplay(this$0.mConsentables));
            this$0.mSpecialFeatureAdapter.submitList(ExtensionKt.getFeatureCategoryDisplay(this$0.mConsentables));
            this$0.checkStatus();
        }
    }

    private final void updateGlobalSwitch() {
        boolean z10;
        boolean z11;
        List<Consentable> list = this.mConsentables;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Consentable consentable = (Consentable) obj;
            if (consentable.getType() != ConsentableType.SPECIAL_PURPOSE && consentable.getType() != ConsentableType.FEATURE) {
                arrayList.add(obj);
            }
        }
        boolean z12 = false;
        if (arrayList.isEmpty()) {
            z10 = true;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Consentable) it.next()).getStatus() != ConsentStatus.ALLOWED) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
        }
        if (arrayList.isEmpty()) {
            z11 = true;
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((Consentable) it2.next()).getStatus() != ConsentStatus.DISALLOWED) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (((Consentable) it3.next()).getStatus() == ConsentStatus.PENDING) {
                        z12 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        NoticeAdapter.HeaderSwitchAdapter headerSwitchAdapter = this.mHeaderSwitchAdapter;
        if (headerSwitchAdapter != null) {
            headerSwitchAdapter.updateGlobalStatus(z10 ? ConsentStatus.ALLOWED : z11 ? ConsentStatus.DISALLOWED : z12 ? ConsentStatus.PENDING : ConsentStatus.MIXED);
        }
    }

    @Override // com.sfbx.appconsentv3.ui.listener.ConsentableListener
    public void consentableStatusChanged(int i10, ConsentableType type, ConsentStatus newStatus) {
        e0.checkNotNullParameter(type, "type");
        e0.checkNotNullParameter(newStatus, "newStatus");
        if (type == ConsentableType.PURPOSE) {
            getMViewModel().sendSwitchPurposeIsOnOffTrackEvent(i10, newStatus == ConsentStatus.ALLOWED);
        } else if (type == ConsentableType.STACK) {
            getMViewModel().sendSwitchStackIsOnOffTrackEvent(i10, newStatus == ConsentStatus.ALLOWED);
        }
        getMViewModel().setConsentableStatus(i10, type, newStatus);
    }

    @Override // com.sfbx.appconsentv3.ui.ui.notice.NoticeAdapter.DescriptionListener
    public void displayHeader(boolean z10) {
        this.displayHeader = z10;
        initRecycler();
    }

    @Override // com.sfbx.appconsentv3.ui.ui.notice.NoticeAdapter.HeaderSwitchListener
    public void globalStatusChanged(ConsentStatus newStatus) {
        e0.checkNotNullParameter(newStatus, "newStatus");
        if (newStatus == ConsentStatus.ALLOWED) {
            acceptAll();
        } else {
            refuseAll();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        getMViewModel().sendGoBackTrackEvent();
        resetLastModificationBeforeQuitIfNecesary();
        super.onBackPressed();
    }

    @Override // com.sfbx.appconsentv3.ui.ui.notice.NoticeAdapter.MandatoryListener
    public void onClickMandatory(ConsentableType type) {
        e0.checkNotNullParameter(type, "type");
        if (WhenMappings.$EnumSwitchMapping$0[type.ordinal()] == 3) {
            getMViewModel().sendClickMandatoryFinalisesTrackEvent();
        } else {
            getMViewModel().sendClickMandatoryFunctionalitiesTrackEvent();
        }
        startActivity(MandatoryActivity.Companion.getStartIntent(this, type));
    }

    @Override // com.sfbx.appconsentv3.ui.view.NoticeBannerView.OnClickButtonListener
    public void onClickSaveButton() {
        getMViewModel().sendClickSaveTrackEvent();
        saveConsents();
    }

    @Override // com.sfbx.appconsentv3.ui.ui.notice.NoticeAdapter.VendorsListener
    public void onClickVendors() {
        getMViewModel().sendClickAffineByPartnersTrackEvent();
        getMViewModel().sendClickPartnersTrackEvent();
        startActivity(RefineByVendorActivity.Companion.getStartIntent$default(RefineByVendorActivity.Companion, this, false, 2, null));
    }

    @Override // com.sfbx.appconsentv3.ui.AppConsentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppconsentV3ActivityNoticeBinding appconsentV3ActivityNoticeBindingInflate = AppconsentV3ActivityNoticeBinding.inflate(getLayoutInflater());
        e0.checkNotNullExpressionValue(appconsentV3ActivityNoticeBindingInflate, "inflate(layoutInflater)");
        this.binding = appconsentV3ActivityNoticeBindingInflate;
        if (appconsentV3ActivityNoticeBindingInflate == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityNoticeBindingInflate = null;
        }
        ConstraintLayout root = appconsentV3ActivityNoticeBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "binding.root");
        setCustomContentViewFromLayer2(root);
        this.triggeredByUser = getIntent().getBooleanExtra(EXTRA_TRIGGERED, false);
        ExtensionKt.setupCustomTitle(this, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getActionBarColor$appconsent_ui_v3_prodXchangeRelease(), getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getActionBarTextColor$appconsent_ui_v3_prodXchangeRelease(), getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease(), getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getNoticeActionBarTitle$appconsent_ui_v3_prodXchangeRelease());
        getMViewModel().getConsentables().observe(this, this.consentablesObserver);
        getMViewModel().getSaveConsents().observe(this, this.saveConsentsObserver);
        getMViewModel().getConsentableStatus().observe(this, this.setConsentObserver);
        getMViewModel().getAcceptAll().observe(this, this.acceptAllObserver);
        getMViewModel().getRefuseAll().observe(this, this.refuseAllObserver);
        getMViewModel().m3471getConsentables();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        e0.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == 16908332) {
            resetLastModificationBeforeQuitIfNecesary();
            finish();
            return true;
        }
        if (itemId != R.id.action_profile) {
            return super.onOptionsItemSelected(item);
        }
        NoticeUserFragment.Companion.newInstance().show(getSupportFragmentManager(), (String) null);
        return true;
    }

    @Override // com.sfbx.appconsentv3.ui.listener.ConsentableListener
    public void seeMore(Consentable consentable) {
        Object next;
        ConsentStatus status;
        Intent startIntent;
        e0.checkNotNullParameter(consentable, "consentable");
        sendTrackEvent(consentable);
        if (WhenMappings.$EnumSwitchMapping$0[consentable.getType().ordinal()] == 1) {
            startIntent = StackActivity.Companion.getStartIntent(this, consentable.getId());
        } else {
            ConsentableDetailActivity.Companion companion = ConsentableDetailActivity.Companion;
            int id2 = consentable.getId();
            ConsentableType type = consentable.getType();
            Iterator<T> it = this.mConsentables.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Consentable consentable2 = (Consentable) next;
                if (consentable2.getId() == consentable.getId() && consentable2.getType() == consentable.getType()) {
                    break;
                }
            }
            Consentable consentable3 = (Consentable) next;
            if (consentable3 == null || (status = consentable3.getStatus()) == null) {
                status = ConsentStatus.PENDING;
            }
            startIntent = companion.getStartIntent(this, id2, type, status);
        }
        this.startForResult.launch(startIntent);
    }
}
