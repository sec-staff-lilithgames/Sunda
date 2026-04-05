package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class p7 {

    /* renamed from: f, reason: collision with root package name */
    private static final List f15044f = Arrays.asList(MimeTypes.VIDEO_MP4, "video/webm", MimeTypes.VIDEO_H263, "video/x-matroska");

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f15045a;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f15047c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f15048d;

    /* renamed from: b, reason: collision with root package name */
    protected List f15046b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final long f15049e = System.currentTimeMillis();

    public p7(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        this.f15045a = kVar;
        this.f15047c = jSONObject;
        this.f15048d = jSONObject2;
    }

    public List a() {
        return this.f15046b;
    }

    public JSONObject b() {
        return this.f15047c;
    }

    public long c() {
        return this.f15049e;
    }

    public int d() {
        return this.f15046b.size();
    }

    public JSONObject e() {
        return this.f15048d;
    }

    public List f() {
        List<String> listExplode = CollectionUtils.explode(JsonUtils.getString(this.f15047c, "vast_preferred_video_types", null));
        return !listExplode.isEmpty() ? listExplode : f15044f;
    }

    public int g() {
        return k7.c(JsonUtils.getInt(this.f15047c, "video_completion_percent", -1));
    }
}
