package com.bykv.vk.openvk.preload.geckox.logger;

import android.util.Log;
import com.bykv.vk.openvk.preload.geckox.c.b;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class DefaultLogger implements Logger {
    @Override // com.bykv.vk.openvk.preload.geckox.logger.Logger
    public void d(String str, Object... objArr) {
        if (objArr == null) {
            Log.d(str, AbstractJsonLexerKt.NULL);
        } else {
            try {
                Log.d(str, b.a().b().a(objArr));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.logger.Logger
    public void e(String str, String str2, Throwable th2) {
        Log.e(str, str2, th2);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.logger.Logger
    public void w(String str, String str2, Throwable th2) {
        Log.w(str, str2, th2);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.logger.Logger
    public void w(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        Log.w(str, str2);
    }
}
