package ua;

import android.content.Context;
import wa.e;
import wa.f;
import wa.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a implements ab.b {

    /* renamed from: a, reason: collision with root package name */
    public f f88175a;

    /* renamed from: b, reason: collision with root package name */
    public c f88176b;

    public a(cb.a aVar, ya.a aVar2) {
        cb.b.f12046b.f12047a = aVar;
        ya.b.f94257b.f94258a = aVar2;
    }

    public void authenticate() {
        eb.c.f53999a.execute(new b(this));
    }

    public void destroy() {
        this.f88176b = null;
        this.f88175a.destroy();
    }

    public String getOdt() {
        c cVar = this.f88176b;
        return cVar != null ? cVar.f88178a : "";
    }

    public boolean isAuthenticated() {
        return this.f88175a.h();
    }

    public boolean isConnected() {
        return this.f88175a.a();
    }

    @Override // ab.b
    public void onCredentialsRequestFailed(String str) {
        this.f88175a.onCredentialsRequestFailed(str);
    }

    @Override // ab.b
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.f88175a.onCredentialsRequestSuccess(str, str2);
    }

    public a(Context context, cb.a aVar, boolean z10, ab.a aVar2) {
        this(aVar, null);
        this.f88175a = new h(new e(context), false, z10, aVar2, this);
    }
}
