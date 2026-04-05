package p8;

import androidx.appcompat.app.i1;
import com.bumptech.glide.m;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n implements s {

    /* renamed from: a, reason: collision with root package name */
    public final n8.a f80830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f80831b;

    public n(r rVar, n8.a aVar) {
        this.f80831b = rVar;
        this.f80830a = aVar;
    }

    @Override // p8.s
    public v0 onResourceDecoded(v0 v0Var) throws m.d {
        v0 v0VarTransform;
        n8.z zVar;
        n8.c encodeStrategy;
        boolean z10;
        boolean z11;
        Object hVar;
        r rVar = this.f80831b;
        l lVar = rVar.f80855b;
        Class<?> cls = v0Var.get().getClass();
        n8.a aVar = n8.a.f75826f;
        n8.a aVar2 = this.f80830a;
        n8.y resultEncoder = null;
        if (aVar2 != aVar) {
            n8.z zVarC = lVar.c(cls);
            zVar = zVarC;
            v0VarTransform = zVarC.transform(rVar.f80862j, v0Var, rVar.f80866n, rVar.f80867o);
        } else {
            v0VarTransform = v0Var;
            zVar = null;
        }
        if (!v0Var.equals(v0VarTransform)) {
            v0Var.recycle();
        }
        if (lVar.f80805c.getRegistry().isResourceEncoderAvailable(v0VarTransform)) {
            resultEncoder = lVar.f80805c.getRegistry().getResultEncoder(v0VarTransform);
            encodeStrategy = resultEncoder.getEncodeStrategy(rVar.f80869q);
        } else {
            encodeStrategy = n8.c.f75835e;
        }
        n8.y yVar = resultEncoder;
        n8.q qVar = rVar.f80877y;
        ArrayList arrayListB = lVar.b();
        int size = arrayListB.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = false;
                break;
            }
            if (((u8.k0) arrayListB.get(i10)).f88089a.equals(qVar)) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (!rVar.f80868p.isResourceCacheable(!z10, aVar2, encodeStrategy)) {
            return v0VarTransform;
        }
        if (yVar == null) {
            throw new m.d(v0VarTransform.get().getClass());
        }
        int iOrdinal = encodeStrategy.ordinal();
        if (iOrdinal == 0) {
            z11 = true;
            hVar = new h(rVar.f80877y, rVar.f80863k);
        } else {
            if (iOrdinal != 1) {
                throw new IllegalArgumentException("Unknown strategy: " + encodeStrategy);
            }
            z11 = true;
            hVar = new x0(lVar.f80805c.getArrayPool(), rVar.f80877y, rVar.f80863k, rVar.f80866n, rVar.f80867o, zVar, cls, rVar.f80869q);
        }
        u0 u0Var = (u0) j9.q.checkNotNull((u0) u0.f80888g.acquire());
        u0Var.f80892f = false;
        u0Var.f80891e = z11;
        u0Var.f80890c = v0VarTransform;
        i1 i1Var = rVar.f80860h;
        i1Var.f4754a = hVar;
        i1Var.f4755b = yVar;
        i1Var.f4756c = u0Var;
        return u0Var;
    }
}
