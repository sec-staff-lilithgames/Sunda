package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.fyber.inneractive.sdk.util.r;
import java.util.ArrayList;
import java.util.Iterator;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f23816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f23817b;

    public e(f fVar, d dVar) {
        this.f23817b = fVar;
        this.f23816a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.flow.storepromo.model.c cVar;
        f fVar = this.f23817b;
        if (fVar.f23823f == null || (cVar = fVar.f23819b) == null) {
            return;
        }
        d dVar = this.f23816a;
        StringBuilder sb2 = new StringBuilder("\n<script>\n");
        ArrayList arrayList = cVar.f23866a;
        StringBuilder sb3 = new StringBuilder();
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.flow.storepromo.model.a aVar = (com.fyber.inneractive.sdk.flow.storepromo.model.a) it.next();
            int i12 = h.f23833a[aVar.f23863a.ordinal()];
            if (i12 == 1) {
                i10++;
                String str = i.f23834a;
                String str2 = String.format("app_screen_%d", Integer.valueOf(i10));
                sb3.append(o2.r(b3.h.b("var ", str2, "_el = document.createElement('img');\n", str2, "_el.id = '"), str2, "';\ndocument.getElementById('carousel').appendChild(", str2, "_el);\n"));
                sb3.append(String.format(i.f23834a, Integer.valueOf(i10), aVar.f23864b));
                sb3.append(String.format(i.f23835b, Integer.valueOf(i10), Integer.valueOf(i10)));
            } else if (i12 == 2) {
                i11++;
                String str3 = i.f23834a;
                String str4 = String.format("app_video_url_%d", Integer.valueOf(i11));
                sb3.append(o2.r(b3.h.b("var ", str4, "_el = document.createElement('video');\n", str4, "_el.id = '"), str4, "';\ndocument.getElementById('carousel').appendChild(", str4, "_el);\n"));
                sb3.append(String.format(i.f23836c, Integer.valueOf(i11), aVar.f23864b));
                sb3.append(String.format(i.f23837d, Integer.valueOf(i11), Integer.valueOf(i11)));
            } else if (i12 == 3) {
                sb3.append(String.format(i.f23838e, aVar.f23864b));
                sb3.append(i.f23839f);
            } else if (i12 == 4) {
                sb3.append(String.format(i.f23850q, aVar.f23864b));
                sb3.append(i.f23851r);
            }
        }
        sb2.append(sb3.toString());
        sb2.append(String.format(i.f23840g, cVar.f23867b.replace("`", "\\`")) + i.f23841h + String.format(i.f23842i, cVar.f23871f.replace("`", "\\`")) + i.f23843j + String.format(i.f23844k, cVar.f23872g.f23876b.replace("`", "\\`")) + i.f23845l + String.format(i.f23848o, cVar.f23872g.f23875a.replace("`", "\\`")) + i.f23849p + String.format(i.f23846m, cVar.f23872g.f23877c.replace("`", "\\`")) + i.f23847n);
        StringBuilder sb4 = new StringBuilder();
        boolean z11 = Boolean.parseBoolean(cVar.f23869d);
        boolean z12 = Boolean.parseBoolean(cVar.f23870e);
        sb4.append(i.a(z11, "in_app_purchases"));
        sb4.append(i.a(z12, "app_contains_ads"));
        if (z12 && z11) {
            z10 = true;
        }
        sb4.append(i.a(z10, "app_subtitle_separator"));
        sb2.append(sb4.toString());
        sb2.append("</script>");
        String str5 = cVar.f23868c + sb2.toString();
        dVar.getClass();
        r.f26804b.post(new c(dVar, str5));
    }
}
