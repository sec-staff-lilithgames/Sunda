package com.inmobi.media;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class T7 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f32302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2734d8 f32303b;

    public T7(C2734d8 c2734d8, C2734d8 originalContainer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(originalContainer, "originalContainer");
        this.f32303b = c2734d8;
        this.f32302a = new WeakReference(originalContainer);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        C2734d8 c2734d8;
        Activity context = this.f32303b.f();
        if (context == null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(this.f32303b.f32752m, "access$getTAG$p(...)");
            return;
        }
        C2734d8 c2734d82 = (C2734d8) this.f32302a.get();
        if (c2734d82 == null || c2734d82.f32759t) {
            return;
        }
        try {
            C3106z8 c3106z8 = c2734d82.f32741b;
            JSONArray jSONArray = c3106z8.f33705f;
            try {
                if (jSONArray == null || D2.a(jSONArray)) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(this.f32303b.f32752m, "access$getTAG$p(...)");
                    return;
                }
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(this.f32303b.f32752m, "access$getTAG$p(...)");
                JSONObject jSONObjectE = c3106z8.e();
                if (jSONObjectE == null) {
                    return;
                }
                C2734d8 c2734d83 = this.f32303b;
                byte b10 = c2734d83.f32740a;
                C3106z8 dataModel = new C3106z8(b10, jSONObjectE, c3106z8, b10 == 0, c2734d83.f32758s, c2734d83.f32749j);
                if (!dataModel.f()) {
                    C2734d8 c2734d84 = this.f32303b;
                    F5 f52 = c2734d84.f32749j;
                    if (f52 != null) {
                        String str3 = c2734d84.f32752m;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                        ((G5) f52).b(str3, "Invalid data model for end-card container! End card will not be shown ...");
                        return;
                    }
                    return;
                }
                String adImpressionId = this.f32303b.getImpressionId();
                C2734d8 c2734d85 = this.f32303b;
                AdConfig adConfig = c2734d85.f32758s;
                long j10 = c2734d85.f32744e;
                boolean z10 = c2734d85.f32745f;
                String creativeId = c2734d85.getCreativeId();
                C2734d8 c2734d86 = this.f32303b;
                Y6 y62 = c2734d86.f32748i;
                F5 f53 = c2734d86.f32749j;
                kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.e0.checkNotNullParameter(dataModel, "dataModel");
                kotlin.jvm.internal.e0.checkNotNullParameter(adImpressionId, "adImpressionId");
                kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
                kotlin.jvm.internal.e0.checkNotNullParameter(creativeId, "creativeId");
                try {
                    if (dataModel.c().contains("VIDEO")) {
                        try {
                            str2 = "access$getTAG$p(...)";
                            c2734d8 = new C2853k9(context, (byte) 0, dataModel, adImpressionId, null, adConfig, j10, z10, creativeId, null, y62, f53);
                        } catch (Exception e10) {
                            e = e10;
                            str2 = "access$getTAG$p(...)";
                            str = str2;
                            C2734d8 c2734d87 = this.f32303b;
                            F5 f54 = c2734d87.f32749j;
                            if (f54 != null) {
                                String str4 = c2734d87.f32752m;
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, str);
                                ((G5) f54).a(str4, "Encountered unexpected error in EndCardBuilder: ", e);
                            }
                            Y5 y52 = Y5.f32563a;
                            Y5.f32566d.a(C5.a(e, NotificationCompat.CATEGORY_EVENT));
                            return;
                        }
                    } else {
                        str2 = "access$getTAG$p(...)";
                        c2734d8 = new C2734d8(context, (byte) 0, dataModel, adImpressionId, null, adConfig, j10, z10, creativeId, null, y62, f53);
                    }
                    c2734d8.H = c2734d82.H;
                    c2734d8.f32761v = c2734d82;
                    C2734d8 c2734d88 = this.f32303b;
                    F5 f55 = c2734d88.f32749j;
                    if (f55 != null) {
                        String str5 = c2734d88.f32752m;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(str5, str2);
                        ((G5) f55).a(str5, "End-card container built successfully ...");
                    }
                    c2734d82.J = c2734d8;
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e = e13;
            str = "access$getTAG$p(...)";
        }
    }
}
