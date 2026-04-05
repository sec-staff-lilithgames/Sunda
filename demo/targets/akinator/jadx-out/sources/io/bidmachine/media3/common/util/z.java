package io.bidmachine.media3.common.util;

import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z implements a0 {
    @Override // io.bidmachine.media3.common.util.a0
    public void d(String str, String str2, Throwable th2) {
        Log.d(str, b0.appendThrowableString(str2, th2));
    }

    @Override // io.bidmachine.media3.common.util.a0
    public void e(String str, String str2, Throwable th2) {
        Log.e(str, b0.appendThrowableString(str2, th2));
    }

    @Override // io.bidmachine.media3.common.util.a0
    public void i(String str, String str2, Throwable th2) {
        Log.i(str, b0.appendThrowableString(str2, th2));
    }

    @Override // io.bidmachine.media3.common.util.a0
    public void w(String str, String str2, Throwable th2) {
        Log.w(str, b0.appendThrowableString(str2, th2));
    }
}
