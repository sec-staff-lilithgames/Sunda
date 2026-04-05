package io;

import android.content.Context;
import gn.e2;
import gn.g2;
import gn.j1;
import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f62182a;

    /* renamed from: b, reason: collision with root package name */
    public final w f62183b;

    /* renamed from: c, reason: collision with root package name */
    public g2 f62184c;

    /* renamed from: d, reason: collision with root package name */
    public j1 f62185d;

    /* renamed from: e, reason: collision with root package name */
    public List f62186e = b5.of();

    /* renamed from: f, reason: collision with root package name */
    public e2 f62187f = e2.f57875a;

    /* renamed from: g, reason: collision with root package name */
    public io.bidmachine.media3.common.util.g f62188g = io.bidmachine.media3.common.util.g.f60717a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f62189h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f62190i;

    public m(Context context, w wVar) {
        this.f62182a = context.getApplicationContext();
        this.f62183b = wVar;
    }

    public s build() {
        io.bidmachine.media3.common.util.a.checkState(!this.f62190i);
        if (this.f62185d == null) {
            if (this.f62184c == null) {
                this.f62184c = new q();
            }
            this.f62185d = new r(this.f62184c);
        }
        s sVar = new s(this);
        this.f62190i = true;
        return sVar;
    }

    public m setClock(io.bidmachine.media3.common.util.g gVar) {
        this.f62188g = gVar;
        return this;
    }

    public m setCompositionEffects(List<Object> list) {
        this.f62186e = list;
        return this;
    }

    public m setCompositorSettings(e2 e2Var) {
        this.f62187f = e2Var;
        return this;
    }

    public m setPreviewingVideoGraphFactory(j1 j1Var) {
        this.f62185d = j1Var;
        return this;
    }

    public m setRequestOpenGlToneMapping(boolean z10) {
        this.f62189h = z10;
        return this;
    }

    public m setVideoFrameProcessorFactory(g2 g2Var) {
        this.f62184c = g2Var;
        return this;
    }
}
