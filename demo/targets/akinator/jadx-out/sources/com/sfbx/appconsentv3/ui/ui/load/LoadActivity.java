package com.sfbx.appconsentv3.ui.ui.load;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.lifecycle.i3;
import com.sfbx.appconsentv3.ui.AppConsentActivity;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ActivityLoadBinding;
import com.sfbx.appconsentv3.ui.domain.model.LoadDataWrapper;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.ui.consentable.detail.a;
import com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationActivity;
import com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity;
import com.sfbx.appconsentv3.ui.ui.notice.NoticeActivity;
import g5.r;
import io.sfbx.appconsent.logger.ACLogger;
import io.sfbx.appconsent.logger.ACLoggerContract;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kv.l;
import tu.o;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LoadActivity extends AppConsentActivity {
    private static final String EXTRA_PRESENT_GEOLOCATION = "extra_present_geolocation";
    private static final String EXTRA_TRIGGER_BY_USER = "extra_trigger_by_user";
    private static final String FULL_SCREEN_MODE = "full_screen_mode";
    private static final String IS_NEED_TO_DISPLAY_BUTTONS_VERTICALLY = "is_need_to_display_buttons_vertically";
    private static final String IS_NEED_TO_DISPLAY_QRCODE = "is_need_to_display_qrcode";
    private AppconsentV3ActivityLoadBinding binding;
    private boolean isNeedToDisplayButtonsAtVertical;
    private boolean isNeedToReplaceUrlViewerByQrCode;
    private final o mViewModel$delegate;
    private boolean triggerByUser;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "LoadActivity";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ Intent getStartIntent$default(Companion companion, Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            if ((i10 & 8) != 0) {
                z12 = false;
            }
            if ((i10 & 16) != 0) {
                z13 = false;
            }
            if ((i10 & 32) != 0) {
                z14 = false;
            }
            return companion.getStartIntent(context, z10, z11, z12, z13, z14);
        }

        public final Intent getStartIntent(Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
            e0.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) LoadActivity.class);
            intent.putExtra(LoadActivity.EXTRA_TRIGGER_BY_USER, z10);
            intent.putExtra(LoadActivity.EXTRA_PRESENT_GEOLOCATION, z11);
            intent.putExtra(LoadActivity.FULL_SCREEN_MODE, z12);
            intent.putExtra("is_need_to_display_buttons_vertically", z13);
            intent.putExtra("is_need_to_display_qrcode", z14);
            intent.setFlags(268435456);
            return intent;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.ui.load.LoadActivity$observeGDPR$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return x0.f87415a;
        }

        public final void invoke(Boolean bool) {
            LoadActivity.this.displaySpinner(false);
            ACLogger aCLogger = ACLogger.INSTANCE;
            String TAG = LoadActivity.TAG;
            e0.checkNotNullExpressionValue(TAG, "TAG");
            ACLoggerContract.DefaultImpls.i$default(aCLogger, TAG, "You are not eligible for CMP", null, 4, null);
            LoadActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.ui.load.LoadActivity$observeTheme$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37181 extends f0 implements l {
        public C37181() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Response<LoadDataWrapper>) obj);
            return x0.f87415a;
        }

        public final void invoke(Response<LoadDataWrapper> response) {
            if (response instanceof Response.Success) {
                AppConsentTheme.Companion.loadFromRemote$appconsent_ui_v3_prodXchangeRelease(LoadActivity.this, ((LoadDataWrapper) ((Response.Success) response).getData()).getRemoteTheme());
                LoadActivity.this.displaySpinner(false);
                LoadActivity.this.launchActivity();
                return;
            }
            if (!(response instanceof Response.Error)) {
                if (response instanceof Response.Loading) {
                    AppConsentActivity.displaySpinner$default(LoadActivity.this, false, 1, null);
                    return;
                }
                return;
            }
            LoadActivity.this.displaySpinner(false);
            SharedPreferences.Editor editorEdit = r.getDefaultSharedPreferences(LoadActivity.this.getApplicationContext()).edit();
            Response.Error error = (Response.Error) response;
            String message = error.getError().getMessage();
            if (message == null) {
                message = "";
            }
            editorEdit.putString("CRASH_RESEAU", message).apply();
            ACLogger aCLogger = ACLogger.INSTANCE;
            String TAG = LoadActivity.TAG;
            e0.checkNotNullExpressionValue(TAG, "TAG");
            aCLogger.e(TAG, error.getError());
            String TAG2 = LoadActivity.TAG;
            e0.checkNotNullExpressionValue(TAG2, "TAG");
            ACLoggerContract.DefaultImpls.i$default(aCLogger, TAG2, "The CMP has just closed. Please check the error above", null, 4, null);
            LoadActivity.this.finish();
        }
    }

    public LoadActivity() {
        super(true);
        this.mViewModel$delegate = new i3(c1.getOrCreateKotlinClass(LoadViewModel.class), new LoadActivity$special$$inlined$viewModels$2(this), new LoadActivity$mViewModel$2(this));
    }

    private final LoadViewModel getMViewModel() {
        return (LoadViewModel) this.mViewModel$delegate.getValue();
    }

    public static final Intent getStartIntent(Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return Companion.getStartIntent(context, z10, z11, z12, z13, z14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchActivity() {
        Bundle extras = getIntent().getExtras();
        boolean z10 = extras != null ? extras.getBoolean(FULL_SCREEN_MODE, false) : false;
        Bundle extras2 = getIntent().getExtras();
        Intent startIntent = extras2 != null ? extras2.getBoolean(EXTRA_PRESENT_GEOLOCATION, false) : false ? GeolocationActivity.Companion.getStartIntent(this, this.triggerByUser, z10) : this.triggerByUser ? NoticeActivity.Companion.getStartIntent(this, true) : IntroductionActivity.Companion.getStartIntent(this, z10, this.isNeedToDisplayButtonsAtVertical, this.isNeedToReplaceUrlViewerByQrCode);
        startIntent.addFlags(268435456);
        startActivity(startIntent);
        finish();
    }

    private final void observeGDPR() {
        getMViewModel().isGdpr().observe(this, new a(12, new AnonymousClass1()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeGDPR$lambda$1(l tmp0, Object obj) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void observeTheme() {
        getMViewModel().getTheme().observe(this, new a(11, new C37181()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeTheme$lambda$0(l tmp0, Object obj) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // com.sfbx.appconsentv3.ui.AppConsentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppconsentV3ActivityLoadBinding appconsentV3ActivityLoadBindingInflate = AppconsentV3ActivityLoadBinding.inflate(getLayoutInflater());
        e0.checkNotNullExpressionValue(appconsentV3ActivityLoadBindingInflate, "inflate(layoutInflater)");
        this.binding = appconsentV3ActivityLoadBindingInflate;
        if (appconsentV3ActivityLoadBindingInflate == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityLoadBindingInflate = null;
        }
        setContentView(appconsentV3ActivityLoadBindingInflate.getRoot());
        Bundle extras = getIntent().getExtras();
        this.triggerByUser = extras != null ? extras.getBoolean(EXTRA_TRIGGER_BY_USER, false) : false;
        Bundle extras2 = getIntent().getExtras();
        this.isNeedToDisplayButtonsAtVertical = extras2 != null ? extras2.getBoolean("is_need_to_display_buttons_vertically", false) : false;
        Bundle extras3 = getIntent().getExtras();
        this.isNeedToReplaceUrlViewerByQrCode = extras3 != null ? extras3.getBoolean("is_need_to_display_qrcode", false) : false;
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
        observeGDPR();
        observeTheme();
        getMViewModel().requestTheme(this.triggerByUser);
    }
}
