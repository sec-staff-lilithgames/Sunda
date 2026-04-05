package d0;

import android.view.KeyEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f51674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.a f51675f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(boolean z10, kv.a aVar) {
        super(1);
        this.f51674e = z10;
        this.f51675f = aVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m3736invokeZmokQxo(((s1.c) obj).m6702unboximpl());
    }

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m3736invokeZmokQxo(KeyEvent it) {
        boolean z10;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        if (this.f51674e && c1.m3687isClickZmokQxo(it)) {
            this.f51675f.invoke();
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
