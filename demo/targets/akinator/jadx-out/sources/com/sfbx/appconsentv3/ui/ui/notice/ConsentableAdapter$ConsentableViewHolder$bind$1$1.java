package com.sfbx.appconsentv3.ui.ui.notice;

import com.sfbx.appconsentv3.ui.listener.ConsentableListener;
import com.sfbx.appconsentv3.ui.view.ConsentableCardView;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConsentableAdapter$ConsentableViewHolder$bind$1$1 extends f0 implements l {
    final /* synthetic */ ConsentableCardView $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentableAdapter$ConsentableViewHolder$bind$1$1(ConsentableCardView consentableCardView) {
        super(1);
        this.$this_apply = consentableCardView;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ConsentableListener) obj);
        return x0.f87415a;
    }

    public final void invoke(ConsentableListener it) {
        e0.checkNotNullParameter(it, "it");
        this.$this_apply.setConsentableListener(it);
    }
}
