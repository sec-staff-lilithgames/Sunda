package gn;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import nh.b5;
import nh.m5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public UUID f57884a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f57885b;

    /* renamed from: c, reason: collision with root package name */
    public m5 f57886c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f57887d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f57888e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f57889f;

    /* renamed from: g, reason: collision with root package name */
    public b5 f57890g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f57891h;

    public g0(UUID uuid) {
        this();
        this.f57884a = uuid;
    }

    public h0 build() {
        return new h0(this);
    }

    @Deprecated
    public g0 forceSessionsForAudioAndVideoTracks(boolean z10) {
        return setForceSessionsForAudioAndVideoTracks(z10);
    }

    public g0 setForceDefaultLicenseUri(boolean z10) {
        this.f57889f = z10;
        return this;
    }

    public g0 setForceSessionsForAudioAndVideoTracks(boolean z10) {
        setForcedSessionTrackTypes(z10 ? b5.of(2, 1) : b5.of());
        return this;
    }

    public g0 setForcedSessionTrackTypes(List<Integer> list) {
        this.f57890g = b5.copyOf((Collection) list);
        return this;
    }

    public g0 setKeySetId(byte[] bArr) {
        this.f57891h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        return this;
    }

    public g0 setLicenseRequestHeaders(Map<String, String> map) {
        this.f57886c = m5.copyOf((Map) map);
        return this;
    }

    public g0 setLicenseUri(Uri uri) {
        this.f57885b = uri;
        return this;
    }

    public g0 setMultiSession(boolean z10) {
        this.f57887d = z10;
        return this;
    }

    public g0 setPlayClearContentWithoutKey(boolean z10) {
        this.f57888e = z10;
        return this;
    }

    public g0 setScheme(UUID uuid) {
        this.f57884a = uuid;
        return this;
    }

    public g0 setLicenseUri(String str) {
        this.f57885b = str == null ? null : Uri.parse(str);
        return this;
    }

    public g0() {
        this.f57886c = m5.of();
        this.f57888e = true;
        this.f57890g = b5.of();
    }
}
