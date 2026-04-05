package com.bytedance.sdk.component.xyk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my {
    private static yd jpo = new yd() { // from class: com.bytedance.sdk.component.xyk.my.1
        @Override // com.bytedance.sdk.component.xyk.yd
        public zz createThreadFactory(int i10, String str) {
            return new zz(i10, str);
        }
    };

    public static void jpo(yd ydVar) {
        jpo = ydVar;
    }

    public static yd jpo() {
        return jpo;
    }
}
