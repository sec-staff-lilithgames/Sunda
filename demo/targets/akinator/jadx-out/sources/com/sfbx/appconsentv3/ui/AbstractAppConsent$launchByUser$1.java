package com.sfbx.appconsentv3.ui;

import kotlin.jvm.internal.f0;
import kv.a;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AbstractAppConsent$launchByUser$1 extends f0 implements a {
    final /* synthetic */ l $onReady;
    final /* synthetic */ AbstractAppConsent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractAppConsent$launchByUser$1(l lVar, AbstractAppConsent abstractAppConsent) {
        super(0);
        this.$onReady = lVar;
        this.this$0 = abstractAppConsent;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m3462invoke();
        return x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m3462invoke() {
        this.$onReady.invoke(this.this$0);
    }
}
