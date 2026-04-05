package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class S3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y3 f32249a;

    public S3(Y3 y32) {
        this.f32249a = y32;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f32249a) {
            try {
                Y3 y32 = this.f32249a;
                if (y32.f32546j == null) {
                    return null;
                }
                while (y32.f32545i > y32.f32542f) {
                    y32.d((String) ((Map.Entry) y32.f32547k.entrySet().iterator().next()).getKey());
                }
                if (this.f32249a.a()) {
                    this.f32249a.d();
                    this.f32249a.f32548l = 0;
                }
                return null;
            } finally {
            }
        }
    }
}
