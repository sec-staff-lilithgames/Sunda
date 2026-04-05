package com.sfbx.appconsentv3.ui.ui.vendor.refine;

import com.sfbx.appconsentv3.ui.di.UIInjector;
import com.sfbx.appconsentv3.ui.viewmodel.ViewModelFactory;
import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class RefineByVendorTabFragment$mViewModelFactory$2 extends f0 implements a {
    public static final RefineByVendorTabFragment$mViewModelFactory$2 INSTANCE = new RefineByVendorTabFragment$mViewModelFactory$2();

    public RefineByVendorTabFragment$mViewModelFactory$2() {
        super(0);
    }

    @Override // kv.a
    public final ViewModelFactory invoke() {
        return UIInjector.INSTANCE.provideViewModelFactory();
    }
}
