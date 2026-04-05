package com.google.android.exoplayer2;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import nh.b5;
import nh.m5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public UUID f27626a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f27627b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27629d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27630e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27631f;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f27633h;

    /* renamed from: c, reason: collision with root package name */
    public m5 f27628c = m5.of();

    /* renamed from: g, reason: collision with root package name */
    public b5 f27632g = b5.of();

    public l1(UUID uuid) {
        this.f27626a = uuid;
    }

    public m1 build() {
        return new m1(this);
    }

    @Deprecated
    public l1 forceSessionsForAudioAndVideoTracks(boolean z10) {
        return setForceSessionsForAudioAndVideoTracks(z10);
    }

    public l1 setForceDefaultLicenseUri(boolean z10) {
        this.f27631f = z10;
        return this;
    }

    public l1 setForceSessionsForAudioAndVideoTracks(boolean z10) {
        setForcedSessionTrackTypes(z10 ? b5.of(2, 1) : b5.of());
        return this;
    }

    public l1 setForcedSessionTrackTypes(List<Integer> list) {
        this.f27632g = b5.copyOf((Collection) list);
        return this;
    }

    public l1 setKeySetId(byte[] bArr) {
        this.f27633h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        return this;
    }

    public l1 setLicenseRequestHeaders(Map<String, String> map) {
        this.f27628c = m5.copyOf((Map) map);
        return this;
    }

    public l1 setLicenseUri(Uri uri) {
        this.f27627b = uri;
        return this;
    }

    public l1 setMultiSession(boolean z10) {
        this.f27629d = z10;
        return this;
    }

    public l1 setPlayClearContentWithoutKey(boolean z10) {
        this.f27630e = z10;
        return this;
    }

    public l1 setScheme(UUID uuid) {
        this.f27626a = uuid;
        return this;
    }

    public l1 setLicenseUri(String str) {
        this.f27627b = str == null ? null : Uri.parse(str);
        return this;
    }

    public l1() {
    }
}
