package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.b6;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.ironsource.C3271ic;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class j6 extends g5 implements q0.e {

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f14201g;

    /* renamed from: h, reason: collision with root package name */
    private final q0.e f14202h;

    /* renamed from: i, reason: collision with root package name */
    private b6.b f14203i;

    /* renamed from: j, reason: collision with root package name */
    private v4 f14204j;

    /* renamed from: k, reason: collision with root package name */
    private v4 f14205k;

    /* renamed from: l, reason: collision with root package name */
    protected q0.b f14206l;

    public j6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        this(aVar, kVar, false);
    }

    public abstract void a(String str, int i10, String str2, Object obj);

    public abstract void a(String str, Object obj, int i10);

    @Override // java.lang.Runnable
    public void run() {
        q0 q0VarX = b().x();
        if (!b().F0() && !b().C0()) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "AppLovin SDK is disabled");
            a(this.f14201g.f(), -22, null, null);
        } else if (!StringUtils.isValidString(this.f14201g.f()) || this.f14201g.f().length() < 4) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.b(this.f14004b, "Task has an invalid or null request endpoint.");
            }
            a(this.f14201g.f(), AppLovinErrorCodes.INVALID_URL, null, null);
        } else {
            if (TextUtils.isEmpty(this.f14201g.h())) {
                this.f14201g.b(this.f14201g.b() != null ? C3271ic.f36944b : C3271ic.f36943a);
            }
            q0VarX.a(this.f14201g, this.f14206l, this.f14202h);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements q0.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f14207a;

        public a(com.applovin.impl.sdk.k kVar) {
            this.f14207a = kVar;
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, Object obj, int i10) {
            j6.this.f14201g.a(0);
            j6.this.a(str, obj, i10);
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, Object obj) {
            long millis;
            boolean z10 = false;
            boolean z11 = i10 < 200 || i10 >= 500;
            boolean z12 = i10 == 429;
            boolean z13 = i10 != -1009 || j6.this.f14201g.q();
            boolean z14 = (i10 == -900 || i10 == -1000) ? false : true;
            if (z13 && z14 && (z11 || z12 || j6.this.f14201g.p())) {
                String strA = j6.this.f14201g.a();
                if (j6.this.f14201g.j() <= 0) {
                    if (strA != null && strA.equals(j6.this.f14201g.f())) {
                        j6 j6Var = j6.this;
                        j6Var.a(j6Var.f14205k);
                    } else {
                        j6 j6Var2 = j6.this;
                        j6Var2.a(j6Var2.f14204j);
                    }
                    j6 j6Var3 = j6.this;
                    j6Var3.a(j6Var3.f14201g.f(), i10, str2, obj);
                    return;
                }
                com.applovin.impl.sdk.o oVar = j6.this.f14005c;
                if (com.applovin.impl.sdk.o.a()) {
                    j6 j6Var4 = j6.this;
                    com.applovin.impl.sdk.o oVar2 = j6Var4.f14005c;
                    String str3 = j6Var4.f14004b;
                    StringBuilder sbT = p0.o2.t(i10, "Unable to send request due to server failure (code ", "). ");
                    sbT.append(j6.this.f14201g.j());
                    sbT.append(" attempts left, retrying in ");
                    sbT.append(TimeUnit.MILLISECONDS.toSeconds(j6.this.f14201g.k()));
                    sbT.append(" seconds...");
                    oVar2.k(str3, sbT.toString());
                }
                int iJ = j6.this.f14201g.j() - 1;
                j6.this.f14201g.a(iJ);
                if (iJ == 0) {
                    j6 j6Var5 = j6.this;
                    j6Var5.a(j6Var5.f14204j);
                    if (StringUtils.isValidString(strA) && strA.length() >= 4) {
                        com.applovin.impl.sdk.o oVar3 = j6.this.f14005c;
                        if (com.applovin.impl.sdk.o.a()) {
                            j6 j6Var6 = j6.this;
                            j6Var6.f14005c.d(j6Var6.f14004b, "Switching to backup endpoint ".concat(strA));
                        }
                        j6.this.f14201g.a(strA);
                        z10 = true;
                    }
                }
                if (((Boolean) this.f14207a.a(v4.f15915e3)).booleanValue() && z10) {
                    millis = 0;
                } else {
                    millis = j6.this.f14201g.n() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, j6.this.f14201g.c())) : j6.this.f14201g.k();
                }
                b6 b6VarR0 = this.f14207a.r0();
                j6 j6Var7 = j6.this;
                b6VarR0.a(j6Var7, j6Var7.f14203i, millis);
                return;
            }
            j6 j6Var8 = j6.this;
            j6Var8.a(j6Var8.f14201g.f(), i10, str2, obj);
        }
    }

    public j6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10) {
        super("TaskRepeatRequest", kVar, z10);
        this.f14203i = b6.b.OTHER;
        if (aVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        a(aVar.f());
        this.f14201g = aVar;
        this.f14206l = new q0.b();
        this.f14202h = new a(kVar);
    }

    public void b(v4 v4Var) {
        this.f14205k = v4Var;
    }

    public void c(v4 v4Var) {
        this.f14204j = v4Var;
    }

    public void a(b6.b bVar) {
        this.f14203i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(v4 v4Var) {
        if (v4Var != null) {
            b().p0().a(v4Var, v4Var.a());
        }
    }
}
