package com.google.android.exoplayer2;

import android.net.Uri;
import com.google.android.exoplayer2.n1;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import nh.b5;
import nh.m5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public String f27502a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f27503b;

    /* renamed from: c, reason: collision with root package name */
    public String f27504c;

    /* renamed from: g, reason: collision with root package name */
    public String f27508g;

    /* renamed from: i, reason: collision with root package name */
    public g1 f27510i;

    /* renamed from: j, reason: collision with root package name */
    public Object f27511j;

    /* renamed from: k, reason: collision with root package name */
    public w1 f27512k;

    /* renamed from: d, reason: collision with root package name */
    public i1 f27505d = new i1();

    /* renamed from: e, reason: collision with root package name */
    public l1 f27506e = new l1();

    /* renamed from: f, reason: collision with root package name */
    public List f27507f = Collections.EMPTY_LIST;

    /* renamed from: h, reason: collision with root package name */
    public b5 f27509h = b5.of();

    /* renamed from: l, reason: collision with root package name */
    public n1.a f27513l = new n1.a();

    /* renamed from: m, reason: collision with root package name */
    public q1 f27514m = q1.f27924f;

    public u1 build() {
        o1 o1Var;
        l1 l1Var = this.f27506e;
        com.google.android.exoplayer2.util.a.checkState(l1Var.f27627b == null || l1Var.f27626a != null);
        Uri uri = this.f27503b;
        if (uri != null) {
            String str = this.f27504c;
            l1 l1Var2 = this.f27506e;
            o1Var = new o1(uri, str, l1Var2.f27626a != null ? l1Var2.build() : null, this.f27510i, this.f27507f, this.f27508g, this.f27509h, this.f27511j);
        } else {
            o1Var = null;
        }
        String str2 = this.f27502a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        k1 k1VarBuildClippingProperties = this.f27505d.buildClippingProperties();
        n1 n1VarBuild = this.f27513l.build();
        w1 w1Var = this.f27512k;
        if (w1Var == null) {
            w1Var = w1.K;
        }
        return new u1(str3, k1VarBuildClippingProperties, o1Var, n1VarBuild, w1Var, this.f27514m);
    }

    @Deprecated
    public h1 setAdTagUri(String str) {
        return setAdTagUri(str != null ? Uri.parse(str) : null);
    }

    public h1 setAdsConfiguration(g1 g1Var) {
        this.f27510i = g1Var;
        return this;
    }

    @Deprecated
    public h1 setClipEndPositionMs(long j10) {
        this.f27505d.setEndPositionMs(j10);
        return this;
    }

    @Deprecated
    public h1 setClipRelativeToDefaultPosition(boolean z10) {
        this.f27505d.setRelativeToDefaultPosition(z10);
        return this;
    }

    @Deprecated
    public h1 setClipRelativeToLiveWindow(boolean z10) {
        this.f27505d.setRelativeToLiveWindow(z10);
        return this;
    }

    @Deprecated
    public h1 setClipStartPositionMs(long j10) {
        this.f27505d.setStartPositionMs(j10);
        return this;
    }

    @Deprecated
    public h1 setClipStartsAtKeyFrame(boolean z10) {
        this.f27505d.setStartsAtKeyFrame(z10);
        return this;
    }

    public h1 setClippingConfiguration(j1 j1Var) {
        this.f27505d = j1Var.buildUpon();
        return this;
    }

    public h1 setCustomCacheKey(String str) {
        this.f27508g = str;
        return this;
    }

    public h1 setDrmConfiguration(m1 m1Var) {
        this.f27506e = m1Var != null ? m1Var.buildUpon() : new l1();
        return this;
    }

    @Deprecated
    public h1 setDrmForceDefaultLicenseUri(boolean z10) {
        this.f27506e.setForceDefaultLicenseUri(z10);
        return this;
    }

    @Deprecated
    public h1 setDrmKeySetId(byte[] bArr) {
        this.f27506e.setKeySetId(bArr);
        return this;
    }

    @Deprecated
    public h1 setDrmLicenseRequestHeaders(Map<String, String> map) {
        l1 l1Var = this.f27506e;
        if (map == null) {
            map = m5.of();
        }
        l1Var.setLicenseRequestHeaders(map);
        return this;
    }

    @Deprecated
    public h1 setDrmLicenseUri(Uri uri) {
        this.f27506e.setLicenseUri(uri);
        return this;
    }

    @Deprecated
    public h1 setDrmMultiSession(boolean z10) {
        this.f27506e.setMultiSession(z10);
        return this;
    }

    @Deprecated
    public h1 setDrmPlayClearContentWithoutKey(boolean z10) {
        this.f27506e.setPlayClearContentWithoutKey(z10);
        return this;
    }

    @Deprecated
    public h1 setDrmSessionForClearPeriods(boolean z10) {
        this.f27506e.setForceSessionsForAudioAndVideoTracks(z10);
        return this;
    }

    @Deprecated
    public h1 setDrmSessionForClearTypes(List<Integer> list) {
        l1 l1Var = this.f27506e;
        if (list == null) {
            list = b5.of();
        }
        l1Var.setForcedSessionTrackTypes(list);
        return this;
    }

    @Deprecated
    public h1 setDrmUuid(UUID uuid) {
        this.f27506e.f27626a = uuid;
        return this;
    }

    public h1 setLiveConfiguration(n1 n1Var) {
        this.f27513l = n1Var.buildUpon();
        return this;
    }

    @Deprecated
    public h1 setLiveMaxOffsetMs(long j10) {
        this.f27513l.setMaxOffsetMs(j10);
        return this;
    }

    @Deprecated
    public h1 setLiveMaxPlaybackSpeed(float f10) {
        this.f27513l.setMaxPlaybackSpeed(f10);
        return this;
    }

    @Deprecated
    public h1 setLiveMinOffsetMs(long j10) {
        this.f27513l.setMinOffsetMs(j10);
        return this;
    }

    @Deprecated
    public h1 setLiveMinPlaybackSpeed(float f10) {
        this.f27513l.setMinPlaybackSpeed(f10);
        return this;
    }

    @Deprecated
    public h1 setLiveTargetOffsetMs(long j10) {
        this.f27513l.setTargetOffsetMs(j10);
        return this;
    }

    public h1 setMediaId(String str) {
        this.f27502a = (String) com.google.android.exoplayer2.util.a.checkNotNull(str);
        return this;
    }

    public h1 setMediaMetadata(w1 w1Var) {
        this.f27512k = w1Var;
        return this;
    }

    public h1 setMimeType(String str) {
        this.f27504c = str;
        return this;
    }

    public h1 setRequestMetadata(q1 q1Var) {
        this.f27514m = q1Var;
        return this;
    }

    public h1 setStreamKeys(List<StreamKey> list) {
        this.f27507f = (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list));
        return this;
    }

    public h1 setSubtitleConfigurations(List<t1> list) {
        this.f27509h = b5.copyOf((Collection) list);
        return this;
    }

    @Deprecated
    public h1 setSubtitles(List<r1> list) {
        this.f27509h = list != null ? b5.copyOf((Collection) list) : b5.of();
        return this;
    }

    public h1 setTag(Object obj) {
        this.f27511j = obj;
        return this;
    }

    public h1 setUri(String str) {
        return setUri(str == null ? null : Uri.parse(str));
    }

    @Deprecated
    public h1 setAdTagUri(Uri uri) {
        return setAdTagUri(uri, null);
    }

    @Deprecated
    public h1 setDrmLicenseUri(String str) {
        this.f27506e.setLicenseUri(str);
        return this;
    }

    public h1 setUri(Uri uri) {
        this.f27503b = uri;
        return this;
    }

    @Deprecated
    public h1 setAdTagUri(Uri uri, Object obj) {
        this.f27510i = uri != null ? new f1(uri).setAdsId(obj).build() : null;
        return this;
    }
}
