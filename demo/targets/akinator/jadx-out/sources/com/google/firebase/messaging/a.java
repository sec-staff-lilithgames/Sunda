package com.google.firebase.messaging;

import androidx.core.app.NotificationCompat;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import j1.o2;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f29749a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f29750b = o2.s(1, ui.e.builder("projectNumber"));

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f29751c = o2.s(2, ui.e.builder("messageId"));

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f29752d = o2.s(3, ui.e.builder("instanceId"));

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f29753e = o2.s(4, ui.e.builder("messageType"));

    /* renamed from: f, reason: collision with root package name */
    public static final ui.e f29754f = o2.s(5, ui.e.builder("sdkPlatform"));

    /* renamed from: g, reason: collision with root package name */
    public static final ui.e f29755g = o2.s(6, ui.e.builder(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME));

    /* renamed from: h, reason: collision with root package name */
    public static final ui.e f29756h = o2.s(7, ui.e.builder("collapseKey"));

    /* renamed from: i, reason: collision with root package name */
    public static final ui.e f29757i = o2.s(8, ui.e.builder(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY));

    /* renamed from: j, reason: collision with root package name */
    public static final ui.e f29758j = o2.s(9, ui.e.builder("ttl"));

    /* renamed from: k, reason: collision with root package name */
    public static final ui.e f29759k = o2.s(10, ui.e.builder("topic"));

    /* renamed from: l, reason: collision with root package name */
    public static final ui.e f29760l = o2.s(11, ui.e.builder("bulkId"));

    /* renamed from: m, reason: collision with root package name */
    public static final ui.e f29761m = o2.s(12, ui.e.builder(NotificationCompat.CATEGORY_EVENT));

    /* renamed from: n, reason: collision with root package name */
    public static final ui.e f29762n = o2.s(13, ui.e.builder("analyticsLabel"));

    /* renamed from: o, reason: collision with root package name */
    public static final ui.e f29763o = o2.s(14, ui.e.builder("campaignId"));

    /* renamed from: p, reason: collision with root package name */
    public static final ui.e f29764p = o2.s(15, ui.e.builder("composerLabel"));

    @Override // ui.f, ui.b
    public void encode(zj.e eVar, ui.g gVar) throws IOException {
        gVar.add(f29750b, eVar.getProjectNumber());
        gVar.add(f29751c, eVar.getMessageId());
        gVar.add(f29752d, eVar.getInstanceId());
        gVar.add(f29753e, eVar.getMessageType());
        gVar.add(f29754f, eVar.getSdkPlatform());
        gVar.add(f29755g, eVar.getPackageName());
        gVar.add(f29756h, eVar.getCollapseKey());
        gVar.add(f29757i, eVar.getPriority());
        gVar.add(f29758j, eVar.getTtl());
        gVar.add(f29759k, eVar.getTopic());
        gVar.add(f29760l, eVar.getBulkId());
        gVar.add(f29761m, eVar.getEvent());
        gVar.add(f29762n, eVar.getAnalyticsLabel());
        gVar.add(f29763o, eVar.getCampaignId());
        gVar.add(f29764p, eVar.getComposerLabel());
    }
}
