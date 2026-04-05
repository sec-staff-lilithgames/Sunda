package com.moloco.sdk.internal.http;

import com.moloco.sdk.internal.services.h0;
import com.moloco.sdk.internal.services.u;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.DefaultRequest;
import io.ktor.http.HeadersBuilder;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f45935c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h0 f45936e;

    public /* synthetic */ a(u uVar, h0 h0Var, int i10) {
        this.f45934b = i10;
        this.f45935c = uVar;
        this.f45936e = h0Var;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        switch (this.f45934b) {
            case 0:
                return b.a(this.f45935c, this.f45936e, (DefaultRequest.DefaultRequestBuilder) obj);
            case 1:
                return b.a(this.f45935c, this.f45936e, (HttpClientConfig) obj);
            default:
                return b.a(this.f45935c, this.f45936e, (HeadersBuilder) obj);
        }
    }
}
