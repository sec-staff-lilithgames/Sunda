package com.sfbx.appconsentv3.ui.ui.load;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.m3;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LoadActivity$special$$inlined$viewModels$2 extends f0 implements a {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadActivity$special$$inlined$viewModels$2(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    @Override // kv.a
    public final m3 invoke() {
        m3 viewModelStore = this.$this_viewModels.getViewModelStore();
        e0.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
        return viewModelStore;
    }
}
