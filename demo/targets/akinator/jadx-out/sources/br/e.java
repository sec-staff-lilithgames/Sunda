package br;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f9798a;

    /* renamed from: b, reason: collision with root package name */
    public final p f9799b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f9800c;

    /* renamed from: d, reason: collision with root package name */
    public final List f9801d;

    /* renamed from: e, reason: collision with root package name */
    public final List f9802e;

    /* renamed from: f, reason: collision with root package name */
    public final List f9803f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f9804g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f9805h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f9806i;

    /* renamed from: j, reason: collision with root package name */
    public final List f9807j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f9808a;

        /* renamed from: i, reason: collision with root package name */
        public p f9816i;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f9809b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f9810c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f9811d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public final HashMap f9812e = new HashMap();

        /* renamed from: f, reason: collision with root package name */
        public final HashMap f9813f = new HashMap();

        /* renamed from: g, reason: collision with root package name */
        public final EnumMap f9814g = new EnumMap(i.class);

        /* renamed from: h, reason: collision with root package name */
        public final ArrayList f9815h = new ArrayList();

        /* renamed from: j, reason: collision with root package name */
        public int f9817j = -16777216;

        public a(int i10) {
            this.f9808a = i10;
        }

        public final a addAdsElementParams(br.a adElementParams) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adElementParams, "adElementParams");
            this.f9809b.add(adElementParams);
            return this;
        }

        public final a addAnimationParams(l params) {
            kotlin.jvm.internal.e0.checkNotNullParameter(params, "params");
            this.f9814g.put((EnumMap) params.getEvent(), (i) params);
            return this;
        }

        public final a addControlsElementParams(br.a adElementParams) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adElementParams, "adElementParams");
            this.f9810c.add(adElementParams);
            return this;
        }

        public final a addEventParams(i0 eventParams) {
            kotlin.jvm.internal.e0.checkNotNullParameter(eventParams, "eventParams");
            List<j0> eventTaskParamsList = eventParams.getEventTaskParamsList();
            if (eventTaskParamsList.isEmpty()) {
                return this;
            }
            String source = eventParams.getSource();
            HashMap map = this.f9812e;
            Map enumMap = (Map) map.get(source);
            if (enumMap == null) {
                enumMap = new EnumMap(n0.class);
                map.put(source, enumMap);
            }
            n0 eventType = eventParams.getEventType();
            List arrayList = (List) enumMap.get(eventType);
            if (arrayList == null) {
                arrayList = new ArrayList();
                enumMap.put(eventType, arrayList);
            }
            arrayList.addAll(eventTaskParamsList);
            return this;
        }

        public final a addMethodParams(g1 methodParams) {
            kotlin.jvm.internal.e0.checkNotNullParameter(methodParams, "methodParams");
            this.f9811d.add(methodParams);
            return this;
        }

        public final a addStateGroup(String stateGroup) {
            kotlin.jvm.internal.e0.checkNotNullParameter(stateGroup, "stateGroup");
            this.f9815h.add(stateGroup);
            return this;
        }

        public final e build() {
            return new e(this.f9808a, this.f9816i, Integer.valueOf(this.f9817j), this.f9809b, this.f9810c, this.f9811d, this.f9812e, this.f9813f, this.f9814g, this.f9815h);
        }

        public final a setAdsElementParamsList(List<br.a> list) {
            ir.s.setSafely(this.f9809b, list);
            return this;
        }

        public final a setAnimationParams(Map<i, l> map) {
            ir.s.setSafely(this.f9814g, map);
            return this;
        }

        public final a setBackground(p pVar) {
            this.f9816i = pVar;
            return this;
        }

        @tu.f
        public final a setBackgroundColor(int i10) {
            this.f9817j = i10;
            return this;
        }

        public final a setControlsElementParamsList(List<br.a> list) {
            ir.s.setSafely(this.f9810c, list);
            return this;
        }

        public final a setCustomParams(Map<String, String> map) {
            ir.s.setSafely(this.f9813f, map);
            return this;
        }

        public final a setEventParamsList(Map<String, ? extends Map<n0, List<j0>>> map) {
            ir.s.setSafely(this.f9812e, map);
            return this;
        }

        public final a setMethodParamsList(List<g1> list) {
            ir.s.setSafely(this.f9811d, list);
            return this;
        }

        public final a setStateGroups(List<String> list) {
            ir.s.setSafely(this.f9815h, list);
            return this;
        }
    }

    public e(int i10, p pVar, Integer num, List<br.a> adsList, List<br.a> controlsList, List<g1> methodParamsList, Map<String, ? extends Map<n0, ? extends List<j0>>> sourceEventTypeMap, Map<String, String> customParams, Map<i, l> animationParams, List<String> stateGroups) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adsList, "adsList");
        kotlin.jvm.internal.e0.checkNotNullParameter(controlsList, "controlsList");
        kotlin.jvm.internal.e0.checkNotNullParameter(methodParamsList, "methodParamsList");
        kotlin.jvm.internal.e0.checkNotNullParameter(sourceEventTypeMap, "sourceEventTypeMap");
        kotlin.jvm.internal.e0.checkNotNullParameter(customParams, "customParams");
        kotlin.jvm.internal.e0.checkNotNullParameter(animationParams, "animationParams");
        kotlin.jvm.internal.e0.checkNotNullParameter(stateGroups, "stateGroups");
        this.f9798a = i10;
        this.f9799b = pVar;
        this.f9800c = num;
        this.f9801d = adsList;
        this.f9802e = controlsList;
        this.f9803f = methodParamsList;
        this.f9804g = sourceEventTypeMap;
        this.f9805h = customParams;
        this.f9806i = animationParams;
        this.f9807j = stateGroups;
    }

    public final List<br.a> getAdsList() {
        return this.f9801d;
    }

    public final Map<i, l> getAnimationParams() {
        return this.f9806i;
    }

    public final p getBackground() {
        return this.f9799b;
    }

    public final Integer getBackgroundColor() {
        return this.f9800c;
    }

    public final List<br.a> getControlsList() {
        return this.f9802e;
    }

    public final String getCustomParam(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return (String) this.f9805h.get(key);
    }

    public final Map<String, String> getCustomParams() {
        return this.f9805h;
    }

    public final Map<n0, List<j0>> getEventTypeMap(String sourceName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sourceName, "sourceName");
        return (Map) this.f9804g.get(sourceName);
    }

    public final List<g1> getMethodParamsList() {
        return this.f9803f;
    }

    public final int getSequence() {
        return this.f9798a;
    }

    public final Map<String, Map<n0, List<j0>>> getSourceEventTypeMap() {
        return this.f9804g;
    }

    public final List<String> getStateGroups() {
        return this.f9807j;
    }

    public /* synthetic */ e(int i10, p pVar, Integer num, List list, List list2, List list3, Map map, Map map2, Map map3, List list4, int i11, kotlin.jvm.internal.u uVar) {
        this(i10, (i11 & 2) != 0 ? null : pVar, (i11 & 4) != 0 ? -16777216 : num, list, list2, list3, map, map2, map3, list4);
    }

    @tu.f
    public static /* synthetic */ void getBackgroundColor$annotations() {
    }
}
