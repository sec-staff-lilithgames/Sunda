package br;

import br.e2;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f9780a;

    /* renamed from: b, reason: collision with root package name */
    public final Queue f9781b;

    /* renamed from: c, reason: collision with root package name */
    public final e2 f9782c;

    /* renamed from: d, reason: collision with root package name */
    public final e f9783d;

    /* renamed from: e, reason: collision with root package name */
    public final k1 f9784e;

    /* renamed from: f, reason: collision with root package name */
    public final p f9785f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f9786g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedList f9787a = new LinkedList();

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f9788b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public b0 f9789c;

        /* renamed from: d, reason: collision with root package name */
        public e f9790d;

        /* renamed from: e, reason: collision with root package name */
        public e2 f9791e;

        /* renamed from: f, reason: collision with root package name */
        public k1 f9792f;

        /* renamed from: g, reason: collision with root package name */
        public p f9793g;

        public final a addAdPhaseParams(e adPhaseParams) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adPhaseParams, "adPhaseParams");
            this.f9787a.add(adPhaseParams);
            return this;
        }

        public final d build() {
            p pVar = this.f9793g;
            b0 b0VarB = this.f9789c;
            if (b0VarB == null) {
                b0VarB = dq.v.f52535a.b();
            }
            b0 b0Var = b0VarB;
            e2 e2VarBuild = this.f9791e;
            if (e2VarBuild == null) {
                e2VarBuild = new e2.a().build();
            }
            e eVar = this.f9790d;
            k1 k1Var = this.f9792f;
            return new d(b0Var, this.f9787a, e2VarBuild, eVar, k1Var, pVar, this.f9788b);
        }

        public final a setAdPhaseParamsQueue(Queue<e> queue) {
            ir.s.setSafely(this.f9787a, queue);
            return this;
        }

        public final a setBackground(p pVar) {
            this.f9793g = pVar;
            return this;
        }

        public final a setCacheType(b0 cacheType) {
            kotlin.jvm.internal.e0.checkNotNullParameter(cacheType, "cacheType");
            this.f9789c = cacheType;
            return this;
        }

        public final a setCustomParams(Map<String, String> map) {
            ir.s.setSafely(this.f9788b, map);
            return this;
        }

        public final a setOrientation(k1 k1Var) {
            this.f9792f = k1Var;
            return this;
        }

        public final a setPlaceholderParams(e eVar) {
            this.f9790d = eVar;
            return this;
        }

        public final a setVisibilityParams(e2 e2Var) {
            this.f9791e = e2Var;
            return this;
        }
    }

    public d(b0 cacheType, Queue<e> adPhaseParamsQueue, e2 visibilityParams, e eVar, k1 k1Var, p pVar, Map<String, String> customParams) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cacheType, "cacheType");
        kotlin.jvm.internal.e0.checkNotNullParameter(adPhaseParamsQueue, "adPhaseParamsQueue");
        kotlin.jvm.internal.e0.checkNotNullParameter(visibilityParams, "visibilityParams");
        kotlin.jvm.internal.e0.checkNotNullParameter(customParams, "customParams");
        this.f9780a = cacheType;
        this.f9781b = adPhaseParamsQueue;
        this.f9782c = visibilityParams;
        this.f9783d = eVar;
        this.f9784e = k1Var;
        this.f9785f = pVar;
        this.f9786g = customParams;
    }

    public final Queue<e> getAdPhaseParamsQueue() {
        return this.f9781b;
    }

    public final p getBackground() {
        return this.f9785f;
    }

    public final b0 getCacheType() {
        return this.f9780a;
    }

    public final String getCustomParam(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return (String) this.f9786g.get(key);
    }

    public final Map<String, String> getCustomParams() {
        return this.f9786g;
    }

    public final k1 getOrientation() {
        return this.f9784e;
    }

    public final e getPlaceholderParams() {
        return this.f9783d;
    }

    public final e2 getVisibilityParams() {
        return this.f9782c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d(b0 b0Var, Queue queue, e2 e2Var, e eVar, k1 k1Var, p pVar, Map map, int i10, kotlin.jvm.internal.u uVar) {
        Map map2;
        p pVar2;
        eVar = (i10 & 8) != 0 ? null : eVar;
        k1Var = (i10 & 16) != 0 ? null : k1Var;
        if ((i10 & 32) != 0) {
            map2 = map;
            pVar2 = null;
        } else {
            map2 = map;
            pVar2 = pVar;
        }
        this(b0Var, queue, e2Var, eVar, k1Var, pVar2, map2);
    }
}
