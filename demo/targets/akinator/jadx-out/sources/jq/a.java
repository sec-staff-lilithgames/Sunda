package jq;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import cv.BLca.YsiBvdpw;
import eq.c;
import kotlin.jvm.internal.e0;
import vq.b;
import yq.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends eq.a {

    /* renamed from: s, reason: collision with root package name */
    public final f f69946s;

    @Override // eq.a, dq.h
    public /* bridge */ /* synthetic */ void a(ViewGroup viewGroup) {
        super.a(viewGroup);
    }

    @Override // eq.a, dq.h
    public void c() {
        this.f54991g.b(this);
    }

    @Override // eq.a
    public View v() {
        return this.f69946s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, b bVar, br.a adElementParams, c adFormListener, tq.b eventCallback, rq.a aVar) {
        super(context, bVar, adElementParams, adFormListener, eventCallback, aVar);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(bVar, YsiBvdpw.EAZSVgT);
        e0.checkNotNullParameter(adElementParams, "adElementParams");
        e0.checkNotNullParameter(adFormListener, "adFormListener");
        e0.checkNotNullParameter(eventCallback, "eventCallback");
        this.f69946s = new f(context);
    }

    @Override // dq.p0, dq.g0
    public void a(long j10, long j11, float f10) {
        this.f69946s.a(j10, j11, f10);
    }
}
