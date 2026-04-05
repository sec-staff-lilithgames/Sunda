package com.inmobi.media;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ae, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2689ae {

    /* renamed from: a, reason: collision with root package name */
    public final F5 f32655a;

    /* renamed from: b, reason: collision with root package name */
    public int f32656b = 101;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f32657c = uu.p0.arrayListOf(101);

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f32658d;

    public C2689ae(F5 f52) {
        this.f32655a = f52;
        List listListOf = uu.p0.listOf((Object[]) new Qe[]{new Qe(101, 1, 102, new Rd(this)), new Qe(101, 4, 104, new Sd(this)), new Qe(102, 2, 103, new Td(this)), new Qe(102, 3, 104, new Ud(this)), new Qe(102, 4, 104, new Vd(this)), new Qe(102, 8, 107, new Wd(this)), new Qe(102, 5, 105, new Xd(this)), new Qe(103, 5, 105, new Yd(this)), new Qe(106, 5, 105, new Zd(this)), new Qe(106, 7, 105, new Hd(this)), new Qe(103, 8, 107, new Id(this)), new Qe(103, 4, 104, new Jd(this)), new Qe(106, 2, 106, new Kd(this)), new Qe(106, 4, 104, new Ld(this)), new Qe(106, 8, 107, new Md(this)), new Qe(104, 8, 107, new Nd(this)), new Qe(105, 7, 106, new Od(this)), new Qe(105, 4, 104, new Pd(this)), new Qe(105, 2, 105, new Qd(this))});
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(uu.o1.mapCapacity(uu.q0.collectionSizeOrDefault(listListOf, 10)), 16));
        for (Object obj : listListOf) {
            Qe qe2 = (Qe) obj;
            linkedHashMap.put(tu.e0.to(Integer.valueOf(qe2.f32175a), Integer.valueOf(qe2.f32176b)), obj);
        }
        this.f32658d = linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.f0, kv.a] */
    public final Integer a(int i10) {
        String str;
        Qe qe2 = (Qe) this.f32658d.get(tu.e0.to(Integer.valueOf(this.f32656b), Integer.valueOf(i10)));
        if (qe2 == null) {
            return Integer.valueOf(this.f32656b);
        }
        qe2.f32178d.invoke();
        StringBuilder sb2 = new StringBuilder("Transition: ");
        Map map = AbstractC2706be.f32693a;
        int i11 = this.f32656b;
        Map map2 = AbstractC2706be.f32693a;
        sb2.append((String) map2.get(Integer.valueOf(i11)));
        sb2.append(" --[");
        switch (i10) {
            case 1:
                str = "IMRAID_LOAD_WEBVIEW";
                break;
            case 2:
                str = "FIRE_AD_READY";
                break;
            case 3:
                str = "FIRE_AD_FAILED";
                break;
            case 4:
                str = "ON_RENDER_PROCESS_GONE";
                break;
            case 5:
                str = "SHOW_WEBVIEW";
                break;
            case 6:
                str = "IMRAID_RENDERED";
                break;
            case 7:
                str = "IMRAID_FOCUS_CHANGE";
                break;
            case 8:
                str = "IMRAID_DESTROY_WEBVIEW";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        sb2.append("]--> ");
        sb2.append((String) map2.get(Integer.valueOf(qe2.f32177c)));
        System.out.println((Object) sb2.toString());
        this.f32657c.add(Integer.valueOf(qe2.f32177c));
        F5 f52 = this.f32655a;
        if (f52 != null) {
            ((G5) f52).a("StateMachine", "history - " + this.f32657c);
        }
        this.f32656b = qe2.f32177c;
        return null;
    }
}
