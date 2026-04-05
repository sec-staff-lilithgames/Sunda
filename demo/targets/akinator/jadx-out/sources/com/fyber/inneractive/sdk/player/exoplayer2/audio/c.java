package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f24494a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    void a(ByteBuffer byteBuffer);

    boolean a(int i10, int i11, int i12);

    void b();

    boolean c();

    boolean d();

    int e();

    void f();

    void flush();
}
