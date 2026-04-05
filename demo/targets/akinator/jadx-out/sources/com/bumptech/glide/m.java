package com.bumptech.glide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n8.x;
import n8.y;
import p8.s0;
import p8.v0;
import u8.l0;
import u8.m0;
import u8.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f16611a;

    /* renamed from: b, reason: collision with root package name */
    public final e9.b f16612b;

    /* renamed from: c, reason: collision with root package name */
    public final e9.f f16613c;

    /* renamed from: d, reason: collision with root package name */
    public final e9.h f16614d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.j f16615e;

    /* renamed from: f, reason: collision with root package name */
    public final c9.g f16616f;

    /* renamed from: g, reason: collision with root package name */
    public final e9.c f16617g;

    /* renamed from: h, reason: collision with root package name */
    public final e9.e f16618h = new e9.e();

    /* renamed from: i, reason: collision with root package name */
    public final e9.d f16619i = new e9.d();

    /* renamed from: j, reason: collision with root package name */
    public final w3.f f16620j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends a {
        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> c(M m9, List<l0> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m9);
        }

        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e extends a {
        public e(Class<?> cls) {
            super(a.b.i(cls, "Failed to find source encoder for data class: "));
        }
    }

    public m() {
        w3.f fVarThreadSafeList = k9.h.threadSafeList();
        this.f16620j = fVarThreadSafeList;
        this.f16611a = new p0(fVarThreadSafeList);
        this.f16612b = new e9.b();
        this.f16613c = new e9.f();
        this.f16614d = new e9.h();
        this.f16615e = new com.bumptech.glide.load.data.j();
        this.f16616f = new c9.g();
        this.f16617g = new e9.c();
        setResourceDecoderBucketPriorityList(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    public <Data> m append(Class<Data> cls, n8.d dVar) {
        this.f16612b.append(cls, dVar);
        return this;
    }

    public List<n8.g> getImageHeaderParsers() {
        List<n8.g> parsers = this.f16617g.getParsers();
        if (parsers.isEmpty()) {
            throw new b();
        }
        return parsers;
    }

    public <Data, TResource, Transcode> s0 getLoadPath(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        Class<Data> cls4;
        Class<TResource> cls5;
        Class<Transcode> cls6;
        Class<Data> cls7 = cls;
        e9.d dVar = this.f16619i;
        s0 s0Var = dVar.get(cls7, cls2, cls3);
        s0 s0Var2 = null;
        if (dVar.isEmptyLoadPath(s0Var)) {
            return null;
        }
        if (s0Var != null) {
            return s0Var;
        }
        ArrayList arrayList = new ArrayList();
        e9.f fVar = this.f16613c;
        for (Class cls8 : fVar.getResourceClasses(cls7, cls2)) {
            c9.g gVar = this.f16616f;
            for (Class cls9 : gVar.getTranscodeClasses(cls8, cls3)) {
                arrayList.add(new p8.t(cls7, cls8, cls9, fVar.getDecoders(cls7, cls8), gVar.get(cls8, cls9), this.f16620j));
                cls7 = cls;
            }
            cls7 = cls;
        }
        if (arrayList.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            s0Var2 = new s0(cls4, cls5, cls6, arrayList, this.f16620j);
        }
        dVar.put(cls4, cls5, cls6, s0Var2);
        return s0Var2;
    }

    public <Model> List<l0> getModelLoaders(Model model) {
        return this.f16611a.getModelLoaders(model);
    }

    public <Model, TResource, Transcode> List<Class<?>> getRegisteredResourceClasses(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        e9.e eVar = this.f16618h;
        List<Class<?>> list = eVar.get(cls, cls2, cls3);
        List<Class<?>> list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Class<?>> it = this.f16611a.getDataClasses(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f16613c.getResourceClasses(it.next(), cls2)) {
                    if (!this.f16616f.getTranscodeClasses(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            eVar.put(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
            list2 = arrayList;
        }
        return list2;
    }

    public <X> y getResultEncoder(v0 v0Var) throws d {
        y yVar = this.f16614d.get(v0Var.getResourceClass());
        if (yVar != null) {
            return yVar;
        }
        throw new d(v0Var.getResourceClass());
    }

    public <X> com.bumptech.glide.load.data.g getRewinder(X x10) {
        return this.f16615e.build(x10);
    }

    public <X> n8.d getSourceEncoder(X x10) throws e {
        n8.d encoder = this.f16612b.getEncoder(x10.getClass());
        if (encoder != null) {
            return encoder;
        }
        throw new e(x10.getClass());
    }

    public boolean isResourceEncoderAvailable(v0 v0Var) {
        return this.f16614d.get(v0Var.getResourceClass()) != null;
    }

    public <Data> m prepend(Class<Data> cls, n8.d dVar) {
        this.f16612b.prepend(cls, dVar);
        return this;
    }

    @Deprecated
    public <Data> m register(Class<Data> cls, n8.d dVar) {
        return append(cls, dVar);
    }

    public <Model, Data> m replace(Class<Model> cls, Class<Data> cls2, m0 m0Var) {
        this.f16611a.replace(cls, cls2, m0Var);
        return this;
    }

    public final m setResourceDecoderBucketPriorityList(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add("legacy_append");
        this.f16613c.setBucketPriorityList(arrayList);
        return this;
    }

    public <Data, TResource> m append(Class<Data> cls, Class<TResource> cls2, x xVar) {
        append("legacy_append", cls, cls2, xVar);
        return this;
    }

    public <Data, TResource> m prepend(Class<Data> cls, Class<TResource> cls2, x xVar) {
        prepend("legacy_prepend_all", cls, cls2, xVar);
        return this;
    }

    @Deprecated
    public <TResource> m register(Class<TResource> cls, y yVar) {
        return append((Class) cls, yVar);
    }

    public <Data, TResource> m append(String str, Class<Data> cls, Class<TResource> cls2, x xVar) {
        this.f16613c.append(str, xVar, cls, cls2);
        return this;
    }

    public <Data, TResource> m prepend(String str, Class<Data> cls, Class<TResource> cls2, x xVar) {
        this.f16613c.prepend(str, xVar, cls, cls2);
        return this;
    }

    public m register(com.bumptech.glide.load.data.f fVar) {
        this.f16615e.register(fVar);
        return this;
    }

    public <TResource> m append(Class<TResource> cls, y yVar) {
        this.f16614d.append(cls, yVar);
        return this;
    }

    public <TResource> m prepend(Class<TResource> cls, y yVar) {
        this.f16614d.prepend(cls, yVar);
        return this;
    }

    public <TResource, Transcode> m register(Class<TResource> cls, Class<Transcode> cls2, c9.e eVar) {
        this.f16616f.register(cls, cls2, eVar);
        return this;
    }

    public <Model, Data> m append(Class<Model> cls, Class<Data> cls2, m0 m0Var) {
        this.f16611a.append(cls, cls2, m0Var);
        return this;
    }

    public <Model, Data> m prepend(Class<Model> cls, Class<Data> cls2, m0 m0Var) {
        this.f16611a.prepend(cls, cls2, m0Var);
        return this;
    }

    public m register(n8.g gVar) {
        this.f16617g.add(gVar);
        return this;
    }
}
