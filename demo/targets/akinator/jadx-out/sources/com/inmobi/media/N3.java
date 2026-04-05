package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class N3 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public static final N3 f32043a = new N3();

    public N3() {
        super(0);
    }

    @Override // kv.a
    public final Object invoke() {
        Context contextD = C2925od.d();
        Object systemService = contextD != null ? contextD.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        return Integer.valueOf(audioManager != null ? audioManager.getStreamVolume(3) : 15);
    }
}
