package gn;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.i0;
import io.bidmachine.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import nh.b5;
import nh.m5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public String f57830a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f57831b;

    /* renamed from: c, reason: collision with root package name */
    public String f57832c;

    /* renamed from: g, reason: collision with root package name */
    public String f57836g;

    /* renamed from: i, reason: collision with root package name */
    public b0 f57838i;

    /* renamed from: j, reason: collision with root package name */
    public Object f57839j;

    /* renamed from: l, reason: collision with root package name */
    public s0 f57841l;

    /* renamed from: d, reason: collision with root package name */
    public d0 f57833d = new d0();

    /* renamed from: e, reason: collision with root package name */
    public g0 f57834e = new g0();

    /* renamed from: f, reason: collision with root package name */
    public List f57835f = Collections.EMPTY_LIST;

    /* renamed from: h, reason: collision with root package name */
    public b5 f57837h = b5.of();

    /* renamed from: m, reason: collision with root package name */
    public i0.a f57842m = new i0.a();

    /* renamed from: n, reason: collision with root package name */
    public l0 f57843n = l0.f57989d;

    /* renamed from: k, reason: collision with root package name */
    public long f57840k = C.TIME_UNSET;

    public p0 build() {
        j0 j0Var;
        g0 g0Var = this.f57834e;
        io.bidmachine.media3.common.util.a.checkState(g0Var.f57885b == null || g0Var.f57884a != null);
        Uri uri = this.f57831b;
        if (uri != null) {
            String str = this.f57832c;
            g0 g0Var2 = this.f57834e;
            j0Var = new j0(uri, str, g0Var2.f57884a != null ? g0Var2.build() : null, this.f57838i, this.f57835f, this.f57836g, this.f57837h, this.f57839j, this.f57840k);
        } else {
            j0Var = null;
        }
        String str2 = this.f57830a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        f0 f0VarBuildClippingProperties = this.f57833d.buildClippingProperties();
        i0 i0VarBuild = this.f57842m.build();
        s0 s0Var = this.f57841l;
        if (s0Var == null) {
            s0Var = s0.K;
        }
        return new p0(str3, f0VarBuildClippingProperties, j0Var, i0VarBuild, s0Var, this.f57843n);
    }

    @Deprecated
    public c0 setAdTagUri(String str) {
        return setAdTagUri(str != null ? Uri.parse(str) : null);
    }

    public c0 setAdsConfiguration(b0 b0Var) {
        this.f57838i = b0Var;
        return this;
    }

    @Deprecated
    public c0 setClipEndPositionMs(long j10) {
        this.f57833d.setEndPositionMs(j10);
        return this;
    }

    @Deprecated
    public c0 setClipRelativeToDefaultPosition(boolean z10) {
        this.f57833d.setRelativeToDefaultPosition(z10);
        return this;
    }

    @Deprecated
    public c0 setClipRelativeToLiveWindow(boolean z10) {
        this.f57833d.setRelativeToLiveWindow(z10);
        return this;
    }

    @Deprecated
    public c0 setClipStartPositionMs(long j10) {
        this.f57833d.setStartPositionMs(j10);
        return this;
    }

    @Deprecated
    public c0 setClipStartsAtKeyFrame(boolean z10) {
        this.f57833d.setStartsAtKeyFrame(z10);
        return this;
    }

    public c0 setClippingConfiguration(e0 e0Var) {
        this.f57833d = e0Var.buildUpon();
        return this;
    }

    public c0 setCustomCacheKey(String str) {
        this.f57836g = str;
        return this;
    }

    public c0 setDrmConfiguration(h0 h0Var) {
        this.f57834e = h0Var != null ? h0Var.buildUpon() : new g0();
        return this;
    }

    @Deprecated
    public c0 setDrmForceDefaultLicenseUri(boolean z10) {
        this.f57834e.setForceDefaultLicenseUri(z10);
        return this;
    }

    @Deprecated
    public c0 setDrmKeySetId(byte[] bArr) {
        this.f57834e.setKeySetId(bArr);
        return this;
    }

    @Deprecated
    public c0 setDrmLicenseRequestHeaders(Map<String, String> map) {
        g0 g0Var = this.f57834e;
        if (map == null) {
            map = m5.of();
        }
        g0Var.setLicenseRequestHeaders(map);
        return this;
    }

    @Deprecated
    public c0 setDrmLicenseUri(Uri uri) {
        this.f57834e.setLicenseUri(uri);
        return this;
    }

    @Deprecated
    public c0 setDrmMultiSession(boolean z10) {
        this.f57834e.setMultiSession(z10);
        return this;
    }

    @Deprecated
    public c0 setDrmPlayClearContentWithoutKey(boolean z10) {
        this.f57834e.setPlayClearContentWithoutKey(z10);
        return this;
    }

    @Deprecated
    public c0 setDrmSessionForClearPeriods(boolean z10) {
        this.f57834e.setForceSessionsForAudioAndVideoTracks(z10);
        return this;
    }

    @Deprecated
    public c0 setDrmSessionForClearTypes(List<Integer> list) {
        g0 g0Var = this.f57834e;
        if (list == null) {
            list = b5.of();
        }
        g0Var.setForcedSessionTrackTypes(list);
        return this;
    }

    @Deprecated
    public c0 setDrmUuid(UUID uuid) {
        this.f57834e.f57884a = uuid;
        return this;
    }

    public c0 setImageDurationMs(long j10) {
        io.bidmachine.media3.common.util.a.checkArgument(j10 > 0 || j10 == C.TIME_UNSET);
        this.f57840k = j10;
        return this;
    }

    public c0 setLiveConfiguration(i0 i0Var) {
        this.f57842m = i0Var.buildUpon();
        return this;
    }

    @Deprecated
    public c0 setLiveMaxOffsetMs(long j10) {
        this.f57842m.setMaxOffsetMs(j10);
        return this;
    }

    @Deprecated
    public c0 setLiveMaxPlaybackSpeed(float f10) {
        this.f57842m.setMaxPlaybackSpeed(f10);
        return this;
    }

    @Deprecated
    public c0 setLiveMinOffsetMs(long j10) {
        this.f57842m.setMinOffsetMs(j10);
        return this;
    }

    @Deprecated
    public c0 setLiveMinPlaybackSpeed(float f10) {
        this.f57842m.setMinPlaybackSpeed(f10);
        return this;
    }

    @Deprecated
    public c0 setLiveTargetOffsetMs(long j10) {
        this.f57842m.setTargetOffsetMs(j10);
        return this;
    }

    public c0 setMediaId(String str) {
        this.f57830a = (String) io.bidmachine.media3.common.util.a.checkNotNull(str);
        return this;
    }

    public c0 setMediaMetadata(s0 s0Var) {
        this.f57841l = s0Var;
        return this;
    }

    public c0 setMimeType(String str) {
        this.f57832c = str;
        return this;
    }

    public c0 setRequestMetadata(l0 l0Var) {
        this.f57843n = l0Var;
        return this;
    }

    public c0 setStreamKeys(List<StreamKey> list) {
        this.f57835f = (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list));
        return this;
    }

    public c0 setSubtitleConfigurations(List<o0> list) {
        this.f57837h = b5.copyOf((Collection) list);
        return this;
    }

    @Deprecated
    public c0 setSubtitles(List<m0> list) {
        this.f57837h = list != null ? b5.copyOf((Collection) list) : b5.of();
        return this;
    }

    public c0 setTag(Object obj) {
        this.f57839j = obj;
        return this;
    }

    public c0 setUri(String str) {
        return setUri(str == null ? null : Uri.parse(str));
    }

    @Deprecated
    public c0 setAdTagUri(Uri uri) {
        return setAdTagUri(uri, null);
    }

    @Deprecated
    public c0 setDrmLicenseUri(String str) {
        this.f57834e.setLicenseUri(str);
        return this;
    }

    public c0 setUri(Uri uri) {
        this.f57831b = uri;
        return this;
    }

    @Deprecated
    public c0 setAdTagUri(Uri uri, Object obj) {
        this.f57838i = uri != null ? new a0(uri).setAdsId(obj).build() : null;
        return this;
    }
}
