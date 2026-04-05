package com.sfbx.appconsentv3.ui.ui.consentable.mandatory;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.lifecycle.i3;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsentv3.ui.AppConsentActivity;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ActivityMandatoryBinding;
import com.sfbx.appconsentv3.ui.listener.ConsentableListener;
import com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailActivity;
import com.sfbx.appconsentv3.ui.ui.consentable.mandatory.MandatoryAdapter;
import com.sfbx.appconsentv3.ui.ui.consentable.mandatory.MandatoryAdapter.DescriptionHeaderAdapter;
import com.sfbx.appconsentv3.ui.ui.notice.ConsentableAdapter;
import com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MandatoryActivity extends AppConsentActivity implements ConsentableListener {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_TYPE = "extra_type";
    private AppconsentV3ActivityMandatoryBinding binding;
    private List<Consentable> mConsentables;
    private final o mViewModel$delegate;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final Intent getStartIntent(Context context, ConsentableType consentableType) {
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(consentableType, "consentableType");
            Intent intent = new Intent(context, (Class<?>) MandatoryActivity.class);
            intent.putExtra(MandatoryActivity.EXTRA_TYPE, consentableType);
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
                iArr[ConsentableType.SPECIAL_PURPOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConsentableType.FEATURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConsentableType.PURPOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MandatoryActivity() {
        super(false, 1, null);
        this.mViewModel$delegate = new i3(c1.getOrCreateKotlinClass(VendorViewModel.class), new MandatoryActivity$special$$inlined$viewModels$2(this), new MandatoryActivity$mViewModel$2(this));
    }

    private final VendorViewModel getMViewModel() {
        return (VendorViewModel) this.mViewModel$delegate.getValue();
    }

    public static final Intent getStartIntent(Context context, ConsentableType consentableType) {
        return Companion.getStartIntent(context, consentableType);
    }

    private final void loadUI(ConsentableType consentableType) {
        MandatoryAdapter.DescriptionHeaderAdapter descriptionHeaderAdapter = new MandatoryAdapter(consentableType).new DescriptionHeaderAdapter();
        ConsentableAdapter consentableAdapter = new ConsentableAdapter(this);
        List<Consentable> list = this.mConsentables;
        AppconsentV3ActivityMandatoryBinding appconsentV3ActivityMandatoryBinding = null;
        if (list == null) {
            e0.throwUninitializedPropertyAccessException("mConsentables");
            list = null;
        }
        consentableAdapter.submitList(list);
        r rVar = new r(descriptionHeaderAdapter, consentableAdapter);
        AppconsentV3ActivityMandatoryBinding appconsentV3ActivityMandatoryBinding2 = this.binding;
        if (appconsentV3ActivityMandatoryBinding2 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            appconsentV3ActivityMandatoryBinding = appconsentV3ActivityMandatoryBinding2;
        }
        RecyclerView recyclerView = appconsentV3ActivityMandatoryBinding.recyclerMandatoryConsentables;
        recyclerView.setBackgroundColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(rVar);
    }

    private final void sendTrackEvent(int i10, ConsentableType consentableType) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[consentableType.ordinal()];
        if (i11 == 1) {
            getMViewModel().sendClickDetailSpecialPurposeTrackEvent(i10);
        } else {
            if (i11 != 3) {
                return;
            }
            getMViewModel().sendClickDetailPurposeTrackEvent(i10);
        }
    }

    @Override // com.sfbx.appconsentv3.ui.listener.ConsentableListener
    public void consentableStatusChanged(int i10, ConsentableType type, ConsentStatus newStatus) {
        e0.checkNotNullParameter(type, "type");
        e0.checkNotNullParameter(newStatus, "newStatus");
    }

    @Override // com.sfbx.appconsentv3.ui.AppConsentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppconsentV3ActivityMandatoryBinding appconsentV3ActivityMandatoryBindingInflate = AppconsentV3ActivityMandatoryBinding.inflate(getLayoutInflater());
        e0.checkNotNullExpressionValue(appconsentV3ActivityMandatoryBindingInflate, "inflate(layoutInflater)");
        this.binding = appconsentV3ActivityMandatoryBindingInflate;
        if (appconsentV3ActivityMandatoryBindingInflate == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityMandatoryBindingInflate = null;
        }
        RecyclerView root = appconsentV3ActivityMandatoryBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "binding.root");
        setCustomContentViewFromLayer2(root);
        Bundle extras = getIntent().getExtras();
        Serializable serializable = extras != null ? extras.getSerializable(EXTRA_TYPE) : null;
        e0.checkNotNull(serializable, "null cannot be cast to non-null type com.sfbx.appconsent.core.model.ConsentableType");
        ConsentableType consentableType = (ConsentableType) serializable;
        int actionBarColor$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getActionBarColor$appconsent_ui_v3_prodXchangeRelease();
        int actionBarTextColor$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getActionBarTextColor$appconsent_ui_v3_prodXchangeRelease();
        int buttonBackgroundColor$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease();
        int i10 = WhenMappings.$EnumSwitchMapping$0[consentableType.ordinal()];
        ExtensionKt.setupCustomTitle(this, actionBarColor$appconsent_ui_v3_prodXchangeRelease, actionBarTextColor$appconsent_ui_v3_prodXchangeRelease, buttonBackgroundColor$appconsent_ui_v3_prodXchangeRelease, i10 != 1 ? i10 != 2 ? "" : getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getNoticeMandatoryFeatureTitle$appconsent_ui_v3_prodXchangeRelease() : getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getNoticeMandatoryPurposeTitle$appconsent_ui_v3_prodXchangeRelease());
        List<Consentable> consentables = getMViewModel().getConsentables();
        ArrayList arrayList = new ArrayList();
        for (Object obj : consentables) {
            if (((Consentable) obj).getType() == consentableType) {
                arrayList.add(obj);
            }
        }
        this.mConsentables = arrayList;
        loadUI(consentableType);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        e0.checkNotNullParameter(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        finish();
        return true;
    }

    @Override // com.sfbx.appconsentv3.ui.listener.ConsentableListener
    public void seeMore(Consentable consentable) {
        ConsentStatus status;
        e0.checkNotNullParameter(consentable, "consentable");
        sendTrackEvent(consentable.getId(), consentable.getType());
        ConsentableDetailActivity.Companion companion = ConsentableDetailActivity.Companion;
        int id2 = consentable.getId();
        ConsentableType type = consentable.getType();
        List<Consentable> list = this.mConsentables;
        Object obj = null;
        if (list == null) {
            e0.throwUninitializedPropertyAccessException("mConsentables");
            list = null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Consentable consentable2 = (Consentable) next;
            if (consentable2.getId() == consentable.getId() && consentable2.getType() == consentable.getType()) {
                obj = next;
                break;
            }
        }
        Consentable consentable3 = (Consentable) obj;
        if (consentable3 == null || (status = consentable3.getStatus()) == null) {
            status = ConsentStatus.PENDING;
        }
        startActivity(companion.getStartIntent(this, id2, type, status));
    }
}
