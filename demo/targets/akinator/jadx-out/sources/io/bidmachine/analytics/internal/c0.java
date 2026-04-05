package io.bidmachine.analytics.internal;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.BytesValue;
import io.bidmachine.analytics.internal.g0;
import io.bidmachine.analytics.internal.h0;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c0 implements g0.a {

    /* renamed from: a, reason: collision with root package name */
    private final e0 f60000a;

    public c0(e0 e0Var) {
        this.f60000a = e0Var;
    }

    @Override // io.bidmachine.analytics.internal.g0.a
    public BytesValue a(h0.a aVar) throws FileNotFoundException {
        C3881n c3881nA = this.f60000a.a();
        if (c3881nA == null) {
            throw new FileNotFoundException("No data received yet");
        }
        if (c3881nA.f()) {
            throw new FileNotFoundException("Empty data");
        }
        return BytesValue.newBuilder().setValue(ByteString.readFrom(new ByteArrayInputStream(c3881nA.toString().getBytes(sv.g.f86134b)))).build();
    }
}
