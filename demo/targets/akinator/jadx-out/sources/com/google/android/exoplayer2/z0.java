package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.DebugKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z0 implements i {
    public static final z0 K = new y0().build();
    public static final String L = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);
    public static final String M = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);
    public static final String N = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(2);
    public static final String O = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(3);
    public static final String P = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(4);
    public static final String Q = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(5);
    public static final String R = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(6);
    public static final String S = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(7);
    public static final String T = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(8);
    public static final String U = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(9);
    public static final String V = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(10);
    public static final String W = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(11);
    public static final String X = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(12);
    public static final String Y = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(13);
    public static final String Z = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(14);

    /* renamed from: a0, reason: collision with root package name */
    public static final String f28773a0 = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(15);

    /* renamed from: b0, reason: collision with root package name */
    public static final String f28774b0 = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(16);

    /* renamed from: c0, reason: collision with root package name */
    public static final String f28775c0 = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(17);

    /* renamed from: d0, reason: collision with root package name */
    public static final String f28776d0 = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(18);

    /* renamed from: e0, reason: collision with root package name */
    public static final String f28777e0 = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(19);

    /* renamed from: f0, reason: collision with root package name */
    public static final String f28778f0 = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(20);

    /* renamed from: g0, reason: collision with root package name */
    public static final String f28779g0 = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(21);

    /* renamed from: h0, reason: collision with root package name */
    public static final String f28780h0 = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(22);

    /* renamed from: i0, reason: collision with root package name */
    public static final String f28781i0 = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(23);

    /* renamed from: j0, reason: collision with root package name */
    public static final String f28782j0 = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(24);

    /* renamed from: k0, reason: collision with root package name */
    public static final String f28783k0 = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(25);

    /* renamed from: l0, reason: collision with root package name */
    public static final String f28784l0 = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(26);

    /* renamed from: m0, reason: collision with root package name */
    public static final String f28785m0 = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(27);

    /* renamed from: n0, reason: collision with root package name */
    public static final String f28786n0 = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(28);

    /* renamed from: o0, reason: collision with root package name */
    public static final String f28787o0 = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(29);

    /* renamed from: p0, reason: collision with root package name */
    public static final String f28788p0 = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(30);

    /* renamed from: q0, reason: collision with root package name */
    public static final String f28789q0 = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(31);

    /* renamed from: r0, reason: collision with root package name */
    public static final com.bytedance.adsdk.ugeno.zz.cm.a f28790r0 = new com.bytedance.adsdk.ugeno.zz.cm.a(7);
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public int J;

    /* renamed from: b, reason: collision with root package name */
    public final String f28791b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28792c;

    /* renamed from: e, reason: collision with root package name */
    public final String f28793e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28794f;

    /* renamed from: g, reason: collision with root package name */
    public final int f28795g;

    /* renamed from: h, reason: collision with root package name */
    public final int f28796h;

    /* renamed from: i, reason: collision with root package name */
    public final int f28797i;

    /* renamed from: j, reason: collision with root package name */
    public final int f28798j;

    /* renamed from: k, reason: collision with root package name */
    public final String f28799k;

    /* renamed from: l, reason: collision with root package name */
    public final Metadata f28800l;

    /* renamed from: m, reason: collision with root package name */
    public final String f28801m;

    /* renamed from: n, reason: collision with root package name */
    public final String f28802n;

    /* renamed from: o, reason: collision with root package name */
    public final int f28803o;

    /* renamed from: p, reason: collision with root package name */
    public final List f28804p;

    /* renamed from: q, reason: collision with root package name */
    public final DrmInitData f28805q;

    /* renamed from: r, reason: collision with root package name */
    public final long f28806r;

    /* renamed from: s, reason: collision with root package name */
    public final int f28807s;

    /* renamed from: t, reason: collision with root package name */
    public final int f28808t;

    /* renamed from: u, reason: collision with root package name */
    public final float f28809u;

    /* renamed from: v, reason: collision with root package name */
    public final int f28810v;

    /* renamed from: w, reason: collision with root package name */
    public final float f28811w;

    /* renamed from: x, reason: collision with root package name */
    public final byte[] f28812x;

    /* renamed from: y, reason: collision with root package name */
    public final int f28813y;

    /* renamed from: z, reason: collision with root package name */
    public final sf.b f28814z;

    public z0(y0 y0Var) {
        this.f28791b = y0Var.f28738a;
        this.f28792c = y0Var.f28739b;
        this.f28793e = com.google.android.exoplayer2.util.n1.normalizeLanguageCode(y0Var.f28740c);
        this.f28794f = y0Var.f28741d;
        this.f28795g = y0Var.f28742e;
        int i10 = y0Var.f28743f;
        this.f28796h = i10;
        int i11 = y0Var.f28744g;
        this.f28797i = i11;
        this.f28798j = i11 != -1 ? i11 : i10;
        this.f28799k = y0Var.f28745h;
        this.f28800l = y0Var.f28746i;
        this.f28801m = y0Var.f28747j;
        this.f28802n = y0Var.f28748k;
        this.f28803o = y0Var.f28749l;
        List list = y0Var.f28750m;
        this.f28804p = list == null ? Collections.EMPTY_LIST : list;
        DrmInitData drmInitData = y0Var.f28751n;
        this.f28805q = drmInitData;
        this.f28806r = y0Var.f28752o;
        this.f28807s = y0Var.f28753p;
        this.f28808t = y0Var.f28754q;
        this.f28809u = y0Var.f28755r;
        int i12 = y0Var.f28756s;
        this.f28810v = i12 == -1 ? 0 : i12;
        float f10 = y0Var.f28757t;
        this.f28811w = f10 == -1.0f ? 1.0f : f10;
        this.f28812x = y0Var.f28758u;
        this.f28813y = y0Var.f28759v;
        this.f28814z = y0Var.f28760w;
        this.A = y0Var.f28761x;
        this.B = y0Var.f28762y;
        this.C = y0Var.f28763z;
        int i13 = y0Var.A;
        this.D = i13 == -1 ? 0 : i13;
        int i14 = y0Var.B;
        this.E = i14 != -1 ? i14 : 0;
        this.F = y0Var.C;
        this.G = y0Var.D;
        this.H = y0Var.E;
        int i15 = y0Var.F;
        if (i15 != 0 || drmInitData == null) {
            this.I = i15;
        } else {
            this.I = 1;
        }
    }

    public y0 buildUpon() {
        y0 y0Var = new y0();
        y0Var.f28738a = this.f28791b;
        y0Var.f28739b = this.f28792c;
        y0Var.f28740c = this.f28793e;
        y0Var.f28741d = this.f28794f;
        y0Var.f28742e = this.f28795g;
        y0Var.f28743f = this.f28796h;
        y0Var.f28744g = this.f28797i;
        y0Var.f28745h = this.f28799k;
        y0Var.f28746i = this.f28800l;
        y0Var.f28747j = this.f28801m;
        y0Var.f28748k = this.f28802n;
        y0Var.f28749l = this.f28803o;
        y0Var.f28750m = this.f28804p;
        y0Var.f28751n = this.f28805q;
        y0Var.f28752o = this.f28806r;
        y0Var.f28753p = this.f28807s;
        y0Var.f28754q = this.f28808t;
        y0Var.f28755r = this.f28809u;
        y0Var.f28756s = this.f28810v;
        y0Var.f28757t = this.f28811w;
        y0Var.f28758u = this.f28812x;
        y0Var.f28759v = this.f28813y;
        y0Var.f28760w = this.f28814z;
        y0Var.f28761x = this.A;
        y0Var.f28762y = this.B;
        y0Var.f28763z = this.C;
        y0Var.A = this.D;
        y0Var.B = this.E;
        y0Var.C = this.F;
        y0Var.D = this.G;
        y0Var.E = this.H;
        y0Var.F = this.I;
        return y0Var;
    }

    public z0 copyWithCryptoType(int i10) {
        return buildUpon().setCryptoType(i10).build();
    }

    public boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && z0.class == obj.getClass()) {
            z0 z0Var = (z0) obj;
            int i11 = this.J;
            if ((i11 == 0 || (i10 = z0Var.J) == 0 || i11 == i10) && this.f28794f == z0Var.f28794f && this.f28795g == z0Var.f28795g && this.f28796h == z0Var.f28796h && this.f28797i == z0Var.f28797i && this.f28803o == z0Var.f28803o && this.f28806r == z0Var.f28806r && this.f28807s == z0Var.f28807s && this.f28808t == z0Var.f28808t && this.f28810v == z0Var.f28810v && this.f28813y == z0Var.f28813y && this.A == z0Var.A && this.B == z0Var.B && this.C == z0Var.C && this.D == z0Var.D && this.E == z0Var.E && this.F == z0Var.F && this.G == z0Var.G && this.H == z0Var.H && this.I == z0Var.I && Float.compare(this.f28809u, z0Var.f28809u) == 0 && Float.compare(this.f28811w, z0Var.f28811w) == 0 && com.google.android.exoplayer2.util.n1.areEqual(this.f28791b, z0Var.f28791b) && com.google.android.exoplayer2.util.n1.areEqual(this.f28792c, z0Var.f28792c) && com.google.android.exoplayer2.util.n1.areEqual(this.f28799k, z0Var.f28799k) && com.google.android.exoplayer2.util.n1.areEqual(this.f28801m, z0Var.f28801m) && com.google.android.exoplayer2.util.n1.areEqual(this.f28802n, z0Var.f28802n) && com.google.android.exoplayer2.util.n1.areEqual(this.f28793e, z0Var.f28793e) && Arrays.equals(this.f28812x, z0Var.f28812x) && com.google.android.exoplayer2.util.n1.areEqual(this.f28800l, z0Var.f28800l) && com.google.android.exoplayer2.util.n1.areEqual(this.f28814z, z0Var.f28814z) && com.google.android.exoplayer2.util.n1.areEqual(this.f28805q, z0Var.f28805q) && initializationDataEquals(z0Var)) {
                return true;
            }
        }
        return false;
    }

    public int getPixelCount() {
        int i10;
        int i11 = this.f28807s;
        if (i11 == -1 || (i10 = this.f28808t) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public int hashCode() {
        if (this.J == 0) {
            String str = this.f28791b;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f28792c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f28793e;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f28794f) * 31) + this.f28795g) * 31) + this.f28796h) * 31) + this.f28797i) * 31;
            String str4 = this.f28799k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.f28800l;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.f28801m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f28802n;
            this.J = ((((((((((((((((((((Float.floatToIntBits(this.f28811w) + ((((Float.floatToIntBits(this.f28809u) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f28803o) * 31) + ((int) this.f28806r)) * 31) + this.f28807s) * 31) + this.f28808t) * 31)) * 31) + this.f28810v) * 31)) * 31) + this.f28813y) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I;
        }
        return this.J;
    }

    public boolean initializationDataEquals(z0 z0Var) {
        List list = this.f28804p;
        if (list.size() != z0Var.f28804p.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) z0Var.f28804p.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        return toBundle(false);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f28791b);
        sb2.append(", ");
        sb2.append(this.f28792c);
        sb2.append(", ");
        sb2.append(this.f28801m);
        sb2.append(", ");
        sb2.append(this.f28802n);
        sb2.append(", ");
        sb2.append(this.f28799k);
        sb2.append(", ");
        sb2.append(this.f28798j);
        sb2.append(", ");
        sb2.append(this.f28793e);
        sb2.append(", [");
        sb2.append(this.f28807s);
        sb2.append(", ");
        sb2.append(this.f28808t);
        sb2.append(", ");
        sb2.append(this.f28809u);
        sb2.append(", ");
        sb2.append(this.f28814z);
        sb2.append("], [");
        sb2.append(this.A);
        sb2.append(", ");
        return a.b.f(this.B, "])", sb2);
    }

    public z0 withManifestFormatInfo(z0 z0Var) {
        String str;
        if (this == z0Var) {
            return this;
        }
        int trackType = com.google.android.exoplayer2.util.l0.getTrackType(this.f28802n);
        String str2 = z0Var.f28791b;
        Metadata metadataCopyWithAppendedEntriesFrom = z0Var.f28800l;
        String str3 = z0Var.f28792c;
        if (str3 == null) {
            str3 = this.f28792c;
        }
        if ((trackType != 3 && trackType != 1) || (str = z0Var.f28793e) == null) {
            str = this.f28793e;
        }
        int i10 = this.f28796h;
        if (i10 == -1) {
            i10 = z0Var.f28796h;
        }
        int i11 = this.f28797i;
        if (i11 == -1) {
            i11 = z0Var.f28797i;
        }
        String str4 = this.f28799k;
        if (str4 == null) {
            String codecsOfType = com.google.android.exoplayer2.util.n1.getCodecsOfType(z0Var.f28799k, trackType);
            if (com.google.android.exoplayer2.util.n1.splitCodecs(codecsOfType).length == 1) {
                str4 = codecsOfType;
            }
        }
        Metadata metadata = this.f28800l;
        if (metadata != null) {
            metadataCopyWithAppendedEntriesFrom = metadata.copyWithAppendedEntriesFrom(metadataCopyWithAppendedEntriesFrom);
        }
        float f10 = this.f28809u;
        if (f10 == -1.0f && trackType == 2) {
            f10 = z0Var.f28809u;
        }
        int i12 = this.f28794f | z0Var.f28794f;
        return buildUpon().setId(str2).setLabel(str3).setLanguage(str).setSelectionFlags(i12).setRoleFlags(this.f28795g | z0Var.f28795g).setAverageBitrate(i10).setPeakBitrate(i11).setCodecs(str4).setMetadata(metadataCopyWithAppendedEntriesFrom).setDrmInitData(DrmInitData.createSessionCreationData(z0Var.f28805q, this.f28805q)).setFrameRate(f10).build();
    }

    public static String toLogString(z0 z0Var) {
        sf.b bVar;
        char c10;
        sf.b bVar2;
        if (z0Var == null) {
            return AbstractJsonLexerKt.NULL;
        }
        String str = z0Var.f28792c;
        String str2 = z0Var.f28793e;
        int i10 = z0Var.B;
        int i11 = z0Var.A;
        float f10 = z0Var.f28809u;
        sf.b bVar3 = z0Var.f28814z;
        int i12 = z0Var.f28808t;
        int i13 = z0Var.f28807s;
        DrmInitData drmInitData = z0Var.f28805q;
        String str3 = z0Var.f28799k;
        int i14 = z0Var.f28798j;
        int i15 = z0Var.f28794f;
        int i16 = z0Var.f28795g;
        StringBuilder sbU = p0.o2.u("id=");
        sbU.append(z0Var.f28791b);
        sbU.append(", mimeType=");
        sbU.append(z0Var.f28802n);
        int i17 = -1;
        if (i14 != -1) {
            sbU.append(", bitrate=");
            sbU.append(i14);
        }
        if (str3 != null) {
            sbU.append(", codecs=");
            sbU.append(str3);
        }
        if (drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i18 = 0;
            c10 = AbstractJsonLexerKt.COMMA;
            while (i18 < drmInitData.f27370f) {
                UUID uuid = drmInitData.get(i18).f27372c;
                if (uuid.equals(j.f27535b)) {
                    linkedHashSet.add(C.CENC_TYPE_cenc);
                } else if (uuid.equals(j.f27536c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(j.f27538e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(j.f27537d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(j.f27534a)) {
                    linkedHashSet.add(GatewayException.GATEWAY_RESPONSE_DEPTH_UNIVERSAL);
                } else {
                    bVar2 = bVar3;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i18++;
                    bVar3 = bVar2;
                }
                bVar2 = bVar3;
                i18++;
                bVar3 = bVar2;
            }
            bVar = bVar3;
            sbU.append(", drm=[");
            mh.d1.on(AbstractJsonLexerKt.COMMA).appendTo(sbU, (Iterable<?>) linkedHashSet);
            sbU.append(AbstractJsonLexerKt.END_LIST);
            i17 = -1;
        } else {
            bVar = bVar3;
            c10 = AbstractJsonLexerKt.COMMA;
        }
        if (i13 != i17 && i12 != i17) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.o(i13, i12, ", res=", "x", sbU);
        }
        if (bVar != null && bVar.isValid()) {
            sbU.append(", color=");
            sbU.append(bVar.toLogString());
        }
        if (f10 != -1.0f) {
            sbU.append(", fps=");
            sbU.append(f10);
        }
        if (i11 != -1) {
            sbU.append(", channels=");
            sbU.append(i11);
        }
        if (i10 != -1) {
            sbU.append(", sample_rate=");
            sbU.append(i10);
        }
        if (str2 != null) {
            sbU.append(", language=");
            sbU.append(str2);
        }
        if (str != null) {
            sbU.append(SFPXhf.hNhaDyFzFNtNZp);
            sbU.append(str);
        }
        if (i15 != 0) {
            ArrayList arrayList = new ArrayList();
            if ((i15 & 4) != 0) {
                arrayList.add(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
            }
            if ((i15 & 1) != 0) {
                arrayList.add(BuildConfig.FLAVOR);
            }
            if ((i15 & 2) != 0) {
                arrayList.add("forced");
            }
            sbU.append(", selectionFlags=[");
            mh.d1.on(c10).appendTo(sbU, (Iterable<?>) arrayList);
            sbU.append(C3191e4.i.f36531e);
        }
        if (i16 != 0) {
            ArrayList arrayList2 = new ArrayList();
            if ((i16 & 1) != 0) {
                arrayList2.add(C3191e4.h.Z);
            }
            if ((i16 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i16 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i16 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i16 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i16 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i16 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i16 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i16 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                arrayList2.add("sign");
            }
            if ((i16 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i16 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i16 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i16 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i16 & Segment.SIZE) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i16 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            sbU.append(", roleFlags=[");
            mh.d1.on(c10).appendTo(sbU, (Iterable<?>) arrayList2);
            sbU.append(C3191e4.i.f36531e);
        }
        return sbU.toString();
    }

    public Bundle toBundle(boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putString(L, this.f28791b);
        bundle.putString(M, this.f28792c);
        bundle.putString(N, this.f28793e);
        bundle.putInt(O, this.f28794f);
        bundle.putInt(P, this.f28795g);
        bundle.putInt(Q, this.f28796h);
        bundle.putInt(R, this.f28797i);
        bundle.putString(S, this.f28799k);
        if (!z10) {
            bundle.putParcelable(T, this.f28800l);
        }
        bundle.putString(U, this.f28801m);
        bundle.putString(V, this.f28802n);
        bundle.putInt(W, this.f28803o);
        int i10 = 0;
        while (true) {
            List list = this.f28804p;
            if (i10 >= list.size()) {
                break;
            }
            bundle.putByteArray(X + "_" + Integer.toString(i10, 36), (byte[]) list.get(i10));
            i10++;
        }
        bundle.putParcelable(Y, this.f28805q);
        bundle.putLong(Z, this.f28806r);
        bundle.putInt(f28773a0, this.f28807s);
        bundle.putInt(f28774b0, this.f28808t);
        bundle.putFloat(f28775c0, this.f28809u);
        bundle.putInt(f28776d0, this.f28810v);
        bundle.putFloat(f28777e0, this.f28811w);
        bundle.putByteArray(f28778f0, this.f28812x);
        bundle.putInt(f28779g0, this.f28813y);
        sf.b bVar = this.f28814z;
        if (bVar != null) {
            bundle.putBundle(f28780h0, bVar.toBundle());
        }
        bundle.putInt(f28781i0, this.A);
        bundle.putInt(f28782j0, this.B);
        bundle.putInt(f28783k0, this.C);
        bundle.putInt(f28784l0, this.D);
        bundle.putInt(f28785m0, this.E);
        bundle.putInt(f28786n0, this.F);
        bundle.putInt(f28788p0, this.G);
        bundle.putInt(f28789q0, this.H);
        bundle.putInt(f28787o0, this.I);
        return bundle;
    }
}
