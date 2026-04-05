package com.bytedance.adsdk.jd.wqx.jpo;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends oya<com.bytedance.adsdk.jd.wqx.jd.cm, com.bytedance.adsdk.jd.wqx.jd.cm> {
    public wqx(List<com.bytedance.adsdk.jd.qk.jpo<com.bytedance.adsdk.jd.wqx.jd.cm>> list) {
        super(jpo(list));
    }

    private static List<com.bytedance.adsdk.jd.qk.jpo<com.bytedance.adsdk.jd.wqx.jd.cm>> jpo(List<com.bytedance.adsdk.jd.qk.jpo<com.bytedance.adsdk.jd.wqx.jd.cm>> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.set(i10, jpo(list.get(i10)));
        }
        return list;
    }

    @Override // com.bytedance.adsdk.jd.wqx.jpo.oya, com.bytedance.adsdk.jd.wqx.jpo.au
    public /* bridge */ /* synthetic */ boolean jd() {
        return super.jd();
    }

    @Override // com.bytedance.adsdk.jd.wqx.jpo.oya
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.bytedance.adsdk.jd.wqx.jpo.oya, com.bytedance.adsdk.jd.wqx.jpo.au
    public /* bridge */ /* synthetic */ List wqx() {
        return super.wqx();
    }

    private static com.bytedance.adsdk.jd.qk.jpo<com.bytedance.adsdk.jd.wqx.jd.cm> jpo(com.bytedance.adsdk.jd.qk.jpo<com.bytedance.adsdk.jd.wqx.jd.cm> jpoVar) {
        com.bytedance.adsdk.jd.wqx.jd.cm cmVar = jpoVar.jpo;
        com.bytedance.adsdk.jd.wqx.jd.cm cmVar2 = jpoVar.f17433jd;
        if (cmVar == null || cmVar2 == null || cmVar.jpo().length == cmVar2.jpo().length) {
            return jpoVar;
        }
        float[] fArrJpo = jpo(cmVar.jpo(), cmVar2.jpo());
        return jpoVar.jpo(cmVar.jpo(fArrJpo), cmVar2.jpo(fArrJpo));
    }

    public static float[] jpo(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f10 = Float.NaN;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            float f11 = fArr3[i11];
            if (f11 != f10) {
                fArr3[i10] = f11;
                i10++;
                f10 = fArr3[i11];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i10);
    }

    @Override // com.bytedance.adsdk.jd.wqx.jpo.au
    public com.bytedance.adsdk.jd.jpo.jd.jpo<com.bytedance.adsdk.jd.wqx.jd.cm, com.bytedance.adsdk.jd.wqx.jd.cm> jpo() {
        return new com.bytedance.adsdk.jd.jpo.jd.my(this.jpo);
    }
}
