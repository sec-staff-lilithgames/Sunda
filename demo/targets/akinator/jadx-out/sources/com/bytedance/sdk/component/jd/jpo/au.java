package com.bytedance.sdk.component.jd.jpo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class au {

    /* renamed from: cm, reason: collision with root package name */
    public String f18556cm;

    /* renamed from: jj, reason: collision with root package name */
    public jpo f18557jj;
    public byte[] my;
    public zz wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum jpo {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public au() {
    }

    public static au jpo(zz zzVar, String str) {
        return new au(zzVar, str, jpo.STRING_TYPE);
    }

    public au(zz zzVar, String str, jpo jpoVar) {
        this.wqx = zzVar;
        this.f18556cm = str;
        this.f18557jj = jpoVar;
    }

    public static au jpo(zz zzVar, byte[] bArr) {
        return new au(zzVar, bArr, jpo.BYTE_ARRAY_TYPE);
    }

    public au(zz zzVar, byte[] bArr, jpo jpoVar) {
        this.wqx = zzVar;
        this.my = bArr;
        this.f18557jj = jpoVar;
    }
}
