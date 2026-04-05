package io.bidmachine.analytics.internal;

import com.applovin.shadow.okio.Segment;
import com.explorestack.protobuf.BytesValue;
import io.bidmachine.analytics.internal.F;
import io.bidmachine.analytics.internal.g0;
import io.bidmachine.analytics.internal.h0;
import io.bidmachine.protobuf.sdk.OSLog;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class E implements g0.a {

    /* renamed from: a, reason: collision with root package name */
    private final J f59881a;

    /* renamed from: b, reason: collision with root package name */
    private final F f59882b = new F();

    public E(J j10) {
        this.f59881a = j10;
    }

    @Override // io.bidmachine.analytics.internal.g0.a
    public BytesValue a(h0.a aVar) throws FileNotFoundException {
        ArrayList arrayList = new ArrayList();
        InputStream inputStreamA = this.f59881a.a(aVar.a());
        if (inputStreamA != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamA, sv.g.f86134b), Segment.SIZE);
            try {
                Iterator<Object> it = gv.y.lineSequence(bufferedReader).iterator();
                while (it.hasNext()) {
                    F.b bVarA = this.f59882b.a((String) it.next());
                    if (bVarA != null) {
                        arrayList.add(OSLog.Record.newBuilder().setTimestamp(b0.a(bVarA.d())).setTag(bVarA.c()).setLevel(bVarA.a()).setMessage(bVarA.b()).setSource("").build());
                    }
                }
                gv.d.closeFinally(bufferedReader, null);
            } finally {
            }
        }
        if (arrayList.isEmpty()) {
            throw new FileNotFoundException("No records found");
        }
        return BytesValue.newBuilder().setValue(OSLog.newBuilder().addAllRecords(arrayList).build().toByteString()).build();
    }
}
