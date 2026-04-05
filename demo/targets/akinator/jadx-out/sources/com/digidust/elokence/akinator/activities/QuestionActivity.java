package com.digidust.elokence.akinator.activities;

import aa.f;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.c1;
import ca.m;
import ca.o;
import com.digidust.elokence.akinator.activities.rarecharacter.CongratRareCharacterActivity;
import com.digidust.elokence.akinator.db.accountdb.AccountDatabase;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorSmallButton;
import com.digidust.elokence.akinator.paid.databinding.ActivityQuestionBinding;
import com.google.firebase.analytics.FirebaseAnalytics;
import i.d;
import j1.o2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import jb.h;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import lb.b1;
import lb.e;
import mt.b0;
import mt.n0;
import nm.i;
import o5.s0;
import o9.b5;
import o9.b6;
import o9.c5;
import o9.d5;
import o9.d6;
import o9.e5;
import o9.g0;
import o9.h0;
import o9.i6;
import o9.l6;
import o9.p3;
import o9.r5;
import o9.r6;
import o9.t6;
import o9.u5;
import o9.u6;
import o9.v5;
import o9.x;
import o9.x3;
import o9.y3;
import oa.l;
import ou.j;
import pt.c;
import timber.log.Timber;
import tu.t;
import tu.x0;
import u9.k;
import uu.u;
import x9.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class QuestionActivity extends AkActivity {

    /* renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ int f21703n0 = 0;
    public ActivityQuestionBinding C;
    public boolean D;
    public FirebaseAnalytics E;
    public l F;
    public boolean G;
    public k H;
    public b I;
    public ka.a O;
    public ka.a P;
    public ka.a Q;
    public e.g R;
    public e.c T;
    public e.g U;
    public boolean V;
    public boolean W;
    public boolean X;
    public c Y;
    public boolean Z;
    public int J = -1;
    public ka.c K = ka.c.f70703e;
    public ka.a L = ka.a.f70674f;
    public final u M = new u();
    public final u N = new u();
    public final ArrayList S = new ArrayList();

    /* renamed from: a0, reason: collision with root package name */
    public final b5 f21704a0 = new b5(this, 7);

    /* renamed from: b0, reason: collision with root package name */
    public final b5 f21705b0 = new b5(this, 9);

    /* renamed from: c0, reason: collision with root package name */
    public final b5 f21706c0 = new b5(this, 10);

    /* renamed from: d0, reason: collision with root package name */
    public final b5 f21707d0 = new b5(this, 11);

    /* renamed from: e0, reason: collision with root package name */
    public final b5 f21708e0 = new b5(this, 0);

    /* renamed from: f0, reason: collision with root package name */
    public final b5 f21709f0 = new b5(this, 1);

    /* renamed from: g0, reason: collision with root package name */
    public final b5 f21710g0 = new b5(this, 2);

    /* renamed from: h0, reason: collision with root package name */
    public final b5 f21711h0 = new b5(this, 3);

    /* renamed from: i0, reason: collision with root package name */
    public final b5 f21712i0 = new b5(this, 4);

    /* renamed from: j0, reason: collision with root package name */
    public final b6 f21713j0 = new b6(this);

    /* renamed from: k0, reason: collision with root package name */
    public final b5 f21714k0 = new b5(this, 5);

    /* renamed from: l0, reason: collision with root package name */
    public final b5 f21715l0 = new b5(this, 8);

    /* renamed from: m0, reason: collision with root package name */
    public final d f21716m0 = registerForActivityResult(new j.d(), new e5(this, 5));

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public static String B() {
        e currentSession = o.sharedInstance().getCurrentSession();
        e0.checkNotNull(currentSession);
        e.i currentSessionProgression = currentSession.getCurrentSessionProgression();
        e0.checkNotNull(currentSessionProgression);
        if (currentSessionProgression.getStep() == 0) {
            return "akinator_defi";
        }
        if (currentSessionProgression.getProgression() >= 80.0f) {
            return "akinator_mobile";
        }
        if (ca.u.sharedInstance().getLastProgression() < 50.0f && currentSessionProgression.getProgression() >= 50.0f) {
            return "akinator_inspiration_forte";
        }
        if (currentSessionProgression.getProgression() >= 50.0f) {
            return "akinator_confiant";
        }
        if (ca.u.sharedInstance().getLastProgression() - currentSessionProgression.getProgression() > 16.0f) {
            return "akinator_surprise";
        }
        if (ca.u.sharedInstance().getLastProgression() - currentSessionProgression.getProgression() > 8.0f) {
            return "akinator_etonnement";
        }
        float step = currentSessionProgression.getStep() * 4;
        float step2 = currentSessionProgression.getStep() <= 10 ? (((10 - currentSessionProgression.getStep()) * step) + (currentSessionProgression.getProgression() * currentSessionProgression.getStep())) / 10 : 0.0f;
        if (step2 >= step) {
            return "akinator_inspiration_legere";
        }
        double d10 = step2;
        double d11 = step;
        return d10 >= 0.8d * d11 ? "akinator_serein" : d10 >= 0.6d * d11 ? "akinator_concentration_intense" : d10 >= 0.4d * d11 ? "akinator_leger_decouragement" : d10 >= d11 * 0.2d ? "akinator_tension" : "akinator_vrai_decouragement";
    }

    public static ka.a C(ka.c cVar, ka.c cVar2) {
        if ((cVar == ka.c.f70703e || cVar == ka.c.f70702c) && cVar2 == ka.c.f70704f) {
            return ka.a.f70671b;
        }
        int iOrdinal = cVar2.ordinal();
        if (iOrdinal == 0) {
            return ka.a.f70678j;
        }
        if (iOrdinal == 1) {
            return ka.a.f70685q;
        }
        if (iOrdinal == 2) {
            return ka.a.f70671b;
        }
        if (iOrdinal == 3) {
            return ka.a.f70686r;
        }
        if (iOrdinal == 4) {
            return ka.a.f70686r;
        }
        throw new t();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(1:93)|39|40|89|41|(1:49)|50|(2:62|(1:98))(7:52|(1:54)(1:55)|56|57|58|(2:60|96)|61)) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0126, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0127, code lost:
    
        r8 = r16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:37:0x00f1, B:93:0x00f6], limit reached: 92 */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0134 A[Catch: all -> 0x0126, TRY_ENTER, TryCatch #2 {all -> 0x0126, blocks: (B:41:0x011a, B:49:0x0134, B:50:0x013b, B:52:0x0145, B:54:0x0149, B:56:0x014f), top: B:89:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0145 A[Catch: all -> 0x0126, TryCatch #2 {all -> 0x0126, blocks: (B:41:0x011a, B:49:0x0134, B:50:0x013b, B:52:0x0145, B:54:0x0149, B:56:0x014f), top: B:89:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ba A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #3 {all -> 0x0066, blocks: (B:34:0x00db, B:58:0x0189, B:61:0x0198, B:62:0x01ba, B:18:0x0061, B:23:0x006f, B:26:0x007a), top: B:91:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v6, types: [da.o] */
    /* JADX WARN: Type inference failed for: r0v8, types: [da.o] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.digidust.elokence.akinator.activities.QuestionActivity] */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.digidust.elokence.akinator.activities.QuestionActivity] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.digidust.elokence.akinator.activities.AkActivity] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.content.Context, com.digidust.elokence.akinator.activities.QuestionActivity] */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.digidust.elokence.akinator.activities.AkActivity, com.digidust.elokence.akinator.activities.QuestionActivity] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x021e -> B:13:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$doAnswearLegacy(com.digidust.elokence.akinator.activities.QuestionActivity r19, zu.d r20) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.QuestionActivity.access$doAnswearLegacy(com.digidust.elokence.akinator.activities.QuestionActivity, zu.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:189|(2:191|192)|193|(2:195|196)|197|198|(2:200|201)|202|(2:204|205)|206|207|263|208|(2:210|286)(14:211|212|(0)|218|(0)|222|223|(0)|227|228|280|229|188|231)) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:17|276|18|19|212|(3:282|214|215)|218|(2:220|221)|222|223|(2:225|226)|227|228|280|229|188|231) */
    /* JADX WARN: Can't wrap try/catch for region: R(26:57|(1:274)|58|61|(1:68)(1:67)|69|(2:83|(2:87|(2:121|(1:123)(1:124))(2:89|(2:115|(1:120)(1:119))(2:91|(2:111|(1:113)(1:114))(2:93|(2:104|(1:110)(2:106|(1:108)(1:109)))(2:95|(2:102|103)(2:97|(1:101)(1:100)))))))(1:86))(2:71|(1:82)(2:73|(1:75)(2:76|(1:81)(1:80))))|125|(1:127)|128|(1:130)|131|(1:133)|134|(1:136)|137|(5:139|(1:141)|142|(1:144)|145)(1:146)|147|(1:149)|150|(1:152)|153|272|154|155|(1:287)(7:158|261|159|160|278|161|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(4:(4:267|173|174|175)(1:179)|270|180|(14:189|(2:191|192)|193|(2:195|196)|197|198|(2:200|201)|202|(2:204|205)|206|207|263|208|(2:210|286)(14:211|212|(0)|218|(0)|222|223|(0)|227|228|280|229|188|231))(6:182|(1:184)(1:185)|186|187|188|231)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:30|31|32|261|159|160|278|161|(1:288)(8:164|26|165|(0)|(0)(0)|270|180|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x063f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0640, code lost:
    
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0642, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0643, code lost:
    
        r2 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0646, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0647, code lost:
    
        r2 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x064b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x064c, code lost:
    
        r2 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x064e, code lost:
    
        r1 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0656, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0657, code lost:
    
        r2 = r20;
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0664, code lost:
    
        r0 = da.q.f51970b;
        r3.f78289i = r1;
        r3.f78290j = null;
        r3.f78291k = null;
        r3.f78292l = r9;
        r3.f78297q = 4;
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0677, code lost:
    
        if (r0.await(r1, 0, r3) == r4) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x067a, code lost:
    
        r6 = r16;
        r7 = r17;
        r8 = r18;
        r10 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0684, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0689, code lost:
    
        if ((r0 instanceof java.util.concurrent.TimeoutException) != false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x068b, code lost:
    
        android.widget.Toast.makeText(r1, "Temps de réponse dépassé", 0).show();
        r1.goToHome(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0697, code lost:
    
        r6 = r16;
        r7 = r17;
        r8 = r18;
        r10 = r19;
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x06a2, code lost:
    
        r0 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x06a6, code lost:
    
        if (r0 == null) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x06a8, code lost:
    
        r0 = "Erreur inconnue";
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x06aa, code lost:
    
        android.widget.Toast.makeText(r1, r0, 0).show();
        r1.goToHome(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x01b2, code lost:
    
        r6 = r16;
        r7 = r17;
        r8 = r18;
        r10 = r19;
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Path cross not found for [B:167:0x0468, B:172:0x0489], limit reached: 283 */
    /* JADX WARN: Path cross not found for [B:172:0x0489, B:265:0x046a], limit reached: 283 */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04cf A[Catch: all -> 0x0483, TRY_ENTER, TryCatch #2 {all -> 0x0483, blocks: (B:168:0x046a, B:175:0x0490, B:182:0x04cf, B:184:0x04d3, B:186:0x04d9, B:191:0x056c, B:195:0x0578, B:200:0x05a1, B:204:0x05a9), top: B:265:0x046a }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0558 A[Catch: all -> 0x0646, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0646, blocks: (B:180:0x0498, B:189:0x0558, B:193:0x0570, B:198:0x057d, B:202:0x05a5, B:206:0x05ad), top: B:270:0x0498 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05d9 A[Catch: all -> 0x05cf, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x05cf, blocks: (B:214:0x05ca, B:220:0x05d9, B:225:0x05e7), top: B:282:0x05ca }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05e7 A[Catch: all -> 0x05cf, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x05cf, blocks: (B:214:0x05ca, B:220:0x05d9, B:225:0x05e7), top: B:282:0x05ca }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x048b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:231:0x0633 -> B:56:0x01b2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$doAnswer(com.digidust.elokence.akinator.activities.QuestionActivity r27, zu.d r28) {
        /*
            Method dump skipped, instructions count: 1724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.QuestionActivity.access$doAnswer(com.digidust.elokence.akinator.activities.QuestionActivity, zu.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083 A[Catch: all -> 0x004c, TryCatch #1 {all -> 0x004c, blocks: (B:31:0x007c, B:33:0x0083, B:35:0x00df, B:36:0x00e5, B:37:0x0128, B:18:0x0047, B:23:0x0053), top: B:54:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.digidust.elokence.akinator.activities.QuestionActivity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [int] */
    /* JADX WARN: Type inference failed for: r14v8, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4, types: [da.o] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.content.Context, com.digidust.elokence.akinator.activities.AkActivity, com.digidust.elokence.akinator.activities.QuestionActivity] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.digidust.elokence.akinator.activities.QuestionActivity] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0135 -> B:26:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x014f -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$doCancelAnswer(com.digidust.elokence.akinator.activities.QuestionActivity r14, zu.d r15) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.QuestionActivity.access$doCancelAnswer(com.digidust.elokence.akinator.activities.QuestionActivity, zu.d):java.lang.Object");
    }

    public static final Object access$getBitmapForAttitude(QuestionActivity questionActivity, String str, zu.d dVar) {
        questionActivity.getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new u5(str, null), dVar);
    }

    public static final /* synthetic */ ka.a access$getThinkingAkitude(QuestionActivity questionActivity, ka.c cVar, ka.c cVar2) {
        questionActivity.getClass();
        return C(cVar, cVar2);
    }

    /* JADX WARN: Path cross not found for [B:45:0x00c7, B:36:0x00b5], limit reached: 106 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0158 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:63:0x010f, B:66:0x0128, B:68:0x0158, B:70:0x015c, B:73:0x0163, B:75:0x0167, B:78:0x016f, B:79:0x018d), top: B:101:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0163 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:63:0x010f, B:66:0x0128, B:68:0x0158, B:70:0x015c, B:73:0x0163, B:75:0x0167, B:78:0x016f, B:79:0x018d), top: B:101:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x015a -> B:80:0x019b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x015c -> B:80:0x019b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x016f -> B:80:0x019b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x018d -> B:80:0x019b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01b6 -> B:62:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x01ef -> B:98:0x01f0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$goToProposalScreen(com.digidust.elokence.akinator.activities.QuestionActivity r16, zu.d r17) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.QuestionActivity.access$goToProposalScreen(com.digidust.elokence.akinator.activities.QuestionActivity, zu.d):java.lang.Object");
    }

    public static final void access$resetUI(QuestionActivity questionActivity) {
        questionActivity.getClass();
        Timber.Forest.tag("QuestionActivity").d("resetUI called", new Object[0]);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().homeButton.getRoot().setVisibility(0);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().layoutQCM.setVisibility(0);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().adBanner.getRoot().setVisibility(0);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().layoutBulleQuestionQCM.setVisibility(0);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().virguleQCM.setVisibility(0);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().probablyButtons.setVisibility(0);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().yesDontknowNoButtons.setVisibility(0);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().questionCounterText.setVisibility(0);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().bulleText.setVisibility(0);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().yesQuestionButton.setVisibility(0);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().noQuestionButton.setVisibility(0);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().dontknowQuestionButton.setVisibility(0);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().probablyQuestionButton.setVisibility(0);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().probablyNotQuestionButton.setVisibility(0);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().backButtonImage.setVisibility(0);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().layoutProposal.setVisibility(8);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().zoneProposal.setVisibility(8);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().proposalGroup.setVisibility(8);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().proposalButtons.setVisibility(8);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().virguleProposal.setVisibility(8);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().bulleProposalText1.setVisibility(8);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().bulleProposalText2.setVisibility(8);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().bulleProposalText3.setVisibility(8);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().copyrightLabel.setVisibility(8);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().yesProposalButton.setVisibility(8);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().noProposalButton.setVisibility(8);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().okButton.setVisibility(8);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().replayButton.setVisibility(8);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().avoidedTrapGroup.setVisibility(8);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().inTrapGroup.setVisibility(8);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().bulleContinueText.setVisibility(8);
        questionActivity.z(true);
        questionActivity.X = false;
    }

    public static final void access$showQCMAnimation(QuestionActivity questionActivity) {
        questionActivity.getClass();
        AnimatorSet animatorSet = new AnimatorSet();
        ImageView imageView = questionActivity.f21692o;
        Property property = View.ALPHA;
        animatorSet.play(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, 0.0f, 1.0f)).with(ObjectAnimator.ofFloat(questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().layoutQCM, (Property<RelativeLayout, Float>) property, 0.0f, 1.0f)).with(ObjectAnimator.ofFloat(questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().adBanner.getRoot(), (Property<RelativeLayout, Float>) property, 0.0f, 1.0f));
        animatorSet.setDuration(1000L);
        animatorSet.addListener(new l6(questionActivity));
        animatorSet.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$showTrappedAnimation(com.digidust.elokence.akinator.activities.QuestionActivity r9, ka.a r10, zu.d r11) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.QuestionActivity.access$showTrappedAnimation(com.digidust.elokence.akinator.activities.QuestionActivity, ka.a, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$showTriompheAndAwardAnimation(com.digidust.elokence.akinator.activities.QuestionActivity r4, ka.a r5, boolean r6, zu.d r7) {
        /*
            r4.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 10
            if (r6 == 0) goto L36
            lb.e$c r6 = r4.T
            if (r6 != 0) goto L17
            java.lang.String r6 = "akiStats"
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r6)
            r6 = r1
        L17:
            int r6 = r6.getAwardType()
            r3 = 1
            if (r3 > r6) goto L36
            r3 = 6
            if (r6 >= r3) goto L36
            ka.b r6 = new ka.b
            ka.a r3 = ka.a.f70691w
            r6.<init>(r3, r2)
            r0.add(r6)
            ka.b r6 = new ka.b
            ka.a r3 = ka.a.f70675g
            r6.<init>(r3, r2)
            r0.add(r6)
            goto L40
        L36:
            ka.b r6 = new ka.b
            ka.a r3 = ka.a.f70691w
            r6.<init>(r3, r2)
            r0.add(r6)
        L40:
            oa.l r4 = r4.F
            if (r4 != 0) goto L4a
            java.lang.String r4 = "akinatorPlayer"
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r4)
            goto L4b
        L4a:
            r1 = r4
        L4b:
            kotlinx.coroutines.Job r4 = r1.playSequence(r5, r0)
            java.lang.Object r4 = r4.join(r7)
            java.lang.Object r5 = av.e.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L5a
            return r4
        L5a:
            tu.x0 r4 = tu.x0.f87415a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.QuestionActivity.access$showTriompheAndAwardAnimation(com.digidust.elokence.akinator.activities.QuestionActivity, ka.a, boolean, zu.d):java.lang.Object");
    }

    public final void A() {
        Timber.Forest.tag("QuestionActivity").d("Exclude Proposition is called for NON trappable player", new Object[0]);
        disposeAtDestruction(b0.fromCallable(new x(11)).subscribeOn(j.io()).observeOn(ot.c.mainThread()).subscribe(new c5(this, 0)));
    }

    public final ka.a D(ka.c cVar) {
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            return ka.a.f70681m;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            ka.a aVar = (ka.a) this.M.lastOrNull();
            ka.a aVar2 = ka.a.f70673e;
            return aVar == aVar2 ? ka.a.f70674f : aVar2;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return ka.a.f70683o;
        }
        throw new t();
    }

    public final void E(boolean z10) {
        Timber.Forest.tag("QuestionActivity").d("goToGameOver called", new Object[0]);
        int awardType = ca.u.sharedInstance().getStats().getAwardType();
        if (m.sharedInstance().classementState() == 1) {
            m.sharedInstance().incNbGamesSinceRefuseClassement();
        }
        if (m.sharedInstance().classementState() == 2 && !m.sharedInstance().isUserConnected()) {
            m.sharedInstance().incNbGamesSinceRefuseInscription();
        }
        Intent intent = new Intent(this, (Class<?>) GameOverSliderActivity.class);
        intent.putExtra("ShowAdOnHome", true);
        o.sharedInstance().setGameOverActivityState(z10 ? 11 : 1);
        if (((awardType == 1 || awardType == 2) && o.sharedInstance().winFirstTry()) || awardType == 6 || awardType == 7) {
            intent.putExtra("slideToDisplay", "classement");
        } else if ((awardType == 3 || awardType == 4 || awardType == 5) && o.sharedInstance().winFirstTry()) {
            intent.putExtra("slideToDisplay", "lsa");
        }
        intent.putExtra("displayPoll", false);
        startActivity(intent);
        finish();
    }

    public final void F() {
        getBinding$akinatorGL_gplayFreemiumRelease().loadingBar.setVisibility(4);
        getBinding$akinatorGL_gplayFreemiumRelease().questionCounterText.setVisibility(0);
        getBinding$akinatorGL_gplayFreemiumRelease().bulleText.setVisibility(0);
        getBinding$akinatorGL_gplayFreemiumRelease().yesQuestionButton.setAlpha(1.0f);
        getBinding$akinatorGL_gplayFreemiumRelease().yesQuestionButton.setSelected(false);
        getBinding$akinatorGL_gplayFreemiumRelease().noQuestionButton.setAlpha(1.0f);
        getBinding$akinatorGL_gplayFreemiumRelease().noQuestionButton.setSelected(false);
        getBinding$akinatorGL_gplayFreemiumRelease().dontknowQuestionButton.setAlpha(1.0f);
        getBinding$akinatorGL_gplayFreemiumRelease().dontknowQuestionButton.setSelected(false);
        getBinding$akinatorGL_gplayFreemiumRelease().probablyQuestionButton.setAlpha(1.0f);
        getBinding$akinatorGL_gplayFreemiumRelease().probablyQuestionButton.setSelected(false);
        getBinding$akinatorGL_gplayFreemiumRelease().probablyNotQuestionButton.setAlpha(1.0f);
        getBinding$akinatorGL_gplayFreemiumRelease().probablyNotQuestionButton.setSelected(false);
        z(true);
    }

    public final void G() {
        Timber.Forest.tag("QuestionActivity").d("manageFinDePartie called", new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this), null, null, new d6(this, null), 3, null);
    }

    public final void H(int i10) {
        this.J = i10;
        w9.e.getInstance().stop();
        BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this), null, null, new i6(this, null), 3, null);
    }

    public final void I(u6 u6Var) {
        Timber.Forest forest = Timber.Forest;
        forest.tag("QuestionActivity").d(a.b.k("showPropositionLayout called with end game indicaiton : ", u6Var.name()), new Object[0]);
        this.R = ca.u.sharedInstance().getPersoPropose();
        Timber.Tree treeTag = forest.tag("QuestionActivity");
        e.g gVar = this.R;
        e.g gVar2 = null;
        if (gVar == null) {
            e0.throwUninitializedPropertyAccessException("proposedCharacter");
            gVar = null;
        }
        treeTag.d(a.b.k("showPropositionLayout : ", gVar.getName()), new Object[0]);
        getBinding$akinatorGL_gplayFreemiumRelease().layoutQCM.setVisibility(8);
        getBinding$akinatorGL_gplayFreemiumRelease().okButton.setVisibility(8);
        getBinding$akinatorGL_gplayFreemiumRelease().replayButton.setVisibility(8);
        getBinding$akinatorGL_gplayFreemiumRelease().avoidedTrapGroup.setVisibility(8);
        getBinding$akinatorGL_gplayFreemiumRelease().layoutProposal.setVisibility(0);
        getBinding$akinatorGL_gplayFreemiumRelease().zoneProposal.setVisibility(0);
        getBinding$akinatorGL_gplayFreemiumRelease().proposalGroup.setVisibility(0);
        getBinding$akinatorGL_gplayFreemiumRelease().proposalButtons.setVisibility(0);
        getBinding$akinatorGL_gplayFreemiumRelease().virguleProposal.setVisibility(0);
        getBinding$akinatorGL_gplayFreemiumRelease().bulleProposalText1.setVisibility(0);
        getBinding$akinatorGL_gplayFreemiumRelease().bulleProposalText2.setVisibility(0);
        getBinding$akinatorGL_gplayFreemiumRelease().bulleProposalText3.setVisibility(0);
        getBinding$akinatorGL_gplayFreemiumRelease().copyrightLabel.setVisibility(0);
        getBinding$akinatorGL_gplayFreemiumRelease().yesProposalButton.setVisibility(0);
        getBinding$akinatorGL_gplayFreemiumRelease().noProposalButton.setVisibility(0);
        TextView textView = getBinding$akinatorGL_gplayFreemiumRelease().bulleProposalText1;
        Typeface typeface = this.f21686i;
        textView.setTypeface(typeface);
        getBinding$akinatorGL_gplayFreemiumRelease().bulleProposalText2.setTypeface(typeface);
        getBinding$akinatorGL_gplayFreemiumRelease().bulleProposalText3.setTypeface(typeface);
        getBinding$akinatorGL_gplayFreemiumRelease().copyrightLabel.setTypeface(typeface);
        AkinatorSmallButton yesProposalButton = getBinding$akinatorGL_gplayFreemiumRelease().yesProposalButton;
        e0.checkNotNullExpressionValue(yesProposalButton, "yesProposalButton");
        markTextviewForUpdate(yesProposalButton);
        AkinatorSmallButton noProposalButton = getBinding$akinatorGL_gplayFreemiumRelease().noProposalButton;
        e0.checkNotNullExpressionValue(noProposalButton, "noProposalButton");
        markTextviewForUpdate(noProposalButton);
        AkinatorSmallButton replayButton = getBinding$akinatorGL_gplayFreemiumRelease().replayButton;
        e0.checkNotNullExpressionValue(replayButton, "replayButton");
        markTextviewForUpdate(replayButton);
        TextView bulleProposalText1 = getBinding$akinatorGL_gplayFreemiumRelease().bulleProposalText1;
        e0.checkNotNullExpressionValue(bulleProposalText1, "bulleProposalText1");
        markTextviewForUpdate(bulleProposalText1);
        TextView bulleProposalText2 = getBinding$akinatorGL_gplayFreemiumRelease().bulleProposalText2;
        e0.checkNotNullExpressionValue(bulleProposalText2, "bulleProposalText2");
        markTextviewForUpdate(bulleProposalText2);
        TextView bulleProposalText3 = getBinding$akinatorGL_gplayFreemiumRelease().bulleProposalText3;
        e0.checkNotNullExpressionValue(bulleProposalText3, "bulleProposalText3");
        markTextviewForUpdate(bulleProposalText3);
        TextView copyrightLabel = getBinding$akinatorGL_gplayFreemiumRelease().copyrightLabel;
        e0.checkNotNullExpressionValue(copyrightLabel, "copyrightLabel");
        markTextviewForUpdate(copyrightLabel);
        updateTextViewsSize();
        AkinatorSmallButton akinatorSmallButton = getBinding$akinatorGL_gplayFreemiumRelease().yesProposalButton;
        b1.a aVar = b1.f72741d;
        akinatorSmallButton.setText(aVar.sharedInstance().getTraductionFromToken("OUI"));
        getBinding$akinatorGL_gplayFreemiumRelease().noProposalButton.setText(aVar.sharedInstance().getTraductionFromToken("NON"));
        getBinding$akinatorGL_gplayFreemiumRelease().replayButton.setText(aVar.sharedInstance().getTraductionFromToken("REJOUER"));
        getBinding$akinatorGL_gplayFreemiumRelease().bulleProposalText1.setText(aVar.sharedInstance().getTraductionFromToken("JE_PENSE_A"));
        TextView textView2 = getBinding$akinatorGL_gplayFreemiumRelease().bulleProposalText2;
        e.g gVar3 = this.R;
        if (gVar3 == null) {
            e0.throwUninitializedPropertyAccessException("proposedCharacter");
            gVar3 = null;
        }
        textView2.setText(gVar3.getName());
        TextView textView3 = getBinding$akinatorGL_gplayFreemiumRelease().bulleProposalText3;
        e.g gVar4 = this.R;
        if (gVar4 == null) {
            e0.throwUninitializedPropertyAccessException("proposedCharacter");
            gVar4 = null;
        }
        textView3.setText(gVar4.getDescription());
        e.g gVar5 = this.R;
        if (gVar5 == null) {
            e0.throwUninitializedPropertyAccessException("proposedCharacter");
            gVar5 = null;
        }
        if (!gVar5.isValidateConstraint()) {
            if (m.sharedInstance().isTTSEnabled()) {
                w9.e.getInstance().speak(aVar.sharedInstance().getTraductionFromToken("FILTRE_ENFANT"));
            }
            h.a aVar2 = h.f69257d;
            aVar2.sharedInstance().createOrUpdateMetricValeur("last_game", "C");
            getBinding$akinatorGL_gplayFreemiumRelease().proposalImage.setImageResource(R.drawable.child_mode);
            getBinding$akinatorGL_gplayFreemiumRelease().yesProposalButton.setVisibility(8);
            getBinding$akinatorGL_gplayFreemiumRelease().noProposalButton.setVisibility(8);
            getBinding$akinatorGL_gplayFreemiumRelease().copyrightLabel.setVisibility(4);
            getBinding$akinatorGL_gplayFreemiumRelease().replayButton.setVisibility(0);
            getBinding$akinatorGL_gplayFreemiumRelease().bulleProposalText1.setVisibility(4);
            getBinding$akinatorGL_gplayFreemiumRelease().zoneBulle.setVisibility(0);
            getBinding$akinatorGL_gplayFreemiumRelease().proposalButtons.setVisibility(0);
            getBinding$akinatorGL_gplayFreemiumRelease().bulleProposalText2.setMaxLines(2);
            getBinding$akinatorGL_gplayFreemiumRelease().bulleProposalText2.setText(aVar.sharedInstance().getTraductionFromToken("FILTRE_ENFANT"));
            getBinding$akinatorGL_gplayFreemiumRelease().bulleProposalText3.setText("");
            getBinding$akinatorGL_gplayFreemiumRelease().replayButton.setOnClickListener(this.f21712i0);
            aVar2.sharedInstance().incMetricCompteur("child_filter_used");
            return;
        }
        Bitmap akiBitmap = ca.t.sharedInstance().getAkiBitmap("akinator_confiant");
        e0.checkNotNullExpressionValue(akiBitmap, "getAkiBitmap(...)");
        q(R.id.akinatorImage, akiBitmap);
        Bitmap hatBitmap = ca.t.sharedInstance().getHatBitmap(m.sharedInstance().getHat(), "akinator_confiant");
        e0.checkNotNullExpressionValue(hatBitmap, "getHatBitmap(...)");
        q(R.id.akinatorChapeau, hatBitmap);
        Bitmap clothBitmap = ca.t.sharedInstance().getClothBitmap(m.sharedInstance().getCloth(), "akinator_confiant");
        e0.checkNotNullExpressionValue(clothBitmap, "getClothBitmap(...)");
        q(R.id.akinatorTenue, clothBitmap);
        c cVar = this.Y;
        if (cVar == null || cVar.isDisposed()) {
            getBinding$akinatorGL_gplayFreemiumRelease().proposalImage.animate().cancel();
            getBinding$akinatorGL_gplayFreemiumRelease().proposalImage.clearAnimation();
            getBinding$akinatorGL_gplayFreemiumRelease().proposalImage.setVisibility(4);
            getBinding$akinatorGL_gplayFreemiumRelease().proposalImage.setImageDrawable(null);
            getBinding$akinatorGL_gplayFreemiumRelease().proposalImage.setAlpha(1.0f);
            getBinding$akinatorGL_gplayFreemiumRelease().proposalImage.setBackgroundColor(-16777216);
            getBinding$akinatorGL_gplayFreemiumRelease().loadingBarAward.setVisibility(0);
            n0 n0VarCreate = n0.create(new e5(this, 0));
            e0.checkNotNullExpressionValue(n0VarCreate, "create(...)");
            c cVarSubscribe = n0VarCreate.observeOn(ot.c.mainThread()).subscribeOn(j.newThread()).subscribe(new c5(this, 3), new c5(this, 4));
            this.Y = cVarSubscribe;
            disposeAtDestruction(cVarSubscribe);
        }
        getBinding$akinatorGL_gplayFreemiumRelease().yesProposalButton.setOnClickListener(this.f21710g0);
        getBinding$akinatorGL_gplayFreemiumRelease().noProposalButton.setOnClickListener(this.f21711h0);
        getBinding$akinatorGL_gplayFreemiumRelease().copyrightLabel.setOnClickListener(this.f21713j0);
        if (m.sharedInstance().isTTSEnabled()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aVar.sharedInstance().getTraductionFromToken("JE_PENSE_A"));
            sb2.append(" ");
            e.g gVar6 = this.R;
            if (gVar6 == null) {
                e0.throwUninitializedPropertyAccessException("proposedCharacter");
                gVar6 = null;
            }
            sb2.append(gVar6.getName());
            e.g gVar7 = this.R;
            if (gVar7 == null) {
                e0.throwUninitializedPropertyAccessException("proposedCharacter");
                gVar7 = null;
            }
            if (gVar7.getDescription() != null) {
                e.g gVar8 = this.R;
                if (gVar8 == null) {
                    e0.throwUninitializedPropertyAccessException("proposedCharacter");
                    gVar8 = null;
                }
                String description = gVar8.getDescription();
                int length = description.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = e0.compare((int) description.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                if (description.subSequence(i10, length + 1).toString().length() != 0) {
                    sb2.append(". ");
                    e.g gVar9 = this.R;
                    if (gVar9 == null) {
                        e0.throwUninitializedPropertyAccessException("proposedCharacter");
                    } else {
                        gVar2 = gVar9;
                    }
                    sb2.append(gVar2.getDescription());
                }
            }
            String string = sb2.toString();
            e0.checkNotNullExpressionValue(string, "toString(...)");
            new Handler(Looper.getMainLooper()).postDelayed(new i(string, 2), 1000L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r14, r7, r0) != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013e, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r14, r2, r0) == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8 A[Catch: NumberFormatException -> 0x012b, TryCatch #3 {NumberFormatException -> 0x012b, blocks: (B:17:0x003d, B:37:0x00d3, B:41:0x00e9, B:46:0x011e, B:42:0x00f8, B:44:0x00fc, B:45:0x0108), top: B:61:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(zu.d r14) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.QuestionActivity.J(zu.d):java.lang.Object");
    }

    public final Object K(zu.d dVar) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new r6(this, null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    public final void L() {
        AnimatorSet animatorSet = new AnimatorSet();
        ImageView imageView = this.f21692o;
        Property property = View.ALPHA;
        animatorSet.play(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, 1.0f, 0.0f)).with(ObjectAnimator.ofFloat(getBinding$akinatorGL_gplayFreemiumRelease().layoutQCM, (Property<RelativeLayout, Float>) property, 1.0f, 0.0f)).with(ObjectAnimator.ofFloat(getBinding$akinatorGL_gplayFreemiumRelease().adBanner.getRoot(), (Property<RelativeLayout, Float>) property, 1.0f, 0.0f));
        animatorSet.setDuration(1000L);
        animatorSet.addListener(new t6(this));
        animatorSet.start();
        na.b.playPropose();
    }

    public final void displayCharacterProposal$akinatorGL_gplayFreemiumRelease(u6 endGame) {
        e0.checkNotNullParameter(endGame, "endGame");
        Timber.Forest.tag("QuestionActivity").d(a.b.k("displayCharacterProposal called with end game indicaiton : ", endGame.name()), new Object[0]);
        if (m.sharedInstance().isUserConnected()) {
            if (o.sharedInstance().canIncTotalGameIncForThisGame()) {
                h.a aVar = h.f69257d;
                aVar.sharedInstance().incMetricCompteur("total_games_account");
                aVar.sharedInstance().incMetricCompteur("total_games");
                o.sharedInstance().unlockTotalGameForThisGame(false);
            }
        } else if (o.sharedInstance().canIncTotalGameIncForThisGame()) {
            h.f69257d.sharedInstance().incMetricCompteur("total_games");
            o.sharedInstance().unlockTotalGameForThisGame(false);
        }
        try {
            ImageView imageView = getBinding$akinatorGL_gplayFreemiumRelease().imageFond;
            ca.t tVarSharedInstance = ca.t.sharedInstance();
            lb.c currentInstance = m.sharedInstance().getCurrentInstance();
            e0.checkNotNull(currentInstance);
            Bitmap subjectBackground = tVarSharedInstance.getSubjectBackground(currentInstance.getSubjectId());
            e0.checkNotNullExpressionValue(subjectBackground, "getSubjectBackground(...)");
            Resources resources = getResources();
            e0.checkNotNullExpressionValue(resources, "getResources(...)");
            imageView.setImageDrawable(new BitmapDrawable(resources, subjectBackground));
        } catch (Exception unused) {
        } catch (OutOfMemoryError unused2) {
            Toast.makeText(this, b1.f72741d.sharedInstance().getTraductionFromToken("MANQUE_DE_MEMOIRE"), 1).show();
        }
        int iOrdinal = endGame.ordinal();
        if (iOrdinal == 0) {
            I(endGame);
            return;
        }
        if (iOrdinal == 1) {
            this.f21716m0.launch(new Intent(this, (Class<?>) CongratRareCharacterActivity.class));
        } else {
            if (iOrdinal != 2) {
                throw new t();
            }
            I(endGame);
        }
    }

    public final ActivityQuestionBinding getBinding$akinatorGL_gplayFreemiumRelease() {
        ActivityQuestionBinding activityQuestionBinding = this.C;
        if (activityQuestionBinding != null) {
            return activityQuestionBinding;
        }
        e0.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        e0.checkNotNullParameter(date1, "date1");
        e0.checkNotNullParameter(date2, "date2");
        e0.checkNotNullParameter(timeUnit, "timeUnit");
        return timeUnit.convert(date2.getTime() - date1.getTime(), TimeUnit.MILLISECONDS);
    }

    public final void goToCharacterFound() {
        e.g gVar = this.R;
        if (gVar == null) {
            e0.throwUninitializedPropertyAccessException("proposedCharacter");
            gVar = null;
        }
        String idBase = gVar.getIdBase();
        if (!f.sharedInstance().isDefiPersoExist(idBase)) {
            lb.c currentInstance = m.sharedInstance().getCurrentInstance();
            e0.checkNotNull(currentInstance);
            if (currentInstance.isDisableAkiAwards()) {
                E(this.V);
                return;
            } else {
                startActivity(new Intent(this, (Class<?>) PostProposeActivity.class));
                finish();
                return;
            }
        }
        if (m.sharedInstance().isUserConnected()) {
            disposeAtDestruction(b0.fromCallable(new ci.f((AccountDatabase) s0.databaseBuilder(AkApplication.f21719f.getAppContext(), AccountDatabase.class, "accountdb").fallbackToDestructiveMigration(false).build(), 4, idBase, this)).subscribeOn(j.io()).observeOn(ot.c.mainThread()).subscribe(new h0(2, this, idBase)));
            return;
        }
        if (f.sharedInstance().isPersoAlreadyFound(idBase)) {
            startActivity(new Intent(this, (Class<?>) PostProposeActivity.class));
            finish();
            return;
        }
        getBinding$akinatorGL_gplayFreemiumRelease().layoutOneCharacterFound.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new v5(this, idBase));
        getBinding$akinatorGL_gplayFreemiumRelease().layoutOneCharacterFound.startAnimation(alphaAnimation);
    }

    public final boolean lastGameBeforeXMinutesAgo() throws ParseException {
        Calendar calendar = Calendar.getInstance();
        Locale locale = Locale.FRANCE;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        String dateLastGame = o.sharedInstance().getDateLastGame();
        e0.checkNotNullExpressionValue(dateLastGame, "getDateLastGame(...)");
        if (dateLastGame.length() == 0) {
            return false;
        }
        try {
            Date date = simpleDateFormat.parse(o.sharedInstance().getDateLastGame());
            e0.checkNotNull(date);
            Date time = calendar.getTime();
            e0.checkNotNullExpressionValue(time, "getTime(...)");
            long dateDiff = getDateDiff(date, time, TimeUnit.MINUTES);
            if (dateDiff > m.sharedInstance().getDureeMaxSinceLastSession()) {
                o.sharedInstance().setDateLastGame(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).format(Calendar.getInstance().getTime()));
                o.sharedInstance().setNbGamesInOneSessionWithoutClosingApp(0);
            }
            return dateDiff < ((long) m.sharedInstance().getDureeMaxSinceLastSession());
        } catch (ParseException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 2 && i11 == 0) {
            goToHome(true);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:5|(1:7)|8|(1:10)|11|(1:13)(1:14)|53|15|16|(2:57|17)|(1:22)|23|51|24|(1:26)|55|27|30|(1:32)|33|(1:37)|38|(2:40|(2:42|(1:44)))|45|46) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x032f, code lost:
    
        getBinding$akinatorGL_gplayFreemiumRelease().questionCounterText.setText(lb.b1.f72741d.sharedInstance().getTraductionFromToken("QUESTION_N") + " ?");
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0233 A[Catch: NullPointerException -> 0x0441, TRY_LEAVE, TryCatch #0 {NullPointerException -> 0x0441, blocks: (B:24:0x021b, B:26:0x0233), top: B:51:0x021b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03dd  */
    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.QuestionActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        k kVar = this.H;
        e0.checkNotNull(kVar);
        kVar.processOnDestroy();
        w9.e.getInstance().stop();
        super.onDestroy();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (!this.f21681c) {
            k kVar = this.H;
            e0.checkNotNull(kVar);
            kVar.processOnPause();
        }
        super.onPause();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f21681c) {
            return;
        }
        this.G = false;
        k kVar = this.H;
        e0.checkNotNull(kVar);
        kVar.processOnResume();
    }

    public final boolean shouldDisplayAudioPubAllXGame() {
        try {
            return ((o.sharedInstance().getNbGamesInOneSessionWithoutClosingApp() + m.sharedInstance().getNbPartieSessionAvantLancementPubAudio()) - m.sharedInstance().getNbPartieAvantPremierLancementPubAudio()) % m.sharedInstance().getNbPartieSessionAvantLancementPubAudio() == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public final ka.c t(float f10) {
        e.i currentSessionProgression;
        e currentSession = o.sharedInstance().getCurrentSession();
        if (currentSession == null || (currentSessionProgression = currentSession.getCurrentSessionProgression()) == null) {
            return this.K;
        }
        int step = currentSessionProgression.getStep();
        Timber.Forest.tag("QuestionActivity").d(a.b.e(step, "determineConfidenceState called with nq = "), new Object[0]);
        currentSessionProgression.getProgression();
        boolean z10 = step <= 30;
        return (!z10 ? f10 >= 92.0f : f10 >= (((float) step) * 1.4f) + 50.0f) ? (!z10 ? f10 >= 85.0f : f10 >= (((float) step) * 2.3f) + 15.0f) ? (!z10 ? f10 >= 75.0f : f10 >= (((float) step) * 3.0f) + (-15.0f)) ? (!z10 ? f10 >= 50.0f : f10 >= (((float) step) * 2.5f) + (-25.0f)) ? ka.c.f70705g : ka.c.f70704f : ka.c.f70703e : ka.c.f70702c : ka.c.f70701b;
    }

    public final void u() {
        getBinding$akinatorGL_gplayFreemiumRelease().loadingBar.setVisibility(0);
        getBinding$akinatorGL_gplayFreemiumRelease().questionCounterText.setVisibility(4);
        getBinding$akinatorGL_gplayFreemiumRelease().bulleText.setVisibility(4);
        z(false);
    }

    public final void v() {
        Timber.Forest.tag("QuestionActivity").d("doNotContinue called", new Object[0]);
        ArrayList arrayList = new ArrayList();
        o.sharedInstance().setAkinatorStatus(1);
        disposeAtDestruction(b0.fromCallable(new g0(2, arrayList)).subscribeOn(j.io()).observeOn(ot.c.mainThread()).subscribe(new p3(this, ca.u.sharedInstance().getPersoPropose(), arrayList, 2)));
    }

    public final void w() {
        Timber.Forest forest = Timber.Forest;
        forest.tag("QuestionActivity").d("doRefuseProposition called", new Object[0]);
        if (!o.sharedInstance().winFirstTry() || !m.sharedInstance().isPlayerTrappable()) {
            BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this), null, null, new r5(this, null), 3, null);
        } else {
            forest.tag("QuestionActivity").d("Do refuse Proposition is called for a trappable player", new Object[0]);
            disposeAtDestruction(b0.fromCallable(new d5(this, 0)).subscribeOn(j.io()).observeOn(ot.c.mainThread()).subscribe(new c5(this, 1)));
        }
    }

    public final void x() {
        disposeAtDestruction(b0.fromCallable(new x(12)).subscribeOn(j.io()).observeOn(ot.c.mainThread()).subscribe(new c5(this, 2)));
        this.W = true;
    }

    public final void y(boolean z10) {
        Timber.Forest.tag("QuestionActivity").d(o2.n("doValidateObject called with isAwardAlreadyWon == ", z10), new Object[0]);
        disposeAtDestruction(b0.fromCallable(new x3(this, z10)).subscribeOn(j.io()).observeOn(ot.c.mainThread()).subscribe(new y3(this, z10, 1)));
    }

    public final void z(boolean z10) {
        getBinding$akinatorGL_gplayFreemiumRelease().yesQuestionButton.setEnabled(z10);
        getBinding$akinatorGL_gplayFreemiumRelease().noQuestionButton.setEnabled(z10);
        getBinding$akinatorGL_gplayFreemiumRelease().probablyQuestionButton.setEnabled(z10);
        getBinding$akinatorGL_gplayFreemiumRelease().probablyNotQuestionButton.setEnabled(z10);
        getBinding$akinatorGL_gplayFreemiumRelease().dontknowQuestionButton.setEnabled(z10);
        ImageView imageView = this.f21692o;
        e0.checkNotNull(imageView);
        imageView.setEnabled(z10);
        getBinding$akinatorGL_gplayFreemiumRelease().backButtonImage.setEnabled(z10);
        getBinding$akinatorGL_gplayFreemiumRelease().yesProposalButton.setEnabled(z10);
        getBinding$akinatorGL_gplayFreemiumRelease().noProposalButton.setEnabled(z10);
    }
}
