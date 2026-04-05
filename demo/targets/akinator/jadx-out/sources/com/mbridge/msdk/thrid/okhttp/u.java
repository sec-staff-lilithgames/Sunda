package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum u {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: a, reason: collision with root package name */
    private final String f43752a;

    u(String str) {
        this.f43752a = str;
    }

    public static u a(String str) throws IOException {
        u uVar = HTTP_1_0;
        if (str.equals(uVar.f43752a)) {
            return uVar;
        }
        u uVar2 = HTTP_1_1;
        if (str.equals(uVar2.f43752a)) {
            return uVar2;
        }
        u uVar3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(uVar3.f43752a)) {
            return uVar3;
        }
        u uVar4 = HTTP_2;
        if (str.equals(uVar4.f43752a)) {
            return uVar4;
        }
        u uVar5 = SPDY_3;
        if (str.equals(uVar5.f43752a)) {
            return uVar5;
        }
        u uVar6 = QUIC;
        if (str.equals(uVar6.f43752a)) {
            return uVar6;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f43752a;
    }
}
