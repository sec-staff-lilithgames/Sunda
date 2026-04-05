package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f17095a;

    /* renamed from: b, reason: collision with root package name */
    public String f17096b;

    /* renamed from: c, reason: collision with root package name */
    public String f17097c;

    /* renamed from: d, reason: collision with root package name */
    public String f17098d;

    /* renamed from: e, reason: collision with root package name */
    public String f17099e;

    /* renamed from: f, reason: collision with root package name */
    public String f17100f;

    /* renamed from: g, reason: collision with root package name */
    public int f17101g;

    public static com.bykv.vk.openvk.preload.geckox.buffer.a a(File file, long j10) throws IOException {
        com.bykv.vk.openvk.preload.geckox.buffer.a aVarB = b(file, j10);
        GeckoLogger.d("gecko-debug-tag", "buffer type:" + aVarB.getClass());
        return aVarB;
    }

    private static com.bykv.vk.openvk.preload.geckox.buffer.a b(File file, long j10) throws IOException {
        if (j10 <= 0) {
            try {
                return new b(file);
            } catch (Exception e10) {
                throw new IOException("create FileBuffer failed! file:" + file.getAbsolutePath() + " caused by:" + e10.getMessage(), e10);
            }
        }
        try {
            return new c(j10, file);
        } catch (Exception e11) {
            throw new RuntimeException("create random access file failed! file:" + file.getAbsolutePath() + " caused by:" + e11.getMessage(), e11);
        }
    }
}
