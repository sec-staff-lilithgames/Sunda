package com.bytedance.sdk.component.jd.jpo.jd;

import com.applovin.shadow.okio.Segment;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
final class my {

    /* renamed from: cm, reason: collision with root package name */
    boolean f18569cm;

    /* renamed from: jd, reason: collision with root package name */
    int f18570jd;

    /* renamed from: jj, reason: collision with root package name */
    my f18571jj;
    final byte[] jpo;
    boolean my;

    /* renamed from: qk, reason: collision with root package name */
    my f18572qk;
    int wqx;

    public my() {
        this.jpo = new byte[Segment.SIZE];
        this.my = true;
        this.f18569cm = false;
    }

    public final my jd() {
        my myVar = this.f18571jj;
        my myVar2 = myVar != this ? myVar : null;
        my myVar3 = this.f18572qk;
        if (myVar3 != null) {
            myVar3.f18571jj = myVar;
        }
        my myVar4 = this.f18571jj;
        if (myVar4 != null) {
            myVar4.f18572qk = myVar3;
        }
        this.f18571jj = null;
        this.f18572qk = null;
        return myVar2;
    }

    public final my jpo() {
        this.f18569cm = true;
        return new my(this.jpo, this.f18570jd, this.wqx, true, false);
    }

    public final my jpo(my myVar) {
        myVar.f18572qk = this;
        myVar.f18571jj = this.f18571jj;
        this.f18571jj.f18572qk = myVar;
        this.f18571jj = myVar;
        return myVar;
    }

    public my(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.jpo = bArr;
        this.f18570jd = i10;
        this.wqx = i11;
        this.f18569cm = z10;
        this.my = z11;
    }
}
