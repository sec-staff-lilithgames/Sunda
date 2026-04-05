package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.view.WindowManager;
import com.fyber.inneractive.sdk.config.IAConfigManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final g f26121a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26122b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26123c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26124d;

    /* renamed from: e, reason: collision with root package name */
    public long f26125e;

    /* renamed from: f, reason: collision with root package name */
    public long f26126f;

    /* renamed from: g, reason: collision with root package name */
    public long f26127g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26128h;

    /* renamed from: i, reason: collision with root package name */
    public long f26129i;

    /* renamed from: j, reason: collision with root package name */
    public long f26130j;

    /* renamed from: k, reason: collision with root package name */
    public long f26131k;

    public h() {
        double refreshRate = ((WindowManager) IAConfigManager.O.f23227v.a().getSystemService("window")).getDefaultDisplay().getRefreshRate();
        this.f26122b = true;
        this.f26121a = g.f26116e;
        long j10 = (long) (1.0E9d / refreshRate);
        this.f26123c = j10;
        this.f26124d = (j10 * 80) / 100;
    }
}
