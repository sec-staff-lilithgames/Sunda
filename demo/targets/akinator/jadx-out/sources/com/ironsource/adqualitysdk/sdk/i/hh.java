package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.http.SslError;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.adqualitysdk.sdk.i.az;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class hh extends WebViewClient implements az.e, ci {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2487 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2488;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2489;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2490;

    /* renamed from: ｋ, reason: contains not printable characters */
    private WebViewClient f2491;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private WebViewClient f2492;

    static {
        char[] cArr = new char[IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID];
        com.google.android.gms.internal.play_billing.a.y("\u0000\u001f\u000eÒ\u001dÔ,ã;ÝJÖYÅhòwÜ\u0086Ö\u0095Û¤Ó³ÈÂÿÑßàÚï×þÕ\rÇ\u001cÑ+Ë:Ñ¶Õ¸\u001d«\u001c\u009a\u0002\u008d\u001eüKï\u0003Þ\u0007ÁH0\n#2\u0012\u0007\u0005(t\ng\u0011V\u0015Y\u0005H\u0011»\u001bª\u000f\u009d\\\u008c\bÿ\u0012î\u0016Ñ\rÀ\u001b3\u0012\":\u0015\u0002\u0004\u0016w\u0000f\u0003i\u0019X+K+º\u0018\u00ad>\u009c'\u008f\u0006þ&á)Ð#Ã/2+%#\u0014k\u00077v3y,hvÕ¬ÛdÈeù{îg\u009f2\u008cz½~¢1Ss@Pqnft\u0017}\u0004r5v:Z+jØnÉaþkïv\u009c#\u008ds²i£aPzA`vigE\u0014}\u0005m\n{;D(^ÙPÎPÿgìA\u009d\\\u0082}³Q ^QXFTwTd\\\u0015\u0010\u001aL\u000bT8K)\rt¾zviwXiOu> -h\u001cl\u0003#òaáYÐlÇC¶a¥z\u0094~\u009bn\u008azyphd_7Nc=y,}\u0013f\u0002pñyàQ×iÆ}µk¤h«r\u009a@\u0089@xsoU^LMm<M#B\u0012H\u0001Dð@çHÖ\u0000Å[´O»ZªA\u0099P\u0088E\u007fCn\u0019T÷Z?I>x o<\u001ei\r!<%#jÒ(Á\u000bð5ç/\u0096&\u0085)´-»\u0001ª1Y5H:\u007f0n-\u001dx\f(32\":Ñ!À;÷2æ\u001e\u0095&\u00846\u008b º\u001f©\u0005X\u000bO\u000b~<m\u001a\u001c\u0007\u0003&2\n!\u0005Ð\u0003Ç\u000fö\u000få\u0007\u0094K\u009b\u0010\u008a\u0018¹\r¨\n_\u001bN\n}\flR\u0000E\u000e\u008d\u001d\u008c,\u0092;\u008eJÛY\u0093h\u0097wØ\u0086\u009a\u0095¢¤\u0097³¸Â\u009aÑ\u0081à\u0085ï\u0095þ\u0081\r\u008b\u001c\u009f+Ì:\u0084I\u0084X¹g\u0089v\u0080\u0085\u0083\u0094¶£\u0090²\u0082Á\u0090Ð\u0095ß\u0085î»æ~è¶û·Ê©Ýµ¬à¿¨\u008e¬\u0091ã`¡s\u0099B¬U\u0083$¡7º\u0006¾\t®\u0018ºë°ú¤Í÷Ü¿¯¿¾\u0082\u0081²\u0090»c¸r\u0098E¶T¶'°6©9³\b\u0081\u001b\u0081C\u008eMF^GoYxE\t\u0010\u001aX+\\4\u0013ÅQÖiç\\ðs\u0081Q\u0092J£N¬^½JN@_Th\u0007yO\nO\u001bn$L5MÆI×|àJñ[\u0082F\u0093_\u009cY\u00adw¾p\u0000E\u000e\u008d\u001d\u008c,\u0092;\u008eJÛY\u0093h\u0097wØ\u0086\u009a\u0095¢¤\u0097³¸Â\u009aÑ\u0081à\u0085ï\u0095þ\u0081\r\u008b\u001c\u009f+Ì:\u0098I\u0082X\u0086g\u009dv\u008b\u0085\u0082\u0094¬£\u008a²\u0097Á\u0087Ð\u0093ß\u0083îºý®\f©\u001b\u008e*¾9«H¬W½f¤u¢ÕrÛºÈ»ù¥î¹\u009fì\u008c¤½ ¢ïS\u00ad@\u0095q f\u008f\u0017\u00ad\u0004¶5²:¢+¶Ø¼É¨þûï³\u009c³\u008d\u008a²°£¿P\u009cA³v½g\u00ad\u0014\u0087\u0005³\n³;\u0081(\u009bÙ\u008fÎ\u0088ÿ\u0098ì\u009e\u0000E\u000e\u008d\u001d\u008c,\u0092;\u008eJÛY\u0093h\u0097wØ\u0086\u009a\u0095¢¤\u0097³¸Â\u009aÑ\u0081à\u0085ï\u0095þ\u0081\r\u008b\u001c\u009f+Ì:\u0084I\u0084X»g\u008dv\u0084\u0085\u0083\u0094\u008c£\u0092²\u0086Á\u0086Ð¤ß\u0092î\u00adý±\f¯\u0000E\u000e\u008d\u001d\u008c,\u0092;\u008eJÛY\u0093h\u0097wØ\u0086\u009a\u0095¢¤\u0097³¸Â\u009aÑ\u0081à\u0085ï\u0095þ\u0081\r\u008b\u001c\u009f+Ì:\u0084I\u0084X¯g\u0087v\u0095\u0085\u008b\u0094·£\u0081²\u0090Á\u0097Ð\u0083ß\u008dî¶ý\u00ad\f®\u001bµ*´9´\u0000E\u000e\u008d\u001d\u008c,\u0092;\u008eJÛY\u0093h\u0097wØ\u0086\u0098\u0095\u0098¤³³\u009bÂ\u0081Ñ\u009fà£ï\u0095þ\u009c\r\u009b\u001c\u008f+\u0081:\u0082I\u0099X\u009ag\u0081v\u0088\u0085\u0088\u0000E\u000e\u008d\u001d\u008c,\u0092;\u008eJÛY\u0093h\u0097wØ\u0086\u009a\u0095¢¤\u0097³¸Â\u009aÑ\u0081à\u0085ï\u0095þ\u0081\r\u008b\u001c\u009f+Ì:\u008fI\u0085X¼g\u0098v\u0083\u0085\u0087\u0094\u0091£\u0081²µÁ\u008bÐ\u0092ß\u0089î«ý»\f¹\u001b\u0094*²9©H\u00adW·f¥u¯\u0000E\u000e\u008d\u001d\u008c,\u0092;\u008eJÛY\u0093h\u0097wØ\u0086\u009a\u0095¢¤\u0097³¸Â\u009aÑ\u0081à\u0085ï\u0095þ\u0081\r\u008b\u001c\u009f+Ì:\u0084I\u0084X»g\u008dv\u0084\u0085\u0083\u0094\u008c£\u0092²\u0086Á\u0086Ð²ß\u0093î³ý\u009b\f¯\u001b®*´9¨\u0000E\u000e\u008d\u001d\u008c,\u0092;\u008eJÛY\u0093h\u0097wØ\u0086\u009a\u0095¢¤\u0097³¸Â\u009aÑ\u0081à\u0085ï\u0095þ\u0081\r\u008b\u001c\u009f+Ì:\u0084I\u0084X»g\u008dv\u0084\u0085\u0083\u0094\u008c£\u0092²\u0086Á\u0086Ð¢ß\u008cî¶ý»\f³\u001b¨*\u00989¿H«W¬f\u0085u³\u0084¤\u0093¡¢¶±¡À¥\u0095¦\u009bn\u0088o¹q®mß8Ìpýtâ;\u0013w\u0000t1z&{WyD\u007fuuz3kc\u0098\u007f\u0089g¾h¯aÜgÍ*òdãj\u0010W\u0001c6d'eThEtJf{Xh~\u0099R\u008eV¿]¬WÝNÂxóQàG\u0011B\u0006e7U$@UGZVK_xY L®\u0084½\u0085\u008c\u009b\u009b\u0087êÒù\u009aÈ\u009e×Ñ&\u00935«\u0004\u009e\u0013±b\u0093q\u0088@\u008cO\u009c^\u0088\u00ad\u0082¼\u0096\u008bÅ\u009a\u008dé\u008dø²Ç\u0084Ö\u008d%\u008a4\u0085\u0003\u009b\u0012\u008fa\u008fp \u007f\u009dN¢]§¬\u0095» \u008a¦\u0099»è\u0082÷´Æ¯Õª$¹3®\u0002®>`0¨#©\u0012·\u0005«tþg¶V²Iý¸¿«\u0087\u009a²\u008d\u009dü¿ï¤Þ Ñ°À¤3®\"º\u0015é\u0004½w§f£Y¸H®»§ª\u008f\u009d·\u008c£ÿµî¶á¬Ð\u009eÃ\u009e2³%\u009c\u0014\u0087\u0007ºv\u008ai\u0098X\u009cK\u0087 ´.|=}\fc\u001b\u007fj*ybHfW)¦kµS\u0084f\u0093IâkñpÀtÏdÞp-z<n\u000b=\u001auiuxMGwV~¥v´z\u0083q\u0092~ávðtÿZÎKÝV,i;[\nO\u0019Eh\\\u0000E\u000e\u008d\u001d\u008c,\u0092;\u008eJÛY\u0093h\u0097wØ\u0086\u009a\u0095¢¤\u0097³¸Â\u009aÑ\u0081à\u0085ï\u0095þ\u0081\r\u008b\u001c\u009f+Ì:\u0084I\u0084Xºg\u008bv\u0086\u0085\u008a\u0094\u0080£§²\u008bÁ\u0083Ð\u008fß\u0087îºýºQ×_\u001fL\u001e}\u0000j\u001c\u001bI\b\u00019\u0005&J×\bÄ0õ\u0005â*\u0093\b\u0080\u0013±\u0017¾\u0007¯\u0013\\\u0019M\rz^k\u0016\u0018\u0016\t)6\u001f'\u0016Ô\u0011Å\u001eò\u0000ã\u0014\u0090\u0014\u0081?\u008e\u001d¿*¬%]!J\u001c{,h9\u0019>\u0006/76$0\u0093¨\u009d`\u008ea¿\u007f¨cÙ6Ê~ûzä5\u0015w\u0006O7z UQwBlsh|xml\u009ef\u008fr¸!©iÚiËVô`åi\u0016n\u0007a0\u007f!kRkCDLy}FnC\u009fu\u0088C¹DªXÛFI\u009aGRTSeMrQ\u0003\u0004\u0010L!H>\u0007ÏEÜ}íHúg\u008bE\u0098^©Z¦J·^DTU@b\u0013s[\u0000[\u0011d.R?VÌ]Ý_êIûl\u0088O\u0099Q\u0096\\§e´rEqRDckpk\u0001cÑyß\u0084Ì\u0094ý´ê\u0090\u009b\u0084\u0088\u0094¹\u0097¦\u0083W\u008dD¿u\u008eb\u0088\u0013»\u0000\u00851\u008a>\u0099/²Ü\u009cÍ\u009aú\u0097ë\u009b\u0098\u0080×\u0099ÙdÊtûWì`\u009dR\u008ea¿e PQ`Bms|dI\u0015a\u0006e7j8`)e", "ISO-8859-1", cArr, 0, IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID);
        f2488 = cArr;
        f2489 = -5850815110886846721L;
    }

    public hh(WebViewClient webViewClient, WebViewClient webViewClient2) {
        this.f2491 = webViewClient;
        this.f2492 = webViewClient2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private WebViewClient m2573() {
        int i10 = f2487 + 75;
        f2490 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f2491;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean m2575() {
        WebViewClient webViewClient = this.f2491;
        if (webViewClient == null) {
            return false;
        }
        f2487 = (f2490 + 99) % 128;
        if (webViewClient.getClass().equals(WebViewClient.class)) {
            return false;
        }
        f2487 = (f2490 + 43) % 128;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r10 == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m2576(android.webkit.WebView r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.hh.f2490
            int r0 = r0 + 13
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.hh.f2487 = r1
            int r0 = r0 % 2
            r1 = -1
            r3 = 0
            if (r0 != 0) goto L1d
            android.webkit.WebViewClient r0 = r7.f2492     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.shouldOverrideUrlLoading(r8, r9)     // Catch: java.lang.Throwable -> L1b
            r4 = 75
            int r4 = r4 / r3
            if (r0 != 0) goto L27
            goto L25
        L1b:
            r10 = move-exception
            goto L44
        L1d:
            android.webkit.WebViewClient r0 = r7.f2492     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.shouldOverrideUrlLoading(r8, r9)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L27
        L25:
            if (r10 == 0) goto L85
        L27:
            android.webkit.WebViewClient r10 = r7.f2491     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r10 instanceof com.ironsource.adqualitysdk.sdk.i.hh     // Catch: java.lang.Throwable -> L1b
            r4 = 1
            if (r0 == 0) goto L43
            int r0 = com.ironsource.adqualitysdk.sdk.i.hh.f2487
            int r0 = r0 + 115
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.hh.f2490 = r0
            com.ironsource.adqualitysdk.sdk.i.hh r10 = (com.ironsource.adqualitysdk.sdk.i.hh) r10     // Catch: java.lang.Throwable -> L1b
            r10.m2576(r8, r9, r4)     // Catch: java.lang.Throwable -> L1b
            int r8 = com.ironsource.adqualitysdk.sdk.i.hh.f2490
            int r8 = r8 + 65
            int r8 = r8 % 128
            com.ironsource.adqualitysdk.sdk.i.hh.f2487 = r8
        L43:
            return r4
        L44:
            java.lang.String r0 = ""
            r4 = 48
            int r0 = android.text.TextUtils.indexOf(r0, r4, r3)
            int r0 = r0 + 73
            char r0 = (char) r0
            int r5 = android.view.Gravity.getAbsoluteGravity(r3, r3)
            int r5 = r5 + 22
            int r6 = android.view.KeyEvent.getDeadChar(r3, r3)
            java.lang.String r0 = m2574(r0, r5, r6)
            java.lang.String r0 = r0.intern()
            long r5 = android.os.SystemClock.currentThreadTimeMillis()
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r6 = 46735(0xb68f, float:6.549E-41)
            int r5 = r5 + r6
            char r5 = (char) r5
            int r6 = android.view.ViewConfiguration.getScrollBarSize()
            int r6 = r6 >> 8
            int r6 = r6 + 50
            char r4 = android.text.AndroidCharacter.getMirror(r4)
            int r4 = r4 + (-26)
            java.lang.String r4 = m2574(r5, r6, r4)
            java.lang.String r4 = r4.intern()
            com.ironsource.adqualitysdk.sdk.i.kd.m3203(r0, r4, r10, r3)
        L85:
            boolean r10 = r7.m2575()
            if (r10 == 0) goto Le0
            int r10 = com.ironsource.adqualitysdk.sdk.i.hh.f2490
            int r10 = r10 + 103
            int r10 = r10 % 128
            com.ironsource.adqualitysdk.sdk.i.hh.f2487 = r10
            android.webkit.WebViewClient r10 = r7.f2491     // Catch: java.lang.Throwable -> L9a
            boolean r8 = r10.shouldOverrideUrlLoading(r8, r9)     // Catch: java.lang.Throwable -> L9a
            return r8
        L9a:
            r10 = move-exception
            long r4 = android.os.SystemClock.currentThreadTimeMillis()
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            int r0 = r0 + 71
            char r0 = (char) r0
            long r1 = android.os.SystemClock.elapsedRealtime()
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            int r1 = r1 + 21
            int r2 = android.view.ViewConfiguration.getScrollBarSize()
            int r2 = r2 >> 8
            java.lang.String r0 = m2574(r0, r1, r2)
            java.lang.String r0 = r0.intern()
            int r1 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r1 = r1 >> 16
            r2 = 54761(0xd5e9, float:7.6737E-41)
            int r1 = r1 + r2
            char r1 = (char) r1
            r2 = 16777268(0x1000034, float:2.3510033E-38)
            int r4 = android.graphics.Color.rgb(r3, r3, r3)
            int r4 = r4 + r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            int r2 = 72 - r2
            java.lang.String r1 = m2574(r1, r4, r2)
            java.lang.String r1 = r1.intern()
            com.ironsource.adqualitysdk.sdk.i.kd.m3203(r0, r1, r10, r3)
        Le0:
            boolean r8 = super.shouldOverrideUrlLoading(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hh.m2576(android.webkit.WebView, java.lang.String, boolean):boolean");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Object m2577() {
        int i10 = f2487 + 23;
        f2490 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f2492;
        }
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        try {
            this.f2492.doUpdateVisitedHistory(webView, str, z10);
            f2487 = (f2490 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        } catch (Throwable th2) {
            kd.m3203(m2574((char) (TextUtils.getOffsetBefore("", 0) + 72), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, Color.alpha(0)).intern(), m2574((char) (Process.myTid() >> 22), 43 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 521).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2491;
        if (webViewClient == null) {
            super.doUpdateVisitedHistory(webView, str, z10);
            int i10 = f2490 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f2487 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i11 = f2487 + 65;
        f2490 = i11 % 128;
        if (i11 % 2 == 0) {
            webViewClient.doUpdateVisitedHistory(webView, str, z10);
        } else {
            webViewClient.doUpdateVisitedHistory(webView, str, z10);
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        try {
            this.f2492.onFormResubmission(webView, message, message2);
        } catch (Throwable th2) {
            kd.m3203(m2574((char) ('x' - AndroidCharacter.getMirror('0')), TextUtils.indexOf("", "") + 22, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1).intern(), m2574((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 38 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 456 - TextUtils.getCapsMode("", 0, 0)).intern(), th2, false);
        }
        try {
            WebViewClient webViewClient = this.f2491;
            if (webViewClient != null) {
                f2487 = (f2490 + 19) % 128;
                webViewClient.onFormResubmission(webView, message, message2);
                return;
            }
            super.onFormResubmission(webView, message, message2);
            int i10 = f2487 + 19;
            f2490 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (Error e10) {
            kd.m3203(m2574((char) (MotionEvent.axisFromString("") + 73), TextUtils.lastIndexOf("", '0', 0) + 23, Color.blue(0)).intern(), m2574((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 27 - (ViewConfiguration.getTouchSlop() >> 8), 494 - ExpandableListView.getPackedPositionChild(0L)).intern(), e10, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        f2490 = (f2487 + 83) % 128;
        try {
            this.f2492.onLoadResource(webView, str);
        } catch (Throwable th2) {
            kd.m3203(m2574((char) (72 - TextUtils.indexOf("", "", 0)), Color.alpha(0) + 22, View.combineMeasuredStates(0, 0)).intern(), m2574((char) (17355 - View.MeasureSpec.getSize(0)), ImageFormat.getBitsPerPixel(0) + 36, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + Sdk.SDKError.Reason.AD_EXPIRED_VALUE).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2491;
        if (webViewClient == null) {
            super.onLoadResource(webView, str);
            int i10 = f2487 + 11;
            f2490 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i11 = f2490 + 79;
        f2487 = i11 % 128;
        if (i11 % 2 != 0) {
            webViewClient.onLoadResource(webView, str);
        } else {
            webViewClient.onLoadResource(webView, str);
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        int i10 = f2487 + 97;
        f2490 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m3203(m2574((char) (72 - View.resolveSize(0, 0)), (ViewConfiguration.getTapTimeout() >> 16) + 22, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1).intern(), m2574((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 34, Color.green(0) + 234).intern(), th2, false);
        }
        if (i10 % 2 != 0) {
            this.f2492.onPageCommitVisible(webView, str);
            throw null;
        }
        this.f2492.onPageCommitVisible(webView, str);
        WebViewClient webViewClient = this.f2491;
        if (webViewClient == null) {
            super.onPageCommitVisible(webView, str);
        } else {
            webViewClient.onPageCommitVisible(webView, str);
            f2490 = (f2487 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        int i10 = f2490 + 25;
        f2487 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m3203(m2574((char) ((Process.myTid() >> 22) + 72), View.combineMeasuredStates(0, 0) + 22, TextUtils.lastIndexOf("", '0') + 1).intern(), m2574((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 58939), 34 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf("", "", 0) + 268).intern(), th2, false);
        }
        if (i10 % 2 == 0) {
            this.f2492.onPageFinished(webView, str);
            throw null;
        }
        this.f2492.onPageFinished(webView, str);
        WebViewClient webViewClient = this.f2491;
        if (webViewClient == null) {
            super.onPageFinished(webView, str);
            return;
        }
        int i11 = f2490 + 27;
        f2487 = i11 % 128;
        if (i11 % 2 != 0) {
            webViewClient.onPageFinished(webView, str);
        } else {
            webViewClient.onPageFinished(webView, str);
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        f2490 = (f2487 + 21) % 128;
        try {
            this.f2492.onPageStarted(webView, str, bitmap);
        } catch (Throwable th2) {
            kd.m3203(m2574((char) (72 - View.MeasureSpec.getMode(0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 22, View.combineMeasuredStates(0, 0)).intern(), m2574((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), KeyEvent.getDeadChar(0, 0) + 34, (ViewConfiguration.getFadingEdgeLength() >> 16) + 234).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2491;
        if (webViewClient == null) {
            super.onPageStarted(webView, str, bitmap);
            return;
        }
        f2487 = (f2490 + 33) % 128;
        webViewClient.onPageStarted(webView, str, bitmap);
        int i10 = f2487 + 51;
        f2490 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        int i10 = f2487 + 39;
        f2490 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m3203(m2574((char) ('x' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getTapTimeout() >> 16) + 22, KeyEvent.getMaxKeyCode() >> 16).intern(), m2574((char) (ViewConfiguration.getEdgeSlop() >> 16), Color.green(0) + 48, View.getDefaultSize(0, 0) + 604).intern(), th2, false);
        }
        if (i10 % 2 != 0) {
            this.f2492.onReceivedClientCertRequest(webView, clientCertRequest);
            throw null;
        }
        this.f2492.onReceivedClientCertRequest(webView, clientCertRequest);
        try {
            WebViewClient webViewClient = this.f2491;
            if (webViewClient == null) {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
                return;
            }
            int i11 = f2487 + 31;
            f2490 = i11 % 128;
            if (i11 % 2 == 0) {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            } else {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
                int i12 = 13 / 0;
            }
        } catch (Throwable th3) {
            kd.m3203(m2574((char) (72 - ExpandableListView.getPackedPositionType(0L)), 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), m2574((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 38371), TextUtils.lastIndexOf("", '0') + 52, 652 - TextUtils.getOffsetAfter("", 0)).intern(), th3, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        f2490 = (f2487 + 109) % 128;
        try {
            this.f2492.onReceivedError(webView, i10, str, str2);
            f2490 = (f2487 + 101) % 128;
        } catch (Throwable th2) {
            kd.m3203(m2574((char) (TextUtils.indexOf("", "") + 72), 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), m2574((char) TextUtils.getOffsetBefore("", 0), Color.alpha(0) + 36, 420 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2491;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, i10, str, str2);
        } else {
            super.onReceivedError(webView, i10, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        try {
            this.f2492.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            f2490 = (f2487 + 83) % 128;
        } catch (Throwable th2) {
            kd.m3203(m2574((char) (72 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22, (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), m2574((char) (40969 - TextUtils.getCapsMode("", 0, 0)), View.combineMeasuredStates(0, 0) + 46, 703 - View.combineMeasuredStates(0, 0)).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2491;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        int i10 = f2490 + 49;
        f2487 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i10 = f2487 + 15;
        f2490 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m3203(m2574((char) (72 - (Process.myTid() >> 22)), 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1).intern(), m2574((char) (TextUtils.lastIndexOf("", '0') + 37870), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 39, 910 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), th2, false);
        }
        if (i10 % 2 != 0) {
            this.f2492.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            throw null;
        }
        this.f2492.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        WebViewClient webViewClient = this.f2491;
        if (webViewClient != null) {
            f2487 = (f2490 + 15) % 128;
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } else {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            f2487 = (f2490 + 25) % 128;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        int i10 = f2490 + 61;
        f2487 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f2492.onReceivedLoginRequest(webView, str, str2, str3);
                int i11 = 35 / 0;
            } else {
                this.f2492.onReceivedLoginRequest(webView, str, str2, str3);
            }
        } catch (Throwable th2) {
            kd.m3203(m2574((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 73), TextUtils.indexOf("", "") + 22, ViewConfiguration.getMinimumFlingVelocity() >> 16).intern(), m2574((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 20882), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 44, 867 - ExpandableListView.getPackedPositionType(0L)).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2491;
        if (webViewClient == null) {
            super.onReceivedLoginRequest(webView, str, str2, str3);
            f2487 = (f2490 + 43) % 128;
            return;
        }
        int i12 = f2490 + 23;
        f2487 = i12 % 128;
        if (i12 % 2 != 0) {
            webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
        } else {
            webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        try {
            this.f2492.onReceivedSslError(webView, sslErrorHandler, sslError);
        } catch (Throwable th2) {
            kd.m3203(m2574((char) (Gravity.getAbsoluteGravity(0, 0) + 72), 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ViewConfiguration.getWindowTouchSlop() >> 8).intern(), m2574((char) Color.alpha(0), 40 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.indexOf("", "", 0) + 565).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2491;
        if (webViewClient != null) {
            f2490 = (f2487 + 65) % 128;
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        int i10 = f2490 + 109;
        f2487 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 84 / 0;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i10 = f2490 + 79;
        f2487 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m3203(m2574((char) ((KeyEvent.getMaxKeyCode() >> 16) + 72), (KeyEvent.getMaxKeyCode() >> 16) + 22, Drawable.resolveOpacity(0, 0)).intern(), m2574((char) (18911 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 40 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf("", "") + 950).intern(), th2, false);
        }
        if (i10 % 2 == 0) {
            this.f2492.onRenderProcessGone(webView, renderProcessGoneDetail);
            throw null;
        }
        this.f2492.onRenderProcessGone(webView, renderProcessGoneDetail);
        WebViewClient webViewClient = this.f2491;
        if (webViewClient != null) {
            return webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        int i11 = f2490 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f2487 = i11 % 128;
        if (i11 % 2 != 0) {
            return true;
        }
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f10, float f11) {
        try {
            this.f2492.onScaleChanged(webView, f10, f11);
        } catch (Throwable th2) {
            kd.m3203(m2574((char) (71 - TextUtils.lastIndexOf("", '0')), TextUtils.getOffsetBefore("", 0) + 22, KeyEvent.getDeadChar(0, 0)).intern(), m2574((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 35 - Color.argb(0, 0, 0, 0), TextUtils.getOffsetAfter("", 0) + 832).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2491;
        if (webViewClient != null) {
            int i10 = f2490 + 5;
            f2487 = i10 % 128;
            if (i10 % 2 != 0) {
                webViewClient.onScaleChanged(webView, f10, f11);
                return;
            } else {
                webViewClient.onScaleChanged(webView, f10, f11);
                throw null;
            }
        }
        super.onScaleChanged(webView, f10, f11);
        int i11 = f2490 + 51;
        f2487 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 70 / 0;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        try {
            this.f2492.onTooManyRedirects(webView, message, message2);
            f2487 = (f2490 + 77) % 128;
        } catch (Throwable th2) {
            kd.m3203(m2574((char) ((KeyEvent.getMaxKeyCode() >> 16) + 72), (ViewConfiguration.getWindowTouchSlop() >> 8) + 22, ViewConfiguration.getMaximumFlingVelocity() >> 16).intern(), m2574((char) (TextUtils.lastIndexOf("", '0') + 54584), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 38, View.getDefaultSize(0, 0) + 381).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2491;
        if (webViewClient != null) {
            f2490 = (f2487 + 57) % 128;
            webViewClient.onTooManyRedirects(webView, message, message2);
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
        int i10 = f2487 + 13;
        f2490 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 70 / 0;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        int i10 = f2490 + 71;
        f2487 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m3203(m2574((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 72), 22 - (KeyEvent.getMaxKeyCode() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1).intern(), m2574((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8432), 40 - TextUtils.indexOf("", "", 0, 0), 792 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), th2, false);
        }
        if (i10 % 2 == 0) {
            this.f2492.onUnhandledKeyEvent(webView, keyEvent);
            throw null;
        }
        this.f2492.onUnhandledKeyEvent(webView, keyEvent);
        f2487 = (f2490 + 99) % 128;
        WebViewClient webViewClient = this.f2491;
        if (webViewClient == null) {
            super.onUnhandledKeyEvent(webView, keyEvent);
        } else {
            f2487 = (f2490 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
            webViewClient.onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        f2490 = (f2487 + 63) % 128;
        try {
            this.f2492.shouldInterceptRequest(webView, str);
        } catch (Throwable th2) {
            kd.m3203(m2574((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 72), 22 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0) + 1).intern(), m2574((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), KeyEvent.keyCodeFromString("") + 43, 338 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2491;
        if (webViewClient == null) {
            return super.shouldInterceptRequest(webView, str);
        }
        WebResourceResponse webResourceResponseShouldInterceptRequest = webViewClient.shouldInterceptRequest(webView, str);
        f2487 = (f2490 + 5) % 128;
        return webResourceResponseShouldInterceptRequest;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        f2490 = (f2487 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        try {
            this.f2492.shouldOverrideKeyEvent(webView, keyEvent);
            f2487 = (f2490 + 5) % 128;
        } catch (Throwable th2) {
            kd.m3203(m2574((char) (72 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), View.combineMeasuredStates(0, 0)).intern(), m2574((char) (ExpandableListView.getPackedPositionType(0L) + 15909), 43 - TextUtils.indexOf("", ""), (ViewConfiguration.getTapTimeout() >> 16) + 749).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2491;
        return webViewClient != null ? webViewClient.shouldOverrideKeyEvent(webView, keyEvent) : super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        f2487 = (f2490 + 107) % 128;
        boolean zM2576 = m2576(webView, str, false);
        f2490 = (f2487 + 13) % 128;
        return zM2576;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2574(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f2488[i11 + i12] ^ (i12 * f2489)) ^ c10);
                        c.f1374 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean m2578(WebView webView, WebResourceRequest webResourceRequest, boolean z10) {
        try {
            if (this.f2492.shouldOverrideUrlLoading(webView, webResourceRequest) || z10) {
                WebViewClient webViewClient = this.f2491;
                if (webViewClient instanceof hh) {
                    f2487 = (f2490 + 87) % 128;
                    ((hh) webViewClient).m2578(webView, webResourceRequest, true);
                    f2487 = (f2490 + 77) % 128;
                }
                return true;
            }
        } catch (Throwable th2) {
            kd.m3203(m2574((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 72), Color.alpha(0) + 22, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1).intern(), m2574((char) ((KeyEvent.getMaxKeyCode() >> 16) + 29947), 53 - ExpandableListView.getPackedPositionChild(0L), 124 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), th2, false);
        }
        WebViewClient webViewClient2 = this.f2491;
        if (webViewClient2 != null) {
            int i10 = f2490 + 101;
            f2487 = i10 % 128;
            try {
                if (i10 % 2 != 0) {
                    return webViewClient2.shouldOverrideUrlLoading(webView, webResourceRequest);
                }
                int i11 = 65 / 0;
                return webViewClient2.shouldOverrideUrlLoading(webView, webResourceRequest);
            } catch (Throwable th3) {
                kd.m3203(m2574((char) (73 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 22 - ExpandableListView.getPackedPositionType(0L), ViewConfiguration.getPressedStateDuration() >> 16).intern(), m2574((char) (21681 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 56, View.resolveSize(0, 0) + 178).intern(), th3, false);
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        int i10 = f2490 + 93;
        f2487 = i10 % 128;
        int i11 = i10 % 2;
        return m2578(webView, webResourceRequest, false);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        f2490 = (f2487 + 67) % 128;
        try {
            this.f2492.shouldInterceptRequest(webView, webResourceRequest);
        } catch (Throwable th2) {
            kd.m3203(m2574((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 71), 22 - View.resolveSize(0, 0), ViewConfiguration.getDoubleTapTimeout() >> 16).intern(), m2574((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 44 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 338).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2491;
        if (webViewClient != null) {
            f2490 = (f2487 + 15) % 128;
            return webViewClient.shouldInterceptRequest(webView, webResourceRequest);
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        f2490 = (f2487 + 29) % 128;
        try {
            this.f2492.onReceivedError(webView, webResourceRequest, webResourceError);
        } catch (Throwable th2) {
            kd.m3203(m2574((char) ('x' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22, ViewConfiguration.getLongPressTimeout() >> 16).intern(), m2574((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 36 - View.resolveSizeAndState(0, 0, 0), 420 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2491;
        if (webViewClient == null) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            return;
        }
        webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
        int i10 = f2490 + 81;
        f2487 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 13 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ci
    /* renamed from: ﾒ */
    public final Object mo1170(String str, List<Object> list, ch chVar) {
        f2490 = (f2487 + 75) % 128;
        int iHashCode = str.hashCode();
        if (iHashCode == 368095040) {
            if (!str.equals(m2574((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 55294), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + TTAdConstant.IMAGE_MODE_1012).intern())) {
                return null;
            }
            f2487 = (f2490 + 11) % 128;
            return m2577();
        }
        if (iHashCode != 381550901 || !str.equals(m2574((char) (53534 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23, 990 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
            return null;
        }
        f2487 = (f2490 + 25) % 128;
        return m2573();
    }
}
