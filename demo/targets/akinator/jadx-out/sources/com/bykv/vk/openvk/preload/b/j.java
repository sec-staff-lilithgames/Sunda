package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.i;
import com.bykv.vk.openvk.preload.b.l;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class j<IN, OUT> extends l<IN, OUT> {

    /* renamed from: d, reason: collision with root package name */
    private String f17023d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.d
    public final Object a(b<OUT> bVar, IN in2) throws Throwable {
        new m(bVar);
        this.f17023d = a((j<IN, OUT>) in2);
        l.a aVar = a().get(this.f17023d);
        while (aVar != null) {
            List<h> list = aVar.f17026a;
            try {
                Object objA = c.a(list, bVar.f17019a, this).a((b) in2);
                return !l.a(list) ? objA : bVar.a((b<OUT>) objA);
            } catch (i.a e10) {
                Throwable cause = e10.getCause();
                new m(bVar);
                this.f17023d = a(in2, cause, this.f17023d);
                aVar = a().get(this.f17023d);
            } catch (Throwable th2) {
                new m(bVar);
                this.f17023d = a(in2, th2, this.f17023d);
                aVar = a().get(this.f17023d);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.f17023d);
    }

    public abstract String a(IN in2);

    public abstract String a(IN in2, Throwable th2, String str);
}
