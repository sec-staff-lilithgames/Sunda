package jh;

import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class n implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f69558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f69559b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f69560c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f69561d;

    public n(p pVar, a aVar, Intent intent, Context context) {
        this.f69561d = pVar;
        this.f69558a = aVar;
        this.f69559b = intent;
        this.f69560c = context;
    }

    @Override // jh.d
    public final void zza() {
        p pVar = this.f69561d;
        pVar.f69567g.post(new o(pVar, this.f69558a, 5, 0));
    }

    @Override // jh.d
    public final void zzb(int i10) {
        p pVar = this.f69561d;
        pVar.f69567g.post(new o(pVar, this.f69558a, 6, i10));
    }

    @Override // jh.d
    public final void zzc() {
        Intent intent = this.f69559b;
        if (intent.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.f69561d.f29622a.zzb("Splits copied and verified more than once.", new Object[0]);
        } else {
            intent.putExtra("triggered_from_app_after_verification", true);
            this.f69560c.sendBroadcast(intent);
        }
    }
}
