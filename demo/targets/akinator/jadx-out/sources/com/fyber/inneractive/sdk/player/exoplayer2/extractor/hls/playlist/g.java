package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.c0;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.util.DesugarTimeZone;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f24854a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f24855b = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f24856c = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f24857d = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f24858e = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f24859f = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f24860g = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f24861h = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f24862i = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f24863j = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f24864k = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f24865l = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f24866m = Pattern.compile("METHOD=(NONE|AES-128)");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f24867n = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f24868o = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f24869p = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f24870q = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f24871r = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f24872s = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f24873t = Pattern.compile("AUTOSELECT".concat("=(NO|YES)"));

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f24874u = Pattern.compile("DEFAULT".concat("=(NO|YES)"));

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f24875v = Pattern.compile("FORCED".concat("=(NO|YES)"));

    public static d b(f fVar, String str) throws r, NumberFormatException {
        String str2;
        long j10;
        int i10;
        f fVar2 = fVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str3 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean zEquals = false;
        long j11 = -9223372036854775807L;
        c cVar = null;
        String strB = null;
        String strA = null;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = -1;
        int i14 = 1;
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        boolean z11 = false;
        long j17 = -9223372036854775807L;
        while (fVar2.a()) {
            if (fVar2.a()) {
                str2 = fVar2.f24853c;
                fVar2.f24853c = str3;
            } else {
                str2 = str3;
            }
            if (str2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strB2 = b(str2, f24860g);
                if ("VOD".equals(strB2)) {
                    fVar2 = fVar;
                    str3 = null;
                    i11 = 1;
                } else if ("EVENT".equals(strB2)) {
                    fVar2 = fVar;
                    str3 = null;
                    i11 = 2;
                } else {
                    j10 = j17;
                }
            } else {
                if (str2.startsWith("#EXT-X-START")) {
                    j17 = (long) (Double.parseDouble(b(str2, f24863j)) * 1000000.0d);
                } else {
                    if (str2.startsWith("#EXT-X-MAP")) {
                        String strB3 = b(str2, f24867n);
                        String strA2 = a(str2, f24865l);
                        if (strA2 != null) {
                            String[] strArrSplit = strA2.split("@");
                            j16 = Long.parseLong(strArrSplit[0]);
                            if (strArrSplit.length > 1) {
                                j13 = Long.parseLong(strArrSplit[1]);
                            }
                        }
                        c cVar2 = new c(strB3, 0L, -1, C.TIME_UNSET, false, null, null, j13, j16);
                        fVar2 = fVar;
                        j13 = 0;
                        j16 = -1;
                        cVar = cVar2;
                    } else if (str2.startsWith("#EXT-X-TARGETDURATION")) {
                        j11 = 1000000 * Integer.parseInt(b(str2, f24858e));
                    } else if (str2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        i12 = Integer.parseInt(b(str2, f24861h));
                        fVar2 = fVar;
                        i16 = i12;
                    } else if (str2.startsWith("#EXT-X-VERSION")) {
                        i14 = Integer.parseInt(b(str2, f24859f));
                    } else if (str2.startsWith("#EXTINF")) {
                        fVar2 = fVar;
                        j14 = (long) (Double.parseDouble(b(str2, f24862i)) * 1000000.0d);
                    } else if (str2.startsWith("#EXT-X-KEY")) {
                        zEquals = "AES-128".equals(b(str2, f24866m));
                        if (zEquals) {
                            strB = b(str2, f24867n);
                            strA = a(str2, f24868o);
                        } else {
                            fVar2 = fVar;
                            str3 = null;
                            strB = null;
                            strA = null;
                        }
                    } else if (str2.startsWith("#EXT-X-BYTERANGE")) {
                        String[] strArrSplit2 = b(str2, f24864k).split("@");
                        j16 = Long.parseLong(strArrSplit2[0]);
                        if (strArrSplit2.length > 1) {
                            j13 = Long.parseLong(strArrSplit2[1]);
                        }
                    } else if (str2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                        i15 = Integer.parseInt(str2.substring(str2.indexOf(58) + 1));
                        z10 = true;
                    } else if (str2.equals("#EXT-X-DISCONTINUITY")) {
                        i13++;
                    } else if (!str2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                        j10 = j17;
                        if (str2.startsWith("#EXT-X-DATERANGE")) {
                            arrayList2.add(str2);
                        } else if (str2.startsWith("#")) {
                            if (str2.equals("#EXT-X-ENDLIST")) {
                                fVar2 = fVar;
                                z11 = true;
                            }
                            j17 = j10;
                        } else {
                            String hexString = !zEquals ? null : strA != null ? strA : Integer.toHexString(i12);
                            int i17 = i12 + 1;
                            long j18 = j16 == -1 ? 0L : j13;
                            arrayList.add(new c(str2, j14, i13, j15, zEquals, strB, hexString, j18, j16));
                            j15 += j14;
                            if (j16 != -1) {
                                j18 += j16;
                            }
                            j13 = j18;
                            i12 = i17;
                            j14 = 0;
                            j16 = -1;
                            j17 = j10;
                            str3 = null;
                            fVar2 = fVar;
                        }
                    } else if (j12 == 0) {
                        String strSubstring = str2.substring(str2.indexOf(58) + 1);
                        Matcher matcher = z.f26075f.matcher(strSubstring);
                        if (!matcher.matches()) {
                            throw new r(a.b.k("Invalid date/time format: ", strSubstring));
                        }
                        if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                            i10 = 0;
                        } else {
                            i10 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                            if (matcher.group(11).equals("-")) {
                                i10 *= -1;
                            }
                        }
                        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
                        gregorianCalendar.clear();
                        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                        if (TextUtils.isEmpty(matcher.group(8))) {
                            j10 = j17;
                        } else {
                            j10 = j17;
                            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                        }
                        long timeInMillis = gregorianCalendar.getTimeInMillis();
                        if (i10 != 0) {
                            timeInMillis -= i10 * DtbConstants.NETWORK_READ_TIMEOUT;
                        }
                        int i18 = com.fyber.inneractive.sdk.player.exoplayer2.b.f24611a;
                        j12 = (timeInMillis == C.TIME_UNSET ? -9223372036854775807L : timeInMillis * 1000) - j15;
                    } else {
                        j10 = j17;
                    }
                    str3 = null;
                }
                fVar2 = fVar;
                str3 = null;
            }
            fVar2 = fVar;
            j17 = j10;
            str3 = null;
        }
        return new d(i11, str, j17, j12, z10, i15, i16, i14, j11, z11, j12 != 0, cVar, arrayList, arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:3:0x000f, B:5:0x0017, B:7:0x001f, B:9:0x0027, B:36:0x006f, B:37:0x0076, B:14:0x0032, B:16:0x0038, B:20:0x0041, B:22:0x0049, B:25:0x0056, B:27:0x005c, B:31:0x0063, B:32:0x0068, B:38:0x0077, B:40:0x007d, B:43:0x0088, B:45:0x0090, B:46:0x00a1, B:48:0x00a9, B:50:0x00b1, B:52:0x00b9, B:54:0x00c1, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:63:0x00e2, B:64:0x00e6), top: B:71:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0050 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e a(android.net.Uri r7, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.g.a(android.net.Uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j):com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.f r45, java.lang.String r46) throws com.fyber.inneractive.sdk.player.exoplayer2.r, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.g.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.f, java.lang.String):com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b");
    }

    public static String b(String str, Pattern pattern) throws r {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        throw new r("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String a(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}
