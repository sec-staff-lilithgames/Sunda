package com.bytedance.sdk.component.jd.jpo;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class zz {

    /* renamed from: jd, reason: collision with root package name */
    private String f18612jd;
    private String jpo;

    private zz(String str) {
        this.jpo = str;
    }

    public static zz jpo(String str) {
        return new zz(str);
    }

    public String jpo() {
        return this.jpo;
    }

    public Charset jpo(Charset charset) {
        try {
            String str = this.f18612jd;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
