package io.bidmachine.media3.common;

import android.os.Bundle;
import android.text.TextUtils;
import ao.c;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import gn.l;
import gn.n;
import gn.u0;
import gn.w;
import gn.x0;
import gn.z;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mh.d1;
import nh.b5;
import nh.p8;
import p0.o2;
import qh.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b {
    public static final b P = new w().build();
    public static final String Q = a1.intToStringMaxRadix(0);
    public static final String R = a1.intToStringMaxRadix(1);
    public static final String S = a1.intToStringMaxRadix(2);
    public static final String T = a1.intToStringMaxRadix(3);
    public static final String U = a1.intToStringMaxRadix(4);
    public static final String V = a1.intToStringMaxRadix(5);
    public static final String W = a1.intToStringMaxRadix(6);
    public static final String X = a1.intToStringMaxRadix(7);
    public static final String Y;
    public static final String Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final String f60627a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final String f60628b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final String f60629c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final String f60630d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final String f60631e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final String f60632f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final String f60633g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final String f60634h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final String f60635i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final String f60636j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final String f60637k0;

    /* renamed from: l0, reason: collision with root package name */
    public static final String f60638l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final String f60639m0;

    /* renamed from: n0, reason: collision with root package name */
    public static final String f60640n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final String f60641o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final String f60642p0;

    /* renamed from: q0, reason: collision with root package name */
    public static final String f60643q0;

    /* renamed from: r0, reason: collision with root package name */
    public static final String f60644r0;

    /* renamed from: s0, reason: collision with root package name */
    public static final String f60645s0;

    /* renamed from: t0, reason: collision with root package name */
    public static final String f60646t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final String f60647u0;

    /* renamed from: v0, reason: collision with root package name */
    public static final String f60648v0;

    /* renamed from: w0, reason: collision with root package name */
    public static final String f60649w0;

    /* renamed from: x0, reason: collision with root package name */
    public static final String f60650x0;
    public final byte[] A;
    public final int B;
    public final n C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public int O;

    /* renamed from: a, reason: collision with root package name */
    public final String f60651a;

    /* renamed from: b, reason: collision with root package name */
    public final String f60652b;

    /* renamed from: c, reason: collision with root package name */
    public final b5 f60653c;

    /* renamed from: d, reason: collision with root package name */
    public final String f60654d;

    /* renamed from: e, reason: collision with root package name */
    public final int f60655e;

    /* renamed from: f, reason: collision with root package name */
    public final int f60656f;

    /* renamed from: g, reason: collision with root package name */
    public final int f60657g;

    /* renamed from: h, reason: collision with root package name */
    public final int f60658h;

    /* renamed from: i, reason: collision with root package name */
    public final int f60659i;

    /* renamed from: j, reason: collision with root package name */
    public final int f60660j;

    /* renamed from: k, reason: collision with root package name */
    public final String f60661k;

    /* renamed from: l, reason: collision with root package name */
    public final u0 f60662l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f60663m;

    /* renamed from: n, reason: collision with root package name */
    public final String f60664n;

    /* renamed from: o, reason: collision with root package name */
    public final String f60665o;

    /* renamed from: p, reason: collision with root package name */
    public final int f60666p;

    /* renamed from: q, reason: collision with root package name */
    public final int f60667q;

    /* renamed from: r, reason: collision with root package name */
    public final List f60668r;

    /* renamed from: s, reason: collision with root package name */
    public final DrmInitData f60669s;

    /* renamed from: t, reason: collision with root package name */
    public final long f60670t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f60671u;

    /* renamed from: v, reason: collision with root package name */
    public final int f60672v;

    /* renamed from: w, reason: collision with root package name */
    public final int f60673w;

    /* renamed from: x, reason: collision with root package name */
    public final float f60674x;

    /* renamed from: y, reason: collision with root package name */
    public final int f60675y;

    /* renamed from: z, reason: collision with root package name */
    public final float f60676z;

    static {
        a1.intToStringMaxRadix(8);
        Y = a1.intToStringMaxRadix(9);
        Z = a1.intToStringMaxRadix(10);
        f60627a0 = a1.intToStringMaxRadix(11);
        f60628b0 = a1.intToStringMaxRadix(12);
        f60629c0 = a1.intToStringMaxRadix(13);
        f60630d0 = a1.intToStringMaxRadix(14);
        f60631e0 = a1.intToStringMaxRadix(15);
        f60632f0 = a1.intToStringMaxRadix(16);
        f60633g0 = a1.intToStringMaxRadix(17);
        f60634h0 = a1.intToStringMaxRadix(18);
        f60635i0 = a1.intToStringMaxRadix(19);
        f60636j0 = a1.intToStringMaxRadix(20);
        f60637k0 = a1.intToStringMaxRadix(21);
        f60638l0 = a1.intToStringMaxRadix(22);
        f60639m0 = a1.intToStringMaxRadix(23);
        f60640n0 = a1.intToStringMaxRadix(24);
        f60641o0 = a1.intToStringMaxRadix(25);
        f60642p0 = a1.intToStringMaxRadix(26);
        f60643q0 = a1.intToStringMaxRadix(27);
        f60644r0 = a1.intToStringMaxRadix(28);
        f60645s0 = a1.intToStringMaxRadix(29);
        f60646t0 = a1.intToStringMaxRadix(30);
        f60647u0 = a1.intToStringMaxRadix(31);
        f60648v0 = a1.intToStringMaxRadix(32);
        f60649w0 = a1.intToStringMaxRadix(33);
        f60650x0 = a1.intToStringMaxRadix(34);
    }

    public b(w wVar) throws MissingResourceException {
        boolean z10;
        String str;
        this.f60651a = wVar.f58210a;
        String strNormalizeLanguageCode = a1.normalizeLanguageCode(wVar.f58213d);
        this.f60654d = strNormalizeLanguageCode;
        if (wVar.f58212c.isEmpty() && wVar.f58211b != null) {
            this.f60653c = b5.of(new z(strNormalizeLanguageCode, wVar.f58211b));
            this.f60652b = wVar.f58211b;
        } else if (!wVar.f58212c.isEmpty() && wVar.f58211b == null) {
            b5 b5Var = wVar.f58212c;
            this.f60653c = b5Var;
            Iterator it = b5Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((z) b5Var.get(0)).f58264b;
                    break;
                }
                z zVar = (z) it.next();
                if (TextUtils.equals(zVar.f58263a, strNormalizeLanguageCode)) {
                    str = zVar.f58264b;
                    break;
                }
            }
            this.f60652b = str;
        } else if (wVar.f58212c.isEmpty() && wVar.f58211b == null) {
            z10 = true;
            io.bidmachine.media3.common.util.a.checkState(z10);
            this.f60653c = wVar.f58212c;
            this.f60652b = wVar.f58211b;
        } else {
            for (int i10 = 0; i10 < wVar.f58212c.size(); i10++) {
                if (((z) wVar.f58212c.get(i10)).f58264b.equals(wVar.f58211b)) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
            io.bidmachine.media3.common.util.a.checkState(z10);
            this.f60653c = wVar.f58212c;
            this.f60652b = wVar.f58211b;
        }
        this.f60655e = wVar.f58214e;
        io.bidmachine.media3.common.util.a.checkState(wVar.f58216g == 0 || (wVar.f58215f & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f60656f = wVar.f58215f;
        this.f60657g = wVar.f58216g;
        int i11 = wVar.f58217h;
        this.f60658h = i11;
        int i12 = wVar.f58218i;
        this.f60659i = i12;
        this.f60660j = i12 != -1 ? i12 : i11;
        this.f60661k = wVar.f58219j;
        this.f60662l = wVar.f58220k;
        this.f60663m = wVar.f58221l;
        this.f60664n = wVar.f58222m;
        this.f60665o = wVar.f58223n;
        this.f60666p = wVar.f58224o;
        this.f60667q = wVar.f58225p;
        List list = wVar.f58226q;
        this.f60668r = list == null ? Collections.EMPTY_LIST : list;
        DrmInitData drmInitData = wVar.f58227r;
        this.f60669s = drmInitData;
        this.f60670t = wVar.f58228s;
        this.f60671u = wVar.f58229t;
        this.f60672v = wVar.f58230u;
        this.f60673w = wVar.f58231v;
        this.f60674x = wVar.f58232w;
        int i13 = wVar.f58233x;
        this.f60675y = i13 == -1 ? 0 : i13;
        float f10 = wVar.f58234y;
        this.f60676z = f10 == -1.0f ? 1.0f : f10;
        this.A = wVar.f58235z;
        this.B = wVar.A;
        this.C = wVar.B;
        this.D = wVar.C;
        this.E = wVar.D;
        this.F = wVar.E;
        this.G = wVar.F;
        int i14 = wVar.G;
        this.H = i14 == -1 ? 0 : i14;
        int i15 = wVar.H;
        this.I = i15 != -1 ? i15 : 0;
        this.J = wVar.I;
        this.K = wVar.J;
        this.L = wVar.K;
        this.M = wVar.L;
        int i16 = wVar.M;
        if (i16 != 0 || drmInitData == null) {
            this.N = i16;
        } else {
            this.N = 1;
        }
    }

    public static b fromBundle(Bundle bundle) {
        w wVar = new w();
        f.ensureClassLoader(bundle);
        String string = bundle.getString(Q);
        b bVar = P;
        String str = bVar.f60651a;
        if (string == null) {
            string = str;
        }
        w id2 = wVar.setId(string);
        String string2 = bundle.getString(R);
        String str2 = bVar.f60652b;
        if (string2 == null) {
            string2 = str2;
        }
        id2.setLabel(string2);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f60648v0);
        w labels = wVar.setLabels(parcelableArrayList == null ? b5.of() : f.fromBundleList(new c(14), parcelableArrayList));
        String string3 = bundle.getString(S);
        String str3 = bVar.f60654d;
        if (string3 == null) {
            string3 = str3;
        }
        w peakBitrate = labels.setLanguage(string3).setSelectionFlags(bundle.getInt(T, bVar.f60655e)).setRoleFlags(bundle.getInt(U, bVar.f60656f)).setAuxiliaryTrackType(bundle.getInt(f60649w0, bVar.f60657g)).setAverageBitrate(bundle.getInt(V, bVar.f60658h)).setPeakBitrate(bundle.getInt(W, bVar.f60659i));
        String string4 = bundle.getString(X);
        String str4 = bVar.f60661k;
        if (string4 == null) {
            string4 = str4;
        }
        w codecs = peakBitrate.setCodecs(string4);
        String string5 = bundle.getString(Y);
        String str5 = bVar.f60664n;
        if (string5 == null) {
            string5 = str5;
        }
        w containerMimeType = codecs.setContainerMimeType(string5);
        String string6 = bundle.getString(Z);
        String str6 = bVar.f60665o;
        if (string6 == null) {
            string6 = str6;
        }
        containerMimeType.setSampleMimeType(string6).setMaxInputSize(bundle.getInt(f60627a0, bVar.f60666p));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(f60628b0 + "_" + Integer.toString(i10, 36));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i10++;
        }
        wVar.setInitializationData(arrayList).setDrmInitData((DrmInitData) bundle.getParcelable(f60629c0)).setSubsampleOffsetUs(bundle.getLong(f60630d0, bVar.f60670t)).setWidth(bundle.getInt(f60631e0, bVar.f60672v)).setHeight(bundle.getInt(f60632f0, bVar.f60673w)).setFrameRate(bundle.getFloat(f60633g0, bVar.f60674x)).setRotationDegrees(bundle.getInt(f60634h0, bVar.f60675y)).setPixelWidthHeightRatio(bundle.getFloat(f60635i0, bVar.f60676z)).setProjectionData(bundle.getByteArray(f60636j0)).setStereoMode(bundle.getInt(f60637k0, bVar.B)).setMaxSubLayers(bundle.getInt(f60650x0, bVar.D));
        Bundle bundle2 = bundle.getBundle(f60638l0);
        if (bundle2 != null) {
            wVar.setColorInfo(n.fromBundle(bundle2));
        }
        wVar.setChannelCount(bundle.getInt(f60639m0, bVar.E)).setSampleRate(bundle.getInt(f60640n0, bVar.F)).setPcmEncoding(bundle.getInt(f60641o0, bVar.G)).setEncoderDelay(bundle.getInt(f60642p0, bVar.H)).setEncoderPadding(bundle.getInt(f60643q0, bVar.I)).setAccessibilityChannel(bundle.getInt(f60644r0, bVar.J)).setTileCountHorizontal(bundle.getInt(f60646t0, bVar.L)).setTileCountVertical(bundle.getInt(f60647u0, bVar.M)).setCryptoType(bundle.getInt(f60645s0, bVar.N));
        return wVar.build();
    }

    public static String toLogString(b bVar) {
        DrmInitData drmInitData;
        if (bVar == null) {
            return AbstractJsonLexerKt.NULL;
        }
        Object obj = bVar.f60663m;
        int i10 = bVar.f60655e;
        b5 b5Var = bVar.f60653c;
        String str = bVar.f60654d;
        int i11 = bVar.F;
        int i12 = bVar.E;
        int i13 = bVar.D;
        float f10 = bVar.f60674x;
        n nVar = bVar.C;
        float f11 = bVar.f60676z;
        int i14 = bVar.f60673w;
        int i15 = bVar.f60672v;
        DrmInitData drmInitData2 = bVar.f60669s;
        String str2 = bVar.f60661k;
        int i16 = bVar.f60660j;
        String str3 = bVar.f60664n;
        int i17 = bVar.f60656f;
        d1 d1VarOn = d1.on(AbstractJsonLexerKt.COMMA);
        StringBuilder sbU = o2.u("id=");
        sbU.append(bVar.f60651a);
        sbU.append(", mimeType=");
        sbU.append(bVar.f60665o);
        if (str3 != null) {
            sbU.append(", container=");
            sbU.append(str3);
        }
        int i18 = -1;
        if (i16 != -1) {
            sbU.append(", bitrate=");
            sbU.append(i16);
        }
        if (str2 != null) {
            sbU.append(", codecs=");
            sbU.append(str2);
        }
        if (drmInitData2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i19 = 0;
            while (i19 < drmInitData2.f60615f) {
                UUID uuid = drmInitData2.get(i19).f60617c;
                if (uuid.equals(l.f57985b)) {
                    linkedHashSet.add(C.CENC_TYPE_cenc);
                } else if (uuid.equals(l.f57986c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(l.f57988e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(l.f57987d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(l.f57984a)) {
                    linkedHashSet.add(GatewayException.GATEWAY_RESPONSE_DEPTH_UNIVERSAL);
                } else {
                    drmInitData = drmInitData2;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i19++;
                    drmInitData2 = drmInitData;
                }
                drmInitData = drmInitData2;
                i19++;
                drmInitData2 = drmInitData;
            }
            sbU.append(", drm=[");
            d1VarOn.appendTo(sbU, (Iterable<?>) linkedHashSet);
            sbU.append(AbstractJsonLexerKt.END_LIST);
            i18 = -1;
        }
        if (i15 != i18 && i14 != i18) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.o(i15, i14, ", res=", "x", sbU);
        }
        if (!d.fuzzyEquals(f11, 1.0d, 0.001d)) {
            sbU.append(", par=");
            sbU.append(a1.formatInvariant("%.3f", Float.valueOf(f11)));
        }
        if (nVar != null && nVar.isValid()) {
            sbU.append(", color=");
            sbU.append(nVar.toLogString());
        }
        if (f10 != -1.0f) {
            sbU.append(", fps=");
            sbU.append(f10);
        }
        if (i13 != -1) {
            sbU.append(", maxSubLayers=");
            sbU.append(i13);
        }
        if (i12 != -1) {
            sbU.append(", channels=");
            sbU.append(i12);
        }
        if (i11 != -1) {
            sbU.append(", sample_rate=");
            sbU.append(i11);
        }
        if (str != null) {
            sbU.append(", language=");
            sbU.append(str);
        }
        if (!b5Var.isEmpty()) {
            sbU.append(", labels=[");
            d1VarOn.appendTo(sbU, (Iterable<?>) p8.transform(b5Var, new c(15)));
            sbU.append(C3191e4.i.f36531e);
        }
        if (i10 != 0) {
            sbU.append(", selectionFlags=[");
            d1VarOn.appendTo(sbU, (Iterable<?>) a1.getSelectionFlagStrings(i10));
            sbU.append(C3191e4.i.f36531e);
        }
        if (i17 != 0) {
            sbU.append(", roleFlags=[");
            d1VarOn.appendTo(sbU, (Iterable<?>) a1.getRoleFlagStrings(i17));
            sbU.append(C3191e4.i.f36531e);
        }
        if (obj != null) {
            sbU.append(", customData=");
            sbU.append(obj);
        }
        if ((i17 & 32768) != 0) {
            sbU.append(", auxiliaryTrackType=");
            sbU.append(a1.getAuxiliaryTrackTypeString(bVar.f60657g));
        }
        return sbU.toString();
    }

    public w buildUpon() {
        w wVar = new w();
        wVar.f58210a = this.f60651a;
        wVar.f58211b = this.f60652b;
        wVar.f58212c = this.f60653c;
        wVar.f58213d = this.f60654d;
        wVar.f58214e = this.f60655e;
        wVar.f58215f = this.f60656f;
        wVar.f58217h = this.f60658h;
        wVar.f58218i = this.f60659i;
        wVar.f58219j = this.f60661k;
        wVar.f58220k = this.f60662l;
        wVar.f58221l = this.f60663m;
        wVar.f58222m = this.f60664n;
        wVar.f58223n = this.f60665o;
        wVar.f58224o = this.f60666p;
        wVar.f58225p = this.f60667q;
        wVar.f58226q = this.f60668r;
        wVar.f58227r = this.f60669s;
        wVar.f58228s = this.f60670t;
        wVar.f58229t = this.f60671u;
        wVar.f58230u = this.f60672v;
        wVar.f58231v = this.f60673w;
        wVar.f58232w = this.f60674x;
        wVar.f58233x = this.f60675y;
        wVar.f58234y = this.f60676z;
        wVar.f58235z = this.A;
        wVar.A = this.B;
        wVar.B = this.C;
        wVar.C = this.D;
        wVar.D = this.E;
        wVar.E = this.F;
        wVar.F = this.G;
        wVar.G = this.H;
        wVar.H = this.I;
        wVar.I = this.J;
        wVar.J = this.K;
        wVar.K = this.L;
        wVar.L = this.M;
        wVar.M = this.N;
        return wVar;
    }

    public b copyWithCryptoType(int i10) {
        return buildUpon().setCryptoType(i10).build();
    }

    public boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        int i11 = this.O;
        return (i11 == 0 || (i10 = bVar.O) == 0 || i11 == i10) && this.f60655e == bVar.f60655e && this.f60656f == bVar.f60656f && this.f60657g == bVar.f60657g && this.f60658h == bVar.f60658h && this.f60659i == bVar.f60659i && this.f60666p == bVar.f60666p && this.f60670t == bVar.f60670t && this.f60672v == bVar.f60672v && this.f60673w == bVar.f60673w && this.f60675y == bVar.f60675y && this.B == bVar.B && this.D == bVar.D && this.E == bVar.E && this.F == bVar.F && this.G == bVar.G && this.H == bVar.H && this.I == bVar.I && this.J == bVar.J && this.L == bVar.L && this.M == bVar.M && this.N == bVar.N && Float.compare(this.f60674x, bVar.f60674x) == 0 && Float.compare(this.f60676z, bVar.f60676z) == 0 && Objects.equals(this.f60651a, bVar.f60651a) && Objects.equals(this.f60652b, bVar.f60652b) && this.f60653c.equals(bVar.f60653c) && Objects.equals(this.f60661k, bVar.f60661k) && Objects.equals(this.f60664n, bVar.f60664n) && Objects.equals(this.f60665o, bVar.f60665o) && Objects.equals(this.f60654d, bVar.f60654d) && Arrays.equals(this.A, bVar.A) && Objects.equals(this.f60662l, bVar.f60662l) && Objects.equals(this.C, bVar.C) && Objects.equals(this.f60669s, bVar.f60669s) && initializationDataEquals(bVar) && Objects.equals(this.f60663m, bVar.f60663m);
    }

    public int getPixelCount() {
        int i10;
        int i11 = this.f60672v;
        if (i11 == -1 || (i10 = this.f60673w) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public int hashCode() {
        if (this.O == 0) {
            String str = this.f60651a;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f60652b;
            int iHashCode2 = (this.f60653c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f60654d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f60655e) * 31) + this.f60656f) * 31) + this.f60657g) * 31) + this.f60658h) * 31) + this.f60659i) * 31;
            String str4 = this.f60661k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            u0 u0Var = this.f60662l;
            int iHashCode5 = (iHashCode4 + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
            Object obj = this.f60663m;
            int iHashCode6 = (iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
            String str5 = this.f60664n;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f60665o;
            this.O = ((((((((((((((((((((((Float.floatToIntBits(this.f60676z) + ((((Float.floatToIntBits(this.f60674x) + ((((((((((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f60666p) * 31) + ((int) this.f60670t)) * 31) + this.f60672v) * 31) + this.f60673w) * 31)) * 31) + this.f60675y) * 31)) * 31) + this.B) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.L) * 31) + this.M) * 31) + this.N;
        }
        return this.O;
    }

    public boolean initializationDataEquals(b bVar) {
        List list = this.f60668r;
        if (list.size() != bVar.f60668r.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) bVar.f60668r.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(Q, this.f60651a);
        bundle.putString(R, this.f60652b);
        bundle.putParcelableArrayList(f60648v0, f.toBundleArrayList(this.f60653c, new c(16)));
        bundle.putString(S, this.f60654d);
        bundle.putInt(T, this.f60655e);
        bundle.putInt(U, this.f60656f);
        int i10 = P.f60657g;
        int i11 = this.f60657g;
        if (i11 != i10) {
            bundle.putInt(f60649w0, i11);
        }
        bundle.putInt(V, this.f60658h);
        bundle.putInt(W, this.f60659i);
        bundle.putString(X, this.f60661k);
        bundle.putString(Y, this.f60664n);
        bundle.putString(Z, this.f60665o);
        bundle.putInt(f60627a0, this.f60666p);
        int i12 = 0;
        while (true) {
            List list = this.f60668r;
            if (i12 >= list.size()) {
                break;
            }
            bundle.putByteArray(f60628b0 + "_" + Integer.toString(i12, 36), (byte[]) list.get(i12));
            i12++;
        }
        bundle.putParcelable(f60629c0, this.f60669s);
        bundle.putLong(f60630d0, this.f60670t);
        bundle.putInt(f60631e0, this.f60672v);
        bundle.putInt(f60632f0, this.f60673w);
        bundle.putFloat(f60633g0, this.f60674x);
        bundle.putInt(f60634h0, this.f60675y);
        bundle.putFloat(f60635i0, this.f60676z);
        bundle.putByteArray(f60636j0, this.A);
        bundle.putInt(f60637k0, this.B);
        n nVar = this.C;
        if (nVar != null) {
            bundle.putBundle(f60638l0, nVar.toBundle());
        }
        bundle.putInt(f60650x0, this.D);
        bundle.putInt(f60639m0, this.E);
        bundle.putInt(f60640n0, this.F);
        bundle.putInt(f60641o0, this.G);
        bundle.putInt(f60642p0, this.H);
        bundle.putInt(f60643q0, this.I);
        bundle.putInt(f60644r0, this.J);
        bundle.putInt(f60646t0, this.L);
        bundle.putInt(f60647u0, this.M);
        bundle.putInt(f60645s0, this.N);
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f60651a);
        sb2.append(", ");
        sb2.append(this.f60652b);
        sb2.append(", ");
        sb2.append(this.f60664n);
        sb2.append(", ");
        sb2.append(this.f60665o);
        sb2.append(", ");
        sb2.append(this.f60661k);
        sb2.append(", ");
        sb2.append(this.f60660j);
        sb2.append(", ");
        sb2.append(this.f60654d);
        sb2.append(", [");
        sb2.append(this.f60672v);
        sb2.append(", ");
        sb2.append(this.f60673w);
        sb2.append(", ");
        sb2.append(this.f60674x);
        sb2.append(", ");
        sb2.append(this.C);
        sb2.append("], [");
        sb2.append(this.E);
        sb2.append(", ");
        return a.b.f(this.F, "])", sb2);
    }

    public b withManifestFormatInfo(b bVar) {
        String str;
        if (this == bVar) {
            return this;
        }
        int trackType = x0.getTrackType(this.f60665o);
        String str2 = bVar.f60651a;
        u0 u0VarCopyWithAppendedEntriesFrom = bVar.f60662l;
        b5 b5Var = bVar.f60653c;
        int i10 = bVar.L;
        int i11 = bVar.M;
        String str3 = bVar.f60652b;
        if (str3 == null) {
            str3 = this.f60652b;
        }
        if (b5Var.isEmpty()) {
            b5Var = this.f60653c;
        }
        if ((trackType != 3 && trackType != 1) || (str = bVar.f60654d) == null) {
            str = this.f60654d;
        }
        int i12 = this.f60658h;
        if (i12 == -1) {
            i12 = bVar.f60658h;
        }
        int i13 = this.f60659i;
        if (i13 == -1) {
            i13 = bVar.f60659i;
        }
        String str4 = this.f60661k;
        if (str4 == null) {
            String codecsOfType = a1.getCodecsOfType(bVar.f60661k, trackType);
            if (a1.splitCodecs(codecsOfType).length == 1) {
                str4 = codecsOfType;
            }
        }
        u0 u0Var = this.f60662l;
        if (u0Var != null) {
            u0VarCopyWithAppendedEntriesFrom = u0Var.copyWithAppendedEntriesFrom(u0VarCopyWithAppendedEntriesFrom);
        }
        float f10 = this.f60674x;
        if (f10 == -1.0f && trackType == 2) {
            f10 = bVar.f60674x;
        }
        int i14 = this.f60655e | bVar.f60655e;
        return buildUpon().setId(str2).setLabel(str3).setLabels(b5Var).setLanguage(str).setSelectionFlags(i14).setRoleFlags(this.f60656f | bVar.f60656f).setAverageBitrate(i12).setPeakBitrate(i13).setCodecs(str4).setMetadata(u0VarCopyWithAppendedEntriesFrom).setDrmInitData(DrmInitData.createSessionCreationData(bVar.f60669s, this.f60669s)).setFrameRate(f10).setTileCountHorizontal(i10).setTileCountVertical(i11).build();
    }
}
