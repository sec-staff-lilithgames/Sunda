package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f23334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f23335b;

    public m0(Context context, w wVar) {
        this.f23334a = context;
        this.f23335b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (InneractiveAdManager.isCurrentUserAChild()) {
            return;
        }
        try {
            n0.a(this.f23334a, this.f23335b);
            v vVar = u.f23410a.f23418b;
            if (TextUtils.isEmpty(vVar != null ? vVar.f23414a : null)) {
                n.a(this.f23334a, this.f23335b);
            }
        } catch (Throwable th2) {
            IAlog.b("SDK internal error: Make sure that Google Play Services for Mobile Ads is added to the compile dependencies of your project" + th2.toString(), new Object[0]);
        }
    }
}
