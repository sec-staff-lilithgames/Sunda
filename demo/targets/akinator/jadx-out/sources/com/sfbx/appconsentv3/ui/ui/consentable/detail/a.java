package com.sfbx.appconsentv3.ui.ui.consentable.detail;

import androidx.lifecycle.u1;
import com.sfbx.appconsentv3.ui.ui.consentable.stack.StackActivity;
import com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationActivity;
import com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationDetailActivity;
import com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity;
import com.sfbx.appconsentv3.ui.ui.load.LoadActivity;
import com.sfbx.appconsentv3.ui.ui.vendor.detail.VendorDetailActivity;
import com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListFragment;
import com.sfbx.appconsentv3.ui.ui.vendor.refine.RefineByVendorTabFragment;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements u1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f50547c;

    public /* synthetic */ a(int i10, l lVar) {
        this.f50546b = i10;
        this.f50547c = lVar;
    }

    @Override // androidx.lifecycle.u1
    public final void onChanged(Object obj) {
        switch (this.f50546b) {
            case 0:
                ConsentableDetailActivity.onClick$lambda$9(this.f50547c, obj);
                break;
            case 1:
                ConsentableDetailActivity$onCreate$vendorHeaderAdapter$1.onSwitchChanged$lambda$0(this.f50547c, obj);
                break;
            case 2:
                StackActivity.consentableStatusChanged$lambda$10(this.f50547c, obj);
                break;
            case 3:
                StackActivity.onSwitchChanged$lambda$12(this.f50547c, obj);
                break;
            case 4:
                GeolocationActivity.onCreate$lambda$5(this.f50547c, obj);
                break;
            case 5:
                GeolocationDetailActivity.onSwitchChanged$lambda$8(this.f50547c, obj);
                break;
            case 6:
                GeolocationDetailActivity.onClick$lambda$7(this.f50547c, obj);
                break;
            case 7:
                IntroductionActivity.checkIfUsageExampleNeedToBeDisplayed$lambda$3(this.f50547c, obj);
                break;
            case 8:
                IntroductionActivity.checkIfUsageExampleNeedToBeDisplayed$lambda$4(this.f50547c, obj);
                break;
            case 9:
                IntroductionActivity.checkIfUsageExampleNeedToBeDisplayed$lambda$5(this.f50547c, obj);
                break;
            case 10:
                IntroductionActivity.checkIfUsageExampleNeedToBeDisplayed$lambda$6(this.f50547c, obj);
                break;
            case 11:
                LoadActivity.observeTheme$lambda$0(this.f50547c, obj);
                break;
            case 12:
                LoadActivity.observeGDPR$lambda$1(this.f50547c, obj);
                break;
            case 13:
                VendorDetailActivity.loadVendorExpiration$lambda$19$lambda$18$lambda$17(this.f50547c, obj);
                break;
            case 14:
                VendorDetailActivity.onClick$lambda$21(this.f50547c, obj);
                break;
            case 15:
                VendorDetailActivity.onSwitchChanged$lambda$20(this.f50547c, obj);
                break;
            case 16:
                VendorListFragment.onViewCreated$lambda$5(this.f50547c, obj);
                break;
            case 17:
                VendorListFragment.onViewCreated$lambda$6(this.f50547c, obj);
                break;
            default:
                RefineByVendorTabFragment.vendorStatusChanged$lambda$9(this.f50547c, obj);
                break;
        }
    }
}
