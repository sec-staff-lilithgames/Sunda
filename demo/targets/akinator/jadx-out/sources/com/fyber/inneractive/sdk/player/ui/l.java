package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.u;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.h1;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class l extends s {
    public static final g1 I;
    public final com.fyber.inneractive.sdk.flow.g A;
    public boolean B;
    public v1 C;
    public k D;
    public int E;
    public int F;
    public View G;
    public boolean H;

    /* renamed from: y, reason: collision with root package name */
    public final a f26278y;

    /* renamed from: z, reason: collision with root package name */
    public final LayoutInflater f26279z;

    static {
        g1 g1Var = new g1();
        g1Var.f26778c = true;
        I = g1Var;
    }

    public l(Context context, com.fyber.inneractive.sdk.flow.g gVar, a aVar, com.fyber.inneractive.sdk.config.global.r rVar, String str) {
        super(context, rVar, str);
        this.B = false;
        this.H = true;
        this.A = gVar;
        this.f26279z = LayoutInflater.from(context);
        this.f26278y = aVar;
    }

    public abstract void a(int i10);

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, b bVar2) {
        Integer num;
        this.G = bVar2.f26248e;
        ViewGroup viewGroup = this.f26326r;
        if (viewGroup != null) {
            bVar.a(viewGroup, bVar2);
            this.f26326r.setVisibility(0);
            com.fyber.inneractive.sdk.model.vast.i iVar = bVar2.f26249f;
            com.fyber.inneractive.sdk.model.vast.i iVar2 = com.fyber.inneractive.sdk.model.vast.i.Static;
            if (iVar2 == iVar) {
                a(getEndCardView(), 4);
            }
            if ((iVar2 == iVar || iVar == com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card) && (num = bVar2.f26247d) != null) {
                b(iVar != iVar2 ? 8 : 4, num.intValue());
            }
        }
    }

    public void b(int i10, int i11) {
        if (this.B || this.C != null) {
            return;
        }
        IAlog.a("Start Autoclick timer - %d seconds", Integer.valueOf(i11));
        v1 v1Var = new v1(TimeUnit.SECONDS, i11);
        this.C = v1Var;
        v1Var.f26828e = new j(this, i10);
        t1 t1Var = new t1(v1Var);
        v1Var.f26826c = t1Var;
        v1Var.f26827d = false;
        t1Var.sendEmptyMessage(1932593528);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void f() {
        p();
        this.B = true;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View getEndCardView() {
        return this.G;
    }

    public String getLocalizedCtaButtonText() {
        com.fyber.inneractive.sdk.config.global.r rVar = this.f26330v;
        com.fyber.inneractive.sdk.config.global.features.d dVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
        if (dVar != null) {
            dVar.d(IAConfigManager.O.f23220o);
            com.fyber.inneractive.sdk.model.vast.a aVar = dVar.f23289e;
            if (aVar != null && aVar.f24068d) {
                return aVar.f24065a;
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public int getMaxTickFactor() {
        return 1000;
    }

    public int getSingleTickTime() {
        return 1000 / getTickFraction();
    }

    public int getTickFraction() {
        return 5;
    }

    public void h(boolean z10) {
        String string = getContext().getString(R.string.ia_video_app_info_text);
        com.fyber.inneractive.sdk.config.global.r rVar = this.f26330v;
        if (rVar != null) {
            Boolean boolC = ((u) rVar.a(u.class)).c("show_ad_identifier_original_design");
            this.H = boolC != null ? boolC.booleanValue() : true;
            string = ((com.fyber.inneractive.sdk.config.global.features.n) this.f26330v.a(com.fyber.inneractive.sdk.config.global.features.n.class)).a("app_info_button_text", "App Info");
            if (string != null && string.length() > 30) {
                string = string.substring(0, 30);
            }
        }
        if (z10 && this.H) {
            b(false);
            a(true, string);
            c(true);
        } else if (z10) {
            b(false);
            a(true, string);
            c(false);
        } else if (!this.H) {
            b(true);
            c(false);
        } else {
            a(false, (String) null);
            b(false);
            c(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void j() {
        if (this.C != null) {
            IAlog.a("Autoclick paused", new Object[0]);
            v1 v1Var = this.C;
            v1Var.f26827d = true;
            t1 t1Var = v1Var.f26826c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void k() {
        if (this.C != null) {
            IAlog.a("Autoclick resumed", new Object[0]);
            v1 v1Var = this.C;
            v1Var.f26827d = false;
            v1Var.a(SystemClock.uptimeMillis());
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void o() {
        this.f26328t = this.f26278y.a(this.f26267d, this.f26322n, this.f26323o, this.f26327s, this.f26265b, this.f26320l);
    }

    public final void p() {
        if (this.C != null) {
            IAlog.a("Autoclick is removed ", new Object[0]);
            this.C.f26828e = null;
            this.C = null;
        }
    }

    public void setEndCardView(View view) {
        this.G = view;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void a(h1 h1Var, int i10, int i11) {
        this.f26278y.a(this.f26267d, this.f26322n, this.f26323o, this.f26324p, h1Var, i10, i11, this.f26265b, ((r0) this.f26266c).f23348f.f23404f.intValue());
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void a(int i10, int i11) {
        Runnable runnable = this.D;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.D = null;
        }
        this.F = getMaxTickFactor() + i11;
        int maxTickFactor = (getMaxTickFactor() / getTickFractions()) + i11;
        int i12 = this.F;
        if (i12 <= 0 || i12 > i10) {
            return;
        }
        int i13 = this.E;
        if (maxTickFactor < i13 && i13 > 0) {
            a(i12);
            return;
        }
        this.E = maxTickFactor;
        a(maxTickFactor);
        k kVar = new k(this);
        this.D = kVar;
        postDelayed(kVar, this.f26319k);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
    }
}
