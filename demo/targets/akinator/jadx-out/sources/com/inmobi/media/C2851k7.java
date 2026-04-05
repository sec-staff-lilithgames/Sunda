package com.inmobi.media;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.k7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2851k7 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2868l7 f33012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f33013b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2851k7(C2868l7 c2868l7, Context context) {
        super(1);
        this.f33012a = c2868l7;
        this.f33013b = context;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        C2750e7 it = (C2750e7) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        C2868l7 c2868l7 = this.f33012a;
        c2868l7.a(this.f33013b, c2868l7.f33047a, it);
        return tu.x0.f87415a;
    }
}
