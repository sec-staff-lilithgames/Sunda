package com.inmobi.media;

import java.util.ArrayList;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.g9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2786g9 extends C2793h {

    /* renamed from: a, reason: collision with root package name */
    public final String f32875a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32876b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32877c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f32878d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f32879e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2786g9(C2793h ad2, JSONArray jSONArray, String videoUrl, String videoDuration, String str, ArrayList trackers, ArrayList companionAds) {
        super(ad2, jSONArray);
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(videoUrl, "videoUrl");
        kotlin.jvm.internal.e0.checkNotNullParameter(videoDuration, "videoDuration");
        kotlin.jvm.internal.e0.checkNotNullParameter(trackers, "trackers");
        kotlin.jvm.internal.e0.checkNotNullParameter(companionAds, "companionAds");
        this.f32875a = videoUrl;
        this.f32876b = videoDuration;
        this.f32877c = str;
        this.f32878d = trackers;
        this.f32879e = companionAds;
    }
}
