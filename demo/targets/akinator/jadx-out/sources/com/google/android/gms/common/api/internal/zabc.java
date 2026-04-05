package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zabc extends com.google.android.gms.internal.base.zau {
    final /* synthetic */ zabe zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabc(zabe zabeVar, Looper looper) {
        super(looper);
        this.zaa = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            zabe.zaj(this.zaa);
        } else if (i10 != 2) {
            o2.u(i10, "Unknown message id: ", "GoogleApiClientImpl");
        } else {
            zabe.zai(this.zaa);
        }
    }
}
