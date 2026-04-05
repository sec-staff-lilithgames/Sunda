package f6;

import android.animation.TypeEvaluator;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class m implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public static final m f55385a = new m();

    public static m getInstance() {
        return f55385a;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f10, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f11 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f12 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fA = o2.a(f12, f11, f10, f11);
        float fA2 = o2.a(fPow4, fPow, f10, fPow);
        float fA3 = o2.a(fPow5, fPow2, f10, fPow2);
        float fA4 = o2.a(fPow6, fPow3, f10, fPow3);
        float fPow7 = ((float) Math.pow(fA2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fA3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fA4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fA * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
