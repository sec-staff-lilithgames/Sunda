package com.google.android.material.datepicker;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29177b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f29178c;

    public h(s sVar, int i10) {
        this.f29178c = sVar;
        this.f29177b = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f29178c.f29199k.smoothScrollToPosition(this.f29177b);
    }
}
