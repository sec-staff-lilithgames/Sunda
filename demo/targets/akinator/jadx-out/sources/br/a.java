package br;

import androidx.core.app.NotificationCompat;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c f9738a;

    /* renamed from: b, reason: collision with root package name */
    public final r1 f9739b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9740c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9741d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f9742e;

    /* renamed from: f, reason: collision with root package name */
    public final o f9743f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f9744g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f9745h;

    /* renamed from: i, reason: collision with root package name */
    public final ar.f f9746i;

    /* renamed from: j, reason: collision with root package name */
    public final List f9747j;

    /* renamed from: k, reason: collision with root package name */
    public final y f9748k;

    /* renamed from: l, reason: collision with root package name */
    public final String f9749l;

    /* renamed from: m, reason: collision with root package name */
    public final String f9750m;

    public a(c adElementType, String name, r1 r1Var, String str, String str2, String str3, g0 elementLayoutParams, o appearanceParams, Map<String, String> customParams, Map<i, l> animationParams, ar.f fVar, List<d1> list, y yVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adElementType, "adElementType");
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(elementLayoutParams, "elementLayoutParams");
        kotlin.jvm.internal.e0.checkNotNullParameter(appearanceParams, "appearanceParams");
        kotlin.jvm.internal.e0.checkNotNullParameter(customParams, "customParams");
        kotlin.jvm.internal.e0.checkNotNullParameter(animationParams, "animationParams");
        this.f9738a = adElementType;
        this.f9739b = r1Var;
        this.f9740c = str;
        this.f9741d = str2;
        this.f9742e = elementLayoutParams;
        this.f9743f = appearanceParams;
        this.f9744g = customParams;
        this.f9745h = animationParams;
        this.f9746i = fVar;
        this.f9747j = list;
        this.f9748k = yVar;
        Locale locale = Locale.ENGLISH;
        this.f9749l = b0.e2.p(locale, "ENGLISH", name, locale, "this as java.lang.String).toLowerCase(locale)");
        this.f9750m = str3 != null ? str3 : str;
    }

    public final c getAdElementType() {
        return this.f9738a;
    }

    public final Map<i, l> getAnimationParams() {
        return this.f9745h;
    }

    public final o getAppearanceParams() {
        return this.f9743f;
    }

    public final y getBrokenCreativeDetectorParams() {
        return this.f9748k;
    }

    public final String getCustomParam(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return (String) this.f9744g.get(key);
    }

    public final Map<String, String> getCustomParams() {
        return this.f9744g;
    }

    public final g0 getElementLayoutParams() {
        return this.f9742e;
    }

    public final ar.f getMeasurerFactory() {
        return this.f9746i;
    }

    public final List<d1> getMeasurerParamsList() {
        return this.f9747j;
    }

    public final String getName() {
        return this.f9749l;
    }

    public final String getPlaceholder() {
        return this.f9741d;
    }

    public final r1 getResource() {
        return this.f9739b;
    }

    public final String getSource() {
        return this.f9740c;
    }

    public final String getText() {
        return this.f9750m;
    }

    public final l getAnimationParams(i eventType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "eventType");
        return (l) this.f9745h.get(eventType);
    }

    @tu.f
    public static /* synthetic */ void getSource$annotations() {
    }

    public /* synthetic */ a(c cVar, String str, r1 r1Var, String str2, String str3, String str4, g0 g0Var, o oVar, Map map, Map map2, ar.f fVar, List list, y yVar, int i10, kotlin.jvm.internal.u uVar) {
        this(cVar, str, (i10 & 4) != 0 ? null : r1Var, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, g0Var, oVar, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? new HashMap() : map, (i10 & 512) != 0 ? new EnumMap(i.class) : map2, (i10 & 1024) != 0 ? null : fVar, (i10 & 2048) != 0 ? null : list, (i10 & 4096) != 0 ? null : yVar);
    }
}
