package io.bidmachine;

import io.bidmachine.ViewAdObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class h4 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f60376a;

    static {
        int[] iArr = new int[ViewAdObject.MeasureMode.values().length];
        f60376a = iArr;
        try {
            iArr[ViewAdObject.MeasureMode.Direct.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f60376a[ViewAdObject.MeasureMode.Wrap.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
