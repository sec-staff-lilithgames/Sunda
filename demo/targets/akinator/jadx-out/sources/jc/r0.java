package jc;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class r0 implements ub.q0, Closeable, Flushable {

    /* renamed from: b, reason: collision with root package name */
    public final zc.l f69397b;

    /* renamed from: c, reason: collision with root package name */
    public final ub.o f69398c;

    /* renamed from: e, reason: collision with root package name */
    public final w f69399e;

    /* renamed from: f, reason: collision with root package name */
    public final wc.j f69400f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f69401g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f69402h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f69403i;

    /* renamed from: j, reason: collision with root package name */
    public ad.t f69404j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f69405k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f69406l;

    public r0(zc.l lVar, ub.o oVar, boolean z10, j0 j0Var) throws IOException {
        this.f69397b = lVar;
        this.f69398c = oVar;
        this.f69401g = z10;
        this.f69399e = j0Var.getValueSerializer();
        this.f69400f = j0Var.getTypeSerializer();
        s0 config = lVar.getConfig();
        this.f69402h = config.isEnabled(t0.FLUSH_AFTER_WRITE_VALUE);
        this.f69403i = config.isEnabled(t0.CLOSE_CLOSEABLE);
        this.f69404j = ad.t.emptyForRootValues();
    }

    public final w a(Class cls) {
        zc.l lVar = this.f69397b;
        wc.j jVar = this.f69400f;
        ad.q qVarFindAndAddRootValueSerializer = jVar == null ? this.f69404j.findAndAddRootValueSerializer((Class<?>) cls, lVar) : this.f69404j.addSerializer((Class<?>) cls, new ad.b0(jVar, lVar.findValueSerializer((Class<?>) cls, (g) null)));
        this.f69404j = qVarFindAndAddRootValueSerializer.f4292b;
        return qVarFindAndAddRootValueSerializer.f4291a;
    }

    public final w b(o oVar) {
        zc.l lVar = this.f69397b;
        wc.j jVar = this.f69400f;
        ad.q qVarFindAndAddRootValueSerializer = jVar == null ? this.f69404j.findAndAddRootValueSerializer(oVar, lVar) : this.f69404j.addSerializer(oVar, new ad.b0(jVar, lVar.findValueSerializer(oVar, (g) null)));
        this.f69404j = qVarFindAndAddRootValueSerializer.f4292b;
        return qVarFindAndAddRootValueSerializer.f4291a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f69406l) {
            return;
        }
        this.f69406l = true;
        boolean z10 = this.f69405k;
        ub.o oVar = this.f69398c;
        if (z10) {
            this.f69405k = false;
            oVar.writeEndArray();
        }
        if (this.f69401g) {
            oVar.close();
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f69406l) {
            return;
        }
        this.f69398c.flush();
    }

    public r0 init(boolean z10) throws IOException {
        if (z10) {
            this.f69398c.writeStartArray();
            this.f69405k = true;
        }
        return this;
    }

    @Override // ub.q0
    public ub.p0 version() {
        return lc.d0.f73093b;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jc.r0 write(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            r0 = 0
            zc.l r1 = r7.f69397b
            ub.o r2 = r7.f69398c
            if (r8 != 0) goto Lb
            r1.serializeValue(r2, r0)
            return r7
        Lb:
            boolean r3 = r7.f69403i
            boolean r4 = r7.f69402h
            jc.w r5 = r7.f69399e
            if (r3 == 0) goto L44
            boolean r3 = r8 instanceof java.io.Closeable
            if (r3 == 0) goto L44
            r3 = r8
            java.io.Closeable r3 = (java.io.Closeable) r3
            if (r5 != 0) goto L31
            java.lang.Class r5 = r8.getClass()     // Catch: java.lang.Throwable -> L2d
            ad.t r6 = r7.f69404j     // Catch: java.lang.Throwable -> L2d
            jc.w r6 = r6.serializerFor(r5)     // Catch: java.lang.Throwable -> L2d
            if (r6 != 0) goto L30
            jc.w r5 = r7.a(r5)     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r8 = move-exception
            r0 = r3
            goto L3e
        L30:
            r5 = r6
        L31:
            r1.serializeValue(r2, r8, r0, r5)     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L39
            r2.flush()     // Catch: java.lang.Throwable -> L2d
        L39:
            r3.close()     // Catch: java.lang.Throwable -> L3d
            return r7
        L3d:
            r8 = move-exception
        L3e:
            if (r0 == 0) goto L43
            r0.close()     // Catch: java.io.IOException -> L43
        L43:
            throw r8
        L44:
            if (r5 != 0) goto L56
            java.lang.Class r3 = r8.getClass()
            ad.t r5 = r7.f69404j
            jc.w r5 = r5.serializerFor(r3)
            if (r5 != 0) goto L56
            jc.w r5 = r7.a(r3)
        L56:
            r1.serializeValue(r2, r8, r0, r5)
            if (r4 == 0) goto L5e
            r2.flush()
        L5e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jc.r0.write(java.lang.Object):jc.r0");
    }

    public r0 writeAll(Object[] objArr) throws Throwable {
        for (Object obj : objArr) {
            write(obj);
        }
        return this;
    }

    public <C extends Collection<?>> r0 writeAll(C c10) throws Throwable {
        Iterator it = c10.iterator();
        while (it.hasNext()) {
            write(it.next());
        }
        return this;
    }

    public r0 writeAll(Iterable<?> iterable) throws Throwable {
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            write(it.next());
        }
        return this;
    }

    public r0 write(Object obj, o oVar) throws Throwable {
        Closeable closeable = null;
        zc.l lVar = this.f69397b;
        ub.o oVar2 = this.f69398c;
        if (obj == null) {
            lVar.serializeValue(oVar2, null);
            return this;
        }
        boolean z10 = this.f69403i;
        boolean z11 = this.f69402h;
        if (z10 && (obj instanceof Closeable)) {
            Closeable closeable2 = (Closeable) obj;
            try {
                w wVarSerializerFor = this.f69404j.serializerFor(oVar.getRawClass());
                if (wVarSerializerFor == null) {
                    wVarSerializerFor = b(oVar);
                }
                lVar.serializeValue(oVar2, obj, oVar, wVarSerializerFor);
                if (z11) {
                    oVar2.flush();
                }
                try {
                    closeable2.close();
                    return this;
                } catch (Throwable th2) {
                    th = th2;
                    if (closeable != null) {
                        try {
                            closeable.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = closeable2;
            }
        } else {
            w wVarSerializerFor2 = this.f69404j.serializerFor(oVar.getRawClass());
            if (wVarSerializerFor2 == null) {
                wVarSerializerFor2 = b(oVar);
            }
            lVar.serializeValue(oVar2, obj, oVar, wVarSerializerFor2);
            if (z11) {
                oVar2.flush();
            }
            return this;
        }
    }
}
