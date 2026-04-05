package lb;

import android.graphics.Bitmap;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72865i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f72866j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f72867k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Bitmap f72868l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f72869m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f72870n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, String str, Bitmap bitmap, String str2, String str3, zu.d dVar) {
        super(2, dVar);
        this.f72866j = eVar;
        this.f72867k = str;
        this.f72868l = bitmap;
        this.f72869m = str2;
        this.f72870n = str3;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new g(this.f72866j, this.f72867k, this.f72868l, this.f72869m, this.f72870n, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72865i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f72865i = 1;
        Object objAddPhotoToObjectWithIdAsync = this.f72866j.addPhotoToObjectWithIdAsync(this.f72867k, this.f72868l, this.f72869m, this.f72870n, this);
        return objAddPhotoToObjectWithIdAsync == coroutine_suspended ? coroutine_suspended : objAddPhotoToObjectWithIdAsync;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((g) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
