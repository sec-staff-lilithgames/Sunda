package uo;

import gn.r0;
import gn.t0;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f88650a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88651b;

    public a(int i10, String str) {
        this.f88650a = i10;
        this.f88651b = str;
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ io.bidmachine.media3.common.b getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ void populateMediaMetadata(r0 r0Var) {
        super.populateMediaMetadata(r0Var);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f88650a);
        sb2.append(",url=");
        return o2.o(sb2, this.f88651b, ")");
    }
}
