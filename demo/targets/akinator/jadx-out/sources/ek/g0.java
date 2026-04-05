package ek;

import ek.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class g0 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public Object f54523i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f54524j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h0.a f54525k;

    /* renamed from: l, reason: collision with root package name */
    public int f54526l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0.a aVar, zu.d dVar) {
        super(dVar);
        this.f54525k = aVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f54524j = obj;
        this.f54526l |= Integer.MIN_VALUE;
        return this.f54525k.create(null, this);
    }
}
