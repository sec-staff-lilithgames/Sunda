package vn;

import android.util.Base64;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ep.y;
import gn.z0;
import go.b0;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.util.a1;
import io.ktor.http.LinkHeader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final h f89494a;

    /* renamed from: b, reason: collision with root package name */
    public final f f89495b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f89453c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f89455d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f89457e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f89459f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f89461g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f89463h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f89465i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f89467j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f89469k = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f89471l = Pattern.compile("SUPPLEMENTAL-CODECS=\"(.+?)\"");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f89473m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f89475n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f89477o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f89479p = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f89481q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f89483r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f89485s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f89487t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f89488u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f89489v = a("CAN-SKIP-DATERANGES");

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f89490w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f89491x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f89492y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f89493z = a("CAN-BLOCK-RELOAD");
    public static final Pattern A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern D = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern E = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern L = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern M = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern N = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern O = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern P = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern Q = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern R = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern S = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern T = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern U = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern V = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern W = a("AUTOSELECT");
    public static final Pattern X = a("DEFAULT");
    public static final Pattern Y = a("FORCED");
    public static final Pattern Z = a("INDEPENDENT");

    /* renamed from: a0, reason: collision with root package name */
    public static final Pattern f89451a0 = a("GAP");

    /* renamed from: b0, reason: collision with root package name */
    public static final Pattern f89452b0 = a("PRECISE");

    /* renamed from: c0, reason: collision with root package name */
    public static final Pattern f89454c0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: d0, reason: collision with root package name */
    public static final Pattern f89456d0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: e0, reason: collision with root package name */
    public static final Pattern f89458e0 = Pattern.compile("[:,]ID=\"(.+?)\"");

    /* renamed from: f0, reason: collision with root package name */
    public static final Pattern f89460f0 = Pattern.compile("CLASS=\"(.+?)\"");

    /* renamed from: g0, reason: collision with root package name */
    public static final Pattern f89462g0 = Pattern.compile("START-DATE=\"(.+?)\"");

    /* renamed from: h0, reason: collision with root package name */
    public static final Pattern f89464h0 = Pattern.compile("CUE=\"(.+?)\"");

    /* renamed from: i0, reason: collision with root package name */
    public static final Pattern f89466i0 = Pattern.compile("END-DATE=\"(.+?)\"");

    /* renamed from: j0, reason: collision with root package name */
    public static final Pattern f89468j0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* renamed from: k0, reason: collision with root package name */
    public static final Pattern f89470k0 = a("END-ON-NEXT");

    /* renamed from: l0, reason: collision with root package name */
    public static final Pattern f89472l0 = Pattern.compile("X-ASSET-URI=\"(.+?)\"");

    /* renamed from: m0, reason: collision with root package name */
    public static final Pattern f89474m0 = Pattern.compile("X-ASSET-LIST=\"(.+?)\"");

    /* renamed from: n0, reason: collision with root package name */
    public static final Pattern f89476n0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: o0, reason: collision with root package name */
    public static final Pattern f89478o0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* renamed from: p0, reason: collision with root package name */
    public static final Pattern f89480p0 = Pattern.compile("X-SNAP=\"(.+?)\"");

    /* renamed from: q0, reason: collision with root package name */
    public static final Pattern f89482q0 = Pattern.compile("X-RESTRICT=\"(.+?)\"");

    /* renamed from: r0, reason: collision with root package name */
    public static final Pattern f89484r0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: s0, reason: collision with root package name */
    public static final Pattern f89486s0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends IOException {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final BufferedReader f89496a;

        /* renamed from: b, reason: collision with root package name */
        public final Queue f89497b;

        /* renamed from: c, reason: collision with root package name */
        public String f89498c;

        public b(Queue<String> queue, BufferedReader bufferedReader) {
            this.f89497b = queue;
            this.f89496a = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {LinkHeader.Rel.Next}, result = true)
        public boolean hasNext() throws IOException {
            String strTrim;
            if (this.f89498c != null) {
                return true;
            }
            Queue queue = this.f89497b;
            if (!queue.isEmpty()) {
                this.f89498c = (String) io.bidmachine.media3.common.util.a.checkNotNull((String) queue.poll());
                return true;
            }
            do {
                String line = this.f89496a.readLine();
                this.f89498c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f89498c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public String next() throws IOException {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f89498c;
            this.f89498c = null;
            return str;
        }
    }

    public j() {
        this(h.f89428n, null);
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static DrmInitData b(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i10 = 0; i10 < schemeDataArr.length; i10++) {
            schemeDataArr2[i10] = schemeDataArr[i10].copyWithData(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    public static DrmInitData.SchemeData c(String str, String str2, HashMap map) throws z0 {
        String strI = i(str, M, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = N;
        if (zEquals) {
            String strJ = j(str, pattern, map);
            return new DrmInitData.SchemeData(gn.l.f57987d, MimeTypes.VIDEO_MP4, Base64.decode(strJ.substring(strJ.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new DrmInitData.SchemeData(gn.l.f57987d, "hls", a1.getUtf8Bytes(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strI)) {
            return null;
        }
        String strJ2 = j(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strJ2.substring(strJ2.indexOf(44)), 0);
        UUID uuid = gn.l.f57988e;
        return new DrmInitData.SchemeData(uuid, MimeTypes.VIDEO_MP4, y.buildPsshAtom(uuid, bArrDecode));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0731 A[PHI: r25
      0x0731: PHI (r25v34 int) = (r25v30 int), (r25v31 int), (r25v32 int), (r25v35 int) binds: [B:274:0x0756, B:270:0x0749, B:266:0x073b, B:263:0x072f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x09b6  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0a25  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0a64  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static vn.f d(vn.h r106, vn.f r107, vn.j.b r108, java.lang.String r109) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vn.j.d(vn.h, vn.f, vn.j$b, java.lang.String):vn.f");
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) io.bidmachine.media3.common.util.a.checkNotNull(matcher.group(1))) : d10;
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Long.parseLong((String) io.bidmachine.media3.common.util.a.checkNotNull(matcher.group(1)));
        }
        return -1L;
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) io.bidmachine.media3.common.util.a.checkNotNull(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : k(str2, map);
    }

    public static String j(String str, Pattern pattern, Map map) throws z0 {
        String strI = i(str, pattern, null, map);
        if (strI != null) {
            return strI;
        }
        throw z0.createForMalformedManifest("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(String str, Map map) {
        Matcher matcher = f89484r0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public j(h hVar, f fVar) {
        this.f89494a = hVar;
        this.f89495b = fVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0239  */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static vn.h e(vn.j.b r38, java.lang.String r39) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vn.j.e(vn.j$b, java.lang.String):vn.h");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:44:0x0098, B:46:0x00a0, B:48:0x00a8, B:50:0x00b0, B:52:0x00b8, B:54:0x00c0, B:56:0x00c8, B:58:0x00d0, B:61:0x00da, B:62:0x00de, B:67:0x0100, B:68:0x0106, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:71:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x004f A[SYNTHETIC] */
    @Override // go.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vn.i parse(android.net.Uri r7, java.io.InputStream r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vn.j.parse(android.net.Uri, java.io.InputStream):vn.i");
    }
}
