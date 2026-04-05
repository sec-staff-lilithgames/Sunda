package com.google.firebase.messaging;

import j1.o2;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final b f29766a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f29767b = o2.s(1, ui.e.builder("messagingClientEvent"));

    @Override // ui.f, ui.b
    public void encode(zj.g gVar, ui.g gVar2) throws IOException {
        gVar2.add(f29767b, gVar.getMessagingClientEventInternal());
    }
}
