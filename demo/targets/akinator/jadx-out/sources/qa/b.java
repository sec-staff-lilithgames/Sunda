package qa;

import av.e;
import bv.n;
import ca.m;
import ca.o;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import timber.log.Timber;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f82651i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, zu.d dVar) {
        super(2, dVar);
        this.f82651i = str;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new b(this.f82651i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        try {
            o.sharedInstance().updateUserInfosDefi(this.f82651i, m.sharedInstance().getCurrentLanguage(), m.sharedInstance().getKeyUser(), String.valueOf(m.sharedInstance().getCurrentSubject()));
        } catch (Exception e10) {
            Timber.Forest.tag("AkDefiWS").e(e10);
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
