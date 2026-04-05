package com.sfbx.appconsentv3.ui.viewmodel;

import com.sfbx.appconsentv3.ui.di.UIInjector;
import com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel;
import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ViewModelFactory$introductionViewModel$2 extends f0 implements a {
    public static final ViewModelFactory$introductionViewModel$2 INSTANCE = new ViewModelFactory$introductionViewModel$2();

    public ViewModelFactory$introductionViewModel$2() {
        super(0);
    }

    @Override // kv.a
    public final IntroductionViewModel invoke() {
        return UIInjector.INSTANCE.provideIntroductionViewModel();
    }
}
