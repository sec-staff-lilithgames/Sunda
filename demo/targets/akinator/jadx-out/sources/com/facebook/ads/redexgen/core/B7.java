package com.facebook.ads.redexgen.core;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: assets/audience_network.dex */
public class B7<K, V> extends C2436lv<K, V>.Itr<Map.Entry<K, V>> {
    public final /* synthetic */ C2436lv A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B7(final C2436lv this$0) {
        super(this$0, null);
        this.A00 = this$0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Map.Entry<K, V> A03(int entry) {
        return new B5(this.A00, entry);
    }
}
