package com.moloco.sdk.internal.publisher.nativead.ui;

import android.view.View;
import kotlin.jvm.internal.e0;
import zq.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46626b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kv.a f46627c;

    public /* synthetic */ c(int i10, kv.a aVar) {
        this.f46626b = i10;
        this.f46627c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f46626b;
        kv.a clickListener = this.f46627c;
        switch (i10) {
            case 0:
                d.a(clickListener, view);
                break;
            case 1:
                int i11 = l.f98437g;
                e0.checkNotNullParameter(clickListener, "$clickListener");
                clickListener.invoke();
                break;
            default:
                int i12 = l.f98437g;
                e0.checkNotNullParameter(clickListener, "$clickListener");
                clickListener.invoke();
                break;
        }
    }
}
