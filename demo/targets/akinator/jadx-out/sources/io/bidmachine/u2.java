package io.bidmachine;

import io.bidmachine.protobuf.InitResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final InitResponse f62029a;

    /* renamed from: b, reason: collision with root package name */
    public final String f62030b;

    public u2(InitResponse initResponse, String str) {
        this.f62029a = initResponse;
        this.f62030b = str;
    }

    public InitResponse getResponse() {
        return this.f62029a;
    }

    public String getSessionId() {
        return this.f62030b;
    }
}
