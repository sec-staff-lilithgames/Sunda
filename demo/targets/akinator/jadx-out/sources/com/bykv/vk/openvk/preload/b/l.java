package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p0.o2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class l<IN, OUT> extends d<IN, OUT> {

    /* renamed from: d, reason: collision with root package name */
    private Map<String, a> f17025d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        List<h> f17026a = new ArrayList();

        public final a a(h hVar) {
            this.f17026a.add(hVar);
            return this;
        }

        public final a a(List<h> list) {
            this.f17026a.addAll(list);
            return this;
        }
    }

    public final Map<String, a> a() {
        return this.f17025d;
    }

    public static boolean a(List<h> list) {
        return !list.isEmpty() && ((h) o2.g(1, list)).f17013a == f.class;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Map<String, a> f17027a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.b.b.a f17028b;

        public final a a(String str) {
            if (this.f17027a.containsKey(str)) {
                throw new IllegalArgumentException("duplicated branch name");
            }
            a aVar = new a();
            this.f17027a.put(str, aVar);
            return aVar;
        }

        public final h a(Class<? extends l> cls) {
            return h.a.a().a(cls).a(this.f17027a).a(this.f17028b).b();
        }
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        Object obj;
        super.a(objArr);
        if (objArr != null && objArr.length == 1 && (obj = objArr[0]) != null) {
            try {
                this.f17025d = (Map) obj;
                return;
            } catch (ClassCastException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        throw new IllegalStateException("args error");
    }
}
