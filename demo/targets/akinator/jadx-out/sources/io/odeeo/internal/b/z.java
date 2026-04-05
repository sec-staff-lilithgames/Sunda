package io.odeeo.internal.b;

import android.net.Uri;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.g;
import io.odeeo.internal.u0.h1;
import io.odeeo.internal.u0.j1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z implements io.odeeo.internal.b.g {

    /* renamed from: h, reason: collision with root package name */
    public static final z f63107h = new c().build();

    /* renamed from: i, reason: collision with root package name */
    public static final g.a<z> f63108i = new is.b(12);

    /* renamed from: a, reason: collision with root package name */
    public final String f63109a;

    /* renamed from: b, reason: collision with root package name */
    public final h f63110b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final i f63111c;

    /* renamed from: d, reason: collision with root package name */
    public final g f63112d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f63113e;

    /* renamed from: f, reason: collision with root package name */
    public final d f63114f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public final e f63115g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f63116a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f63117b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public Uri f63118a;

            /* renamed from: b, reason: collision with root package name */
            public Object f63119b;

            public a(Uri uri) {
                this.f63118a = uri;
            }

            public b build() {
                return new b(this);
            }

            public a setAdTagUri(Uri uri) {
                this.f63118a = uri;
                return this;
            }

            public a setAdsId(Object obj) {
                this.f63119b = obj;
                return this;
            }
        }

        public a buildUpon() {
            return new a(this.f63116a).setAdsId(this.f63117b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f63116a.equals(bVar.f63116a) && io.odeeo.internal.q0.g0.areEqual(this.f63117b, bVar.f63117b);
        }

        public int hashCode() {
            int iHashCode = this.f63116a.hashCode() * 31;
            Object obj = this.f63117b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        public b(a aVar) {
            this.f63116a = aVar.f63118a;
            this.f63117b = aVar.f63119b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public String f63120a;

        /* renamed from: b, reason: collision with root package name */
        public Uri f63121b;

        /* renamed from: c, reason: collision with root package name */
        public String f63122c;

        /* renamed from: d, reason: collision with root package name */
        public d.a f63123d;

        /* renamed from: e, reason: collision with root package name */
        public f.a f63124e;

        /* renamed from: f, reason: collision with root package name */
        public List<Object> f63125f;

        /* renamed from: g, reason: collision with root package name */
        public String f63126g;

        /* renamed from: h, reason: collision with root package name */
        public h1<k> f63127h;

        /* renamed from: i, reason: collision with root package name */
        public b f63128i;

        /* renamed from: j, reason: collision with root package name */
        public Object f63129j;

        /* renamed from: k, reason: collision with root package name */
        public a0 f63130k;

        /* renamed from: l, reason: collision with root package name */
        public g.a f63131l;

        public z build() {
            i iVar;
            io.odeeo.internal.q0.a.checkState(this.f63124e.f63157b == null || this.f63124e.f63156a != null);
            Uri uri = this.f63121b;
            if (uri != null) {
                iVar = new i(uri, this.f63122c, this.f63124e.f63156a != null ? this.f63124e.build() : null, this.f63128i, this.f63125f, this.f63126g, this.f63127h, this.f63129j);
            } else {
                iVar = null;
            }
            String str = this.f63120a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarBuildClippingProperties = this.f63123d.buildClippingProperties();
            g gVarBuild = this.f63131l.build();
            a0 a0Var = this.f63130k;
            if (a0Var == null) {
                a0Var = a0.H;
            }
            return new z(str2, eVarBuildClippingProperties, iVar, gVarBuild, a0Var);
        }

        @Deprecated
        public c setAdTagUri(String str) {
            return setAdTagUri(str != null ? Uri.parse(str) : null);
        }

        public c setAdsConfiguration(b bVar) {
            this.f63128i = bVar;
            return this;
        }

        @Deprecated
        public c setClipEndPositionMs(long j10) {
            this.f63123d.setEndPositionMs(j10);
            return this;
        }

        @Deprecated
        public c setClipRelativeToDefaultPosition(boolean z10) {
            this.f63123d.setRelativeToDefaultPosition(z10);
            return this;
        }

        @Deprecated
        public c setClipRelativeToLiveWindow(boolean z10) {
            this.f63123d.setRelativeToLiveWindow(z10);
            return this;
        }

        @Deprecated
        public c setClipStartPositionMs(long j10) {
            this.f63123d.setStartPositionMs(j10);
            return this;
        }

        @Deprecated
        public c setClipStartsAtKeyFrame(boolean z10) {
            this.f63123d.setStartsAtKeyFrame(z10);
            return this;
        }

        public c setClippingConfiguration(d dVar) {
            this.f63123d = dVar.buildUpon();
            return this;
        }

        public c setCustomCacheKey(String str) {
            this.f63126g = str;
            return this;
        }

        public c setDrmConfiguration(f fVar) {
            this.f63124e = fVar != null ? fVar.buildUpon() : new f.a();
            return this;
        }

        @Deprecated
        public c setDrmForceDefaultLicenseUri(boolean z10) {
            this.f63124e.setForceDefaultLicenseUri(z10);
            return this;
        }

        @Deprecated
        public c setDrmKeySetId(byte[] bArr) {
            this.f63124e.setKeySetId(bArr);
            return this;
        }

        @Deprecated
        public c setDrmLicenseRequestHeaders(Map<String, String> map) {
            f.a aVar = this.f63124e;
            if (map == null) {
                map = j1.of();
            }
            aVar.setLicenseRequestHeaders(map);
            return this;
        }

        @Deprecated
        public c setDrmLicenseUri(Uri uri) {
            this.f63124e.setLicenseUri(uri);
            return this;
        }

        @Deprecated
        public c setDrmMultiSession(boolean z10) {
            this.f63124e.setMultiSession(z10);
            return this;
        }

        @Deprecated
        public c setDrmPlayClearContentWithoutKey(boolean z10) {
            this.f63124e.setPlayClearContentWithoutKey(z10);
            return this;
        }

        @Deprecated
        public c setDrmSessionForClearPeriods(boolean z10) {
            this.f63124e.forceSessionsForAudioAndVideoTracks(z10);
            return this;
        }

        @Deprecated
        public c setDrmSessionForClearTypes(List<Integer> list) {
            f.a aVar = this.f63124e;
            if (list == null) {
                list = h1.of();
            }
            aVar.setForcedSessionTrackTypes(list);
            return this;
        }

        @Deprecated
        public c setDrmUuid(UUID uuid) {
            this.f63124e.a(uuid);
            return this;
        }

        public c setLiveConfiguration(g gVar) {
            this.f63131l = gVar.buildUpon();
            return this;
        }

        @Deprecated
        public c setLiveMaxOffsetMs(long j10) {
            this.f63131l.setMaxOffsetMs(j10);
            return this;
        }

        @Deprecated
        public c setLiveMaxPlaybackSpeed(float f10) {
            this.f63131l.setMaxPlaybackSpeed(f10);
            return this;
        }

        @Deprecated
        public c setLiveMinOffsetMs(long j10) {
            this.f63131l.setMinOffsetMs(j10);
            return this;
        }

        @Deprecated
        public c setLiveMinPlaybackSpeed(float f10) {
            this.f63131l.setMinPlaybackSpeed(f10);
            return this;
        }

        @Deprecated
        public c setLiveTargetOffsetMs(long j10) {
            this.f63131l.setTargetOffsetMs(j10);
            return this;
        }

        public c setMediaId(String str) {
            this.f63120a = (String) io.odeeo.internal.q0.a.checkNotNull(str);
            return this;
        }

        public c setMediaMetadata(a0 a0Var) {
            this.f63130k = a0Var;
            return this;
        }

        public c setMimeType(String str) {
            this.f63122c = str;
            return this;
        }

        public c setStreamKeys(List<Object> list) {
            this.f63125f = (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        public c setSubtitleConfigurations(List<k> list) {
            this.f63127h = h1.copyOf((Collection) list);
            return this;
        }

        @Deprecated
        public c setSubtitles(List<j> list) {
            this.f63127h = list != null ? h1.copyOf((Collection) list) : h1.of();
            return this;
        }

        public c setTag(Object obj) {
            this.f63129j = obj;
            return this;
        }

        public c setUri(String str) {
            return setUri(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.f63123d = new d.a();
            this.f63124e = new f.a();
            this.f63125f = Collections.EMPTY_LIST;
            this.f63127h = h1.of();
            this.f63131l = new g.a();
        }

        @Deprecated
        public c setAdTagUri(Uri uri) {
            return setAdTagUri(uri, null);
        }

        @Deprecated
        public c setDrmLicenseUri(String str) {
            this.f63124e.setLicenseUri(str);
            return this;
        }

        public c setUri(Uri uri) {
            this.f63121b = uri;
            return this;
        }

        @Deprecated
        public c setAdTagUri(Uri uri, Object obj) {
            this.f63128i = uri != null ? new b.a(uri).setAdsId(obj).build() : null;
            return this;
        }

        public c(z zVar) {
            f.a aVar;
            this();
            this.f63123d = zVar.f63114f.buildUpon();
            this.f63120a = zVar.f63109a;
            this.f63130k = zVar.f63113e;
            this.f63131l = zVar.f63112d.buildUpon();
            h hVar = zVar.f63110b;
            if (hVar != null) {
                this.f63126g = hVar.f63181f;
                this.f63122c = hVar.f63177b;
                this.f63121b = hVar.f63176a;
                this.f63125f = hVar.f63180e;
                this.f63127h = hVar.f63182g;
                this.f63129j = hVar.f63184i;
                f fVar = hVar.f63178c;
                if (fVar != null) {
                    aVar = fVar.buildUpon();
                } else {
                    aVar = new f.a();
                }
                this.f63124e = aVar;
                this.f63128i = hVar.f63179d;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d implements io.odeeo.internal.b.g {

        /* renamed from: f, reason: collision with root package name */
        public static final d f63132f = new a().build();

        /* renamed from: g, reason: collision with root package name */
        public static final g.a<e> f63133g = new is.b(13);

        /* renamed from: a, reason: collision with root package name */
        public final long f63134a;

        /* renamed from: b, reason: collision with root package name */
        public final long f63135b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f63136c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f63137d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f63138e;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public long f63139a;

            /* renamed from: b, reason: collision with root package name */
            public long f63140b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f63141c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f63142d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f63143e;

            public d build() {
                return buildClippingProperties();
            }

            @Deprecated
            public e buildClippingProperties() {
                return new e(this);
            }

            public a setEndPositionMs(long j10) {
                io.odeeo.internal.q0.a.checkArgument(j10 == Long.MIN_VALUE || j10 >= 0);
                this.f63140b = j10;
                return this;
            }

            public a setRelativeToDefaultPosition(boolean z10) {
                this.f63142d = z10;
                return this;
            }

            public a setRelativeToLiveWindow(boolean z10) {
                this.f63141c = z10;
                return this;
            }

            public a setStartPositionMs(long j10) {
                io.odeeo.internal.q0.a.checkArgument(j10 >= 0);
                this.f63139a = j10;
                return this;
            }

            public a setStartsAtKeyFrame(boolean z10) {
                this.f63143e = z10;
                return this;
            }

            public a() {
                this.f63140b = Long.MIN_VALUE;
            }

            public a(d dVar) {
                this.f63139a = dVar.f63134a;
                this.f63140b = dVar.f63135b;
                this.f63141c = dVar.f63136c;
                this.f63142d = dVar.f63137d;
                this.f63143e = dVar.f63138e;
            }
        }

        public a buildUpon() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f63134a == dVar.f63134a && this.f63135b == dVar.f63135b && this.f63136c == dVar.f63136c && this.f63137d == dVar.f63137d && this.f63138e == dVar.f63138e;
        }

        public int hashCode() {
            long j10 = this.f63134a;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f63135b;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f63136c ? 1 : 0)) * 31) + (this.f63137d ? 1 : 0)) * 31) + (this.f63138e ? 1 : 0);
        }

        @Override // io.odeeo.internal.b.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(a(0), this.f63134a);
            bundle.putLong(a(1), this.f63135b);
            bundle.putBoolean(a(2), this.f63136c);
            bundle.putBoolean(a(3), this.f63137d);
            bundle.putBoolean(a(4), this.f63138e);
            return bundle;
        }

        public d(a aVar) {
            this.f63134a = aVar.f63139a;
            this.f63135b = aVar.f63140b;
            this.f63136c = aVar.f63141c;
            this.f63137d = aVar.f63142d;
            this.f63138e = aVar.f63143e;
        }

        public static String a(int i10) {
            return Integer.toString(i10, 36);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Deprecated
    public static final class e extends d {

        /* renamed from: h, reason: collision with root package name */
        public static final e f63144h = new d.a().buildClippingProperties();

        public e(d.a aVar) {
            super(aVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f63145a;

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public final UUID f63146b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f63147c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public final j1<String, String> f63148d;

        /* renamed from: e, reason: collision with root package name */
        public final j1<String, String> f63149e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f63150f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f63151g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f63152h;

        /* renamed from: i, reason: collision with root package name */
        @Deprecated
        public final h1<Integer> f63153i;

        /* renamed from: j, reason: collision with root package name */
        public final h1<Integer> f63154j;

        /* renamed from: k, reason: collision with root package name */
        public final byte[] f63155k;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public UUID f63156a;

            /* renamed from: b, reason: collision with root package name */
            public Uri f63157b;

            /* renamed from: c, reason: collision with root package name */
            public j1<String, String> f63158c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f63159d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f63160e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f63161f;

            /* renamed from: g, reason: collision with root package name */
            public h1<Integer> f63162g;

            /* renamed from: h, reason: collision with root package name */
            public byte[] f63163h;

            public f build() {
                return new f(this);
            }

            public a forceSessionsForAudioAndVideoTracks(boolean z10) {
                setForcedSessionTrackTypes(z10 ? h1.of(2, 1) : h1.of());
                return this;
            }

            public a setForceDefaultLicenseUri(boolean z10) {
                this.f63161f = z10;
                return this;
            }

            public a setForcedSessionTrackTypes(List<Integer> list) {
                this.f63162g = h1.copyOf((Collection) list);
                return this;
            }

            public a setKeySetId(byte[] bArr) {
                this.f63163h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            public a setLicenseRequestHeaders(Map<String, String> map) {
                this.f63158c = j1.copyOf((Map) map);
                return this;
            }

            public a setLicenseUri(Uri uri) {
                this.f63157b = uri;
                return this;
            }

            public a setMultiSession(boolean z10) {
                this.f63159d = z10;
                return this;
            }

            public a setPlayClearContentWithoutKey(boolean z10) {
                this.f63160e = z10;
                return this;
            }

            public a setScheme(UUID uuid) {
                this.f63156a = uuid;
                return this;
            }

            public a setLicenseUri(String str) {
                this.f63157b = str == null ? null : Uri.parse(str);
                return this;
            }

            public a(UUID uuid) {
                this.f63156a = uuid;
                this.f63158c = j1.of();
                this.f63162g = h1.of();
            }

            @Deprecated
            public final a a(UUID uuid) {
                this.f63156a = uuid;
                return this;
            }

            @Deprecated
            public a() {
                this.f63158c = j1.of();
                this.f63162g = h1.of();
            }

            public a(f fVar) {
                this.f63156a = fVar.f63145a;
                this.f63157b = fVar.f63147c;
                this.f63158c = fVar.f63149e;
                this.f63159d = fVar.f63150f;
                this.f63160e = fVar.f63151g;
                this.f63161f = fVar.f63152h;
                this.f63162g = fVar.f63154j;
                this.f63163h = fVar.f63155k;
            }
        }

        public a buildUpon() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f63145a.equals(fVar.f63145a) && io.odeeo.internal.q0.g0.areEqual(this.f63147c, fVar.f63147c) && io.odeeo.internal.q0.g0.areEqual(this.f63149e, fVar.f63149e) && this.f63150f == fVar.f63150f && this.f63152h == fVar.f63152h && this.f63151g == fVar.f63151g && this.f63154j.equals(fVar.f63154j) && Arrays.equals(this.f63155k, fVar.f63155k);
        }

        public byte[] getKeySetId() {
            byte[] bArr = this.f63155k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public int hashCode() {
            int iHashCode = this.f63145a.hashCode() * 31;
            Uri uri = this.f63147c;
            return Arrays.hashCode(this.f63155k) + ((this.f63154j.hashCode() + ((((((((this.f63149e.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f63150f ? 1 : 0)) * 31) + (this.f63152h ? 1 : 0)) * 31) + (this.f63151g ? 1 : 0)) * 31)) * 31);
        }

        public f(a aVar) {
            io.odeeo.internal.q0.a.checkState((aVar.f63161f && aVar.f63157b == null) ? false : true);
            UUID uuid = (UUID) io.odeeo.internal.q0.a.checkNotNull(aVar.f63156a);
            this.f63145a = uuid;
            this.f63146b = uuid;
            this.f63147c = aVar.f63157b;
            this.f63148d = aVar.f63158c;
            this.f63149e = aVar.f63158c;
            this.f63150f = aVar.f63159d;
            this.f63152h = aVar.f63161f;
            this.f63151g = aVar.f63160e;
            this.f63153i = aVar.f63162g;
            this.f63154j = aVar.f63162g;
            this.f63155k = aVar.f63163h != null ? Arrays.copyOf(aVar.f63163h, aVar.f63163h.length) : null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g implements io.odeeo.internal.b.g {

        /* renamed from: f, reason: collision with root package name */
        public static final g f63164f = new a().build();

        /* renamed from: g, reason: collision with root package name */
        public static final g.a<g> f63165g = new is.b(14);

        /* renamed from: a, reason: collision with root package name */
        public final long f63166a;

        /* renamed from: b, reason: collision with root package name */
        public final long f63167b;

        /* renamed from: c, reason: collision with root package name */
        public final long f63168c;

        /* renamed from: d, reason: collision with root package name */
        public final float f63169d;

        /* renamed from: e, reason: collision with root package name */
        public final float f63170e;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public long f63171a;

            /* renamed from: b, reason: collision with root package name */
            public long f63172b;

            /* renamed from: c, reason: collision with root package name */
            public long f63173c;

            /* renamed from: d, reason: collision with root package name */
            public float f63174d;

            /* renamed from: e, reason: collision with root package name */
            public float f63175e;

            public g build() {
                return new g(this);
            }

            public a setMaxOffsetMs(long j10) {
                this.f63173c = j10;
                return this;
            }

            public a setMaxPlaybackSpeed(float f10) {
                this.f63175e = f10;
                return this;
            }

            public a setMinOffsetMs(long j10) {
                this.f63172b = j10;
                return this;
            }

            public a setMinPlaybackSpeed(float f10) {
                this.f63174d = f10;
                return this;
            }

            public a setTargetOffsetMs(long j10) {
                this.f63171a = j10;
                return this;
            }

            public a() {
                this.f63171a = C.TIME_UNSET;
                this.f63172b = C.TIME_UNSET;
                this.f63173c = C.TIME_UNSET;
                this.f63174d = -3.4028235E38f;
                this.f63175e = -3.4028235E38f;
            }

            public a(g gVar) {
                this.f63171a = gVar.f63166a;
                this.f63172b = gVar.f63167b;
                this.f63173c = gVar.f63168c;
                this.f63174d = gVar.f63169d;
                this.f63175e = gVar.f63170e;
            }
        }

        public static /* synthetic */ g a(Bundle bundle) {
            return new g(bundle.getLong(a(0), C.TIME_UNSET), bundle.getLong(a(1), C.TIME_UNSET), bundle.getLong(a(2), C.TIME_UNSET), bundle.getFloat(a(3), -3.4028235E38f), bundle.getFloat(a(4), -3.4028235E38f));
        }

        public a buildUpon() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f63166a == gVar.f63166a && this.f63167b == gVar.f63167b && this.f63168c == gVar.f63168c && this.f63169d == gVar.f63169d && this.f63170e == gVar.f63170e;
        }

        public int hashCode() {
            long j10 = this.f63166a;
            long j11 = this.f63167b;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f63168c;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f63169d;
            int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f63170e;
            return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }

        @Override // io.odeeo.internal.b.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(a(0), this.f63166a);
            bundle.putLong(a(1), this.f63167b);
            bundle.putLong(a(2), this.f63168c);
            bundle.putFloat(a(3), this.f63169d);
            bundle.putFloat(a(4), this.f63170e);
            return bundle;
        }

        public g(a aVar) {
            this(aVar.f63171a, aVar.f63172b, aVar.f63173c, aVar.f63174d, aVar.f63175e);
        }

        @Deprecated
        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f63166a = j10;
            this.f63167b = j11;
            this.f63168c = j12;
            this.f63169d = f10;
            this.f63170e = f11;
        }

        public static String a(int i10) {
            return Integer.toString(i10, 36);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f63176a;

        /* renamed from: b, reason: collision with root package name */
        public final String f63177b;

        /* renamed from: c, reason: collision with root package name */
        public final f f63178c;

        /* renamed from: d, reason: collision with root package name */
        public final b f63179d;

        /* renamed from: e, reason: collision with root package name */
        public final List<Object> f63180e;

        /* renamed from: f, reason: collision with root package name */
        public final String f63181f;

        /* renamed from: g, reason: collision with root package name */
        public final h1<k> f63182g;

        /* renamed from: h, reason: collision with root package name */
        @Deprecated
        public final List<j> f63183h;

        /* renamed from: i, reason: collision with root package name */
        public final Object f63184i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f63176a.equals(hVar.f63176a) && io.odeeo.internal.q0.g0.areEqual(this.f63177b, hVar.f63177b) && io.odeeo.internal.q0.g0.areEqual(this.f63178c, hVar.f63178c) && io.odeeo.internal.q0.g0.areEqual(this.f63179d, hVar.f63179d) && this.f63180e.equals(hVar.f63180e) && io.odeeo.internal.q0.g0.areEqual(this.f63181f, hVar.f63181f) && this.f63182g.equals(hVar.f63182g) && io.odeeo.internal.q0.g0.areEqual(this.f63184i, hVar.f63184i);
        }

        public int hashCode() {
            int iHashCode = this.f63176a.hashCode() * 31;
            String str = this.f63177b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f63178c;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            b bVar = this.f63179d;
            int iHashCode4 = (this.f63180e.hashCode() + ((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
            String str2 = this.f63181f;
            int iHashCode5 = (this.f63182g.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f63184i;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }

        public h(Uri uri, String str, f fVar, b bVar, List<Object> list, String str2, h1<k> h1Var, Object obj) {
            this.f63176a = uri;
            this.f63177b = str;
            this.f63178c = fVar;
            this.f63179d = bVar;
            this.f63180e = list;
            this.f63181f = str2;
            this.f63182g = h1Var;
            h1.a aVarBuilder = h1.builder();
            for (int i10 = 0; i10 < h1Var.size(); i10++) {
                aVarBuilder.add((h1.a) h1Var.get(i10).buildUpon().a());
            }
            this.f63183h = aVarBuilder.build();
            this.f63184i = obj;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Deprecated
    public static final class i extends h {
        public i(Uri uri, String str, f fVar, b bVar, List<Object> list, String str2, h1<k> h1Var, Object obj) {
            super(uri, str, fVar, bVar, list, str2, h1Var, obj);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Deprecated
    public static final class j extends k {
        @Deprecated
        public j(Uri uri, String str, String str2) {
            this(uri, str, str2, 0);
        }

        @Deprecated
        public j(Uri uri, String str, String str2, int i10) {
            this(uri, str, str2, i10, 0, null);
        }

        @Deprecated
        public j(Uri uri, String str, String str2, int i10, int i11, String str3) {
            super(uri, str, str2, i10, i11, str3);
        }

        public j(k.a aVar) {
            super(aVar);
        }
    }

    public static z a(Bundle bundle) {
        String str = (String) io.odeeo.internal.q0.a.checkNotNull(bundle.getString(a(0), ""));
        Bundle bundle2 = bundle.getBundle(a(1));
        g gVar = bundle2 == null ? g.f63164f : (g) g.f63165g.mo3834fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(a(2));
        a0 a0Var = bundle3 == null ? a0.H : (a0) a0.I.mo3834fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(a(3));
        return new z(str, bundle4 == null ? e.f63144h : (e) d.f63133g.mo3834fromBundle(bundle4), null, gVar, a0Var);
    }

    public static z fromUri(String str) {
        return new c().setUri(str).build();
    }

    public c buildUpon() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return io.odeeo.internal.q0.g0.areEqual(this.f63109a, zVar.f63109a) && this.f63114f.equals(zVar.f63114f) && io.odeeo.internal.q0.g0.areEqual(this.f63110b, zVar.f63110b) && io.odeeo.internal.q0.g0.areEqual(this.f63112d, zVar.f63112d) && io.odeeo.internal.q0.g0.areEqual(this.f63113e, zVar.f63113e);
    }

    public int hashCode() {
        int iHashCode = this.f63109a.hashCode() * 31;
        h hVar = this.f63110b;
        return this.f63113e.hashCode() + ((this.f63114f.hashCode() + ((this.f63112d.hashCode() + ((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @Override // io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(a(0), this.f63109a);
        bundle.putBundle(a(1), this.f63112d.toBundle());
        bundle.putBundle(a(2), this.f63113e.toBundle());
        bundle.putBundle(a(3), this.f63114f.toBundle());
        return bundle;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class k {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f63185a;

        /* renamed from: b, reason: collision with root package name */
        public final String f63186b;

        /* renamed from: c, reason: collision with root package name */
        public final String f63187c;

        /* renamed from: d, reason: collision with root package name */
        public final int f63188d;

        /* renamed from: e, reason: collision with root package name */
        public final int f63189e;

        /* renamed from: f, reason: collision with root package name */
        public final String f63190f;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public Uri f63191a;

            /* renamed from: b, reason: collision with root package name */
            public String f63192b;

            /* renamed from: c, reason: collision with root package name */
            public String f63193c;

            /* renamed from: d, reason: collision with root package name */
            public int f63194d;

            /* renamed from: e, reason: collision with root package name */
            public int f63195e;

            /* renamed from: f, reason: collision with root package name */
            public String f63196f;

            public k build() {
                return new k(this);
            }

            public a setLabel(String str) {
                this.f63196f = str;
                return this;
            }

            public a setLanguage(String str) {
                this.f63193c = str;
                return this;
            }

            public a setMimeType(String str) {
                this.f63192b = str;
                return this;
            }

            public a setRoleFlags(int i10) {
                this.f63195e = i10;
                return this;
            }

            public a setSelectionFlags(int i10) {
                this.f63194d = i10;
                return this;
            }

            public a setUri(Uri uri) {
                this.f63191a = uri;
                return this;
            }

            public a(Uri uri) {
                this.f63191a = uri;
            }

            public final j a() {
                return new j(this);
            }

            public a(k kVar) {
                this.f63191a = kVar.f63185a;
                this.f63192b = kVar.f63186b;
                this.f63193c = kVar.f63187c;
                this.f63194d = kVar.f63188d;
                this.f63195e = kVar.f63189e;
                this.f63196f = kVar.f63190f;
            }
        }

        public a buildUpon() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f63185a.equals(kVar.f63185a) && io.odeeo.internal.q0.g0.areEqual(this.f63186b, kVar.f63186b) && io.odeeo.internal.q0.g0.areEqual(this.f63187c, kVar.f63187c) && this.f63188d == kVar.f63188d && this.f63189e == kVar.f63189e && io.odeeo.internal.q0.g0.areEqual(this.f63190f, kVar.f63190f);
        }

        public int hashCode() {
            int iHashCode = this.f63185a.hashCode() * 31;
            String str = this.f63186b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f63187c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f63188d) * 31) + this.f63189e) * 31;
            String str3 = this.f63190f;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public k(Uri uri, String str, String str2, int i10, int i11, String str3) {
            this.f63185a = uri;
            this.f63186b = str;
            this.f63187c = str2;
            this.f63188d = i10;
            this.f63189e = i11;
            this.f63190f = str3;
        }

        public k(a aVar) {
            this.f63185a = aVar.f63191a;
            this.f63186b = aVar.f63192b;
            this.f63187c = aVar.f63193c;
            this.f63188d = aVar.f63194d;
            this.f63189e = aVar.f63195e;
            this.f63190f = aVar.f63196f;
        }
    }

    public z(String str, e eVar, i iVar, g gVar, a0 a0Var) {
        this.f63109a = str;
        this.f63110b = iVar;
        this.f63111c = iVar;
        this.f63112d = gVar;
        this.f63113e = a0Var;
        this.f63114f = eVar;
        this.f63115g = eVar;
    }

    public static z fromUri(Uri uri) {
        return new c().setUri(uri).build();
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
