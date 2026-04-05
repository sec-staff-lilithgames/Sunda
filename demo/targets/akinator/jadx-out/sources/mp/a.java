package mp;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import hp.c;
import hp.i;
import hp.r;
import hp.s;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.common.util.k;
import io.bidmachine.media3.common.util.m0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements s {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f74899d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f74900e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f74901a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f74902b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final m0 f74903c = new m0();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static in.b a(android.text.Spanned r13, java.lang.String r14) {
        /*
            in.a r0 = new in.a
            r0.<init>()
            in.a r13 = r0.setText(r13)
            if (r14 != 0) goto L10
            in.b r13 = r13.build()
            return r13
        L10:
            int r0 = r14.hashCode()
            r1 = 2
            r2 = 1
            java.lang.String r3 = "{\\an1}"
            java.lang.String r4 = "{\\an2}"
            java.lang.String r5 = "{\\an3}"
            java.lang.String r6 = "{\\an4}"
            java.lang.String r7 = "{\\an5}"
            java.lang.String r8 = "{\\an6}"
            java.lang.String r9 = "{\\an7}"
            java.lang.String r10 = "{\\an8}"
            java.lang.String r11 = "{\\an9}"
            r12 = 0
            switch(r0) {
                case -685620710: goto L62;
                case -685620679: goto L5d;
                case -685620648: goto L53;
                case -685620617: goto L4c;
                case -685620586: goto L47;
                case -685620555: goto L40;
                case -685620524: goto L39;
                case -685620493: goto L34;
                case -685620462: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L6c
        L2d:
            boolean r0 = r14.equals(r11)
            if (r0 == 0) goto L6c
            goto L59
        L34:
            boolean r0 = r14.equals(r10)
            goto L6c
        L39:
            boolean r0 = r14.equals(r9)
            if (r0 == 0) goto L6c
            goto L68
        L40:
            boolean r0 = r14.equals(r8)
            if (r0 == 0) goto L6c
            goto L59
        L47:
            boolean r0 = r14.equals(r7)
            goto L6c
        L4c:
            boolean r0 = r14.equals(r6)
            if (r0 == 0) goto L6c
            goto L68
        L53:
            boolean r0 = r14.equals(r5)
            if (r0 == 0) goto L6c
        L59:
            r13.setPositionAnchor(r1)
            goto L6f
        L5d:
            boolean r0 = r14.equals(r4)
            goto L6c
        L62:
            boolean r0 = r14.equals(r3)
            if (r0 == 0) goto L6c
        L68:
            r13.setPositionAnchor(r12)
            goto L6f
        L6c:
            r13.setPositionAnchor(r2)
        L6f:
            int r0 = r14.hashCode()
            switch(r0) {
                case -685620710: goto Lac;
                case -685620679: goto La5;
                case -685620648: goto L9e;
                case -685620617: goto L99;
                case -685620586: goto L94;
                case -685620555: goto L8f;
                case -685620524: goto L85;
                case -685620493: goto L7e;
                case -685620462: goto L77;
                default: goto L76;
            }
        L76:
            goto Lb6
        L77:
            boolean r14 = r14.equals(r11)
            if (r14 == 0) goto Lb6
            goto L8b
        L7e:
            boolean r14 = r14.equals(r10)
            if (r14 == 0) goto Lb6
            goto L8b
        L85:
            boolean r14 = r14.equals(r9)
            if (r14 == 0) goto Lb6
        L8b:
            r13.setLineAnchor(r12)
            goto Lb9
        L8f:
            boolean r14 = r14.equals(r8)
            goto Lb6
        L94:
            boolean r14 = r14.equals(r7)
            goto Lb6
        L99:
            boolean r14 = r14.equals(r6)
            goto Lb6
        L9e:
            boolean r14 = r14.equals(r5)
            if (r14 == 0) goto Lb6
            goto Lb2
        La5:
            boolean r14 = r14.equals(r4)
            if (r14 == 0) goto Lb6
            goto Lb2
        Lac:
            boolean r14 = r14.equals(r3)
            if (r14 == 0) goto Lb6
        Lb2:
            r13.setLineAnchor(r1)
            goto Lb9
        Lb6:
            r13.setLineAnchor(r2)
        Lb9:
            int r14 = r13.getPositionAnchor()
            float r14 = getFractionalPositionForAnchorType(r14)
            in.a r14 = r13.setPosition(r14)
            int r13 = r13.getLineAnchor()
            float r13 = getFractionalPositionForAnchorType(r13)
            in.a r13 = r14.setLine(r13, r12)
            in.b r13 = r13.build()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: mp.a.a(android.text.Spanned, java.lang.String):in.b");
    }

    public static long b(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = (Long.parseLong((String) io.bidmachine.media3.common.util.a.checkNotNull(matcher.group(i10 + 3))) * 1000) + (Long.parseLong((String) io.bidmachine.media3.common.util.a.checkNotNull(matcher.group(i10 + 2))) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L);
        String strGroup2 = matcher.group(i10 + 4);
        if (strGroup2 != null) {
            j10 += Long.parseLong(strGroup2);
        }
        return j10 * 1000;
    }

    public static float getFractionalPositionForAnchorType(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    @Override // hp.s
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // hp.s
    public /* bridge */ /* synthetic */ void parse(byte[] bArr, r rVar, k kVar) {
        super.parse(bArr, rVar, kVar);
    }

    @Override // hp.s
    public /* bridge */ /* synthetic */ i parseToLegacySubtitle(byte[] bArr, int i10, int i11) {
        return super.parseToLegacySubtitle(bArr, i10, i11);
    }

    @Override // hp.s
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // hp.s
    public void parse(byte[] bArr, int i10, int i11, r rVar, k kVar) throws NumberFormatException {
        String line;
        String str;
        a aVar = this;
        m0 m0Var = aVar.f74903c;
        m0Var.reset(bArr, i10 + i11);
        m0Var.setPosition(i10);
        Charset utfCharsetFromBom = m0Var.readUtfCharsetFromBom();
        if (utfCharsetFromBom == null) {
            utfCharsetFromBom = StandardCharsets.UTF_8;
        }
        long j10 = rVar.f59126a;
        long j11 = C.TIME_UNSET;
        ArrayList arrayList = (j10 == C.TIME_UNSET || !rVar.f59127b) ? null : new ArrayList();
        while (true) {
            String line2 = m0Var.readLine(utfCharsetFromBom);
            if (line2 == null) {
                break;
            }
            if (line2.length() != 0) {
                try {
                    Integer.parseInt(line2);
                    line = m0Var.readLine(utfCharsetFromBom);
                } catch (NumberFormatException unused) {
                    b0.w("SubripParser", "Skipping invalid index: ".concat(line2));
                }
                if (line == null) {
                    b0.w("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = f74899d.matcher(line);
                if (matcher.matches()) {
                    long jB = b(matcher, 1);
                    long jB2 = b(matcher, 6);
                    StringBuilder sb2 = aVar.f74901a;
                    sb2.setLength(0);
                    ArrayList arrayList2 = aVar.f74902b;
                    arrayList2.clear();
                    for (String line3 = m0Var.readLine(utfCharsetFromBom); !TextUtils.isEmpty(line3); line3 = m0Var.readLine(utfCharsetFromBom)) {
                        long j12 = j11;
                        if (sb2.length() > 0) {
                            sb2.append("<br>");
                        }
                        String strTrim = line3.trim();
                        StringBuilder sb3 = new StringBuilder(strTrim);
                        Matcher matcher2 = f74900e.matcher(strTrim);
                        int i12 = 0;
                        while (matcher2.find()) {
                            String strGroup = matcher2.group();
                            arrayList2.add(strGroup);
                            int iStart = matcher2.start() - i12;
                            int length = strGroup.length();
                            sb3.replace(iStart, iStart + length, "");
                            i12 += length;
                            matcher2 = matcher2;
                            jB2 = jB2;
                        }
                        sb2.append(sb3.toString());
                        j11 = j12;
                    }
                    long j13 = j11;
                    long j14 = jB2;
                    Spanned spannedFromHtml = Html.fromHtml(sb2.toString());
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i13);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    long j15 = rVar.f59126a;
                    if (j15 == j13 || jB >= j15) {
                        kVar.accept(new c(b5.of(a(spannedFromHtml, str)), jB, j14 - jB));
                    } else if (arrayList != null) {
                        arrayList.add(new c(b5.of(a(spannedFromHtml, str)), jB, j14 - jB));
                    }
                    aVar = this;
                    j11 = j13;
                } else {
                    b0.w("SubripParser", "Skipping invalid timing: ".concat(line));
                    aVar = this;
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                kVar.accept((c) it.next());
            }
        }
    }
}
