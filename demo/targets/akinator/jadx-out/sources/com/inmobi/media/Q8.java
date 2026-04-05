package com.inmobi.media;

import android.media.MediaPlayer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Q8 extends MediaPlayer {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f32165d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static Q8 f32166e;

    /* renamed from: f, reason: collision with root package name */
    public static int f32167f;

    /* renamed from: a, reason: collision with root package name */
    public int f32168a;

    /* renamed from: b, reason: collision with root package name */
    public int f32169b;

    /* renamed from: c, reason: collision with root package name */
    public Q8 f32170c;

    public final void a() {
        if (3 == this.f32168a) {
            return;
        }
        synchronized (f32165d) {
            int i10 = f32167f;
            if (i10 < 5) {
                this.f32170c = f32166e;
                f32166e = this;
                f32167f = i10 + 1;
            }
        }
    }
}
