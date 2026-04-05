package io.odeeo.internal.b;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import io.odeeo.internal.b.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t implements g {
    public static final t G = new b().build();
    public static final g.a<t> H = new is.b(5);
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public int F;

    /* renamed from: a, reason: collision with root package name */
    public final String f62960a;

    /* renamed from: b, reason: collision with root package name */
    public final String f62961b;

    /* renamed from: c, reason: collision with root package name */
    public final String f62962c;

    /* renamed from: d, reason: collision with root package name */
    public final int f62963d;

    /* renamed from: e, reason: collision with root package name */
    public final int f62964e;

    /* renamed from: f, reason: collision with root package name */
    public final int f62965f;

    /* renamed from: g, reason: collision with root package name */
    public final int f62966g;

    /* renamed from: h, reason: collision with root package name */
    public final int f62967h;

    /* renamed from: i, reason: collision with root package name */
    public final String f62968i;

    /* renamed from: j, reason: collision with root package name */
    public final io.odeeo.internal.s.a f62969j;

    /* renamed from: k, reason: collision with root package name */
    public final String f62970k;

    /* renamed from: l, reason: collision with root package name */
    public final String f62971l;

    /* renamed from: m, reason: collision with root package name */
    public final int f62972m;

    /* renamed from: n, reason: collision with root package name */
    public final List<byte[]> f62973n;

    /* renamed from: o, reason: collision with root package name */
    public final io.odeeo.internal.f.e f62974o;

    /* renamed from: p, reason: collision with root package name */
    public final long f62975p;

    /* renamed from: q, reason: collision with root package name */
    public final int f62976q;

    /* renamed from: r, reason: collision with root package name */
    public final int f62977r;

    /* renamed from: s, reason: collision with root package name */
    public final float f62978s;

    /* renamed from: t, reason: collision with root package name */
    public final int f62979t;

    /* renamed from: u, reason: collision with root package name */
    public final float f62980u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f62981v;

    /* renamed from: w, reason: collision with root package name */
    public final int f62982w;

    /* renamed from: x, reason: collision with root package name */
    public final io.odeeo.internal.r0.b f62983x;

    /* renamed from: y, reason: collision with root package name */
    public final int f62984y;

    /* renamed from: z, reason: collision with root package name */
    public final int f62985z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public int A;
        public int B;
        public int C;
        public int D;

        /* renamed from: a, reason: collision with root package name */
        public String f62986a;

        /* renamed from: b, reason: collision with root package name */
        public String f62987b;

        /* renamed from: c, reason: collision with root package name */
        public String f62988c;

        /* renamed from: d, reason: collision with root package name */
        public int f62989d;

        /* renamed from: e, reason: collision with root package name */
        public int f62990e;

        /* renamed from: f, reason: collision with root package name */
        public int f62991f;

        /* renamed from: g, reason: collision with root package name */
        public int f62992g;

        /* renamed from: h, reason: collision with root package name */
        public String f62993h;

        /* renamed from: i, reason: collision with root package name */
        public io.odeeo.internal.s.a f62994i;

        /* renamed from: j, reason: collision with root package name */
        public String f62995j;

        /* renamed from: k, reason: collision with root package name */
        public String f62996k;

        /* renamed from: l, reason: collision with root package name */
        public int f62997l;

        /* renamed from: m, reason: collision with root package name */
        public List<byte[]> f62998m;

        /* renamed from: n, reason: collision with root package name */
        public io.odeeo.internal.f.e f62999n;

        /* renamed from: o, reason: collision with root package name */
        public long f63000o;

        /* renamed from: p, reason: collision with root package name */
        public int f63001p;

        /* renamed from: q, reason: collision with root package name */
        public int f63002q;

        /* renamed from: r, reason: collision with root package name */
        public float f63003r;

        /* renamed from: s, reason: collision with root package name */
        public int f63004s;

        /* renamed from: t, reason: collision with root package name */
        public float f63005t;

        /* renamed from: u, reason: collision with root package name */
        public byte[] f63006u;

        /* renamed from: v, reason: collision with root package name */
        public int f63007v;

        /* renamed from: w, reason: collision with root package name */
        public io.odeeo.internal.r0.b f63008w;

        /* renamed from: x, reason: collision with root package name */
        public int f63009x;

        /* renamed from: y, reason: collision with root package name */
        public int f63010y;

        /* renamed from: z, reason: collision with root package name */
        public int f63011z;

        public t build() {
            return new t(this);
        }

        public b setAccessibilityChannel(int i10) {
            this.C = i10;
            return this;
        }

        public b setAverageBitrate(int i10) {
            this.f62991f = i10;
            return this;
        }

        public b setChannelCount(int i10) {
            this.f63009x = i10;
            return this;
        }

        public b setCodecs(String str) {
            this.f62993h = str;
            return this;
        }

        public b setColorInfo(io.odeeo.internal.r0.b bVar) {
            this.f63008w = bVar;
            return this;
        }

        public b setContainerMimeType(String str) {
            this.f62995j = str;
            return this;
        }

        public b setCryptoType(int i10) {
            this.D = i10;
            return this;
        }

        public b setDrmInitData(io.odeeo.internal.f.e eVar) {
            this.f62999n = eVar;
            return this;
        }

        public b setEncoderDelay(int i10) {
            this.A = i10;
            return this;
        }

        public b setEncoderPadding(int i10) {
            this.B = i10;
            return this;
        }

        public b setFrameRate(float f10) {
            this.f63003r = f10;
            return this;
        }

        public b setHeight(int i10) {
            this.f63002q = i10;
            return this;
        }

        public b setId(String str) {
            this.f62986a = str;
            return this;
        }

        public b setInitializationData(List<byte[]> list) {
            this.f62998m = list;
            return this;
        }

        public b setLabel(String str) {
            this.f62987b = str;
            return this;
        }

        public b setLanguage(String str) {
            this.f62988c = str;
            return this;
        }

        public b setMaxInputSize(int i10) {
            this.f62997l = i10;
            return this;
        }

        public b setMetadata(io.odeeo.internal.s.a aVar) {
            this.f62994i = aVar;
            return this;
        }

        public b setPcmEncoding(int i10) {
            this.f63011z = i10;
            return this;
        }

        public b setPeakBitrate(int i10) {
            this.f62992g = i10;
            return this;
        }

        public b setPixelWidthHeightRatio(float f10) {
            this.f63005t = f10;
            return this;
        }

        public b setProjectionData(byte[] bArr) {
            this.f63006u = bArr;
            return this;
        }

        public b setRoleFlags(int i10) {
            this.f62990e = i10;
            return this;
        }

        public b setRotationDegrees(int i10) {
            this.f63004s = i10;
            return this;
        }

        public b setSampleMimeType(String str) {
            this.f62996k = str;
            return this;
        }

        public b setSampleRate(int i10) {
            this.f63010y = i10;
            return this;
        }

        public b setSelectionFlags(int i10) {
            this.f62989d = i10;
            return this;
        }

        public b setStereoMode(int i10) {
            this.f63007v = i10;
            return this;
        }

        public b setSubsampleOffsetUs(long j10) {
            this.f63000o = j10;
            return this;
        }

        public b setWidth(int i10) {
            this.f63001p = i10;
            return this;
        }

        public b() {
            this.f62991f = -1;
            this.f62992g = -1;
            this.f62997l = -1;
            this.f63000o = Long.MAX_VALUE;
            this.f63001p = -1;
            this.f63002q = -1;
            this.f63003r = -1.0f;
            this.f63005t = 1.0f;
            this.f63007v = -1;
            this.f63009x = -1;
            this.f63010y = -1;
            this.f63011z = -1;
            this.C = -1;
            this.D = 0;
        }

        public b setId(int i10) {
            this.f62986a = Integer.toString(i10);
            return this;
        }

        public b(t tVar) {
            this.f62986a = tVar.f62960a;
            this.f62987b = tVar.f62961b;
            this.f62988c = tVar.f62962c;
            this.f62989d = tVar.f62963d;
            this.f62990e = tVar.f62964e;
            this.f62991f = tVar.f62965f;
            this.f62992g = tVar.f62966g;
            this.f62993h = tVar.f62968i;
            this.f62994i = tVar.f62969j;
            this.f62995j = tVar.f62970k;
            this.f62996k = tVar.f62971l;
            this.f62997l = tVar.f62972m;
            this.f62998m = tVar.f62973n;
            this.f62999n = tVar.f62974o;
            this.f63000o = tVar.f62975p;
            this.f63001p = tVar.f62976q;
            this.f63002q = tVar.f62977r;
            this.f63003r = tVar.f62978s;
            this.f63004s = tVar.f62979t;
            this.f63005t = tVar.f62980u;
            this.f63006u = tVar.f62981v;
            this.f63007v = tVar.f62982w;
            this.f63008w = tVar.f62983x;
            this.f63009x = tVar.f62984y;
            this.f63010y = tVar.f62985z;
            this.f63011z = tVar.A;
            this.A = tVar.B;
            this.B = tVar.C;
            this.C = tVar.D;
            this.D = tVar.E;
        }
    }

    public static <T> T a(T t10, T t11) {
        return t10 != null ? t10 : t11;
    }

    public static String b(int i10) {
        return a(12) + "_" + Integer.toString(i10, 36);
    }

    @Deprecated
    public static t createAudioSampleFormat(String str, String str2, String str3, int i10, int i11, int i12, int i13, List<byte[]> list, io.odeeo.internal.f.e eVar, int i14, String str4) {
        return new b().setId(str).setLanguage(str4).setSelectionFlags(i14).setAverageBitrate(i10).setPeakBitrate(i10).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i11).setInitializationData(list).setDrmInitData(eVar).setChannelCount(i12).setSampleRate(i13).build();
    }

    @Deprecated
    public static t createContainerFormat(String str, String str2, String str3, String str4, String str5, int i10, int i11, int i12, String str6) {
        return new b().setId(str).setLabel(str2).setLanguage(str6).setSelectionFlags(i11).setRoleFlags(i12).setAverageBitrate(i10).setPeakBitrate(i10).setCodecs(str5).setContainerMimeType(str3).setSampleMimeType(str4).build();
    }

    @Deprecated
    public static t createSampleFormat(String str, String str2) {
        return new b().setId(str).setSampleMimeType(str2).build();
    }

    @Deprecated
    public static t createVideoSampleFormat(String str, String str2, String str3, int i10, int i11, int i12, int i13, float f10, List<byte[]> list, io.odeeo.internal.f.e eVar) {
        return new b().setId(str).setAverageBitrate(i10).setPeakBitrate(i10).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i11).setInitializationData(list).setDrmInitData(eVar).setWidth(i12).setHeight(i13).setFrameRate(f10).build();
    }

    public static String toLogString(t tVar) {
        if (tVar == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb2 = new StringBuilder("id=");
        sb2.append(tVar.f62960a);
        sb2.append(", mimeType=");
        sb2.append(tVar.f62971l);
        if (tVar.f62967h != -1) {
            sb2.append(", bitrate=");
            sb2.append(tVar.f62967h);
        }
        if (tVar.f62968i != null) {
            sb2.append(", codecs=");
            sb2.append(tVar.f62968i);
        }
        if (tVar.f62974o != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (true) {
                io.odeeo.internal.f.e eVar = tVar.f62974o;
                if (i10 >= eVar.f63911d) {
                    break;
                }
                UUID uuid = eVar.get(i10).f63913b;
                if (uuid.equals(h.f62710b)) {
                    linkedHashSet.add(C.CENC_TYPE_cenc);
                } else if (uuid.equals(h.f62711c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(h.f62713e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(h.f62712d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(h.f62709a)) {
                    linkedHashSet.add(GatewayException.GATEWAY_RESPONSE_DEPTH_UNIVERSAL);
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
                i10++;
            }
            sb2.append(", drm=[");
            sb2.append(io.odeeo.internal.t0.n.on(AbstractJsonLexerKt.COMMA).join(linkedHashSet));
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        if (tVar.f62976q != -1 && tVar.f62977r != -1) {
            sb2.append(", res=");
            sb2.append(tVar.f62976q);
            sb2.append("x");
            sb2.append(tVar.f62977r);
        }
        if (tVar.f62978s != -1.0f) {
            sb2.append(", fps=");
            sb2.append(tVar.f62978s);
        }
        if (tVar.f62984y != -1) {
            sb2.append(", channels=");
            sb2.append(tVar.f62984y);
        }
        if (tVar.f62985z != -1) {
            sb2.append(", sample_rate=");
            sb2.append(tVar.f62985z);
        }
        if (tVar.f62962c != null) {
            sb2.append(", language=");
            sb2.append(tVar.f62962c);
        }
        if (tVar.f62961b != null) {
            sb2.append(", label=");
            sb2.append(tVar.f62961b);
        }
        if ((tVar.f62964e & 16384) != 0) {
            sb2.append(", trick-play-track");
        }
        return sb2.toString();
    }

    public b buildUpon() {
        return new b();
    }

    @Deprecated
    public t copyWithBitrate(int i10) {
        return buildUpon().setAverageBitrate(i10).setPeakBitrate(i10).build();
    }

    public t copyWithCryptoType(int i10) {
        return buildUpon().setCryptoType(i10).build();
    }

    @Deprecated
    public t copyWithDrmInitData(io.odeeo.internal.f.e eVar) {
        return buildUpon().setDrmInitData(eVar).build();
    }

    @Deprecated
    public t copyWithFrameRate(float f10) {
        return buildUpon().setFrameRate(f10).build();
    }

    @Deprecated
    public t copyWithGaplessInfo(int i10, int i11) {
        return buildUpon().setEncoderDelay(i10).setEncoderPadding(i11).build();
    }

    @Deprecated
    public t copyWithLabel(String str) {
        return buildUpon().setLabel(str).build();
    }

    @Deprecated
    public t copyWithManifestFormatInfo(t tVar) {
        return withManifestFormatInfo(tVar);
    }

    @Deprecated
    public t copyWithMaxInputSize(int i10) {
        return buildUpon().setMaxInputSize(i10).build();
    }

    @Deprecated
    public t copyWithMetadata(io.odeeo.internal.s.a aVar) {
        return buildUpon().setMetadata(aVar).build();
    }

    @Deprecated
    public t copyWithSubsampleOffsetUs(long j10) {
        return buildUpon().setSubsampleOffsetUs(j10).build();
    }

    @Deprecated
    public t copyWithVideoSize(int i10, int i11) {
        return buildUpon().setWidth(i10).setHeight(i11).build();
    }

    public boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            int i11 = this.F;
            if ((i11 == 0 || (i10 = tVar.F) == 0 || i11 == i10) && this.f62963d == tVar.f62963d && this.f62964e == tVar.f62964e && this.f62965f == tVar.f62965f && this.f62966g == tVar.f62966g && this.f62972m == tVar.f62972m && this.f62975p == tVar.f62975p && this.f62976q == tVar.f62976q && this.f62977r == tVar.f62977r && this.f62979t == tVar.f62979t && this.f62982w == tVar.f62982w && this.f62984y == tVar.f62984y && this.f62985z == tVar.f62985z && this.A == tVar.A && this.B == tVar.B && this.C == tVar.C && this.D == tVar.D && this.E == tVar.E && Float.compare(this.f62978s, tVar.f62978s) == 0 && Float.compare(this.f62980u, tVar.f62980u) == 0 && io.odeeo.internal.q0.g0.areEqual(this.f62960a, tVar.f62960a) && io.odeeo.internal.q0.g0.areEqual(this.f62961b, tVar.f62961b) && io.odeeo.internal.q0.g0.areEqual(this.f62968i, tVar.f62968i) && io.odeeo.internal.q0.g0.areEqual(this.f62970k, tVar.f62970k) && io.odeeo.internal.q0.g0.areEqual(this.f62971l, tVar.f62971l) && io.odeeo.internal.q0.g0.areEqual(this.f62962c, tVar.f62962c) && Arrays.equals(this.f62981v, tVar.f62981v) && io.odeeo.internal.q0.g0.areEqual(this.f62969j, tVar.f62969j) && io.odeeo.internal.q0.g0.areEqual(this.f62983x, tVar.f62983x) && io.odeeo.internal.q0.g0.areEqual(this.f62974o, tVar.f62974o) && initializationDataEquals(tVar)) {
                return true;
            }
        }
        return false;
    }

    public int getPixelCount() {
        int i10;
        int i11 = this.f62976q;
        if (i11 == -1 || (i10 = this.f62977r) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public int hashCode() {
        if (this.F == 0) {
            String str = this.f62960a;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f62961b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f62962c;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f62963d) * 31) + this.f62964e) * 31) + this.f62965f) * 31) + this.f62966g) * 31;
            String str4 = this.f62968i;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            io.odeeo.internal.s.a aVar = this.f62969j;
            int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str5 = this.f62970k;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f62971l;
            this.F = ((((((((((((((((Float.floatToIntBits(this.f62980u) + ((((Float.floatToIntBits(this.f62978s) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f62972m) * 31) + ((int) this.f62975p)) * 31) + this.f62976q) * 31) + this.f62977r) * 31)) * 31) + this.f62979t) * 31)) * 31) + this.f62982w) * 31) + this.f62984y) * 31) + this.f62985z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E;
        }
        return this.F;
    }

    public boolean initializationDataEquals(t tVar) {
        if (this.f62973n.size() != tVar.f62973n.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f62973n.size(); i10++) {
            if (!Arrays.equals(this.f62973n.get(i10), tVar.f62973n.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(a(0), this.f62960a);
        bundle.putString(a(1), this.f62961b);
        bundle.putString(a(2), this.f62962c);
        bundle.putInt(a(3), this.f62963d);
        bundle.putInt(a(4), this.f62964e);
        bundle.putInt(a(5), this.f62965f);
        bundle.putInt(a(6), this.f62966g);
        bundle.putString(a(7), this.f62968i);
        bundle.putParcelable(a(8), this.f62969j);
        bundle.putString(a(9), this.f62970k);
        bundle.putString(a(10), this.f62971l);
        bundle.putInt(a(11), this.f62972m);
        for (int i10 = 0; i10 < this.f62973n.size(); i10++) {
            bundle.putByteArray(b(i10), this.f62973n.get(i10));
        }
        bundle.putParcelable(a(13), this.f62974o);
        bundle.putLong(a(14), this.f62975p);
        bundle.putInt(a(15), this.f62976q);
        bundle.putInt(a(16), this.f62977r);
        bundle.putFloat(a(17), this.f62978s);
        bundle.putInt(a(18), this.f62979t);
        bundle.putFloat(a(19), this.f62980u);
        bundle.putByteArray(a(20), this.f62981v);
        bundle.putInt(a(21), this.f62982w);
        bundle.putBundle(a(22), io.odeeo.internal.q0.c.toNullableBundle(this.f62983x));
        bundle.putInt(a(23), this.f62984y);
        bundle.putInt(a(24), this.f62985z);
        bundle.putInt(a(25), this.A);
        bundle.putInt(a(26), this.B);
        bundle.putInt(a(27), this.C);
        bundle.putInt(a(28), this.D);
        bundle.putInt(a(29), this.E);
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f62960a);
        sb2.append(", ");
        sb2.append(this.f62961b);
        sb2.append(", ");
        sb2.append(this.f62970k);
        sb2.append(", ");
        sb2.append(this.f62971l);
        sb2.append(", ");
        sb2.append(this.f62968i);
        sb2.append(", ");
        sb2.append(this.f62967h);
        sb2.append(", ");
        sb2.append(this.f62962c);
        sb2.append(", [");
        sb2.append(this.f62976q);
        sb2.append(", ");
        sb2.append(this.f62977r);
        sb2.append(", ");
        sb2.append(this.f62978s);
        sb2.append("], [");
        sb2.append(this.f62984y);
        sb2.append(", ");
        return a.b.f(this.f62985z, "])", sb2);
    }

    public t withManifestFormatInfo(t tVar) {
        String str;
        if (this == tVar) {
            return this;
        }
        int trackType = io.odeeo.internal.q0.t.getTrackType(this.f62971l);
        String str2 = tVar.f62960a;
        String str3 = tVar.f62961b;
        if (str3 == null) {
            str3 = this.f62961b;
        }
        String str4 = this.f62962c;
        if ((trackType == 3 || trackType == 1) && (str = tVar.f62962c) != null) {
            str4 = str;
        }
        int i10 = this.f62965f;
        if (i10 == -1) {
            i10 = tVar.f62965f;
        }
        int i11 = this.f62966g;
        if (i11 == -1) {
            i11 = tVar.f62966g;
        }
        String str5 = this.f62968i;
        if (str5 == null) {
            String codecsOfType = io.odeeo.internal.q0.g0.getCodecsOfType(tVar.f62968i, trackType);
            if (io.odeeo.internal.q0.g0.splitCodecs(codecsOfType).length == 1) {
                str5 = codecsOfType;
            }
        }
        io.odeeo.internal.s.a aVar = this.f62969j;
        io.odeeo.internal.s.a aVarCopyWithAppendedEntriesFrom = aVar == null ? tVar.f62969j : aVar.copyWithAppendedEntriesFrom(tVar.f62969j);
        float f10 = this.f62978s;
        if (f10 == -1.0f && trackType == 2) {
            f10 = tVar.f62978s;
        }
        return buildUpon().setId(str2).setLabel(str3).setLanguage(str4).setSelectionFlags(this.f62963d | tVar.f62963d).setRoleFlags(this.f62964e | tVar.f62964e).setAverageBitrate(i10).setPeakBitrate(i11).setCodecs(str5).setMetadata(aVarCopyWithAppendedEntriesFrom).setDrmInitData(io.odeeo.internal.f.e.createSessionCreationData(tVar.f62974o, this.f62974o)).setFrameRate(f10).build();
    }

    public t(b bVar) {
        this.f62960a = bVar.f62986a;
        this.f62961b = bVar.f62987b;
        this.f62962c = io.odeeo.internal.q0.g0.normalizeLanguageCode(bVar.f62988c);
        this.f62963d = bVar.f62989d;
        this.f62964e = bVar.f62990e;
        int i10 = bVar.f62991f;
        this.f62965f = i10;
        int i11 = bVar.f62992g;
        this.f62966g = i11;
        this.f62967h = i11 != -1 ? i11 : i10;
        this.f62968i = bVar.f62993h;
        this.f62969j = bVar.f62994i;
        this.f62970k = bVar.f62995j;
        this.f62971l = bVar.f62996k;
        this.f62972m = bVar.f62997l;
        this.f62973n = bVar.f62998m == null ? Collections.EMPTY_LIST : bVar.f62998m;
        io.odeeo.internal.f.e eVar = bVar.f62999n;
        this.f62974o = eVar;
        this.f62975p = bVar.f63000o;
        this.f62976q = bVar.f63001p;
        this.f62977r = bVar.f63002q;
        this.f62978s = bVar.f63003r;
        this.f62979t = bVar.f63004s == -1 ? 0 : bVar.f63004s;
        this.f62980u = bVar.f63005t == -1.0f ? 1.0f : bVar.f63005t;
        this.f62981v = bVar.f63006u;
        this.f62982w = bVar.f63007v;
        this.f62983x = bVar.f63008w;
        this.f62984y = bVar.f63009x;
        this.f62985z = bVar.f63010y;
        this.A = bVar.f63011z;
        this.B = bVar.A == -1 ? 0 : bVar.A;
        this.C = bVar.B != -1 ? bVar.B : 0;
        this.D = bVar.C;
        if (bVar.D != 0 || eVar == null) {
            this.E = bVar.D;
        } else {
            this.E = 1;
        }
    }

    public static t a(Bundle bundle) {
        b bVar = new b();
        io.odeeo.internal.q0.c.ensureClassLoader(bundle);
        int i10 = 0;
        String string = bundle.getString(a(0));
        t tVar = G;
        bVar.setId((String) a(string, tVar.f62960a)).setLabel((String) a(bundle.getString(a(1)), tVar.f62961b)).setLanguage((String) a(bundle.getString(a(2)), tVar.f62962c)).setSelectionFlags(bundle.getInt(a(3), tVar.f62963d)).setRoleFlags(bundle.getInt(a(4), tVar.f62964e)).setAverageBitrate(bundle.getInt(a(5), tVar.f62965f)).setPeakBitrate(bundle.getInt(a(6), tVar.f62966g)).setCodecs((String) a(bundle.getString(a(7)), tVar.f62968i)).setMetadata((io.odeeo.internal.s.a) a((io.odeeo.internal.s.a) bundle.getParcelable(a(8)), tVar.f62969j)).setContainerMimeType((String) a(bundle.getString(a(9)), tVar.f62970k)).setSampleMimeType((String) a(bundle.getString(a(10)), tVar.f62971l)).setMaxInputSize(bundle.getInt(a(11), tVar.f62972m));
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(b(i10));
            if (byteArray == null) {
                b drmInitData = bVar.setInitializationData(arrayList).setDrmInitData((io.odeeo.internal.f.e) bundle.getParcelable(a(13)));
                String strA = a(14);
                t tVar2 = G;
                drmInitData.setSubsampleOffsetUs(bundle.getLong(strA, tVar2.f62975p)).setWidth(bundle.getInt(a(15), tVar2.f62976q)).setHeight(bundle.getInt(a(16), tVar2.f62977r)).setFrameRate(bundle.getFloat(a(17), tVar2.f62978s)).setRotationDegrees(bundle.getInt(a(18), tVar2.f62979t)).setPixelWidthHeightRatio(bundle.getFloat(a(19), tVar2.f62980u)).setProjectionData(bundle.getByteArray(a(20))).setStereoMode(bundle.getInt(a(21), tVar2.f62982w)).setColorInfo((io.odeeo.internal.r0.b) io.odeeo.internal.q0.c.fromNullableBundle(io.odeeo.internal.r0.b.f66130f, bundle.getBundle(a(22)))).setChannelCount(bundle.getInt(a(23), tVar2.f62984y)).setSampleRate(bundle.getInt(a(24), tVar2.f62985z)).setPcmEncoding(bundle.getInt(a(25), tVar2.A)).setEncoderDelay(bundle.getInt(a(26), tVar2.B)).setEncoderPadding(bundle.getInt(a(27), tVar2.C)).setAccessibilityChannel(bundle.getInt(a(28), tVar2.D)).setCryptoType(bundle.getInt(a(29), tVar2.E));
                return bVar.build();
            }
            arrayList.add(byteArray);
            i10++;
        }
    }

    @Deprecated
    public static t createVideoSampleFormat(String str, String str2, String str3, int i10, int i11, int i12, int i13, float f10, List<byte[]> list, int i14, float f11, io.odeeo.internal.f.e eVar) {
        return new b().setId(str).setAverageBitrate(i10).setPeakBitrate(i10).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i11).setInitializationData(list).setDrmInitData(eVar).setWidth(i12).setHeight(i13).setFrameRate(f10).setRotationDegrees(i14).setPixelWidthHeightRatio(f11).build();
    }

    @Deprecated
    public static t createAudioSampleFormat(String str, String str2, String str3, int i10, int i11, int i12, int i13, int i14, List<byte[]> list, io.odeeo.internal.f.e eVar, int i15, String str4) {
        return new b().setId(str).setLanguage(str4).setSelectionFlags(i15).setAverageBitrate(i10).setPeakBitrate(i10).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i11).setInitializationData(list).setDrmInitData(eVar).setChannelCount(i12).setSampleRate(i13).setPcmEncoding(i14).build();
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
