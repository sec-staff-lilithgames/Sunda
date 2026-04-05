package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public e f26618a;

    /* renamed from: b, reason: collision with root package name */
    public String f26619b;

    /* renamed from: c, reason: collision with root package name */
    public j f26620c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f26621d = true;

    public abstract e a();

    public final e a(String str) throws Exception {
        this.f26621d = str != null;
        e eVar = this.f26618a;
        eVar.getClass();
        eVar.f26631c = System.currentTimeMillis();
        this.f26620c.a(this);
        String strA = this.f26620c.a();
        this.f26618a.f26636h = strA;
        r0 r0VarA = com.fyber.inneractive.sdk.config.a.a(this.f26619b);
        IAlog.a("%sGot unit config for unitId: %s from config manager", IAlog.a(this), this.f26619b);
        IAlog.a("%s%s", IAlog.a(this), r0VarA);
        if (this.f26621d) {
            a(str, r0VarA);
        } else if (b()) {
            h hVar = new h(strA);
            if (hVar.f26655a) {
                String str2 = hVar.f26656b;
                if (str2 == null || TextUtils.isEmpty(str2.trim())) {
                    throw new Exception("empty ad content detected. failing fast.");
                }
                a(str2, r0VarA);
            }
        } else {
            a(strA, r0VarA);
        }
        return this.f26618a;
    }

    public abstract void a(String str, r0 r0Var);

    public boolean b() {
        return !(this instanceof com.fyber.inneractive.sdk.dv.h);
    }

    public boolean c() {
        return this instanceof com.fyber.inneractive.sdk.dv.h;
    }
}
