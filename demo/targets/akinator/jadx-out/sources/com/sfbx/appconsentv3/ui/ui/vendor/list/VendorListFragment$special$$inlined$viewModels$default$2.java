package com.sfbx.appconsentv3.ui.ui.vendor.list;

import androidx.lifecycle.m3;
import androidx.lifecycle.n3;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VendorListFragment$special$$inlined$viewModels$default$2 extends f0 implements a {
    final /* synthetic */ a $ownerProducer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VendorListFragment$special$$inlined$viewModels$default$2(a aVar) {
        super(0);
        this.$ownerProducer = aVar;
    }

    @Override // kv.a
    public final m3 invoke() {
        m3 viewModelStore = ((n3) this.$ownerProducer.invoke()).getViewModelStore();
        e0.checkNotNullExpressionValue(viewModelStore, "ownerProducer().viewModelStore");
        return viewModelStore;
    }
}
