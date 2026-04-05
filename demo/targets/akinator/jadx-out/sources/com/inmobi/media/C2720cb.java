package com.inmobi.media;

import android.content.Context;
import com.ironsource.C3191e4;
import java.util.concurrent.ConcurrentHashMap;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.cb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2720cb {

    /* renamed from: a, reason: collision with root package name */
    public final I6 f32708a;

    public C2720cb(Context context, String sharePrefFile) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(sharePrefFile, "sharePrefFile");
        ConcurrentHashMap concurrentHashMap = I6.f31865b;
        this.f32708a = H6.a(context, sharePrefFile);
    }

    public final void a(String key, String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        I6.a(this.f32708a, key, value, false, 4, (Object) null);
    }

    public final void b(String key, String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        I6.a(this.f32708a, key, value, false, 4, (Object) null);
        a(System.currentTimeMillis() / 1000);
    }

    public final boolean c(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return this.f32708a.a(key);
    }

    public final void a(String key, String value, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f32708a.a(key, value, z10);
    }

    public final void a(String str, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, GalEuEfxjome.MspoA);
        I6.a(this.f32708a, str, z10, false, 4, (Object) null);
    }

    public final long b() {
        I6 i62 = this.f32708a;
        i62.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter("last_ts", C3191e4.h.W);
        return i62.f31866a.getLong("last_ts", 0L);
    }

    public final String a(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        I6 i62 = this.f32708a;
        i62.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return i62.f31866a.getString(key, null);
    }

    public final boolean b(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        I6 i62 = this.f32708a;
        i62.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return i62.f31866a.contains(key);
    }

    public final void a(long j10) {
        I6.a(this.f32708a, "last_ts", j10, false, 4, (Object) null);
    }

    public final void a() {
        this.f32708a.b();
    }
}
