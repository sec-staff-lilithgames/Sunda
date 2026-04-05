package com.ironsource;

import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.xc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3532xc {

    /* renamed from: a, reason: collision with root package name */
    private final C3278j2 f39214a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39215b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.xc$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f39216a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final String f39217b = "adm";

        /* renamed from: c, reason: collision with root package name */
        public static final String f39218c = "isOneFlow";

        /* renamed from: d, reason: collision with root package name */
        public static final String f39219d = "isMultipleAdObjects";

        /* renamed from: e, reason: collision with root package name */
        public static final String f39220e = "adsInternalInfo";

        /* renamed from: f, reason: collision with root package name */
        public static final String f39221f = "success";

        /* renamed from: g, reason: collision with root package name */
        public static final String f39222g = "error";

        /* renamed from: h, reason: collision with root package name */
        public static final String f39223h = "data";

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3532xc() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public final HashMap<String, String> a() {
        C3370o2 c3370o2G;
        HashMap<String, String> map = new HashMap<>();
        map.put("isOneFlow", String.valueOf(this.f39215b));
        map.put("isMultipleAdObjects", "true");
        List<N> listA = Mb.f34856s.d().G().a();
        String string = listA != null ? new JSONObject().put("success", true).put("data", listA).toString() : new JSONObject().put("success", false).put("error", "Failed to get ad internal info").toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "if (jsonAdInternalInfo !…    .toString()\n        }");
        map.put(a.f39220e, string);
        C3278j2 c3278j2 = this.f39214a;
        if (c3278j2 != null && (c3370o2G = c3278j2.g()) != null) {
            map.put("adm", c3370o2G.a());
            map.putAll(c3370o2G.b());
        }
        return map;
    }

    public C3532xc(C3278j2 c3278j2, boolean z10) {
        this.f39214a = c3278j2;
        this.f39215b = z10;
    }

    public /* synthetic */ C3532xc(C3278j2 c3278j2, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : c3278j2, (i10 & 2) != 0 ? false : z10);
    }
}
