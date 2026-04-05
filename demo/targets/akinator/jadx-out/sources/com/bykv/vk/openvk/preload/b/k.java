package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class k<IN, OUT> extends d<IN, OUT> {

    /* renamed from: d, reason: collision with root package name */
    private IN f17024d;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final Object a(b<OUT> bVar, IN in2) throws Throwable {
        this.f17024d = in2;
        try {
            return bVar.a((b<OUT>) a());
        } catch (i.a e10) {
            return a((b) bVar, e10.getCause());
        } catch (Throwable th2) {
            return a((b) bVar, th2);
        }
    }

    public abstract boolean a(Throwable th2);

    public final IN g() {
        return this.f17024d;
    }

    private Object a(b<OUT> bVar, Throwable th2) throws Throwable {
        while (a(th2)) {
            try {
                return bVar.a((b<OUT>) a());
            } catch (i.a e10) {
                th2 = e10.getCause();
            } catch (Throwable th3) {
                th2 = th3;
            }
        }
        throw th2;
    }

    public OUT a() {
        return this.f17024d;
    }
}
