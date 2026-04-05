package com.bytedance.sdk.component.my.cm.wqx.jpo.jd;

import com.bytedance.sdk.component.my.opi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements opi {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.component.my.cm.wqx.jpo.wqx<String, byte[]> f18821cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f18822jd;
    private long jpo = 1048576;
    private int wqx;

    public jd(int i10, int i11) {
        this.wqx = i10;
        this.f18822jd = i11;
        this.f18821cm = new com.bytedance.sdk.component.my.cm.wqx.jpo.wqx<>(i11);
    }

    @Override // com.bytedance.sdk.component.my.jpo
    public boolean jd(String str) {
        return this.f18821cm.jpo((com.bytedance.sdk.component.my.cm.wqx.jpo.wqx<String, byte[]>) str) != null;
    }

    @Override // com.bytedance.sdk.component.my.jpo
    public boolean jpo(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            try {
                if (bArr.length > this.jpo) {
                    return false;
                }
                this.f18821cm.jpo(str, bArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.my.jpo
    public byte[] jpo(String str) {
        try {
            return this.f18821cm.jpo((com.bytedance.sdk.component.my.cm.wqx.jpo.wqx<String, byte[]>) str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
