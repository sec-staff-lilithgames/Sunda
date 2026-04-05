package com.sfbx.appconsentv3.ui.viewmodel;

import androidx.lifecycle.g3;
import androidx.lifecycle.l3;
import b5.a;
import com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel;
import com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel;
import com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel;
import com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel;
import com.sfbx.appconsentv3.ui.ui.load.LoadViewModel;
import com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel;
import com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel;
import com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ViewModelFactory implements l3 {
    private final o consentableDetailViewModel$delegate = q.lazy(ViewModelFactory$consentableDetailViewModel$2.INSTANCE);
    private final o consentableListViewModel$delegate = q.lazy(ViewModelFactory$consentableListViewModel$2.INSTANCE);
    private final o geolocationViewModel$delegate = q.lazy(ViewModelFactory$geolocationViewModel$2.INSTANCE);
    private final o introductionViewModel$delegate = q.lazy(ViewModelFactory$introductionViewModel$2.INSTANCE);
    private final o loadViewModel$delegate = q.lazy(ViewModelFactory$loadViewModel$2.INSTANCE);
    private final o stackViewModel$delegate = q.lazy(ViewModelFactory$stackViewModel$2.INSTANCE);
    private final o vendorViewModel$delegate = q.lazy(ViewModelFactory$vendorViewModel$2.INSTANCE);
    private final o vendorListViewModel$delegate = q.lazy(ViewModelFactory$vendorListViewModel$2.INSTANCE);

    private final ConsentableDetailViewModel getConsentableDetailViewModel() {
        return (ConsentableDetailViewModel) this.consentableDetailViewModel$delegate.getValue();
    }

    private final NoticeViewModel getConsentableListViewModel() {
        return (NoticeViewModel) this.consentableListViewModel$delegate.getValue();
    }

    private final GeolocationViewModel getGeolocationViewModel() {
        return (GeolocationViewModel) this.geolocationViewModel$delegate.getValue();
    }

    private final IntroductionViewModel getIntroductionViewModel() {
        return (IntroductionViewModel) this.introductionViewModel$delegate.getValue();
    }

    private final LoadViewModel getLoadViewModel() {
        return (LoadViewModel) this.loadViewModel$delegate.getValue();
    }

    private final StackViewModel getStackViewModel() {
        return (StackViewModel) this.stackViewModel$delegate.getValue();
    }

    private final VendorListViewModel getVendorListViewModel() {
        return (VendorListViewModel) this.vendorListViewModel$delegate.getValue();
    }

    private final VendorViewModel getVendorViewModel() {
        return (VendorViewModel) this.vendorViewModel$delegate.getValue();
    }

    @Override // androidx.lifecycle.l3
    public /* bridge */ /* synthetic */ g3 create(Class cls, a aVar) {
        return super.create(cls, aVar);
    }

    @Override // androidx.lifecycle.l3
    public /* bridge */ /* synthetic */ g3 create(KClass kClass, a aVar) {
        return super.create(kClass, aVar);
    }

    @Override // androidx.lifecycle.l3
    public <T extends g3> T create(Class<T> modelClass) {
        e0.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(ConsentableDetailViewModel.class)) {
            ConsentableDetailViewModel consentableDetailViewModel = getConsentableDetailViewModel();
            e0.checkNotNull(consentableDetailViewModel, "null cannot be cast to non-null type T of com.sfbx.appconsentv3.ui.viewmodel.ViewModelFactory.create");
            return consentableDetailViewModel;
        }
        if (modelClass.isAssignableFrom(NoticeViewModel.class)) {
            NoticeViewModel consentableListViewModel = getConsentableListViewModel();
            e0.checkNotNull(consentableListViewModel, "null cannot be cast to non-null type T of com.sfbx.appconsentv3.ui.viewmodel.ViewModelFactory.create");
            return consentableListViewModel;
        }
        if (modelClass.isAssignableFrom(GeolocationViewModel.class)) {
            GeolocationViewModel geolocationViewModel = getGeolocationViewModel();
            e0.checkNotNull(geolocationViewModel, "null cannot be cast to non-null type T of com.sfbx.appconsentv3.ui.viewmodel.ViewModelFactory.create");
            return geolocationViewModel;
        }
        if (modelClass.isAssignableFrom(IntroductionViewModel.class)) {
            IntroductionViewModel introductionViewModel = getIntroductionViewModel();
            e0.checkNotNull(introductionViewModel, "null cannot be cast to non-null type T of com.sfbx.appconsentv3.ui.viewmodel.ViewModelFactory.create");
            return introductionViewModel;
        }
        if (modelClass.isAssignableFrom(LoadViewModel.class)) {
            LoadViewModel loadViewModel = getLoadViewModel();
            e0.checkNotNull(loadViewModel, "null cannot be cast to non-null type T of com.sfbx.appconsentv3.ui.viewmodel.ViewModelFactory.create");
            return loadViewModel;
        }
        if (modelClass.isAssignableFrom(StackViewModel.class)) {
            StackViewModel stackViewModel = getStackViewModel();
            e0.checkNotNull(stackViewModel, "null cannot be cast to non-null type T of com.sfbx.appconsentv3.ui.viewmodel.ViewModelFactory.create");
            return stackViewModel;
        }
        if (modelClass.isAssignableFrom(VendorViewModel.class)) {
            VendorViewModel vendorViewModel = getVendorViewModel();
            e0.checkNotNull(vendorViewModel, "null cannot be cast to non-null type T of com.sfbx.appconsentv3.ui.viewmodel.ViewModelFactory.create");
            return vendorViewModel;
        }
        if (!modelClass.isAssignableFrom(VendorListViewModel.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        VendorListViewModel vendorListViewModel = getVendorListViewModel();
        e0.checkNotNull(vendorListViewModel, "null cannot be cast to non-null type T of com.sfbx.appconsentv3.ui.viewmodel.ViewModelFactory.create");
        return vendorListViewModel;
    }
}
