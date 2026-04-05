package com.bytedance.sdk.component.adexpress.dynamic.cm;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz {

    /* renamed from: jd, reason: collision with root package name */
    public float f18211jd;
    public float jpo;

    public zz(float f10, float f11) {
        this.jpo = f10;
        this.f18211jd = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zz zzVar = (zz) obj;
            if (Float.compare(zzVar.jpo, this.jpo) == 0 && Float.compare(zzVar.f18211jd, this.f18211jd) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.jpo), Float.valueOf(this.f18211jd)});
    }
}
