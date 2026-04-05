package com.inmobi.media;

import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ee extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fe f31759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte f31760b;

    public Ee(Fe fe2, byte b10) {
        this.f31759a = fe2;
        this.f31760b = b10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f31759a.a(this.f31760b);
    }
}
