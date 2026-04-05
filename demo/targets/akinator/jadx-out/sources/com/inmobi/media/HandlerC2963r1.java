package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.r1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class HandlerC2963r1 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f33298a;

    /* renamed from: b, reason: collision with root package name */
    public final C2947q1 f33299b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2963r1(Looper looper, C3031v1 assetStore) {
        super(looper);
        kotlin.jvm.internal.e0.checkNotNullParameter(looper, "looper");
        kotlin.jvm.internal.e0.checkNotNullParameter(assetStore, "assetStore");
        this.f33298a = new WeakReference(assetStore);
        this.f33299b = new C2947q1(this);
    }

    public final void a() {
        try {
            sendEmptyMessage(1);
        } catch (Exception unused) {
            C3031v1 c3031v1 = C3031v1.f33468a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        kotlin.jvm.internal.e0.checkNotNullParameter(msg, "msg");
        try {
        } catch (Exception e10) {
            C3031v1 c3031v1 = C3031v1.f33468a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
        if (C3031v1.f33480m.get()) {
            C3031v1 c3031v12 = (C3031v1) this.f33298a.get();
            int i10 = msg.what;
            if (i10 == 1) {
                if (c3031v12 != null) {
                    AdConfig.AssetCacheConfig assetCacheConfig = C3031v1.f33470c;
                    if (assetCacheConfig == null) {
                        LinkedHashMap linkedHashMap = Q2.f32149a;
                        Config configA = O2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, C2925od.b(), null);
                        kotlin.jvm.internal.e0.checkNotNull(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
                        assetCacheConfig = ((AdConfig) configA).getAssetCacheConfig();
                    }
                    ArrayList arrayListB = AbstractC2807hd.a().b();
                    if (arrayListB.isEmpty()) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
                        C3031v1.d();
                        return;
                    }
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
                    C2826j c2826j = (C2826j) arrayListB.get(0);
                    Iterator it = arrayListB.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C2826j c2826j2 = (C2826j) it.next();
                        if (!C3031v1.f33478k.containsKey(c2826j.f32940b)) {
                            c2826j = c2826j2;
                            break;
                        }
                    }
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1;
                    long jCurrentTimeMillis = System.currentTimeMillis() - c2826j.f32943e;
                    try {
                        if (jCurrentTimeMillis < assetCacheConfig.getRetryInterval() * 1000) {
                            sendMessageDelayed(messageObtain, (assetCacheConfig.getRetryInterval() * 1000) - jCurrentTimeMillis);
                            return;
                        }
                        if (C3031v1.f33478k.containsKey(c2826j.f32940b)) {
                            sendMessageDelayed(messageObtain, assetCacheConfig.getRetryInterval() * 1000);
                            return;
                        }
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
                        Message messageObtain2 = Message.obtain();
                        messageObtain2.what = 2;
                        messageObtain2.obj = c2826j.f32940b;
                        sendMessage(messageObtain2);
                        return;
                    } catch (Exception unused) {
                        C3031v1 c3031v13 = C3031v1.f33468a;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
                        return;
                    }
                }
                return;
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    a();
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (c3031v12 != null) {
                    Object obj = msg.obj;
                    C2826j asset = obj instanceof C2826j ? (C2826j) obj : null;
                    if (asset != null) {
                        C2913o1 c2913o1A = AbstractC2807hd.a();
                        c2913o1A.getClass();
                        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
                        c2913o1A.a("id = ?", new String[]{String.valueOf(asset.f32939a)});
                    }
                }
                a();
                return;
            }
            if (c3031v12 != null) {
                Object obj2 = msg.obj;
                String str = obj2 instanceof String ? (String) obj2 : null;
                if (str == null) {
                    return;
                }
                C2826j c2826jB = AbstractC2807hd.a().b(str);
                if (c2826jB == null) {
                    a();
                    return;
                }
                if (c2826jB.a()) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
                    try {
                        sendEmptyMessage(3);
                    } catch (Exception unused2) {
                        C3031v1 c3031v14 = C3031v1.f33468a;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
                    }
                    c3031v12.a(c2826jB, (byte) -1);
                    return;
                }
                AdConfig.AssetCacheConfig assetCacheConfig2 = C3031v1.f33470c;
                if (assetCacheConfig2 != null) {
                    assetCacheConfig2.getMaxRetries();
                }
                if (c2826jB.f32942d <= 0) {
                    c2826jB.f32950l = (byte) 6;
                    c3031v12.a(c2826jB, (byte) 6);
                    try {
                        Message messageObtain3 = Message.obtain();
                        messageObtain3.what = 4;
                        messageObtain3.obj = c2826jB;
                        sendMessage(messageObtain3);
                        return;
                    } catch (Exception unused3) {
                        C3031v1 c3031v15 = C3031v1.f33468a;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
                        return;
                    }
                }
                if (C2736da.a(false) != null) {
                    c3031v12.a(c2826jB, c2826jB.f32950l);
                    C3031v1.d();
                    return;
                } else if (C3031v1.a(c2826jB, this.f33299b)) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
                    return;
                } else {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
                    a();
                    return;
                }
            }
            return;
            C3031v1 c3031v16 = C3031v1.f33468a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
            Y5 y522 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }
}
