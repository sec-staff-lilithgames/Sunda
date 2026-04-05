package com.fyber.inneractive.sdk.web;

import android.content.DialogInterface;
import android.os.Environment;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f26994b;

    public y(i0 i0Var, String str) {
        this.f26994b = i0Var;
        this.f26993a = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        i0 i0Var = this.f26994b;
        String str = this.f26993a;
        i0Var.getClass();
        new File(Environment.getExternalStorageDirectory(), "Pictures").mkdirs();
        com.fyber.inneractive.sdk.flow.x xVar = i0Var.f26896s;
        IAConfigManager.O.f23224s.a(new com.fyber.inneractive.sdk.network.b1(new x(i0Var), str, xVar != null ? xVar.f23946c : null));
    }
}
