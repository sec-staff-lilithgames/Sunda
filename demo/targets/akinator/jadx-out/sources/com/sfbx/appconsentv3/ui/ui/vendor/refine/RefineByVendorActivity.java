package com.sfbx.appconsentv3.ui.ui.vendor.refine;

import a.b;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.i3;
import androidx.viewpager2.adapter.m;
import ao.n;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.h;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsentv3.ui.AppConsentActivity;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ActivityRefineByVendorBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemTabVendorBinding;
import com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.o;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class RefineByVendorActivity extends AppConsentActivity {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_OTHER_TAB = "key_other_tab";
    private AppconsentV3ActivityRefineByVendorBinding binding;
    private final o mViewModel$delegate;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ Intent getStartIntent$default(Companion companion, Context context, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return companion.getStartIntent(context, z10);
        }

        public final Intent getStartIntent(Context context, boolean z10) {
            e0.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) RefineByVendorActivity.class);
            intent.putExtra(RefineByVendorActivity.KEY_OTHER_TAB, z10);
            return intent;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SimpleFragmentPagerAdapter extends m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SimpleFragmentPagerAdapter(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            e0.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        }

        @Override // androidx.viewpager2.adapter.m
        public Fragment createFragment(int i10) {
            return RefineByVendorTabFragment.Companion.newInstance(i10 != 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return 2;
        }
    }

    public RefineByVendorActivity() {
        super(false, 1, null);
        this.mViewModel$delegate = new i3(c1.getOrCreateKotlinClass(VendorViewModel.class), new RefineByVendorActivity$special$$inlined$viewModels$2(this), new RefineByVendorActivity$mViewModel$2(this));
    }

    private final AppconsentV3ItemTabVendorBinding generateTabTitleBinding(int i10, boolean z10) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this);
        String vendorTabOtherText$appconsent_ui_v3_prodXchangeRelease = z10 ? getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getVendorTabOtherText$appconsent_ui_v3_prodXchangeRelease() : getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getVendorTabIabText$appconsent_ui_v3_prodXchangeRelease();
        int[][] iArr = {new int[]{R.attr.state_selected}, new int[]{-16842913}};
        int[] iArr2 = {getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getTextColor$appconsent_ui_v3_prodXchangeRelease(), com.sfbx.appconsentv3.ui.R.color.appconsent_v3_dark_grey};
        AppconsentV3ActivityRefineByVendorBinding appconsentV3ActivityRefineByVendorBinding = this.binding;
        if (appconsentV3ActivityRefineByVendorBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityRefineByVendorBinding = null;
        }
        AppconsentV3ItemTabVendorBinding appconsentV3ItemTabVendorBindingInflate = AppconsentV3ItemTabVendorBinding.inflate(layoutInflaterFrom, appconsentV3ActivityRefineByVendorBinding.tabLayout, false);
        e0.checkNotNullExpressionValue(appconsentV3ItemTabVendorBindingInflate, "inflate(inflater, binding.tabLayout, false)");
        AppCompatTextView appCompatTextView = appconsentV3ItemTabVendorBindingInflate.textTabTitle;
        StringBuilder sbS = b.s(vendorTabOtherText$appconsent_ui_v3_prodXchangeRelease, ' ');
        sbS.append(getString(com.sfbx.appconsentv3.ui.R.string.appconsent_display_by_vendor_tab_counter, Integer.valueOf(i10)));
        appCompatTextView.setText(new StringBuilder(sbS.toString()).toString());
        appconsentV3ItemTabVendorBindingInflate.textTabTitle.setTextColor(new ColorStateList(iArr, iArr2));
        return appconsentV3ItemTabVendorBindingInflate;
    }

    private final VendorViewModel getMViewModel() {
        return (VendorViewModel) this.mViewModel$delegate.getValue();
    }

    public static final Intent getStartIntent(Context context, boolean z10) {
        return Companion.getStartIntent(context, z10);
    }

    private final void initPager() {
        List<Vendor> vendors = getMViewModel().getVendors();
        boolean booleanExtra = getIntent().getBooleanExtra(KEY_OTHER_TAB, false);
        AppconsentV3ActivityRefineByVendorBinding appconsentV3ActivityRefineByVendorBinding = this.binding;
        AppconsentV3ActivityRefineByVendorBinding appconsentV3ActivityRefineByVendorBinding2 = null;
        if (appconsentV3ActivityRefineByVendorBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityRefineByVendorBinding = null;
        }
        appconsentV3ActivityRefineByVendorBinding.viewPager.setAdapter(new SimpleFragmentPagerAdapter(this));
        AppconsentV3ActivityRefineByVendorBinding appconsentV3ActivityRefineByVendorBinding3 = this.binding;
        if (appconsentV3ActivityRefineByVendorBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityRefineByVendorBinding3 = null;
        }
        appconsentV3ActivityRefineByVendorBinding3.viewPager.setCurrentItem(booleanExtra ? 1 : 0, false);
        AppconsentV3ActivityRefineByVendorBinding appconsentV3ActivityRefineByVendorBinding4 = this.binding;
        if (appconsentV3ActivityRefineByVendorBinding4 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityRefineByVendorBinding4 = null;
        }
        appconsentV3ActivityRefineByVendorBinding4.viewPager.setUserInputEnabled(false);
        AppconsentV3ActivityRefineByVendorBinding appconsentV3ActivityRefineByVendorBinding5 = this.binding;
        if (appconsentV3ActivityRefineByVendorBinding5 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityRefineByVendorBinding5 = null;
        }
        appconsentV3ActivityRefineByVendorBinding5.tabLayout.setSelectedTabIndicatorColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        AppconsentV3ActivityRefineByVendorBinding appconsentV3ActivityRefineByVendorBinding6 = this.binding;
        if (appconsentV3ActivityRefineByVendorBinding6 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityRefineByVendorBinding6 = null;
        }
        TabLayout tabLayout = appconsentV3ActivityRefineByVendorBinding6.tabLayout;
        AppconsentV3ActivityRefineByVendorBinding appconsentV3ActivityRefineByVendorBinding7 = this.binding;
        if (appconsentV3ActivityRefineByVendorBinding7 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            appconsentV3ActivityRefineByVendorBinding2 = appconsentV3ActivityRefineByVendorBinding7;
        }
        new h(tabLayout, appconsentV3ActivityRefineByVendorBinding2.viewPager, new n(12, this, vendors)).attach();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPager$lambda$4(RefineByVendorActivity this$0, List vendors, TabLayout.a tab, int i10) {
        int i11;
        int i12;
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNullParameter(vendors, "$vendors");
        e0.checkNotNullParameter(tab, "tab");
        boolean z10 = true;
        if (i10 == 0) {
            List list = vendors;
            boolean z11 = list instanceof Collection;
            if (z11 && list.isEmpty()) {
                i11 = 0;
            } else {
                Iterator it = list.iterator();
                i11 = 0;
                while (it.hasNext()) {
                    if (!((Vendor) it.next()).isExtraVendor() && (i11 = i11 + 1) < 0) {
                        p0.throwCountOverflow();
                    }
                }
            }
            tab.setCustomView(this$0.generateTabTitleBinding(i11, false).getRoot());
            TabLayout.c cVar = tab.f29430i;
            if (z11 && list.isEmpty()) {
                z10 = false;
            } else {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (!((Vendor) it2.next()).isExtraVendor()) {
                        break;
                    }
                }
                z10 = false;
            }
            cVar.setClickable(z10);
            return;
        }
        if (i10 != 1) {
            return;
        }
        List list2 = vendors;
        boolean z12 = list2 instanceof Collection;
        if (z12 && list2.isEmpty()) {
            i12 = 0;
        } else {
            Iterator it3 = list2.iterator();
            i12 = 0;
            while (it3.hasNext()) {
                if (((Vendor) it3.next()).isExtraVendor() && (i12 = i12 + 1) < 0) {
                    p0.throwCountOverflow();
                }
            }
        }
        tab.setCustomView(this$0.generateTabTitleBinding(i12, true).getRoot());
        TabLayout.c cVar2 = tab.f29430i;
        if (z12 && list2.isEmpty()) {
            z10 = false;
        } else {
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                if (((Vendor) it4.next()).isExtraVendor()) {
                    break;
                }
            }
            z10 = false;
        }
        cVar2.setClickable(z10);
    }

    @Override // com.sfbx.appconsentv3.ui.AppConsentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppconsentV3ActivityRefineByVendorBinding appconsentV3ActivityRefineByVendorBindingInflate = AppconsentV3ActivityRefineByVendorBinding.inflate(getLayoutInflater());
        e0.checkNotNullExpressionValue(appconsentV3ActivityRefineByVendorBindingInflate, "inflate(layoutInflater)");
        this.binding = appconsentV3ActivityRefineByVendorBindingInflate;
        AppconsentV3ActivityRefineByVendorBinding appconsentV3ActivityRefineByVendorBinding = null;
        if (appconsentV3ActivityRefineByVendorBindingInflate == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityRefineByVendorBindingInflate = null;
        }
        ConstraintLayout root = appconsentV3ActivityRefineByVendorBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "binding.root");
        setCustomContentViewFromLayer2(root);
        ExtensionKt.setupCustomTitle(this, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getActionBarColor$appconsent_ui_v3_prodXchangeRelease(), getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getActionBarTextColor$appconsent_ui_v3_prodXchangeRelease(), getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease(), getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getVendorsHeader$appconsent_ui_v3_prodXchangeRelease());
        AppconsentV3ActivityRefineByVendorBinding appconsentV3ActivityRefineByVendorBinding2 = this.binding;
        if (appconsentV3ActivityRefineByVendorBinding2 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            appconsentV3ActivityRefineByVendorBinding = appconsentV3ActivityRefineByVendorBinding2;
        }
        appconsentV3ActivityRefineByVendorBinding.intLayout.setBackgroundColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        initPager();
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
}
