package com.inmobi.media;

import android.net.Uri;
import com.amazon.device.ads.DTBMetricReport;
import io.ktor.http.ContentDisposition;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class B0 implements InterfaceC3048w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D0 f31645a;

    public B0(D0 d02) {
        this.f31645a = d02;
    }

    @Override // com.inmobi.media.InterfaceC3048w1
    public final void a(C2843k assetBatch, byte b10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(assetBatch, "assetBatch");
        D0 d02 = this.f31645a;
        F5 f52 = d02.f31726f;
        if (f52 != null) {
            String str = d02.f31724d;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f52).b(str, "onAssetsFetchFailure of batch " + assetBatch);
        }
    }

    @Override // com.inmobi.media.InterfaceC3048w1
    public final void a(C2843k assetBatch) {
        String str;
        kotlin.jvm.internal.e0.checkNotNullParameter(assetBatch, "assetBatch");
        D0 d02 = this.f31645a;
        F5 f52 = d02.f31726f;
        if (f52 != null) {
            String str2 = d02.f31724d;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "onAssetsFetchSuccess of batch " + assetBatch);
        }
        Set set = assetBatch.f32992h;
        Iterator it = assetBatch.f32991g.iterator();
        while (it.hasNext()) {
            C2826j c2826j = (C2826j) it.next();
            if (!c2826j.f32947i) {
                this.f31645a.getClass();
                Iterator it2 = set.iterator();
                while (true) {
                    str = "";
                    if (!it2.hasNext()) {
                        break;
                    }
                    Rb rb2 = (Rb) it2.next();
                    if (kotlin.jvm.internal.e0.areEqual(rb2.f32216b, c2826j.f32940b)) {
                        byte b10 = rb2.f32215a;
                        if (b10 == 2) {
                            str = "image";
                        } else if (b10 == 1) {
                            str = "gif";
                        } else if (b10 == 0) {
                            str = "video";
                        }
                    }
                }
                tu.v vVar = tu.e0.to(DTBMetricReport.LATENCY, Long.valueOf(c2826j.f32949k));
                long length = 0;
                try {
                    String path = Uri.parse(c2826j.f32941c).getPath();
                    if (path != null) {
                        File file = new File(path);
                        if (file.exists()) {
                            length = file.length();
                        }
                    }
                } catch (Exception unused) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("L4", "TAG");
                }
                Map<String, Object> mapMutableMapOf = uu.p1.mutableMapOf(vVar, tu.e0.to(ContentDisposition.Parameters.Size, Float.valueOf((length * 1.0f) / 1024)), tu.e0.to("assetType", str), tu.e0.to("networkType", R3.x()));
                String strB = this.f31645a.f31723c.b();
                if (strB != null) {
                    mapMutableMapOf.put("adType", strB);
                }
                this.f31645a.f31722b.b("AssetDownloaded", mapMutableMapOf);
            }
        }
        D0 d03 = this.f31645a;
        F5 f53 = d03.f31726f;
        if (f53 != null) {
            String str3 = d03.f31724d;
            StringBuilder sbA = N6.a(str3, "access$getTAG$p(...)", "Notifying ad unit with placement ID (");
            sbA.append(this.f31645a.f31723c);
            sbA.append(')');
            ((G5) f53).a(str3, sbA.toString());
        }
    }
}
