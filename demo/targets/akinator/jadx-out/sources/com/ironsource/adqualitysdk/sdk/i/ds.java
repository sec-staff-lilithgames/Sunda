package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.core.app.NotificationCompat;
import com.explorestack.protobuf.openrtb.LossReason;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ds {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2035 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2036 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2037;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2038;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private ds f2039;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private ds f2040;

    /* renamed from: ｋ, reason: contains not printable characters */
    private Map<String, Object> f2041;

    static {
        char[] cArr = new char[2792];
        com.google.android.gms.internal.play_billing.a.y("nÔm³hPg\u001bc£~p}\u000ey×t\"ÒsÑmÔ\u009cÛ×ß3Â¥ÁÜÅ\u0016È½Ïç\u0000S\u0003)\u0006Ó\t\u0084\r%\u0010ý>À=½8E7\u001a3¬.k\u0000C\u0003<\u0006Á\t\u0083\r3\u0000F\u00039\u0006Å\t\u009c\r$\u0000S\u0003$\u0006Ò\t\u0099\r.\u0010÷\u0000C\u00038\u0006Á\t\u0082\r\u0013\u0010õ\u0013\u0091\u0017E\u001aå\u001d¾!C$\u0015\u0001$\u0002O\u0007²\bó\fg\u0011\u0084\u0012ô\u00167\u001b\u009f\u001cÿ (%f&Ó*\u0002/U0¢4\u00149S:§?ûúóù¾ü]ó\u0014÷½êJé$íñà@ç7ÛàÞ¶Ý\u0011ÑÅÔ¹\u0000B\u0003)\u0006Ô\t\u0095\r\u0001\u0010â\u0013\u0092\u0017Q\u001aù\u001d\u009f!U$\u0004'°+e.\u00141ã5t8\";Å>\u0091B-\u0000S\u0003$\u0006Ò\t\u0099\r.\u0010÷\u0013·\u0017B\u001aé\u001d¤!E$\u0002<º?Í:#5v1Ç,0/g+±&\u0016!B\u001d¾\u0018Ñ\u001bV\u0017\u0082\u0012÷\r&\t\u0081X,[e^\u0089QØUiH\u0094KìO3B\u0085EÂjui<lÐc\u0081g>zÝy\u00ad}npÆ\u0000T\u00035\u0006Ø\t\u0084\r\u0015\u0010ä\u0013\u0089\u0017\\\u001aóCÒ@®EKJ\fN·SjP\r\u0000P\u00031\u0006Ô\t\u0084\r%\u0010â\u0013\u008eNÆM»HKG\u0018C¡^u]\n\u0000C\u00038\u0006Á\t\u0082\r!\u0010ó\u0013\u0094\u0017U\u001aò\u0017\u009a\u0014ñ\u0011\f\u001eM\u0000S\u00038\u0006Ï\t\u0082\r4\u0000I\u0003>\u0006Ô\t\u0095\r'\u0010õ\u0013\u0092À\u0007ÃtÆ\u0085ÉÜ\u009eE\u009d?\u0098Ì\u0097\u0092\u00937\u0000D\u0003?\u0006Õ\t\u0092\r,\u0010õ\u0000U\u0003\u0002\u0006éÐ¶ÓÁÖ*ÆoÅ8ÀÖ\u0000U\u0003\"\u0006Ì\t¡\r5\u0010õ\u0013\u0092\u0017I\u001aÓ\u001d±!N$\u0019'´+y.\u001a1Õ5r\u0000V\u00039\u0006Ä\t\u0095\r/\u0010Æ\u0013\u0089\u0017U\u001a÷\u0000M\u00035\u0006Ä\t\u0099\r!\u0010À\u0013\u008c\u0017Q\u001aù\u001dµ!R\u0000W\u00035\u0006Â\t¦\r)\u0010õ\u0013\u0097\u0016Å\u0015¡\u0010B\u001f\u001e\u001b¦\u0006_\u0005\u0002\u0001Ê\fl\u000b&7×¼ú¿\u008eºrµ$±\u0096¬a¯&«÷¦G¡\f\u009dý\u0000U\u0003\u0002\u0006ì\t´\r%\u0010ó\u0013\u008f\u0017T\u001aå\u001d¢\u0000V\u00039\u0006Å\t\u0087\r\u0007\u0010â\u0013\u008f\u0017E\u001að\u0000I\u0003=\u0006Á\t\u0097\r%\u0010Æ\u0013\u0089\u0017U\u001a÷\u0000A\u0003\"\u0006Ò\t\u0091\r9\u0000A\u0003\"\u0006Ò\t\u0091\r9\u0010ãÇÎÄ²ÁWÎ\u001bý3þPû ôãðKí®îûê1ç\u0086\u0000L\u00039\u0006Ó\t\u0084\u0000H\u00031\u0006Ó\t\u0098\r\u0013\u0010õ\u0013\u0094\u0000S\u00035\u0006Ô\u0000H\u00031\u0006Ó\t\u0098\r\r\u0010ñ\u0013\u0090;\u000f8s=\u0092³\u0087°åµ\u0011ºK¾Ø£! C¤\u0088©\u001d®a\u0092\u0080H*KHN¼AæEoX\u0088[û_(R\u008fUÈi3lnoØ\rS\u000e/\u000bÞ\u0004\u0083\u0000%\u001dò\u001e\u0082\u001aE\u0017þ\u0010´,x)\u0001*£&h#=<Á8`\u0000I\u0003>\u0006Ô\t\u0095\r.\u0010äY\u0098Zÿ_\u0014PNTöI/í«î×ë$ätàÍý\u001bþ|ú±÷\u0007ðVÌ»\u0095\u0086\u0096ë\u0093\u0006\u009cP\u0098ö\u0085'\u0086L\u0082\u0081\u008f\u0010\u0088v´\u0091±Å²j¾°»Æ\u0000B\u0003\"\u0006Ï\t\u0091\r$\u0010ó\u0013\u0081\u0017C\u001aô\u001d\u0082!E$\u0013'¥+y.\u00161Õ5r\u000fß\f¨\tB\u0006\u0003\u0002¸\u001fr\u001c0\u0018Ï\u0015z\u00122.Ó+\u0094·ø´\u0099±z¾9º\u0085§]¤< ý\u00adZª\u0011\u0096ò\u0093½\u0090\f\u009cì\u0099±\u0086h\u0082Í\u0000B\u00031\u0006Ó\t\u0095\rv\u0010¤ë²èÝí!âc\u0000C\u0003<\u0006Á\t\u0083\r3\u0010Ü\u0013\u008f\u0017Q\u001aä\u001dµ!R\u0000E\u0003>\u0006Õ\t\u009d\u0000N\u0003%\u0006Í\t\u0092\r%\u0010â\u008b\u0004\u0088v\u008d\u0091\u0082Ü\u0086s\u009b¼\u0098Ñ\u009c\fm\u0090nçk\u0011dZ`í}4~az\u0086w%puL\u0086IÁ\u0000S\u0003$\u0006Ò\t\u0099\r.\u0010÷\u0013¢\u0017E\u001aé\u001d¼!D$\u0015'²ÏÊÌ¦ÉLÆ\u000bÂ¿ßj\u0000V\u0003?\u0006É\t\u0094/´,É)0&u\u0000M\u00035\u0006Ô\t\u0098\r/\u0010ôß,ÜKÙ¸ÖëÒLÏ\u008bÌðÈ-Å\u009bVxU\u000bPê_½[\u000bFÈEºA}LõK\u0080wjr=\u0000A\u00032\u0006Ó\t\u0084\r2\u0010ñ\u0013\u0083\u0017D\u001aÍ\u001d±!P\u0000H\u00031\u0006Î\t\u0094\r,\u0010õ\u0013\u0092\u0000H\u00031\u0006Î\t\u0094\r,\u0010õ\u0013\u0092\u0017d\u001aè\u001d¢!E$\u0011'¤\u0000L\u0003?\u0006ÇH,KZN\u00adAéE^X\u008c[ú_\u0019R\u0096UÊi(G=D\\A±NíJ\\W\u008bTìP\u000f]\u0080ZÜf>¿¡¼Ó¹5¶b²Ó¯\u0004¬c¨\u0092¥\u0003¢B\u009e£\u009bõ\u0098R\u0094\u0099\u0091ôé\u000fêeï\u0091àÜäpù©úóþ\u0002ó\u009bôéÈ\u000fÍXÎéÂ>ÇYØ Ü5Ñ\u007fÒ\u0088×É«r¬©¡Î\u001c0\u001fL\u001a½\u0015÷\u0011V\f\u009b\u000fç\u0000W\u00035\u0006Â\t³\r(\u0010â\u0013\u008f\u0017]\u001aå\u001d\u0093!L$\u0019'¥+~.\u0014wût\u0086q~~#z\u0090gH\u0000F\u0003\"\u0006Á\t\u0097\r-\u0010õ\u0013\u008e\u0017D\u0000D\u00039\u0006Á\t\u009c\r/\u0010÷\u0013¦\u0017B\u001aá\u001d·!M$\u0015'®+d\u0000A\u0003 \u0006Ð\t\u009c\r)\u0010ó\u0013\u0081\u0017D\u001aé\u001d¿!N\u0000R\u00035\u0006Ó\t\u009f\r5\u0010â\u0013\u0083\u0017U\u001aó\u0000I\u0003>\u0006Ô\t\u0095\r.\u0010ä\u0013³\u0017U\u001aî\u001d´!E$\u0002\u00866\u0085W\u0080¯\u008fä|5\u007f@z·uâq\\l\u008doÕk f\u008aaÝ+F(4-ß\"\u0092&$;õ8®<M1î6µ\n_¿m¼\u001f¹ä¶¹²\u0006¯Ù¬¥¨bÿ§üÂù)ö{òÏï\u0015ìDè¹å\tâZÞ£Û÷ØH\u0018,\u001bB\u001eµ\u0011ï\u0015T\b\u009c\u0000A\u00034\u0006Á\t\u0080\r4\u0010õ\u0013\u0092\u0017f\u001aé\u001dµ!W¢¸¡Í¤8«y¯Í²\f±kk-hMm¬báfR{\u0082xÈ|'q\u009bvÙ1t2\u00157ø8¤<6!Ù\"¥&gq\u0098rÿw\u000ex^|õa$\u0000L\u00039\u0006Î\t\u0095\r!\u0010â\u0013¬\u0017Q\u001aù\u001d¿!U$\u0004µp¶\u0017³î¼³¸\u0016¥Û¦´¢w¯î¨\u0093\u0094{\u0091=\u0092\u0097\u009eF\u0086i\u0085\u0018\u0080Å\u008fº\u008b\u000f\u0096Õ\u0095\u00ad\u0091Z\u009cÏ\u009b\u0085§r¢3¡\u0088\u00adS¨4è©ëØî\náwåßø\u0019ûsÿ¢ò%õ^É§ÌøÏAÃ\u0093ÆÊÙ?Ý\u0095ÐÂÓ#ÖxªÃ\u00ad\u00049â:\u009c?p0>4\u009c)X*;.ý#d$\u0018\u0018ç\u001d¸\u001e\u000e\u0012Ü\u0017»\u0000A\u0003$\u0006Ï\t\u009d\r)\u0010ó\u0013²\u0017U\u001aæ\u001dµ!R$\u0015'®+s.\u0005\u0000P\u0003\"\u0006Å\t\u0096\r%\u0010â\u0013\u0085\u0017^\u001aã\u001dµ!m$\u0011'®+q.\u00071Õ5rä\u0015çxâ\u0095íÃéeô´÷ßó\u0012\u0000I\u0003\u0013\u0006Á\t\u009c\r,\u0010ò\u0013\u0081\u0017S\u001aë\u001d\u0094!E$\u0013'¯+b.\u00011Ä5o8\"/¸,Ê)'&`\"Ñ$ù'\u0092\"k-()\u008f4^7\u001a3è>O9\u001c\u0005ï\u0000¨\u0003\u000f\u000fÔ\n©\u0015\u007f\u0011ÙÄ:ÇBÂ³ÍîÉVÔ\u0093×þÓ(Þ\u0099Ùãå6àsãÖÊ¡ÉÃÌ4ÃPÇßÚ\u0003ÙaÝ\u0085Ð\u001a×Oë³îèíB\u0000W\u00035\u0006Â\t¦\r)\u0010õ\u0013\u0097\u0017s\u001aì\u001d¹!E$\u001e'´+T.\u00051Ó5o8\";Á>\u0084B/Eâ\u0000W\u00035\u0006Â\t³\r(\u0010â\u0013\u008f\u0017]\u001aå\u001d\u0093!L$\u0019'¥+~.\u00141ô5e83;Ï>\u0082B!EäH\u008fLBñ¾òË÷)øjüÍá\u001bâvæ¼ë\u001aì]Ð\u0096ÕáÖYÚ\u0080\"å!\u0084$c+7/\u00922_105ó8o?\u0018\u0003à\u0006¹ÔL×-ÒÊÝ\u009eÙ;ÄöÇ\u0099ÃZÎÆÉ»õ\\i\u0083jøo\u0015`\\dày!t\u0098wÊr1}lyÓd\fgpc·n\niUU PçSY_\u008cZöW¥T÷Q\f^QZîG1DM@\u008aM7Jhv\u009asÑp~|¹yÜf\u001d)Ä*\u0096/m 0$\u008f9P:,>ë3V4\t\bû\r¶\u000e\u001d\u0002Ü\u0007ª\u0018m\u001cÌ\u0011\u009d\u0000M\u0003\u001f\u0006ä\t¹\r\u0006\u0010Ù\u0013¥\u0017b\u001aß\u001d\u0083!t$1'\u0094+Y.#\u0000M\u0003\u001f\u0006ä\t¹\r\u0006\u0010Ù\u0013¥\u0017b\u001aß\u001d\u0096!i$>'\u0081+\\ÿ\u001eüLù·öêòUï\u008aìöè1å\u008câÐÞ*ÛmØÐÔ\u000bÑaÎ¬Ê\u001dÇJÄ©Áæ½W§¼¤î¡\u0015®Hª÷·(´T°\u0093½.ºw\u0086\u009e\u0083Í\u0080p\u008cµ\u0089Ø\u0096\r\u0092´£  ò¥\tªT®ë³4°H´\u008f¹2¾i\u0082\u009f\u0087Ü\u0084c\u0088®\u008dÄ\u0092\u0018\u0096£\u009bé\u0000M\u0003\u001f\u0006ä\t¹\r\u0006\u0010Ù\u0013¥\u0017b\u001aß\u001d\u009e!a$$'\u0089+F.%Ì\u0080ÏÒÊ)ÅtÁËÜ\u0014ßhÛ¯Ö\u0012ÑTí£èéëHç\u008fâëý<ù\u008eôØ&K%\u0019 â/¿+\u00006ß5£1d<Ù;\u0097\u0007d\u0002%\u0001\u0092\rD\b'\u0017õ\u0013RhGk\u0015nîa³e\fxÓ{¯\u007fhrÕu\u0089I~L(O\u0083CYF>\u0000b\u0003?\u0006Ï\t\u009c\r%\u0010ñ\u0013\u008e\u0000c\u00038\u0006Á\t\u0082\u0000b\u0003)\u0006Ô\t\u0095\u0000s\u00038\u0006Ï\t\u0082\r4\u0018\u009b\u001bÌ\u001e&\u009ba\u00982\u009dÃ\u0092\u009añÂò\u0098÷kø5ü\u0090RmQ6TÜ[\u009b_%Bü\u0000v\u0003?\u0006É\t\u0094»Ê¸\u008d½a²4¶\u008c«G¨>¬ý¡Z¦\u000b\u009aá\u009f·\u009c\u0006\u0090Ç\u0095»\u008a|\u008eÃ\u0083\u0087\u0080a\u00856ù\u009c°A³\u000e¶ò¹°½\b Ñ£¾§tªÞ\u00ad\u0085\u0091{\u0094\"©yª6¯Ê \u0088¤0¹öº\u0081¾I³æ´¬\u0088F\u008d\u001d\u008e£\u0082z\u0082ä\u0081«\u0084W\u008b\u0015\u008f\u00ad\u0092e\u0091\u001d\u0095Ì\u0098wEßF\u008dCfL+H\u009dULV-Rç_DX\u0007düa¶b\rnÃk±tvpÛ}\u008d~|{=\u0007\u0096\u0000M\r%\tì\u0000M\u0003\u001f\u0006ô\t¹\r\u000f\u0010Þ\u0013¿\u0017u\u001aÖ\u001d\u0095!n$$'\u009f+Q.#1ä5I8\u001f;î>¯B\u0015EÀ\u0007Õ\u0004\u0087\u0001l\u000e!\n\u0097\u0017F\u0014'\u0010í\u001dN\u001a\r&ö#¼ \u0007,É)»6|2Ñ?\u0087<v97E\u0095BGO.Kí\u0000M\u0003\u001f\u0006ô\t¹\r\u000f\u0010Þ\u0013¿\u0017u\u001aÖ\u001d\u0095!n$$'\u009f+Q.#1ä5I8\u001f;î>¯B\u0003EÑH®LsOÅR\u009c\u0000M\u0003\u001f\u0006ô\t¹\r\u000f\u0010Þ\u0013¿\u0017u\u001aÖ\u001d\u0095!n$$'\u009f+Q.#1ä5I8\u001f;î>¯B\u000fEÅH´LcOÉR\u0094VeyWz\u0005\u007fîp£t\u0015iÄj¥nocÌd\u008fXt]>^\u0085RKW9HþLSA\u0005BôGµ;\n<Å1³5d6Î+\u008f/h 5%\u009e\u0019E\u001a-\u001fä\u0000M\u0003\u001f\u0006ô\t¹\r\u000f\u0010Þ\u0013¿\u0017u\u001aÖ\u001d\u0095!n$$'\u009f+Q.#1ä5I8\u001f;î>¯B\u0010EßH©L~OÔR\u0095VrY/\\\u0095`@T\u0019WKR ]íY[D\u008aGëC!N\u0082IÁu:ppsË\u007f\u0005zwe°a\u001dlKoºjû\u0016\\\u0011\u008b\u001câ\u0018!\u001b\u0086\u0006Û\u00029\rk\bÂ4\u0001N0MbH\u0089GÄCr^£]ÂY\bT«Sèo\u0013jYiâe,`^\u007f\u0099{4vbu\u0093pÒ\fn\u000b®\u0006Ï\u0002\u0002\u0001±\u001cá\u0000M\u0003\u001f\u0006ô\t¹\r\u000f\u0010Þ\u0013¿\u0017u\u001aÖ\u001d\u0095!n$$'\u009f+Q.#1ä5I8\u001f;î>¯B\bEßH¶LuOÒR\u008fVeY>\\\u0094`Uc2\u0014~\u0017,\u0012Ç\u001d\u008a\u0019<\u0004í\u0007\u008c\u0003F\u000eå\t¦5]0\u00173¬?b:\u0010%×!z,,/Ý*\u009cV;Qì\\\u0085XF[áF¼BVM\u001bHºtw\u0000M\u0003\u001f\u0006ô\t¹\r\u000f\u0010Þ\u0013¿\u0017u\u001aÖ\u001d\u0095!n$$'\u009f+Q.#1ä5I8\u001f;î>¯B\u0002EÅH´LdOÏR\u009eV\u007fY \\\u0092`Uc3fã\u0082'\u0081u\u0084\u009e\u008bÓ\u008fe\u0092´\u0091Õ\u0095\u001f\u0098¼\u009fÿ£\u0004¦N¥õ©;¬I³\u008e·#ºu¹\u0084¼ÅÀhÇ¯ÊÞÎ\u000eÍ¥ÐôÔ\u0015ÛHÞïâ6áOä\u009bè9ï\u007f\u0013Ñ\u0010\u0092\u0015q\u001a*\u001e\u0080\u0003[\u0000?\u0004á\tM\u000e\u001b2ý7ª4\u00008Á=³\"v&Õ+\u0090(}-+Q\u009a\u00ad)®j«\u0089¤Ò x½£¾Çº\u0019·µ°ã\u008c\u0005\u0089R\u008aø\u0086;\u0091ð\u0092³\u0097P\u0098\u000b\u009c¡\u0081z\u0082\u001e\u0086À\u008bl\u008c:°Åµ\u0089¶2ºë\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!r$&\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!s$9'\u0096\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!a$4'\u009f+D.91à5E506s3\u0090<Ë8a%º&Þ\"\u0000/¬(ú\u0014\u0014\u0011A\u0012ê\u001e-\u001bT\u0004\u0096\u0000=\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!d$?'\u009f+^./1ä5_8\u0003;å>¾B\u0004EÏH¥LfOÅR\u009eVt\u0094\u0014\u0097W\u0092´\u009dï\u0099E\u0084\u009e\u0087ú\u0083$\u008e\u0088\u0089Þµ%°h³Ü¿\u0004ºb¥µ¡\u0010¬L¯¡\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!o$\"'\u0089+W.)1þ5A8\u001c;ÿ>¥B\u0012EÜ\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!r$5'\u0084+Y.21õ5C8\u0004\u0012´\u0011÷\u0014\u0014\u001bO\u001få\u0002>\u0001Z\u0005\u0084\b(\u000f~3\u00866Â5r9¾<Á#\u0000'£*à)\u001c,R\u009fg\u009c$\u0099Ç\u0096\u009c\u00926\u008fí\u008c\u0089\u0088W\u0085û\u0082\u00ad¾U»\u0011¸¡´m±\u000f®×ªq§!¤Ã¡\u0095Ý'W\u0002TAQ¢^ùZSG\u0088Dì@2M\u009eJÈv0stpÄ|\byjf²b\u0013o_l¨ió\u0015X\u0012\u0099\u001fæ\u001b:\u0018\u0082fhe,`Üo\u0090k2vêu\u008bqG|ð{«G@B\u0000A±MpH\u0015WÜS`^?]ÍX\u0080$2#ÿ.\u008b\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!m$9'\u0093+C.)1þ5G8\u000f;é>½B\u0010EÏH¥LhOÔR\u0082VaY/\\\u0081`Tc?fãjOm\u0005pòs³w\u0005zÃ\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!m$5'\u0084+Y.?1ô5A8\u0004;á\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!m$5'\u0084+Y.?1ô5A8\u0004;á>¯B\u0001EÔH¿LbOÅR\u0086VeY>\\\u0095`U\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!m$5'\u0084+Y.?1ô5A8\u0004;á>¯B\u0010EÜH¡LsOÅR\u009dVeY>\\\u0094`Oc)fôÇ¶ÄõÁ\u0016ÎMÊç×<ÔXÐ\u0086Ý*Ú|æ\u0090ãÏàzì éØö\u001cò¦ÿñü\u001fa£bàg\u0003hXlòq)rMv\u0093{?|i@\u0085EÚFoJµOÍP\tTµYùZ\u0013_D#å$3`Jc\tfêi±m\u001bpÀs¤wzzÖ}\u0080AnD;G\u0099KZN=QëUFX\f[ê^\u00ad\"\u0010%Ö(«\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!a$4'\u0096+U.21ä5I8\u0003;å>¢B\u001fEÙH¤LoOÔR\u0089VpY5\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!a$4'\u0096+U.21ä5I8\u0003;å>¢B\u001fEÙH¤LoOÓR\u009fVuY\"\\\u0083`Uörõ1ðÒÿ\u0089û#æøå\u009cáBìîë¸×SÒ\u0002Ñ¤ÝsØ\u001eÇÉÃvÎ3ÍÞÈ\u0088´9³ø¾\u0082ºU¹û\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!f$9'\u008e+Q.,1ï5U8\u0002;ì\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!s$?'\u0095+B.#1õ5_8\u0005;ò>¼B\u001fEÜH©LcOÔ\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!v$9'\u0084+U./1ï5U8\u0002;ì>¯B\fEÙH³Ld\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!i$3'\u008f+^.?1å5R8\u001c;ÿ>¼B\tEÃH´\b¡\u000bâ\u000e\u0001\u0001Z\u0005ð\u0018+\u001bO\u001f\u0091\u0012=\u0015k)\u008d,Ù/e#³&Á9\u000b=±0æ3\b6KJèM=@WD\u0080`½cþf\u001diFmìp7sSw\u008dz!}wA\u009dDÆG|K·NÛQ\tUªXì[\u0007^]\"ê%$(G,\u0084/12{6\u008c\u0088\u0096\u008bÕ\u008e6\u0081m\u0085Ç\u0098\u001c\u009bx\u009f¦\u0092\n\u0095\\©°¬ñ¯V£\u0082¦ç¹*½\u0085°Æ³,¶wÊÊÍ\u0013Àv¿<¼\u007f¹\u009c¶Ç²m¯¶¬Ò¨\f¥ ¢ö\u009e\u001c\u009bG\u0098ý\u00946\u0091Z\u008e\u0088\u008a+\u0087m\u0084\u0086\u0081Êýkú¬÷Øó\u001dð°íÿé\u001cæVãíß0ÜIÙ\u008c\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!c$\"'\u0085+Q.41ù5V8\u0015;ÿ>¥B\u0012EÜH³LoOÓR\u009fVuY\"\\\u0083`UrIq\nté{²\u007f\u0018bÃa§eyhÕo\u0083SoV.U\u0089Y]\\8CõGZJ\u0019IóLµ0\b¤Ó§\u0090¢s\u00ad(©\u0082´Y·=³ã¾O¹\u0019\u0085õ\u0080§\u0083\u001b\u008fÖ\u008a·\u0095o\u0091Ñ\u009c\u0088\u009fi\u009a/æ\u0092\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!g$\"'\u008f+E.01ï5I8\u0014\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!r$5'\u0091+E.%1ã5T8\u000f;é>´\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!c$\"'\u0085+Q.41ù5V8\u0015;ÿ>±B\u0004EÏH©Lt\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!a$4'\u0096+O.)1ô\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!d$#'\u0090+O..1õ5T8\u0007;ï>¢B\u000bEÏH©Lt\u0000E\u0003\u0006\u0006å\t¾\r\u0014\u0010Ï\u0013«\u0017u\u001aÙ\u001d\u008f!d$#'\u0090+O.#1â5E8\u0011;ô>¹B\u0016EÕH¿LyOÄ¸#»`¾\u0083±Øµr¨©«Í¯\u0013¢¿¥é\u0099\u0002\u009cE\u009fö\u0093)\u0096E\u0089\u0097\u008d+\u0080f\u0083\u0087\u0086ßúaý¸ðÙô\u001f÷¢", "ISO-8859-1", cArr, 0, 2792);
        f2037 = cArr;
        f2038 = -5479496099213474992L;
    }

    public ds() {
        this.f2041 = new HashMap();
        this.f2039 = null;
        this.f2040 = null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static ds m2416() {
        ds dsVar = new ds();
        dsVar.m2419(m2417((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 6 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19).intern(), System.class);
        dsVar.m2419(m2417((char) (16014 - ExpandableListView.getPackedPositionChild(0L)), TextUtils.lastIndexOf("", '0', 0) + 7, 25 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), Object.class);
        dsVar.m2419(m2417((char) KeyEvent.getDeadChar(0, 0), 5 - Color.blue(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 32).intern(), Class.class);
        dsVar.m2419(m2417((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 5, 36 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), Field.class);
        dsVar.m2419(m2417((char) (ViewConfiguration.getEdgeSlop() >> 16), 6 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 40 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), String.class);
        dsVar.m2419(m2417((char) (ImageFormat.getBitsPerPixel(0) + 1), TextUtils.indexOf((CharSequence) "", '0', 0) + 13, ExpandableListView.getPackedPositionChild(0L) + 48).intern(), CharSequence.class);
        dsVar.m2419(m2417((char) (358 - TextUtils.getTrimmedLength("")), Color.blue(0) + 20, 59 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), ByteArrayInputStream.class);
        dsVar.m2419(m2417((char) (Color.red(0) + 64180), 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 79 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), GZIPInputStream.class);
        dsVar.m2419(m2417((char) (Color.rgb(0, 0, 0) + 16777216), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 21, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 93).intern(), ByteArrayOutputStream.class);
        dsVar.m2419(m2417((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11, 115 - View.combineMeasuredStates(0, 0)).intern(), StringWriter.class);
        dsVar.m2419(m2417((char) (Color.green(0) + 15603), 17 - (ViewConfiguration.getWindowTouchSlop() >> 8), 175 - AndroidCharacter.getMirror('0')).intern(), InputStreamReader.class);
        dsVar.m2419(m2417((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 22630), View.MeasureSpec.getSize(0) + 10, 144 - View.MeasureSpec.getMode(0)).intern(), JSONObject.class);
        dsVar.m2419(m2417((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 27199), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 154).intern(), JSONArray.class);
        dsVar.m2419(m2417((char) TextUtils.getOffsetBefore("", 0), View.MeasureSpec.getMode(0) + 9, 164 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), TextUtils.class);
        dsVar.m2419(m2417((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 17310), 7 - View.MeasureSpec.getMode(0), View.MeasureSpec.getSize(0) + 172).intern(), Matcher.class);
        dsVar.m2419(m2417((char) KeyEvent.getDeadChar(0, 0), KeyEvent.getDeadChar(0, 0) + 7, TextUtils.indexOf((CharSequence) "", '0') + 180).intern(), Pattern.class);
        dsVar.m2419(m2417((char) (20100 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 8 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 185).intern(), Boolean.class);
        dsVar.m2419(m2417((char) TextUtils.indexOf("", ""), 9 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 193 - ExpandableListView.getPackedPositionType(0L)).intern(), Character.class);
        dsVar.m2419(m2417((char) (6103 - Process.getGidForName("")), TextUtils.getOffsetBefore("", 0) + 4, KeyEvent.getDeadChar(0, 0) + 202).intern(), Byte.class);
        dsVar.m2419(m2417((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 5 - Drawable.resolveOpacity(0, 0), Color.blue(0) + 206).intern(), Short.class);
        dsVar.m2419(m2417((char) KeyEvent.getDeadChar(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7, (ViewConfiguration.getTouchSlop() >> 8) + LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE).intern(), Integer.class);
        dsVar.m2419(m2417((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 49227), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 4, (ViewConfiguration.getScrollBarSize() >> 8) + Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE).intern(), Long.class);
        dsVar.m2419(m2417((char) (40450 - ((byte) KeyEvent.getModifierMetaStateMask())), ((byte) KeyEvent.getModifierMetaStateMask()) + 6, 222 - KeyEvent.getDeadChar(0, 0)).intern(), Float.class);
        dsVar.m2419(m2417((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 5, 227 - TextUtils.getTrimmedLength("")).intern(), Double.class);
        dsVar.m2419(m2417((char) Color.green(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3, Color.blue(0) + 233).intern(), URI.class);
        dsVar.m2419(m2417((char) (53475 - KeyEvent.keyCodeFromString("")), 2 - TextUtils.lastIndexOf("", '0', 0, 0), (Process.myPid() >> 22) + 236).intern(), Uri.class);
        dsVar.m2419(m2417((char) (50745 - ((byte) KeyEvent.getModifierMetaStateMask())), 3 - View.combineMeasuredStates(0, 0), 239 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), URL.class);
        dsVar.m2419(m2417((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.argb(0, 0, 0, 0) + 17, View.getDefaultSize(0, 0) + 242).intern(), UrlQuerySanitizer.class);
        dsVar.m2419(m2417((char) View.combineMeasuredStates(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 10, 259 - View.MeasureSpec.getMode(0)).intern(), VideoView.class);
        dsVar.m2419(m2417((char) (ViewConfiguration.getJumpTapTimeout() >> 16), Color.argb(0, 0, 0, 0) + 11, Process.getGidForName("") + 269).intern(), MediaPlayer.class);
        dsVar.m2419(m2417((char) TextUtils.getCapsMode("", 0, 0), AndroidCharacter.getMirror('0') - ')', 279 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), WebView.class);
        dsVar.m2419(m2417((char) (5763 - Gravity.getAbsoluteGravity(0, 0)), Process.getGidForName("") + 12, 287 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), FrameLayout.class);
        dsVar.m2419(m2417((char) (Color.blue(0) + 48307), 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 298).intern(), ImageButton.class);
        dsVar.m2419(m2417((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 10, 307 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), URLDecoder.class);
        dsVar.m2419(m2417((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 9 - (ViewConfiguration.getFadingEdgeLength() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE).intern(), ViewGroup.class);
        dsVar.m2419(m2417((char) TextUtils.getTrimmedLength(""), 9 - View.MeasureSpec.getMode(0), 326 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), ImageView.class);
        dsVar.m2419(m2417((char) View.resolveSizeAndState(0, 0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 5, 336 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), Array.class);
        dsVar.m2419(m2417((char) KeyEvent.keyCodeFromString(""), 6 - (ViewConfiguration.getWindowTouchSlop() >> 8), View.resolveSizeAndState(0, 0, 0) + 341).intern(), Arrays.class);
        dsVar.m2419(m2417((char) (51075 - View.MeasureSpec.getSize(0)), TextUtils.lastIndexOf("", '0', 0) + 5, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 347).intern(), Math.class);
        dsVar.m2419(m2417((char) (64882 - (ViewConfiguration.getTapTimeout() >> 16)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8, Process.getGidForName("") + 352).intern(), ArrayList.class);
        dsVar.m2419(m2417((char) Gravity.getAbsoluteGravity(0, 0), 4 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 359).intern(), List.class);
        dsVar.m2419(m2417((char) Color.green(0), TextUtils.getOffsetAfter("", 0) + 7, 364 - View.combineMeasuredStates(0, 0)).intern(), HashSet.class);
        dsVar.m2419(m2417((char) KeyEvent.normalizeMetaState(0), 3 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 371).intern(), Set.class);
        dsVar.m2419(m2417((char) Color.blue(0), 6 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 374).intern(), HashMap.class);
        dsVar.m2419(m2417((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15171), 2 - TextUtils.lastIndexOf("", '0'), 380 - ImageFormat.getBitsPerPixel(0)).intern(), Map.class);
        dsVar.m2419(m2417((char) (46032 - Color.green(0)), TextUtils.getTrimmedLength("") + 11, 384 - ExpandableListView.getPackedPositionGroup(0L)).intern(), WeakHashMap.class);
        dsVar.m2419(m2417((char) (TextUtils.lastIndexOf("", '0') + 18558), KeyEvent.getDeadChar(0, 0) + 13, 396 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), WeakReference.class);
        dsVar.m2419(m2417((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3343), 17 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), AndroidCharacter.getMirror('0') + 360).intern(), ConcurrentHashMap.class);
        dsVar.m2419(m2417((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 6, 425 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), Intent.class);
        dsVar.m2419(m2417((char) (23002 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 6 - (ViewConfiguration.getTouchSlop() >> 8), 430 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), Bundle.class);
        dsVar.m2419(m2417((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9, 309 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), URLDecoder.class);
        dsVar.m2419(m2417((char) (60904 - Drawable.resolveOpacity(0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 11, 437 - View.getDefaultSize(0, 0)).intern(), Collections.class);
        dsVar.m2419(m2417((char) (TextUtils.getOffsetBefore("", 0) + 38339), 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 447 - TextUtils.indexOf((CharSequence) "", '0')).intern(), ExecutorService.class);
        dsVar.m2419(m2417((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 17 - Color.alpha(0), ExpandableListView.getPackedPositionGroup(0L) + 463).intern(), BroadcastReceiver.class);
        dsVar.m2419(m2417((char) (3989 - TextUtils.lastIndexOf("", '0')), 12 - (KeyEvent.getMaxKeyCode() >> 16), 480 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), IntentFilter.class);
        dsVar.m2419(m2417((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 47017), 17 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 491 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), ParameterizedType.class);
        dsVar.m2419(m2417((char) ExpandableListView.getPackedPositionType(0L), 5 - ((byte) KeyEvent.getModifierMetaStateMask()), 508 - TextUtils.indexOf((CharSequence) "", '0')).intern(), Base64.class);
        dsVar.m2419(m2417((char) (60388 - TextUtils.getCapsMode("", 0, 0)), 3 - TextUtils.indexOf((CharSequence) "", '0'), MotionEvent.axisFromString("") + 516).intern(), View.class);
        dsVar.m2419(m2417((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), ImageFormat.getBitsPerPixel(0) + IronSourceError.ERROR_NO_INTERNET_CONNECTION).intern(), ClassLoader.class);
        dsVar.m2419(m2417((char) KeyEvent.normalizeMetaState(0), TextUtils.getOffsetAfter("", 0) + 4, TextUtils.indexOf("", "") + IronSourceError.ERROR_AD_UNIT_CAPPED).intern(), Enum.class);
        dsVar.m2419(m2417((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 6, Color.green(0) + 534).intern(), Number.class);
        dsVar.m2419(m2417((char) ((ViewConfiguration.getTouchSlop() >> 8) + 35653), TextUtils.getOffsetBefore("", 0) + 8, 539 - TextUtils.lastIndexOf("", '0', 0)).intern(), Activity.class);
        dsVar.m2419(m2417((char) (KeyEvent.getDeadChar(0, 0) + 28099), 12 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 548).intern(), StringBuffer.class);
        dsVar.m2419(m2417((char) KeyEvent.normalizeMetaState(0), ExpandableListView.getPackedPositionChild(0L) + 14, 561 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), StringBuilder.class);
        dsVar.m2419(m2417((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 53150), 6 - View.MeasureSpec.getSize(0), 573 - Color.green(0)).intern(), Thread.class);
        dsVar.m2419(m2417((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.getDeadChar(0, 0) + 4, 579 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), Void.class);
        dsVar.m2419(m2417((char) (Color.rgb(0, 0, 0) + 16789472), 3 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 583 - (Process.myTid() >> 22)).intern(), Type.class);
        dsVar.m2419(m2417((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 5 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 587).intern(), dq.class);
        dsVar.m2419(m2417((char) (ExpandableListView.getPackedPositionChild(0L) + 57215), Color.green(0) + 9, Color.argb(0, 0, 0, 0) + 593).intern(), Reference.class);
        dsVar.m2419(m2417((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22073), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12, 601 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), AbstractList.class);
        dsVar.m2419(m2417((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 11 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 614).intern(), AbstractMap.class);
        dsVar.m2419(m2417((char) (Process.myTid() >> 22), 7 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 625 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), Handler.class);
        dsVar.m2419(m2417((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 13, 631 - TextUtils.indexOf((CharSequence) "", '0')).intern(), HandlerThread.class);
        dsVar.m2419(m2417((char) View.combineMeasuredStates(0, 0), 3 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 644).intern(), Log.class);
        dsVar.m2419(m2417((char) ((ViewConfiguration.getTouchSlop() >> 8) + 18559), 11 - KeyEvent.normalizeMetaState(0), 648 - View.MeasureSpec.getSize(0)).intern(), SurfaceView.class);
        dsVar.m2419(m2417((char) (18282 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 11 - TextUtils.indexOf("", "", 0), 659 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), TextureView.class);
        dsVar.m2419(m2417((char) (49127 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14, KeyEvent.normalizeMetaState(0) + 670).intern(), GestureDetector.class);
        dsVar.m2419(m2417((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 59739), 23 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 686).intern(), GestureDetector.SimpleOnGestureListener.class);
        dsVar.m2419(m2417((char) (Color.rgb(0, 0, 0) + 16784499), TextUtils.indexOf("", "") + 7, Gravity.getAbsoluteGravity(0, 0) + IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT).intern(), Context.class);
        dsVar.m2419(m2417((char) (Color.rgb(0, 0, 0) + 16777216), 16 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + IronSourceError.ERROR_NT_LOAD_NO_CONFIG).intern(), WebChromeClient.class);
        dsVar.m2419(m2417((char) (30655 - (ViewConfiguration.getEdgeSlop() >> 16)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 729).intern(), Dialog.class);
        dsVar.m2419(m2417((char) ((-1) - MotionEvent.axisFromString("")), 9 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 736 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), Fragment.class);
        dsVar.m2419(m2417((char) ((-16777216) - Color.rgb(0, 0, 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 14, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 744).intern(), DialogFragment.class);
        dsVar.m2419(m2417((char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, 758 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), Application.class);
        dsVar.m2419(m2417((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 9 - View.resolveSizeAndState(0, 0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 770).intern(), Resources.class);
        dsVar.m2419(m2417((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Process.getGidForName("") + 13, (KeyEvent.getMaxKeyCode() >> 16) + 778).intern(), IntentSender.class);
        dsVar.m2419(m2417((char) (View.MeasureSpec.getMode(0) + 34406), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 4, 790 - TextUtils.getOffsetAfter("", 0)).intern(), Pair.class);
        dsVar.m2419(m2417((char) (31865 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10, TextUtils.indexOf("", "") + 794).intern(), LinkedList.class);
        dsVar.m2419(m2417((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 11020), TextUtils.indexOf("", "", 0, 0) + 11, 804 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), MotionEvent.class);
        dsVar.m2419(m2417((char) (48927 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 8 - View.resolveSize(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 815).intern(), Modifier.class);
        dsVar.m2419(m2417((char) (TextUtils.getOffsetBefore("", 0) + 65510), (ViewConfiguration.getWindowTouchSlop() >> 8) + 13, View.MeasureSpec.makeMeasureSpec(0, 0) + 823).intern(), AtomicBoolean.class);
        dsVar.m2419(m2417((char) (((Process.getThreadPriority(0) + 20) >> 6) + 6267), 6 - Color.alpha(0), KeyEvent.getDeadChar(0, 0) + 836).intern(), Window.class);
        dsVar.m2419(m2417((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 11, 842 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), AdapterView.class);
        dsVar.m2419(m2417((char) (View.resolveSize(0, 0) + 41721), 7 - TextUtils.indexOf("", ""), 853 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), Adapter.class);
        dsVar.m2419(m2417((char) (27518 - (Process.myTid() >> 22)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10, ImageFormat.getBitsPerPixel(0) + 861).intern(), ScrollView.class);
        dsVar.m2419(m2417((char) (TextUtils.indexOf("", "", 0, 0) + 12576), 8 - (Process.myTid() >> 22), 871 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), TextView.class);
        dsVar.m2419(m2417((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29147), TextUtils.getTrimmedLength("") + 6, 878 - TextUtils.getTrimmedLength("")).intern(), Button.class);
        dsVar.m2419(m2417((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 12 - Color.blue(0), 884 - Color.red(0)).intern(), LinearLayout.class);
        dsVar.m2419(m2417((char) (46370 - (ViewConfiguration.getPressedStateDuration() >> 16)), Color.argb(0, 0, 0, 0) + 14, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 895).intern(), RelativeLayout.class);
        dsVar.m2419(m2417((char) (34341 - ((byte) KeyEvent.getModifierMetaStateMask())), Drawable.resolveOpacity(0, 0) + 15, View.MeasureSpec.makeMeasureSpec(0, 0) + EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_PAID_VALUE).intern(), View.OnClickListener.class);
        dsVar.m2419(m2417((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 59621), TextUtils.indexOf("", "", 0) + 22, 924 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), View.OnLayoutChangeListener.class);
        dsVar.m2419(m2417((char) (ExpandableListView.getPackedPositionChild(0L) + 14762), (ViewConfiguration.getEdgeSlop() >> 16) + 15, KeyEvent.keyCodeFromString("") + 947).intern(), KeyguardManager.class);
        dsVar.m2419(m2417((char) Drawable.resolveOpacity(0, 0), (Process.myTid() >> 22) + 15, View.resolveSize(0, 0) + 962).intern(), AtomicReference.class);
        dsVar.m2419(m2417((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 17 - Color.green(0), (Process.myPid() >> 22) + 977).intern(), PreferenceManager.class);
        dsVar.m2419(m2417((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 58448), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8, 1042 - AndroidCharacter.getMirror('0')).intern(), Executor.class);
        dsVar.m2419(m2417((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 18 - View.combineMeasuredStates(0, 0), 1002 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), hc.class);
        dsVar.m2419(m2417((char) (12264 - (Process.myPid() >> 22)), View.getDefaultSize(0, 0) + 5, Color.blue(0) + 1020).intern(), Proxy.class);
        dsVar.m2419(m2417((char) (9434 - AndroidCharacter.getMirror('0')), TextUtils.indexOf((CharSequence) "", '0') + 18, 1025 - TextUtils.indexOf("", "")).intern(), SharedPreferences.class);
        dsVar.m2419(m2417((char) (50295 - Color.red(0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13, 1042 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), dg.class);
        dsVar.m2419(m2417((char) (52006 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12, 1055 - TextUtils.indexOf("", "", 0)).intern(), WebViewClient.class);
        dsVar.m2419(m2417((char) Color.red(0), 22 - Color.alpha(0), 1067 - Process.getGidForName("")).intern(), hh.class);
        dsVar.m2419(m2417((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 24 - (Process.myTid() >> 22), 1091 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), hk.class);
        dsVar.m2419(m2417((char) (61950 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), MotionEvent.axisFromString("") + 1115).intern(), di.class);
        dsVar.m2419(m2417((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 8869), 12 - (Process.myPid() >> 22), (ViewConfiguration.getTapTimeout() >> 16) + 1128).intern(), dk.class);
        dsVar.m2419(m2417((char) (View.resolveSize(0, 0) + 54287), 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 1141).intern(), dj.class);
        dsVar.m2419(m2417((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 27073), KeyEvent.normalizeMetaState(0) + 6, 1151 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), Bitmap.class);
        dsVar.m2419(m2417((char) (Color.argb(0, 0, 0, 0) + 29909), View.combineMeasuredStates(0, 0) + 15, 1158 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), 1);
        dsVar.m2419(m2417((char) (22504 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 16 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1171).intern(), 2);
        dsVar.m2419(m2417((char) (TextUtils.getCapsMode("", 0, 0) + 10633), 18 - Gravity.getAbsoluteGravity(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1187).intern(), 4);
        dsVar.m2419(m2417((char) Color.red(0), 15 - TextUtils.getOffsetAfter("", 0), 1206 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), 8);
        dsVar.m2419(m2417((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 14, KeyEvent.normalizeMetaState(0) + 1221).intern(), 16);
        dsVar.m2419(m2417((char) (65363 - TextUtils.indexOf("", "", 0, 0)), View.resolveSizeAndState(0, 0, 0) + 21, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1235).intern(), 32);
        dsVar.m2419(m2417((char) (42993 - Color.green(0)), Color.argb(0, 0, 0, 0) + 17, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1255).intern(), 64);
        dsVar.m2419(m2417((char) (41965 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 18 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1273 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), 128);
        dsVar.m2419(m2417((char) TextUtils.indexOf("", "", 0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 16, 1290 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), Integer.valueOf(NotificationCompat.FLAG_LOCAL_ONLY));
        dsVar.m2419(m2417((char) (52428 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 18, 1305 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), 512);
        dsVar.m2419(m2417((char) (((Process.getThreadPriority(0) + 20) >> 6) + 9734), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17, 1324 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), 1024);
        dsVar.m2419(m2417((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 26634), 15 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1341 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), 2048);
        dsVar.m2419(m2417((char) (Color.rgb(0, 0, 0) + 16777216), 7 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1356).intern(), Boolean.TYPE);
        dsVar.m2419(m2417((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 4 - KeyEvent.keyCodeFromString(""), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1363).intern(), Character.TYPE);
        dsVar.m2419(m2417((char) View.MeasureSpec.getMode(0), 3 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1367 - (Process.myTid() >> 22)).intern(), Byte.TYPE);
        dsVar.m2419(m2417((char) Gravity.getAbsoluteGravity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6, (-16775845) - Color.rgb(0, 0, 0)).intern(), Short.TYPE);
        dsVar.m2419(m2417((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 6387), Color.red(0) + 3, 1376 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), Integer.TYPE);
        dsVar.m2419(m2417((char) (39693 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0) + 5, 1379 - TextUtils.indexOf("", "", 0)).intern(), Long.TYPE);
        dsVar.m2419(m2417((char) ((ViewConfiguration.getTapTimeout() >> 16) + 61860), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4, 1383 - KeyEvent.normalizeMetaState(0)).intern(), Float.TYPE);
        dsVar.m2419(m2417((char) ((ViewConfiguration.getTouchSlop() >> 8) + 21001), 6 - View.combineMeasuredStates(0, 0), 1387 - ExpandableListView.getPackedPositionChild(0L)).intern(), Double.TYPE);
        dsVar.m2419(m2417((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 4, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1394).intern(), Void.TYPE);
        dsVar.m2419(m2417((char) (48008 - View.MeasureSpec.getMode(0)), 21 - (ViewConfiguration.getEdgeSlop() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1398).intern(), Integer.valueOf(Build.VERSION.SDK_INT));
        dsVar.m2419(m2417((char) (45079 - (KeyEvent.getMaxKeyCode() >> 16)), KeyEvent.getDeadChar(0, 0) + 12, 1419 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), 0);
        dsVar.m2419(m2417((char) (43311 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14, 1431 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), 4);
        dsVar.m2419(m2417((char) (33457 - ((byte) KeyEvent.getModifierMetaStateMask())), Color.blue(0) + 9, ((byte) KeyEvent.getModifierMetaStateMask()) + 1446).intern(), 8);
        dsVar.m2419(m2417((char) (17810 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), View.resolveSize(0, 0) + 24, 1455 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), 0);
        dsVar.m2419(m2417((char) Color.blue(0), 22 - KeyEvent.keyCodeFromString(""), 1478 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), 1);
        dsVar.m2419(m2417((char) (MotionEvent.axisFromString("") + 1945), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1500).intern(), 2);
        dsVar.m2419(m2417((char) (KeyEvent.getMaxKeyCode() >> 16), 26 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1524).intern(), 3);
        dsVar.m2419(m2417((char) ('0' - AndroidCharacter.getMirror('0')), 27 - TextUtils.indexOf("", "", 0), 1550 - KeyEvent.keyCodeFromString("")).intern(), 4);
        dsVar.m2419(m2417((char) (Gravity.getAbsoluteGravity(0, 0) + 31002), (-16777184) - Color.rgb(0, 0, 0), 1577 - View.getDefaultSize(0, 0)).intern(), 5);
        dsVar.m2419(m2417((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 30, 1609 - View.getDefaultSize(0, 0)).intern(), 6);
        dsVar.m2419(m2417((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 21589), (ViewConfiguration.getScrollBarSize() >> 8) + 30, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1639).intern(), 7);
        dsVar.m2419(m2417((char) (View.resolveSizeAndState(0, 0, 0) + 20093), 25 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1668).intern(), 8);
        dsVar.m2419(m2417((char) View.MeasureSpec.getMode(0), 30 - ImageFormat.getBitsPerPixel(0), (-16775521) - Color.rgb(0, 0, 0)).intern(), 9);
        dsVar.m2419(m2417((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 5171), View.MeasureSpec.getMode(0) + 30, View.MeasureSpec.getSize(0) + 1726).intern(), 10);
        dsVar.m2419(m2417((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 32 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1755).intern(), 11);
        dsVar.m2419(m2417((char) (33386 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 33, 1788 - Color.alpha(0)).intern(), 12);
        dsVar.m2419(m2417((char) (5012 - TextUtils.getCapsMode("", 0, 0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 20, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1821).intern(), ig.f2705);
        dsVar.m2419(m2417((char) (44396 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14, 1844 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), ig.f2707);
        dsVar.m2419(m2417((char) (Gravity.getAbsoluteGravity(0, 0) + 37301), 14 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1905 - AndroidCharacter.getMirror('0')).intern(), ig.f2708);
        dsVar.m2419(m2417((char) (ViewConfiguration.getScrollBarSize() >> 8), 12 - KeyEvent.getDeadChar(0, 0), KeyEvent.keyCodeFromString("") + 1871).intern(), ig.f2661);
        dsVar.m2419(m2417((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 14 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), Color.argb(0, 0, 0, 0) + 1883).intern(), ig.f2662);
        dsVar.m2419(m2417((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1896).intern(), ig.f2704);
        dsVar.m2419(m2417((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 13686), 17 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1913).intern(), ig.f2706);
        dsVar.m2419(m2417((char) KeyEvent.getDeadChar(0, 0), 27 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 1930).intern(), ig.f2654);
        dsVar.m2419(m2417((char) (37969 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (-16777197) - Color.rgb(0, 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 1957).intern(), ig.f2701);
        dsVar.m2419(m2417((char) (Process.myPid() >> 22), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22, 1976 - (Process.myTid() >> 22)).intern(), ig.f2700);
        dsVar.m2419(m2417((char) (ViewConfiguration.getWindowTouchSlop() >> 8), Drawable.resolveOpacity(0, 0) + 18, ExpandableListView.getPackedPositionGroup(0L) + 1998).intern(), ig.f2699);
        dsVar.m2419(m2417((char) (4850 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 20 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2016 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), ig.f2703);
        dsVar.m2419(m2417((char) (KeyEvent.getDeadChar(0, 0) + 40738), ExpandableListView.getPackedPositionChild(0L) + 22, (KeyEvent.getMaxKeyCode() >> 16) + 2036).intern(), ig.f2702);
        dsVar.m2419(m2417((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22343), 25 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 2057 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), ig.f2695);
        dsVar.m2419(m2417((char) (26175 - (KeyEvent.getMaxKeyCode() >> 16)), 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 2082).intern(), ig.f2694);
        dsVar.m2419(m2417((char) (KeyEvent.getMaxKeyCode() >> 16), 37 - ImageFormat.getBitsPerPixel(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2104).intern(), ig.f2669);
        dsVar.m2419(m2417((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.getOffsetBefore("", 0) + 19, 2143 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), ig.f2656);
        dsVar.m2419(m2417((char) TextUtils.getOffsetBefore("", 0), ExpandableListView.getPackedPositionType(0L) + 30, (-16775054) - Color.rgb(0, 0, 0)).intern(), ig.f2657);
        dsVar.m2419(m2417((char) (ImageFormat.getBitsPerPixel(0) + 1), 32 - ExpandableListView.getPackedPositionGroup(0L), 2192 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), ig.f2658);
        dsVar.m2419(m2417((char) (View.MeasureSpec.getMode(0) + 51187), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18, ExpandableListView.getPackedPositionType(0L) + 2224).intern(), ig.f2692);
        dsVar.m2419(m2417((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25061), (Process.myTid() >> 22) + 22, 2244 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), ig.f2690);
        dsVar.m2419(m2417((char) (Color.green(0) + 24591), 23 - (ViewConfiguration.getTapTimeout() >> 16), 2265 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), ig.f2697);
        dsVar.m2419(m2417((char) TextUtils.indexOf("", ""), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 28, (Process.myTid() >> 22) + 2288).intern(), ig.f2696);
        dsVar.m2419(m2417((char) (Color.rgb(0, 0, 0) + 16777216), 29 - TextUtils.indexOf((CharSequence) "", '0'), 2316 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), ig.f2698);
        dsVar.m2419(m2417((char) (63031 - (ViewConfiguration.getPressedStateDuration() >> 16)), View.MeasureSpec.getMode(0) + 25, ImageFormat.getBitsPerPixel(0) + 2347).intern(), ig.f2693);
        dsVar.m2419(m2417((char) View.MeasureSpec.makeMeasureSpec(0, 0), 19 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2372).intern(), ig.f2691);
        dsVar.m2419(m2417((char) ((-1) - Process.getGidForName("")), 26 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 2389 - ExpandableListView.getPackedPositionChild(0L)).intern(), ig.f2685);
        dsVar.m2419(m2417((char) KeyEvent.normalizeMetaState(0), View.resolveSizeAndState(0, 0, 0) + 24, 2415 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), ig.f2686);
        dsVar.m2419(m2417((char) TextUtils.indexOf("", "", 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 23, 2439 - Color.argb(0, 0, 0, 0)).intern(), ig.f2688);
        dsVar.m2419(m2417((char) (2276 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 23 - MotionEvent.axisFromString(""), 2462 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), ig.f2681);
        dsVar.m2419(m2417((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 24824), 28 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2487).intern(), ig.f2680);
        dsVar.m2419(m2417((char) (KeyEvent.normalizeMetaState(0) + 35027), ((Process.getThreadPriority(0) + 20) >> 6) + 23, 2513 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), ig.f2689);
        dsVar.m2419(m2417((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 49017), TextUtils.indexOf("", "", 0) + 32, 2584 - AndroidCharacter.getMirror('0')).intern(), ig.f2684);
        dsVar.m2419(m2417((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 30 - Color.green(0), 2568 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), ig.f2687);
        dsVar.m2419(m2417((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29196), (ViewConfiguration.getWindowTouchSlop() >> 8) + 21, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2598).intern(), ig.f2682);
        dsVar.m2419(m2417((char) (42134 - Color.alpha(0)), 21 - TextUtils.getCapsMode("", 0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2620).intern(), ig.f2679);
        dsVar.m2419(m2417((char) KeyEvent.getDeadChar(0, 0), 18 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2640).intern(), ig.f2683);
        dsVar.m2419(m2417((char) Color.blue(0), 20 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 2658).intern(), ig.f2677);
        dsVar.m2419(m2417((char) ((-1) - Process.getGidForName("")), TextUtils.getOffsetAfter("", 0) + 24, 2679 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), ig.f2674);
        dsVar.m2419(m2417((char) ((-1) - Process.getGidForName("")), ((Process.getThreadPriority(0) + 20) >> 6) + 16, Color.green(0) + 2702).intern(), ig.f2675);
        dsVar.m2419(m2417((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 24 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 2718 - View.resolveSize(0, 0)).intern(), ig.f2678);
        dsVar.m2419(m2417((char) Color.argb(0, 0, 0, 0), 25 - TextUtils.indexOf("", "", 0, 0), 2742 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), ig.f2676);
        dsVar.m2419(m2417((char) (ImageFormat.getBitsPerPixel(0) + 47207), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 25, 2767 - TextUtils.indexOf("", "", 0)).intern(), ig.f2673);
        f2036 = (f2035 + 21) % 128;
        return dsVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final ds m2418() {
        int i10 = (f2036 + 81) % 128;
        f2035 = i10;
        ds dsVar = this.f2040;
        int i11 = i10 + 27;
        f2036 = i11 % 128;
        if (i11 % 2 != 0) {
            return dsVar;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Object m2420(String str) {
        for (ds dsVar = this; dsVar != null; dsVar = dsVar.f2039) {
            int i10 = f2035 + 7;
            f2036 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 9 / 0;
                if (dsVar.f2041.containsKey(dy.m2458(str))) {
                    Object obj = dsVar.f2041.get(dy.m2458(str));
                    f2035 = (f2036 + 91) % 128;
                    return obj;
                }
            } else {
                if (dsVar.f2041.containsKey(dy.m2458(str))) {
                    Object obj2 = dsVar.f2041.get(dy.m2458(str));
                    f2035 = (f2036 + 91) % 128;
                    return obj2;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2417((char) (28290 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 8 - ((byte) KeyEvent.getModifierMetaStateMask()), 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
        sb2.append(str);
        throw new RuntimeException(com.google.android.gms.internal.play_billing.a.i(m2417((char) (Color.red(0) + 53843), 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 9 - (ViewConfiguration.getLongPressTimeout() >> 16)), sb2));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ds m2422() {
        int i10 = f2035 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        int i11 = i10 % 128;
        f2036 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        ds dsVar = this.f2039;
        int i12 = i11 + 19;
        f2035 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 82 / 0;
        }
        return dsVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m2419(String str, Object obj) {
        int i10 = (f2036 + 83) % 128;
        f2035 = i10;
        f2036 = (i10 + 79) % 128;
        for (ds dsVar = this; dsVar != null; dsVar = dsVar.f2039) {
            if (dsVar.f2041.containsKey(dy.m2458(str))) {
                dsVar.f2041.put(dy.m2458(str), obj);
                int i11 = f2036 + 109;
                f2035 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 2 / 0;
                    return;
                }
                return;
            }
        }
        this.f2041.put(dy.m2458(str), obj);
    }

    public ds(ds dsVar) {
        this(new HashMap(), dsVar);
    }

    public ds(Map<String, Object> map, ds dsVar) {
        this(map, dsVar, dsVar == null);
    }

    public ds(Map<String, Object> map, ds dsVar, boolean z10) {
        if (map != null) {
            this.f2041 = new HashMap(map);
        } else {
            this.f2041 = new HashMap();
        }
        this.f2039 = dsVar;
        if (!z10 && dsVar != null) {
            this.f2040 = dsVar.f2040;
        } else {
            this.f2040 = this;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m2421(List<String> list) {
        if (list != null) {
            f2036 = (f2035 + 97) % 128;
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                int i10 = f2036 + 53;
                f2035 = i10 % 128;
                if (i10 % 2 != 0) {
                    this.f2041.put(it.next(), null);
                    int i11 = 42 / 0;
                } else {
                    this.f2041.put(it.next(), null);
                }
                f2036 = (f2035 + 85) % 128;
            }
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2417(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f2037[i11 + i12] ^ (i12 * f2038)) ^ c10);
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
}
