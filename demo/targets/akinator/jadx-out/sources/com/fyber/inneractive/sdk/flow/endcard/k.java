package com.fyber.inneractive.sdk.flow.endcard;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f23573a;

    /* renamed from: b, reason: collision with root package name */
    public final m f23574b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23575c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.b f23576d;

    /* renamed from: e, reason: collision with root package name */
    public final h f23577e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23578f;

    public k(Context context, t0 t0Var) {
        x0 x0Var = new x0(context, t0Var);
        m mVar = new m();
        this.f23574b = mVar;
        this.f23573a = x0Var;
        this.f23575c = !TextUtils.equals(x0Var.f23953d.E, "1");
        h hVar = new h();
        this.f23577e = hVar;
        this.f23578f = hVar.f23570b;
        this.f23576d = new com.fyber.inneractive.sdk.flow.endcard.loaders.b(x0Var, mVar);
    }

    public final b a() {
        b bVar;
        m mVar = this.f23574b;
        int size = mVar.f23609a.size();
        int i10 = mVar.f23611c;
        do {
            i10++;
            if (i10 >= size) {
                return null;
            }
            bVar = (b) mVar.f23609a.get(i10);
        } while (!bVar.l());
        if (bVar.i() == com.fyber.inneractive.sdk.model.vast.i.Default_End_Card) {
            for (int size2 = mVar.f23610b.size() - 1; size2 >= 0; size2--) {
                if (((b) mVar.f23610b.get(size2)) instanceof o) {
                    return null;
                }
            }
            if (mVar.f23611c >= 0) {
                return null;
            }
        } else if (bVar instanceof c) {
            int i11 = i10 + 1;
            for (int size3 = mVar.f23609a.size() - 1; size3 >= i11; size3--) {
                b bVar2 = (b) mVar.f23609a.get(size3);
                if (bVar2 instanceof c) {
                    bVar2.destroy();
                    mVar.f23609a.remove(size3);
                }
            }
        }
        mVar.f23611c = i10;
        mVar.f23610b.add(bVar);
        bVar.f23559e = mVar.f23610b.size();
        return bVar;
    }
}
