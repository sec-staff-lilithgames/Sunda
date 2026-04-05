package com.amazon.aps.shared.util;

import com.amazon.aps.shared.util.ApsAsyncUtil;
import w3.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ApsAsyncUtil.ApsReturnRunnable, k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12511b;

    public /* synthetic */ b(Object obj) {
        this.f12511b = obj;
    }

    @Override // com.amazon.aps.shared.util.ApsAsyncUtil.ApsReturnRunnable
    public Object run() {
        return ApsAsyncUtil.lambda$runOnUiThreadAndAsyncCallback$0(this.f12511b);
    }

    @Override // w3.k
    public boolean test(Object obj) {
        return this.f12511b.equals(obj);
    }
}
