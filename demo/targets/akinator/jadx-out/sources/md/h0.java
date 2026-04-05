package md;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import md.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h0 implements g0 {

    /* renamed from: e, reason: collision with root package name */
    public static volatile j0 f74279e;

    /* renamed from: a, reason: collision with root package name */
    public final xd.a f74280a;

    /* renamed from: b, reason: collision with root package name */
    public final xd.a f74281b;

    /* renamed from: c, reason: collision with root package name */
    public final td.c f74282c;

    /* renamed from: d, reason: collision with root package name */
    public final ud.h f74283d;

    public h0(xd.a aVar, xd.a aVar2, td.c cVar, ud.h hVar, ud.j jVar) {
        this.f74280a = aVar;
        this.f74281b = aVar2;
        this.f74282c = cVar;
        this.f74283d = hVar;
        jVar.ensureContextsScheduled();
    }

    public static h0 getInstance() {
        j0 j0Var = f74279e;
        if (j0Var != null) {
            return (h0) ((p) j0Var).f74336m.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void initialize(Context context) {
        if (f74279e == null) {
            synchronized (h0.class) {
                try {
                    if (f74279e == null) {
                        f74279e = ((o) ((o) q.builder()).setApplicationContext(context)).build();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public ud.h getUploader() {
        return this.f74283d;
    }

    @Deprecated
    public jd.l newFactory(String str) {
        return new e0(Collections.singleton(jd.e.of("proto")), d0.builder().setBackendName(str).build(), this);
    }

    @Override // md.g0
    public void send(c0 c0Var, jd.m mVar) {
        d0 transportContext = c0Var.getTransportContext();
        jd.f fVar = ((l) c0Var).f74316c;
        d0 d0VarWithPriority = transportContext.withPriority(fVar.getPriority());
        u.a code = u.builder().setEventMillis(this.f74280a.getTime()).setUptimeMillis(this.f74281b.getTime()).setTransportName(c0Var.getTransportName()).setEncodedPayload(new t(c0Var.getEncoding(), c0Var.getPayload())).setCode(fVar.getCode());
        if (fVar.getProductData() != null && fVar.getProductData().getProductId() != null) {
            code.setProductId(fVar.getProductData().getProductId());
        }
        if (fVar.getEventContext() != null) {
            jd.g eventContext = fVar.getEventContext();
            if (eventContext.getPseudonymousId() != null) {
                code.setPseudonymousId(eventContext.getPseudonymousId());
            }
            if (eventContext.getExperimentIdsClear() != null) {
                code.setExperimentIdsClear(eventContext.getExperimentIdsClear());
            }
            if (eventContext.getExperimentIdsEncrypted() != null) {
                code.setExperimentIdsEncrypted(eventContext.getExperimentIdsEncrypted());
            }
        }
        this.f74282c.schedule(d0VarWithPriority, code.build(), mVar);
    }

    public jd.l newFactory(r rVar) {
        Set setSingleton;
        if (rVar instanceof s) {
            setSingleton = Collections.unmodifiableSet(((s) rVar).getSupportedEncodings());
        } else {
            setSingleton = Collections.singleton(jd.e.of("proto"));
        }
        return new e0(setSingleton, d0.builder().setBackendName(rVar.getName()).setExtras(rVar.getExtras()).build(), this);
    }
}
