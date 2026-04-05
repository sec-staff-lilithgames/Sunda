package com.sfbx.appconsentv3.ui.ui.consentable.stack;

import af.g;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.i3;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsent.core.model.Stack;
import com.sfbx.appconsentv3.ui.AppConsentActivity;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ActivityStackBinding;
import com.sfbx.appconsentv3.ui.listener.ConsentableListener;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailActivity;
import com.sfbx.appconsentv3.ui.ui.consentable.detail.a;
import com.sfbx.appconsentv3.ui.ui.consentable.stack.StackHeaderAdapter;
import com.sfbx.appconsentv3.ui.ui.notice.ConsentableAdapter;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import i.d;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kv.l;
import tu.o;
import tu.x0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class StackActivity extends AppConsentActivity implements ConsentableListener, StackHeaderAdapter.StackHeaderListener {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_ID = "extra_id";
    private AppconsentV3ActivityStackBinding binding;
    private ConsentableAdapter mConsentableAdapter;
    private Stack mStack;
    private StackHeaderAdapter mStackHeaderAdapter;
    private final o mViewModel$delegate;
    private final d startForResult;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final Intent getStartIntent(Context context, int i10) {
            e0.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) StackActivity.class);
            intent.putExtra(StackActivity.EXTRA_ID, i10);
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
    /* renamed from: com.sfbx.appconsentv3.ui.ui.consentable.stack.StackActivity$consentableStatusChanged$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Response<Boolean>) obj);
            return x0.f87415a;
        }

        public final void invoke(Response<Boolean> response) {
            if (response instanceof Response.Success) {
                StackActivity stackActivity = StackActivity.this;
                StackViewModel mViewModel = stackActivity.getMViewModel();
                Stack stack = StackActivity.this.mStack;
                Stack stack2 = null;
                if (stack == null) {
                    e0.throwUninitializedPropertyAccessException("mStack");
                    stack = null;
                }
                stackActivity.mStack = mViewModel.getStack(stack.getId());
                StackHeaderAdapter stackHeaderAdapter = StackActivity.this.mStackHeaderAdapter;
                if (stackHeaderAdapter == null) {
                    e0.throwUninitializedPropertyAccessException("mStackHeaderAdapter");
                    stackHeaderAdapter = null;
                }
                Stack stack3 = StackActivity.this.mStack;
                if (stack3 == null) {
                    e0.throwUninitializedPropertyAccessException("mStack");
                } else {
                    stack2 = stack3;
                }
                stackHeaderAdapter.setStack(stack2);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.ui.consentable.stack.StackActivity$onSwitchChanged$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37061 extends f0 implements l {
        public C37061() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Response<Boolean>) obj);
            return x0.f87415a;
        }

        public final void invoke(Response<Boolean> response) {
            if (response instanceof Response.Success) {
                StackActivity stackActivity = StackActivity.this;
                StackViewModel mViewModel = stackActivity.getMViewModel();
                Stack stack = StackActivity.this.mStack;
                Stack stack2 = null;
                if (stack == null) {
                    e0.throwUninitializedPropertyAccessException("mStack");
                    stack = null;
                }
                stackActivity.mStack = mViewModel.getStack(stack.getId());
                ConsentableAdapter consentableAdapter = StackActivity.this.mConsentableAdapter;
                if (consentableAdapter == null) {
                    e0.throwUninitializedPropertyAccessException("mConsentableAdapter");
                    consentableAdapter = null;
                }
                Stack stack3 = StackActivity.this.mStack;
                if (stack3 == null) {
                    e0.throwUninitializedPropertyAccessException("mStack");
                    stack3 = null;
                }
                consentableAdapter.submitList(y0.sortedWith(stack3.getConsentables(), new Comparator() { // from class: com.sfbx.appconsentv3.ui.ui.consentable.stack.StackActivity$onSwitchChanged$1$invoke$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        Consentable consentable = (Consentable) t10;
                        String str = consentable.getName().get(Locale.getDefault().getLanguage());
                        if (str == null) {
                            str = (String) y0.firstOrNull(consentable.getName().values());
                        }
                        Consentable consentable2 = (Consentable) t11;
                        String str2 = consentable2.getName().get(Locale.getDefault().getLanguage());
                        if (str2 == null) {
                            str2 = (String) y0.firstOrNull(consentable2.getName().values());
                        }
                        return xu.d.compareValues(str, str2);
                    }
                }));
                StackHeaderAdapter stackHeaderAdapter = StackActivity.this.mStackHeaderAdapter;
                if (stackHeaderAdapter == null) {
                    e0.throwUninitializedPropertyAccessException("mStackHeaderAdapter");
                    stackHeaderAdapter = null;
                }
                Stack stack4 = StackActivity.this.mStack;
                if (stack4 == null) {
                    e0.throwUninitializedPropertyAccessException("mStack");
                } else {
                    stack2 = stack4;
                }
                stackHeaderAdapter.setStack(stack2);
            }
        }
    }

    public StackActivity() {
        super(false, 1, null);
        this.mViewModel$delegate = new i3(c1.getOrCreateKotlinClass(StackViewModel.class), new StackActivity$special$$inlined$viewModels$2(this), new StackActivity$mViewModel$2(this));
        d dVarRegisterForActivityResult = registerForActivityResult(new j.d(), new g(this, 13));
        e0.checkNotNullExpressionValue(dVarRegisterForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.startForResult = dVarRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void consentableStatusChanged$lambda$10(l tmp0, Object obj) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StackViewModel getMViewModel() {
        return (StackViewModel) this.mViewModel$delegate.getValue();
    }

    public static final Intent getStartIntent(Context context, int i10) {
        return Companion.getStartIntent(context, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSwitchChanged$lambda$12(l tmp0, Object obj) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void sendClickStackMoreInformationsEvent(int i10) {
        Object next;
        Object next2;
        Stack stack = this.mStack;
        Stack stack2 = null;
        if (stack == null) {
            e0.throwUninitializedPropertyAccessException("mStack");
            stack = null;
        }
        Iterator<T> it = stack.getConsentables().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Consentable consentable = (Consentable) next;
            if (consentable.getId() == i10 && (ConsentableType.FEATURE == consentable.getType() || ConsentableType.SPECIAL_FEATURE == consentable.getType())) {
                break;
            }
        }
        if (next != null) {
            StackViewModel mViewModel = getMViewModel();
            Stack stack3 = this.mStack;
            if (stack3 == null) {
                e0.throwUninitializedPropertyAccessException("mStack");
            } else {
                stack2 = stack3;
            }
            mViewModel.sendFeatureIntoStackTrackEvent(stack2.getId(), i10);
            return;
        }
        Stack stack4 = this.mStack;
        if (stack4 == null) {
            e0.throwUninitializedPropertyAccessException("mStack");
            stack4 = null;
        }
        Iterator<T> it2 = stack4.getConsentables().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            Consentable consentable2 = (Consentable) next2;
            if (consentable2.getId() == i10 && (ConsentableType.PURPOSE == consentable2.getType() || ConsentableType.SPECIAL_PURPOSE == consentable2.getType())) {
                break;
            }
        }
        if (next2 != null) {
            StackViewModel mViewModel2 = getMViewModel();
            Stack stack5 = this.mStack;
            if (stack5 == null) {
                e0.throwUninitializedPropertyAccessException("mStack");
            } else {
                stack2 = stack5;
            }
            mViewModel2.sendPurposeIntoStackTrackEvent(stack2.getId(), i10);
        }
    }

    private final void sendSwitchStackEvent(int i10, boolean z10) {
        Object next;
        Object next2;
        Stack stack = this.mStack;
        Stack stack2 = null;
        if (stack == null) {
            e0.throwUninitializedPropertyAccessException("mStack");
            stack = null;
        }
        Iterator<T> it = stack.getConsentables().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Consentable consentable = (Consentable) next;
            if (consentable.getId() == i10 && (ConsentableType.FEATURE == consentable.getType() || ConsentableType.SPECIAL_FEATURE == consentable.getType())) {
                break;
            }
        }
        if (next != null) {
            StackViewModel mViewModel = getMViewModel();
            Stack stack3 = this.mStack;
            if (stack3 == null) {
                e0.throwUninitializedPropertyAccessException("mStack");
            } else {
                stack2 = stack3;
            }
            mViewModel.sendSwitchStackFeatureTrackEvent(stack2.getId(), i10, z10);
            return;
        }
        Stack stack4 = this.mStack;
        if (stack4 == null) {
            e0.throwUninitializedPropertyAccessException("mStack");
            stack4 = null;
        }
        Iterator<T> it2 = stack4.getConsentables().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            Consentable consentable2 = (Consentable) next2;
            if (consentable2.getId() == i10 && (ConsentableType.PURPOSE == consentable2.getType() || ConsentableType.SPECIAL_PURPOSE == consentable2.getType())) {
                break;
            }
        }
        if (next2 != null) {
            StackViewModel mViewModel2 = getMViewModel();
            Stack stack5 = this.mStack;
            if (stack5 == null) {
                e0.throwUninitializedPropertyAccessException("mStack");
            } else {
                stack2 = stack5;
            }
            mViewModel2.sendSwitchStackPurposeTrackEvent(stack2.getId(), i10, z10);
        }
    }

    private final void sendTrackEvent(int i10, ConsentableType consentableType) {
        sendClickStackMoreInformationsEvent(i10);
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

    private final void setStatusToResult() {
        setResult(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startForResult$lambda$1(StackActivity this$0, ActivityResult activityResult) {
        e0.checkNotNullParameter(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            StackViewModel mViewModel = this$0.getMViewModel();
            Stack stack = this$0.mStack;
            Stack stack2 = null;
            if (stack == null) {
                e0.throwUninitializedPropertyAccessException("mStack");
                stack = null;
            }
            this$0.mStack = mViewModel.getStack(stack.getId());
            StackHeaderAdapter stackHeaderAdapter = this$0.mStackHeaderAdapter;
            if (stackHeaderAdapter == null) {
                e0.throwUninitializedPropertyAccessException("mStackHeaderAdapter");
                stackHeaderAdapter = null;
            }
            Stack stack3 = this$0.mStack;
            if (stack3 == null) {
                e0.throwUninitializedPropertyAccessException("mStack");
                stack3 = null;
            }
            stackHeaderAdapter.setStack(stack3);
            ConsentableAdapter consentableAdapter = this$0.mConsentableAdapter;
            if (consentableAdapter == null) {
                e0.throwUninitializedPropertyAccessException("mConsentableAdapter");
                consentableAdapter = null;
            }
            Stack stack4 = this$0.mStack;
            if (stack4 == null) {
                e0.throwUninitializedPropertyAccessException("mStack");
            } else {
                stack2 = stack4;
            }
            consentableAdapter.submitList(y0.sortedWith(stack2.getConsentables(), new Comparator() { // from class: com.sfbx.appconsentv3.ui.ui.consentable.stack.StackActivity$startForResult$lambda$1$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    Consentable consentable = (Consentable) t10;
                    String str = consentable.getName().get(Locale.getDefault().getLanguage());
                    if (str == null) {
                        str = (String) y0.firstOrNull(consentable.getName().values());
                    }
                    Consentable consentable2 = (Consentable) t11;
                    String str2 = consentable2.getName().get(Locale.getDefault().getLanguage());
                    if (str2 == null) {
                        str2 = (String) y0.firstOrNull(consentable2.getName().values());
                    }
                    return xu.d.compareValues(str, str2);
                }
            }));
        }
    }

    @Override // com.sfbx.appconsentv3.ui.listener.ConsentableListener
    public void consentableStatusChanged(int i10, ConsentableType type, ConsentStatus newStatus) {
        e0.checkNotNullParameter(type, "type");
        e0.checkNotNullParameter(newStatus, "newStatus");
        if (type == ConsentableType.PURPOSE) {
            StackViewModel mViewModel = getMViewModel();
            Stack stack = this.mStack;
            if (stack == null) {
                e0.throwUninitializedPropertyAccessException("mStack");
                stack = null;
            }
            mViewModel.sendSwitchPurposeIsOnOffTrackEvent(stack.getId(), newStatus == ConsentStatus.ALLOWED);
        }
        sendSwitchStackEvent(i10, newStatus == ConsentStatus.ALLOWED);
        getMViewModel().setConsent(i10, newStatus).observe(this, new a(2, new AnonymousClass1()));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        StackViewModel mViewModel = getMViewModel();
        Stack stack = this.mStack;
        if (stack == null) {
            e0.throwUninitializedPropertyAccessException("mStack");
            stack = null;
        }
        mViewModel.sendStackGoBackTrackEvent(stack.getId());
        setStatusToResult();
        super.onBackPressed();
    }

    @Override // com.sfbx.appconsentv3.ui.AppConsentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppconsentV3ActivityStackBinding appconsentV3ActivityStackBindingInflate = AppconsentV3ActivityStackBinding.inflate(getLayoutInflater());
        e0.checkNotNullExpressionValue(appconsentV3ActivityStackBindingInflate, "inflate(layoutInflater)");
        this.binding = appconsentV3ActivityStackBindingInflate;
        AppconsentV3ActivityStackBinding appconsentV3ActivityStackBinding = null;
        if (appconsentV3ActivityStackBindingInflate == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityStackBindingInflate = null;
        }
        RecyclerView root = appconsentV3ActivityStackBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "binding.root");
        setCustomContentViewFromLayer2(root);
        AppconsentV3ActivityStackBinding appconsentV3ActivityStackBinding2 = this.binding;
        if (appconsentV3ActivityStackBinding2 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityStackBinding2 = null;
        }
        appconsentV3ActivityStackBinding2.getRoot().setBackgroundColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            throw new IllegalArgumentException();
        }
        this.mStack = getMViewModel().getStack(extras.getInt(EXTRA_ID));
        final String language = Locale.getDefault().getLanguage();
        int actionBarColor$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getActionBarColor$appconsent_ui_v3_prodXchangeRelease();
        int actionBarTextColor$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getActionBarTextColor$appconsent_ui_v3_prodXchangeRelease();
        int buttonBackgroundColor$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease();
        Stack stack = this.mStack;
        if (stack == null) {
            e0.throwUninitializedPropertyAccessException("mStack");
            stack = null;
        }
        String str = stack.getName().get(language);
        if (str == null) {
            Stack stack2 = this.mStack;
            if (stack2 == null) {
                e0.throwUninitializedPropertyAccessException("mStack");
                stack2 = null;
            }
            str = (String) y0.firstOrNull(stack2.getName().values());
            if (str == null) {
                str = "";
            }
        }
        ExtensionKt.setupCustomTitle(this, actionBarColor$appconsent_ui_v3_prodXchangeRelease, actionBarTextColor$appconsent_ui_v3_prodXchangeRelease, buttonBackgroundColor$appconsent_ui_v3_prodXchangeRelease, str);
        StackHeaderAdapter stackHeaderAdapter = new StackHeaderAdapter(this);
        Stack stack3 = this.mStack;
        if (stack3 == null) {
            e0.throwUninitializedPropertyAccessException("mStack");
            stack3 = null;
        }
        stackHeaderAdapter.setStack(stack3);
        this.mStackHeaderAdapter = stackHeaderAdapter;
        ConsentableAdapter consentableAdapter = new ConsentableAdapter(this);
        Stack stack4 = this.mStack;
        if (stack4 == null) {
            e0.throwUninitializedPropertyAccessException("mStack");
            stack4 = null;
        }
        consentableAdapter.submitList(y0.sortedWith(stack4.getConsentables(), new Comparator() { // from class: com.sfbx.appconsentv3.ui.ui.consentable.stack.StackActivity$onCreate$lambda$4$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                Consentable consentable = (Consentable) t10;
                String str2 = consentable.getName().get(language);
                if (str2 == null) {
                    str2 = (String) y0.firstOrNull(consentable.getName().values());
                }
                Consentable consentable2 = (Consentable) t11;
                String str3 = consentable2.getName().get(language);
                if (str3 == null) {
                    str3 = (String) y0.firstOrNull(consentable2.getName().values());
                }
                return xu.d.compareValues(str2, str3);
            }
        }));
        this.mConsentableAdapter = consentableAdapter;
        StackHeaderAdapter stackHeaderAdapter2 = this.mStackHeaderAdapter;
        if (stackHeaderAdapter2 == null) {
            e0.throwUninitializedPropertyAccessException("mStackHeaderAdapter");
            stackHeaderAdapter2 = null;
        }
        ConsentableAdapter consentableAdapter2 = this.mConsentableAdapter;
        if (consentableAdapter2 == null) {
            e0.throwUninitializedPropertyAccessException("mConsentableAdapter");
            consentableAdapter2 = null;
        }
        r rVar = new r(stackHeaderAdapter2, consentableAdapter2);
        AppconsentV3ActivityStackBinding appconsentV3ActivityStackBinding3 = this.binding;
        if (appconsentV3ActivityStackBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            appconsentV3ActivityStackBinding = appconsentV3ActivityStackBinding3;
        }
        RecyclerView recyclerView = appconsentV3ActivityStackBinding.recyclerStack;
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

    @Override // com.sfbx.appconsentv3.ui.ui.consentable.stack.StackHeaderAdapter.StackHeaderListener
    public void onSwitchChanged(ConsentStatus newStatus) {
        e0.checkNotNullParameter(newStatus, "newStatus");
        StackViewModel mViewModel = getMViewModel();
        Stack stack = this.mStack;
        Stack stack2 = null;
        if (stack == null) {
            e0.throwUninitializedPropertyAccessException("mStack");
            stack = null;
        }
        mViewModel.sendSwitchPurposeIsOnOffTrackEvent(stack.getId(), newStatus == ConsentStatus.ALLOWED);
        StackViewModel mViewModel2 = getMViewModel();
        Stack stack3 = this.mStack;
        if (stack3 == null) {
            e0.throwUninitializedPropertyAccessException("mStack");
        } else {
            stack2 = stack3;
        }
        mViewModel2.setStackConsent(stack2.getId(), newStatus).observe(this, new a(3, new C37061()));
    }

    @Override // com.sfbx.appconsentv3.ui.listener.ConsentableListener
    public void seeMore(Consentable consentable) {
        ConsentStatus status;
        e0.checkNotNullParameter(consentable, "consentable");
        sendTrackEvent(consentable.getId(), consentable.getType());
        ConsentableDetailActivity.Companion companion = ConsentableDetailActivity.Companion;
        int id2 = consentable.getId();
        ConsentableType type = consentable.getType();
        Stack stack = this.mStack;
        Object obj = null;
        if (stack == null) {
            e0.throwUninitializedPropertyAccessException("mStack");
            stack = null;
        }
        Iterator<T> it = stack.getConsentables().iterator();
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
        this.startForResult.launch(companion.getStartIntent(this, id2, type, status));
    }
}
