package l5;

import android.net.Uri;
import bv.n;
import java.util.Iterator;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f72415i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f72416j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h f72417k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, i iVar, zu.d dVar) {
        super(2, dVar);
        this.f72416j = iVar;
        this.f72417k = hVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        g gVar = new g(this.f72417k, this.f72416j, dVar);
        gVar.f72415i = obj;
        return gVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f72415i;
        i iVar = this.f72416j;
        Iterator<T> it = iVar.getRegistrationUris().iterator();
        while (it.hasNext()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new f(this.f72417k, (Uri) it.next(), iVar, null), 3, null);
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((g) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
