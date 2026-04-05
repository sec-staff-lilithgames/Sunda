package com.bytedance.sdk.component.my.wqx.jpo.jd;

import com.bytedance.sdk.component.my.opi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx implements opi {

    /* renamed from: jd, reason: collision with root package name */
    private int f18904jd;
    private int jpo;
    private com.bytedance.sdk.component.my.wqx.jpo.wqx<String, byte[]> wqx;

    public wqx(int i10, int i11) {
        this.f18904jd = i10;
        this.jpo = i11;
        this.wqx = new com.bytedance.sdk.component.my.wqx.jpo.wqx<String, byte[]>(i10) { // from class: com.bytedance.sdk.component.my.wqx.jpo.jd.wqx.1
            @Override // com.bytedance.sdk.component.my.wqx.jpo.wqx
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public int jd(String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    @Override // com.bytedance.sdk.component.my.jpo
    public boolean jd(String str) {
        return this.wqx.jpo((com.bytedance.sdk.component.my.wqx.jpo.wqx<String, byte[]>) str) != null;
    }

    @Override // com.bytedance.sdk.component.my.jpo
    public boolean jpo(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.wqx.jpo(str, bArr);
        return true;
    }

    @Override // com.bytedance.sdk.component.my.jpo
    public byte[] jpo(String str) {
        return this.wqx.jpo((com.bytedance.sdk.component.my.wqx.jpo.wqx<String, byte[]>) str);
    }
}
