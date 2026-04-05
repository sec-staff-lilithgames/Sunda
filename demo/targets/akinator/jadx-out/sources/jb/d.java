package jb;

import android.content.Context;
import bv.n;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f69240i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f69241j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f69242k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f69243l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f69244m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f69245n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f69246o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f69247p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, String str, String str2, String str3, Context context, String str4, int i10, String str5, zu.d dVar) {
        super(2, dVar);
        this.f69240i = cVar;
        this.f69241j = str;
        this.f69242k = str2;
        this.f69243l = str3;
        this.f69244m = context;
        this.f69245n = str4;
        this.f69246o = i10;
        this.f69247p = str5;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new d(this.f69240i, this.f69241j, this.f69242k, this.f69243l, this.f69244m, this.f69245n, this.f69246o, this.f69247p, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        String str = this.f69241j;
        c cVar = this.f69240i;
        cVar.f69230c = str;
        cVar.setUid(this.f69242k);
        cVar.f69231d = this.f69243l;
        Context context = this.f69244m;
        String country = context.getResources().getConfiguration().getLocales().get(0).getCountry();
        if (country.length() > 3) {
            country = null;
        }
        if (country == null) {
            country = "";
        }
        cVar.f69232e = country;
        cVar.f69234g = this.f69245n;
        cVar.f69235h = this.f69246o;
        cVar.f69236i = this.f69247p;
        return bv.b.boxBoolean(cVar.a(context));
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Boolean> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
