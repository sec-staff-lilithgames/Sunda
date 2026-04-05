package io.bidmachine.analytics.internal;

import com.explorestack.protobuf.Struct;
import io.bidmachine.protobuf.sdk.Error;
import io.bidmachine.protobuf.sdk.Event;
import io.bidmachine.protobuf.sdk.Monitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class P extends Y {

    /* renamed from: f, reason: collision with root package name */
    private final String f59929f;

    /* renamed from: g, reason: collision with root package name */
    private final Struct f59930g;

    /* renamed from: h, reason: collision with root package name */
    private final List f59931h;

    public /* synthetic */ P(String str, String str2, Struct struct, List list, p0 p0Var, int i10, kotlin.jvm.internal.u uVar) {
        this(str, str2, struct, list, (i10 & 16) != 0 ? p0.f60239g.a() : p0Var);
    }

    @Override // io.bidmachine.analytics.internal.Y
    public byte[] b() {
        try {
            int i10 = tu.z.f87419c;
            Monitor.Builder name = Monitor.newBuilder().setName(this.f59929f);
            List<Q> list = this.f59931h;
            ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
            for (Q q10 : list) {
                Monitor.Record.Builder timestamp = Monitor.Record.newBuilder().setFields(b0.a(q10.a())).setTimestamp(b0.a(q10.f()));
                q0 q0VarB = q10.b();
                if (q0VarB != null) {
                    timestamp.setError(Error.newBuilder().setName(q0VarB.a()).setError(Error.Data.newBuilder().setCode(Z.a(q0VarB.c()).getNumber()).setDescription(q0VarB.b()).build()).build());
                }
                arrayList.add(timestamp.build());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                name.addRecords((Monitor.Record) it.next());
            }
            return Event.newBuilder().setMonitor(name.build()).setExtrasPrivate(this.f59930g).build().toByteArray();
        } catch (Throwable th2) {
            int i11 = tu.z.f87419c;
            tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            return null;
        }
    }

    public P(String str, String str2, Struct struct, List list, p0 p0Var) {
        super(o0.Post, str, p0Var, null, 8, null);
        this.f59929f = str2;
        this.f59930g = struct;
        this.f59931h = list;
    }

    @Override // io.bidmachine.analytics.internal.Y
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public P a() {
        return this;
    }
}
