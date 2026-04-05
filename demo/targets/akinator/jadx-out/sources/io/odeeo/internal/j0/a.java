package io.odeeo.internal.j0;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import io.odeeo.internal.d0.e;
import io.odeeo.internal.d0.f;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.q0.q;
import io.odeeo.internal.q0.x;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends e {

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f64371q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f64372r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o, reason: collision with root package name */
    public final StringBuilder f64373o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList<String> f64374p;

    public a() {
        super("SubripDecoder");
        this.f64373o = new StringBuilder();
        this.f64374p = new ArrayList<>();
    }

    public static float b(int i10) {
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

    @Override // io.odeeo.internal.d0.e
    public f a(byte[] bArr, int i10, boolean z10) throws NumberFormatException {
        String str;
        ArrayList arrayList = new ArrayList();
        q qVar = new q();
        x xVar = new x(bArr, i10);
        while (true) {
            String line = xVar.readLine();
            int i11 = 0;
            if (line == null) {
                break;
            }
            if (line.length() != 0) {
                try {
                    Integer.parseInt(line);
                    String line2 = xVar.readLine();
                    if (line2 == null) {
                        p.w("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f64371q.matcher(line2);
                    if (matcher.matches()) {
                        qVar.add(a(matcher, 1));
                        qVar.add(a(matcher, 6));
                        this.f64373o.setLength(0);
                        this.f64374p.clear();
                        for (String line3 = xVar.readLine(); !TextUtils.isEmpty(line3); line3 = xVar.readLine()) {
                            if (this.f64373o.length() > 0) {
                                this.f64373o.append("<br>");
                            }
                            this.f64373o.append(a(line3, this.f64374p));
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.f64373o.toString());
                        while (true) {
                            if (i11 >= this.f64374p.size()) {
                                str = null;
                                break;
                            }
                            str = this.f64374p.get(i11);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i11++;
                        }
                        arrayList.add(a(spannedFromHtml, str));
                        arrayList.add(io.odeeo.internal.d0.a.f63544r);
                    } else {
                        p.w("SubripDecoder", "Skipping invalid timing: ".concat(line2));
                    }
                } catch (NumberFormatException unused) {
                    p.w("SubripDecoder", "Skipping invalid index: ".concat(line));
                }
            }
        }
        return new b((io.odeeo.internal.d0.a[]) arrayList.toArray(new io.odeeo.internal.d0.a[0]), qVar.toArray());
    }

    public final String a(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb2 = new StringBuilder(strTrim);
        Matcher matcher = f64372r.matcher(strTrim);
        int i10 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i10;
            int length = strGroup.length();
            sb2.replace(iStart, iStart + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

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
    public final io.odeeo.internal.d0.a a(android.text.Spanned r14, java.lang.String r15) {
        /*
            r13 = this;
            io.odeeo.internal.d0.a$b r0 = new io.odeeo.internal.d0.a$b
            r0.<init>()
            io.odeeo.internal.d0.a$b r14 = r0.setText(r14)
            if (r15 != 0) goto L10
            io.odeeo.internal.d0.a r14 = r14.build()
            return r14
        L10:
            int r0 = r15.hashCode()
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
            boolean r0 = r15.equals(r11)
            if (r0 == 0) goto L6c
            goto L59
        L34:
            boolean r0 = r15.equals(r10)
            goto L6c
        L39:
            boolean r0 = r15.equals(r9)
            if (r0 == 0) goto L6c
            goto L68
        L40:
            boolean r0 = r15.equals(r8)
            if (r0 == 0) goto L6c
            goto L59
        L47:
            boolean r0 = r15.equals(r7)
            goto L6c
        L4c:
            boolean r0 = r15.equals(r6)
            if (r0 == 0) goto L6c
            goto L68
        L53:
            boolean r0 = r15.equals(r5)
            if (r0 == 0) goto L6c
        L59:
            r14.setPositionAnchor(r1)
            goto L6f
        L5d:
            boolean r0 = r15.equals(r4)
            goto L6c
        L62:
            boolean r0 = r15.equals(r3)
            if (r0 == 0) goto L6c
        L68:
            r14.setPositionAnchor(r12)
            goto L6f
        L6c:
            r14.setPositionAnchor(r2)
        L6f:
            int r0 = r15.hashCode()
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
            boolean r15 = r15.equals(r11)
            if (r15 == 0) goto Lb6
            goto L8b
        L7e:
            boolean r15 = r15.equals(r10)
            if (r15 == 0) goto Lb6
            goto L8b
        L85:
            boolean r15 = r15.equals(r9)
            if (r15 == 0) goto Lb6
        L8b:
            r14.setLineAnchor(r12)
            goto Lb9
        L8f:
            boolean r15 = r15.equals(r8)
            goto Lb6
        L94:
            boolean r15 = r15.equals(r7)
            goto Lb6
        L99:
            boolean r15 = r15.equals(r6)
            goto Lb6
        L9e:
            boolean r15 = r15.equals(r5)
            if (r15 == 0) goto Lb6
            goto Lb2
        La5:
            boolean r15 = r15.equals(r4)
            if (r15 == 0) goto Lb6
            goto Lb2
        Lac:
            boolean r15 = r15.equals(r3)
            if (r15 == 0) goto Lb6
        Lb2:
            r14.setLineAnchor(r1)
            goto Lb9
        Lb6:
            r14.setLineAnchor(r2)
        Lb9:
            int r15 = r14.getPositionAnchor()
            float r15 = b(r15)
            io.odeeo.internal.d0.a$b r15 = r14.setPosition(r15)
            int r14 = r14.getLineAnchor()
            float r14 = b(r14)
            io.odeeo.internal.d0.a$b r14 = r15.setLine(r14, r12)
            io.odeeo.internal.d0.a r14 = r14.build()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.j0.a.a(android.text.Spanned, java.lang.String):io.odeeo.internal.d0.a");
    }

    public static long a(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = (Long.parseLong((String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(i10 + 3))) * 1000) + (Long.parseLong((String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(i10 + 2))) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L);
        String strGroup2 = matcher.group(i10 + 4);
        if (strGroup2 != null) {
            j10 += Long.parseLong(strGroup2);
        }
        return j10 * 1000;
    }
}
