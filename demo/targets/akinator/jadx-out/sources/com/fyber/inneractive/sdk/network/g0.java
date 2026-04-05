package com.fyber.inneractive.sdk.network;

import com.unity3d.services.core.network.core.OkHttp3Client;
import xv.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f24226c = new g0();

    /* renamed from: a, reason: collision with root package name */
    public final k f24227a = new k();

    /* renamed from: b, reason: collision with root package name */
    public p1 f24228b;

    public final h a() {
        String property;
        if (this.f24228b == null) {
            try {
                property = System.getProperty("fyber.marketplace.http_executor_stack_name");
            } catch (Throwable unused) {
                property = "hurl";
            }
            if (property != null && property.equals(OkHttp3Client.NETWORK_CLIENT_OKHTTP)) {
                try {
                    l0.b bVar = xv.l0.H;
                    this.f24228b = new p1();
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        p1 p1Var = this.f24228b;
        return p1Var != null ? p1Var : this.f24227a;
    }
}
