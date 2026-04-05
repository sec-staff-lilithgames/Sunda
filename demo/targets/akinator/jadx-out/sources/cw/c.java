package cw;

import java.io.IOException;
import xv.i0;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f51113a = new c();

    @Override // xv.i0
    public v0 intercept(xv.h0 chain) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(chain, "chain");
        dw.k kVar = (dw.k) chain;
        return dw.k.copy$okhttp$default(kVar, 0, kVar.getCall$okhttp().initExchange$okhttp(kVar), null, 0, 0, 0, 61, null).proceed(kVar.getRequest$okhttp());
    }
}
