package com.google.android.exoplayer2;

import android.util.Base64;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class w implements mh.v2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28641b;

    @Override // mh.v2
    public final Object get() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        switch (this.f28641b) {
            case 0:
                return new m();
            case 1:
                try {
                    Class<?> cls = Class.forName("io.bidmachine.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    return (gn.g2) io.bidmachine.media3.common.util.a.checkNotNull(cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null));
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
            case 2:
                return new io.bidmachine.media3.exoplayer.o();
            case 3:
                throw new IllegalStateException();
            case 4:
                byte[] bArr = new byte[12];
                on.y.f79702j.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                byte[] bArr2 = new byte[12];
                zd.w.f97887j.nextBytes(bArr2);
                return Base64.encodeToString(bArr2, 10);
        }
    }
}
