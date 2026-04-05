package io.bidmachine.analytics.internal;

import com.explorestack.protobuf.BytesValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import io.bidmachine.analytics.internal.h0;
import io.bidmachine.analytics.internal.q0;
import io.bidmachine.protobuf.sdk.Error;
import io.bidmachine.protobuf.sdk.Event;
import io.bidmachine.protobuf.sdk.Reader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g0 extends Y {

    /* renamed from: f, reason: collision with root package name */
    private final String f60031f;

    /* renamed from: g, reason: collision with root package name */
    private final Struct f60032g;

    /* renamed from: h, reason: collision with root package name */
    private final List f60033h;

    /* renamed from: i, reason: collision with root package name */
    private final a f60034i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        BytesValue a(h0.a aVar);
    }

    public /* synthetic */ g0(String str, String str2, Struct struct, List list, a aVar, p0 p0Var, int i10, kotlin.jvm.internal.u uVar) {
        this(str, str2, struct, list, aVar, (i10 & 32) != 0 ? p0.f60239g.a() : p0Var);
    }

    @Override // io.bidmachine.analytics.internal.Y
    public byte[] b() {
        Object next;
        Timestamp timestampA;
        Object objM7131constructorimpl;
        try {
            int i10 = tu.z.f87419c;
            Reader.Builder name = Reader.newBuilder().setName(this.f60031f);
            List<h0> list = this.f60033h;
            ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
            for (h0 h0Var : list) {
                Reader.Record.Builder rule = Reader.Record.newBuilder().setRule(Reader.Rule.newBuilder().setGeneralRule(Reader.Rule.GeneralRule.newBuilder().setTag(b0.a(h0Var.e().b())).setPath(b0.a(h0Var.e().a())).build()));
                q0 q0VarB = h0Var.b();
                if (q0VarB == null) {
                    try {
                        int i11 = tu.z.f87419c;
                        objM7131constructorimpl = tu.z.m7131constructorimpl(rule.setRawData(this.f60034i.a(h0Var.e())));
                    } catch (Throwable th2) {
                        int i12 = tu.z.f87419c;
                        objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
                    }
                    Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(objM7131constructorimpl);
                    if (thM7134exceptionOrNullimpl != null) {
                        q0VarB = new q0(this.f60031f, thM7134exceptionOrNullimpl instanceof FileNotFoundException ? q0.a.READER_NO_CONTENT : thM7134exceptionOrNullimpl instanceof SecurityException ? q0.a.READER_NO_ACCESS : q0.a.READER_INVALID, s0.a(thM7134exceptionOrNullimpl));
                    }
                }
                if (q0VarB != null) {
                    rule.setError(Error.newBuilder().setName(q0VarB.a()).setError(Error.Data.newBuilder().setCode(Z.a(q0VarB.c()).getNumber()).setDescription(q0VarB.b()).build()).build());
                }
                arrayList.add(rule.build());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                name.addRecords((Reader.Record) it.next());
            }
            Iterator it2 = this.f60033h.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    long jF = ((h0) next).f();
                    do {
                        Object next2 = it2.next();
                        long jF2 = ((h0) next2).f();
                        if (jF < jF2) {
                            next = next2;
                            jF = jF2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            h0 h0Var2 = (h0) next;
            if (h0Var2 != null && (timestampA = b0.a(h0Var2.f())) != null) {
                name.setTimestamp(timestampA);
            }
            return Event.newBuilder().setReader(name.build()).setExtrasPrivate(this.f60032g).build().toByteArray();
        } catch (Throwable th3) {
            int i13 = tu.z.f87419c;
            tu.z.m7131constructorimpl(tu.a0.createFailure(th3));
            return null;
        }
    }

    public g0(String str, String str2, Struct struct, List list, a aVar, p0 p0Var) {
        super(o0.Post, str, p0Var, null, 8, null);
        this.f60031f = str2;
        this.f60032g = struct;
        this.f60033h = list;
        this.f60034i = aVar;
    }

    @Override // io.bidmachine.analytics.internal.Y
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public g0 a() {
        return this;
    }
}
