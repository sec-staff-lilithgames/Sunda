package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
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
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.az;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class hk extends WebChromeClient implements az.e, ci {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2512 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2513;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2514;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2515;

    /* renamed from: ｋ, reason: contains not printable characters */
    private WebChromeClient f2516;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private WebChromeClient f2517;

    static {
        char[] cArr = new char[1100];
        com.google.android.gms.internal.play_billing.a.y("\u0000WK\u001f\u0096\u0096â--\u0080y\u0010Ä³\u0010;[µ§\tò¨>W\u0089ÝÕ\\ Ølb·Å\u0003yNû\u009a|åé1v|\u0013Ç\u0084\u0083»Èö\u0015xaÿ®dú¼GK\u0093ÆØ\u000e$Ùqn½¢\n\nV¥£!ï¬4;\u0080\u008aÍ\u000f\u0019\u0082fV²\u0093ÿìDX\u0090üÝ{)ývRÂÃ\u000f_[Á {ìÖ9%\u0085¤Ò7\u001e³k8\u0016¥]è\u0080fôá;zo¢ÒU\u0006ØM\u0010±Çäp(¼\u009f\u0014Ã»6?z²¡%\u0015\u0094X\u0011\u008c\u009cóH'\u008djòÑD\u0005õHi¼áãWWÎ\u009aWÎÈ5ryÉ¬.\u0010¸G+÷\u0087¼ÊaD\u0015ÃÚX\u008e\u00803wçú¬2På\u0005RÉ\u009e~6\"\u0099×\u001d\u009b\u0090@\u0007ô¶¹3m¾\u0012jÆ¯\u008bÐ0fä×©K]Ã\u0002u¶ì{u/êÔM\u0098áM\u0017ñ\u0098èò£¿~1\n¶Å-\u0091õ,\u0002ø\u008f³GO\u0090\u001a'ÖëaC=ìÈh\u0084å_rëÃ¦FrË\r\u001fÙÚ\u0094¥/\u0013û¢¶>B¶\u001d\u0000©\u0099d\u00000\u009fË%\u0087\u0098Rxîà¹quÖ\u0000vÜÄ\u0097O#òþO\u008aß\u0000EK\b\u0096\u0086â\u0001-\u009ayBÄµ\u00108[ð§'ò\u0090>\\\u0089ôÕ[ ßlR·Å\u0003tNñ\u009a|å¨1m|\u0012Ç¥\u0013\u0018^\u0085ª\u0013õ\u009dA-\u008c¡Ø8#©o-ºì\u0006]QË\u009d_Gµ\føÑv¥ñjj>²\u0083EWÈ\u001c\u0000à×µ`y¬Î\u0004\u0092«g/+¢ð5D\u0084\t\u0001Ý\u008c¢Xv\u009d;â\u0080NTé\u0019~íñ²m\u0006ÝËQ\u009fÈdY(Ýý\u001cA\u00ad\u0016;Ú¯Ë\t\u0080D]Ê)MæÖ²\u000e\u000fùÛt\u0090¼lk9Üõ\u0010B¸\u001e\u0017ë\u0093§\u001e|\u0089È8\u0085½Q0.äú!·^\fùØN\u0095ÃaI>æ\u008aqGÉ\u0013ièä¤hq\u0099Í\u000f\u0000EK\b\u0096\u0086â\u0001-\u009ayBÄµ\u00108[ð§'ò\u0090>\\\u0089ôÕ[ ßlR·Å\u0003tNñ\u009a|å¨1m|\u0012Ç¤\u0013\u0015^\u009bª\u0011õ»A+\u008c¦Ø\n#©o#ºÏ\u0006G.Áe\u008c¸\u0002Ì\u0085\u0003\u001eWÆê1>¼ut\u0089£Ü\u0014\u0010Ø§pûß\u000e[BÖ\u0099A-ð`u´øË,\u001féR\u0096é1=\u0098p\u0001\u0084\u0093Û?o\u008b¢?ö¦\r&A«\u0094I\u0000EK\b\u0096\u0086â\u0001-\u009ayBÄµ\u00108[ð§'ò\u0090>\\\u0089ôÕ[ ßlR·Å\u0003tNñ\u009a|å¨1m|\u0012Ç¼\u0013\u0003^«ª\bõ»A*\u008c¦øX³\u0015n\u009b\u001a\u001cÕ\u0087\u0081_<¨è%£í_:\n\u008dÆAqé-FØÂ\u0094OOØûi¶ìba\u001dµÉp\u0084\u000f?¡ë\u001e¦´R\u0016\r\u00ad¹#t¦ #Û¶\u0000EK\b\u0096\u0086â\u0001-\u009ayBÄµ\u00108[ð§'ò\u0090>\\\u0089ôÕ[ ßlR·Å\u0003tNñ\u009a|å¨1m|\u0012Ç¼\u0013\u0003^ºª\u0016õ±A5\u008c¢Ø8\u0000EK\b\u0096\u0086â\u0001-\u009ayBÄµ\u00108[ð§'ò\u0090>\\\u0089ôÕ[ ßlR·Å\u0003tNñ\u009a|å¨1m|\u0012Ç¼\u0013\u0003^¨ª\u0001õ¸A7\u008c Ø)#\u0093o.ºÖ\u0006[QÏ\u009dL\u0000EK\b\u0096\u0086â\u0001-\u009ayBÄµ\u00108[ð§'ò\u0090>\\\u0089ôÕ[ ßlR·Å\u0003tNñ\u009a|å¨1m|\u0012Ç³\u0013\b^\u0089ª\u0001õ»A<\u008c·Ø(#\u0082o!ºÎ\u0006UQÌ\u009dIèÑ4y\u007fÇËe\u0016åbp\u00ad\u001f\u0000EK\b\u0096\u0086â\u0001-\u009ayBÄµ\u00108[ð§'ò\u0090>\\\u0089ôÕ[ ßlR·Å\u0003tNñ\u009a|å¨1m|\u0012Ç±\u0013\u0015^\u0085ª\bõ±A;\u008c³Ø8#¯o/ºÔ\u0006dQË\u009dZèÏ4u\u007fåËc\u0016ãbk\u00ad\u0010ø\u008bD!\u008f\u0084Û\t&\u0097r\n½¦\t!T¥ 2ëÈáèª¥w+\u0003¬Ì7\u0098ï%\u0018ñ\u0095º]F\u008a\u0013=ßñhY4öÁr\u008dÿVhâÙ¯\\{Ñ\u0004\u0005ÐÀ\u009d¿&\u001cò¸¿(K¥\u0014\u001c \u0096m\u001e9\u0095Â\u0002\u008e\u0082[yçÉ°f|÷\tbÕØ\u009eH*Î÷N\u0083ÆL½\u0019&¥\u0097n(:¯Ç(\u0093§\\\u000bè\u008cµ\bA\u009f\ne\u0000EK\b\u0096\u0086â\u0001-\u009ayBÄµ\u00108[ð§'ò\u0090>\\\u0089ôÕ[ ßlR·Å\u0003tNñ\u009a|å¨1m|\u0012Ç¦\u0013\u0015^\u0098ª\tõ·A+\u008c¡Ø%#©o.ºè\u0006QQß\u009d]èÇ4o\u007fâ\u0000EK\b\u0096\u0086â\u0001-\u009ayBÄµ\u00108[ð§)ò¥>R\u0089ÔÕ[ ÂlA·\u0080\u0003uNæ\u009agåï1k|\u0012ÇÖ\u0013\u001f^\u0084ª4õ»A*\u008c¿Ø%#µo3ºÓ\u0006[QÀ\u009dzèÇ4m\u007fãËu\u0016ùbp\u009bRÐ\u001f\r\u0091y\u0016¶\u008dâU_¢\u008b/Àç<0i\u0087¥K\u0012ãNL»È÷E,Ò\u0098cÕæ\u0001k~¿ªzç\u0005\\±\u0088\u0002Å\u008f1\u001en Ú<\u0017¶C2¸¾ô9!ÿ\u009dFÊÈ\u0006JsÐ¯xäõPD\u008düù}6\nc\u008aß\t\u0014\u009e@\u0015©~â3?½K:\u0084¡Ðym\u008e¹\u0003òË\u000e\u0012[\u009e\u0097i ï|`\u0089ùÅz\u001e»ªNçÝ3\\LÔ\u0098PÕ)níº$÷¿\u0003\u000f\\\u0080è\u0011%\u0084q\u001e\u008a\u008eÆ\b\u0013è¯`øû4AAü\u009dVÖØbN¿ÂËK\u0004\u0006Q¢í'&´r8\u008f·Û\u0004\u0014\u008b\u0000EK\b\u0096\u0086â\u0001-\u009ayBÄµ\u00108[ð§'ò\u0090>\\\u0089ôÕ[ ßlR·Å\u0003tNñ\u009a|å¨1m|\u0012Ç¼\u0013\u0003^¾ª\rõ³A=\u008c½Ø9#²\u0000EK\b\u0096\u0086â\u0001-\u009ayBÄµ\u00108[ð§'ò\u0090>\\\u0089ôÕ[ ßlR·Å\u0003tNñ\u009a|å¨1m|\u0012Çµ\u0013\u001f^\u0084ª\u0017õ±A4\u008c·Ø\u0001#£o3ºÉ\u0006UQÉ\u009dM×\"\u009coAá5fúý®%\u0013ÒÇ_\u008c\u0097p@%÷é;^\u0093\u0002<÷¸»5`¢Ô\u0013\u0099\u0096M\u001b2Ïæ\u0002«~\u0010åÄS\u0089è}e\"Ø\u0096J[Ù\u000f_ô÷¸Nm¹Ñ6\u0086¦J\u001f?ªã\b¨\u0085\u001c\u0012Á\u009f ,ka¶ïÂh\róY+äÜ0Q{\u0099\u0087NÒù\u001e5©\u009dõ2\u0000¶L;\u0097¬#\u001dn\u0098º\u0015ÅÁ\u0011\f\\pçë3O~ê\u008aiÕÒa^¬÷øJ\u0003ÎOM\u009aº&3q ½\u0011È¹\u0014\u001a_\u0098ë\u000b6\u0086B\u001e\u008ddØÇdr¯àûx¢\u0099éÔ4Z@Ý\u008fFÛ\u009efi²äù,\u0005ûPL\u009c\u0080+(w\u0087\u0082\u0003Î\u008e\u0015\u0019¡¨ì-8 Gt\u0093¹ÞÅe^±úü_\bËWkãð.kzô\u0081RÍõ\u0018\u0015¤\u009có\u001d?\u0086J\u0007\u0000EK\b\u0096\u0086â\u0001-\u009ayBÄµ\u00108[ð§'ò\u0090>\\\u0089ôÕ[ ßlR·Å\u0003tNñ\u009a|å¨1m|\u0012Ç¥\u0013\u0018^\u0085ª\u0013õ\u0098A1\u008c¾Ø)#\u0085o(ºÕ\u0006[QÝ\u009dMèÐOÛ\u0004£Ù<\u00ad\u0085b&6¿\u008b\u0010_\u009a\u0014\tè\u0092½/qçÆf\u009aÍox#èøsLË\u0001MÕñªX~×3¥\u0088$\\¸\u0000gK\u001f\u0096\u0080â:-\u008ay5Ä¹\u00104[\u0093§\"ò¶>Q\u0089ÕÕW ïlJ·É\u0003\u007fNú\u009az", "ISO-8859-1", cArr, 0, 1100);
        f2513 = cArr;
        f2514 = -3465604994163651718L;
    }

    public hk(WebChromeClient webChromeClient, WebChromeClient webChromeClient2) {
        this.f2517 = webChromeClient;
        this.f2516 = webChromeClient2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private WebChromeClient m2584() {
        int i10 = (f2515 + 21) % 128;
        f2512 = i10;
        WebChromeClient webChromeClient = this.f2517;
        f2515 = (i10 + 31) % 128;
        return webChromeClient;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Object m2585() {
        int i10 = f2515 + 33;
        int i11 = i10 % 128;
        f2512 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        WebChromeClient webChromeClient = this.f2516;
        f2515 = (i11 + 75) % 128;
        return webChromeClient;
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        f2515 = (f2512 + 71) % 128;
        try {
            this.f2516.getDefaultVideoPoster();
        } catch (Throwable th2) {
            kd.m3203(m2586((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 23 - Process.getGidForName(""), (-16777216) - Color.rgb(0, 0, 0)).intern(), m2586((char) (ExpandableListView.getPackedPositionType(0L) + 55143), 42 - Color.green(0), 890 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient == null) {
            return super.getDefaultVideoPoster();
        }
        f2515 = (f2512 + 39) % 128;
        return webChromeClient.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        try {
            this.f2516.getVideoLoadingProgressView();
        } catch (Throwable th2) {
            kd.m3203(m2586((char) Color.green(0), 24 - KeyEvent.keyCodeFromString(""), ViewConfiguration.getKeyRepeatDelay() >> 16).intern(), m2586((char) (Color.blue(0) + 8297), 48 - (ViewConfiguration.getPressedStateDuration() >> 16), 931 - View.MeasureSpec.getSize(0)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient == null) {
            return super.getVideoLoadingProgressView();
        }
        f2515 = (f2512 + 55) % 128;
        View videoLoadingProgressView = webChromeClient.getVideoLoadingProgressView();
        f2515 = (f2512 + 29) % 128;
        return videoLoadingProgressView;
    }

    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        int i10 = f2512 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f2515 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f2516.getVisitedHistory(valueCallback);
                int i11 = 73 / 0;
            } else {
                this.f2516.getVisitedHistory(valueCallback);
            }
        } catch (Throwable th2) {
            kd.m3203(m2586((char) ((Process.getThreadPriority(0) + 20) >> 6), 24 - (ViewConfiguration.getTapTimeout() >> 16), (-1) - TextUtils.indexOf((CharSequence) "", '0')).intern(), m2586((char) (41692 - Gravity.getAbsoluteGravity(0, 0)), 38 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getTouchSlop() >> 8) + 979).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient != null) {
            webChromeClient.getVisitedHistory(valueCallback);
            return;
        }
        super.getVisitedHistory(valueCallback);
        int i12 = f2512 + 39;
        f2515 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        f2515 = (f2512 + 71) % 128;
        try {
            this.f2516.onCloseWindow(webView);
        } catch (Throwable th2) {
            kd.m3203(m2586((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 24, ExpandableListView.getPackedPositionType(0L)).intern(), m2586((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 11909), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 33, 320 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient == null) {
            super.onCloseWindow(webView);
            return;
        }
        webChromeClient.onCloseWindow(webView);
        int i10 = f2512 + 55;
        f2515 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 20 / 0;
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onConsoleMessage(String str, int i10, String str2) {
        f2515 = (f2512 + 31) % 128;
        try {
            this.f2516.onConsoleMessage(str, i10, str2);
        } catch (Throwable th2) {
            kd.m3203(m2586((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 24, TextUtils.lastIndexOf("", '0', 0) + 1).intern(), m2586((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 853).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient == null) {
            super.onConsoleMessage(str, i10, str2);
            return;
        }
        int i11 = f2512 + 83;
        f2515 = i11 % 128;
        if (i11 % 2 == 0) {
            webChromeClient.onConsoleMessage(str, i10, str2);
        } else {
            webChromeClient.onConsoleMessage(str, i10, str2);
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        f2512 = (f2515 + 111) % 128;
        try {
            this.f2516.onCreateWindow(webView, z10, z11, message);
        } catch (Throwable th2) {
            kd.m3203(m2586((char) (Process.getGidForName("") + 1), 24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.resolveSize(0, 0)).intern(), m2586((char) (ImageFormat.getBitsPerPixel(0) + 52045), 35 - Drawable.resolveOpacity(0, 0), 249 - TextUtils.indexOf((CharSequence) "", '0')).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient == null) {
            return super.onCreateWindow(webView, z10, z11, message);
        }
        f2515 = (f2512 + 77) % 128;
        boolean zOnCreateWindow = webChromeClient.onCreateWindow(webView, z10, z11, message);
        int i10 = f2515 + 33;
        f2512 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 30 / 0;
        }
        return zOnCreateWindow;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        try {
            this.f2516.onExceededDatabaseQuota(str, str2, j10, j11, j12, quotaUpdater);
            f2515 = (f2512 + 45) % 128;
        } catch (Throwable th2) {
            kd.m3203(m2586((char) (KeyEvent.getMaxKeyCode() >> 16), 24 - View.getDefaultSize(0, 0), ViewConfiguration.getPressedStateDuration() >> 16).intern(), m2586((char) (ViewConfiguration.getTapTimeout() >> 16), 43 - MotionEvent.axisFromString(""), ImageFormat.getBitsPerPixel(0) + 485).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient != null) {
            webChromeClient.onExceededDatabaseQuota(str, str2, j10, j11, j12, quotaUpdater);
        } else {
            super.onExceededDatabaseQuota(str, str2, j10, j11, j12, quotaUpdater);
            f2512 = (f2515 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        try {
            this.f2516.onGeolocationPermissionsHidePrompt();
        } catch (Throwable th2) {
            kd.m3203(m2586((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 24 - (ViewConfiguration.getScrollBarSize() >> 8), 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m2586((char) (Color.red(0) + 57773), Process.getGidForName("") + 56, (ViewConfiguration.getEdgeSlop() >> 16) + 583).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient == null) {
            super.onGeolocationPermissionsHidePrompt();
            f2515 = (f2512 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
            return;
        }
        int i10 = f2512 + 111;
        f2515 = i10 % 128;
        if (i10 % 2 == 0) {
            webChromeClient.onGeolocationPermissionsHidePrompt();
        } else {
            webChromeClient.onGeolocationPermissionsHidePrompt();
            int i11 = 86 / 0;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        f2515 = (f2512 + 23) % 128;
        try {
            this.f2516.onGeolocationPermissionsShowPrompt(str, callback);
            f2512 = (f2515 + 35) % 128;
        } catch (Throwable th2) {
            kd.m3203(m2586((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getPressedStateDuration() >> 16) + 24, ExpandableListView.getPackedPositionGroup(0L)).intern(), m2586((char) (TextUtils.lastIndexOf("", '0') + 1), 55 - ExpandableListView.getPackedPositionGroup(0L), 528 - (Process.myTid() >> 22)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient == null) {
            super.onGeolocationPermissionsShowPrompt(str, callback);
        } else {
            f2512 = (f2515 + 97) % 128;
            webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        int i10 = f2515 + 69;
        f2512 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m3203(m2586((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 24 - (Process.myTid() >> 22), ViewConfiguration.getLongPressTimeout() >> 16).intern(), m2586((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18416), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36, 213 - TextUtils.getCapsMode("", 0, 0)).intern(), th2, false);
        }
        if (i10 % 2 == 0) {
            this.f2516.onHideCustomView();
            throw null;
        }
        this.f2516.onHideCustomView();
        f2515 = (f2512 + 35) % 128;
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient == null) {
            super.onHideCustomView();
            return;
        }
        int i11 = f2515 + 65;
        f2512 = i11 % 128;
        if (i11 % 2 != 0) {
            webChromeClient.onHideCustomView();
        } else {
            webChromeClient.onHideCustomView();
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        int i10 = f2515 + 5;
        f2512 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m3203(m2586((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), Process.getGidForName("") + 25, View.MeasureSpec.getMode(0)).intern(), m2586((char) ((-1) - Process.getGidForName("")), 30 - KeyEvent.getDeadChar(0, 0), 354 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), th2, false);
        }
        if (i10 % 2 == 0) {
            this.f2516.onJsAlert(webView, str, str2, jsResult);
            throw null;
        }
        this.f2516.onJsAlert(webView, str, str2, jsResult);
        f2512 = (f2515 + 9) % 128;
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient != null) {
            return webChromeClient.onJsAlert(webView, str, str2, jsResult);
        }
        boolean zOnJsAlert = super.onJsAlert(webView, str, str2, jsResult);
        int i11 = f2512 + 107;
        f2515 = i11 % 128;
        if (i11 % 2 == 0) {
            return zOnJsAlert;
        }
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        try {
            this.f2516.onJsBeforeUnload(webView, str, str2, jsResult);
        } catch (Throwable th2) {
            kd.m3203(m2586((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), ImageFormat.getBitsPerPixel(0) + 25, ImageFormat.getBitsPerPixel(0) + 1).intern(), m2586((char) View.combineMeasuredStates(0, 0), 37 - Color.alpha(0), 447 - (Process.myTid() >> 22)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient != null) {
            boolean zOnJsBeforeUnload = webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult);
            f2515 = (f2512 + 83) % 128;
            return zOnJsBeforeUnload;
        }
        boolean zOnJsBeforeUnload2 = super.onJsBeforeUnload(webView, str, str2, jsResult);
        int i10 = f2515 + 93;
        f2512 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 46 / 0;
        }
        return zOnJsBeforeUnload2;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        try {
            this.f2516.onJsConfirm(webView, str, str2, jsResult);
        } catch (Throwable th2) {
            kd.m3203(m2586((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (Process.myPid() >> 22) + 24, ViewConfiguration.getDoubleTapTimeout() >> 16).intern(), m2586((char) (63517 - TextUtils.getCapsMode("", 0, 0)), 32 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 384 - TextUtils.getOffsetAfter("", 0)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient == null) {
            return super.onJsConfirm(webView, str, str2, jsResult);
        }
        f2512 = (f2515 + 23) % 128;
        boolean zOnJsConfirm = webChromeClient.onJsConfirm(webView, str, str2, jsResult);
        f2512 = (f2515 + 109) % 128;
        return zOnJsConfirm;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onJsPrompt(android.webkit.WebView r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, android.webkit.JsPromptResult r13) {
        /*
            r8 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.hk.f2512
            int r0 = r0 + 69
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.hk.f2515 = r0
            android.webkit.WebChromeClient r1 = r8.f2516     // Catch: java.lang.Throwable -> L1f
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.onJsPrompt(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L18
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r5
            r13 = r6
            goto L5e
        L18:
            r0 = move-exception
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r5
            r13 = r6
            goto L20
        L1f:
            r0 = move-exception
        L20:
            r1 = 0
            int r2 = android.graphics.Color.blue(r1)
            char r2 = (char) r2
            java.lang.String r3 = ""
            int r4 = android.text.TextUtils.getCapsMode(r3, r1, r1)
            int r4 = 24 - r4
            int r5 = android.view.MotionEvent.axisFromString(r3)
            int r5 = r5 + 1
            java.lang.String r2 = m2586(r2, r4, r5)
            java.lang.String r2 = r2.intern()
            int r4 = android.graphics.Color.argb(r1, r1, r1, r1)
            char r4 = (char) r4
            int r5 = android.os.Process.getThreadPriority(r1)
            int r5 = r5 + 20
            int r5 = r5 >> 6
            int r5 = 31 - r5
            r6 = 48
            int r3 = android.text.TextUtils.lastIndexOf(r3, r6, r1)
            int r3 = r3 + 417
            java.lang.String r3 = m2586(r4, r5, r3)
            java.lang.String r3 = r3.intern()
            com.ironsource.adqualitysdk.sdk.i.kd.m3203(r2, r3, r0, r1)
        L5e:
            android.webkit.WebChromeClient r2 = r8.f2517
            if (r2 == 0) goto L74
            int r0 = com.ironsource.adqualitysdk.sdk.i.hk.f2512
            int r0 = r0 + 49
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.hk.f2515 = r0
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            boolean r9 = r2.onJsPrompt(r3, r4, r5, r6, r7)
            return r9
        L74:
            boolean r9 = super.onJsPrompt(r9, r10, r11, r12, r13)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hk.onJsPrompt(android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, android.webkit.JsPromptResult):boolean");
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public boolean onJsTimeout() {
        try {
            this.f2516.onJsTimeout();
        } catch (Throwable th2) {
            kd.m3203(m2586((char) ('0' - AndroidCharacter.getMirror('0')), 24 - View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.getDeadChar(0, 0)).intern(), m2586((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), View.MeasureSpec.getSize(0) + 32, 821 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient == null) {
            return super.onJsTimeout();
        }
        f2515 = (f2512 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        boolean zOnJsTimeout = webChromeClient.onJsTimeout();
        f2515 = (f2512 + 59) % 128;
        return zOnJsTimeout;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        try {
            this.f2516.onPermissionRequest(permissionRequest);
            f2512 = (f2515 + 19) % 128;
        } catch (Throwable th2) {
            kd.m3203(m2586((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 24, TextUtils.getOffsetBefore("", 0)).intern(), m2586((char) ((-1) - TextUtils.lastIndexOf("", '0')), Color.red(0) + 40, 638 - View.combineMeasuredStates(0, 0)).intern(), th2, false);
        }
        try {
            WebChromeClient webChromeClient = this.f2517;
            if (webChromeClient == null) {
                super.onPermissionRequest(permissionRequest);
            } else {
                f2512 = (f2515 + 67) % 128;
                webChromeClient.onPermissionRequest(permissionRequest);
            }
        } catch (Throwable th3) {
            kd.m3203(m2586((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), AndroidCharacter.getMirror('0') - '0').intern(), m2586((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 43 - TextUtils.getOffsetAfter("", 0), KeyEvent.getDeadChar(0, 0) + 678).intern(), th3, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        try {
            this.f2516.onPermissionRequestCanceled(permissionRequest);
        } catch (Throwable th2) {
            kd.m3203(m2586((char) KeyEvent.keyCodeFromString(""), 24 - Color.argb(0, 0, 0, 0), TextUtils.getCapsMode("", 0, 0)).intern(), m2586((char) (39704 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 48 - ((Process.getThreadPriority(0) + 20) >> 6), 720 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), th2, false);
        }
        try {
            WebChromeClient webChromeClient = this.f2517;
            if (webChromeClient == null) {
                super.onPermissionRequestCanceled(permissionRequest);
                return;
            }
            f2515 = (f2512 + 51) % 128;
            f2512 = (f2515 + 65) % 128;
            webChromeClient.onPermissionRequestCanceled(permissionRequest);
        } catch (Throwable th3) {
            kd.m3203(m2586((char) View.resolveSizeAndState(0, 0, 0), 24 - Color.green(0), ViewConfiguration.getTapTimeout() >> 16).intern(), m2586((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43322), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 50, 770 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), th3, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        try {
            this.f2516.onProgressChanged(webView, i10);
        } catch (Throwable th2) {
            kd.m3203(m2586((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 25 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0)).intern(), m2586((char) (Color.rgb(0, 0, 0) + 16811006), TextUtils.lastIndexOf("", '0', 0) + 39, (ViewConfiguration.getEdgeSlop() >> 16) + 24).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient == null) {
            super.onProgressChanged(webView, i10);
            return;
        }
        f2512 = (f2515 + 115) % 128;
        webChromeClient.onProgressChanged(webView, i10);
        int i11 = f2512 + 109;
        f2515 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 48 / 0;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        int i10 = f2512 + 9;
        f2515 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m3203(m2586((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24, ViewConfiguration.getKeyRepeatTimeout() >> 16).intern(), m2586((char) (MotionEvent.axisFromString("") + 63427), (Process.myPid() >> 22) + 35, 98 - View.MeasureSpec.getMode(0)).intern(), th2, false);
        }
        if (i10 % 2 != 0) {
            this.f2516.onReceivedIcon(webView, bitmap);
            throw null;
        }
        this.f2516.onReceivedIcon(webView, bitmap);
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient != null) {
            webChromeClient.onReceivedIcon(webView, bitmap);
            return;
        }
        super.onReceivedIcon(webView, bitmap);
        int i11 = f2515 + 107;
        f2512 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        int i10 = f2512 + 99;
        f2515 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f2516.onReceivedTitle(webView, str);
                int i11 = 56 / 0;
            } else {
                this.f2516.onReceivedTitle(webView, str);
            }
        } catch (Throwable th2) {
            kd.m3203(m2586((char) Color.blue(0), TextUtils.getOffsetBefore("", 0) + 24, ViewConfiguration.getMaximumFlingVelocity() >> 16).intern(), m2586((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 5856), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36, 61 - TextUtils.lastIndexOf("", '0', 0)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient == null) {
            super.onReceivedTitle(webView, str);
        } else {
            f2512 = (f2515 + 11) % 128;
            webChromeClient.onReceivedTitle(webView, str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z10) {
        f2515 = (f2512 + 81) % 128;
        try {
            this.f2516.onReceivedTouchIconUrl(webView, str, z10);
        } catch (Throwable th2) {
            kd.m3203(m2586((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 24 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1).intern(), m2586((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 59574), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 42, 132 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient != null) {
            webChromeClient.onReceivedTouchIconUrl(webView, str, z10);
            f2515 = (f2512 + 71) % 128;
            return;
        }
        super.onReceivedTouchIconUrl(webView, str, z10);
        int i10 = f2512 + 41;
        f2515 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onRequestFocus(WebView webView) {
        try {
            this.f2516.onRequestFocus(webView);
            f2515 = (f2512 + 95) % 128;
        } catch (Throwable th2) {
            kd.m3203(m2586((char) (ViewConfiguration.getTouchSlop() >> 8), KeyEvent.keyCodeFromString("") + 24, 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m2586((char) Gravity.getAbsoluteGravity(0, 0), 34 - MotionEvent.axisFromString(""), 285 - TextUtils.getTrimmedLength("")).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient == null) {
            super.onRequestFocus(webView);
            return;
        }
        int i10 = f2515 + 33;
        f2512 = i10 % 128;
        if (i10 % 2 != 0) {
            webChromeClient.onRequestFocus(webView);
        } else {
            webChromeClient.onRequestFocus(webView);
            int i11 = 58 / 0;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        int i10 = f2515 + 77;
        f2512 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f2516.onShowCustomView(view, customViewCallback);
                int i11 = 81 / 0;
            } else {
                this.f2516.onShowCustomView(view, customViewCallback);
            }
        } catch (Throwable th2) {
            kd.m3203(m2586((char) TextUtils.getCapsMode("", 0, 0), 23 - TextUtils.lastIndexOf("", '0'), ViewConfiguration.getWindowTouchSlop() >> 8).intern(), m2586((char) View.combineMeasuredStates(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 38, Color.red(0) + 176).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient == null) {
            super.onShowCustomView(view, customViewCallback);
            return;
        }
        webChromeClient.onShowCustomView(view, customViewCallback);
        int i12 = f2512 + 19;
        f2515 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 23 / 0;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        f2512 = (f2515 + 51) % 128;
        try {
            this.f2516.onShowFileChooser(webView, valueCallback, fileChooserParams);
        } catch (Throwable th2) {
            kd.m3203(m2586((char) TextUtils.indexOf("", "", 0), TextUtils.lastIndexOf("", '0', 0) + 25, ViewConfiguration.getTouchSlop() >> 8).intern(), m2586((char) (ViewConfiguration.getLongPressTimeout() >> 16), Color.green(0) + 38, TextUtils.getOffsetAfter("", 0) + 1017).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient == null) {
            return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        f2512 = (f2515 + 29) % 128;
        return webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ci
    /* renamed from: ﾒ */
    public final Object mo1170(String str, List<Object> list, ch chVar) {
        f2512 = (f2515 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        int iHashCode = str.hashCode();
        if (iHashCode != 1395849045) {
            if (iHashCode == 1442029578 && str.equals(m2586((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 20412), 24 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW).intern())) {
                f2512 = (f2515 + 95) % 128;
                return m2584();
            }
        } else if (str.equals(m2586((char) Color.red(0), 20 - (ViewConfiguration.getEdgeSlop() >> 16), View.getDefaultSize(0, 0) + 1080).intern())) {
            Object objM2585 = m2585();
            int i10 = f2515 + 87;
            f2512 = i10 % 128;
            if (i10 % 2 != 0) {
                return objM2585;
            }
            throw null;
        }
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2586(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f2513[i11 + i12] ^ (i12 * f2514)) ^ c10);
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

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        try {
            this.f2516.onShowCustomView(view, i10, customViewCallback);
            f2512 = (f2515 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        } catch (Throwable th2) {
            kd.m3203(m2586((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 24 - (Process.myPid() >> 22), ViewConfiguration.getScrollBarFadeDuration() >> 16).intern(), m2586((char) View.MeasureSpec.getMode(0), 37 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 176 - TextUtils.indexOf("", "", 0, 0)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient != null) {
            f2515 = (f2512 + 115) % 128;
            webChromeClient.onShowCustomView(view, i10, customViewCallback);
        } else {
            super.onShowCustomView(view, i10, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        f2515 = (f2512 + 89) % 128;
        try {
            this.f2516.onConsoleMessage(consoleMessage);
            f2515 = (f2512 + 99) % 128;
        } catch (Throwable th2) {
            kd.m3203(m2586((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 24 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf("", "", 0)).intern(), m2586((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), View.combineMeasuredStates(0, 0) + 37, 852 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2517;
        if (webChromeClient != null) {
            int i10 = f2512 + 11;
            f2515 = i10 % 128;
            if (i10 % 2 == 0) {
                return webChromeClient.onConsoleMessage(consoleMessage);
            }
            webChromeClient.onConsoleMessage(consoleMessage);
            throw null;
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
