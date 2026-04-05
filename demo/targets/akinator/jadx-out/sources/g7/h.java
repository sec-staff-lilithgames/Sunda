package g7;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import bv.n;
import g7.a;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kv.p;
import l7.o;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public List f57418i;

    /* renamed from: j, reason: collision with root package name */
    public o f57419j;

    /* renamed from: k, reason: collision with root package name */
    public int f57420k;

    /* renamed from: l, reason: collision with root package name */
    public int f57421l;

    /* renamed from: m, reason: collision with root package name */
    public int f57422m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f57423n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f57424o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ a.b f57425p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ o f57426q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f57427r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a7.g f57428s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l7.i f57429t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, a.b bVar, o oVar, List list, a7.g gVar, l7.i iVar, zu.d dVar) {
        super(2, dVar);
        this.f57424o = aVar;
        this.f57425p = bVar;
        this.f57426q = oVar;
        this.f57427r = list;
        this.f57428s = gVar;
        this.f57429t = iVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        h hVar = new h(this.f57424o, this.f57425p, this.f57426q, this.f57427r, this.f57428s, this.f57429t, dVar);
        hVar.f57423n = obj;
        return hVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        o oVar;
        List list;
        Bitmap bitmapAccess$convertDrawableToBitmap;
        int size;
        int i10;
        av.e.getCOROUTINE_SUSPENDED();
        int i11 = this.f57422m;
        a.b bVar = this.f57425p;
        a7.g gVar = this.f57428s;
        l7.i iVar = this.f57429t;
        if (i11 == 0) {
            a0.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.f57423n;
            a aVar = this.f57424o;
            Drawable drawable = bVar.getDrawable();
            oVar = this.f57426q;
            list = this.f57427r;
            bitmapAccess$convertDrawableToBitmap = a.access$convertDrawableToBitmap(aVar, drawable, oVar, list);
            ((a7.c) gVar).transformStart(iVar, bitmapAccess$convertDrawableToBitmap);
            size = list.size();
            i10 = 0;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = this.f57421l;
            int i12 = this.f57420k;
            oVar = this.f57419j;
            list = this.f57418i;
            coroutineScope = (CoroutineScope) this.f57423n;
            a0.throwOnFailure(obj);
            bitmapAccess$convertDrawableToBitmap = (Bitmap) obj;
            CoroutineScopeKt.ensureActive(coroutineScope);
            i10 = i12 + 1;
        }
        if (i10 >= size) {
            ((a7.c) gVar).transformEnd(iVar, bitmapAccess$convertDrawableToBitmap);
            return a.b.copy$default(bVar, new BitmapDrawable(iVar.getContext().getResources(), bitmapAccess$convertDrawableToBitmap), false, null, null, 14, null);
        }
        if (list.get(i10) != null) {
            throw new ClassCastException();
        }
        oVar.getSize();
        this.f57423n = coroutineScope;
        this.f57418i = list;
        this.f57419j = oVar;
        this.f57420k = i10;
        this.f57421l = size;
        this.f57422m = 1;
        throw null;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super a.b> dVar) {
        return ((h) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
