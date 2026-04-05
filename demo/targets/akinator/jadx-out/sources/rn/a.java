package rn;

import io.bidmachine.media3.common.util.o0;
import ln.i;
import pn.r;
import qn.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends o0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f84520j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f84521k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f84522l;

    public a(i iVar, int i10, l lVar) {
        this.f84520j = iVar;
        this.f84521k = i10;
        this.f84522l = lVar;
    }

    @Override // io.bidmachine.media3.common.util.o0
    public final Object b() {
        return r.loadChunkIndex(this.f84520j, this.f84521k, this.f84522l);
    }
}
