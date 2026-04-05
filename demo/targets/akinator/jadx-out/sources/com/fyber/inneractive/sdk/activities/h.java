package com.fyber.inneractive.sdk.activities;

import com.fyber.inneractive.sdk.click.q;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements com.fyber.inneractive.sdk.click.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f23058a;

    public h(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f23058a = inneractiveInternalBrowserActivity;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) throws JSONException {
        if (bVar.f23160a != q.FAILED) {
            InneractiveInternalBrowserActivity.a(this.f23058a, bVar);
            this.f23058a.finish();
        }
    }
}
