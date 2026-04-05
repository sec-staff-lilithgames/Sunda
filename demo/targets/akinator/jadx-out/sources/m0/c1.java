package m0;

import android.view.KeyEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h1 f73675e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(h1 h1Var) {
        super(1);
        this.f73675e = h1Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m5495invokeZmokQxo(((s1.c) obj).m6702unboximpl());
    }

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m5495invokeZmokQxo(KeyEvent it) {
        boolean z10;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        if (p1.m5555isCopyKeyEventZmokQxo(it)) {
            this.f73675e.copy$foundation_release();
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
