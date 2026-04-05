package com.sfbx.appconsentv3.ui.ui.geolocation;

import af.g;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
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
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ActivityGeolocationBinding;
import com.sfbx.appconsentv3.ui.listener.ConsentableListener;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationAdapter.GeolocationFooterAdapter;
import com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationAdapter.GeolocationHeaderAdapter;
import com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationDetailActivity;
import com.sfbx.appconsentv3.ui.ui.notice.ConsentableAdapter;
import com.sfbx.appconsentv3.ui.view.GeolocationBannerView;
import i.d;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import io.sfbx.appconsent.logger.ACLogger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kv.l;
import tu.o;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GeolocationActivity extends AppConsentActivity implements ConsentableListener {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_ID = "extra_id";
    private static final String EXTRA_STATUS = "extra_status";
    private static final String EXTRA_TRIGGER_BY_USER = "extra_trigger_by_user";
    private static final String FULL_SCREEN_MODE = "FULL_SCREEN_MODE";
    private AppconsentV3ActivityGeolocationBinding binding;
    private final ConsentableAdapter mConsentableAdapter;
    private final u1 mConsentableObserver;
    private final List<Consentable> mGeolocationConsentables;
    private final o mViewModel$delegate;
    private final d startForResult;
    private boolean triggeredByUser;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final Intent getResultIntent(int i10, ConsentStatus status) {
            e0.checkNotNullParameter(status, "status");
            Intent intent = new Intent();
            intent.putExtra(GeolocationActivity.EXTRA_ID, i10);
            intent.putExtra(GeolocationActivity.EXTRA_STATUS, status);
            return intent;
        }

        public final Intent getStartIntent(Context context, boolean z10, boolean z11) {
            e0.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) GeolocationActivity.class);
            intent.putExtra(GeolocationActivity.EXTRA_TRIGGER_BY_USER, z10);
            intent.putExtra("FULL_SCREEN_MODE", z11);
            intent.setFlags(268435456);
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
                iArr[ConsentableType.PURPOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConsentableType.SPECIAL_PURPOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationActivity$onCreate$3, reason: invalid class name */
    public static final class AnonymousClass3 extends f0 implements l {
        public AnonymousClass3() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Response<Boolean>) obj);
            return x0.f87415a;
        }

        public final void invoke(Response<Boolean> response) {
            GeolocationActivity.this.saveConsentsObserver(response);
        }
    }

    public GeolocationActivity() {
        super(true);
        this.mViewModel$delegate = new i3(c1.getOrCreateKotlinClass(GeolocationViewModel.class), new GeolocationActivity$special$$inlined$viewModels$2(this), new GeolocationActivity$mViewModel$2(this));
        this.mConsentableAdapter = new ConsentableAdapter(this);
        this.mGeolocationConsentables = new ArrayList();
        this.mConsentableObserver = new a(this, 0);
        d dVarRegisterForActivityResult = registerForActivityResult(new j.d(), new g(this, 14));
        e0.checkNotNullExpressionValue(dVarRegisterForActivityResult, "registerForActivityResul…}\n            }\n        }");
        this.startForResult = dVarRegisterForActivityResult;
    }

    private final boolean checkThemeIsDialog() throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getTheme$appconsent_ui_v3_prodXchangeRelease(), new int[]{R.attr.windowCloseOnTouchOutside});
        e0.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(a…onsentTheme.theme, attrs)");
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GeolocationViewModel getMViewModel() {
        return (GeolocationViewModel) this.mViewModel$delegate.getValue();
    }

    public static final Intent getResultIntent(int i10, ConsentStatus consentStatus) {
        return Companion.getResultIntent(i10, consentStatus);
    }

    private final boolean isAllSelected() {
        List<Consentable> list = this.mGeolocationConsentables;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Consentable) it.next()).getStatus() == ConsentStatus.PENDING) {
                return false;
            }
        }
        return true;
    }

    private final void loading(boolean z10) {
        displaySpinner(z10);
        AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBinding = this.binding;
        AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBinding2 = null;
        if (appconsentV3ActivityGeolocationBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityGeolocationBinding = null;
        }
        appconsentV3ActivityGeolocationBinding.recyclerGeolocation.setVisibility(z10 ? 4 : 0);
        AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBinding3 = this.binding;
        if (appconsentV3ActivityGeolocationBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            appconsentV3ActivityGeolocationBinding2 = appconsentV3ActivityGeolocationBinding3;
        }
        appconsentV3ActivityGeolocationBinding2.geolocationBanner.setVisibility(z10 ? 4 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mConsentableObserver$lambda$0(GeolocationActivity this$0, Response response) {
        e0.checkNotNullParameter(this$0, "this$0");
        if (!(response instanceof Response.Success)) {
            if (response instanceof Response.Error) {
                this$0.loading(false);
                this$0.finish();
                return;
            } else {
                if (response instanceof Response.Loading) {
                    this$0.loading(true);
                    return;
                }
                return;
            }
        }
        this$0.loading(false);
        Response.Success success = (Response.Success) response;
        if (((List) success.getData()).isEmpty()) {
            this$0.finish();
            return;
        }
        this$0.mGeolocationConsentables.addAll((Collection) success.getData());
        this$0.mConsentableAdapter.submitList(this$0.mGeolocationConsentables);
        if (this$0.isAllSelected()) {
            AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBinding = this$0.binding;
            if (appconsentV3ActivityGeolocationBinding == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityGeolocationBinding = null;
            }
            appconsentV3ActivityGeolocationBinding.geolocationBanner.updateBannerUI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$5(l tmp0, Object obj) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveConsentsObserver(Response<Boolean> response) {
        if (response instanceof Response.Success) {
            loading(false);
            finish();
        } else if (!(response instanceof Response.Error)) {
            if (response instanceof Response.Loading) {
                loading(true);
            }
        } else {
            loading(false);
            ACLogger aCLogger = ACLogger.INSTANCE;
            e0.checkNotNullExpressionValue("GeolocationActivity", "this::class.java.simpleName");
            aCLogger.e("GeolocationActivity", ((Response.Error) response).getError());
        }
    }

    private final void sendTrackEvent(int i10, ConsentableType consentableType) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[consentableType.ordinal()];
        if (i11 == 1) {
            getMViewModel().sendClickDetailPurposeTrackEvent(i10);
        } else {
            if (i11 != 2) {
                return;
            }
            getMViewModel().sendClickDetailSpecialPurposeTrackEvent(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startForResult$lambda$3(GeolocationActivity this$0, ActivityResult activityResult) {
        e0.checkNotNullParameter(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            Object obj = null;
            Integer numValueOf = data != null ? Integer.valueOf(data.getIntExtra(EXTRA_ID, 0)) : null;
            Intent data2 = activityResult.getData();
            Serializable serializableExtra = data2 != null ? data2.getSerializableExtra(EXTRA_STATUS) : null;
            e0.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.sfbx.appconsent.core.model.ConsentStatus");
            ConsentStatus consentStatus = (ConsentStatus) serializableExtra;
            List<Object> currentList = this$0.mConsentableAdapter.getCurrentList();
            e0.checkNotNullExpressionValue(currentList, "mConsentableAdapter.currentList");
            Iterator<T> it = currentList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                int id2 = ((Consentable) next).getId();
                if (numValueOf != null && id2 == numValueOf.intValue()) {
                    obj = next;
                    break;
                }
            }
            Consentable consentable = (Consentable) obj;
            if (consentable != null) {
                consentable.setStatus(consentStatus);
                ConsentableAdapter consentableAdapter = this$0.mConsentableAdapter;
                consentableAdapter.notifyItemChanged(consentableAdapter.getCurrentList().indexOf(consentable));
            }
        }
    }

    @Override // com.sfbx.appconsentv3.ui.listener.ConsentableListener
    public void consentableStatusChanged(int i10, ConsentableType type, ConsentStatus newStatus) {
        AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBinding;
        Object next;
        e0.checkNotNullParameter(type, "type");
        e0.checkNotNullParameter(newStatus, "newStatus");
        if (type == ConsentableType.PURPOSE) {
            getMViewModel().sendSwitchPurposeIsOnOffTrackEvent(i10, newStatus == ConsentStatus.ALLOWED);
        } else if (type == ConsentableType.STACK) {
            getMViewModel().sendSwitchStackIsOnOffTrackEvent(i10, newStatus == ConsentStatus.ALLOWED);
        }
        Iterator<T> it = this.mGeolocationConsentables.iterator();
        while (true) {
            appconsentV3ActivityGeolocationBinding = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Consentable consentable = (Consentable) next;
            if (consentable.getId() == i10 && consentable.getType() == type) {
                break;
            }
        }
        Consentable consentable2 = (Consentable) next;
        if (consentable2 != null) {
            consentable2.setStatus(newStatus);
        }
        if (isAllSelected()) {
            AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBinding2 = this.binding;
            if (appconsentV3ActivityGeolocationBinding2 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                appconsentV3ActivityGeolocationBinding = appconsentV3ActivityGeolocationBinding2;
            }
            appconsentV3ActivityGeolocationBinding.geolocationBanner.updateBannerUI();
        }
        getMViewModel().setConsentableStatus(i10, newStatus);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.triggeredByUser) {
            super.onBackPressed();
        }
    }

    @Override // com.sfbx.appconsentv3.ui.listener.ConsentableListener
    public void seeMore(Consentable consentable) {
        Object next;
        ConsentStatus status;
        e0.checkNotNullParameter(consentable, "consentable");
        sendTrackEvent(consentable.getId(), consentable.getType());
        d dVar = this.startForResult;
        GeolocationDetailActivity.Companion companion = GeolocationDetailActivity.Companion;
        int id2 = consentable.getId();
        ConsentableType type = consentable.getType();
        Iterator<T> it = this.mGeolocationConsentables.iterator();
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
        dVar.launch(companion.getStartIntent(this, id2, type, status));
    }

    @Override // com.sfbx.appconsentv3.ui.AppConsentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z10;
        Bundle extras;
        int theme$appconsent_ui_v3_prodXchangeRelease;
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("FULL_SCREEN_MODE", false)) {
            if (getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getTheme$appconsent_ui_v3_prodXchangeRelease() != 0 && !checkThemeIsDialog()) {
                theme$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getTheme$appconsent_ui_v3_prodXchangeRelease();
            } else {
                theme$appconsent_ui_v3_prodXchangeRelease = com.sfbx.appconsentv3.ui.R.style.AppConsentV3Theme;
            }
            setTheme(theme$appconsent_ui_v3_prodXchangeRelease);
        }
        AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBindingInflate = AppconsentV3ActivityGeolocationBinding.inflate(getLayoutInflater());
        e0.checkNotNullExpressionValue(appconsentV3ActivityGeolocationBindingInflate, "inflate(layoutInflater)");
        this.binding = appconsentV3ActivityGeolocationBindingInflate;
        AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBinding = null;
        if (appconsentV3ActivityGeolocationBindingInflate == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityGeolocationBindingInflate = null;
        }
        ConstraintLayout root = appconsentV3ActivityGeolocationBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "binding.root");
        setCustomContentViewFromLayer2(root);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
        AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBinding2 = this.binding;
        if (appconsentV3ActivityGeolocationBinding2 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityGeolocationBinding2 = null;
        }
        appconsentV3ActivityGeolocationBinding2.intLayout.setBackgroundColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            z10 = extras.getBoolean(QGjYBESwAiCc.FVblZMoj);
        } else {
            z10 = false;
        }
        this.triggeredByUser = z10;
        GeolocationAdapter geolocationAdapter = new GeolocationAdapter();
        AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBinding3 = this.binding;
        if (appconsentV3ActivityGeolocationBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityGeolocationBinding3 = null;
        }
        RecyclerView recyclerView = appconsentV3ActivityGeolocationBinding3.recyclerGeolocation;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new r(geolocationAdapter.new GeolocationHeaderAdapter(), this.mConsentableAdapter, geolocationAdapter.new GeolocationFooterAdapter()));
        AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBinding4 = this.binding;
        if (appconsentV3ActivityGeolocationBinding4 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            appconsentV3ActivityGeolocationBinding = appconsentV3ActivityGeolocationBinding4;
        }
        appconsentV3ActivityGeolocationBinding.geolocationBanner.setOnClickButtonListener(new GeolocationBannerView.OnClickGeolocButtonListener() { // from class: com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationActivity.onCreate.2
            @Override // com.sfbx.appconsentv3.ui.view.GeolocationBannerView.OnClickGeolocButtonListener
            public void onClickSave() {
                GeolocationActivity.this.getMViewModel().save();
            }
        });
        getMViewModel().getConsentables().observe(this, this.mConsentableObserver);
        getMViewModel().getSave().observe(this, new com.sfbx.appconsentv3.ui.ui.consentable.detail.a(4, new AnonymousClass3()));
        getMViewModel().fetchConsentables();
    }
}
