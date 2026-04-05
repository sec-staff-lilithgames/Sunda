package lf;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import ef.i;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends i {

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f73365p = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f73366q = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: n, reason: collision with root package name */
    public final StringBuilder f73367n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f73368o;

    public a() {
        super("SubripDecoder");
        this.f73367n = new StringBuilder();
        this.f73368o = new ArrayList();
    }

    public static long d(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = (Long.parseLong((String) com.google.android.exoplayer2.util.a.checkNotNull(matcher.group(i10 + 3))) * 1000) + (Long.parseLong((String) com.google.android.exoplayer2.util.a.checkNotNull(matcher.group(i10 + 2))) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L);
        String strGroup2 = matcher.group(i10 + 4);
        if (strGroup2 != null) {
            j10 += Long.parseLong(strGroup2);
        }
        return j10 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x021c, code lost:
    
        return new lf.b((ef.b[]) r2.toArray(new ef.b[0]), r3.toArray());
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015d, code lost:
    
        if (r10.equals("{\\an9}") != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0165, code lost:
    
        if (r10.equals("{\\an8}") != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016c, code lost:
    
        if (r10.equals("{\\an7}") != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016f, code lost:
    
        r6.setLineAnchor(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0172, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0188, code lost:
    
        if (r10.equals("{\\an3}") != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0190, code lost:
    
        if (r10.equals("{\\an2}") != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0197, code lost:
    
        if (r10.equals("{\\an1}") != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x019a, code lost:
    
        r6.setLineAnchor(2);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011e  */
    @Override // ef.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ef.j c(byte[] r18, int r19, boolean r20) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.a.c(byte[], int, boolean):ef.j");
    }
}
