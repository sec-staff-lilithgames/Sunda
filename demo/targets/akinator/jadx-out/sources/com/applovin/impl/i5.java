package com.applovin.impl;

import android.app.Activity;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.b6;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class i5 extends g5 {

    /* renamed from: g, reason: collision with root package name */
    private final List f14140g;

    /* renamed from: h, reason: collision with root package name */
    private final Activity f14141h;

    public i5(List list, Activity activity, com.applovin.impl.sdk.k kVar) {
        super("TaskAutoInitAdapters", kVar, true);
        this.f14140g = list;
        this.f14141h = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h3 h3Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Auto-initing adapter: " + h3Var);
        }
        this.f14003a.S().a(h3Var, this.f14141h);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f14140g.size() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f14005c;
                String str = this.f14004b;
                StringBuilder sb2 = new StringBuilder("Auto-initing ");
                sb2.append(this.f14140g.size());
                sb2.append(" adapters");
                sb2.append(this.f14003a.t0().c() ? " in test mode" : "");
                sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
                oVar.a(str, sb2.toString());
            }
            if (TextUtils.isEmpty(this.f14003a.V())) {
                this.f14003a.Q0();
            } else if (!this.f14003a.H0()) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f14003a.V());
            }
            if (this.f14141h == null) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            for (h3 h3Var : this.f14140g) {
                if (h3Var.s()) {
                    this.f14003a.r0().a(new s8(8, this, h3Var), b6.b.MEDIATION);
                } else {
                    this.f14003a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f14003a.O().a(this.f14004b, "Skipping eager auto-init for adapter " + h3Var);
                    }
                }
            }
        }
    }
}
