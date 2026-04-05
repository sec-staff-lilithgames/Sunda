package com.sfbx.appconsent.core.provider;

import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConsentProvider$reducer$2 extends f0 implements kv.a {
    final /* synthetic */ ConsentProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentProvider$reducer$2(ConsentProvider consentProvider) {
        super(0);
        this.this$0 = consentProvider;
    }

    @Override // kv.a
    public final String invoke() {
        return this.this$0.reducerDao.getAssetReducer();
    }
}
