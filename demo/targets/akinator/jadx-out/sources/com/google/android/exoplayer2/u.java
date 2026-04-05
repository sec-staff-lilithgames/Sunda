package com.google.android.exoplayer2;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class u implements mh.v2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28055c;

    public /* synthetic */ u(Object obj, int i10) {
        this.f28054b = i10;
        this.f28055c = obj;
    }

    @Override // mh.v2
    public final Object get() {
        switch (this.f28054b) {
            case 0:
                return (e1) this.f28055c;
            case 1:
                return (d3) this.f28055c;
            case 2:
                return (bf.c0) this.f28055c;
            case 3:
                return (qf.g) this.f28055c;
            case 4:
                return (pf.w) this.f28055c;
            case 5:
                return Boolean.valueOf(((AtomicBoolean) this.f28055c).get());
            default:
                return Boolean.valueOf(((u0) this.f28055c).B);
        }
    }
}
