package g7;

import android.graphics.drawable.Drawable;
import bv.n;
import coil.memory.MemoryCache$Key;
import g7.a;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import l7.o;
import l7.s;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f57410i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f57411j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l7.i f57412k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f57413l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f57414m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a7.c f57415n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MemoryCache$Key f57416o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f57417p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, l7.i iVar, Object obj, o oVar, a7.c cVar, MemoryCache$Key memoryCache$Key, i iVar2, zu.d dVar) {
        super(2, dVar);
        this.f57411j = aVar;
        this.f57412k = iVar;
        this.f57413l = obj;
        this.f57414m = oVar;
        this.f57415n = cVar;
        this.f57416o = memoryCache$Key;
        this.f57417p = iVar2;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new g(this.f57411j, this.f57412k, this.f57413l, this.f57414m, this.f57415n, this.f57416o, this.f57417p, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        g gVar;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f57410i;
        a aVar = this.f57411j;
        l7.i iVar = this.f57412k;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            this.f57410i = 1;
            obj = a.access$execute(aVar, iVar, this.f57413l, this.f57414m, this.f57415n, this);
            gVar = this;
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            gVar = this;
        }
        a.b bVar = (a.b) obj;
        j7.g gVar2 = aVar.f57358c;
        MemoryCache$Key memoryCache$Key = gVar.f57416o;
        boolean cacheValue = gVar2.setCacheValue(memoryCache$Key, iVar, bVar);
        Drawable drawable = bVar.getDrawable();
        c7.f dataSource = bVar.getDataSource();
        if (!cacheValue) {
            memoryCache$Key = null;
        }
        return new s(drawable, iVar, dataSource, memoryCache$Key, bVar.getDiskCacheKey(), bVar.isSampled(), q7.n.isPlaceholderCached(gVar.f57417p));
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super s> dVar) {
        return ((g) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
