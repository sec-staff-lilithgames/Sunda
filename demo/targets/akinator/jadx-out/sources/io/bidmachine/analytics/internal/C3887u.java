package io.bidmachine.analytics.internal;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.BytesValue;
import io.bidmachine.analytics.internal.g0;
import io.bidmachine.analytics.internal.h0;
import java.io.FileInputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: io.bidmachine.analytics.internal.u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C3887u implements g0.a {
    @Override // io.bidmachine.analytics.internal.g0.a
    public BytesValue a(h0.a aVar) {
        BytesValue.Builder builderNewBuilder = BytesValue.newBuilder();
        FileInputStream fileInputStream = new FileInputStream(s0.b(aVar.a()));
        try {
            ByteString from = ByteString.readFrom(fileInputStream);
            gv.d.closeFinally(fileInputStream, null);
            return builderNewBuilder.setValue(from).build();
        } finally {
        }
    }
}
