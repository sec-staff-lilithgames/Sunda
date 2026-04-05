package com.bytedance.adsdk.ugeno.yoga;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.adsdk.ugeno.yoga.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif extends YogaNodeJNIBase {
    public void au() {
        long j10 = this.jpo;
        if (j10 != 0) {
            this.jpo = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j10);
        }
    }

    public void finalize() throws Throwable {
        try {
            au();
        } finally {
            super.finalize();
        }
    }
}
