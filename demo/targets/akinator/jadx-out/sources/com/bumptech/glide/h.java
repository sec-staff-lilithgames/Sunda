package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;
import p8.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class h extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    public static final a f16562k = new a();

    /* renamed from: a, reason: collision with root package name */
    public final q8.b f16563a;

    /* renamed from: b, reason: collision with root package name */
    public final j9.j f16564b;

    /* renamed from: c, reason: collision with root package name */
    public final g9.j f16565c;

    /* renamed from: d, reason: collision with root package name */
    public final b f16566d;

    /* renamed from: e, reason: collision with root package name */
    public final List f16567e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f16568f;

    /* renamed from: g, reason: collision with root package name */
    public final e0 f16569g;

    /* renamed from: h, reason: collision with root package name */
    public final i f16570h;

    /* renamed from: i, reason: collision with root package name */
    public final int f16571i;

    /* renamed from: j, reason: collision with root package name */
    public f9.i f16572j;

    public h(Context context, q8.b bVar, j9.j jVar, g9.j jVar2, b bVar2, Map<Class<?>, v> map, List<f9.h> list, e0 e0Var, i iVar, int i10) {
        super(context.getApplicationContext());
        this.f16563a = bVar;
        this.f16565c = jVar2;
        this.f16566d = bVar2;
        this.f16567e = list;
        this.f16568f = map;
        this.f16569g = e0Var;
        this.f16570h = iVar;
        this.f16571i = i10;
        this.f16564b = j9.k.memorize(jVar);
    }

    public <X> g9.r buildImageViewTarget(ImageView imageView, Class<X> cls) {
        return this.f16565c.buildTarget(imageView, cls);
    }

    public q8.b getArrayPool() {
        return this.f16563a;
    }

    public List<f9.h> getDefaultRequestListeners() {
        return this.f16567e;
    }

    public synchronized f9.i getDefaultRequestOptions() {
        try {
            if (this.f16572j == null) {
                this.f16572j = (f9.i) this.f16566d.build().lock();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f16572j;
    }

    public <T> v getDefaultTransitionOptions(Class<T> cls) {
        Map map = this.f16568f;
        v vVar = (v) map.get(cls);
        if (vVar == null) {
            for (Map.Entry entry : map.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    vVar = (v) entry.getValue();
                }
            }
        }
        return vVar == null ? f16562k : vVar;
    }

    public e0 getEngine() {
        return this.f16569g;
    }

    public i getExperiments() {
        return this.f16570h;
    }

    public int getLogLevel() {
        return this.f16571i;
    }

    public m getRegistry() {
        return (m) this.f16564b.get();
    }
}
